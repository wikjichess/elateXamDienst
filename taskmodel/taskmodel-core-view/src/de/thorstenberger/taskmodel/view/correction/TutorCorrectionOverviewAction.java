/*

Copyright (C) 2006 Thorsten Berger

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
/**
 * 
 */
package de.thorstenberger.taskmodel.view.correction;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import de.thorstenberger.taskmodel.CorrectorDelegateObject;
import de.thorstenberger.taskmodel.TaskModelViewDelegate;
import de.thorstenberger.taskmodel.TaskStatistics;
import de.thorstenberger.taskmodel.Tasklet;

/**
 * @author Thorsten Berger
 *
 */
public class TutorCorrectionOverviewAction extends Action {

	/* (non-Javadoc)
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		   ActionMessages errors = new ActionMessages();

			long id;
			try {
				id = Long.parseLong( request.getParameter( "taskId" ) );
			} catch (NumberFormatException e) {
				errors.add( ActionMessages.GLOBAL_MESSAGE, new ActionMessage( "invalid.parameter" ) );
				saveErrors( request, errors );
				return mapping.findForward( "error" );
			}
			
			CorrectorDelegateObject delegateObject = (CorrectorDelegateObject)TaskModelViewDelegate.getDelegateObject( request.getSession().getId(), id );

			if( delegateObject == null ){
				errors.add( ActionMessages.GLOBAL_MESSAGE, new ActionMessage( "no.session" ) );
				saveErrors( request, errors );
				return mapping.findForward( "error" );
			}
			request.setAttribute( "ReturnURL", delegateObject.getReturnURL() );

			TaskStatistics taskStatistics = delegateObject.getTaskManager().getTaskletContainer().calculateStatistics( id );
			TutorSolutionsInfoVO tsivo = new TutorSolutionsInfoVO();
			
			tsivo.setTaskId( id );
			tsivo.setCount( taskStatistics.getNumOfSolutions() );
			tsivo.setCorrectedCount( taskStatistics.getNumOfCorrectedSolutions() );
			if( taskStatistics.getNumOfSolutions() == 0 )
				tsivo.setCorrectedCountPercent( NumberFormat.getPercentInstance().format( 0 ) );
			else tsivo.setCorrectedCountPercent( NumberFormat.getPercentInstance().format(
					(double) taskStatistics.getNumOfCorrectedSolutions() / 
					(double) taskStatistics.getNumOfSolutions() ) );
			
			List<Tasklet> assignedUncorrectedTasklets = delegateObject.getTaskManager().getTaskletContainer().getTaskletsAssignedToCorrector( id, delegateObject.getCorrectorLogin(), false );
			List<Tasklet> assignedCorrectedTasklets = delegateObject.getTaskManager().getTaskletContainer().getTaskletsAssignedToCorrector( id, delegateObject.getCorrectorLogin(), true );
			
			tsivo.setAssignedUncorrectedTasklets( getTIVOs( assignedUncorrectedTasklets ) );
			tsivo.setAssignedCorrectedTasklets( getTIVOs( assignedCorrectedTasklets ) );
			
			request.setAttribute( "Solutions", tsivo );
			
			return mapping.findForward( "success" );
		
	}

	private List<TaskletInfoVO> getTIVOs( List<Tasklet> tasklets ){
		
		List<TaskletInfoVO> ret = new ArrayList<TaskletInfoVO>();
		
		for( Tasklet tasklet : tasklets ){
			TaskletInfoVO tivo = new TaskletInfoVO();
			tivo.setTaskId( tasklet.getTaskId() );
			tivo.setLogin( tasklet.getUserId() );
			tivo.setPoints( tasklet.getTaskletCorrection().getPoints() != null ? "" + tasklet.getTaskletCorrection().getPoints() : "-" );
			tivo.setStatus( tasklet.getStatus() );
			tivo.setCorrectorLogin( tasklet.getTaskletCorrection().getCorrector() );
			tivo.setCorrectorHistory( tasklet.getTaskletCorrection().getCorrectorHistory() );
//			List<String> history = new ArrayList<String>();
//			history.add("ich"); history.add("du");
//			tivo.setCorrectorHistory( history );
			ret.add( tivo );
		}

		return ret;
		
	}
	
	
}