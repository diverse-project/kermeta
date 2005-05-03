/* $Id: BaseInterpreter.java,v 1.30 2005-05-03 18:23:54 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : BaseInterpreter.java
 * License : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Authors : 
 * 		zdrey 		<zdrey@irisa.fr>
 * 		jpthibau	<jpthibau@irisa.fr>
 * 		dvojtise	<dvojtise@irisa.fr>
 * Description :  	
 * 	see class javadoc.	 
 */
package fr.irisa.triskell.kermeta.interpreter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;



import fr.irisa.triskell.kermeta.ast.FSelfCall;
import fr.irisa.triskell.kermeta.behavior.*;
import fr.irisa.triskell.kermeta.builder.KMBuilderPass1;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.error.KermetaVisitorError;
import fr.irisa.triskell.kermeta.structure.*;

import fr.irisa.triskell.kermeta.launcher.Run;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass;
import fr.irisa.triskell.kermeta.parser.SimpleKWList;
import fr.irisa.triskell.kermeta.reflect.KMReflect;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection;
import fr.irisa.triskell.kermeta.structure.FClass;

import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * This is the Java version of kermeta interpreter. It extends the KermetaVisitor, and each
 * visit returns a result of type <code>RuntimeObject</code>.
 */
public class BaseInterpreter extends KermetaVisitor {

    /** The global context */
    protected InterpreterContext interpreterContext;
    /** The lambda expression that is currently called */
    protected FLambdaExpression calledLambdaExpression;
    /** We visit a lambda expr in 2 cases :
     *   - when it is defined
     * 	 - when we call it
     * Not the same as FOperation, which is visited only when called are invoked
     * */
    protected boolean isLambdaExpressionCall = false;
    
    public InterpreterContext getInterpreterContext() {
    	return this.interpreterContext;
    }

    /**
     * The current ExpressionContext (entity in the CallFrame stack of contexts)
     */
    protected ExpressionContext currentContext;


    // Should we access the interpreter context defined in KMT?
    /**
     * The main unit
     */
    protected KermetaUnit unit;

    
    /**
     * Constructor
     * @param pContext
     * @param unit the main kermetaUnit ..
     */
    public BaseInterpreter(InterpreterContext pContext, KermetaUnit pUnit)
    {
        interpreterContext = pContext;
        unit = pUnit;
    }

    /**
     * 
     * @uml.property name="usings" multiplicity="(0 1)"
     */
    protected ArrayList usings = new ArrayList();

    /**
     * 
     * @uml.property name="imports" multiplicity="(0 1)"
     */
    protected ArrayList imports = new ArrayList();

	protected String root_pname;
	protected String current_pname;
	
	protected boolean typedef = false;
    private RuntimeObject current_runtimeLambdaObject;
	
	/***
	 * A variable declaration : when we encounter it, we add it to the expression context
	 * of the current frame
	 * @return
	 */
	public Object visit(FVariableDecl node)
	{
		/*RuntimeObject variable_decl = node.getFactory().getTypeDefinitionByName(
			    ((FVariableDecl)declaration).getFType().getFName()
				);
				*/
	    //RuntimeObject ko = factory.createRuntimeObject(node);
		RuntimeObject ro_init=null;
		// is it a classic case?
		// TODO : compare qualified names otherwise this test could be sometimes false
		if (FFunctionType.class.isInstance(node.getFType().getFType()))
		{
		    System.out.println("type : "+node.getFType().getFName());
		    internalLog.debug("Type of variable declaration : "+node.getFType().getFName());
		
		}
		if (node.getFInitialization()!=null)
		   ro_init = (RuntimeObject)this.accept(node.getFInitialization());
		
		interpreterContext.getCurrentFrame().getCurrentExpressionContext().defineVariable(
	            node.getFType().getFType(), node.getFIdentifier(), ro_init);
	    return null;
	}
	
	protected RuntimeObject getROProperty(RuntimeObject ro_target, FType t_target, String propertyName)
	{
	    RuntimeObject ro_property = null;
	    // Find the RuntimeObject corresponding to this fproperty in the Class of ro_target instance
	    RuntimeObject metaclass = ro_target.getMetaclass();
	    //Iterator it = (()metaclass.getData().get("CollectionArrayList"));
	    // Get the classdefinition in the table
	    RuntimeObject classdef = (RuntimeObject)Run.koFactory.getClassDefTable().get(
	            getQualifiedName(((FClass)t_target).getFClassDefinition()));
	    
	    RuntimeObject ro_attributes = (RuntimeObject)classdef.getProperties(
	    ).get("ownedAttribute");
	    // Get the RuntimeObject repr. of THE attribute which name is "propertyName"
	    ArrayList al_attributes = (ArrayList)ro_attributes.getData().get("CollectionArrayList");
	    Iterator it = al_attributes.iterator();
	    
	    while (it.hasNext() && ro_property == null)
	    {   
	        RuntimeObject attr = (RuntimeObject)it.next();
	        String attr_name = ((FProperty)attr.getData().get("kcoreObject")).getFName();
	        if (attr_name.equals(propertyName))
	        {
	            ro_property = attr;
	        }
	    }
	    return ro_property;
	}
	/**
	 * Assigns the targeted variable the value given by this node
	 * FValue. 
	 * FTarget := FValue // CallExpression := Expression
	 * CallExpression is extended by :
	 * 		CallVariable  
	 * 		CallFeature ( object.property )
	 * 		CallSuperOperation (super?)
	 * 		CallResult -> CallVariable
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FAssignement)
	 */
	public Object visit(FAssignement node) {
	    
		 //result = this.accept(node.getFTarget());
	    // if FTarget is a property we should process differently
	    // if it is a variable only
		 FExpression lhs = node.getFTarget();
		 String lhs_name = node.getFTarget().getFName();
		RuntimeObject ro_property = null; 
		 // TODO : lhs can also self
		RuntimeObject rhs_value = (RuntimeObject)this.accept(node.getFValue());
		
		// TODO : test if the variable is an "implicit" property : toto -> self.toto
		
		// create the variable that will be stored in the context
		// result_value can be of any kermeta type
		Hashtable variables = interpreterContext.getCurrentFrame().getCurrentExpressionContext().getVariables();
		
		//if (result_name.equals("result")) // if left side is the result
		if (FCallResult.class.isInstance(node.getFTarget()))
		{
		    interpreterContext.getCurrentFrame().setOperationResult(rhs_value);
		}
		// is it an object?
		// var toto : AnObject
		// toto previously declared
		// toto := 4, and toto in variables hashtables
		else if (FCallVariable.class.isInstance(node.getFTarget()))
		{
		    // update the variable value in the variable hashtable
		    ExpressionContext found_context = findVariableInContext(lhs_name);
		    if (found_context!=null)
		    {
		        found_context.setVariable(lhs_name, (RuntimeObject)rhs_value);
		    }
		    else
		    {
		        // TODO Throw properly an exception
		        System.err.println("Variable '"+lhs_name+"' seems to be undeclared");
		    }
		}
		// is it a callfeature? toto.
		// FIXME : attributes are not get properly
		else if (FCallFeature.class.isInstance(node.getFTarget()))
		{
		    // Visiting the callFeature should return the RuntimeObject
		    // From the runtimeObject, get its target
		    
		    RuntimeObject ro_target = null;
		    FType t_target = null;
		    // Get the RuntimeObject of FCallFeature
		    FCallFeature callfeature = (FCallFeature)node.getFTarget();
		    // Get the object on which this feature is applied
		    FExpression target = callfeature.getFTarget();
	    	String propertyName = callfeature.getFName();
	    	 
		    if (target==null)
		    {  	//self reference
		    	ro_target=interpreterContext.getCurrentFrame().getSelf();
		    }
		    // If target is not null, we need to get the corresponding runtime object
		    else
		    // can be a parameter of the current called operation
		    // can be an object already stored as a variable in the blockstacks
		    {
		        // the runtime object corresponding to this target
		       
		        ro_target = (RuntimeObject)this.accept(target);
		    }
		    // If the target object is not null, we can find its ro_attribute
		    // named "propertyName"
	        if (ro_target!=null) // && ro_target.getProperties().containsKey(propertyName))
	        {
	            
	            t_target=(FType)ro_target.getMetaclass().getData().get("kcoreObject");

	            // FIXME : FProperty is assumed to be the type of the feature
	            
	            // Find the RuntimeObject corresponding to this fproperty in the Class of ro_target instance
	            RuntimeObject metaclass = ro_target.getMetaclass();
	            //Iterator it = (()metaclass.getData().get("CollectionArrayList"));
	            // Get the classdefinition in the table
	            RuntimeObject classdef = (RuntimeObject)Run.koFactory.getClassDefTable().get(
	                    getQualifiedName(((FClass)t_target).getFClassDefinition()));
	            
	            RuntimeObject ro_attributes = (RuntimeObject)classdef.getProperties(
	                    ).get("ownedAttribute");
	            // Get the RuntimeObject repr. of THE attribute which name is "propertyName"
	            ArrayList al_attributes = (ArrayList)ro_attributes.getData().get("CollectionArrayList");
	            Iterator it = al_attributes.iterator();
	            
	            while (it.hasNext() && ro_property == null)
	            {   
	                RuntimeObject attr = (RuntimeObject)it.next();
	                String attr_name = ((FProperty)attr.getData().get("kcoreObject")).getFName();
	                if (attr_name.equals(propertyName))
	                {
	                    ro_property = attr;
	                }
	            }
	            
	            
	            // FIXME : ro_property must not be null
				// Set the value of the property
	            if (ro_property == null)
	            {
	                System.err.println("could not set property '"+propertyName+"' for object '"+lhs_name+"'");
	            }
	            else
	            fr.irisa.triskell.kermeta.runtime.language.Object.set(ro_target,ro_property,rhs_value);    
	        }
	        else
	        {
	            System.out.println("properties size :"+ro_target.getProperties().size());
	            Set keys = ro_target.getProperties().keySet();
	            Iterator it = keys.iterator();
	            while (it.hasNext())
	            {
	                System.out.print(it.next()+" ");
	            }
	            System.err.println("Could not assign attribute : target object not found :( : "+ro_target+
	                    "property not found is : "+propertyName);
	        }
	        
		    
		}
		
		return null;
	}
	
	/**
	 * Visit a lambda expression. We visit a lambda expression in two cases :
	 * - when we defined one and assigned it to a variable
	 * - when we call one  
	 */
	public Object visit(FLambdaExpression node)
	{   
	    RuntimeObject result = null;
	    	    
	    // Special visit for the body of a lambdaexp, only when we execute it!
	    // see CallFeature, principle is equivalent
	    if (isLambdaExpressionCall == true)
	    {
	        RuntimeObject ro = current_runtimeLambdaObject;
	        CallFrame current_frame =interpreterContext.getCurrentFrame(); 
	        //interpreterContext.pushNewCallFrame(ro_target);
	        // "push and fill" the internal context
	        current_frame.pushNewExpressionContext(node);
	        
	        current_frame.getCurrentExpressionContext().setVariables(
	                ((RuntimeLambdaObject)ro).getLambdaParameters());
	        
	        result = (RuntimeObject) this.visit(node.getFBody());

	        current_frame.popExpressionContext();
	    }
	    // We only visit the definition of a lambda expression
	    else
	    {
	        result = new RuntimeLambdaObject(Run.koFactory, node);
		    // Special handling for a lambda'exp parameters : 
		    // We don't need a runtimeObject for each of them
		    //ArrayList params = visitList(node.getFParameters());
		    ((RuntimeLambdaObject)result).defineLambdaParameters(node.getFParameters());
		    
	    }
	    
	    return result;
	}
	
	public Object visitLambdaBody(FExpression body)
	{
	    RuntimeObject result = null;
	    
	    return result;
	}
	
	/**
	 * The result node corresponds to the return value of the operation that is currently 
	 * processed.
	 * We also store it as a variable (for the moment)
	 */
	public Object visit(FCallResult node)
	{
	    RuntimeObject value = interpreterContext.getCurrentFrame().getOperationResult();
	    if (value==null)
	    	// TODO
	    	System.err.println("result not found in context");
	    return value;
	}
	
	/**
	 * If the visited element is a Variable, then we search its value in the 
	 * InterpreterContext
	 * */
	public Object visit(FCallVariable node)
	{
	    RuntimeObject result = null;
	    RuntimeObject variable_value = null;
	    ExpressionContext found_context = findVariableInContext(node.getFName());
	    
	    if (found_context!=null)
	        variable_value = found_context.getVariable(node.getFName()).getRuntimeObject();
	    else
	    	// TODO
	    	System.err.println("Var not declared");
	    
	    // If the variable contains parameters, i.e, if it is a LambdaExpression call
	    // then we have to assign the lambda params to the values defined in FParameters
	    // (bind parameters to the used values)
	    // FIXME : redundant condition
	    if (	RuntimeLambdaObject.class.isInstance(variable_value) ||
	            node.getFParameters().size() != 0)
	    {
	        ArrayList paramAList = visitList(node.getFParameters());
	        // TODO : typeChecking -> variable value and param must have the same type
	        
	        ((RuntimeLambdaObject)variable_value).setLambdaParameters(paramAList);
	        
	        // find in context the lambdaRuntimeObject corresponding .
	        calledLambdaExpression = ((RuntimeLambdaObject)variable_value).getLambdaExpression();
	        isLambdaExpressionCall = true; 
	        current_runtimeLambdaObject = variable_value;
	        result = (RuntimeObject) this.visit(calledLambdaExpression); // affect the RuntimeObject
	        isLambdaExpressionCall = false;
	        
	    }
	    else // not a lambda? so we don't need to evaluate it, we have the result already
	    {
	        result = variable_value;
	    }
	    
	    return result;
	}
	
	public Object visit(FSelfExpression node)
	{
	    return interpreterContext.getCurrentFrame().getSelf();
	}

	/**
	 * Evaluate the sequence of instructions in this block.
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBlock)
	 */
	public Object visit(FBlock node) {

	    // process the statements
	    visitList(node.getFStatement());
		// process the rescues
	    Iterator it;
		it = node.getFRescueBlock().iterator();
		while(it.hasNext()) {
			this.accept((FRescue)it.next());
		}
		return null;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visit(FClass node) {
	    return null;
	}
	
	/**
	 * Interprete the IF instruction
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FConditionnal)
	 */
	public Object visit(FConditionnal node) {
	    
	    // The result returned by the visit
	    RuntimeObject result = null;
	    
	    // ThenBody should be specified more precisely (as a FBlock?)
        EList then_block = ((FBlock)node.getFThenBody()).getFStatement();
        EList else_block = ((FBlock)node.getFElseBody()).getFStatement();
        FExpression cond = node.getFCondition();

        // Object should be a Boolean
        RuntimeObject cond_result = (RuntimeObject)this.accept(cond);
        boolean cond_value=true;
        
        // Get boolean value
        if (cond_result.getData().containsKey("BooleanValue"))
            cond_value = ((Boolean)cond_result.getData().get("BooleanValue")).booleanValue();
        else
        {
            // TODO : throw an InterpreterException 
        	System.err.println("Conditional : evaluation of the condition does not match Boolean type.");
        }
        
        // if cond is true
        if (cond_value == true)
        {   
    		if (node.getFThenBody() != null) 
    		    result = (RuntimeObject)this.accept(node.getFThenBody());
    		
        }
        else
        {   
            if (node.getFElseBody() != null) {
                result = (RuntimeObject)this.accept(node.getFElseBody());
            }
        }
		return result;
	}
		
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FLoop)
	 */
	public Object visit(FLoop node)
	{
        // Push a new expressionContext in the current CallFrame. 
        interpreterContext.getCurrentFrame().pushNewExpressionContext(node);
        // Accept initialization (a FVariableDecl) : add a new variable in the ExpressionContext
        this.accept(node.getFInitiatization());
        boolean cond_value=true;
        
	    do
	    {
	        RuntimeObject cond_result = (RuntimeObject)this.accept(node.getFStopCondition());
	        // Get boolean value
	        if (cond_result.getData().containsKey("BooleanValue"))
	            cond_value = ((Boolean)cond_result.getData().get("BooleanValue")).booleanValue();
	        else
	        {
	            // TODO : throw an InterpreterException 
	        	System.err.println("Loop : evaluation of the condition ^part does not result in a boolean value.");
	        }
	        
	        if (! cond_value)
	        	this.accept(node.getFBody());
	    } while (! cond_value);
	    
	    // Pop the expression context
	    interpreterContext.getCurrentFrame().popExpressionContext();
	    return null;
	}
	
	/**
	 * Visit an operation definition. 
	 * This visit usually follows the visit of a FCallFeature that is an operation call 
	 * This has the following steps :
	 * 	- Create an expression context for the variables defined at "top level" in this operation
	 *
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visit(FOperation node) {
	    // Push a new ExpressionContext. The root expression associated with this context : 
	    // a FCallFeature? ... -> accessible attribute of BaseInterpreter?
	    interpreterContext.getCurrentFrame().pushNewExpressionContext(null);
	    CallFrame current_frame = interpreterContext.getCurrentFrame();
	    Iterator it = current_frame.getParameters().iterator();
	    
	    // Resolve parameters with the values given in the call of this operation
	    // add them to the context
	    EList params = node.getFOwnedParameter();
	    int i = 0;
	    
	    while (it.hasNext())
	    {
	        RuntimeObject called_param = (RuntimeObject)it.next();
	        FParameter p = (FParameter)params.get(i);
	        // Define a context variable
	        // PATCH? FParameter to VariableDeclaration
	        current_frame.getCurrentExpressionContext().defineVariable(
	                p.getFType(), p.getFName(), called_param);
	        i+=1;
	    }
	    this.accept(node.getFBody());
	    // Visit raised Exception if any
//	    visitList(node.getFRaisedException());
	    // If operation returns something that is not VOID, return it?
	    RuntimeObject result = interpreterContext.getCurrentFrame().getOperationResult();
	    // Pop the expressionContext
	    interpreterContext.getCurrentFrame().popExpressionContext();
		return result;
	}
	
	
	
    /**
     * Visit a FProperty and return the runtime object corresponding to it
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FProperty)
     */
    public Object visit(FProperty node)
    {
     //   return super.visit(arg0);
        return null;
    }
	/**
	 * Invoke the foperation argument on the ro_target Runtime Object;
	 *  arguments to this call are given as an ArrayList
	 * @param ro_target
	 * @param foperation
	 * @param arguments
	 * @return
	 */
	public Object invoke(RuntimeObject ro_target,FOperation foperation,ArrayList arguments) {
		RuntimeObject result=null;
        // Create a context for this operation call, setting self object to ro_target
        interpreterContext.pushNewCallFrame(ro_target);
        interpreterContext.getCurrentFrame().setParameters(arguments);
    	    
        //memorize self object
        interpreterContext.getCurrentFrame().setSelf(ro_target);

        // Resolve this operation call
        result = (RuntimeObject)this.accept(foperation);
        
        // After operation has been evaluated, pop its context
        interpreterContext.getFrameStack().pop();
		return result;
	}

	
	
	public Object visit(FCallFeature node) {
	    boolean isFeatured = false;
	    FExpression target = node.getFTarget();
	    FType t_target = null; // Type of the "callee"
	    RuntimeObject result = null; // The result to be returned by this visit
	    RuntimeObject ro_target = null; // Runtime repr. of target
	    // if target is null, means that it is an attribute of self object. We find self
	    // object in current callFrame  self.node
		if (target == null)
		{
		    isFeatured = true;
		    ro_target = interpreterContext.getCurrentFrame().getSelf();
		    t_target =(FType)((RuntimeObject)ro_target.getMetaclass()).getData().get("kcoreObject");
		} 
		else if (FCallResult.class.isInstance(node.getFTarget()))
		{
		    isFeatured = true;
		    ro_target = interpreterContext.getCurrentFrame().getOperationResult();
		    t_target =(FType)((RuntimeObject)ro_target.getMetaclass()).getData().get("kcoreObject");
		}
		// handle the case of calls like "toto.titi.tutu" -> recursive
		// target.node -> target1.toto.node 
		else if (FCallFeature.class.isInstance(target))
		{
		    isFeatured = true;
		    ro_target = (RuntimeObject)this.accept(target);
		    RuntimeObject metaClass=ro_target.getMetaclass();
		    if (metaClass.getData()!=null)
		    	t_target=(FType)metaClass.getData().get("kcoreObject");
		    if (t_target==null)
		    	System.err.println("The RuntimeObjet has to be typed with a well initialized" +
		    			ro_target+"for '"+((FCallFeature)target).getFName()+"'"+" metaclass");
		}
		
		else if (FIntegerLiteral.class.isInstance(target)) {
		    isFeatured = true;
			ro_target=(RuntimeObject)Run.correspondanceTable.get(target);
			if (ro_target==null) {
				//this integer literal comes from kermeta language definition (see uminus)
				//as languages definitions are not processed as programs, we have to create a ro for the literal
				ro_target= fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(((FIntegerLiteral)target).getFValue(),Run.koFactory);
				Run.correspondanceTable.put(target,ro_target);
			}
			RuntimeObject integerClassRO=Run.koFactory.getTypeDefinitionByName("kermeta::standard::Integer");
			t_target=(FType)integerClassRO.getData().get("kcoreObject");
		}
		
		else if (FStringLiteral.class.isInstance(target)) {
		    isFeatured = true;
		    ro_target=(RuntimeObject)Run.correspondanceTable.get(target);
		    RuntimeObject stringClassRO=Run.koFactory.getTypeDefinitionByName("kermeta::standard::String");
		    t_target=(FType)stringClassRO.getData().get("kcoreObject");
		}
		
		else if (FBooleanLiteral.class.isInstance(target)) {
		    isFeatured = true;
		    ro_target=(RuntimeObject)Run.correspondanceTable.get(target);
		    RuntimeObject booleanClassRO=Run.koFactory.getTypeDefinitionByName("kermeta::standard::Boolean");
		    t_target=(FType)booleanClassRO.getData().get("kcoreObject");
		}
		// If target is a CallVariable :
		// Get the precise type of the CallFeature node.
		// If the type of CallFeature is a property :
		// 		get its value (and return it)
		// Else if the type of CallFeature is an operation
		//		create a new CallFrame
		//		process the operation (by calling accept on it) in order to get
		//		the value of its evaluation, (in order to return it)
		//		
		else if (FCallVariable.class.isInstance(target))
		{
		   isFeatured = true;
		    String var_name = ((FCallVariable)target).getFName();
		    ExpressionContext e_context = findVariableInContext(var_name);
		    // Get the RuntimeObject (ro_target) corresponding to this target (ko) 
		    // (in ko.mycallfeature)
		    if (e_context != null)
		    {
		    	Variable var=(Variable)e_context.getVariables().get(var_name);
		        //ro_target = (ro_target!=null)?ro_target:var.getRuntimeObject();
		    	ro_target = var.getRuntimeObject();
		    	t_target =(FType)ro_target.getMetaclass().getData().get("kcoreObject"); 
		        
		    }
		    else
		    {
		    	// TODO : raise an interpretation exception
		        System.err.println("I could not find the context");
		    }
		    
		}
		// Now we can process either Self (target==null) or FCallVariable (the 2nd test)
		if (isFeatured == true)
		{
			// RuntimeObject feature = factory.getTypeDefinitionByName(qname);
			Object feature = getFeatureType(t_target, node);
			// Is the callfeature an operation call? So that we create a new call
			// frame and accept this operation in order to process it.
			if (feature!=null && FOperation.class.isInstance(feature))
			{
				// Get the parameters of this operation
				ArrayList parameters = visitList(node.getFParameters());
				// Create a context for this operation call, setting self object to ro_target
				interpreterContext.pushNewCallFrame(ro_target);
				// Get the FOperation corresponding to this operation call
				FOperation foperation = (FOperation)feature;
				interpreterContext.getCurrentFrame().setParameters(parameters);
				
				//memorize self object
				interpreterContext.getCurrentFrame().setSelf(ro_target);
				
				// Resolve this operation call
				result = (RuntimeObject)this.accept(foperation);
				// After operation has been evaluated, pop its context
				interpreterContext.getFrameStack().pop();
			}
			// Is it a property? If yes, update the RuntimeObject repr.g the target node !
			else if (feature!=null && FProperty.class.isInstance(feature))
			{
				String propertyName = ((FProperty)feature).getFName();
				if (ro_target.getProperties().containsKey(propertyName))
				{
				    result=(RuntimeObject)ro_target.getProperties().get(propertyName);
				}
				else // the ro_property does not exist yet, we create it (call of Object.get)
				{
				    RuntimeObject ro_property = getROProperty(ro_target, t_target, propertyName);
				    // the attribute is not set yet for ro_target instance?
				    result=fr.irisa.triskell.kermeta.runtime.language.Object.get(
				            ro_target, ro_property);
				/*	System.err.println(
					        "Feature '"+propertyName+"'unreachable " +
					        "when attempting to access it on "+ro_target.getProperties());*/
				}
				
			}
		}
		// else it is a class (kermeta_behavior::TypeLiteral).
		// TypeLiteral : a class (we can have .new, .a_reflective_property, an enumeration
		if (FTypeLiteral.class.isInstance(target))
		{
		    // Is it a class creation? result -> a new RO which type is this class
		    FType type = ((FTypeLiteral)target).getFTyperef().getFType();
		    if (FClass.class.isInstance(type))
		    {
/*		        FClassDefinition class_def = ((FClass)type).getFClassDefinition();
		        RuntimeObject runtimeClass=(RuntimeObject)Run.koFactory.getClassDefTable().get(KMReflect.getQualifiedName(class_def));*/
		    	RuntimeObject runtimeClass=(RuntimeObject)Run.correspondanceTable.get(type);
		    	if (runtimeClass==null)
		    		System.err.println("ERROR => no runtime class to instanciate.");
		        result = Run.koFactory.createRuntimeObject(runtimeClass);
		    }
		    // Is it an enum literal? result -> a RO which type is an enumliteral
		    else if (FEnumeration.class.isInstance(target))
		    {
		        result = null; // TODO : get the enumliteral in the registered RuntimeObjects//From KMBuilder
		    }
		    // Is it something else?
		    else
		    {
		        System.err.println("I could not return something when visiting call feature");
		    }
		    
		}
		// else : it is assumed that it is self object
		return result;
	}
		
    /**
     * Visit a FJavaStaticCall : 
     * 		extern a::b::c.d()
     * We use java reflection to visit a FJavaStaticCall.
     * For this case, by definition every linked Java methods have one type
     * of parameters, which is always a RuntimeObject.
     * @return
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FJavaStaticCall)
	 */
	public Object visit(FJavaStaticCall node) {
	    
		String jclassName  = node.getFJclass().replaceAll("::","."); 
		String jmethodName = node.getFJmethod();
		
		Object[] paramsArray = new Object[node.getFParameters().size()];
		Class[] paramtypes = new Class[node.getFParameters().size()];
		
		// Get the parameters of this operation
		ArrayList parameters = visitList(node.getFParameters());
		// Get the param types for invokated method
		Iterator it = parameters.iterator();
		int i = 0;
		while (it.hasNext())
		{
		    paramtypes[i] = RuntimeObject.class;
		    paramsArray[i++] = it.next();
		}
		// Invoke the java method
		Class jclass = null;
        try {
            jclass = Class.forName(jclassName);
        } catch (ClassNotFoundException e) {
            internalLog.error("ClassNotFoundException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
			throw	new KermetaVisitorError("ClassNotFoundException invoking "+ jmethodName + " on Class " +jclassName  ,e);
        }
        Method jmethod = null;
        try {
            jmethod = jclass.getMethod(jmethodName, paramtypes);
        } catch (SecurityException e1) {
            internalLog.error("SecurityException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
			throw	new KermetaVisitorError("SecurityException invoking "+ jmethodName + " on Class " +jclassName  ,e1);
        } catch (NoSuchMethodException e1) {
            internalLog.error("NoSuchMethodException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
			throw	new KermetaVisitorError("NoSuchMethodException invoking "+ jmethodName + " on Class " +jclassName  ,e1);
        }
        Object result = null;
        try {
            result = jmethod.invoke(jclass.newInstance(), paramsArray);
        } catch (IllegalArgumentException e2) {        
			internalLog.error("IllegalArgumentException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
			throw	new KermetaVisitorError("IllegalArgumentException invoking "+ jmethodName + " on Class " +jclassName  ,e2); 		
        } catch (IllegalAccessException e2) {
            internalLog.error("IllegalAccessException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
			throw	new KermetaVisitorError("IllegalAccessException invoking "+ jmethodName + " on Class " +jclassName  ,e2);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
		    if (cause != null)				       
		        if (cause.getClass().getName().compareTo("junit.framework.AssertionFailedError")==0)
			    {
		            internalLog.error(e2.getClass().getName() + " invoking "+ jmethodName + " on Class " +jclassName + " was due to AssertionFailedError: Shrinking the Exception Stack ");					       
		            // this Exception was due to a KermetaVisitorError create a new one with the precedent content
		            throw new KermetaVisitorError("InvocationTargetException caused by AssertionError: "+cause.getMessage(), cause);
		        }
		        else
		        {
		            internalLog.error("InvocationTargetException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
					throw	new KermetaVisitorError("InvocationTargetException invoking "+ jmethodName + " on Class " +jclassName  ,e2);
		        }
            
        } catch (InstantiationException e2) {
            internalLog.error("InstantiationException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
			throw	new KermetaVisitorError("InstantiationException invoking "+ jmethodName + " on Class " +jclassName  ,e2);
        }
        return result;
	}
    
	/* -----------------------------------------------------------------------------
	 * 
	 * VISIT PRIMITIVE TYPES
	 * 
	 * -----------------------------------------------------------------------------
	 */
	
	/**
	 * @return the value of this node as an integer
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FIntegerLiteral) 
	 */
	public Object visit(FIntegerLiteral node) {
	    return fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(node.getFValue(), Run.koFactory);
	}
	
	/**
	 * @return the value of this node as a boolean
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBooleanLiteral) 
	 */
	public Object visit(FBooleanLiteral node) {
	    return fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.create(node.isFValue(),Run.koFactory);
	}
	
	public Object visit(FEnumerationLiteral node)
	{
	    return null;
	}
	
    /** 
     * @return the value of this node as a runtime object
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.FStringLiteral)
     */
    public Object visit(FStringLiteral node) {
        return fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFValue(), Run.koFactory);
    }
	/**
	 * Visit a classDefinition node has the following consequences :
	 * - create the "self" RuntimeObject and link it to the current CallFrame context 
	 */
	public Object visit(FClassDefinition node)
	{
	    // Get the qualified name of this class
	    String qname = KMReflect.getQualifiedName(node);
	    RuntimeObject result = Run.koFactory.getTypeDefinitionByName(qname);
	    //node.getFOwnedOperation().
	    // Set the attribute self_object of current frame, so that we can manipulate it
	    return result;
	}
	
	
	
    /**
     * visit a raise node
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.FRaise)
     */
    public Object visit(FRaise node) {
        return this.accept(node.getFExpression());
    }
    /**
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.FRescue)
     */
    public Object visit(FRescue node) {
        
        visitList(node.getFBody());
        // node.getFExceptionName()
        // node.getFExceptionType()
        return null;
    }
	/*
	 * 
	 * Helpers
	 * 
	 * 
	 */
	

	/**
	 * Get the return type of the <code>node</code>, which is a method
	 * or an operation.
	 * This node is a FCallExpression
	 * @param node
	 * @return
	 */
	public Object getReturnType(FCallExpression node)
	{
	    // get node name
	    String name = node.getFName();
	    //String qualifiedName = getQualifiedName(node);
	    //get
	    // get its definition
	    FTypeDefinition typeDef = unit.getTypeDefinitionByName(name);
	    return typeDef;
	}
	
	public FOperation getOperationDefinition()
	{
	    return null;
	}
	
	/**
	 * visit a list of expressions (usually come from a FBlock)
	 * @param expressions
	 * @return an ArratList of RuntimeObjects
	 */
	public ArrayList visitList(EList expressions)
	{
		Iterator it = expressions.iterator();
		ArrayList result_list = new ArrayList();
		while(it.hasNext()) {
			result_list.add(this.accept((EObject)it.next()));
		}
		return result_list;
	}

    /**
     * @return Returns the imports.
     * 
     * @uml.property name="imports"
     */
    public ArrayList getImports() {
        return imports;
    }

    /**
     * @return Returns the usings.
     * 
     * @uml.property name="usings"
     */
    public ArrayList getUsings() {
        return usings;
    }

	/**
	 * Get the fully qualified name of an FNamedElemenet
	 */
	public String getQualifiedName(FNamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof FNamedElement)
			return getQualifiedName( (FNamedElement)element.eContainer() ) + "::" + ppIdentifier(element.getFName());
		else return element.getFName();
	}
	
	/**
	 * Protect the id if it is a keyword name
	 * @param id
	 * @return
	 */
	protected String ppIdentifier(String id) {
		if (id == null) return id;
		if (SimpleKWList.getInstance().isKeyword(id))
			return "~" + id;
		else return id;
	}
	
    /**
     * Get the name of this object and retrieve the corresponding command class name.
     * @param kObject the object for which we want to retrieve the corresponding command.
     * @return the name of the command class for this RuntimeObject
     */
    public static String getCommandName(RuntimeObject kObject) 
    {
        String kName = kObject.getClass().getName();
        // 1st letter : "F"
        return kName.substring(1, kName.length())+"Command";
    }
    
    
    /**
     * Gets the variable specified by <code>exp</code> in the whole interpreter context
     * InterpreterContext and returns the corresponding Variable
     * @param var_name
     * @return the expression context where we found it
     */
    public ExpressionContext findVariableInContext(String varName)
    {
        boolean found=false;
        ExpressionContext context = null;
        // Get the stack size
        int stackSize = this.interpreterContext.getFrameStack().size();
        int i=stackSize;
        CallFrame frame;
        // Search in the stack of call frames
        while (!found && i>0) {
            frame = (CallFrame)interpreterContext.getFrameStack().get(i-1);
            // Search in the stack of block stacks (a block stack : an interpreter context stack) 
            int blockStackSize = frame.getBlockStack().size();
            int j = blockStackSize;
            // Search from last to beginning
            while (!found && j>0) 
            {
            	ExpressionContext currentcontext = (ExpressionContext)frame.getBlockStack().get(j-1);
                if (currentcontext.getVariables().containsKey(varName))
                {
                    found=true;
                    context=currentcontext;
                }
                j--;
            }
            i--;
        }
        return context;
    }
 
    
    public static void updateContextVariable()
    {
        
    }
    
    public static FCallExpression getPropertyValueFromContext()
    {
        return null;
    }
    
    /**
     * This is a helper (TODO : move it in a specific class) that returns the precise
     * type of the <code>feature</code> that is "applied" to the given <code>target</code>.
     * If the type of the type reference of the target is a "FClass", then we have to find out
     * if feature is an operation or an attribute. We can find that it is an operation if there
     * are parameters, but in the other case (no parameters) we have no way to find it.
     * @param type the type reference of the "callee" element on which feature is "called"
     * @param feature the feature of which we want the type (FOperation, FAttribute)
     * @return the ecore object representing this feature. Its real type is either FProperty or FOperation
     */
    public Object getFeatureType(FType type, FCallFeature feature)
    {
        Object result = null;
        // If type is a FClass
        FClassDefinition class_def = ((FClass)type).getFClassDefinition();
        // Is the feature in the class definition of *type*?
        result = getFlatFeatureType(class_def, feature);
        // If it is still null, we have to find it in the Super classes, recursively
        if (result == null)
        {
            result = getSuperFeatureType(class_def, feature);;
        }
        // If it is still still null, find operation in Object!
        if (result == null)
        {
            class_def = (FClassDefinition)unit.typeDefinitionLookup(KermetaUnit.ROOT_CLASS_QNAME);
            result = getFlatFeatureType(class_def, feature);
        }
        if (result == null)
        {
            //throw new KermetaInterpreterError("feature '"+feature.getFName()+"' not found in class '"+class_def.getFName()+"'");
            System.err.println("feature '"+feature.getFName()+"' not found in class '"+class_def.getFName()+"'");
        }
        // TODO : test for other kinds of types or Exception? -- is feature valuable
        // in a source code for another target type than FClass?
        return result;
    }
     
    /**
     * Get the super operation or the super attribute in super classes of classDef 
     * @param classDef
     * @return the ecore object representing this super op or super attr.
     */
    public Object getSuperFeatureType(FClassDefinition classDef, FCallFeature feature)
    {
        Object result = null;
        Iterator st_it = classDef.getFSuperType().iterator();
        while (st_it.hasNext() && result == null)
        {
            FClassDefinition next = ((FClass)st_it.next()).getFClassDefinition();
            result = getFlatFeatureType(next, feature);
            // If we still have not found them, find in super types! 
            if (result == null)
            {
                result = getSuperFeatureType(next, feature);
            }
        }
        return result;
    }
    
    /**
     * Get the type of the <b>feature</b> given as argument in the <b>type</b>. Return null if 
     * the feature is not defined <i>directly<i> in the given type.
     * @param type
     * @param feature
     * @return
     */
    protected Object getFlatFeatureType(FClassDefinition type, FCallFeature feature)
    {
        Object result = null; Object elt = null; 
        EList operations = type.getFOwnedOperation();
        int i = 0;
        while (i < operations.size() && result == null)
        {	
            elt = operations.get(i);
            if (((FOperation)operations.get(i)).getFName().equals(feature.getFName()))
                result = elt;
            i++;
        }
        if (result == null)
        {
            EList attributes = type.getFOwnedAttributes();
            i=0;
            while (i < attributes.size() && result == null)
            {
                elt = attributes.get(i);
                if (((FProperty)attributes.get(i++)).getFName().equals(feature.getFName()))
                    result = elt;
            }   
        }
        return result;
    }


    protected void displayHashtable(Hashtable hash)
    {
        Set keys = hash.keySet();
        Iterator it = keys.iterator();
        System.out.print("[ ");
        while (it.hasNext())
        {
            Object key = it.next();
            System.out.print(key+": "+hash.get(key));
        }
        System.out.print(" ]");
    }
    
}




