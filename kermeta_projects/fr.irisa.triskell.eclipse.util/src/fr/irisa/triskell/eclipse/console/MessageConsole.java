

/*$Id: MessageConsole.java,v 1.2 2007-02-20 14:19:55 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.eclipse.console;

//import org.eclipse.ui.console.MessageConsole;

public class MessageConsole extends IOConsole {

	public MessageConsole(String name) {
		super();
		console = new org.eclipse.ui.console.MessageConsole(name, null);
		initialize();
	}
	
}
