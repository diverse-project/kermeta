/* $Id: ExpressionContext.java,v 1.1 2005-03-21 08:48:42 zdrey Exp $
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

import fr.irisa.triskell.kermeta.behavior.FVariableDecl;
import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.runtime.factory.KermetaObjectFactory;

/**
 * The context associated to an Expression (usually, an instruction at the lowest level, or a block,
 * or a class). The former name was "ExpressionContext", but using a lower level title seemed clearer...
 */
public class ExpressionContext {
    
       
	// The first expression associated to this context
	KermetaObject root;

	// The set of variable defined in this block
	// key : the name of the variable (String)
	// value : the variable itself (Variable)
	Hashtable variables ;
	
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
	public ExpressionContext(KermetaObject pRoot, Hashtable pVariables)
	{
	    root = pRoot;
	    variables = pVariables;
	}
	
	
	/** 
	 * Add a new variable, from its declaration, in the context
	 * Copy-try from ff. Did not understand -
	 * FVariableDecl is "var toto" in kermeta 
	 * @param declaration the variable declaration of the variable, to add in the context
	 * @return the KermetaObject that was added as the value of this variable
	 */
	public Variable defineVariable(FVariableDecl declaration)
	{
		Variable var = new Variable();
		
		// FIXME : create an intermediate class "Variable" like in kmt implementation?
		variables.put(((FVariableDecl)declaration).getFIdentifier(), var);
		return var;
	}
	
	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setVariable(String name, KermetaObject object)
	{
		//KermetaObject result = declaration.getFactory().createClassFromClassDefinition(type_def);
		Variable var = new Variable();
		var.setName(name);
		var.setKermetaObject(object);
		
		if (variables.containsKey(name))
		{
		    variables.put(name, var);
		}
		/*else
		{
		    System.err.println("Interpreter Error : "+ could not add variable : not declared);
		}*/
		//return result;
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
	
	/*
	 * 
	 * A C C E S S O R S
	 * 
	 *
	 */
	public void setRoot(KermetaObject pRoot)
	{
	    root = pRoot;
	}
	
	public Hashtable getVariables()
	{
	    return variables;
	}

}
