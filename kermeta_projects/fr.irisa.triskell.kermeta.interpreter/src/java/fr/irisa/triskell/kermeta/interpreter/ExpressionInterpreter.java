/* $Id: ExpressionInterpreter.java,v 1.5 2005-05-18 23:49:02 ffleurey Exp $
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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.behavior.FAssignement;
import fr.irisa.triskell.kermeta.behavior.FBlock;
import fr.irisa.triskell.kermeta.behavior.FBooleanLiteral;
import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FCallResult;
import fr.irisa.triskell.kermeta.behavior.FCallSuperOperation;
import fr.irisa.triskell.kermeta.behavior.FCallVariable;
import fr.irisa.triskell.kermeta.behavior.FConditionnal;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.behavior.FIntegerLiteral;
import fr.irisa.triskell.kermeta.behavior.FJavaStaticCall;
import fr.irisa.triskell.kermeta.behavior.FLambdaExpression;
import fr.irisa.triskell.kermeta.behavior.FLoop;
import fr.irisa.triskell.kermeta.behavior.FRaise;
import fr.irisa.triskell.kermeta.behavior.FRescue;
import fr.irisa.triskell.kermeta.behavior.FSelfExpression;
import fr.irisa.triskell.kermeta.behavior.FStringLiteral;
import fr.irisa.triskell.kermeta.behavior.FTypeLiteral;
import fr.irisa.triskell.kermeta.behavior.FVariableDecl;
import fr.irisa.triskell.kermeta.behavior.FVoidLiteral;
import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.error.KermetaVisitorError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.parser.SimpleKWList;
import fr.irisa.triskell.kermeta.runtime.RuntimeLambdaObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumerationLiteral;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * This is the Java version of kermeta interpreter. It extends the KermetaVisitor, and each
 * visit returns a result of type <code>RuntimeObject</code>.
 */
public class ExpressionInterpreter extends KermetaVisitor {

    
    //The only state variable of the interpreter should be the context and the memory
    /** The global context */
    protected InterpreterContext interpreterContext;
    /** The memory */
    protected RuntimeMemory memory;

    
    /**
     * Constructor
     * @param pContext
     * @param unit the main kermetaUnit ..
     */
    public ExpressionInterpreter(RuntimeMemory pMemory)
    {
        interpreterContext = new InterpreterContext(pMemory);
        memory = pMemory; 
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
		RuntimeObjectFactory roFactory = memory.getROFactory(); 
        // Create a context for this operation call, setting self object to ro_target
        interpreterContext.pushOperationCallFrame(ro_target, foperation, arguments);
       
        // Resolve this operation call
        result = (RuntimeObject)this.accept(foperation);
        
        // After operation has been evaluated, pop its context
        interpreterContext.popCallFrame();
		return result;
	}
	
	/***
	 * A variable declaration : when we encounter it, we add it to the expression context
	 * of the current frame
	 * @return
	 */
	public Object visit(FVariableDecl node)
	{
		RuntimeObject ro_init = memory.voidINSTANCE;
		// is it a classic case?
		// TODO : compare qualified names otherwise this test could be sometimes false
		if (FFunctionType.class.isInstance(node.getFType().getFType()))
		{
		    internalLog.info("Type of variable declaration : "+node.getFType().getFName());
		
		}
		if (node.getFInitialization()!=null)
		   ro_init = (RuntimeObject)this.accept(node.getFInitialization());
		
		interpreterContext.peekCallFrame().peekExpressionContext().defineVariable(
	             node.getFIdentifier(), ro_init);
	    return ro_init;
	}
	
	
	
    public Object visit(FTypeLiteral arg0) {
        // FIXME : Type variables should be handled here
        FClass c = (FClass)((SimpleType)TypeCheckerContext.getTypeFromMultiplicityElement(arg0.getFTyperef())).getType();
        
        RuntimeObject cdef = (RuntimeObject)memory.getCorrespondanceTable().get(c.getFClassDefinition());
        
        if (cdef == null) {
            internalLog.error("INTERPRETER INTERNAL ERROR : Type definition not found");
	        throw new Error("INTERPRETER INTERNAL ERROR : Type definition not found");
        }
        
        RuntimeObject result = memory.getROFactory().getClassForClassDefinition(cdef);
        return result;
    }
    
    
    public Object visit(FVoidLiteral arg0) {
        return memory.voidINSTANCE;
    }
	/**
	 * Returns the RuntimeObject representation of the property specified by 
	 * <code>propertyName</code>, for the instance specified by <code>ro_target</code>
	 * @param fclass the type of the object represented by <code>ro_target</code>
	 * @param propertyName The name of the properties of which we want the value
	 * @return the RuntimeObject that repr. the value of the property for the given ro_target
	 */
	protected RuntimeObject getRuntimeObjectForFProperty(FClass fclass, String propertyName)
	{
	    // Create the corresponding type
	    SimpleType target = new SimpleType(fclass);
	    // find the property
	    CallableProperty cproperty = target.getPropertyByName(propertyName);
	    
	    // DEBUG : This should never happend
	    if (cproperty == null) {
	        internalLog.error("INTERPRETER INTERNAL ERROR : unable to find property " + propertyName + " in type " + target);
	        throw new Error("INTERPRETER INTERNAL ERROR : unable to find property " + propertyName + " in type " + target);
	    }
	    
	    // Get the runtime object in the memory correspondance table
	    RuntimeObject result = (RuntimeObject)memory.getCorrespondanceTable().get(cproperty.getProperty());
	    
	    // DEBUG : This should never happend
	    if (result == null) {
	        internalLog.error("INTERPRETER INTERNAL ERROR : unable to find runtime object for property " + propertyName + " in type " + target);
	        throw new Error("INTERPRETER INTERNAL ERROR : unable to find runtime object for property " + propertyName + " in type " + target);
	    }
	    
	    return result;
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
	    
		// The name of the call
		String lhs_name = node.getFTarget().getFName();
		
		 // The new value 
		RuntimeObject rhs_value = (RuntimeObject)this.accept(node.getFValue());
		
		/* DO NOT DELETE THIS CODE */
		/* work in progress :-)
		if (node.isFIsCast()) {
			
			// Just to be sure !!
			if (node.getFTarget().getFStaticType() == null) {
				throw new Error("THE PROGRAM CANNOT BE EXECUTED BECAUSE IT HAS NOT BEEN TYPE CHECKED");
			}
			
			SimpleType expectedType = new SimpleType(node.getFTarget().getFStaticType());
			FClass p = (FClass)rhs_value.getMetaclass().getData().get("kcoreObject");
			SimpleType providedtype = new SimpleType(p);
			if (!providedtype.isSubTypeOf(expectedType)) {
				rhs_value = memory.voidINSTANCE;
			}
		}
		*/
		if (node.getFTarget() instanceof FCallResult)
		{
		    // Assign the result of the current operation
		    interpreterContext.peekCallFrame().setOperationResult(rhs_value);
		}
		else if (node.getFTarget() instanceof FCallVariable)
		{
		    Variable var = interpreterContext.peekCallFrame().getVariableByName(node.getFTarget().getFName());
		    
		    // This is for debugg purposes it should never happend
		    if (var == null) {
		        internalLog.error("INTERPRETER INTERNAL ERROR : unable to find variable " + node.getFTarget().getFName());
		        throw new Error("INTERPRETER INTERNAL ERROR : unable to find variable " + node.getFTarget().getFName());
		    }
		    
		    var.setRuntimeObject(rhs_value);
		}
		else if (node.getFTarget() instanceof FCallFeature)
		{
		    // Visiting the callFeature should return the RuntimeObject
		    // From the runtimeObject, get its target
		    
		    FCallFeature callfeature = (FCallFeature)node.getFTarget();
		    
		    // Get the object on which this feature is applied
		    FExpression target = callfeature.getFTarget();
	    	String propertyName = callfeature.getFName();
	    	
	    	RuntimeObject ro_target;
	    	
		    if (target==null)
		    {  	//self reference
		    	ro_target=interpreterContext.peekCallFrame().getSelf();
		    }
		    // If target is not null, we need to get the corresponding runtime object
		    else
		    // can be a parameter of the current called operation
		    // can be an object already stored as a variable in the blockstacks
		    {
		        // the runtime object corresponding to this target
		       
		        ro_target = (RuntimeObject)this.accept(target);
		    }
		    
		    // This is for debugg purposes it should never happend
		    if (ro_target == null) {
		        internalLog.error("INTERPRETER INTERNAL ERROR : null runtime object for target in feature assignement ");
		        throw new Error("INTERPRETER INTERNAL ERROR : null runtime object for target in feature assignement ");
		    }
		    
		    // Check for void target
		    if (ro_target == memory.voidINSTANCE) {
		        internalLog.debug(" >> INTERPRETER REPORTS Call on a void target (property assignement). TODO: raise an exception");
		        // TODO : raise a CallOnAVoidTarget exception
		    }
		    
		    FClass t_target=(FClass)ro_target.getMetaclass().getData().get("kcoreObject");

            // FIXME : FProperty is assumed to be the type of the feature
            RuntimeObject ro_property = this.getRuntimeObjectForFProperty(t_target, propertyName);
            
            // FIXME : ro_property must not be null
			// Set the value of the property
            if (ro_property == null)
            {
                System.err.println("could not set property '"+propertyName+"' for object '"+lhs_name+"'");
            }
            else
            fr.irisa.triskell.kermeta.runtime.language.Object.set(ro_target,ro_property,rhs_value);      
		}
		
		return rhs_value;
	}
	
	
    /**
     * FCallSuperOperation corresponds to the kermeta instruction "super"
     * Usually, its properties are : 
     * name = super 
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.FCallSuperOperation)
     */
    public Object visit(FCallSuperOperation node)
    {
        RuntimeObject result = null;
        FOperation current_op = this.interpreterContext.peekCallFrame().getOperation();
        RuntimeObject ro_target = this.interpreterContext.peekCallFrame().getSelf();
        FClassDefinition foclass = current_op.getFOwningClass();
        //internalLog.info("Visiting a super operation of : "+current_op.getFName());
        
        // Get the parameters of this operation
		ArrayList parameters = visitList(node.getFParameters());
		// Create a context for this operation call, setting self object to ro_target
		interpreterContext.pushOperationCallFrame(ro_target, current_op.getFSuperOperation(), parameters);
		
		
        result = (RuntimeObject)this.accept(current_op.getFSuperOperation());
        
        // Pop the context!
        interpreterContext.popCallFrame();
        // TODO : raise exception if super operation not found // TypeChecker
        return result;
    }
	/**
	 * Visit a lambda expression. We visit a lambda expression in two cases :
	 * - when we defined one and assigned it to a variable
	 * - when we call one  
	 */
	public Object visit(FLambdaExpression node)
	{   	    
	    RuntimeObject result = new RuntimeLambdaObject(node, memory.getROFactory(),this.interpreterContext.peekCallFrame(), this.interpreterContext);
	    return result;
	}
	
	
	
	/**
	 * The result node corresponds to the return value of the operation that is currently 
	 * processed.
	 * We also store it as a variable (for the moment)
	 */
	public Object visit(FCallResult node)
	{
	    RuntimeObject value = interpreterContext.peekCallFrame().getOperationResult();
	    if (value==null)
	    	// TODO
	    	System.err.println("result not found in context");
	    return value;
	}
	
	/**
     * If the visited element is a Variable, then we search its value in the
     * InterpreterContext
     */
    public Object visit(FCallVariable node) {
        RuntimeObject result;
        Variable var = interpreterContext.peekCallFrame().getVariableByName(node.getFName());

        // This is for debugg purposes it should never happend
        if (var == null) {
            internalLog.error("INTERPRETER INTERNAL ERROR : unable tofind variable in context " + node.getFName());
            throw new Error("INTERPRETER INTERNAL ERROR : unable tofind variable in context " + node.getFName());
        }

        // It is a simple variable call
        if (node.getFParameters().size() == 0) {
            result = var.getRuntimeObject();
        }
        // it is a call to a lambda expression
        else {

            // This is for debugg purposes it should never happend
            if (!(var.getRuntimeObject() instanceof RuntimeLambdaObject)) {
                internalLog.error("INTERPRETER INTERNAL ERROR : function call on variable " + node.getFName() + " which does not contain a function");
                throw new Error("INTERPRETER INTERNAL ERROR : function call on variable " + node.getFName() + " which does not contain a function");
            }
            
            // Get the function
            RuntimeLambdaObject func = (RuntimeLambdaObject) var.getRuntimeObject();

            // Compute actual parameters
            ArrayList paramAList = visitList(node.getFParameters());
            
            
            // Call the function
            result = func.call(this, paramAList);
            
            
            }

        return result;
    }
	
	public Object visit(FSelfExpression node)
	{
	    return interpreterContext.peekCallFrame().getSelf();
	}

	/**
	 * Evaluate the sequence of instructions in this block.
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBlock)
	 */
	public Object visit(FBlock node) {

	    RuntimeObject result = memory.voidINSTANCE;
	    // process the statements
	    ArrayList res = visitList(node.getFStatement());
	    
	    if (res.size() > 0) 
	        result = (RuntimeObject)res.get(res.size()-1);
	    
		
		return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visit(FClass node) {
	    throw new Error("INTERPRETER INTERNAL ERROR : visit a FClass");
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
        interpreterContext.peekCallFrame().pushExpressionContext();
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
	        	System.err.println("Loop : evaluation of the condition part does not result in a boolean value.");
	        	throw new Error("INTERPRETER INTERNAL ERROR : Loop : evaluation of the condition part does not result in a boolean value.");
	        }
	        
	        if (! cond_value)
	        	this.accept(node.getFBody());
	    } while (! cond_value);
	    
	    // Pop the expression context
	    interpreterContext.peekCallFrame().popExpressionContext();
	    return memory.voidINSTANCE;
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
	    
	    // push expression context
	    interpreterContext.peekCallFrame().pushExpressionContext();
	    
	    // Interpret body
	    this.accept(node.getFBody());
	    
	    // Set the result
	    RuntimeObject result = interpreterContext.peekCallFrame().getOperationResult();
	    
	    // Pop the expressionContext
	    interpreterContext.peekCallFrame().popExpressionContext();
		return result;
	}
	
	

	
	
	public Object visit(FCallFeature node) {
	    boolean isFeatured = false;
	   
	    FClass t_target = null; // Type of the "callee"
	    RuntimeObject result = null; // The result to be returned by this visit
	    RuntimeObject ro_target = null; // Runtime repr. of target
	    
	    // Get the target of the call
	    if (node.getFTarget() == null) {
	        // Self if nothing is specified
	        ro_target = interpreterContext.peekCallFrame().getSelf();
	    }
	    else {
	        ro_target = (RuntimeObject)this.accept(node.getFTarget());
	    }
	    
	    
	    if (ro_target == null) {
	        internalLog.error("INTERPRETER INTERNAL ERROR : Call on a null target");
	        throw new Error("INTERPRETER INTERNAL ERROR : Call on a null target");
	    }
	    
	    // Get The type of the Object
	    t_target =(FClass)((RuntimeObject)ro_target.getMetaclass()).getData().get("kcoreObject");
	    
	    // This is just a test for debbuging the interpreter. It should never occur
	    if (t_target == null) {
	        internalLog.error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
	        throw new Error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
	    }

		// Get the feature
		Object feature = getFeatureFromFeatureCall(t_target, node);
		
//		 Check that target is not void
	    if (feature == null && ro_target == memory.voidINSTANCE) {
	        internalLog.info(" >> INTERPRETER REPORTS Call on a void target. TODO: raise an exception");
	        throw new KermetaRaisedException(ro_target, this);
	    }
		
		// This should never happend is the type checker has checked the program
		if (feature == null) {
		    internalLog.error("INTERPRETER INTERNAL ERROR : unable to find a feature");
	        throw new Error("INTERPRETER INTERNAL ERROR : unable to find a feature");
		}
		
		// The feature can be either an operation or a property
		
		// Is the callfeature an operation call? So that we create a new call
		// frame and accept this operation in order to process it.
		if (feature instanceof FOperation)
		{
			// Get the parameters of this operation
			ArrayList parameters = visitList(node.getFParameters());
			// Get the FOperation corresponding to this operation call
			FOperation foperation = (FOperation)feature;
			// Create a context for this operation call, setting self object to ro_target
			interpreterContext.pushOperationCallFrame(ro_target, foperation, parameters);
			
			// Resolve this operation call
			result = (RuntimeObject)this.accept(foperation);
			// After operation has been evaluated, pop its context
			interpreterContext.popCallFrame();
		}
		// Is it a property? If yes, update the RuntimeObject repr.g the target node !
		else if (feature instanceof FProperty)
		{
		    FProperty fproperty = (FProperty)feature;
		    // Get the runtime object corresponding to the property
		    RuntimeObject ro_property = getRuntimeObjectForFProperty(t_target, fproperty.getFName());
		    
		    // This is just a debbuging check. It should never occur
		    if (feature == null) {
			    internalLog.error("INTERPRETER INTERNAL ERROR : Unable to find runtime object corresponding to property " + fproperty.getFName());
		        throw new Error("INTERPRETER INTERNAL ERROR : Unable to find runtime object corresponding to property " + fproperty.getFName());
			}
		    
		    // Get the value of the property
		    result = fr.irisa.triskell.kermeta.runtime.language.Object.get(ro_target, ro_property);
		}
		
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
            internalLog.error("NoSuchMethodException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!", e1);
			throw	new KermetaVisitorError("NoSuchMethodException invoking "+ jmethodName + " on Class " +jclassName  ,e1);
        }
        Object result = null;
        try {
            result = jmethod.invoke(null, paramsArray);
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
		            internalLog.error("InvocationTargetException invoking "+ jmethodName + " on Class " +jclassName , e2);
		            
					throw	new KermetaVisitorError("InvocationTargetException invoking "+ jmethodName + " on Class " +jclassName  ,e2);
		        }
            
        } catch (Throwable e2) {
            internalLog.error("InstantiationException invoking "+ jmethodName + " on Class " +jclassName, e2);
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
	    return fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(node.getFValue(), memory.getROFactory());
	}
	
	/**
	 * @return the value of this node as a boolean
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBooleanLiteral) 
	 */
	public Object visit(FBooleanLiteral node) {
	    return memory.getRuntimeObjectForBoolean(node.isFValue());
	}
	
	public Object visit(FEnumerationLiteral node)
	{
	    throw new Error("INTERPRETER ERROR : Enumeration NOT IMPLEMENTED !");
	}
	
    /** 
     * @return the value of this node as a runtime object
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.FStringLiteral)
     */
    public Object visit(FStringLiteral node) {
        RuntimeObject result = fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFValue(), memory.getROFactory());
        return result;
    }
	/**
	 * Visit a classDefinition node has the following consequences :
	 * - create the "self" RuntimeObject and link it to the current CallFrame context 
	 */
	public Object visit(FClassDefinition node)
	{
	    // Get the qualified name of this class
	    String qname = memory.getUnit().getQualifiedName(node);
	    RuntimeObject result = memory.getROFactory().getTypeDefinitionByName(qname);
	    //node.getFOwnedOperation().
	    // Set the attribute self_object of current frame, so that we can manipulate it
	    return result;
	}
	
	
	
    /**
     * visit a raise node
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.FRaise)
     */
    public Object visit(FRaise node) {
        // TODO : improve this to allow exception to be rescued.
        RuntimeObject exception = (RuntimeObject)this.accept(node.getFExpression());       
        throw new KermetaRaisedException(exception, this);
    }
    /**
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.FRescue)
     */
    public Object visit(FRescue node) {
        throw new Error("INTERPRETER ERROR : visit(FRescue node) NOT IMPLEMENTED !");
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
	    FTypeDefinition typeDef = memory.getUnit().getTypeDefinitionByName(name);
	    return typeDef;
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
  */
    /**
     * This is a helper (TODO : move it in a specific class) that returns the precise
     * type of the <code>feature</code> that is "applied" to the given <code>target</code>.
     * If the type of the type reference of the target is a "FClass", then we have to find out
     * if feature is an operation or an attribute. We can find that it is an operation if there
     * are parameters, but in the other case (no parameters) we have no way to find it.
     * @param type the type reference of the "callee" element on which feature is "called"
     * @param feature_call the feature of which we want the type (FOperation, FAttribute)
     * @return the ecore object representing this feature. Its real type is either FProperty or FOperation
     */
    public Object getFeatureFromFeatureCall(FClass target_class, FCallFeature feature_call)
    {
        Object result = null;
        
        // Crete the type corresponding to the target
        SimpleType target = new SimpleType(target_class);
        
        // Check if it is a property call
        CallableProperty cp = target.getPropertyByName(feature_call.getFName());
        if (cp != null) result = cp.getProperty();
        
        // Check if it is an operation call
        if (result == null) {
            CallableOperation co = target.getOperationByName(feature_call.getFName());
            if (co != null) result = co.getOperation();
        }
        
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
    
    
    public InterpreterContext getInterpreterContext() {
    	return this.interpreterContext;
    }    
}
