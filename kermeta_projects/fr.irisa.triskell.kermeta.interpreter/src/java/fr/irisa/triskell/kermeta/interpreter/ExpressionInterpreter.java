/* $Id: ExpressionInterpreter.java,v 1.70 2008-04-29 10:01:22 ftanguy Exp $
 * Project : Kermeta (First iteration)
 * File : ExpressionInterpreter.java
 * License : EPL
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.interpreter.internal.AssignmentInterpreter;
import org.kermeta.interpreter.internal.BlockInterpreter;
import org.kermeta.interpreter.internal.BooleanLiteralInterpreter;
import org.kermeta.interpreter.internal.CallFeatureInterpreter;
import org.kermeta.interpreter.internal.CallResultInterpreter;
import org.kermeta.interpreter.internal.CallSuperOperationInterpreter;
import org.kermeta.interpreter.internal.CallValueInterpreter;
import org.kermeta.interpreter.internal.CallVariableInterpreter;
import org.kermeta.interpreter.internal.ConditionalInterpreter;
import org.kermeta.interpreter.internal.IntegerLiteralInterpreter;
import org.kermeta.interpreter.internal.JavaStaticCallInterpreter;
import org.kermeta.interpreter.internal.LambdaExpressionInterpreter;
import org.kermeta.interpreter.internal.LoopInterpreter;
import org.kermeta.interpreter.internal.RaiseInterpreter;
import org.kermeta.interpreter.internal.SelfExpressionInterpreter;
import org.kermeta.interpreter.internal.StringLiteralInterpreter;
import org.kermeta.interpreter.internal.TypeLiteralInterpreter;
import org.kermeta.interpreter.internal.VariableDeclInterpreter;
import org.kermeta.interpreter.internal.VoidLiteralInterpreter;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.behavior.CallValue;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.behavior.Loop;
import fr.irisa.triskell.kermeta.language.behavior.Raise;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;
import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
import fr.irisa.triskell.kermeta.language.behavior.StringLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.behavior.VoidLiteral;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypedElement;
import fr.irisa.triskell.kermeta.loader.java.JarCache;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * This is the Java version of kermeta interpreter. It extends the KermetaVisitor, and each
 * visit returns a result of type <code>RuntimeObject</code>.
 */
public class ExpressionInterpreter extends KermetaOptimizedVisitor {

    
    //The only state variable of the interpreter should be the context and the memory
    /** The global context */
    protected InterpreterContext interpreterContext;
    
    public void setInterpreterContext(InterpreterContext context) {
    	interpreterContext = context;
    }
    
    /** The memory */
    public RuntimeMemory memory;
    /** The current variable that is processed. Used for traceback when a CallOnVoidTarget occured */
    public Variable current_variable;
        
	/**		Stating if the interpreter finished the visit.		*/
	protected boolean _terminated = false;
    
	/**
	 * 
	 * @return true if the interpreter has finished, false otherwise.
	 */
	public boolean isTerminated() {
		return _terminated;
	}	
	
    /**
     * Constructor
     * @param pContext
     * @param unit the main kermetaUnit ..
     */
    public ExpressionInterpreter(RuntimeMemory pMemory) {
        interpreterContext = new InterpreterContext(pMemory);
        memory = pMemory; 
    }
    
    public void releaseResources() {
    	interpreterContext = null;
    	memory.freeJavaMemory();
    	current_variable = null;
    }
    
	public void setContextClassLoader(ClassLoader cl) {
		Thread.currentThread().setContextClassLoader(cl);
	}
    
    /**
	 * Invoke the foperation argument on the ro_target Runtime Object;
	 *  arguments to this call are given as an ArrayList
	 * @param ro_target
	 * @param foperation
	 * @param arguments
	 * @return
	 */
	public Object invoke(RuntimeObject ro_target,Operation foperation, List<RuntimeObject> arguments) {
		RuntimeObject result=null;
		RuntimeObjectFactory roFactory = memory.getROFactory(); 
		
		fr.irisa.triskell.kermeta.language.structure.Class self_type = (fr.irisa.triskell.kermeta.language.structure.Class)ro_target.getMetaclass().getKCoreObject();
		
		CallableOperation op = new CallableOperation(foperation, self_type);
		
        // Create a context for this operation call, setting self object to ro_target
        interpreterContext.pushOperationCallFrame(ro_target, op, arguments, null);
        try {
	        // Resolve this operation call
	        result = (RuntimeObject)this.accept(foperation);
        }
        finally {
	        // After operation has been evaluated, pop its context
	        interpreterContext.popCallFrame();
	        terminate();
        }
		return result;
	}
	
	public void terminate() {
		_terminated = true;
	}
	
	/***
	 * A variable declaration : when we encounter it, we add it to the expression context
	 * of the current frame
	 * @return
	 */
	public Object visitVariableDecl(VariableDecl node) {
		return VariableDeclInterpreter.doIt(node, this);
	}
		
    public Object visitTypeLiteral(TypeLiteral node) {
    	return TypeLiteralInterpreter.doIt(node, this);
    }
    
    public Object visitVoidLiteral(VoidLiteral node) {
        return VoidLiteralInterpreter.doIt(node, this);
    }
    
	/**
	 * Returns the RuntimeObject representation of the property specified by 
	 * <code>propertyName</code>, for the instance specified by <code>ro_target</code>
	 * @param fclass the type of the object represented by <code>ro_target</code>
	 * @param propertyName The name of the properties of which we want the value
	 * @return the RuntimeObject that repr. the value of the property for the given ro_target
	 */
	public RuntimeObject getRuntimeObjectForProperty(fr.irisa.triskell.kermeta.language.structure.Class fclass, String propertyName)
	{
	    // Create the corresponding type
	    SimpleType target = new SimpleType(fclass);
	    // find the property
	    CallableProperty cproperty = target.getPropertyByName(propertyName);
	    //CallableProperty cproperty = this.interpreterContext.typeCache.getPropertyByName(target, propertyName);
	    
	    // DEBUG : This should never happen
	    if (cproperty == null) {
	        internalLog.error("INTERPRETER INTERNAL ERROR : unable to find property " + propertyName + " in type " + target);
	        throw new Error("INTERPRETER INTERNAL ERROR : unable to find property " + propertyName + " in type " + target);
	    }
	    
	    // Get the runtime object in the memory correspondance table
	    RuntimeObject result = memory.getRuntimeObjectForFObject(cproperty.getProperty());
	    
	    // DEBUG : This should never happen
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
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Assignment)
	 */
	public Object visitAssignment(Assignment node) {
		return AssignmentInterpreter.doIt(node, this);
	}
	
	public void setDerivedProperty(RuntimeObject ro_target, CallableProperty property, RuntimeObject rhs_value, CallExpression exp) {
		interpreterContext.pushOperationCallFrame(ro_target, property, null, exp);
        interpreterContext.peekCallFrame().setCallValueResult(rhs_value);
        // Get the setter body
        this.accept(property.getProperty().getSetterBody());
        interpreterContext.popCallFrame();
	}
	
	
    /**
     * CallSuperOperation corresponds to the kermeta instruction "super"
     * Usually, its properties are : 
     * name = super 
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.CallSuperOperation)
     */
    public Object visitCallSuperOperation(CallSuperOperation node) {
    	return CallSuperOperationInterpreter.doIt(node, this);
    }
    
	/**
	 * Visit a lambda expression. We visit a lambda expression in two cases :
	 * - when we defined one and assigned it to a variable
	 * - when we call one  
	 */
	public Object visitLambdaExpression(LambdaExpression node) {
		return LambdaExpressionInterpreter.doIt(node, this);
	}
	
	/**
	 * The result node corresponds to the return value of the operation that is currently 
	 * processed.
	 * We also store it as a variable (for the moment)
	 */
	public Object visitCallResult(CallResult node) {
		return CallResultInterpreter.doIt(node, this);
	}
	
	/**
	 * CallValue is the special variable "value" in the setter method of a derived
	 * property
	 */
	public Object visitCallValue(CallValue node) {
		return CallValueInterpreter.doIt(node, this);
	}
	
	/**
     * If the visited element is a Variable, then we search its value in the
     * InterpreterContext
     */
    public Object visitCallVariable(CallVariable node) {
    	return CallVariableInterpreter.doIt(node, this);
    }
	
	public Object visitSelfExpression(SelfExpression node) {
		return SelfExpressionInterpreter.doIt(node, this);
	}

	/**
	 * Evaluate the sequence of instructions in this block.
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Block)
	 */
	public Object visitBlock(Block node) {
		return BlockInterpreter.doIt(node, this);
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node) {
	    throw new Error("INTERPRETER INTERNAL ERROR : visit a Class");
	}
	
	public Object visitModelType(ModelType node) {
		if (node!=null) setParent(node);
	    // Get the qualified name of this modelType
	    String qname = NamedElementHelper.getQualifiedName(node);
	    RuntimeObject result = memory.getROFactory().getTypeDefinitionByName(qname);
	    return result;
	}
	
	/**
	 * Interprete the IF instruction
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Conditional)
	 */
	public Object visitConditional(Conditional node) {
		return ConditionalInterpreter.doIt(node, this);
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Loop)
	 */
	public Object visitLoop(Loop node) {
		return LoopInterpreter.doIt(node, this);
	}
	
	/**
	 * Visit an operation definition. 
	 * This visit usually follows the visit of a CallFeature that is an operation call 
	 * This has the following steps :
	 * 	- Create an expression context for the variables defined at "top level" in this operation
	 *
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation node) {
		if (node!=null) setParent(node);
	    RuntimeObject result = memory.voidINSTANCE;
	    // push expression context
	    interpreterContext.peekCallFrame().pushExpressionContext();
	    interpreterContext.peekCallFrame().peekExpressionContext().setStatement(node.getBody());
	    try {
		    // Interpret body
	    	if(node.getBody() != null)
	    		this.accept(node.getBody());
	    	else {// replace an empty body by a raise kermeta::exceptions::NotImplementedException.new	    		
	    		throw KermetaRaisedException.createKermetaException("kermeta::exceptions::NotImplementedException",
	            		"the operation " + node.getName() +" has not body",
	    				this,
	    				memory,
	    				node,
	    				null);
	    	}
		    // Set the result
		    result = interpreterContext.peekCallFrame().getOperationResult();
	    }
	    finally {
		    // Pop the expressionContext
		    interpreterContext.peekCallFrame().popExpressionContext();
	    }
		return result;
	}

	/**
	 * Used for derived properties when processing getter and setter body
	 */
    public RuntimeObject getterDerivedProperty(CallableProperty property, RuntimeObject ro_target, CallExpression expression)
    {
        RuntimeObject result = memory.voidINSTANCE;
        interpreterContext.pushOperationCallFrame(ro_target, property, null, expression);
        // Would a special DerivedPropertyCallFrame be better instead of that?
	    try {	        // Interpret body
	    	if(property.getProperty().getGetterBody() !=  null){
	    		this.accept(property.getProperty().getGetterBody());
	    		// Getter is an operation which returns an element of type Property.getFType
	    		// 	Set the result 
	    		result = interpreterContext.peekCallFrame().getOperationResult();
	    	}
	    	else{
	    		internalLog.error("INTERPRETER INTERNAL ERROR : derived property  " + property.getName() + " has no getter body");
		        throw new Error("INTERPRETER INTERNAL ERROR : derived property  " + property.getName() + " has no getter body");
	    	}
	    }
	    finally {
		    interpreterContext.popCallFrame();
	    }

		return result;
    }
    
    
	public Object visitCallFeature(CallFeature node) {
		return CallFeatureInterpreter.doIt(node, this);
	}

	/** special code for dealing with java proxies
	 * @param property 
	 * 
	 * @param operation
	 * @return
	 */
	public RuntimeObject getPropertyOnProxy(RuntimeObject roSelf, RuntimeObject ro_property, Property node) {
		if(!RuntimeObject.JAVA_OBJECT.equals(roSelf.getPrimitiveType())  ){
   		 	throw KermetaRaisedException.createKermetaException("kermeta::exceptions::CallOnVoidTarget",
   	        		"This is a proxy for a java object but this java object was not initialized",
   					this, memory, node,
   					null);
		}
		RuntimeObject result = memory.voidINSTANCE;
		try {

			Object self = roSelf.getJavaNativeObject();    	
			Field field = getJavaField(node);
			Object returnedObject = field.get(self);
    		result = convertJavaObjectToRuntimeObject(node,returnedObject);
		} catch (IllegalArgumentException e) {
			 throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
	 	        		"Problem calling java operation or constructor " + node.getName(),
	 					this, memory, node,
	 					e);
		} catch (IllegalAccessException e) {
			 throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
	 	        		"Problem calling java operation or constructor " + node.getName(),
	 					this, memory, node,
	 					e);
		}
		return result;
	}

	/** special code for dealing with java proxies
	 * 
	 * @param operation
	 * @return
	 */
    public RuntimeObject invokeOperationOnProxy(Operation node, List<RuntimeObject> pParameters) {
    	
    	if (node!=null) setParent(node);
	    RuntimeObject result = memory.voidINSTANCE;
	    // push expression context
	    interpreterContext.peekCallFrame().pushExpressionContext();
	    interpreterContext.peekCallFrame().peekExpressionContext().setStatement(node.getBody());
	    internalLog.debug(" Invoking java proxy for " + node.getName());
	       
	    try {
		    // if the operation is not an initialize function and the object is not initialized then fail
	    	RuntimeObject roSelf = interpreterContext.peekCallFrame().getSelf();
	    	if(!RuntimeHelper.isInitOperation(node) && !RuntimeObject.JAVA_OBJECT.equals(roSelf.getPrimitiveType())){
	    		 throw KermetaRaisedException.createKermetaException("kermeta::exceptions::CallOnVoidTarget",
	    	        		"This is a proxy for a java object but this java object was not initialized",
	    					this, memory, node,
	    					null);
	    	}	    	
	    	// run  the operation
	    	if(RuntimeHelper.isInitOperation(node)){
	    		// this is a creation
	    		// retreives the constructor
	    		Constructor constructor = getJavaConstructor(node);
	    		if(constructor == null){
	    			throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
	    	        		"Failed to retrieve the java constructor associated to the Kermeta operation; probably a problem with the JarCache",
	    					this, memory, node,
	    					null);
	    		}
	    		// build the parameters
	    		Object[] args = buildJavaArgs(pParameters, constructor.getParameterTypes());
	    		Object newInstance = constructor.newInstance(args);
	    		// this is an initialize function, use its result to set the javaObject
	    		roSelf.setPrimitiveType(RuntimeObject.JAVA_OBJECT);
	    		roSelf.setJavaNativeObject(newInstance);
	    		result = roSelf;
	    	}
	    	else {
		    	// find the java object
	    		Object self = roSelf.getJavaNativeObject();
		    	// retreive the method
	    		Method method = getJavaMethod(node);
	    		if(method !=  null ){
	    			Object[] args = buildJavaArgs(pParameters, method.getParameterTypes());
	    			Object returnedObject = method.invoke(self, args);	    				    		
	    			result = convertJavaObjectToRuntimeObject(node,returnedObject);
	    		}
	    		else{
	    			// this is probably an operation defined on Object
	    			// DVK : or this is a problem with JarCache, must deal with this situation ?
	    			getJavaMethod(node);
	    			result = (RuntimeObject)this.accept(node);
	    		}
	    	}
	    	
	    } catch (IllegalArgumentException e) {
	    	 throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
 	        		"Problem calling java operation or constructor " + node.getName(),
 					this, memory, node,
 					e);
		} catch (InstantiationException e) {
	    	 throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
	 	        		"Problem calling java operation or constructor " + node.getName(),
	 					this, memory, node,
	 					e);
		} catch (IllegalAccessException e) {
	    	 throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
	 	        		"Problem calling java operation or constructor " + node.getName(),
	 					this, memory, node,
	 					e);
		} catch (InvocationTargetException e) {
	    	 throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
	 	        		"Problem calling java operation or constructor " + node.getName(),
	 					this, memory, node,
	 					e);
		}
	    finally {
		    // Pop the expressionContext
		    interpreterContext.peekCallFrame().popExpressionContext();
	    }
		return result;    	
	}
    
    /** creates the appropriate object depending on the required returntype
     * 
     * @param typedElement
     * @param returnedObject
     * @return
     */ 
    private RuntimeObject convertJavaObjectToRuntimeObject(TypedElement typedElement,Object returnedObject){
    	RuntimeObject result = memory.voidINSTANCE;
    	//    	 Set the result
		RuntimeObject returnType = this.getMemory().getRuntimeObjectForFObject(typedElement.getType());
		//RuntimeObject stringType = this.getMemory().getTypeDefinitionAsRuntimeObject("kermeta::standard::String");
		String returnTypeQName = TypeHelper.getMangledQualifiedName((Type) returnType.getKCoreObject());
		if (returnedObject ==  null){
			result = getMemory().voidINSTANCE;
		}	
		else if("kermeta::standard::String".equals(returnTypeQName)){
		
			result = fr.irisa.triskell.kermeta.runtime.basetypes.String.create((String)returnedObject, getMemory().getROFactory())	;    			
		}
		else if("kermeta::standard::Integer".equals(returnTypeQName)){
			result = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create((Integer)returnedObject, getMemory().getROFactory());
		}
		else if("kermeta::standard::Boolean".equals(returnTypeQName)){
			if((Boolean)returnedObject) result = getMemory().trueINSTANCE;
			else result = getMemory().falseINSTANCE;
		}
		else if("kermeta::standard::Void".equals(returnTypeQName)){
			result = getMemory().voidINSTANCE;
		}
		else{
			result = this.getMemory().getROFactory().createObjectFromClassDefinition(returnType);
    		result.setPrimitiveType(RuntimeObject.JAVA_OBJECT);
			result.setJavaNativeObject(returnedObject);
    		
		}
		return result;
    }

    /** build java arguments from kermeta parameters 
     * 
     * @param parameters
     * @param javaTypes 
     * @return
     */
    private Object[] buildJavaArgs(List<RuntimeObject> parameters, Class[] javaTypeParams) {
		Object[] result = new Object[parameters.size()];
		for(int i = 0; i < parameters.size(); i++){
			RuntimeObject fparam = (RuntimeObject)parameters.get(i);
			Object javaObject = fparam.getJavaNativeObject();
			String typename = javaTypeParams[i].getName();
			if(typename.equals("java.lang.String")){
				result[i] = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(fparam);
			}
			else if(typename.equals("java.lang.Integer")){
				result[i] = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(fparam);
			}
			else if(typename.equals("int")){
				result[i] = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(fparam);
			}
			else if(typename.equals("boolean")){
				result[i] = fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(fparam);
			}
			else if(javaObject != null){
				result[i] = javaObject;
			}
			else{
				result[i] = null;
			}
		}
		return result;
	}

	/** retrieves the java constructor for a given operation
     * 
     * @param operation
     * @return
     */
    protected Constructor getJavaConstructor(Operation operation){
    	Constructor constructor = null;
    	KermetaUnit kermetaUnit = KermetaUnitHelper.getKermetaUnitFromObject( operation );
    	if ( kermetaUnit != null ) {
    		JarCache cache = JarCache.getJarCache( kermetaUnit );
    		if ( cache != null ) {
    			constructor = cache.getConstructor( operation );
    		}
    	}
    	return constructor;
    }
    
    /** retrieves the java method for a given operation
     * 
     * @param operation
     * @return
     */
    protected Method getJavaMethod(Operation operation){
    	Method method = null;
    	KermetaUnit kermetaUnit = KermetaUnitHelper.getKermetaUnitFromObject( operation );
    	if ( kermetaUnit != null ) {
    		JarCache cache = JarCache.getJarCache( kermetaUnit );
    		if ( cache != null ) {
    			method = cache.getMethod( operation );
    		}
    	}
    	return method;
    }
    /** retrieves the java field for a given property
     * 
     * @param operation
     * @return
     */
    protected Field getJavaField(Property prop){
    	Field field = null;
    	KermetaUnit kermetaUnit = KermetaUnitHelper.getKermetaUnitFromObject( prop );
    	if ( kermetaUnit != null ) {
    		JarCache cache = JarCache.getJarCache( kermetaUnit );
    		if ( cache != null ) {
    			field = cache.getField( prop );
    		}
    	}
    	return field;
    }
	/**
     * Visit a JavaStaticCall : 
     * 		extern a::b::c.d()
     * We use java reflection to visit a JavaStaticCall.
     * For this case, by definition every linked Java methods have one type
     * of parameters, which is always a RuntimeObject.
     * @return
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.JavaStaticCall)
	 */
	public Object visitJavaStaticCall(JavaStaticCall node) {
		return JavaStaticCallInterpreter.doIt(node, this);
	}
    
	/* -----------------------------------------------------------------------------
	 * 
	 * VISIT PRIMITIVE TYPES
	 * 
	 * -----------------------------------------------------------------------------
	 */
	
	/**
	 * @return the value of this node as an integer
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.IntegerLiteral) 
	 */
	public Object visitIntegerLiteral(IntegerLiteral node) {
		return IntegerLiteralInterpreter.doIt(node, this);
	}
	
	/**
	 * @return the value of this node as a boolean
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.BooleanLiteral) 
	 */
	public Object visitBooleanLiteral(BooleanLiteral node) {
		return BooleanLiteralInterpreter.doIt(node, this);
	}
	
	public Object visitEnumerationLiteral(EnumerationLiteral node)
	{
	    throw new Error("INTERPRETER ERROR : Enumeration NOT IMPLEMENTED !");
	}
	
    /** 
     * @return the value of this node as a runtime object
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.StringLiteral)
     */
    public Object visitStringLiteral(StringLiteral node) {
    	return StringLiteralInterpreter.doIt(node, this);
    }
    
	/**
	 * Visit a classDefinition node has the following consequences :
	 * - create the "self" RuntimeObject and link it to the current CallFrame context 
	 */
	public Object visitClassDefinition(ClassDefinition node)
	{
		if (node!=null) setParent(node);
	    // Get the qualified name of this class
	    String qname = NamedElementHelper.getQualifiedName(node);
	    RuntimeObject result = memory.getROFactory().getTypeDefinitionByName(qname);
	    return result;
	}
	
    /**
     * visit a raise node
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.Raise)
     */
    public Object visitRaise(Raise node) {
    	return RaiseInterpreter.doIt(node, this);
    }
    
    /**
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.Rescue)
     */
    public Object visitRescue(Rescue node) {
        throw new Error("INTERPRETER ERROR : visit(Rescue node) NOT IMPLEMENTED !");
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
	 * This node is a CallExpression
	 * @param node
	 * @return
	 */
	public Object getReturnType(CallExpression node)
	{
	    // get node name
	    String name = node.getName();
	    //String qualifiedName = getQualifiedName(node);
	    // get its definition
	    TypeDefinition typeDef = memory.getUnit().getTypeDefinitionByName(name);
	    return typeDef;
	}
	

	
	/**
	 * visit a list of expressions (statements, parameters)
	 * @param expressions
	 * @return an ArratList of RuntimeObjects
	 */
	public List<RuntimeObject> visitList(EList<Expression> expressions) {
		List<RuntimeObject> result_list = new ArrayList<RuntimeObject>();
		for (Expression next : expressions) {
			result_list.add( (RuntimeObject) accept(next) );
		}
		return result_list;
	}
	
	/**
	 * Visit a list of statements. Used when we visit the Block element.
	 * The only difference with visitList is that it updates the attribute
	 * "statement" in the ExpressionContext of the interpreter, so that we know
	 * which statement is currently evaluated in a debug mode. It does not
	 * modify the original behavior of the interpreter.
	 * @param expressions a list of statements
	 * @return an ArrayList of RuntimeObjects
	 */
	public List<RuntimeObject> visitStatementList(EList<Expression> expressions) {
		List<RuntimeObject> result_list = new ArrayList<RuntimeObject>();
		for (Expression next : expressions) {
			interpreterContext.peekCallFrame().peekExpressionContext().setStatement((EObject) next);
			result_list.add( (RuntimeObject) accept(next) );
		}
		return result_list;
	}

	/**
     * Return a human-readable representation of the stack trace of the program until the
     * exception occurrence.
     */
    public String computeCurrentContextString()
    {
        String context;
        if(this.getParent() != null) {
	        context = new Traceback(this, this.getParent()).getStackTrace();	        
        }
        else {
        	context = "Context not available : current state is null";
        }
        return context;
    }

    /**
     * 
     * @param obj the runtimeObject that is raised. Should be an instance of
     * a kermeta::exceptions::Exception. 
     * @param node the node that is wrong. Usually, it is an Expression, but not mandatory
     */
    public void raiseKermetaException(RuntimeObject obj, fr.irisa.triskell.kermeta.language.structure.Object node) {
        RuntimeObject rnode = this.getMemory().getRuntimeObjectForFObject(node);
        KermetaRaisedException e = new KermetaRaisedException(obj, rnode, this);
        e.setContextString(this,rnode);
        throw new KermetaRaisedException(obj, rnode, this);	
    }   
    
    public void raiseCallOnVoidTargetException(fr.irisa.triskell.kermeta.language.structure.Object node, String additionalmsg) {
    	//RuntimeObjectFactory rofactory = memory.getROFactory();
    	//RuntimeObject raised_object = rofactory.createObjectFromClassName("kermeta::exceptions::CallOnVoidTarget");
    	
    	//RuntimeObject rnode = this.getMemory().getRuntimeObjectForFObject(node);
        //throw new KermetaRaisedException(raised_object, rnode, this);	
        throw KermetaRaisedException.createKermetaException("kermeta::exceptions::CallOnVoidTarget",
        		additionalmsg,
				this,
				memory,
				node,
				null);
    }
    
    public InterpreterContext getInterpreterContext() {
    	return this.interpreterContext;
    }    
    public RuntimeMemory getMemory() {
        return memory;
    }
        
}