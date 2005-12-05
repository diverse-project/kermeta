/* $Id: LambdaCallFrame.java,v 1.8 2005-12-05 09:25:41 ffleurey Exp $
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
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Stack;

import fr.irisa.triskell.kermeta.behavior.FLambdaExpression;
import fr.irisa.triskell.kermeta.behavior.FLambdaParameter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FObject;
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
        else if (nestingCallFrame instanceof LambdaCallFrame){
            nestingOperationCallFrame = ((LambdaCallFrame)nestingCallFrame).nestingOperationCallFrame;
        }
        else if (nestingCallFrame instanceof ExpressionCallFrame) {
        	
        }
        // copy the context
        nestingExpressionContext = new Stack();
        for(int i=0; i<nestingCallFrame.block_stack.size(); i++) {
            nestingExpressionContext.push( ((ExpressionContext)nestingCallFrame.block_stack.get(i)).copy() );
        }
        
    }
    
    protected LambdaCallFrame(LambdaCallFrame other) {
        super(other.context);
        lambdaExp = other.lambdaExp;
        nestingOperationCallFrame = other.nestingOperationCallFrame;
        nestingExpressionContext = (Stack)other.nestingExpressionContext.clone();
    }
    
    public LambdaCallFrame cloneLambdaCallFrame() {
        LambdaCallFrame result = new LambdaCallFrame(this);
        return result;
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
    	if (nestingOperationCallFrame == null) return null;
        return nestingOperationCallFrame.getOperationResult();
    }
    public RuntimeObject getCallValueResult() {
    	if (nestingOperationCallFrame == null) return null;
        return nestingOperationCallFrame.getCallValueResult();
    }
    
    public void setOperationResult(RuntimeObject operationResult) {
    	if (nestingOperationCallFrame == null) return;
        nestingOperationCallFrame.setOperationResult(operationResult);
    }
    public void setCallValueResult(RuntimeObject callValueResult) {
    	if (nestingOperationCallFrame == null) return;
        nestingOperationCallFrame.setCallValueResult(callValueResult);
    }
    
    public RuntimeObject getSelf() {
    	if (nestingOperationCallFrame == null) return null;
        return nestingOperationCallFrame.getSelf();
    }
    public void setSelf(RuntimeObject pSelf) {  }
    
    public Hashtable getTypeParameters() {
    	if (nestingOperationCallFrame == null) return new Hashtable();
        return nestingOperationCallFrame.getTypeParameters();
    }
    
    public String toString() {
    	if (nestingOperationCallFrame == null) return "#function call";
        return nestingOperationCallFrame.toString() + "#function call";
    }
    
    public FOperation getOperation() {
    	if (nestingOperationCallFrame == null) return null;
        return nestingOperationCallFrame.getOperation();
    }
    
    public FObject getExpression() {
        return lambdaExp;
    }

}
