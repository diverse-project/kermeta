/* $Id: $
* Project    : org.kermeta.utils.console.eclipse
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 18 janv. 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.utils.console.eclipse.console;

import org.eclipse.swt.graphics.Color;

/**
 *  This is an interface for the Eclipse console that can be used for Kermeta or any other tools.
 * @author mgouyett
 *
 */
public interface IConsoleUtility {
	
	
	// Change color
	
	/**
	 * Change the console writing color
	 * @param c : the new color ( Color from org.eclipse.swt.graphics.Color api  )
	 */
	public void changeColor (Color c);
	
	/**
	 * Change the console writing color for error message
	 * @param c : the new color for error message( Color from org.eclipse.swt.graphics.Color api  )
	 */
	public void changeErrorColor (Color c);
	
	/**
	 * Change the console writing color for warning message
	 * @param c : the new color for error message( Color from org.eclipse.swt.graphics.Color api  )
	 */
	public void changeWarningColor (Color c);
	
	/**
	 * Change the console writing color for info message
	 * @param c : the new color for info message( Color from org.eclipse.swt.graphics.Color api  )
	 */
	public void changeInfoColor (Color c);
	
	/**
	 * Change the console writing color for OK message
	 * @param c : the new color for OK message( Color from org.eclipse.swt.graphics.Color api  )
	 */
	public void changeOKColor (Color c);
	
	
	// Write
	
	/**
	 * Display a standard message to the console
	 * @param message : the standard message to display
	 */
	public void write(String message);
	
	/**
	 * Display an error message to the console and go to the line
	 * @param message : the standard message to display
	 */
	public void writeln(String message);
	
	/**
	 * Display an error message to the console
	 * @param error : the error message to display
	 */
	public void error(String error);
	
	/**
	 * Display an error message to the console and go to the line
	 * @param error : the error message to display
	 */
	public void errorln(String error);
	
	/**
	 * Display a warning message to the console and go to the line
	 * @param warning : the error message to display
	 */
	public void warning(String warning);
	
	
	/**
	 * Display an warning message to the console and go to the line
	 * @param warning : the error message to display
	 */
	public void warningln(String warning);
	
	/** 
	 * Display an info message to the console
	 * @param info : the error message to display
	 */
	public void info(String info);
	
	/** 
	 * Display an info message to the console and go to the line
	 * @param info : the error message to display
	 */
	public void infoln(String info);
	
	/** 
	 * Display an info message to the console
	 * @param ok : the error message to display
	 */
	public void write_ok(String ok);
	
	/** 
	 * Display an info message to the console and go to the line
	 * @param ln : the error message to display
	 */
	public void write_ok_ln(String ln);
	
	/**
	 * Retrieve input typed by the user in the keyboard.
	 * @return the input typed by the user as a String.
	 */
	public String read();
	
	/**
	 * Display a text on the console and then retrieve input typed by the user in the keyboard.
	 * @return the input typed by the user on the keyboard as a String
	 */
	public String promptAndRead(String prompt);
	
	

}
