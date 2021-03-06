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
package de.thorstenberger.examServer.webapp.form;


/**
 * @author Thorsten Berger
 *
 */
public class LoginConfigForm extends BaseForm {

	private boolean studentsLoginEnabled;
  private boolean askForStudentDetails;
	/**
	 * @return Returns the studentsLoginEnabled.
	 */
	public boolean isStudentsLoginEnabled() {
		return studentsLoginEnabled;
	}

	/**
	 * @param studentsLoginEnabled The studentsLoginEnabled to set.
	 */
	public void setStudentsLoginEnabled(final boolean studentsLoginEnabled) {
		this.studentsLoginEnabled = studentsLoginEnabled;
	}

  /**
   * @param askForStudentDetails
   *          the askForStudentDetails to set
   */
  public void setAskForStudentDetails(final boolean askForStudentDetails) {
    this.askForStudentDetails = askForStudentDetails;
  }

  /**
   * @return the askForStudentDetails
   */
  public boolean isAskForStudentDetails() {
    return askForStudentDetails;
  }


}
