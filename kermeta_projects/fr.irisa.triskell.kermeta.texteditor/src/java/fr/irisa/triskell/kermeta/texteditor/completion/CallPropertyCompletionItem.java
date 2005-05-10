/* $Id: CallPropertyCompletionItem.java,v 1.1 2005-05-10 20:38:27 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : CallPropertyCompletionItem.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.completion;

import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.typechecker.CallableProperty;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class CallPropertyCompletionItem extends CompletionItem {

    CallableProperty property;
    
    protected static GetTextVisitor getTextVisitor =  new GetTextVisitor();
    protected static GetImageVisitor getImageVisitor =  new GetImageVisitor();
    
    public CallPropertyCompletionItem(CallableProperty property) {
        this.property = property;
    }
    
    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getCursorLocation()
     */
    public int getCursorLocation() {
        return getCompletionText().length();
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getCompletionText()
     */
    public String getCompletionText() {
        return property.getName();
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getLabel()
     */
    public String getLabel() {
        return getTextVisitor.accept(property.getTypeBoundedProperty()).toString();
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getDescription()
     */
    public String getDescription() {
        return getTextVisitor.accept(property.getTypeBoundedProperty()).toString() + " (" + property.getType() +")";
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getImage()
     */
    public Image getImage() {
        return (Image)getImageVisitor.accept(property.getTypeBoundedProperty());
    }

}
