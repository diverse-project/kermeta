

/*$Id: ThrowableMessage.java,v 1.2 2007-02-20 14:19:55 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.eclipse.console.messages;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import fr.irisa.triskell.eclipse.console.messages.ConsoleMessage;

public class ThrowableMessage extends ConsoleMessage {

	public ThrowableMessage(Throwable t) {
		color = new Color(Display.getCurrent(), 255,0 ,0 );
		
		ByteArrayOutputStream oStream = new java.io.ByteArrayOutputStream();		
		PrintWriter pw = new PrintWriter(oStream);			
		t.printStackTrace(pw);
		pw.flush();
		this.message = oStream.toString();

	}

}
