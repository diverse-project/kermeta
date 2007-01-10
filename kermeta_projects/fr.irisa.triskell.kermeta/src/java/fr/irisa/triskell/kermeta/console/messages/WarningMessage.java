package fr.irisa.triskell.kermeta.console.messages;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class WarningMessage extends KermetaMessage {

	public WarningMessage(String content) {
		color = new Color(Display.getCurrent(), 255,170,0);
		message = content;
	}
	
}
