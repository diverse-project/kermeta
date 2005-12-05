/* $Id: ExpressionCallFrame.java,v 1.6 2005-12-05 09:25:41 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : ExpressionCallFrame.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 juin 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.behavior.FLambdaParameter;
import fr.irisa.triskell.kermeta.behavior.FVariableDecl;
import fr.irisa.triskell.kermeta.loader.expression.DynamicExpressionUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ExpressionCallFrame extends CallFrame {

    DynamicExpressionUnit unit;
    RuntimeObject selfObj;
    
    /**
     * @param pContext
     */
    public ExpressionCallFrame(InterpreterContext pContext, DynamicExpressionUnit unit, RuntimeObject selfObj) {
        super(pContext);
        this.unit = unit;
        this.selfObj = selfObj;
        this.pushExpressionContext();
    }

    /**
     * 
     * @param actualParam is supposed to be an ArrayList of RuntimeObjects
     */
    public void bindActualParameter(Hashtable actualParam) {
        
        if (actualParam.size() != unit.getVariables().size())
            throw new Error("The number of actual parameters provided does not match the number of formal parameters");
        
        pushExpressionContext();
        
        for(int i=0; i<unit.getVariables().size(); i++) {
            FVariableDecl var = (FVariableDecl)unit.getVariables().get(i);
            RuntimeObject obj = (RuntimeObject)actualParam.get(var.getFIdentifier());
            peekExpressionContext().defineVariable(var.getFIdentifier(), obj);
        }
    }
    
    public RuntimeObject eval(ExpressionInterpreter interpreter) {
        interpreter.interpreterContext.pushExpressionCallFrame(this);
        RuntimeObject result = context.getMemory().voidINSTANCE;
        try {
            result = (RuntimeObject)interpreter.accept(unit.getExpression());
        }
        finally {
            interpreter.interpreterContext.popCallFrame();
        }
        return result;
    }
    
    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.interpreter.CallFrame#getOperationResult()
     */
    public RuntimeObject getOperationResult() {
        return context.getMemory().voidINSTANCE;
    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.interpreter.CallFrame#setOperationResult(fr.irisa.triskell.kermeta.runtime.RuntimeObject)
     */
    public void setOperationResult(RuntimeObject operationResult) {
        throw new Error("Illegal result use in an expression");
    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.interpreter.CallFrame#getSelf()
     */
    public RuntimeObject getSelf() {
        return selfObj;
    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.interpreter.CallFrame#getOperation()
     */
    public FOperation getOperation() {
        return null;
    }
    
    /** Return the expression that is linked to this call frame */
    public FObject getExpression() {
        return unit.getExpression();
    }
    
    public void setSelf(RuntimeObject pSelf) { selfObj = pSelf; }
    
    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.interpreter.CallFrame#getTypeParameters()
     */
    public Hashtable getTypeParameters() {
       return new Hashtable();
    }

    /**
     * @see fr.irisa.triskell.kermeta.interpreter.CallFrame#getCallValueResult()
     */
    public RuntimeObject getCallValueResult() {
        return context.getMemory().voidINSTANCE;
    }

    /**
     * @see fr.irisa.triskell.kermeta.interpreter.CallFrame#setCallValueResult(fr.irisa.triskell.kermeta.runtime.RuntimeObject)
     */
    public void setCallValueResult(RuntimeObject callValuResult) {
        throw new Error("Illegal value use in an expression");
        
    }

}
