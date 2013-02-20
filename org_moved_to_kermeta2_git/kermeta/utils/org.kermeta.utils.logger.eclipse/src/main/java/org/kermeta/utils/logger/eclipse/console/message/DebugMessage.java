/*$Id$
* Project : fr.irisa.triskell.eclipse.util
* File : 	InfoMessage.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.utils.logger.eclipse.console.message;

public class DebugMessage extends ConsoleMessage {

	public DebugMessage(String content) {
		super(content, ConsoleMessage.DEBUG);
	}
	
}
