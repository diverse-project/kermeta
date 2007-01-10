package fr.irisa.triskell.kermeta.console.messages;

import org.eclipse.swt.graphics.Color;

public abstract class KermetaMessage {

	/**
	 * The color of the displayed message.
	 * @see org.eclipse.swt.graphics.Color
	 */
	protected Color color;
	
	/**
	 * The message to be displayed.
	 */
	protected String message;
	
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
