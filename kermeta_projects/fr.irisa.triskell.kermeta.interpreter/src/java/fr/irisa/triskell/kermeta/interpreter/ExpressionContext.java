/* $Id: ExpressionContext.java,v 1.4 2005-03-30 16:32:31 jpthibau Exp $
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
     * 
     * @uml.property name="root"
     * @uml.associationEnd multiplicity="(0 1)"
     */
    // The expression associated to this context
    // Typically : a FLoop, FConditional, and one for the FOperationBody if any var.
    // is declared inside it and at the top level. 
    FExpression root; // should be a RuntimeObject?

    /**
     * 
     * @uml.property name="variables"
     * @uml.associationEnd qualifier="name:java.lang.String fr.irisa.triskell.kermeta.interpreter.Variable"
     * multiplicity="(0 1)"
     */
    // The set of variable defined in this block
    // key : the name of the variable (String)
    // value : the variable itself (Variable)
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
	 * Copy-try from ff. Did not understand -
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
	 * Add a new variable, from its declaration, in the context
	 * Copy-try from ff. Did not understand -
	 * FVariableDecl is "var toto" in kermeta 
	 * @param declaration the variable declaration of the variable, to add in the context
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
	 * 
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

    /**
     * 
     * @uml.property name="root"
     */
    /*
     * 
     * A C C E S S O R S
     * 
     *
     */
    public void setRoot(FExpression pRoot) {
        root = pRoot;
    }

    /**
     * 
     * @uml.property name="variables"
     */
    public Hashtable getVariables() {
        return variables;
    }

}
