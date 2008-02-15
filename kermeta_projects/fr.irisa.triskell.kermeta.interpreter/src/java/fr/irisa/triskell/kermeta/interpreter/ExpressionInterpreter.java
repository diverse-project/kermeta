/* $Id: ExpressionInterpreter.java,v 1.67 2008-02-15 14:22:59 dvojtise Exp $
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
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.parser.helper.SimpleKWList;
import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.error.KermetaVisitorError;
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
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.TypedElement;
import fr.irisa.triskell.kermeta.loader.java.JarCache;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
import fr.irisa.triskell.kermeta.runtime.FrameworkExternCommand;
import fr.irisa.triskell.kermeta.runtime.RuntimeHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeLambdaObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;
import fr.irisa.triskell.kermeta.typechecker.TypeVariableEnforcer;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * This is the Java version of kermeta interpreter. It extends the KermetaVisitor, and each
 * visit returns a result of type <code>RuntimeObject</code>.
 */
public class ExpressionInterpreter extends KermetaOptimizedVisitor {

    
    //The only state variable of the interpreter should be the context and the memory
    /** The global context */
    protected InterpreterContext interpreterContext;
    /** The memory */
    protected RuntimeMemory memory;
    /** The current variable that is processed. Used for traceback when a CallOnVoidTarget occured */
    protected Variable current_variable;
    /** The reason/state of the debugging
    (among stepEnd, stepInto, stepOver.) */
    public String currentState = "";
    
    // Constants telling the state of the interpration
    public static final String DEBUG_RESUME = "resume";
    public static final String DEBUG_SUSPEND = "suspend";
    public static final String DEBUG_TERMINATE = "terminate";
    
    /**
     * Constructor
     * @param pContext
     * @param unit the main kermetaUnit ..
     */
    public ExpressionInterpreter(RuntimeMemory pMemory)
    {
        interpreterContext = new InterpreterContext(pMemory);
        pMemory.setCurrentInterpreter(this);
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
	public Object invoke(RuntimeObject ro_target,Operation foperation, ArrayList<RuntimeObject> arguments) {
		RuntimeObject result=null;
		setCurrentState(DEBUG_RESUME);
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
	        setCurrentState(DEBUG_TERMINATE);
        }
		return result;
	}
	
	/***
	 * A variable declaration : when we encounter it, we add it to the expression context
	 * of the current frame
	 * @return
	 */
	public Object visitVariableDecl(VariableDecl node)
	{
		if (node!=null) setParent(node);
		RuntimeObject ro_init = memory.voidINSTANCE;
		shouldTerminate();
		// is it a classic case?
		// TODO : compare qualified names otherwise this test could be sometimes false
		if (FunctionType.class.isInstance(node.getType().getType()))
		{
		    internalLog.info("Type of variable declaration : "+node.getType().getName());
		}
		if (node.getInitialization()!=null)
		   ro_init = (RuntimeObject)this.accept(node.getInitialization());
		
		interpreterContext.peekCallFrame().peekExpressionContext().defineVariable(
	             node.getIdentifier(), ro_init);
		return ro_init;
	}
	
	
	
    public Object visitTypeLiteral(TypeLiteral arg0) {
        RuntimeObject result = null;
        if (arg0!=null) setParent(arg0);
        Type t = ((SimpleType)TypeCheckerContext.getTypeFromMultiplicityElement(arg0.getTyperef())).getType();
       
        if (t instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
        	fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class)t;
	        // FIXME : Type variables should be handled here (substitutions of variables) done ?
	        if (c.getTypeParamBinding().size() != 0) {
	        	@SuppressWarnings("unused")
				fr.irisa.triskell.kermeta.language.structure.Class self_class = (fr.irisa.triskell.kermeta.language.structure.Class)interpreterContext.peekCallFrame().getSelf().getMetaclass().getKCoreObject();
	            c = (fr.irisa.triskell.kermeta.language.structure.Class)TypeVariableEnforcer.getBoundType(c, interpreterContext.peekCallFrame().getTypeParameters());
	            
	        }    
	        result = memory.getROFactory().createMetaClass(c);
        } else if (t instanceof ModelType) {
        	result = memory.getRuntimeObjectForFObject(t);
    	} else if (t instanceof TypeVariable) {
        	// Find the bound type for this variable
        	fr.irisa.triskell.kermeta.language.structure.Type boundType = (Type) interpreterContext.peekCallFrame().getTypeParameters().get(t);
        	result = memory.getRuntimeObjectForFObject(boundType);
        }
        else {
            // It is an enumeration
            result = memory.getRuntimeObjectForFObject(t);
        }
        
        return result;
    }
    
    
    public Object visitVoidLiteral(VoidLiteral arg0) {
        return memory.voidINSTANCE;
    }
	/**
	 * Returns the RuntimeObject representation of the property specified by 
	 * <code>propertyName</code>, for the instance specified by <code>ro_target</code>
	 * @param fclass the type of the object represented by <code>ro_target</code>
	 * @param propertyName The name of the properties of which we want the value
	 * @return the RuntimeObject that repr. the value of the property for the given ro_target
	 */
	protected RuntimeObject getRuntimeObjectForProperty(fr.irisa.triskell.kermeta.language.structure.Class fclass, String propertyName)
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
		if (node!=null) setParent(node);
		shouldTerminate();
		// The name of the call
		String lhs_name = node.getTarget().getName();
		
		 // The new value 
		RuntimeObject rhs_value = (RuntimeObject)this.accept(node.getValue());
		
		
		if (node.isIsCast()) {
			
			// Just to be sure !!
			if (node.getTarget().getStaticType() == null) {
				throw new Error("THE PROGRAM CANNOT BE EXECUTED BECAUSE IT HAS NOT BEEN TYPE CHECKED");
			}
			
			Type r = (Type)TypeVariableEnforcer.getBoundType(node.getTarget().getStaticType(), interpreterContext.peekCallFrame().getTypeParameters());
			
			SimpleType expectedType = new SimpleType(r);
			fr.irisa.triskell.kermeta.language.structure.Class p = (fr.irisa.triskell.kermeta.language.structure.Class)rhs_value.getMetaclass().getKCoreObject();
			SimpleType providedtype = new SimpleType(p);
			
			
			/******************************/
			/* BEGINNING OF HORRIBLE THING */
			/******************************/
			// Type collection of object
			fr.irisa.triskell.kermeta.language.structure.Class coll_class = StructureFactory.eINSTANCE.createClass();    
		    coll_class.setTypeDefinition((ClassDefinition)memory.getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::Collection"));
		    TypeVariableBinding binding = StructureFactory.eINSTANCE.createTypeVariableBinding();
		    binding.setVariable((TypeVariable)coll_class.getTypeDefinition().getTypeParameter().get(0));
		    
		    fr.irisa.triskell.kermeta.language.structure.Class object_class = StructureFactory.eINSTANCE.createClass();   
		    object_class.setTypeDefinition((ClassDefinition)memory.getUnit().getTypeDefinitionByQualifiedName("kermeta::language::structure::Object"));

		    
		    // Set the param binding type
		    binding.setType(object_class);
		    // Add to type param bindings the binding
		    coll_class.getTypeParamBinding().add(binding);

			if (expectedType.equals(new SimpleType(coll_class))) {
				// THIS IS A TERRIBLE HACK TO ALLOW CASTING COLLECTIONS
				// OF ANYTHING TO COLLECTION OF OBJECTS
				// **** THIS IS NOT TYPE SAFE ****
				// IT SHOULD BE USED WITH CAUTION
				// AND IT SHOULD BE REMOVED AS SOON AS 
				// BUG #112 IS FIXED
			}
			
			/******************************/
			/*    END OF HORRIBLE THING   */
			/******************************/
			else if (r instanceof Enumeration) {
			    Enumeration enumeration = (Enumeration)r;
			    if (enumeration.getOwnedLiteral().contains(rhs_value.getKCoreObject())) {
			        // It is OK, let's continue with normal assignment
			    }
			    else {
			        rhs_value = memory.voidINSTANCE;
			    }
			}
			else if (!providedtype.isSubTypeOf(expectedType)) {
				rhs_value = memory.voidINSTANCE;
				
			}
			
		}
		
		if (node.getTarget() instanceof CallResult)
		{
		    // Assign the result of the current operation
		    interpreterContext.peekCallFrame().setOperationResult(rhs_value);
		}
		else if (node.getTarget() instanceof CallVariable)
		{
		    Variable var = interpreterContext.peekCallFrame().getVariableByName(node.getTarget().getName());
		    
		    // This is for debugg purposes it should never happend
		    if (var == null) {
		        internalLog.error("INTERPRETER INTERNAL ERROR : unable to find variable " + node.getTarget().getName());
		        throw new Error("INTERPRETER INTERNAL ERROR : unable to find variable " + node.getTarget().getName());
		    }
		    
		    var.setRuntimeObject(rhs_value);
		}
		else if (node.getTarget() instanceof CallFeature)
		{
		    // Visiting the callFeature should return the RuntimeObject
		    // From the runtimeObject, get its target
		    CallFeature callfeature = (CallFeature)node.getTarget();
		    
		    // Get the object on which this feature is applied
		    Expression target = callfeature.getTarget();
	    	String propertyName = callfeature.getName();
	    	
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
		        raiseCallOnVoidTargetException(node,"");
		    }
		    
		    fr.irisa.triskell.kermeta.language.structure.Class t_target=(fr.irisa.triskell.kermeta.language.structure.Class)ro_target.getMetaclass().getKCoreObject();

            // FIXME : Property is assumed to be the type of the feature
		    
            RuntimeObject ro_property = this.getRuntimeObjectForProperty(t_target, propertyName);
            // If the target is a Property and is derived, it is updated from the getterbody
            // FIXME : ro_property must not be null
			// Set the value of the property
            if (ro_property == null)
            {
                System.err.println("could not set property '"+propertyName+"' for object '"+lhs_name+"'");
            }
            else
            {
                // Unset the property if it is void
                if (rhs_value == memory.voidINSTANCE) {
                    fr.irisa.triskell.kermeta.runtime.language.Object.unSet(ro_target,ro_property);
                }
                else {
                    // Get the Property -- is it the right way? 
                    SimpleType target_type = new SimpleType(t_target);                    
                    CallableProperty property =  target_type.getPropertyByName(propertyName);
                    //CallableProperty property =  this.interpreterContext.typeCache.getPropertyByName(target_type,propertyName);
                    Property fproperty = property.getProperty();
                    //Property fproperty = (Property)ro_property.getData().get("kcoreObject");
                    if (!fproperty.isIsDerived())
                    // If it is not derived, assign it
                        fr.irisa.triskell.kermeta.runtime.language.Object.set(ro_target,ro_property,rhs_value);
                    // Else, compute it
                    else
                    {   // no parameter in a property -> "null" below
                    	setDerivedProperty(ro_target, property, rhs_value, callfeature);
                    }
                }
            }
		}
		
		return rhs_value;
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
    public Object visitCallSuperOperation(CallSuperOperation node)
    {
    	if (node!=null) setParent(node);
        RuntimeObject result = memory.voidINSTANCE;
        shouldTerminate();
        // Current call frame is uniquely a LambdaCallFrame, or an OperationCallFrame. Other types are forbidden!
        Operation current_op = this.interpreterContext.peekCallFrame().getOperation();
        RuntimeObject ro_target = this.interpreterContext.peekCallFrame().getSelf();
        //ClassDefinition foclass = current_op.getOwningClass();
        //internalLog.info("Visiting a super operation of : "+current_op.getFName());
        
        fr.irisa.triskell.kermeta.language.structure.Class self_type = (fr.irisa.triskell.kermeta.language.structure.Class)interpreterContext.peekCallFrame().getSelf().getMetaclass().getKCoreObject();
        
        // Get the parameters of this operation
		ArrayList parameters = visitList(node.getParameters());
		// Create a context for this operation call, setting self object to ro_target
		interpreterContext.pushOperationCallFrame(ro_target, InheritanceSearch.getSuperOperation(self_type, current_op), parameters, node);
		
		try {
		    result = (RuntimeObject)this.accept(current_op.getSuperOperation());
		} finally {
		    // Pop the context!
		    interpreterContext.popCallFrame();
		}
        // TODO : raise exception if super operation not found // TypeChecker
        return result;
    }
	/**
	 * Visit a lambda expression. We visit a lambda expression in two cases :
	 * - when we defined one and assigned it to a variable
	 * - when we call one  
	 */
	public Object visitLambdaExpression(LambdaExpression node)
	{   	    
		if (node!=null) setParent(node);
	    RuntimeObject result = new RuntimeLambdaObject(node, memory.getROFactory(),this.interpreterContext.peekCallFrame(), this.interpreterContext);
	    return result;
	}
	
	
	/**
	 * The result node corresponds to the return value of the operation that is currently 
	 * processed.
	 * We also store it as a variable (for the moment)
	 */
	public Object visitCallResult(CallResult node)
	{
	    RuntimeObject value = interpreterContext.peekCallFrame().getOperationResult();
	    if (value==null)
	    	System.err.println("result not found in context");
	    return value;
	}
	
	/**
	 * CallValue is the special variable "value" in the setter method of a derived
	 * property
	 */
	public Object visitCallValue(CallValue node)
	{
	    RuntimeObject value = interpreterContext.peekCallFrame().getCallValueResult();
	    return value;
	}
	
	/**
     * If the visited element is a Variable, then we search its value in the
     * InterpreterContext
     */
    public Object visitCallVariable(CallVariable node) {
        RuntimeObject result;
        Variable var = interpreterContext.peekCallFrame().getVariableByName(node.getName());

        // This is for debugg purposes it should never happend
        if (var == null) {
            internalLog.error("INTERPRETER INTERNAL ERROR : unable to find variable in context :" + node.getName());
            throw new Error("INTERPRETER INTERNAL ERROR : unable to find variable in context :" + node.getName());
        }

        // It is a simple variable call
        if (node.getParameters().size() == 0)
        {
            result = var.getRuntimeObject();
            current_variable = var;
            // We add additional information in order to have a better handle of
            // errors --> FIXME : it perhaps pollute the memory not very smartly...
            //result.getData().put(" ");
            
        }
        // it is a call to a lambda expression
        else {

            // This is for debugg purposes it should never happend
            if (!(var.getRuntimeObject() instanceof RuntimeLambdaObject)) {
                internalLog.error("INTERPRETER INTERNAL ERROR : function call on variable " + node.getName() + " which does not contain a function");
                throw new Error("INTERPRETER INTERNAL ERROR : function call on variable " + node.getName() + " which does not contain a function");
            }
            
            // Get the function
            RuntimeLambdaObject func = (RuntimeLambdaObject) var.getRuntimeObject();

            // Compute actual parameters
            ArrayList paramAList = visitList(node.getParameters());
            
            
            // Call the function
            result = func.call(this, paramAList);
            
            
            }

        return result;
    }
	
	public Object visitSelfExpression(SelfExpression node)
	{
	    return interpreterContext.peekCallFrame().getSelf();
	}

	/**
	 * Evaluate the sequence of instructions in this block.
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Block)
	 */
	public Object visitBlock(Block node) {

	    RuntimeObject result = memory.voidINSTANCE;
		// Stops the interpretation.
	    shouldTerminate();
		
	    // process the statements
	    try {
	        // Execute the block
	        interpreterContext.peekCallFrame().pushExpressionContext();
	        try {
	    
			    ArrayList res = visitStatementList(node.getStatement());
			    if (res.size() > 0) 
			        result = (RuntimeObject)res.get(res.size()-1);
	        }
	        finally {
	            interpreterContext.peekCallFrame().popExpressionContext();
	        }
	    }
	    catch(KermetaRaisedException ex) {
	        Iterator it = node.getRescueBlock().iterator();
	        Rescue resc_block = null;
	        while (it.hasNext() && resc_block == null) {
	            Rescue r = (Rescue)it.next();
	            if (r.getExceptionType() == null)
	                resc_block = r;
	            else {
	                SimpleType exprected =  new SimpleType(r.getExceptionType().getType());
	                SimpleType provided = new SimpleType((fr.irisa.triskell.kermeta.language.structure.Class)ex.raised_object.getMetaclass().getKCoreObject());
	                if (provided.isSubTypeOf(exprected)) {
	                    resc_block = r;
	                }
	            }
	        }
	        if (resc_block == null) throw ex;
	        
	        // Execute the rescue block
	        interpreterContext.peekCallFrame().pushExpressionContext();	        
	        try {
	        
	        if (resc_block.getExceptionType() != null)
	            interpreterContext.peekCallFrame().peekExpressionContext().defineVariable(resc_block.getExceptionName(), ex.raised_object);
 
	        	ArrayList res = visitStatementList(resc_block.getBody());
	        	if (res.size() > 0) 
			        result = (RuntimeObject)res.get(res.size()-1);
	        }
	        finally {
	            interpreterContext.peekCallFrame().popExpressionContext();
	        }
	    }
	    return result;
	}
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FClass)
	 */
	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node) {
	    throw new Error("INTERPRETER INTERNAL ERROR : visit a Class");
	}
	
	public Object visitModelType(ModelType node)
	{
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
		if (node!=null) setParent(node);
	    // The result returned by the visit
	    RuntimeObject result = memory.voidINSTANCE;
		// Stops the interpretation.
	    shouldTerminate();
	    
        Expression cond = node.getCondition();

        // Set "cond" as the current statement that will be evaluated in the
        // current expressionContext
        getInterpreterContext().peekCallFrame().peekExpressionContext().setStatement(cond);
        
        // Object should be a Boolean
        RuntimeObject cond_result = (RuntimeObject)this.accept(cond);
        boolean cond_value=true;
        
        // Get boolean value
        if (RuntimeObject.BOOLEAN_VALUE.equals(cond_result.getPrimitiveType()) )
            cond_value = ((Boolean)cond_result.getJavaNativeObject()).booleanValue();
        else
        {
        	KM2KMTPrettyPrinter pp  = new KM2KMTPrettyPrinter(); 
        	throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
            		"Cannot evaluate the condition "+ pp.accept(cond) +" : expecting a boolean and got " + cond_result.toString(),
    				this,
    				memory,
    				cond,
    				null);
        }
        
        // if cond is true
        if (cond_value == true)
        {   
    		if (node.getThenBody() != null) 
    		    result = (RuntimeObject)this.accept(node.getThenBody());
    		
        }
        else
        {   
            if (node.getElseBody() != null) {
                result = (RuntimeObject)this.accept(node.getElseBody());
            }
        }
		return result;
	}
		
	
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.Loop)
	 */
	public Object visitLoop(Loop node)
	{
		if (node!=null) setParent(node);
		RuntimeObject result = memory.voidINSTANCE;
        // Push a new expressionContext in the current CallFrame. 
        interpreterContext.peekCallFrame().pushExpressionContext();
        // Stops the interpretation.
	    shouldTerminate();
	    // Else
        try {
        	
	        // Accept initialization (a VariableDecl) : add a new variable in the ExpressionContext
	        this.accept(node.getInitialization());
	        boolean cond_value=true;
	        
		    do
		    {
		    	// As we pushed a specific ExpressionContext in the loop to "protect" the
		    	// initialization of the loop condition, we set the current
		    	// statement that will be processed inside this ExpressionContext.
		    	// this line does not modify the behavior of the interpreter
		    	getInterpreterContext().peekCallFrame().peekExpressionContext().setStatement(node.getStopCondition());
				
		        RuntimeObject cond_result = (RuntimeObject)this.accept(node.getStopCondition());
		        // Get boolean value
		        if (RuntimeObject.BOOLEAN_VALUE.equals(cond_result.getPrimitiveType()) )
		            cond_value = ((Boolean)cond_result.getJavaNativeObject()).booleanValue();
		      else
		        {
		        	throw new Error("INTERPRETER INTERNAL ERROR : Loop : evaluation of the condition part does not result in a boolean value.");
		        }
		        
		        if (! cond_value)
		        	this.accept(node.getBody());
		    } while (! cond_value);
		    
        }
        finally {
		    // Pop the expression context
		    interpreterContext.peekCallFrame().popExpressionContext();
        }
	    return memory.voidINSTANCE;
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
		if (node!=null) setParent(node);
	    // Handle call to enumeration literals :
	    if (node.getStaticEnumLiteral() != null) {
	        return memory.getRuntimeObjectForFObject(node.getStaticEnumLiteral());
	    }
	    
	    
	    // It is a real operation / property call    
	    fr.irisa.triskell.kermeta.language.structure.Class t_target = null; // Type of the "callee"
	    RuntimeObject result = null; // The result to be returned by this visit
	    RuntimeObject ro_target = null; // Runtime repr. of target
	    
	    // Get the target of the call
	    if (node.getTarget() == null) {
	        // Self if nothing is specified
	        ro_target = interpreterContext.peekCallFrame().getSelf();
	    }
	    else {
	        ro_target = (RuntimeObject)this.accept(node.getTarget());
	    }
	    KM2KMTPrettyPrinter pp  = new KM2KMTPrettyPrinter();
	    
	    if (ro_target == null) {
	        internalLog.error("INTERPRETER INTERNAL ERROR : Call on a null target");
	        throw new Error("INTERPRETER INTERNAL ERROR : Call on a null target while executing : " + pp.accept(node) );
	    }
	    
	    // Get The type of the Object
	    t_target =(fr.irisa.triskell.kermeta.language.structure.Class)((RuntimeObject)ro_target.getMetaclass()).getKCoreObject();
	    
	    // This is just a test for debbuging the interpreter. It should never occur
	    if (t_target == null) {
	        internalLog.error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
	        throw new Error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
	    }

		// Get the feature
	    SimpleType target_type = new SimpleType(t_target);
	    //	  if this is a java object proxy some more initialization are needed
	    boolean isJarProxy = ro_target.isJarProxy();
	    /*if(RuntimeHelper.isJarProxy(target_type.getTypeDefinition())){
	    	// this is a proxy to a jar must invoke it
	    	throw new Error("don't know how to invoke " + node.getName()+ " on jar proxy for " + target_type);
	    }*/
	    if (node.getStaticOperation() == null && node.getStaticProperty() == null) {
	    	node.getStaticOperation();
	    	node.getStaticProperty();
	        internalLog.error("INTERPRETER INTERNAL ERROR : the program does not seem to be correctly type checked : " + node.getName());
	        throw new Error("INTERPRETER INTERNAL ERROR : the program does not seem to be correctly type checked : " + node.getName());
	    }
	    
	    
	    if (node.getStaticOperation() != null) {
	        // It is an operation call --> 
	        //CallableOperation operation = target_type.getOperationByName(node.getFName());
	    	CallableOperation operation = this.interpreterContext.typeCache.getOperationByName(target_type, node.getName());
	        
//			 Check that target is not void
		    if (operation == null && ro_target == memory.voidINSTANCE) {
		    	String additionalMsg = "";
		    	if(node.getStaticProperty() != null)
		    		if(node.getStaticProperty().isIsDerived())
		    			additionalMsg = "Warning, target was a Derived Property";
		        internalLog.info(" >> INTERPRETER REPORTS Call on a void target: " + node.getName() +"; Operation: " +node.getStaticOperation());
		        if(!additionalMsg.equals(""))
		        	internalLog.info(additionalMsg);
		        raiseCallOnVoidTargetException(node, additionalMsg);		        
		    }
		    
//		  This should never happen if the type checker has checked the program
			if (operation == null) {
			    String msg = "INTERPRETER INTERNAL ERROR : unable to find a feature : "
				    + "\noperation : '"+node.getName()+"' not found for an object of kind : "+ target_type;
			    internalLog.error(msg);
		        throw new Error(msg);
			}
	        
//			 Get the parameters of this operation
			ArrayList parameters = visitList(node.getParameters());
			// Create a context for this operation call, setting self object to ro_target
			interpreterContext.pushOperationCallFrame(ro_target, operation, parameters, node);
			try {
				if(isJarProxy){
					// invoke the java operation
					result = invokeOperationOnProxy(operation.getOperation(), parameters);
				}
				else{ // normal interpeter call
					// Resolve this operation call
					result = (RuntimeObject)this.accept(operation.getOperation());
					// After operation has been evaluated, pop its context
				}
			} finally {
			    interpreterContext.popCallFrame();
			}
	    }
	    else {
	        // It is a property call
	        CallableProperty property =  target_type.getPropertyByName(node.getName());
	    	//CallableProperty property =  this.interpreterContext.typeCache.getPropertyByName(target_type, node.getFName());
	        
//			 Check that target is not void
		    if (property == null && ro_target == memory.voidINSTANCE) {
		        internalLog.debug(" >> INTERPRETER REPORTS Call of '"+ node.getName() +"' property on a void target. Exception raised. ");
		        //KM2KMTPrettyPrinter pp  = new KM2KMTPrettyPrinter(); 
		        internalLog.debug(" >>    node prettyprint: "+ pp.accept(node));
		        internalLog.debug(" >>    container prettyprint: "+ pp.accept(node.eContainer()));
		        raiseCallOnVoidTargetException(node,"");
		    }
		     
//		  This should never happen is the type checker has checked the program
			if (property == null) {
				String err = "INTERPRETER INTERNAL ERROR : unable to find a feature : '" + node.getName() + "' in type : " + target_type;
			    err += "\n( May be the code was not successfully typechecked; If the typechecker has no error, please contact kermeta developers )";
		        throw new Error(err);
			}
			
//			 Get the runtime object corresponding to the property
		    RuntimeObject ro_property = getRuntimeObjectForProperty(t_target, property.getProperty().getName());
		    
		    // This is just a debbuging check. It should never occur
		    if (ro_property == null) {
			    String err = "INTERPRETER INTERNAL ERROR : Unable to find runtime object corresponding to property '" + property.getName() + "'";
			    err += "\n( May be the code was not successfully typechecked ? If the typechecker has no error, please contact kermeta developers )";
			    throw new Error(err);
			}
		    
		    if (!property.getProperty().isIsDerived())
		    {
		    	if(isJarProxy){
					// invoke the java operation
					result = getPropertyOnProxy(ro_target, ro_property, property.getProperty());
				}
				else{ // normal interpeter call
					//					 Get the value of the property
			        result = fr.irisa.triskell.kermeta.runtime.language.Object.get(ro_target, ro_property);
				}
		        
		    }
		    else
		    {
		        result = this.getterDerivedProperty(property, ro_target, node);
		    }
	        
	    }
		
		return result;
	}
	/** special code for dealing with java proxies
	 * @param property 
	 * 
	 * @param operation
	 * @return
	 */
	private RuntimeObject getPropertyOnProxy(RuntimeObject roSelf, RuntimeObject ro_property, Property node) {
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
    protected RuntimeObject invokeOperationOnProxy(Operation node, ArrayList pParameters) {
    	
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
    private Object[] buildJavaArgs(ArrayList parameters, Class[] javaTypeParams) {
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
		shouldTerminate();
		String cmdID = node.getJclass() + "_" + node.getJmethod() + "_" + node.getParameters().size();
		cmdID = cmdID.replaceAll(":", "_");
		FrameworkExternCommand cmd = FrameworkExternCommand.getCommand(cmdID);
		if (cmd != null) {
			RuntimeObject[] paramsArray = new RuntimeObject[node.getParameters().size()];
			
			// Get the parameters of this operation
			ArrayList parameters = visitList(node.getParameters());
			// Get the param types for invokated method
			int i = 0;
			for (Object next : parameters) paramsArray[i++] = (RuntimeObject)next;
			
			// Execute the command
			try{
				return cmd.execute(paramsArray);
	        }
	        catch(KermetaRaisedException e)
			{
	        	// the Kermeta raised exception created on the java side hasn't the cause object: ( context)
	        	// because it was not passed in the parameters ...
	        	if (!e.issetContextString())
	        	{
	        		RuntimeObject rnode = this.getMemory().getRuntimeObjectForFObject(node);
	        		e.setContextString(this, rnode);
	        	}
	            throw e;	
			}
		}
		
		/* IF THE EXTERN HAS NOT BEEN COMPILED THEN IT IS AN INVOKE */
		
		String jclassName  = node.getJclass().replaceAll("::","."); 
		String jmethodName = node.getJmethod();
		
		RuntimeObject[] paramsArray = new RuntimeObject[node.getParameters().size()];
		Class[] paramtypes = new Class[node.getParameters().size()];
		
		// Get the parameters of this operation
		ArrayList parameters = visitList(node.getParameters());
		// Get the param types for invokated method
		int i = 0;
		for (Object next : parameters) {
			paramtypes[i] = RuntimeObject.class;
		    paramsArray[i++] = (RuntimeObject)next;
		    // TODO : test if the RuntimeObject is null or not
		}
		
		Object result = null;
		
		String cmd_id = node.getJclass() +"_"+ node.getJmethod();
	
			// Invoke the java method
			Class jclass = null;
			ClassLoader cl = Thread.currentThread().getContextClassLoader();
	        try {
	        	
	        	//jclass = Class.forName(jclassName);
	        	// The Thread ClassLoader also includes the user jars
	        	if(cl instanceof URLClassLoader){
	        		URLClassLoader ucl=(URLClassLoader)cl;
	        		jclass = ucl.loadClass(jclassName);
	        	} else jclass = cl.loadClass(jclassName);
	        	//jclass = Class.forName(jclassName,true, cl);
	        } catch (ClassNotFoundException e) {
	        	String additionalInfo = "";
	        	if(cl instanceof URLClassLoader){
	        		URLClassLoader ucl=(URLClassLoader)cl;
	        		URL[] urls = ucl.getURLs();
	        		additionalInfo += "Current URLs in the URLClassLoader : \n";
					for (int index = 0; index < urls.length; index++) {
						additionalInfo += "\t" + urls[index].toExternalForm() + "\n";
					}
	        	}
	            internalLog.error("ClassNotFoundException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
				throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
						"ClassNotFoundException invoking "+ jmethodName + " on Class " +jclassName + ". Please verify your java classpath in the kermeta run target. \n"+additionalInfo,
						this,
						memory,
						node,
						e);
	        }
	        Method jmethod = null;
	        try {
	            jmethod = jclass.getMethod(jmethodName, paramtypes);
	        } catch (SecurityException e1) {
	            internalLog.error("SecurityException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
				throw	new KermetaVisitorError("SecurityException invoking "+ jmethodName + " on Class " +jclassName  , this.computeCurrentContextString(), e1);
	        } catch (NoSuchMethodException e1) {
	            internalLog.error("NoSuchMethodException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!", e1);
				throw	new KermetaVisitorError("NoSuchMethodException invoking "+ jmethodName + " on Class " +jclassName  , this.computeCurrentContextString(),e1);
	        }
	        
	        try {
	            result = jmethod.invoke(null, (Object[])paramsArray);
	        } catch (IllegalArgumentException e2) {        
				internalLog.error("IllegalArgumentException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
				throw	new KermetaVisitorError("IllegalArgumentException invoking "+ jmethodName + " on Class " +jclassName, this.computeCurrentContextString()  ,e2); 		
	        } catch (IllegalAccessException e2) {
	            internalLog.error("IllegalAccessException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
				throw	new KermetaVisitorError("IllegalAccessException invoking "+ jmethodName + " on Class " +jclassName, this.computeCurrentContextString()  ,e2);
	        } catch (InvocationTargetException e2) {
	            Throwable cause = e2.getCause();
			    if (cause != null)				       
			        if (cause.getClass().getName().compareTo("junit.framework.AssertionFailedError")==0)
				    {
			            internalLog.error(e2.getClass().getName() + " invoking "+ jmethodName + " on Class " +jclassName + " was due to AssertionFailedError: Shrinking the Exception Stack ");					       
			            // this Exception was due to a KermetaVisitorError create a new one with the precedent content
			            throw new KermetaVisitorError("InvocationTargetException caused by AssertionError: "+cause.getMessage(), this.computeCurrentContextString(), cause);
			        }
			        else if (cause instanceof KermetaRaisedException)
			        {
			            throw (KermetaRaisedException)cause;
			        }
			        else
			        {
			            internalLog.error("InvocationTargetException invoking "+ jmethodName + " on Class " +jclassName , e2);
			            internalLog.error("The cause : "  + cause.getClass());
			            throw	new KermetaVisitorError("InvocationTargetException invoking "+ jmethodName + " on Class " +jclassName 
			            		+ "\n The cause: " + cause.getClass(), this.computeCurrentContextString(),e2);
			        }
	            
	        } catch (Throwable e2) {
	            internalLog.error("InstantiationException invoking "+ jmethodName + " on Class " +jclassName, e2);
				throw	new KermetaVisitorError("InstantiationException invoking "+ jmethodName + " on Class " +jclassName, this.computeCurrentContextString()  ,e2);
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
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.IntegerLiteral) 
	 */
	public Object visitIntegerLiteral(IntegerLiteral node) {
	    return fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(node.getValue(), memory.getROFactory());
	}
	
	/**
	 * @return the value of this node as a boolean
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.BooleanLiteral) 
	 */
	public Object visitBooleanLiteral(BooleanLiteral node) {
	    return memory.getRuntimeObjectForBoolean(node.isValue());
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
        RuntimeObject result = fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getValue(), memory.getROFactory());
        return result;
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
        // TODO : improve this to allow exception to be rescued.
        RuntimeObject exception = (RuntimeObject)this.accept(node.getExpression());
        // DVK: I don't understand why we should use the CallFrame exception here: (more it is often null !
        // the node is enough to compute a context
        //raiseKermetaException(exception, interpreterContext.peekCallFrame().getExpression());
        raiseKermetaException(exception, node);
        
        // This is dead code
        return null;
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
	public ArrayList visitList(EList expressions)
	{
		ArrayList result_list = new ArrayList();
		for (Object next : expressions) {
			result_list.add(this.accept((EObject)next));
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
	public ArrayList visitStatementList(EList expressions)
	{
		ArrayList result_list = new ArrayList();
		for (Object next : expressions) {
			interpreterContext.peekCallFrame().peekExpressionContext().setStatement((EObject) next);
			result_list.add(this.accept((EObject) next));
		}
		return result_list;
	}

	/**
	 * Get the fully qualified name of an FNamedElemenet
	 */
	public String getQualifiedName(NamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof NamedElement)
			return getQualifiedName( (NamedElement)element.eContainer() ) + "::" + ppIdentifier(element.getName());
		else return element.getName();
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
    
    // Helpers to terminate the interpretation process properly, either in debug or run mode.
    /** @return the current command being executed by the debuginterpreter */
	public String getCurrentState() {	return currentState; }
	/** set the current command being executed by the debuginterpreter */
	public void setCurrentState(String command) { currentState = command;}

    /** @return true if the interpretation should terminate. */
    public void shouldTerminate()
    {
    	if (getCurrentState().equals(DEBUG_TERMINATE)) 
    		throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
        		"Program terminated by the user",
				this,
				memory,
				this.getParent(),
				null);
    }
	    
    
}