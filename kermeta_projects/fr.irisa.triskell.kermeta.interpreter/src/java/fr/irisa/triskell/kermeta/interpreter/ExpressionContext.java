/* $Id: ExpressionContext.java,v 1.12 2006-03-03 15:21:47 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : ExpressionContext.java
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

import java.util.Hashtable;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * This is the context associated to a block inside the definition of an operation
 * A block is a set of instructions, or an IF or WHILE instruction. It is a entity of
 * the stack of blocks (block_stack) of a CallFrame.
 * It contains a hashtable of variables which is filled as soon as a declaration of variable occurs
 * inside a block.
 */
public class ExpressionContext {

    /**
     * The expression associated to this context
     * Typically : a FLoop, FConditional, and one for the FOperationBody if any var.
     * is declared inside it and at the top level. */ 
    //Expression root;

    /**
     * The set of variables defined in this block
     * key : the name of the variable (String)
     * value : the variable itself (Variable) */
    protected Hashtable variables;
    
    
    /** @deprecated */
    public Expression expression;
    /** The last evaluated statement in the interpretation process.
     *  Used to interrupt the stepOver command in the debug mode after each
     *  statement evaluation. */
    protected EObject statement;
	/**
	 * Constructor 
	 * @param root
	 * @param variables
	 */
	public ExpressionContext(/*Expression pRoot*/)
	{
	 //   root = pRoot;
	    variables = new Hashtable();
	}
	
	/** 
	 * Add a new variable, from its type, name and initial value, in the context.
	 * This variable comes either from a VarDecl or a parameter definition of an FOperation
	 * - operation op(var : varType) : ...
	 * - var : varType
	 * @param type the type of the variable to define as new in the expr. context
	 * @param name name of the variable
	 * @param init the initial value of this variable
	 * @return the RuntimeObject that was added as the value of this variable
	 */
	public Variable defineVariable(String name, RuntimeObject init)
	{
	    Variable var = new Variable(name, init);
		variables.put(name, var);
		return var;
	    
	}
	
	public void addVariables(Hashtable vars) {
	    variables.putAll(vars);
	}
	
	/**
	 * Clone the Hastable but copy variables
	 */
    public ExpressionContext copy() {
        ExpressionContext result = new ExpressionContext();
        result.variables.putAll(variables);
        return result;
    }
    
	/***
	 * Get the variable by its name in the variables hashtable
	 * @param name
	 * @return the Variable corresponding to name
	 */
	public Variable getVariableByName(String name)
	{
	        return (Variable)variables.get(name);
	}
	/**
	 * Return true if the expression context has a variable
	 * named name.
	 * @param name
	 * @return
	 */
	public boolean hasVariableByName(String name)
	{
	        return variables.containsKey(name);
	}

    /*
     * 
     * A C C E S S O R S
     * 
     *
     */
    
    public Hashtable getVariables() {
        return variables;
    }

    /**
     * Set the expression associated to this context
     * Useful for the debug mode
     * @param exp
     */
    public void setExpression(Expression exp)
    {
    	expression = exp;
    }

	public Expression getExpression() {
		return expression;
	}
    
    public void setStatement(EObject p_statement) {
    	statement = p_statement;
    }
    
    public EObject getStatement() { return statement; }
}
