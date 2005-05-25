/* $Id: OperationCallFrame.java,v 1.3 2005-05-25 17:42:51 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : OperationCallFrame.java
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

import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.TypeVariableEnforcer;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class OperationCallFrame extends CallFrame {

    /** the FOPeration related to this call frame*/
    private FOperation operation;
    
    /**
     * self object (inside which the operation call is done)
     */
    private RuntimeObject self;

    /**
     * the operation result of the operation linked to this CallFrame
     */
    private RuntimeObject operationResult;
    
    private Hashtable typeParameters;
    
    /**
     * @param pSelf
     * @param pContext
     * @param pOperation
     * @param pParameters
     */
    public OperationCallFrame(InterpreterContext pContext, CallableOperation pOperation, RuntimeObject pSelf,  ArrayList pParameters, FCallExpression expression) {
        super(pContext);
        this.operation = pOperation.getOperation();
        this.self = pSelf;
        
        typeParameters = TypeVariableEnforcer.getTypeVariableBinding(pOperation.getFclass());
        
        if (operation.getFTypeParameter().size() > 0) {
	        //just for robustness
	        if (expression == null || operation.getFTypeParameter().size() != expression.getFStaticTypeVariableBindings().size()) {
	            throw new Error("INTERNAL ERROR : the type parameters of the operation should have been bound by the type checker.");
	        }
	        
	         for(int i=0; i<operation.getFTypeParameter().size(); i++) {
	            typeParameters.put(operation.getFTypeParameter().get(i), TypeVariableEnforcer.getBoundType((FType)expression.getFStaticTypeVariableBindings().get(i), pContext.peekCallFrame().getTypeParameters()));
	        }
        }
        
        initialize(pParameters);
       
    }
    
    protected void initialize(ArrayList pParameters) {
        pushExpressionContext();
        Iterator it = operation.getFOwnedParameter().iterator();
        int i=0;
        while (it.hasNext()) {
            FParameter fparam = (FParameter)it.next();
            peekExpressionContext().defineVariable(fparam.getFName(), (RuntimeObject)pParameters.get(i));
            i++;
        }
    }
    
    public String toString() {
        return self.toString() + "." + operation.getFName();
    }
    
    public FOperation getOperation() {
        return operation;
    }

    public RuntimeObject getOperationResult() {
        return operationResult;
    }
    
    public void setOperationResult(RuntimeObject operationResult) {
        this.operationResult = operationResult;
    }
    
    public RuntimeObject getSelf() {
        return self;
    }
    
    public Hashtable getTypeParameters() {
        return typeParameters;
    }
}
