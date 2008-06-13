/*$Id: UsingContentAssistProcessor.java,v 1.2 2008-06-13 08:39:58 dvojtise Exp $
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;
import org.kermeta.texteditor.KermetaTextEditor;

import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.texteditor.icons.blue.KermetaIconsBlue;

public class UsingContentAssistProcessor implements IContentAssistProcessor {
	
	private KermetaTextEditor editor = null;
	
	public UsingContentAssistProcessor(KermetaTextEditor editor) {
		this.editor = editor;
	}
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal> ();
		try {
			String startString = "";
			int index = 1;
			while ( ! Character.isWhitespace(viewer.getDocument().getChar(offset - index) ) ) {
				startString = viewer.getDocument().getChar(offset - index) + startString;
				index++;
			}
				
			int replacementLength = 0;
			while ( !(viewer.getDocument().getChar(offset + replacementLength) == '\n' ||
					viewer.getDocument().getChar(offset + replacementLength) == '\r' )){
				replacementLength++;	
			} 
			replacementLength = index -1 + replacementLength;
							
			Set<String> packages = getPackagesMatching(startString);
			for ( String s : packages ) {
				int cursorPosition = s.length();
				Image image = KermetaIconsBlue.PACKAGE;
				proposals.add( new CompletionProposal(s, offset - index+1, replacementLength, cursorPosition, image, null, null, null ) );
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
		return new char[] { ':', ' ' };
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

	private Set<String> getPackagesMatching(String s) {
		KermetaUnit kermetaUnit = editor.getKermetaUnit();
		Set<String> result = new HashSet<String>();
		if ( kermetaUnit != null ) {
			for ( Package p : kermetaUnit.getPackages() ) {
				String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(p);
				if ( qualifiedName.matches(s + ".+") )
					result.add(qualifiedName);
			}
		}
		return result;
	}
}


