

/*$Id: SintaksContentAssistProcessor.java,v 1.1 2007-05-24 08:45:07 ftanguy Exp $
* Project : fr.irisa.triskell.sintaks.editor
* File : 	SintaksContentAssistProcessor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 mai 07
* Authors : paco
*/

package fr.irisa.triskell.sintaks.texteditor;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;

public class SintaksContentAssistProcessor implements IContentAssistProcessor {

	private Set<String> keywords;

	private Image keywordIcon;
	
	public SintaksContentAssistProcessor(Set<String> keywords) {
		this.keywords = keywords;
		try {
			keywordIcon = ImageDescriptor.createFromURL( new URL(SintaksTextEditorPlugin.getPluginURL(), "/icons/keyword.gif") ).createImage();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		ArrayList<ICompletionProposal> results = new ArrayList <ICompletionProposal> ();
		String currentWord = "";
		boolean mustStop = false;
		int currentOffset = offset-1;
		try {
			while ( ! mustStop && (currentOffset != -1) ) {
				char currentChar = viewer.getDocument().getChar(currentOffset);
				if ( Character.isWhitespace(currentChar) )
					mustStop = true;
				else {
					currentWord = currentChar + currentWord;
					currentOffset--;
				}
			}
			
			for ( String currentKeyword : keywords ) {
				if ( currentKeyword.matches( currentWord + ".+" ) )
					results.add( new CompletionProposal(currentKeyword, offset-currentWord.length(), currentWord.length(), currentKeyword.length(), keywordIcon, "Keyword : " + currentKeyword, null, "") );
			}
			
			return results.toArray(new ICompletionProposal[] {});
			
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return null;
	}

	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		return null;
	}

	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
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


