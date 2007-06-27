/* $Id: CallPropertyCompletionItem.java,v 1.3 2007-06-27 14:43:05 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : CallPropertyCompletionItem.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 may 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.completion;

import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.typechecker.CallableProperty;

/**
 * @author Franck Fleurey
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
