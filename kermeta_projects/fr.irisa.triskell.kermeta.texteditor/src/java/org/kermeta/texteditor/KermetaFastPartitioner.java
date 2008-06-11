

/*$Id: KermetaFastPartitioner.java,v 1.5 2008-06-11 14:36:46 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	KermetaFastPartioner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;

import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

public class KermetaFastPartitioner extends FastPartitioner {

	public KermetaFastPartitioner(IPartitionTokenScanner scanner,
			String[] legalContentTypes) {
		super(scanner, legalContentTypes);
	}

	public void connect(IDocument document, boolean delayInitialise)
	{
	    super.connect(document, delayInitialise);
	    printPartitions(document);
	}

	public void printPartitions(IDocument document)
	{
	    StringBuffer buffer = new StringBuffer();

	    ITypedRegion[] partitions = computePartitioning(0, document.getLength());
	    for (int i = 0; i < partitions.length; i++)
	    {
	        try
	        {
	            buffer.append("Partition type: " 
	              + partitions[i].getType() 
	              + ", offset: " + partitions[i].getOffset()
	              + ", length: " + partitions[i].getLength());
	            buffer.append("\n");
	            buffer.append("Text:\n");
	            buffer.append(document.get(partitions[i].getOffset(), 
	             partitions[i].getLength()));
	            buffer.append("\n---------------------------\n\n\n");
	        }
	        catch (BadLocationException e)
	        {
	            e.printStackTrace();
	        }
	    }
		TexteditorPlugin.internalLog.debug(buffer);
	}
	
}


