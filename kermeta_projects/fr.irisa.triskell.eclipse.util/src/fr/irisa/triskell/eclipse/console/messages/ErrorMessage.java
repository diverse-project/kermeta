package fr.irisa.triskell.eclipse.console.messages;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class ErrorMessage extends ConsoleMessage {

	public ErrorMessage(String content) {
		color = new Color(Display.getCurrent(), 255, 0, 0);
		message = content;
	}
	
}
