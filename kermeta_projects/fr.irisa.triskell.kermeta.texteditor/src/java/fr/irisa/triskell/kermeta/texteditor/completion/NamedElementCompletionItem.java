/* $Id: NamedElementCompletionItem.java,v 1.2 2007-01-08 17:21:30 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : TypeCompletionItem.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.completion;

import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.language.structure.NamedElement;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class NamedElementCompletionItem extends CompletionItem {

    protected NamedElement namedElement;
    
    protected static GetTextVisitor getTextVisitor =  new GetTextVisitor();
    protected static GetImageVisitor getImageVisitor =  new GetImageVisitor();
    
    public NamedElementCompletionItem(NamedElement n) {
        namedElement = n;
    }
    
    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getLabel()
     */
    public String getLabel() {
        return getTextVisitor.accept(namedElement).toString();
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getDescription()
     */
    public String getDescription() {
        return getTextVisitor.getQualifiedName(namedElement);
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getImage()
     */
    public Image getImage() {
        return (Image)getImageVisitor.accept(namedElement);
    }

    
    public String getCompletionText() {
        return namedElement.getName();
    }
    public int getCursorLocation() {
        return getCompletionText().length();
    }
}
