/* $Id: OperationCallFrame.java,v 1.1 2005-05-16 17:39:08 ffleurey Exp $
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
import java.util.Iterator;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;

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
    
    /**
     * @param pSelf
     * @param pContext
     * @param pOperation
     * @param pParameters
     */
    public OperationCallFrame(InterpreterContext pContext, FOperation pOperation, RuntimeObject pSelf,  ArrayList pParameters) {
        super(pContext);
        this.operation = pOperation;
        this.self = pSelf;
        
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
}
