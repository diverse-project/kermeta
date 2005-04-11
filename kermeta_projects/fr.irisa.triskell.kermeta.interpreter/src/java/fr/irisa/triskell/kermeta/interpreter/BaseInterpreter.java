/* $Id: BaseInterpreter.java,v 1.13 2005-04-11 17:36:28 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : BaseCommand.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Author : zdrey
 * Description : describe here file content
 * TODO : 
 * 	- write here your TODO actions
 *  - ...
 * Notes : 
 * 		 
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
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import sun.nio.cs.KOI8_R;

import fr.irisa.triskell.kermeta.ast.FSelfCall;
import fr.irisa.triskell.kermeta.behavior.*;
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

    /**
     * The global context
     * @uml.property name="interpreterContext"
     * @uml.associationEnd multiplicity="(1 1)"
     */
    protected InterpreterContext interpreterContext;

    /**
     * The current ExpressionContext (entity in the CallFrame stack of contexts)
     * @uml.property name="currentContext"
     * @uml.associationEnd multiplicity="(0 1)"
     */
    protected ExpressionContext currentContext;


    // Should we access the interpreter context defined in KMT?
    /**
     * The main unit
     * 
     * @uml.property name="unit"
     * @uml.associationEnd multiplicity="(1 1)"
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
     */
    protected ArrayList usings = new ArrayList();

    /**
     * 
     */
    protected ArrayList imports = new ArrayList();

	protected String root_pname;
	protected String current_pname;
	
	protected boolean typedef = false;
	
	/***
	 * A variable declaration : when we encounter it, we add it to the expression context
	 * of the current frame
	 * @return the RuntimeObject corresponding to the initial value of <code>node</code>
	 */
	public Object visit(FVariableDecl node)
	{
		/*RuntimeObject variable_decl = node.getFactory().getTypeDefinitionByName(
			    ((FVariableDecl)declaration).getFType().getFName()
				);
				*/
	    //RuntimeObject ko = factory.createRuntimeObject(node);
	    // TODO : node.getFInit can be null -
		RuntimeObject ro_init=null;
		if (node.getFInitialization()!=null)
			ro_init = (RuntimeObject)this.accept(node.getFInitialization());
	    interpreterContext.getCurrentFrame().getCurrentExpressionContext().defineVariable(
	            node.getFType().getFType(), node.getFIdentifier(), ro_init);
	    return ro_init;
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
	 * @return The void RuntimeObject
	 */
	public Object visit(FAssignement node) {
	    
		 //result = this.accept(node.getFTarget());
	    // if FTarget is a property we should process differently
	    // if it is a variable only
		 String lhs_name = node.getFTarget().getFName();
		 FExpression lhs = node.getFTarget();
		
		RuntimeObject rhs_value = (RuntimeObject)this.accept(node.getFValue());
		
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
		        // TODO Throw properly an exception FIXME : the problem
		        // of "resolve symbol", in KMT2KMPass6: redundant test
		        System.err.println("Variable '"+lhs_name+"' seems to be undeclared");
		    }
		}
		// is it a callfeature? toto.
		else if (FCallFeature.class.isInstance(node.getFTarget()))
		{
		    // Get this callfeature
		    FCallFeature feature = (FCallFeature)node.getFTarget();
		    // Get the object on which this feature is applied
		    FExpression target = feature.getFTarget();
		    if (target==null) {
		    	//self reference
		    	RuntimeObject selfObject=interpreterContext.getCurrentFrame().getSelf();
		    	fr.irisa.triskell.kermeta.runtime.language.Object.set(selfObject,(RuntimeObject)Run.correspondanceTable.get(feature),rhs_value);
		    }
		    else System.err.println("TODO");
		    // Retrieve the object in the RuntimeObject tree? // in the context.
		    // can be a parameter of the current called operation
		    // can be an object already stored as a variable in the blockstacks 
		    
		}
		
		return Run.voidINSTANCE;
	}
	
	/**
	 * The result node corresponds to the return value of the operation that is currently 
	 * processed.
	 * Its value is stored in the current CallFrame (as the attribute "operation_result"),
	 * (during the visit of FAssignment) but the visit of this node has no effect. 
	 * @return the void RuntimeObject  
	 */
	public Object visit(FCallResult node)
	{   
	    return Run.voidINSTANCE;
	}
	
	/**
	 * If the visited element is a Variable, then we search its value in the InterpreterContext
	 * */
	public Object visit(FCallVariable node)
	{
	    ExpressionContext found_context = findVariableInContext(node.getFName());
	    RuntimeObject value = null;
	    if (found_context!=null)
	        value = found_context.getVariable(node.getFName()).getRuntimeObject();
	    else
	    	// TODO
	    	System.err.println("Var not declared");
	    return value;
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
	    RuntimeObject result = null;
		// process the rescues
	    Iterator it;
		it = node.getFRescueBlock().iterator();
		while(it.hasNext()) {
			result = (RuntimeObject)this.accept((FRescue)it.next());
		}
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visit(FClass node) {
	    return Run.voidINSTANCE;
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
        String value = null;
        // Get boolean value
        if (cond_result.getProperties().containsKey("singleton instance"))
        {
            value = (String)cond_result.getProperties().get("singleton instance");
        }
        else
        {
            // TODO : throw an InterpreterException 
        }
        
        // if cond is true
        if (value.equals("TRUE INSTANCE"))
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
        String value = null;
        
	    do
	    {
/*	    	//	    	TO DEBUG STACK
	        ExpressionContext context = null;
	        int stackSize = this.interpreterContext.getFrameStack().size();
	        int i=stackSize;
	        CallFrame frame;
	        while (i>0) {
	        	System.out.println("CallFrame "+i);
	            frame = (CallFrame)interpreterContext.getFrameStack().get(i-1);
	            int blockStackSize = frame.getBlockStack().size();
	            int j = blockStackSize;
	            while (j>0) 
	            {
	            	System.out.println("ExpressionFrame "+j);
	                context = (ExpressionContext)frame.getBlockStack().get(j-1);
	                Iterator it=context.getVariables().keySet().iterator();
	                while (it.hasNext())
	                {
	                	String key=(String)it.next();
	                    System.out.println(key+" : "+context.getVariables().get(key));
	                }
	                j--;
	            }
	            i--;
	        }
	        //TO DEBUG STACK */
	    	
		    RuntimeObject cond_result = (RuntimeObject)this.accept(node.getFStopCondition());
	        // Get boolean value
	        if (cond_result.getProperties().containsKey("singleton instance"))
	            value = (String)cond_result.getProperties().get("singleton instance");
	        else
	        {
	            // TODO : throw an InterpreterException 
	        	System.err.println("Loop : evaluation of the condition ^part does not result in a boolean value.");
	        }
	        
	        if (value.equals("FALSE INSTANCE"))
	        	this.accept(node.getFBody());
	    } while (value.equals("FALSE INSTANCE"));
	    
	    // Pop the expression context
	    interpreterContext.getCurrentFrame().popExpressionContext();
	    // Return the void runtimeObject
	    return Run.voidINSTANCE;
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

	/**
	 * Visit an element that is a call of an attribute or an operation.
	 * Steps :
	 * - 
	 * -
	 * -
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FCallFeature)
	 */
	public Object visit(FCallFeature node) {
	    
	    FExpression target = node.getFTarget();
	    // TODO : boolean that we expect to use later... 
	    boolean isFeatureKind = false;
	    FTypeDefinition t_target = null; // Type of the "callee"
	    RuntimeObject result = null; // The result to be returned by this visit
	    RuntimeObject ro_target = null; // Runtime repr. of target
	    // if target is null, means that it is an attribute of self object. We find self
	    // object in current callFrame  self.node
		if (target == null)
		{
		    ro_target = interpreterContext.getCurrentFrame().getSelf();
		    t_target =(FTypeDefinition)((RuntimeObject)ro_target.getMetaclass()).getData().get("kcoreObject");
		}
		
		// handle the case of calls like "toto.titi.tutu" -> recursive
		// target.node -> target1.toto.node 
		if (FCallFeature.class.isInstance(target))
		{
		    ro_target = (RuntimeObject)this.accept(target);
		    RuntimeObject metaClass=ro_target.getMetaclass();
		    Object typedef = null;
		    if (metaClass.getData()!=null) typedef=metaClass.getData().get("kcoreObject");
		    if (typedef==null) {
		    	typedef=metaClass.getProperties().get("classDefinition");
		    	if (typedef==null) System.err.println("Cannot get type of ro_target result");
		    	typedef=((RuntimeObject)typedef).getData().get("kcoreObject");
		    }
		    t_target=(FTypeDefinition)typedef;
		}
		
		if (FIntegerLiteral.class.isInstance(target)) {
			ro_target=(RuntimeObject)Run.correspondanceTable.get(target);
			RuntimeObject integerClassRO=Run.koFactory.getTypeDefinitionByName("kermeta::standard::Integer");
			t_target=(FTypeDefinition)integerClassRO.getData().get("kcoreObject");
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
		if (FCallVariable.class.isInstance(target))
		{
		   
		    String var_name = ((FCallVariable)target).getFName();
		    
		    ExpressionContext e_context = findVariableInContext(var_name);
		    // Get the RuntimeObject (ro_target) corresponding to this target (ko) 
		    // (in ko.mycallfeature)
		    if (e_context != null)
		    {
		    	Variable var=(Variable)e_context.getVariables().get(var_name);
		        ro_target = (ro_target!=null)?ro_target:var.getRuntimeObject();
		        t_target = ((FClass)var.getType()).getFClassDefinition();
		    }
		    else
		    {
		    	// TODO : raise an interpretation exception 
		    }
		    
		}
		// FIXME : a foolish boolean could simplify this test...
		// Now we can process either 
		// Self (target==null)
		// or a FCallVariable (the 2nd test)
		// or a TypeLiteral (FIntegerLiteral :TODO: FRealLiteral)
		// or a FCallFeature
		if (
		        target==null
		        || FCallVariable.class.isInstance(target) 
		        || FIntegerLiteral.class.isInstance(target) 
		        || FCallFeature.class.isInstance(target))
		{
		   result = visitFeature(t_target, ro_target, node) ;
		}
		// else it is a class (kermeta_behavior::TypeLiteral).
		// TypeLiteral : a class (we can have .new, .a_reflective_property, an enumeration
		// Note : we assume that all the Ftypes tested here are unique and do not
		// inherit each other
		if (FTypeLiteral.class.isInstance(target))
		{
		    // Is it a class creation? result -> a new RO which type is this class
		    FType type = ((FTypeLiteral)target).getFTyperef().getFType();
		    if (FClass.class.isInstance(type))
		    {
		        FClassDefinition class_def = ((FClass)type).getFClassDefinition();
		        RuntimeObject runtimeClass=(RuntimeObject)Run.koFactory.getClassDefTable().get(KMReflect.getQualifiedName(class_def));
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
		        
		    }
		    
		}
		// else : it is assumed that it is self object
		return result;
	}
	
	/**
	 * This is a helper method that visits a feature (a feature is an attribute or an operation "applied" on an instance)
	 * @param target_type the type definition of the target on which the feature is "applied"
	 * @param node the node that is visited
	 * @param ro_target the runtime object of the target defined by target_type
	 * @return the result of the feature visit : 
	 * 		- it resolves the operation if it is an operation
	 * 		- it returns the value of an attribute if it is an attribute
	 * Note : the result is a RuntimeObject, so even if we cast it
	 */
	public RuntimeObject visitFeature(FTypeDefinition t_target, RuntimeObject ro_target, FCallFeature node)
	{
	    RuntimeObject result = null;
//	  RuntimeObject feature = factory.getTypeDefinitionByName(qname);
	    FClassDefinition fclass_def = (FClassDefinition)ro_target.getMetaclass().getData().get("kcoreObject");
	    System.out.println("FCLassDef = "+fclass_def.getFName()+" feature="+node.getFName());
		EObject feature = unit.findPropertyByName(fclass_def, node.getFName());
        if (feature==null)
        {
            feature = unit.findOperationByName(fclass_def, node.getFName());
        }
	    // Is the callfeature an operation call? So that we create a new call
	    // frame and accept this operation in order to process it.
	    if (FOperation.class.isInstance(feature))
	    {
	        // Create a context for this operation call, setting self object to ro_target
	        interpreterContext.pushNewCallFrame(ro_target);
	        // Get the FOperation corresponding to this operation call
	        FOperation foperation = (FOperation)feature;
	        // Get the parameters of this operation
	        ArrayList parameters = visitList(node.getFParameters());
	        interpreterContext.getCurrentFrame().setParameters(parameters);
	        
	        //memorize self object
	        interpreterContext.getCurrentFrame().setSelf(ro_target);
	        
	        // Resolve this operation call
	        result = (RuntimeObject)this.accept(foperation);
	        
	        // After operation has been evaluated, pop its context
	        interpreterContext.getFrameStack().pop();
	    }
	    // Is it a property? If yes, update the RuntimeObject repr.g the target node !
	    else if (FProperty.class.isInstance(feature))
	    {
	        // The property 
	        FProperty fproperty = (FProperty)feature;
	        // We want to find out the Runtime representation of this property.
	        result = (RuntimeObject)ro_target.getProperties().get(fproperty.getFName());
	        
	    }
	    // Is feature null? it means that it was not found in the definition of the "callee" class
	    else 
	    {
	        // TODO : return an exception :
	        System.err.println("Interpreter exception : feature ("+feature+") not found for "+t_target);
	    }
	  //  System.out.println("Visiting : t_target = " + t_target.getFName());
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Method jmethod = null;
        try {
            jmethod = jclass.getMethod(jmethodName, paramtypes);
        } catch (SecurityException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (NoSuchMethodException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Object result = null;
        try {
            result = jmethod.invoke(jclass.newInstance(), paramsArray);
        } catch (IllegalArgumentException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        } catch (IllegalAccessException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        } catch (InvocationTargetException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        } catch (InstantiationException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
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
	    return fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.create(node.isFValue());
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
                context = (ExpressionContext)frame.getBlockStack().get(j-1);
                if (context.getVariables().containsKey(varName))
                {
                    found=true;
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
    
 
}




