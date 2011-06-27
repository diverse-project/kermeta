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

import java.net.URL;
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
import org.kermeta.language.loader.kmt.scala.api.IKToken;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.texteditor.eclipse.internal.Activator;
import org.kermeta.language.texteditor.eclipse.internal.KermetaEditor;
import org.kermeta.language.texteditor.eclipse.internal.autocompletion.KermetaImage;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class KermetaContentAssistProcessor implements IContentAssistProcessor {

	KermetaEditor editor;
	private org.kermeta.language.loader.kmt.scala.api.Lexer theLexer = new Lexer();

	public KermetaContentAssistProcessor(KermetaEditor editor) {
		this.editor = editor;
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,	int documentOffset) {
		// Retrieve current document
		IDocument doc = viewer.getDocument();

		ArrayList<KermetaCompletionProposal> propList = new ArrayList<KermetaCompletionProposal>();

		// Retrieve qualifier
		List<IKToken> qualifier = getQualifier(doc, documentOffset);

		// Compute completion proposals
		computeProposals(qualifier, documentOffset, propList);

		// Create completion proposal array
		ICompletionProposal[] proposals = new ICompletionProposal[propList.size()];

		// and fill with list elements
		propList.toArray(proposals);

		// Return the proposals
		return proposals; 
	}

	private List<IKToken> getQualifier(IDocument doc, int documentOffset) {

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

		List<IKToken> temp = theLexer.lex(currentLine.toString().trim());

		if (temp.size() == 0) {
			temp.add(new IKToken() {			
				@Override
				public Integer getOffset() {
					return null;
				}			
				@Override
				public Integer getLength() {
					return null;
				}
			});
		}

		return temp;	
	}

	private boolean isTerminatedbyKeyword(List<IKToken> qualifier) {
		if (qualifier.get(qualifier.size()-1).getClass().getSimpleName().equals("Keyword")) {
			return true;
		}
		return false;
	}

	private String getDelimiter(List<IKToken> qualifier) {
		int i = qualifier.size();
		while (--i >= 0) {
			if (qualifier.get(i).getClass().getSimpleName().equals("Delimiter")) {
				return qualifier.get(i).toString();
			}
		}

		return "";
	}

	private String getLastIdentifier(List<IKToken> qualifier) {
		if (qualifier.get(qualifier.size()-1).getClass().getSimpleName().equals("Identifier")) {
			return qualifier.get(qualifier.size()-1).toString();
		}

		return "";
	}

	private String getLastKeywordk(List<IKToken> qualifier) {
		int i = qualifier.size();
		while (--i >= 0) {
			if (qualifier.get(i).getClass().getSimpleName().equals("Keyword")) {
				return qualifier.get(i).toString();
			}
		}

		return "";
	}


	private void computeProposals(List<IKToken> qualifier, int documentOffset, List<KermetaCompletionProposal> propList) { 

		int qlen = getLastIdentifier(qualifier).length();

		List<String> reserved = theLexer.getReservedWords();   
		List<String> theVariables = null;
		List<String> theOperations = null;
		List<String> theClassDefinition = null;

		if (editor.getFile() != null) {	   
			String kpIdentifier = KermetaBuilder.getDefault().findKPidentifierFromKMT(editor.getFile());

			if (KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier) != null) {
				Autocompletion myAutocompletion = new AutocompletionImpl(Activator.getDefault().getMessaggingSystem(),KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier));		   
				theVariables = myAutocompletion.getAllVariableDecl();
				theOperations = myAutocompletion.getAllOperations();
				theClassDefinition = myAutocompletion.getAllClassDefinition();
			}
		}

		if (getDelimiter(qualifier).equals("::") || getDelimiter(qualifier).equals(":")) {
			//Proposal of ClassDef
			proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
		} else if (! isTerminatedbyKeyword(qualifier)) {
			//Proposal of Keywords and Variables
			proposeVariable(qualifier, documentOffset, propList, qlen, theVariables);
			proposeKeywords(qualifier, documentOffset, propList, qlen, reserved);
		} else {
			if (getLastKeywordk(qualifier).equals("reference")) {
				//Proposal of ClassDef
				proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
			}
		}

		/*if (theOperations != null) {
			   for (String anOperation : theOperations) {
				   int cursor = anOperation.length();
				   KermetaCompletionProposal proposal = new KermetaCompletionProposal(anOperation, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/green/operation.png"));

				   propList.add(proposal);
			   }
		   }*/
	}

	private void proposeKeywords(List<IKToken> qualifier, int documentOffset, List<KermetaCompletionProposal> propList, int qlen, List<String> reserved) {
		String lastQualifier = getLastIdentifier(qualifier);
		
		for (String oneWord : reserved) {
			int cursor = oneWord.length();
			if (lastQualifier.length() > 0) {
				if (oneWord.startsWith(lastQualifier)) {
					propList.add(new KermetaCompletionProposal(oneWord, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/kermeta.gif")));
				}
			} else {
				propList.add(new KermetaCompletionProposal(oneWord, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/kermeta.gif")));
			}
		}
	}

	private void proposeVariable(List<IKToken> qualifier, int documentOffset, List<KermetaCompletionProposal> propList, int qlen, List<String> theVariables) {
		String lastQualifier = getLastIdentifier(qualifier);

		if (theVariables != null) {
			for (String aVariable : theVariables) {
				int cursor = aVariable.length();
				if (lastQualifier.length() > 0) {
					if (aVariable.startsWith(lastQualifier)) {
						propList.add(new KermetaCompletionProposal(aVariable, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/specific/VariableDecl.gif")));
					}
				} else {
					propList.add(new KermetaCompletionProposal(aVariable, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/specific/VariableDecl.gif")));
				}
			}
		}
	}

	private void proposeClassDefinition(List<IKToken> qualifier, int documentOffset, List<KermetaCompletionProposal> propList, int qlen, List<String> theClassDefinition) {
		String lastQualifier = getLastIdentifier(qualifier);

		if (theClassDefinition != null) {
			for (String aClassDef : theClassDefinition) {
				int cursor = aClassDef.length();
				if (lastQualifier.length() > 0) {
					if (aClassDef.startsWith(lastQualifier)) {
						propList.add(new KermetaCompletionProposal(aClassDef, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/specific/ClassDefinition.gif")));
					}					   
				} else {			   
					propList.add(new KermetaCompletionProposal(aClassDef, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/specific/ClassDefinition.gif")));
				}
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
