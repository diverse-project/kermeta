/*$Id: ErrorMessage.java,v 1.4 2007-11-30 08:05:33 dvojtise Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	ErrorMessage.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.eclipse.console.messages;

public class ErrorMessage extends ConsoleMessage {

	public ErrorMessage(String content) {
		super(content, ConsoleMessage.ERROR);
	}
	
}
