/* $Id: CallFrame.java,v 1.2 2005-03-25 16:44:35 zdrey Exp $
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

    /**
     * the interpreter global context
     * 
     * @uml.property name="context"
     * @uml.associationEnd inverse="frame_stack:fr.irisa.triskell.kermeta.interpreter.InterpreterContext"
     * multiplicity="(1 1)"
     */
    InterpreterContext context;

    /**
     * self object (inside which the operation call is done)
     * 
     * @uml.property name="self"
     * @uml.associationEnd qualifier="constant:java.lang.String java.util.ArrayList" multiplicity=
     * "(0 1)"
     */
    RuntimeObject self;

    /**
     * the operation result of the operation linked to this CallFrame
     * 
     * @uml.property name="operation_result"
     * @uml.associationEnd multiplicity="(0 1)"
     */
    RuntimeObject operation_result;

    /**
     * the current expression context block_stack.peek()
     * 
     * @uml.property name="current_context"
     * @uml.associationEnd multiplicity="(0 1)"
     */
    ExpressionContext current_context;

    /**
     * the list of variables for the operation associated with this CallFrame (RuntimeObjects)
     * 
     * @uml.property name="parameters"
     * @uml.associationEnd elementType="fr.irisa.triskell.kermeta.runtime.RuntimeObject"
     * multiplicity="(0 -1)"
     */
    ArrayList parameters;

    /**
     * the list of expression contexts that are linked to this frame (@see ExpressionContext class javadoc)
     * 
     * @uml.property name="block_stack"
     * @uml.associationEnd elementType="fr.irisa.triskell.kermeta.interpreter.ExpressionContext"
     * multiplicity="(0 -1)"
     */
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
     * 
     * @uml.property name="context"
     */
    public InterpreterContext getContext() {
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
     * 
     * @uml.property name="self"
     */
    public RuntimeObject getSelf() {
        return self;
    }

    /**
     * @param self The self to set.
     * 
     * @uml.property name="self"
     */
    public void setSelf(RuntimeObject self) {
        this.self = self;
    }

    /**
     * @return Returns the parameters.
     * 
     * @uml.property name="parameters"
     */
    public ArrayList getParameters() {
        return parameters;
    }

    /**
     * @param parameters The parameters to set.
     * 
     * @uml.property name="parameters"
     */
    public void setParameters(ArrayList parameters) {
        this.parameters = parameters;
    }

}
