/*$Id$
* Project : fr.irisa.triskell.eclipse.util
* File : 	ErrorMessage.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.utils.logger.eclipse.console.message;

public class ErrorMessage extends ConsoleMessage {

	public ErrorMessage(String content) {
		super(content, ConsoleMessage.ERROR);
	}
	
}
