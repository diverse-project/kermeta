/* $Id: KMTDocumentSetupParticipant.java,v 1.4 2007-06-27 14:43:04 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : KMTDocumentSetupParticipant.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 dec. 2006
* Author : ftanguy (ftanguy@irisa.fr)
*/ 

package fr.irisa.triskell.kermeta.texteditor.editors;

import org.eclipse.core.filebuffers.IDocumentSetupParticipant;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;

import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

public class KMTDocumentSetupParticipant implements IDocumentSetupParticipant {

	public void setup(IDocument document) {
	
		if (document instanceof IDocumentExtension3) {	// Notion de partitionnements multiples
			IDocumentExtension3 extension3= (IDocumentExtension3) document;
			// Crée le partitioner
			IDocumentPartitioner partitioner= new FastPartitioner( new KMTPartitionScanner(),
					KMTPartitionScanner.getLegalContentTypes());
			// Attache le partitioner au document.
			extension3.setDocumentPartitioner(TexteditorPlugin.KMT_PARTITIONING, partitioner);
			// Attache le document au partitioner.
			partitioner.connect(document);
		}

	}

}
