/*
 * Created on 20 janv. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.texteditor.icons.KermetaSpecialIcons;
import fr.irisa.triskell.kermeta.texteditor.outline.GetImageVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class EditorCompletion implements IContentAssistProcessor {

	protected final static String[] methods = { "equals()", "get()","set()", "ename", "isNotEqual()" };
	protected final static String[] types = { "Object", "Class","Collection" };
	protected final static String[] kws = { "from", "if","local" };
	
	
	protected Editor editor;
	
	/**
	 * 
	 */
	public EditorCompletion(Editor editor) {
		super();
		this.editor = editor;
	}

	/**
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer, int)
	 */
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		
		IDocument doc = viewer.getDocument();
		Point selectedRange = viewer.getSelectedRange();
		ArrayList propList = new ArrayList();
		
		String qualifier = getQualifier(doc, offset);
		
		if (qualifier.equals("")) {
			addPrposalsForKW(doc, offset, propList, qualifier);
		}
		else if(qualifier.charAt(0) == '.') {
			addPrposalsForFeatureCalls(doc, offset, propList, qualifier.substring(1));
		}
		else if(qualifier.charAt(0) == ':') {
			addPrposalsForTypes(doc, offset, propList, qualifier.substring(1));
		}
		
		
		// Create completion proposal array
        ICompletionProposal[] proposals = new ICompletionProposal[propList.size()];
        // and fill with list elements
        propList.toArray(proposals);
        // Return the proposals
       return proposals;
	}

	/**
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeContextInformation(org.eclipse.jface.text.ITextViewer, int)
	 */
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getCompletionProposalAutoActivationCharacters()
	 */
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '.' };
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
                return buf.reverse().toString();
             }
             // Collect character
             buf.append(c);
             // Start of tag or attribute value. Return qualifier
             if (c == '.' || c == ':')
             {
                return buf.reverse().toString();
             }
          }
          catch (org.eclipse.jface.text.BadLocationException e)
          {
             // Document start reached, no tag found
             return "";
          }
       }
    }
    
    private void addPrposalsForFeatureCalls(IDocument doc, int offset, ArrayList props, String begining) {
    	// find possible methods :
    	String[] propositions = methods;
    	// selet those which match
    	for(int i=0; i<propositions.length; i++) {
    		if(propositions[i].startsWith(begining)) {
    			CompletionProposal p = new CompletionProposal(propositions[i], offset, 0, propositions[i].length(),null, propositions[i], null, null);
    			props.add(p);
    		}
    	}
    }
    
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
    
    private void addPrposalsForTypes(IDocument doc, int offset, ArrayList props, String begining) {
        
        Iterator it = editor.getMcunit().packages.values().iterator();
        while(it.hasNext()) {
            FPackage p = (FPackage)it.next();
            Iterator typeit = p.getFOwnedTypeDefinition().iterator();
            while(typeit.hasNext()) {
                FTypeDefinition td = (FTypeDefinition)typeit.next();
                String type_id = td.getFName();
                if (type_id.startsWith(type_id)) {
                    CompletionProposal cp = new CompletionProposal(type_id, offset, 0, type_id.length(),KermetaSpecialIcons.KERMETA_LOGO, td.getFName(), null, editor.getMcunit().getQualifiedName(td));
                    props.add(cp);
                }
            }
            
        }
    }
}
