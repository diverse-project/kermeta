

/*$Id: ConsoleMessage.java,v 1.4 2007-11-30 08:05:33 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.eclipse.console.messages;

//import org.eclipse.swt.graphics.Color;

public class ConsoleMessage {

	// some default colors that can be used
/*	public static final Color INFO = new Color(null, 0,0,255);
	public static final Color OK = new Color(null, 0,128,0);
	public static final Color ERROR = new Color(null, 192,0,0);
	public static final Color WARNING = new Color(null, 215,150,0);
	public static final Color KERMETA = new Color(null, 255,114,0);*/
	
	/**
	 * The color of the displayed message.
	 * @see org.eclipse.swt.graphics.Color
	 */
	//protected Color color;
	
	/**
	 * The message to be displayed.
	 */
	protected String message;
	

	public ConsoleMessage( String message/*, Color color*/) {
		super();
		//this.color = color;
		this.message = message;
	}
	
	/**
	 * 
	 * @return
	 */
	public void /*Color*/ getColor() {
		//return color;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	
}
