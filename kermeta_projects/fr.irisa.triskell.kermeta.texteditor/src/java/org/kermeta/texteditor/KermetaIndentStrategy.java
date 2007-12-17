

/*$Id: KermetaIndentStrategy.java,v 1.1 2007-12-17 14:05:08 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaIndentStrategy.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 déc. 07
* Authors : paco
*/

package org.kermeta.texteditor;

import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;

public class KermetaIndentStrategy implements IAutoEditStrategy {

	public void customizeDocumentCommand(IDocument document, DocumentCommand command) {
		System.out.println();
		if ( command.text.length() > 1 ) {
			int index = command.text.length();
		}
	}

}


