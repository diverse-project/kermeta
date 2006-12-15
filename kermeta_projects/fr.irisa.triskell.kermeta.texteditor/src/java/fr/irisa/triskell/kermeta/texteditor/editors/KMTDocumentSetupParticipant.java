package fr.irisa.triskell.kermeta.texteditor.editors;

import org.eclipse.core.filebuffers.IDocumentSetupParticipant;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.DefaultPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;

public class KMTDocumentSetupParticipant implements IDocumentSetupParticipant {

	public void setup(IDocument document) {
	
		if (document instanceof IDocumentExtension3) {	// Notion de partitionnements multiples
			IDocumentExtension3 extension3= (IDocumentExtension3) document;
			// Crée le partitioner
			IDocumentPartitioner partitioner= new FastPartitioner( new KMTRuleBasedPartitionScanner(),
					KMTRuleBasedPartitionScanner.getLegalContentTypes());
			// Attache le partitioner au document.
			extension3.setDocumentPartitioner(KMTRuleBasedPartitionScanner.ID, partitioner);
			// Attache le document au partitioner.
			partitioner.connect(document);
		}

	}

}
