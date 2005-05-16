/* $Id: LambdaCallFrame.java,v 1.1 2005-05-16 17:39:08 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : LambdaCallFrame.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 16 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import fr.irisa.triskell.kermeta.behavior.FLambdaExpression;
import fr.irisa.triskell.kermeta.behavior.FLambdaParameter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FOperation;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class LambdaCallFrame extends CallFrame {

    /**
     * The lambda expression
     */
    private FLambdaExpression lambdaExp;
    
    /**
     * The call frame in which the lambda expression has been defined
     */
    private OperationCallFrame nestingOperationCallFrame;
    
    private Stack nestingExpressionContext;
    
    /**
     * Constructor
     */
    public LambdaCallFrame(InterpreterContext pContext, FLambdaExpression lambdaExp, CallFrame nestingCallFrame) {
        super(pContext);
        this.lambdaExp = lambdaExp;
        
        // get operation context
        if (nestingCallFrame instanceof OperationCallFrame) 
            nestingOperationCallFrame = (OperationCallFrame)nestingCallFrame;
        else {
            nestingOperationCallFrame = ((LambdaCallFrame)nestingCallFrame).nestingOperationCallFrame;
        }
        // copy the context
        nestingExpressionContext = new Stack();
        for(int i=0; i<nestingCallFrame.block_stack.size(); i++) {
            nestingExpressionContext.push( ((ExpressionContext)nestingCallFrame.block_stack.get(i)).copy() );
        }
        
    }
    
    
    /**
     * Bind a set of actual parameters (RuntimeObjects) to the 
     * formal parameters of the lambda expression
     * @param pParameters
     */
    public void bindActualParameter(ArrayList pParameters) {
        block_stack.clear();
        block_stack.addAll(nestingExpressionContext);
        pushExpressionContext();
        Iterator it = lambdaExp.getFParameters().iterator();
        int i=0;
        while (it.hasNext()) {
            FLambdaParameter fparam = (FLambdaParameter)it.next();
            peekExpressionContext().defineVariable(fparam.getFName(), (RuntimeObject)pParameters.get(i));
            i++;
        }
    } 
    
    public RuntimeObject getOperationResult() {
        return nestingOperationCallFrame.getOperationResult();
    }
    
    public void setOperationResult(RuntimeObject operationResult) {
        nestingOperationCallFrame.setOperationResult(operationResult);
    }
    
    public RuntimeObject getSelf() {
        return nestingOperationCallFrame.getSelf();
    }
    
    public String toString() {
        return nestingOperationCallFrame.getSelf().toString() + "." + nestingOperationCallFrame.getOperation().getFName() + "#function call";
    }
    
    public FOperation getOperation() {
        return nestingOperationCallFrame.getOperation();
    }

}
