/* $Id: ConsoleUtility.java 14104 2011-01-25 09:54:29Z marieg $
* Project    : org.kermeta.utils.console.eclipse
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 18 janv. 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.language.api.port;




/**
 * This port permits use of a console for reading and writing messages
 * @author mgouyett
 *
 */
public interface PortConsole {

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
