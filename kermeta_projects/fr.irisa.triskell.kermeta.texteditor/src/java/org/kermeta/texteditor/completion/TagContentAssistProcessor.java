

/*$Id: TagContentAssistProcessor.java,v 1.2 2008-06-13 08:39:59 dvojtise Exp $
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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

public class TagContentAssistProcessor implements IContentAssistProcessor {
	
	final static private String URI_TAG = "@uri \"\"";
	
	final static private String ASPECT_TAG_TRUE = "@aspect \"true\"";
	
	final static private String ASPECT_TAG_FALSE = "@aspect \"false\"";
	
	private String[] stringProposals;
	
	public TagContentAssistProcessor() {
		stringProposals = new String[] { URI_TAG, ASPECT_TAG_TRUE, ASPECT_TAG_FALSE };
	}
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal> ();
		
		try {
			
			boolean showProposals = true;
			int index = offset;
			char c;
			boolean goOn = true;
			while ( goOn ) {
				c = viewer.getDocument().getChar(index--);
				if ( c == '*' ) {
					showProposals = false;
					goOn = false;
				} else if ( c == '@' )
					goOn = false;
			}
			
			if ( showProposals ) {
				
				for ( String s : stringProposals ) {
					int replacementOffset = offset;
					while ( viewer.getDocument().getChar(replacementOffset) != '@' )
						replacementOffset--;
			
					int replacementLength = offset;
					while ( !(viewer.getDocument().getChar(offset + replacementLength) == '\n' ||
							viewer.getDocument().getChar(offset + replacementLength) == '\r' ) )
						replacementLength++;
					replacementLength = replacementLength - replacementOffset;
					
					proposals.add( new CompletionProposal(s, replacementOffset, replacementLength, s.length()) );
				}
				
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	
		Collections.sort( proposals, completionProposalComparator );
		
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
		return new char[] { '@', ' ' };
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


