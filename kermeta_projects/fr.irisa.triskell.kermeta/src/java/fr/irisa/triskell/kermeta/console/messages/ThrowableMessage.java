package fr.irisa.triskell.kermeta.console.messages;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import fr.irisa.triskell.kermeta.console.messages.KermetaMessage;

public class ThrowableMessage extends KermetaMessage {

	public ThrowableMessage(Throwable t) {
		color = new Color(Display.getCurrent(), 255,0 ,0 );
		
		ByteArrayOutputStream oStream = new java.io.ByteArrayOutputStream();		
		PrintWriter pw = new PrintWriter(oStream);			
		t.printStackTrace(pw);
		pw.flush();
		this.message = oStream.toString();

	}

}
