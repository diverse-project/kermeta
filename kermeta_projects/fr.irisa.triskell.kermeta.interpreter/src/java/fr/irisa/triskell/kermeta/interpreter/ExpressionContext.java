/* $Id: ExpressionContext.java,v 1.6 2005-04-22 17:16:59 zdrey Exp $
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

import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.behavior.FVariableDecl;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FType;

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
    FExpression root;

    /**
     * The set of variables defined in this block
     * key : the name of the variable (String)
     * value : the variable itself (Variable) */
    Hashtable variables;

	
	/**
	 * Constructor 
	 * @param pRoot
	 */
	public ExpressionContext()
	{
	    variables = new Hashtable();
	//    this.defineVariable(root);
	}
	
	/**
	 * Constructor 
	 * @param root
	 * @param variables
	 */
	public ExpressionContext(FExpression pRoot, Hashtable pVariables)
	{
	    root = pRoot;
	    variables = pVariables;
	}
	
	
	/**
	 * @deprecated 
	 * Add a new variable, from its declaration, in the context
	 * Copy-try from ff.
	 * FVariableDecl is "var toto" in kermeta 
	 * @param declaration the variable declaration of the variable, to add in the context
	 * @return the RuntimeObject that was added as the value of this variable
	 */
	public Variable defineVariable(FVariableDecl declaration)
	{
		Variable var = new Variable();
		
		variables.put(((FVariableDecl)declaration).getFIdentifier(), var);
		return var;
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
	public Variable defineVariable(FType type, String name, RuntimeObject init)
	{
	    Variable var = new Variable();
	    var.setType(type);
	    if (init!=null)
	        var.setRuntimeObject(init);
		variables.put(name, var);
		return var;
	    
	}
	
	/**
	 * Setter for the hashtable <code>variables</code>. Do not clear the current
	 * content of variables, but overwrites the entries if there is conflict keys.
	 * @param variables
	 */
	public void setVariables(Hashtable p_variables)
	{	    
	    variables.putAll(p_variables);
	}
	
	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setVariable(String name, RuntimeObject object)
	{
		if (variables.containsKey(name))
		{
			Variable var = (Variable)variables.get(name);
			var.setRuntimeObject(object);
		}
		else
		{
		    System.err.println("Interpreter Error : could not set the undeclared variable "+name);
		}
	}
	
	/***
	 * Get the variable by its name in the variables hashtable
	 * @param name
	 * @return the Variable corresponding to name
	 */
	public Variable getVariable(String name)
	{
	    Variable result = null;
	    if (variables.containsKey(name))
	        result = (Variable)variables.get(name);
	    return result;
	}

    /*
     * 
     * A C C E S S O R S
     * 
     *
     */
    public void setRoot(FExpression pRoot) {
        root = pRoot;
    }
    
    public Hashtable getVariables() {
        return variables;
    }

}
