

/*$Id: KermetaDocumentProvider.java,v 1.1 2007-12-17 14:05:08 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaDocumentProvider.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class KermetaDocumentProvider extends FileDocumentProvider {

	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document =  super.createDocument(element);
		if ( document != null ) {
			IDocumentPartitioner partioner = new KermetaFastPartitioner( 
					new KermetaPartitionScanner(), 
					new String[] { 
						KermetaPartitionScanner.REQUIRE,
						KermetaPartitionScanner.COMMENT, 
						KermetaPartitionScanner.TAG, 
						//KermetaPartitionScanner.BLOCK,
						//KermetaPartitionScanner.OPERATION,
						KermetaPartitionScanner.USING,
						KermetaPartitionScanner.CLASS_DECLARATION
					} 
			);
			partioner.connect( document );
			document.setDocumentPartitioner( partioner );
		}
		return document;
	}
	
}


