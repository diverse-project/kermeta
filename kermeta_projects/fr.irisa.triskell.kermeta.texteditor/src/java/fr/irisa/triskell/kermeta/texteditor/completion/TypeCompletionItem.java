/* $Id: TypeCompletionItem.java,v 1.1 2005-05-10 20:38:28 ffleurey Exp $
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

import fr.irisa.triskell.kermeta.structure.FTypeDefinition;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class TypeCompletionItem extends CompletionItem {

    protected FTypeDefinition type;
    
    protected static GetTextVisitor getTextVisitor =  new GetTextVisitor();
    protected static GetImageVisitor getImageVisitor =  new GetImageVisitor();
    
    public TypeCompletionItem(FTypeDefinition t) {
        type = t;
    }
    
    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getLabel()
     */
    public String getLabel() {
        return getTextVisitor.accept(type).toString();
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getDescription()
     */
    public String getDescription() {
        return getTextVisitor.getQualifiedName(type);
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getImage()
     */
    public Image getImage() {
        return (Image)getImageVisitor.accept(type);
    }

    
    public String getCompletionText() {
        return type.getFName();
    }
    public int getCursorLocation() {
        return getCompletionText().length();
    }
}
