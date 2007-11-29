

/*$Id: ThrowableMessage.java,v 1.4 2007-11-29 16:28:25 dvojtise Exp $
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

public class ThrowableMessage extends ConsoleMessage {

	public ThrowableMessage(Throwable t) {
		super("",new Color(Display.getCurrent(), 255,0 ,0 ));
		
		ByteArrayOutputStream oStream = new java.io.ByteArrayOutputStream();		
		PrintWriter pw = new PrintWriter(oStream);			
		t.printStackTrace(pw);
		pw.flush();
		this.message = oStream.toString();

	}

}
