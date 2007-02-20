

/*$Id: WarningMessage.java,v 1.2 2007-02-20 14:19:55 ftanguy Exp $
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

public class WarningMessage extends ConsoleMessage {

	public WarningMessage(String content) {
		color = new Color(Display.getCurrent(), 255,170,0);
		message = content;
	}
	
}
