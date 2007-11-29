

/*$Id: ConsoleMessage.java,v 1.3 2007-11-29 16:28:25 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.eclipse.console.messages;

import org.eclipse.swt.graphics.Color;

public class ConsoleMessage {

	
	/**
	 * The color of the displayed message.
	 * @see org.eclipse.swt.graphics.Color
	 */
	protected Color color;
	
	/**
	 * The message to be displayed.
	 */
	protected String message;
	

	public ConsoleMessage( String message, Color color) {
		super();
		this.color = color;
		this.message = message;
	}
	
	/**
	 * 
	 * @return
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	
}
