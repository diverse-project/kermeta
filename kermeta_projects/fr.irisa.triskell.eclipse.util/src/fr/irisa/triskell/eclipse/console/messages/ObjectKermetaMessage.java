package fr.irisa.triskell.eclipse.console.messages;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class ObjectKermetaMessage extends ConsoleMessage {

	public ObjectKermetaMessage(Object o) {
		color = new Color(Display.getCurrent(), 0,0 ,0 );
		this.message = o.toString();
	}

}
