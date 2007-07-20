/* $Id: CallOperationCompletionItem.java,v 1.5 2007-07-20 15:09:22 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : CallPropertyCompletionItem.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 may 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.completion;

import java.util.Iterator;

import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.FTypePrettyPrinter;

/**
 * @author Franck Fleurey
 */
public class CallOperationCompletionItem extends CompletionItem {

    CallableOperation operation;
    
    protected static GetTextVisitor getTextVisitor =  new GetTextVisitor();
    protected static GetImageVisitor getImageVisitor =  new GetImageVisitor();
    
    protected String completionText;
    protected int cursorLocation;
    
    public CallOperationCompletionItem(CallableOperation operation) {
        this.operation = operation;
        
        if (operation.getOperation().getOwnedParameter().size() == 0) {
            completionText = operation.getName();
            cursorLocation = completionText.length();
        }
        else {
            Parameter p1 = (Parameter)operation.getTypeBoundedOperation().getOwnedParameter().get(0);
            if (operation.getOperation().getOwnedParameter().size() == 1 && p1.getType() instanceof FunctionType) {
                Type left = ((FunctionType)p1.getType()).getLeft();
                String params = "";
                if (left instanceof ProductType) {
                    Iterator it = ((ProductType)left).getType().iterator();
                    while(it.hasNext()) {
                        String s = (String)FTypePrettyPrinter.getInstance().accept((Type)it.next());
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
