/* $Id: CallFrame.java,v 1.6 2005-05-13 15:05:29 ffleurey Exp $
 * Project : Kermeta (First iteration)
 * File : CallFrame.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 16, 2005
 * Author : zdrey
 * Description : describe here file content
 * TODO : 
 * 	- write here your TODO actions
 *  - ...
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Stack;

import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Void;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;

/**
 * CallFrame is the context for an operation call
 */
public class CallFrame {

    /**
     * the interpreter global context
     */
    private InterpreterContext context;

    /**
     * self object (inside which the operation call is done)
     */
    private RuntimeObject self;

    /**
     * the operation result of the operation linked to this CallFrame
     */
    private RuntimeObject operation_result;

    /**
     * the list of expression contexts that are linked to this frame (@see ExpressionContext class javadoc)
     */
    private Stack block_stack;

    /** the FOPeration related to this call frame*/
    private FOperation operation;
    
    /**
     * Constructor
     * Initially, we only have the global context and self object
     * pParameters should be a list of RuntimeObject corresponding to the
     * actual parameters.
     */
    public CallFrame( RuntimeObject pSelf, InterpreterContext pContext, FOperation pOperation, ArrayList pParameters )
    {
        self = pSelf;
        context = pContext;
        operation = pOperation;
        operation_result = pSelf.getFactory().getMemory().voidINSTANCE ;
        block_stack = new Stack();
        
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
    
    public Variable getVariableByName(String name) {
        Variable result = null;
        for (int i=block_stack.size()-1; i>=0; i--) {
            result = ((ExpressionContext)block_stack.get(i)).getVariableByName(name);
            if (result != null) return result;
        }
        result = context.getInterpreterVariableByName(name);
        return result;
    }
    
    /**
     * Push a new expression Context. We do it whenever we encounter a new block (do..end)
     * @param root the first element that is "at the origin" of the creation of the block stack
     */
    public void pushExpressionContext()
    {   
        block_stack.push(new ExpressionContext());
    }
    
    public ExpressionContext peekExpressionContext()
    {
        return (ExpressionContext)block_stack.peek();
    }
    
    /**
     * pop an expression context
     *
     */
    public void popExpressionContext()
    {
        block_stack.pop();
    }

    /*
     * 
     * A C C E S S O R S 
     *
     */

    /**
     * @return the context of interpreter
     */
    public InterpreterContext getContext() {
        return context;
    }


   
    
    public RuntimeObject getOperationResult()
    {
        return operation_result;
    }
    
    public void setOperationResult(RuntimeObject pResult)
    {
        operation_result = pResult;
    }

    /**
     * @return Returns the self.
     * 
     * @uml.property name="self"
     */
    public RuntimeObject getSelf() {
        return self;
    }

    /**
     * @return Returns the operation.
     */
    public FOperation getOperation() {
        return operation;
    }

}
