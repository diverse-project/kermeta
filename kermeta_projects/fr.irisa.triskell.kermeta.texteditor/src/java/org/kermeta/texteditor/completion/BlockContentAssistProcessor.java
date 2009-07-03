

/*$Id: BlockContentAssistProcessor.java,v 1.1 2007-12-17 14:05:09 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	TagContentAssistProcessor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor.completion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

public class BlockContentAssistProcessor implements IContentAssistProcessor {
	
	public BlockContentAssistProcessor() {
	}
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal> ();

		ICompletionProposal[] proposalsArray = new ICompletionProposal[proposals.size()];
		proposals.toArray(proposalsArray);
		return proposalsArray;
	}
	
	static private final Comparator<ICompletionProposal> completionProposalComparator = new Comparator<ICompletionProposal>() {
	     public int compare(ICompletionProposal o1, ICompletionProposal o2) {
	         String s1 = o1.getDisplayString();
	         String s2 = o2.getDisplayString();
	         return s1.compareTo(s2);
	     }
	 };
	
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return null;
	}

	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '.', ' ' };
	}

	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

	public String getErrorMessage() {
		return null;
	}

}


