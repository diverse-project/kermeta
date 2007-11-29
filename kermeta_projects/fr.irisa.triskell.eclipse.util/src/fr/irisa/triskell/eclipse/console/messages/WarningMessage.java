

/*$Id: WarningMessage.java,v 1.3 2007-11-29 16:28:25 dvojtise Exp $
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
		super(content, new Color(Display.getCurrent(), 255,170,0));
	}
	
}
