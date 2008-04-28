/* $Id: CallFrame.java,v 1.23 2008-04-28 11:50:55 ftanguy Exp $
 * Project : Kermeta (First iteration)
 * File : CallFrame.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 16, 2005
 * Author : zdrey
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

/**
 * CallFrame is the context for an operation call
 */
public abstract class CallFrame {

    /**
     * the interpreter global context
     */
    protected InterpreterContext context;

    /**
     * the list of expression contexts that are linked to this frame (@see ExpressionContext class javadoc)
     */
    protected Stack<ExpressionContext> block_stack;

    
    /**
     * Constructor
     * Initially, we only have the global context and self object
     * pParameters should be a list of RuntimeObject corresponding to the
     * actual parameters.
     */
    public CallFrame( InterpreterContext pContext )
    {
        context = pContext;
        block_stack = new Stack<ExpressionContext>();
        
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
    	if (block_stack.isEmpty()) return null;
    	else return block_stack.peek();
    }
    
    /**
     * pop an expression context
     *
     */
    public void popExpressionContext() {
    	if ( ! block_stack.isEmpty() )
    		block_stack.pop();
    }
    
    public Variable getVariableByName(String name) {
        Variable result = null;
        for (int i=block_stack.size()-1; i>=0; i--) {
            result = block_stack.get(i).getVariableByName(name);
            if (result != null) return result;
        }
        result = context.getInterpreterVariableByName(name);
        return result;
    }

    /** Return the visible variables in this CallFrame */
    public List<Variable> getVariables() {
        List<Variable> result = new ArrayList<Variable>(); 
        for (int i=block_stack.size()-1; i>=0; i--) {
            result.addAll(block_stack.get(i).getVariables().values());
        }
        //result.put("self", getSelf());
        result.addAll(context.getInterpreterVariables().values());
        return result;
    }
    
    /**
     * Helper method
     * @return true if the frame contains variables, false otherwise
     */
    public boolean hasVariables()
    {
    	return (!getVariables().isEmpty());
    }
    /*
     * 
     * A C C E S S O R S 
     *
     */

    public InterpreterContext getContext() {
        return context;
    }
    
    public Stack<ExpressionContext> getExpressionContext() {
    	return block_stack;
    }
    
    public abstract RuntimeObject getOperationResult();
    public abstract RuntimeObject getCallValueResult();
    
    public abstract void setOperationResult(RuntimeObject operationResult);
    public abstract void setCallValueResult(RuntimeObject callValuResult);
    
    public abstract RuntimeObject getSelf();
    public abstract void setSelf(RuntimeObject self);    
    public abstract Operation getOperation();
    
    public abstract Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type> getTypeParameters();

    /**
     * @return the called expression to which is associated this CallFrame 
     */
    public abstract fr.irisa.triskell.kermeta.language.structure.Object getExpression();
    
}
