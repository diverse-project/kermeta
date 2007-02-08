package fr.irisa.triskell.eclipse.console.messages;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class WarningMessage extends ConsoleMessage {

	public WarningMessage(String content) {
		color = new Color(Display.getCurrent(), 255,170,0);
		message = content;
	}
	
}
