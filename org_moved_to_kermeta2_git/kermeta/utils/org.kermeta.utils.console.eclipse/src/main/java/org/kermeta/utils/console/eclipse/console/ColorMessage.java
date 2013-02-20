/* $Id: $
* Project    : org.kermeta.utils.console.eclipse
* License    : EPL
* Copyright  : IRISA / INRIA / Universite de Rennes 1
* -------------------------------------------------------------------
* Creation date : 25 janv. 2011
* Authors :
*           Marie Gouyette <marie.gouyette@inria.fr>
*/
package org.kermeta.utils.console.eclipse.console;

import org.eclipse.swt.graphics.Color;

/**
 * @author mgouyett
 * This class contains Color constants
 */
public class ColorMessage {
	
	/**
	 * Color for information messages
	 */
	public static final Color INFO = new Color(null, 0,0,255);
	
	/**
	 * Color for OK messages
	 */
	public static final Color OK = new Color(null, 0,128,0);
	
	/**
	 * Color for error messages
	 */
	public static final Color ERROR = new Color(null, 192,0,0);
	
	/**
	 * Color for warning messages
	 */
	public static final Color WARNING = new Color(null, 215,150,0);
	
	public static final Color STANDARD = new Color(null,0,0,0);
	
	/**
	 * Use singleton pattern to use this class
	 */
	public static ColorMessage instance = new ColorMessage();
	
	public static ColorMessage getInstance() {
		return instance;
	}

}
