/* $Id: LambdaCallFrame.java,v 1.13 2008-04-28 11:50:55 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : LambdaCallFrame.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 16 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Operation;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class LambdaCallFrame extends CallFrame {

    /**
     * The lambda expression
     */
    private LambdaExpression lambdaExp;
    
    /**
     * The call frame in which the lambda expression has been defined
     */
    private OperationCallFrame nestingOperationCallFrame;
    
    private Stack nestingExpressionContext;
    
    /**
     * Constructor
     */
    public LambdaCallFrame(InterpreterContext pContext, LambdaExpression lambdaExp, CallFrame nestingCallFrame) {
        super(pContext);
        this.lambdaExp = lambdaExp;
        
        // get operation context
        if (nestingCallFrame instanceof OperationCallFrame) 
            nestingOperationCallFrame = (OperationCallFrame)nestingCallFrame;
        else if (nestingCallFrame instanceof LambdaCallFrame){
            nestingOperationCallFrame = ((LambdaCallFrame)nestingCallFrame).nestingOperationCallFrame;
        }
        else if (nestingCallFrame instanceof ExpressionCallFrame) {
        	if (((ExpressionCallFrame)nestingCallFrame).cf != null // so it is an invariant
        			&& ((ExpressionCallFrame)nestingCallFrame).cf instanceof OperationCallFrame){
        		nestingOperationCallFrame = (OperationCallFrame) ((ExpressionCallFrame)nestingCallFrame).cf; // r�cup�r� le parent dans la pile
        	}
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
    public void bindActualParameter(List<RuntimeObject> pParameters) {
        block_stack.clear();
        block_stack.addAll(nestingExpressionContext);
        pushExpressionContext();
        Iterator<LambdaParameter> it = lambdaExp.getParameters().iterator();
        int i=0;
        while (it.hasNext()) {
            LambdaParameter fparam = it.next();
            peekExpressionContext().defineVariable(fparam.getName(), pParameters.get(i));
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
    
    public Operation getOperation() {
    	if (nestingOperationCallFrame == null) return null;
        return nestingOperationCallFrame.getOperation();
    }
    
    public fr.irisa.triskell.kermeta.language.structure.Object getExpression() {
        return lambdaExp;
    }
    
    public OperationCallFrame getNestingOperationCallFrame() {
    	return nestingOperationCallFrame;
    }

}
