package fr.irisa.triskell.kermeta.console.messages;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class ErrorMessage extends KermetaMessage {

	public ErrorMessage(String content) {
		color = new Color(Display.getCurrent(), 255, 0, 0);
		message = content;
	}
	
}
