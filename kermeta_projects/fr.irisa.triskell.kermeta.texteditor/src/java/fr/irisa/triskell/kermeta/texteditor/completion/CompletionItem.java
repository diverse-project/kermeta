/* $Id: CompletionItem.java,v 1.3 2007-06-27 14:43:05 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : CompletionItem.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 may 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.completion;

import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.swt.graphics.Image;


/**
 * @author Franck Fleurey
 */
public abstract class CompletionItem implements Comparable {

    public abstract int getCursorLocation();
    
    public abstract String getCompletionText();
    
    public abstract String getLabel();
    
    public abstract String getDescription();

    public abstract Image getImage();
    
    public int compareTo(Object arg0) {
        if (arg0 instanceof CompletionItem) {
            CompletionItem other = (CompletionItem)arg0;
            return this.getLabel().toLowerCase().compareTo(other.getLabel().toLowerCase());
        }
        else return 0;
    }
    
    public CompletionProposal getCompletionProposal(int replaceOffset, int replaceLength) {
        CompletionProposal cp = new CompletionProposal(getCompletionText(), 
                replaceOffset, 
                replaceLength, 
                getCursorLocation(),
                getImage(), 
                getLabel(), 
                null, 
                getDescription());
        return cp;
    }
}
