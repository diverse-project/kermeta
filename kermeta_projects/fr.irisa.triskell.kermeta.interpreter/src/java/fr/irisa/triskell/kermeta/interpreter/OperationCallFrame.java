/* $Id: OperationCallFrame.java,v 1.10 2005-12-12 13:03:00 dvojtise Exp $
* Project : Kermeta Interpreter
* File : OperationCallFrame.java
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

import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.typechecker.CallableElement;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.TypeVariableEnforcer;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class OperationCallFrame extends CallFrame {

    /** the FOPeration related to this call frame*/
    private FOperation operation;
    /** OR the FProperty derived */
    private FProperty property;
    
    /** tells wether this OperationCallFrame is for a callable operation or for a property (ie. setter or getter) */
    private boolean bIsOperation;
    
    /**
     * self object (inside which the operation call is done)
     */
    private RuntimeObject self;

    /**
     * the operation result of the operation linked to this CallFrame
     */
    private RuntimeObject operationResult;
    
    private Hashtable typeParameters;
    /** the value of the "value" variable in the setter of the derived property */
    private RuntimeObject callValueResult;
    
    private FCallExpression expression;
    
    /**
     * @param pSelf
     * @param pContext
     * @param pOperation
     * @param pParameters
     */
    public OperationCallFrame(InterpreterContext pContext, CallableElement pCallable, RuntimeObject pSelf,  ArrayList pParameters, FCallExpression expression) {
        super(pContext);
        if (pCallable instanceof CallableOperation)
        {
        	bIsOperation = true;
            this.operation = ((CallableOperation)pCallable).getOperation();
            this.expression = expression;
            typeParameters = TypeVariableEnforcer.getTypeVariableBinding(((CallableOperation)pCallable).getFclass());
            
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
        else
        {
        	bIsOperation = false;
            this.property = ((CallableProperty)pCallable).getProperty();
        }
        
        this.self = pSelf;
        operationResult = pSelf.getFactory().getMemory().voidINSTANCE;
        
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
        String name = "";
        if (operation != null) name = operation.getFName();
        else				   name = property.getFName();
        return self.toString() + "." + name;
    }
    
    public FOperation getOperation() {
        if (operation == null) throw new Error("Illegal call of operation");
        return operation;
    }
    public FProperty getProperty() {
        if (property == null) throw new Error("INTERNAL INTERPRETER ERROR : Illegal call of property accessor in OperationCallFrame");
        return property;
    }

    public RuntimeObject getOperationResult() {
        return operationResult;
    }
    public RuntimeObject getCallValueResult() {
        return callValueResult;
    }
    
    public void setOperationResult(RuntimeObject operationResult) {
        this.operationResult = operationResult;
    }
    
    public void setCallValueResult(RuntimeObject callValueResult) {
        this.callValueResult = callValueResult;
    }
    
    public RuntimeObject getSelf() {
        return self;
    }
    
    // Special for derived property getter
    public void setSelf(RuntimeObject pSelf) {
        self = pSelf;
    }
    
    public Hashtable getTypeParameters() {
        return typeParameters;
    }
    
    
    public FObject getExpression() {
        return expression; 
    }

	/**
	 * @return Returns true is this is a callable operation. false if this is a setter or getter of a property
	 */
	public boolean isOperation() {
		return bIsOperation;
	}
	
	/**
	 * @return Returns true is this is a setter or getter of a property. false if this is a callable operation 
	 */
	public boolean isPropertyAccessor() {
		return !bIsOperation;
	}
}
