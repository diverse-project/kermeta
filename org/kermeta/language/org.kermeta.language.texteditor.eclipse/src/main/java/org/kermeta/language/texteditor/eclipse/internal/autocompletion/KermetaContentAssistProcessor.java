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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;
import org.kermeta.language.autocompletion.AutocompletionImpl;
import org.kermeta.language.autocompletion.api.Autocompletion;
import org.kermeta.language.behavior.CallExpression;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.language.loader.kmt.scala.Lexer;
import org.kermeta.language.loader.kmt.scala.api.IKToken;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.texteditor.eclipse.internal.Activator;
import org.kermeta.language.texteditor.eclipse.internal.ClosestElementFinder;
import org.kermeta.language.texteditor.eclipse.internal.KermetaEditor;

public class KermetaContentAssistProcessor implements IContentAssistProcessor {

	private KermetaEditor editor;
	private org.kermeta.language.loader.kmt.scala.api.Lexer theLexer = new Lexer();
	private Autocompletion myAutocompletion = null;
	private IDocument doc = null;
	private StringBuffer identation = new StringBuffer();

	public KermetaContentAssistProcessor(KermetaEditor editor) {
		this.editor = editor;
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,	int documentOffset) {
		// Retrieve current document
		doc = viewer.getDocument();

		ArrayList<KermetaCompletionProposal> propList = new ArrayList<KermetaCompletionProposal>();

		// Retrieve qualifier
		List<IKToken> qualifier = getQualifier(doc, documentOffset);

		if (!getLast(qualifier).getClass().getSimpleName().equals("Comment") && !getLast(qualifier).getClass().getSimpleName().equals("MLComment")) {
			// Compute completion proposals only if it is not a comment
			computeProposals(qualifier, documentOffset, propList);
		}

		//Sort propList
		Collections.sort(propList);
		
		// Create completion proposal array
		ICompletionProposal[] proposals = new ICompletionProposal[propList.size()];

		// and fill with list elements
		propList.toArray(proposals);

		// Return the proposals
		return proposals; 
	}

	private void initializeIdentation(String line) {
		this.identation = new StringBuffer();
		for (int i=0;i<line.length();i++) {
			if (line.charAt(i) == '\u0020' || line.charAt(i) == '\t') {
				this.identation.append(line.charAt(i));
			} else {
				return;
			}
		}
		
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

		initializeIdentation(currentLine.toString());
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

	private IKToken getLast(List<IKToken> qualifier) {
		return qualifier.get(qualifier.size()-1);
	}
	
	private String getLastIdentifier(List<IKToken> qualifier) {
		if (qualifier.get(qualifier.size()-1).getClass().getSimpleName().equals("Identifier")) {
			return qualifier.get(qualifier.size()-1).toString();
		}

		return "";
	}

	private String getLastKeyword(List<IKToken> qualifier) {
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
							if (!current) {
								result = new StringBuffer();
							}
							current = true;
							result.append(qualifier.get(i));
							result.append(qualifier.get(i+1));
						} else {
							if (current) {
								current = false;
							}
						}
					} else {
						if (current) {
							current = false;
						}
					}
				}
			} else {
				if (current && !qualifier.get(i).getClass().getSimpleName().equals("Delimiter")) {
					current = false;
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
		List<String> theClassDefinition = null;
		List<String> thePackages = null;
		

		if (editor.getFile() != null) {	   
			String kpIdentifier = KermetaBuilder.getDefault().findKPidentifierFromKMT(editor.getFile());

			ModelingUnit theCurrentMU = KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier); 
			
			if (theCurrentMU != null) {				
				myAutocompletion = new AutocompletionImpl(Activator.getDefault().getMessaggingSystem(),KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier));
			}
			/*else{ // time consuming ...
				
				IFile file = editor.getFile().getProject().getFile("target/beforeCheckingforScopeRESOLVED.km");
				if (file != null){
					try {
						ResourceSet resSet = new ResourceSetImpl();
						Resource res = resSet.getResource(org.kermeta.utils.helpers.emf.EMFUriHelper.convertToEMFUri(file.getLocationURI()), true);
						ModelingUnit rtNode = (ModelingUnit) res.getContents().get(0);	
						myAutocompletion =  new AutocompletionImpl(Activator.getDefault().getMessaggingSystem(),rtNode);
					} catch(RuntimeException e){
					}
				}
			}*/
		}

		if (getLastKeyword(qualifier).equals("using")) {
			if (getDelimiter(qualifier).equals("::") || getDelimiter(qualifier).equals(":") ) {
				//Proposal of ClassDef
				proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
				propList.add(new KermetaCompletionProposal("*", documentOffset - qlen, qlen, 1, KermetaImage.getImage("/icons/kermeta.gif")));
				proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
			} else if(qualifier.size() == 1){
				//Proposal of package or class def
				proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
				proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
			} else if(getLast(qualifier).toString().equals("=>")){ 
				proposeRenaming(qualifier, documentOffset, propList, qlen);
			}
			else {
				propList.add(new KermetaCompletionProposal("=>", documentOffset, 0, 2, KermetaImage.getImage("/icons/kermeta.gif")));
			}
		} else if (getDelimiter(qualifier).equals("::") || getDelimiter(qualifier).equals(":") ) {
			//Proposal of ClassDef
			proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
			proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
		} else if (getDelimiter(qualifier).equals(".")) {
			proposeCallExpression(qualifier, documentOffset, propList, qlen);
		} else if (! isTerminatedbyKeyword(qualifier)) {
			//Proposal of Keywords and Variables
			proposeVariable(qualifier, documentOffset, propList, qlen, theVariables);
			proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
			proposeKeywords(qualifier, documentOffset, propList, qlen, reserved);
		} else  if (getLastKeyword(qualifier).equals("init")) {
			//Proposal of ClassDef
			proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
			proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
			proposeVariable(qualifier, documentOffset, propList, qlen, theVariables);
		}
	}

	
	private void proposeRenaming(List<IKToken> qualifier, int documentOffset,
		List<KermetaCompletionProposal> propList, int qlen) {
		// TODO propose a smart new name based on using
	}

	private void proposeKeywords(List<IKToken> qualifier, int documentOffset, List<KermetaCompletionProposal> propList, int qlen, List<String> reserved) {
		String lastQualifier = getLastIdentifier(qualifier);
		
		for (String oneWord : reserved) {
			int cursor = oneWord.length()+1;
			if (lastQualifier.length() > 0) {
				if (oneWord.startsWith(lastQualifier)) {
					if (!proposeStructure(oneWord, documentOffset, propList, qlen)) {					
						propList.add(new KermetaCompletionProposal(oneWord+" ", documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/kermeta.gif")));
					}
				}
			} else {
				if (!proposeStructure(oneWord, documentOffset, propList, qlen)) {
					propList.add(new KermetaCompletionProposal(oneWord+" ", documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/kermeta.gif")));
				}
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
		String thePackageToUse = getLastCompletePackageChain(qualifier,true);

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
						propList.add(new KermetaCompletionProposal(aPackage, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/red/package.png"),aPackage,null,null));
					}					   
				} else {			   
					propList.add(new KermetaCompletionProposal(aPackage, documentOffset - qlen, qlen, cursor, KermetaImage.getImage("/icons/red/package.png"),aPackage,null,null));
				}
			}
		}
	}
	
	private ArrayList<String> explodeCallExpression(List<IKToken> elements) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		int i = elements.size()-1;
		
		while (i>=0) {
			if (elements.get(i).getClass().getSimpleName().equals("Delimiter")) {
				if (! elements.get(i).toString().equals(".")) {
					return result;
				}
			}
			if (elements.get(i).getClass().getSimpleName().equals("Identifier")) {
				result.add(elements.get(i).toString());
			}
			i--;
		}
		
		return result;
		
	}
	
	private void proposeCallExpression(List<IKToken> qualifier, int documentOffset, List<KermetaCompletionProposal> propList, int qlen) {
		HashMap<String,ArrayList<String>> theCallExpression = null;
		//if (myAutocompletion != null) {
			// disabled until we get a proper way to deal with it
			// idea : have an operation that compute the closest preceding/containing element based on tracability information in the model  
		//	theCallExpression = myAutocompletion.getCallExpression(explodeCallExpression(qualifier), getLastCompletePackageChain(qualifier, true));
			
			// 
		/*int lastElemOffset = documentOffset;
		if(getLast(qualifier).toString().equals(".") && qualifier.size() > 1){
			// get previous element offset which has more chances to be in the modeling unit
			lastElemOffset = qualifier.get(qualifier.size()-1).
		}*/
		
		ClosestElementFinder finder = new ClosestElementFinder(editor, documentOffset-(qlen+2));
		KermetaModelElement closestContainer = finder.findClosestContainerModelelement();
		
		if(closestContainer != null){
			if(closestContainer instanceof CallExpression){
				CallExpression ce = (CallExpression) closestContainer;
				ce.getKType();
			}
		}
		//}
		/*if (theCallExpression != null) {
			for (String currentMetaClass : theCallExpression.keySet()) {
				Image theImage = KermetaImage.getImage("/icons/specific/EmptyExpression.gif");
				if (currentMetaClass.equals("Operation")) {
					theImage = KermetaImage.getImage("/icons/red/operation.png");
				}
				if (currentMetaClass.equals("Property")) {
					theImage = KermetaImage.getImage("/icons/red/property.png");
				}
				for (String anElement : theCallExpression.get(currentMetaClass)) {
					int cursor = anElement.length();
					propList.add(new KermetaCompletionProposal(anElement, documentOffset - qlen, qlen, cursor, theImage));
				}
			}
		}*/
	}

	private boolean proposeStructure(String qualifier, int documentOffset, List<KermetaCompletionProposal> propList, int qlen) {
		boolean result = false;
		int cursor = 0;
		String proposition = "";
		if (qualifier.equals("do")) {
			proposition = "do\n"+this.identation+"\t\n"+this.identation+"end";
			cursor = 3 + this.identation.length() + 1;
			propList.add(new KermetaCompletionProposal(proposition, documentOffset - qlen, qlen, cursor,KermetaImage.getImage("/icons/specific/Block.gif"),"do...end",null,null));
			result = true;
		}
		if (qualifier.equals("if")) {
			proposition = "if () then\n"+this.identation+"end";
			cursor = 4;
			propList.add(new KermetaCompletionProposal(proposition, documentOffset - qlen, qlen, cursor,KermetaImage.getImage("/icons/specific/Conditional.gif"),"if...then...end",null,null));
			proposition = "if () then\n"+this.identation+"else\n"+this.identation+"end";
			propList.add(new KermetaCompletionProposal(proposition, documentOffset - qlen, qlen, cursor,KermetaImage.getImage("/icons/specific/Conditional.gif"),"if...then...else...end",null,null));
			result = true;
		}
		if (qualifier.equals("loop")) {
			proposition = "loop\n"+this.identation+"\t\n"+this.identation+"end";
			cursor = 5 + this.identation.length() + 1;
			propList.add(new KermetaCompletionProposal(proposition, documentOffset - qlen, qlen, cursor,KermetaImage.getImage("/icons/specific/Loop.gif"),"loop...end",null,null));
			result = true;
		}
		if (qualifier.equals("from")) {
			proposition = "from \n"+this.identation+"loop\n"+this.identation+"end";
			cursor = 5 ;
			propList.add(new KermetaCompletionProposal(proposition, documentOffset - qlen, qlen, cursor,KermetaImage.getImage("/icons/specific/Loop.gif"),"from...loop...end",null,null));
			result = true;
		}
		return result;
	}
	

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer arg0,
			int arg1) {
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { }; // user must ask for completion with ctrl+space
		//return new char[] { '.', ' ', ':'};
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
		return "An error unables Kermeta to assist your content";
	}
	
	
}
