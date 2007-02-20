

/*$Id: ObjectKermetaMessage.java,v 1.2 2007-02-20 14:19:55 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.eclipse.console.messages;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class ObjectKermetaMessage extends ConsoleMessage {

	public ObjectKermetaMessage(Object o) {
		color = new Color(Display.getCurrent(), 0,0 ,0 );
		this.message = o.toString();
	}

}
