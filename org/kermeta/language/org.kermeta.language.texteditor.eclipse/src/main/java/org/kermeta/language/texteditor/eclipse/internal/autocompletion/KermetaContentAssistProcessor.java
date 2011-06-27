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
import java.util.Collection;
import java.util.Collections;
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

	private KermetaEditor editor;
	private org.kermeta.language.loader.kmt.scala.api.Lexer theLexer = new Lexer();
	private Autocompletion myAutocompletion = null;

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

		//Sort propList
		Collections.sort(propList);
		
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
	
	private String getLastCompletePackageChain(List<IKToken> qualifier, boolean withTheLast) {
		StringBuffer result = new StringBuffer();
		boolean current = false;
		for (int i = 0;i<qualifier.size();i++) {
			if (qualifier.get(i).getClass().getSimpleName().equals("Identifier")) {
				if (i+1<qualifier.size()) {
					if (qualifier.get(i+1).getClass().getSimpleName().equals("Delimiter")) {
						if (qualifier.get(i+1).toString().equals("::")) {
							current = true;
							result.append(qualifier.get(i));
							result.append(qualifier.get(i+1));
						} else {
							if (current) {
								current = false;
								result = new StringBuffer();
							}
						}
					} else {
						if (current) {
							current = false;
							result = new StringBuffer();
						}
					}
				}
			} else {
				if (current && !qualifier.get(i).getClass().getSimpleName().equals("Delimiter")) {
					current = false;
					result = new StringBuffer();
				}
			}
		}
		
		if (!withTheLast && !result.toString().equals("")) {
			result = result.delete(result.lastIndexOf("::"), result.length());
			result = result.delete(result.lastIndexOf("::")+2, result.length());
		}
		
		return result.toString();
	}

	private void computeProposals(List<IKToken> qualifier, int documentOffset, List<KermetaCompletionProposal> propList) { 

		int qlen = getLastIdentifier(qualifier).length();

		List<String> reserved = theLexer.getReservedWords();   
		List<String> theVariables = null;
		List<String> theOperations = null;
		List<String> theClassDefinition = null;
		List<String> thePackages = null;
		

		if (editor.getFile() != null) {	   
			String kpIdentifier = KermetaBuilder.getDefault().findKPidentifierFromKMT(editor.getFile());

			ModelingUnit theCurrentMU = KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier); 
			
			if (theCurrentMU != null) {
				myAutocompletion = new AutocompletionImpl(Activator.getDefault().getMessaggingSystem(),KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier));
			}
		}

		if (getDelimiter(qualifier).equals("::") || getDelimiter(qualifier).equals(":") || getLastKeywordk(qualifier).equals("init")) {
			//Proposal of ClassDef
			proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
			proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
		} else if (! isTerminatedbyKeyword(qualifier)) {
			//Proposal of Keywords and Variables
			proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
			proposeVariable(qualifier, documentOffset, propList, qlen, theVariables);
			proposeKeywords(qualifier, documentOffset, propList, qlen, reserved);
		} else {
			if (getLastKeywordk(qualifier).equals("reference")) {
				//Proposal of ClassDef
				proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
				proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
			} else if (getLastKeywordk(qualifier).equals("init")) {
				//Proposal of ClassDef
				proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
				proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
				proposeVariable(qualifier, documentOffset, propList, qlen, theVariables);
			}
		}
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

		if (myAutocompletion != null) {
			theVariables = myAutocompletion.getAllVariableDecl();
		}
		
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
		String thePackageToUse = getLastCompletePackageChain(qualifier,false);

		if (myAutocompletion != null) {

			theClassDefinition = myAutocompletion.getAllClassDefinition(thePackageToUse);
		}
		
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
	
	private void proposePackages(List<IKToken> qualifier, int documentOffset, List<KermetaCompletionProposal> propList, int qlen, List<String> thePackages) {
		String lastQualifier = getLastIdentifier(qualifier);
		String thePackageToUse = getLastCompletePackageChain(qualifier,true);
		
		if (myAutocompletion != null) {
			if (thePackageToUse.equals("")) {
				thePackages = myAutocompletion.getAllPackages();
			} else {
				thePackages = myAutocompletion.getSubPackages(thePackageToUse);
			}
		}
		
		if (thePackages != null) {
			for (String aPackage : thePackages) {
				int cursor = aPackage.length();
				if (lastQualifier.length() > 0) {
					if (aPackage.startsWith(lastQualifier)) {
						propList.add(new KermetaCompletionProposal(aPackage+"::", documentOffset - qlen, qlen, cursor+2, KermetaImage.getImage("/icons/green/package.png"),aPackage,null,null));
					}					   
				} else {			   
					propList.add(new KermetaCompletionProposal(aPackage+"::", documentOffset - qlen, qlen, cursor+2, KermetaImage.getImage("/icons/green/package.png"),aPackage,null,null));
				}
			}
		}
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer arg0,
			int arg1) {
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '.', ' ' };
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

}
