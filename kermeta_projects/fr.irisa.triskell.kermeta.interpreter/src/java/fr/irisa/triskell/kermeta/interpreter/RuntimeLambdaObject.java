/* $Id: RuntimeLambdaObject.java,v 1.3 2005-05-10 17:29:48 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: RuntimeLambdaObject.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: Apr 21, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.behavior.FLambdaExpression;
import fr.irisa.triskell.kermeta.behavior.FLambdaParameter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FType;

/**
 * A special RuntimeObject for LambdaExpressions :
 * it is a RuntimeObject that contains an internal context, stored in a hashtable.
 */
public class RuntimeLambdaObject extends RuntimeObject {
    
    /** 
     * The parameters of the lambda expression linked to this runtime object
     * key -> the name of the parameter
     * value -> the variable representation of this parameter
     * */
    protected Hashtable lambdaParameters;
    protected FLambdaExpression lambdaExpression;

    /**
     * Constructor
     * @param factory
     * @param FLambdaExpression : the lambda expression represented by this runtime
     * lambda object. We need it as the body is only evaluated "after"
     */
    public RuntimeLambdaObject(RuntimeObjectFactory factory, FLambdaExpression node) {
        super(factory, null);
        
        this.metaclass = factory.getTypeDefinitionByName("kermeta::language::behavior::LambdaExpression");
        this.lambdaExpression = node;
        this.factory = factory;
        this.lambdaParameters = new Hashtable();
    }
    
    /**
     * The lambda parameters of this lambda expression.
     * We assign each parameter to the value of the parameters inside a lambdaexpression' call.
     * (This operation is called when encountering a lambda expression call)
     * @param params
     */
    public void setLambdaParameters(ArrayList rparams)
    {
        EList fparams = lambdaExpression.getFParameters();
        for (int i=0; i<fparams.size(); i++)
        {   
            String key = ((FLambdaParameter)fparams.get(i)).getFName();
            this.bindLambdaParameter(key, (RuntimeObject)rparams.get(i));
        }
    }
    
    /**
     * Define the hashtable : each found parameter is put in the hashtable,
     * with a null value. 
     * This method is called when encountering a lambda expression definition.
     * @param params
     */
    public void defineLambdaParameters(EList params)
    {
        for (int i = 0; i< params.size(); i++)
        {
            // Get the type of param, its identifier
            // ->RuntimeObject called_param = (RuntimeObject)it.next();
	        FLambdaParameter p = (FLambdaParameter)params.get(i);
	        this.defineLambdaParameter(p.getFType().getFType(), p.getFName(), null);
        }
    }
    
    public Hashtable getLambdaParameters()
    {
        return lambdaParameters;
    }
    
	/** 
	 * Add a new variable, from its type, name and initial value, in the context.
	 * This variable (called also "lambdaParameter") comes either from a VarDecl or a parameter definition of an FOperation
	 * - lf := function { var : varType | ... }
	 * - op { var : varType | ... }
	 * @param type the type of the variable to define as new in the expr. context
	 * @param name name of the variable
	 * @param init the initial value of this variable
	 * @return the RuntimeObject that was added as the value of this variable
	 */
	public Variable defineLambdaParameter(FType type, String name, RuntimeObject init)
	{
	    Variable var = new Variable();
	    var.setType(type);
	    if (init!=null)
	        var.setRuntimeObject(init);
		lambdaParameters.put(name, var);
		return var;
	}
	
	/**
	 * This operation is for a LambdaExpression internal context what the operation 
	 * setVariable() is for an ExpressionContext.
	 * This operation is called when calling a lambda expresssion
	 */
	public void bindLambdaParameter(String name, RuntimeObject object)
	{
		if (lambdaParameters.containsKey(name))
		{
			Variable var = (Variable)lambdaParameters.get(name);
			var.setRuntimeObject(object);
		}
		else
		{ // fixme : use log4j
		    System.err.println("Interpreter Error : could not set var '"+name+"' : " +
		    		"undeclared in lambdaExpression internal context");
		}
	}
	
	

    /**
     * @return Returns the lambdaExpression.
     */
    public FLambdaExpression getLambdaExpression() {
        return lambdaExpression;
    }
    /**
     * @param lambdaExpression The lambdaExpression to set.
     */
    public void setLambdaExpression(FLambdaExpression lambdaExpression) {
        this.lambdaExpression = lambdaExpression;
    }
}
