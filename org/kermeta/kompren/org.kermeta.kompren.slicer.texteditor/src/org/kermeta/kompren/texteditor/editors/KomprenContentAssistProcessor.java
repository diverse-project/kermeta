package org.kermeta.kompren.texteditor.editors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.kermeta.kompren.lexer.KomprenLexer;
import org.kermeta.kompren.lexer.KomprenTokens.KomprenToken;

public class KomprenContentAssistProcessor implements IContentAssistProcessor {
//	private KomprenEditor editor;
//	private Autocompletion myAutocompletion = null;
	private IDocument doc = null;
	private StringBuffer identation = new StringBuffer();
	private List<String> reserved = new org.kermeta.kompren.lexer.KomprenLexical().getReserved();

	
	public KomprenContentAssistProcessor(KomprenEditor editor) {
		super();
//		this.editor = editor;
	}

	
	@Override
	public ICompletionProposal[] computeCompletionProposals(final ITextViewer viewer, final int documentOffset) {
		// Retrieve current document
		doc = viewer.getDocument();

		List<KomprenCompletionProposal> propList = new ArrayList<KomprenCompletionProposal>();

		// Retrieve qualifier
		List<KomprenToken> qualifier = getQualifier(doc, documentOffset);

		if(!qualifier.isEmpty())
			// Compute completion proposals only if it is not a comment
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

	
	private void initializeIdentation(final String line) {
		this.identation = new StringBuffer();
		for(int i=0;i<line.length();i++)
			if(line.charAt(i) == '\u0020' || line.charAt(i) == '\t')
				this.identation.append(line.charAt(i));
			else
				return;
	}
		
	
	private List<KomprenToken> getQualifier(final IDocument document, final int documentOffset) {
		// Use string buffer to collect characters
		StringBuffer currentLine = new StringBuffer();
		int offset = documentOffset;
		
		try {
			char c = document.getChar(--offset);
			while (c != '\n' && c != '\r') {
				currentLine.append(c);
				c = document.getChar(--offset);
			}
		} catch (BadLocationException e1) {}

		currentLine = currentLine.reverse();

		initializeIdentation(currentLine.toString());
		List<KomprenToken> temp = new ArrayList<KomprenToken>();
		KomprenLexer theLexer = new KomprenLexer(currentLine.toString().trim());
		
		while(!theLexer.atEnd())
			temp.add(theLexer.nextToken());
		
		return temp;	
	}

//	private boolean isTerminatedbyKeyword(final List<KomprenToken> qualifier) {
//		if (qualifier.get(qualifier.size()-1).getClass().getSimpleName().equals("Keyword")) {
//			return true;
//		}
//		return false;
//	}

//	private String getDelimiter(final List<KomprenToken> qualifier) {
//		int i = qualifier.size();
//		while (--i >= 0) {
//			if (qualifier.get(i).getClass().getSimpleName().equals("Delimiter")) {
//				return qualifier.get(i).toString();
//			}
//		}
//
//		return "";
//	}

//	private KomprenToken getLast(final List<KomprenToken> qualifier) {
//		return qualifier.get(qualifier.size()-1);
//	}
	
	private String getLastIdentifier(final List<KomprenToken> qualifier) {
		if(qualifier.get(qualifier.size()-1).getClass().getSimpleName().equals("Identifier"))
			return qualifier.get(qualifier.size()-1).toString();
		return "";
	}

//	private String getLastKeyword(final List<KomprenToken> qualifier) {
//		int i = qualifier.size();
//		while (--i >= 0) {
//			if (qualifier.get(i).getClass().getSimpleName().equals("Keyword")) {
//				return qualifier.get(i).toString();
//			}
//		}
//
//		return "";
//	}
	
//	private String getLastCompletePackageChain(final List<KomprenToken> qualifier, final boolean withTheLast) {
//		StringBuffer result = new StringBuffer();
//		boolean current = false;
//		for (int i = 0;i<qualifier.size();i++) {
//			if (qualifier.get(i).getClass().getSimpleName().equals("Identifier")) {
//				if (i+1<qualifier.size()) {
//					if (qualifier.get(i+1).getClass().getSimpleName().equals("Delimiter")) {
//						if (qualifier.get(i+1).toString().equals("::")) {
//							if (!current) {
//								result = new StringBuffer();
//							}
//							current = true;
//							result.append(qualifier.get(i));
//							result.append(qualifier.get(i+1));
//						} else {
//							if (current) {
//								current = false;
//							}
//						}
//					} else {
//						if (current) {
//							current = false;
//						}
//					}
//				}
//			} else {
//				if (current && !qualifier.get(i).getClass().getSimpleName().equals("Delimiter")) {
//					current = false;
//				}
//			}
//		}
//		
//		if (!withTheLast && !result.toString().equals("")) {
//			result = result.delete(result.lastIndexOf("::"), result.length());
//			result = result.delete(result.lastIndexOf("::")+2, result.length());
//		}
//		
//		return result.toString();
//	}

	private void computeProposals(final List<KomprenToken> qualifier, final int documentOffset, final List<KomprenCompletionProposal> propList) { 
		int qlen = getLastIdentifier(qualifier).length();

//		List<String> theVariables = null;
//		List<String> theClassDefinition = null;
//		List<String> thePackages = null;
		

//		if (editor.getFile() != null) {	   
//			String kpIdentifier = KermetaBuilder.getDefault().findKPidentifierFromKMT(editor.getFile());
//
//			ModelingUnit theCurrentMU = KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier); 
//			
//			if (theCurrentMU != null) {
//				myAutocompletion = new AutocompletionImpl(Activator.getDefault().getMessaggingSystem(),KermetaBuilder.getDefault().getKpLastModelingunit(kpIdentifier));
//			}
//		}

//		if (getDelimiter(qualifier).equals("::") || getDelimiter(qualifier).equals(":") || getLastKeyword(qualifier).equals("init")) {
//			//Proposal of ClassDef
//			proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
//			proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
//		} else if (getDelimiter(qualifier).equals(".")) {
//			proposeCallExpression(qualifier, documentOffset, propList, qlen);
//		} else if (! isTerminatedbyKeyword(qualifier)) {
//			//Proposal of Keywords and Variables
//			proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
//			proposeVariable(qualifier, documentOffset, propList, qlen, theVariables);
			proposeKeywords(qualifier, documentOffset, propList, qlen, reserved);
//		} else {
//			if (getLastKeyword(qualifier).equals("reference")) {
//				//Proposal of ClassDef
//				proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
//				proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
//			} else if (getLastKeyword(qualifier).equals("init")) {
//				//Proposal of ClassDef
//				proposePackages(qualifier, documentOffset, propList, qlen, thePackages);
//				proposeClassDefinition(qualifier, documentOffset, propList, qlen, theClassDefinition);
//				proposeVariable(qualifier, documentOffset, propList, qlen, theVariables);
//			}
//		}
	}
	

	private void proposeKeywords(final List<KomprenToken> qualifier, final int documentOffset, final List<KomprenCompletionProposal> propList, 
								final int qlen, final List<String> reserved2) {
//		String lastQualifier = getLastIdentifier(qualifier);
		
		for (String oneWord : reserved2) {
			int cursor = oneWord.length()+1;
//			if (lastQualifier.length() > 0) {
//				if (oneWord.startsWith(lastQualifier)) {
//					if (!proposeStructure(oneWord, documentOffset, propList, qlen)) {					
//						propList.add(new KomprenCompletionProposal(oneWord+" ", documentOffset - qlen, qlen, cursor, KomprenImage.getImage("/icons/kermeta.gif")));
//					}
//				}
//			} else {
//				if (!proposeStructure(oneWord, documentOffset, propList, qlen)) {
					propList.add(new KomprenCompletionProposal(oneWord+" ", documentOffset - qlen, qlen, cursor, null));
//				}
//			}
		}
	}

//	private void proposeVariable(List<KomprenToken> qualifier, int documentOffset, List<KomprenCompletionProposal> propList, int qlen, List<String> theVariables) {
//		String lastQualifier = getLastIdentifier(qualifier);
//
//		if (myAutocompletion != null) {
//			theVariables = myAutocompletion.getAllVariableDecl();
//		}
//		
//		if (theVariables != null) {
//			for (String aVariable : theVariables) {
//				int cursor = aVariable.length();
//				if (lastQualifier.length() > 0) {
//					if (aVariable.startsWith(lastQualifier)) {
//						propList.add(new KomprenCompletionProposal(aVariable, documentOffset - qlen, qlen, cursor, KomprenImage.getImage("/icons/specific/VariableDecl.gif")));
//					}
//				} else {
//					propList.add(new KomprenCompletionProposal(aVariable, documentOffset - qlen, qlen, cursor, KomprenImage.getImage("/icons/specific/VariableDecl.gif")));
//				}
//			}
//		}
//	}

//	private void proposeClassDefinition(List<IKToken> qualifier, int documentOffset, List<KomprenCompletionProposal> propList, int qlen, List<String> theClassDefinition) {
//		String lastQualifier = getLastIdentifier(qualifier);
//		String thePackageToUse = getLastCompletePackageChain(qualifier,true);
//
//		if (myAutocompletion != null) {
//
//			theClassDefinition = myAutocompletion.getAllClassDefinition(thePackageToUse);
//		}
//		
//		if (theClassDefinition != null) {
//			for (String aClassDef : theClassDefinition) {
//				int cursor = aClassDef.length();
//				if (lastQualifier.length() > 0) {
//					if (aClassDef.startsWith(lastQualifier)) {
//						propList.add(new KomprenCompletionProposal(aClassDef, documentOffset - qlen, qlen, cursor, KomprenImage.getImage("/icons/specific/ClassDefinition.gif")));
//					}					   
//				} else {			   
//					propList.add(new KomprenCompletionProposal(aClassDef, documentOffset - qlen, qlen, cursor, KomprenImage.getImage("/icons/specific/ClassDefinition.gif")));
//				}
//			}
//		}
//	}
	
//	private void proposePackages(List<KomprenToken> qualifier, int documentOffset, List<KomprenCompletionProposal> propList, int qlen, List<String> thePackages) {
//		String lastQualifier = getLastIdentifier(qualifier);
//		String thePackageToUse = getLastCompletePackageChain(qualifier,true);
//		
//		if (myAutocompletion != null) {
//			if (thePackageToUse.equals("")) {
//				thePackages = myAutocompletion.getAllPackages();
//			} else {
//				thePackages = myAutocompletion.getSubPackages(thePackageToUse);
//			}
//		}
//		
//		if (thePackages != null) {
//			for (String aPackage : thePackages) {
//				int cursor = aPackage.length();
//				if (lastQualifier.length() > 0) {
//					if (aPackage.startsWith(lastQualifier)) {
//						propList.add(new KomprenCompletionProposal(aPackage+"::", documentOffset - qlen, qlen, cursor+2, KomprenImage.getImage("/icons/red/package.png"),aPackage,null,null));
//					}					   
//				} else {			   
//					propList.add(new KomprenCompletionProposal(aPackage+"::", documentOffset - qlen, qlen, cursor+2, KomprenImage.getImage("/icons/red/package.png"),aPackage,null,null));
//				}
//			}
//		}
//	}
	
//	private ArrayList<String> explodeCallExpression(List<KomprenToken> elements) {
//		
//		ArrayList<String> result = new ArrayList<String>();
//		
//		int i = elements.size()-1;
//		
//		while (i>=0) {
//			if (elements.get(i).getClass().getSimpleName().equals("Delimiter")) {
//				if (! elements.get(i).toString().equals(".")) {
//					return result;
//				}
//			}
//			if (elements.get(i).getClass().getSimpleName().equals("Identifier")) {
//				result.add(elements.get(i).toString());
//			}
//			i--;
//		}
//		
//		return result;
//		
//	}
	
//	private void proposeCallExpression(List<KomprenToken> qualifier, int documentOffset, List<KomprenCompletionProposal> propList, int qlen) {
//		HashMap<String,ArrayList<String>> theCallExpression = null;
//		theCallExpression = myAutocompletion.getCallExpression(explodeCallExpression(qualifier), getLastCompletePackageChain(qualifier, true));
//		if (theCallExpression != null) {
//			for (String currentMetaClass : theCallExpression.keySet()) {
//				Image theImage = KomprenImage.getImage("/icons/specific/EmptyExpression.gif");
//				if (currentMetaClass.equals("Operation")) {
//					theImage = KomprenImage.getImage("/icons/red/operation.png");
//				}
//				if (currentMetaClass.equals("Property")) {
//					theImage = KomprenImage.getImage("/icons/red/property.png");
//				}
//				for (String anElement : theCallExpression.get(currentMetaClass)) {
//					int cursor = anElement.length();
//					propList.add(new KomprenCompletionProposal(anElement, documentOffset - qlen, qlen, cursor, theImage));
//				}
//			}
//		}
//	}

//	private boolean proposeStructure(String qualifier, int documentOffset, List<KomprenCompletionProposal> propList, int qlen) {
//		boolean result = false;
//		int cursor = 0;
//		String proposition = "";
//		if (qualifier.equals("do")) {
//			proposition = "do\n"+this.identation+"\t\n"+this.identation+"end";
//			cursor = 3 + this.identation.length() + 1;
//			propList.add(new KomprenCompletionProposal(proposition, documentOffset - qlen, qlen, cursor,KomprenImage.getImage("/icons/specific/Block.gif"),"do...end",null,null));
//			result = true;
//		}
//		if (qualifier.equals("if")) {
//			proposition = "if () then\n"+this.identation+"end";
//			cursor = 4;
//			propList.add(new KomprenCompletionProposal(proposition, documentOffset - qlen, qlen, cursor,KomprenImage.getImage("/icons/specific/Conditional.gif"),"if...then...end",null,null));
//			proposition = "if () then\n"+this.identation+"else\n"+this.identation+"end";
//			propList.add(new KomprenCompletionProposal(proposition, documentOffset - qlen, qlen, cursor,KomprenImage.getImage("/icons/specific/Conditional.gif"),"if...then...else...end",null,null));
//			result = true;
//		}
//		if (qualifier.equals("loop")) {
//			proposition = "loop\n"+this.identation+"\t\n"+this.identation+"end";
//			cursor = 5 + this.identation.length() + 1;
//			propList.add(new KomprenCompletionProposal(proposition, documentOffset - qlen, qlen, cursor,KomprenImage.getImage("/icons/specific/Loop.gif"),"loop...end",null,null));
//			result = true;
//		}
//		if (qualifier.equals("from")) {
//			proposition = "from \n"+this.identation+"loop\n"+this.identation+"end";
//			cursor = 5 ;
//			propList.add(new KomprenCompletionProposal(proposition, documentOffset - qlen, qlen, cursor,KomprenImage.getImage("/icons/specific/Loop.gif"),"from...loop...end",null,null));
//			result = true;
//		}
//		return result;
//	}
	

	@Override
	public IContextInformation[] computeContextInformation(final ITextViewer arg0, final int arg1) {
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '.', ' ', ':'};
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
		return "An error unables Kompren to assist your content";
	}

}
