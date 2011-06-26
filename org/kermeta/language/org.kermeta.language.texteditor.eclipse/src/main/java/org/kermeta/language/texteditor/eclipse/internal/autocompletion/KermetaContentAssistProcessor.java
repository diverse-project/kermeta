/* $Id: 
 * Project    : org.kermeta.language.texteditor.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2011
 * Authors : 
 *           Cédric Bouhours 
 */

package org.kermeta.language.texteditor.eclipse.internal.autocompletion;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.kermeta.language.autocompletion.AutocompletionImpl;
import org.kermeta.language.autocompletion.api.Autocompletion;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.loader.kmt.scala.Lexer;
import org.kermeta.language.texteditor.eclipse.internal.Activator;
import org.kermeta.language.texteditor.eclipse.internal.KermetaEditor;
import org.kermeta.language.texteditor.eclipse.internal.autocompletion.KermetaImage;

public class KermetaContentAssistProcessor implements IContentAssistProcessor {
	
	KermetaEditor editor;
	
	public KermetaContentAssistProcessor(KermetaEditor editor) {
		this.editor = editor;
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,	int documentOffset) {
		// Retrieve current document
		IDocument doc = viewer.getDocument();
		
		ArrayList<KermetaCompletionProposal> propList = new ArrayList<KermetaCompletionProposal>();

		// Retrieve qualifier
		String qualifier = getQualifier(doc, documentOffset);

		// Compute completion proposals
		computeProposals(qualifier, documentOffset, propList);

		// Create completion proposal array
		ICompletionProposal[] proposals = new ICompletionProposal[propList.size()];

		// and fill with list elements
		propList.toArray(proposals);

		// Return the proposals
		return proposals; 
	}

	private String getQualifier(IDocument doc, int documentOffset) {

		// Use string buffer to collect characters
		StringBuffer currentLine = new StringBuffer();
		try {
			char c = doc.getChar(--documentOffset);
			while (c != '\n' && c != '\r') {
				currentLine.append(c);
				c = doc.getChar(--documentOffset);
			}
		} catch (BadLocationException e1) {}

		currentLine = currentLine.reverse();
			
		return currentLine.toString().trim();	
	}
	
	private boolean isTerminatedbyDelimiter(String qualifier,List<String> delimiters) {
		for (String aDelimiter : delimiters) {
			if (qualifier.endsWith(aDelimiter)) {
				return true;
			}
		}
		return false;
	}
	
	private String getLastQualifier(String qualifier) {
		String[] explode = qualifier.split("[ \t\n\f\r]");
		return explode[explode.length-1];
		
	}
	
	private void computeProposals(String qualifier, int documentOffset, List<KermetaCompletionProposal> propList) { 
		   int qlen = qualifier.length();
		   
		   org.kermeta.language.loader.kmt.scala.api.Lexer theLexer = new Lexer(); 
		   List<String> reserved = theLexer.getReservedWords();
		   List<String> delimiters = theLexer.getDelimiters();
		   List<String> theVariables = null;

		   if (editor.getFile() != null) {	   
			   String kpIdentifier = KermetaBuilder.getDefault().findKPidentifierFromKMT(editor.getFile());
			   
			   if (KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier) != null) {
				   Autocompletion myAutocompletion = new AutocompletionImpl(Activator.getDefault().getMessaggingSystem(),KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier));		   
				   theVariables = myAutocompletion.getAllVariableDecl();
			   }
		   }
		   
		   if (isTerminatedbyDelimiter(qualifier, delimiters)) {
			   //In this case, the last character is a delimiter
		   } else {
			   if (qlen > 0) {
				   String lastQualifier = getLastQualifier(qualifier);
				   for (String oneWord : reserved) {
					   if (oneWord.startsWith(lastQualifier)) {
					         int cursor = oneWord.length();
					         KermetaCompletionProposal proposal = new KermetaCompletionProposal(oneWord, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/kermeta.gif"));

					         // and add to result list
					         propList.add(proposal);
					   }
				   }
			   } else {
				   for (String oneWord : reserved) {
				         int cursor = oneWord.length();
				         KermetaCompletionProposal proposal = new KermetaCompletionProposal(oneWord, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/kermeta.gif"));

				         // and add to result list
				         propList.add(proposal);
				   }
			   }
		   }
		   
		   if (theVariables != null) {
			   for (String aVariable : theVariables) {
				   int cursor = aVariable.length();
				   KermetaCompletionProposal proposal = new KermetaCompletionProposal(aVariable, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/green/property.png"));

				   propList.add(proposal);
			   }
		   }
		}
	
	@Override
	public IContextInformation[] computeContextInformation(ITextViewer arg0,
			int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '.', ' ' };
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
