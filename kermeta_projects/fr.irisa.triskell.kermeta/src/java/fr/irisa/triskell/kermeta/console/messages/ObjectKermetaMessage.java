package fr.irisa.triskell.kermeta.console.messages;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class ObjectKermetaMessage extends KermetaMessage {

	public ObjectKermetaMessage(Object o) {
		color = new Color(Display.getCurrent(), 0,0 ,0 );
		this.message = o.toString();
	}

}
