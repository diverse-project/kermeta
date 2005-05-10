/* $Id: CallOperationCompletionItem.java,v 1.1 2005-05-10 20:38:27 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : CallPropertyCompletionItem.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.completion;

import java.util.Iterator;

import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.FTypePrettyPrinter;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class CallOperationCompletionItem extends CompletionItem {

    CallableOperation operation;
    
    protected static GetTextVisitor getTextVisitor =  new GetTextVisitor();
    protected static GetImageVisitor getImageVisitor =  new GetImageVisitor();
    
    protected String completionText;
    protected int cursorLocation;
    
    public CallOperationCompletionItem(CallableOperation operation) {
        this.operation = operation;
        
        if (operation.getOperation().getFOwnedParameter().size() == 0) {
            completionText = operation.getName();
            cursorLocation = completionText.length();
        }
        else {
            FParameter p1 = (FParameter)operation.getTypeBoundedOperation().getFOwnedParameter().get(0);
            if (operation.getOperation().getFOwnedParameter().size() == 1 && p1.getFType() instanceof FFunctionType) {
                FType left = ((FFunctionType)p1.getFType()).getFLeft();
                String params = "";
                if (left instanceof FProductType) {
                    Iterator it = ((FProductType)left).getFType().iterator();
                    while(it.hasNext()) {
                        String s = (String)FTypePrettyPrinter.getInstance().accept((FType)it.next());
                        params += s.substring(0, 1).toLowerCase();
                        if (it.hasNext()) params += ", ";
                    }
                }
                else {
                    String s = (String)FTypePrettyPrinter.getInstance().accept(left);
                    params += s.substring(0, 1).toLowerCase();
                }
                
                completionText = operation.getName() + "{ "+ params +" |  }";
                cursorLocation = completionText.length() - 2;
            }
            else {
                completionText = operation.getName() + "()";
                cursorLocation = completionText.length() - 1;
            }
        }
    }
    
    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getCursorLocation()
     */
    public int getCursorLocation() {
        return cursorLocation;
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getCompletionText()
     */
    public String getCompletionText() {
       return completionText;
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getLabel()
     */
    public String getLabel() {
        return getTextVisitor.accept(operation.getTypeBoundedOperation()).toString();
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getDescription()
     */
    public String getDescription() {
        return getTextVisitor.accept(operation.getTypeBoundedOperation()).toString() + " (" + operation.getType() +")";
    }

    /**
     * @see fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem#getImage()
     */
    public Image getImage() {
        return (Image)getImageVisitor.accept(operation.getTypeBoundedOperation());
    }

}
