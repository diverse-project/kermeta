/* $Id: ExpressionCallFrame.java,v 1.11 2007-08-08 13:00:01 dvojtise Exp $
* Project : Kermeta (First iteration)
* File : ExpressionCallFrame.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 juin 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.interpreter;

//import java.util.ArrayList;
import java.util.Hashtable;

//import java.util.Iterator;

//import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.expression.DynamicExpressionUnit;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class ExpressionCallFrame extends CallFrame {

    DynamicExpressionUnit unit;
    RuntimeObject selfObj;
    CallFrame cf; //not null if this expression is an invariant, thus its value is the previous CallFrame in the stack
    
    /**
     * @param pContext
     */
    public ExpressionCallFrame(InterpreterContext pContext, DynamicExpressionUnit unit, RuntimeObject selfObj) {
        super(pContext);
        this.unit = unit;
        this.selfObj = selfObj;
        this.pushExpressionContext();
        this.cf = null;
    }
    
    /**
     * @param pContext
     * @param isInvariant : value is true if the expression is related to an invariant
     */
    public ExpressionCallFrame(InterpreterContext pContext, DynamicExpressionUnit unit, RuntimeObject selfObj, Boolean isInvariant) {
        super(pContext);
        this.unit = unit;
        this.selfObj = selfObj;
        this.pushExpressionContext();
        if (isInvariant)
        	this.cf = pContext.peekCallFrame();
        else
        	this.cf = null;
    }

    /**
     * 
     * @param actualParam is supposed to be an ArrayList of RuntimeObjects
     */
    public void bindActualParameter(Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type> actualParam) {
        
        if (actualParam.size() != unit.getVariables().size())
            throw new Error("The number of actual parameters provided does not match the number of formal parameters");
        
        pushExpressionContext();
        
        for(int i=0; i<unit.getVariables().size(); i++) {
            VariableDecl var = (VariableDecl)unit.getVariables().get(i);
            RuntimeObject obj = (RuntimeObject)actualParam.get(var.getIdentifier());
            peekExpressionContext().defineVariable(var.getIdentifier(), obj);
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
    public Operation getOperation() {
        return null;
    }
    
    /** Return the expression that is linked to this call frame */
    public fr.irisa.triskell.kermeta.language.structure.Object getExpression() {
        return unit.getExpression();
    }
    
    public void setSelf(RuntimeObject pSelf) { selfObj = pSelf; }
    
    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.interpreter.CallFrame#getTypeParameters()
     */
    public Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type> getTypeParameters() {
       return new Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type>();
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
