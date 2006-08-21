/*
 * Created on 20 janv. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.completion;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
//import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Point;

import fr.irisa.triskell.kermeta.ast.CompUnit;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
//import fr.irisa.triskell.kermeta.ast.KermetaTokenNode;
import fr.irisa.triskell.kermeta.ast.ParamPostfix;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.editors.Editor;
//import fr.irisa.triskell.kermeta.texteditor.icons.KermetaSpecialIcons;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.Type;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 * 
 * Manages the automatic completion that assists the user.
 */
public class EditorCompletion implements IContentAssistProcessor {
	
	protected Editor editor;
	
	public EditorCompletion(Editor editor) {
		super();
		this.editor = editor;
	}

	/**
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer, int)
	 * Find completions proposals according to the cursor position.
	 */
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		
		IDocument doc = viewer.getDocument();
		Point selectedRange = viewer.getSelectedRange();
		ArrayList propList = new ArrayList();
		
		if (editor.getMcunit() == null) return null;
		
		// Get the token between the cursor and last character reliable for completion
		// "." -> should be followed by call feature
		// ":" -> should be followed by package or class
		String qualifier = getQualifier(doc, offset);
		
		TexteditorPlugin.pluginLog.info(" * Completion -> qualifier = " + qualifier);
		
		// ":" -> should be followed by package (todo) or class (done)
		if (qualifier.startsWith(":")) {
		    addPrposalsForTypes(doc, offset, propList, qualifier.substring(1));
		}
		// "." -> should be followed by call feature
		else if (qualifier.startsWith(".")) {
		    
		    CompUnit unit = ((KMTUnit)editor.getMcunit()).getMctAST();
			TexteditorPlugin.pluginLog.info(" * Completion unit -> " + unit);
			// If the kermeta program was correctly parsed
		    if (unit != null) {
		    	// Find the AST node behind the ".", using infos from the AST
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
	//		                }
		                    addPrposalsForFeatureCalls(doc, offset, propList, qualifier.substring(1), t);
		                }
		            }
		        }
		    }
		}
		/*
		if (qualifier.equals("")) { addPrposalsForKW(doc, offset, propList, qualifier); }
		else if(qualifier.charAt(0) == '.') { addPrposalsForFeatureCalls(doc, offset, propList, qualifier.substring(1)); }
		else if(qualifier.charAt(0) == ':') { addPrposalsForTypes(doc, offset, propList, qualifier.substring(1)); }
		*/
		
		// Create completion proposal array
		ICompletionProposal[] proposals = new ICompletionProposal[propList.size()];
		// and fill with list elements
		propList.toArray(proposals);
		// Return the proposals
		return proposals;
	}
	
	/** Get the node at the specified offset */
	private KermetaASTNode getNodeForOffset(IDocument doc, int offset, String qualifier) {
	    CompUnit unit = ((KMTUnit)editor.getMcunit()).getMctAST();
	    if (unit == null) return null;
	    KermetaASTNode result = (KermetaASTNode)unit.getNodeAt(offset - qualifier.length(), 0);
	    if (result == null) return null;
	    // FIX CALL WITH PARAMS
	    if (result.isTokenNode() && result.getText().equals(")") && result.getParent() instanceof ParamPostfix) {
	        result = (KermetaASTNode)unit.getNodeAt(result.getParent().getRangeStart()-1, 0);
	    }
	    return result;
	}
	
	/** Get the object in the model of kermeta program that is represented by the given AST-node */
	private fr.irisa.triskell.kermeta.language.structure.Object getFObjectForNode(KermetaASTNode node) {
		KermetaASTNode currentNode = node;
		fr.irisa.triskell.kermeta.language.structure.Object result = null;
		while (result == null && currentNode != null) { 
			result = (fr.irisa.triskell.kermeta.language.structure.Object)editor.getMcunit().getModelElementByNode(currentNode);
			currentNode = (KermetaASTNode)currentNode.getParent();
		}
		return result;
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
	
	/**
	 * Get, from the position of the cursor given by documentOffset, 
	 * the last token between the place where the cursor is located, and 
	 * the first "special" character (i.e ".", ":") that was found
	 * */
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
    
    private void addPrposalsForFeatureCalls(IDocument doc, int offset, ArrayList props, String begining, Type type) {
        for (Object next : type.callableProperties())
        {
            CallableProperty cp = (CallableProperty)next;
            CompletionItem ci = new CallPropertyCompletionItem(cp);
            if (ci.getCompletionText().toLowerCase().startsWith(begining.toLowerCase())) {
                props.add(ci.getCompletionProposal(offset - begining.length(), begining.length()));
            }
        }
        
        for (Object next : type.callableOperations())
        {
            CallableOperation cp = (CallableOperation)next;
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
    
    private void addPrposalsForTypes(IDocument doc, int offset, ArrayList props, String begining) {
        Iterator it = editor.getMcunit().packages.values().iterator();
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
        }
    }
    
    
    
}
