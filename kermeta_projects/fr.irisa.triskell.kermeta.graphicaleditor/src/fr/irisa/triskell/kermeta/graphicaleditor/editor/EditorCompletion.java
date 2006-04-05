/* $Id: EditorCompletion.java,v 1.1 2006-04-05 19:00:14 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : EditorCompletion.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Apr 5, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.editor;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Point;

import fr.irisa.triskell.kermeta.ast.CompUnit;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.ast.ParamPostfix;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.completion.CallOperationCompletionItem;
import fr.irisa.triskell.kermeta.texteditor.completion.CallPropertyCompletionItem;
import fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem;
import fr.irisa.triskell.kermeta.texteditor.completion.TypeCompletionItem;
import fr.irisa.triskell.kermeta.texteditor.editors.Editor;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.Type;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class EditorCompletion implements IContentAssistProcessor {
	
	
	/**
	 * 
	 */
	public EditorCompletion() {
		super();
	}

	/**
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer, int)
	 */
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		
		IDocument doc = viewer.getDocument();
		Point selectedRange = viewer.getSelectedRange();
		ArrayList propList = new ArrayList();
		
		//if (editor.getMcunit() == null) return null;
		
		String qualifier = getQualifier(doc, offset);
		
		TexteditorPlugin.pluginLog.info(" * Completion -> qualifier = " + qualifier);
		
		
		if (qualifier.startsWith(":")) {
		    addProposalsForTypes(doc, offset, propList, qualifier.substring(1));
		}
		else if (qualifier.startsWith(".")) {
		    
		    //CompUnit unit = ((KMTUnit)editor.getMcunit()).getMctAST();
			CompUnit unit = null;
			TexteditorPlugin.pluginLog.info(" * Completion unit -> " + unit);
			
		    if (unit != null) {
		        KermetaASTNode astnode = getNodeForOffset(doc, offset, qualifier);
		        TexteditorPlugin.pluginLog.info(" * Completion astnode -> " + astnode);
		        
		        if (astnode != null) {
		            fr.irisa.triskell.kermeta.language.structure.Object obj = getFObjectForNode(astnode);
		            TexteditorPlugin.pluginLog.info(" * Completion FObject -> " + obj);
		            
		            
		            if (obj != null && obj instanceof LambdaExpression) {
		                LambdaExpression lexp = (LambdaExpression)obj;
		                if (lexp.eContainer() instanceof CallFeature) obj = (CallFeature)lexp.eContainer();
		                TexteditorPlugin.pluginLog.info(" * -> Completion FObject -> " + obj);
		            }
		            
		            
		            if (obj != null && obj instanceof Expression && ((Expression)obj).getStaticType() != null) {
		                Type t = new SimpleType(((Expression)obj).getStaticType());
		                TexteditorPlugin.pluginLog.info(" * Completion for type -> " + t);
		                if (t != null) {
	//		                if (((SimpleType)t).getType() instanceof FunctionType) {
	//		                    t = t.getFunctionTypeRight();
	//		                    TexteditorPlugin.pluginLog.info(" * Completion for type -> " + t);
	//		                }
		                
		                
		                    addProposalsForFeatureCalls(doc, offset, propList, qualifier.substring(1), t);
		                }
		            }
		            
		        }
		        
		    }
		    
		}
		
		/*
		if (qualifier.equals("")) {
			addPrposalsForKW(doc, offset, propList, qualifier);
		}
		else if(qualifier.charAt(0) == '.') {
			addPrposalsForFeatureCalls(doc, offset, propList, qualifier.substring(1));
		}
		else if(qualifier.charAt(0) == ':') {
			addPrposalsForTypes(doc, offset, propList, qualifier.substring(1));
		}
		*/
		// Create completion proposal array
		ICompletionProposal[] proposals = new ICompletionProposal[propList.size()];
		// and fill with list elements
		propList.toArray(proposals);
		// Return the proposals
		return proposals;
	}
	
	private KermetaASTNode getNodeForOffset(IDocument doc, int offset, String qualifier) {
	    CompUnit unit = null ;//((KMTUnit)editor.getMcunit()).getMctAST();
	    if (unit == null) return null;
	    KermetaASTNode result = (KermetaASTNode)unit.getNodeAt(offset - qualifier.length(), 0);
	    if (result == null) return null;
	    // FIX CALL WITH PARAMS
	    if (result.isTokenNode() && result.getText().equals(")") && result.getParent() instanceof ParamPostfix) {
	        result = (KermetaASTNode)unit.getNodeAt(result.getParent().getRangeStart()-1, 0);
	    }
	    return result;
	}
	
	 private fr.irisa.triskell.kermeta.language.structure.Object getFObjectForNode(KermetaASTNode node) {
	        return null;
	    }

	/**
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeContextInformation(org.eclipse.jface.text.ITextViewer, int)
	 */
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getCompletionProposalAutoActivationCharacters()
	 */
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '.', ':' };
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationAutoActivationCharacters()
	 */
	public char[] getContextInformationAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getErrorMessage()
	 */
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationValidator()
	 */
	public IContextInformationValidator getContextInformationValidator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
    private String getQualifier(IDocument doc, int documentOffset)
    {
       // Use string buffer to collect characters
       StringBuffer buf = new StringBuffer();
       boolean white = false;
       while (true)
       {
          try
          {
            // Read character backwards
            char c;
			c = doc.getChar(--documentOffset);
			// This was not the start of a tag...but I don't care!
             if (Character.isWhitespace(c))
             {
                // no open tag was found.
                //return buf.reverse().toString();
                white = true;
                continue;
             }
             
             
             // Start of tag or attribute value. Return qualifier
             if (c == '.' || c == ':')
             {
                buf.append(c);
                return buf.reverse().toString();
             }
             
             if (white) return "";
             
             // Collect character
             buf.append(c);
          }
          catch (org.eclipse.jface.text.BadLocationException e)
          {
             // Document start reached, no tag found
             return "";
          }
       }
    }
    
    private void addProposalsForFeatureCalls(IDocument doc, int offset, ArrayList props, String begining, Type type) {
        Iterator it = type.callableProperties().iterator();
        while(it.hasNext()) {
            CallableProperty cp = (CallableProperty)it.next();
            CompletionItem ci = new CallPropertyCompletionItem(cp);
            if (ci.getCompletionText().toLowerCase().startsWith(begining.toLowerCase())) {
                props.add(ci.getCompletionProposal(offset - begining.length(), begining.length()));
                
            }
        }
        
        it = type.callableOperations().iterator();
        while(it.hasNext()) {
            CallableOperation cp = (CallableOperation)it.next();
            CompletionItem ci = new CallOperationCompletionItem(cp);
            if (ci.getCompletionText().toLowerCase().startsWith(begining.toLowerCase())) {
                props.add(ci.getCompletionProposal(offset - begining.length(), begining.length()));
                
            }
        }
        //Collections.sort(props);
    }
    /*
    private void addPrposalsForKW(IDocument doc, int offset, ArrayList props, String begining) {
    	// find possible methods :
    	String[] propositions = kws;
    	// selet those which match
    	for(int i=0; i<propositions.length; i++) {
    		if(propositions[i].startsWith(begining)) {
    			CompletionProposal p = new CompletionProposal(propositions[i], offset, 0, propositions[i].length(),null, propositions[i], null, null);
    			props.add(p);
    		}
    	}
    }
    */
    
    private void addProposalsForTypes(IDocument doc, int offset, ArrayList props, String begining) {
     /*   Iterator it = editor.getMcunit().packages.values().iterator();
        while(it.hasNext()) {
            Package p = (Package)it.next();
            Iterator typeit = p.getOwnedTypeDefinition().iterator();
            while(typeit.hasNext()) {
                TypeDefinition td = (TypeDefinition)typeit.next();
                
                CompletionItem ci = new TypeCompletionItem(td);
                
                if (ci.getCompletionText().toLowerCase().startsWith(begining.toLowerCase())) {
                    props.add(ci.getCompletionProposal(offset - begining.length(), begining.length()));
                    
                }
               //Collections.sort(props);
            }
        }*/
    }
    
    
    
}