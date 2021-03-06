/*

Copyright (C) 2007 Thorsten Berger

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
package de.thorstenberger.examServer.model;

/**
 * @author Thorsten Berger
 *
 */
public class CorrectorTaskletAnnotationVO {

	private String corrector;
	private String text;
	/**
	 * @param corrector
	 * @param text
	 */
	public CorrectorTaskletAnnotationVO(String corrector, String text) {
		super();
		this.corrector = corrector;
		this.text = text;
	}
	/**
	 * @return the corrector
	 */
	public String getCorrector() {
		return corrector;
	}
	/**
	 * @param corrector the corrector to set
	 */
	public void setCorrector(String corrector) {
		this.corrector = corrector;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
}
