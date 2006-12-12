/* $Id: OperationCallFrame.java,v 1.13 2006-12-12 12:14:19 dvojtise Exp $
* Project : Kermeta Interpreter
* File : OperationCallFrame.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 16 mai 2005
* Authors : 
* 		Franck Fleurey
* 		Zo� Drey
* 		Didier Vojtisek
* 		Jim Steel
*/ 

package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
//import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.CallableElement;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.TypeVariableEnforcer;

/**
 * @author Franck Fleurey
 * Call frame associated to an operation call. Used in the call stack in the interpreter
 */
public class OperationCallFrame extends CallFrame {

    /** the FOPeration related to this call frame*/
    private Operation operation;
    /** OR the Property derived */
    private Property property;
    
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
    
    private CallExpression expression;
    
    /**
     * @param pSelf
     * @param pContext
     * @param pOperation
     * @param pParameters
     */
    public OperationCallFrame(InterpreterContext pContext, CallableElement pCallable, RuntimeObject pSelf,  ArrayList pParameters, CallExpression expression) {
        super(pContext);
        if (pCallable instanceof CallableOperation)
        {
        	bIsOperation = true;
            this.operation = ((CallableOperation)pCallable).getOperation();
            this.expression = expression;
            typeParameters = TypeVariableEnforcer.getTypeVariableBinding(((CallableOperation)pCallable).getFclass());
            
            if (operation.getTypeParameter().size() > 0) {
    	        //just for robustness
    	        if (expression == null || operation.getTypeParameter().size() != expression.getStaticTypeVariableBindings().size()) {
    	            throw new Error("INTERNAL ERROR : the type parameters of the operation should have been bound by the type checker.");
    	        }
    	        
    	         for(int i=0; i<operation.getTypeParameter().size(); i++) {
    	        	Type typeToBeBound = (Type)expression.getStaticTypeVariableBindings().get(i);
    	        	Type enforcedType = TypeVariableEnforcer.getBoundType(typeToBeBound, pContext.peekCallFrame().getTypeParameters());
    	        	typeParameters.put(operation.getTypeParameter().get(i), enforcedType); 
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
        Iterator it = operation.getOwnedParameter().iterator();
        int i=0;
        while (it.hasNext()) {
            Parameter fparam = (Parameter)it.next();
            peekExpressionContext().defineVariable(fparam.getName(), (RuntimeObject)pParameters.get(i));
            i++;
        }
    }
    
    public String toString() {
        String name = "";
        if (operation != null) name = operation.getName();
        else				   name = property.getName();
        return self.toString() + "." + name;
    }
    
    public Operation getOperation() {
        if (operation == null) throw new Error("Illegal call of operation");
        return operation;
    }
    public Property getProperty() {
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
    
    
    public fr.irisa.triskell.kermeta.language.structure.Object getExpression() {
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
