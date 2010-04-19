/*$Id: ThrowableMessage.java,v 1.5 2007-11-30 08:05:33 dvojtise Exp $
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


public class ThrowableMessage /*extends ConsoleMessage*/ {

	public ThrowableMessage(Throwable t) {
		//super("",ConsoleMessage.ERROR);
		
		ByteArrayOutputStream oStream = new java.io.ByteArrayOutputStream();		
		PrintWriter pw = new PrintWriter(oStream);			
		t.printStackTrace(pw);
		pw.flush();
		//this.message = oStream.toString();

	}

}
