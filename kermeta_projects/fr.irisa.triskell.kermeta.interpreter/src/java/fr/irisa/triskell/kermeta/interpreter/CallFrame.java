/* $Id: CallFrame.java,v 1.1 2005-03-22 12:56:08 zdrey Exp $
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
import java.util.Stack;

import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * CallFrame is the context for an operation call
 */
public class CallFrame {
    
    /** the interpreter global context */
    InterpreterContext context;
    /** self object (inside which the operation call is done) */
    RuntimeObject self;
    /** the operation result of the operation linked to this CallFrame */
    RuntimeObject operation_result;
    /** the current expression context block_stack.peek() */
    ExpressionContext current_context;
    /** the list of variables for the operation associated with this CallFrame (RuntimeObjects)*/
    ArrayList parameters ;
    /** the list of expression contexts that are linked to this frame (@see ExpressionContext class javadoc)*/
    Stack block_stack = new Stack();
    
    /**
     * Constructor
     * Initially, we only have the global context and self object
     */
    public CallFrame( RuntimeObject pSelf, InterpreterContext pContext)
    {
        self = pSelf;
        context = pContext;
    }
    
    /**
     * Push a new expression Context. We do it whenever we encounter a new block (do..end)
     * @param root the first element that is "at the origin" of the creation of the block stack
     */
    public void pushNewExpressionContext(FExpression root)
    {   
        // Create a new block stack and set its attributes (root, variable stack)
        // Add the root expression to it
        ExpressionContext expression_context = new ExpressionContext(root, new Hashtable());
        block_stack.push(expression_context);
        
        
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
    public InterpreterContext getContext()
    {
        return context;
    }
    
    public Stack getBlockStack()
    {
        return block_stack;
    }
    
    public ExpressionContext getCurrentExpressionContext()
    {
        return (ExpressionContext)block_stack.peek();
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
     */
    public RuntimeObject getSelf() {
        return self;
    }
    /**
     * @param self The self to set.
     */
    public void setSelf(RuntimeObject self) {
        this.self = self;
    }
    
    
    /**
     * @return Returns the parameters.
     */
    public ArrayList getParameters() {
        return parameters;
    }
    /**
     * @param parameters The parameters to set.
     */
    public void setParameters(ArrayList parameters) {
        this.parameters = parameters;
    }
}
