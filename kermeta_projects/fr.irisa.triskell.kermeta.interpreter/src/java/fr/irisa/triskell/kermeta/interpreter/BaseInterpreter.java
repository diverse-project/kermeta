/* $Id: BaseInterpreter.java,v 1.2 2005-03-22 13:03:44 zdrey Exp $
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

import fr.irisa.triskell.kermeta.behavior.*;
import fr.irisa.triskell.kermeta.structure.*;

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
 * This is the Command handler. It is the <b>Invoker</b> in the command pattern architecture.
 * The goal of this class is to unify in one process, the handle of the basic 
 * interpreter commands which are written in Java. Those commands are used to evaluate  
 * the Conditional, Loop, Operation call, and Assignment. 
 * 
 * The interpreter.kmt visitor call the static method of this base interpreter, in each
 * of its "visit" method of a "system type" (Conditional, Loop, Assignment, OpCall), 
 * to evaluate each AST node
 * 
 */
public class BaseInterpreter extends KermetaVisitor {
    
    protected InterpreterContext interpreterContext;
    protected ExpressionContext currentContext;
    /** We use it to create the RuntimeObject equivalent to the visited node*/
    protected RuntimeObjectFactory factory;
    // Should we access the interpreter context defined in KMT?
    /** The main unit  */
    protected KermetaUnit unit;
    
    /**
     * 
     * @param pContext
     * @param unit the main kermetaUnit ..
     */
    public BaseInterpreter(InterpreterContext pContext, KermetaUnit pUnit, RuntimeObjectFactory pFactory)
    {
        factory = pFactory;
        interpreterContext = pContext;
        unit = pUnit;
    }
    
    /**
     * The main method that is called on a RuntimeObject to evaluate it.
     * It uses : 
     * - createCommand : to create the command that is dedicated to the execution of this object
     * - executeCommand : execute the command (method delegator)
     * @param kObject the RuntimeObject/EObject? to evaluate
     */
    public RuntimeObject evaluate(EObject object)
    {
        return null;
    }
    
    

	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	protected String current_pname;
	
	protected boolean typedef = false;
	
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
	    RuntimeObject ro_init = (RuntimeObject)this.accept(node.getFInitialization());
	    interpreterContext.getCurrentFrame().getCurrentExpressionContext().defineVariable(
	            node.getFType().getFType(), node.getFIdentifier(), ro_init);
	    return null;
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
		 String lhs_name = node.getFTarget().getFName();
		 FExpression lhs = node.getFTarget();
		
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
		else if (FCallFeature.class.isInstance(node.getFTarget()))
		{
		    // Get the RuntimeObject
		    FCallFeature feature = (FCallFeature)node.getFTarget();
		    // Get the object on which this feature is applied
		    FExpression target = feature.getFTarget();
		    // Retrieve the object in the RuntimeObject tree? // in the context.
		    // can be a parameter of the current called operation
		    // can be an object already stored as a variable in the blockstacks 
		    
		}
		
		return null;
	}
	
	/**
	 * The result node corresponds to the return value of the operation that is currently 
	 * processed.
	 * We also store it as a variable (for the moment)
	 */
	public Object visit(FCallResult node)
	{
	    // Get the value of the result that was computed
	    Hashtable vars = interpreterContext.getCurrentFrame().getCurrentExpressionContext().getVariables();
	    if ( vars.containsKey("result") )
	    {
	       // vars.get()
	        
	    }
	    return null;
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
	    return value;
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
        RuntimeObject cond_result = this.evaluate(cond);
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
	    RuntimeObject cond_result = (RuntimeObject)this.accept(node.getFStopCondition());
        String value = null;
        // Get boolean value
        if (cond_result.getProperties().containsKey("singleton instance"))
            value = (String)cond_result.getProperties().get("singleton instance");
        else
        {
            // TODO : throw an InterpreterException 
        }
        
        // Push a new expressionContext in the current CallFrame. 
        interpreterContext.getCurrentFrame().pushNewExpressionContext(node);
        // Accept initialization (a FVariableDecl) : add a new variable in the ExpressionContext
        this.accept(node.getFInitiatization());
        
	    while (value.equals("TRUE INSTANCE"))
	    {
	        this.accept(node.getFBody());
	        cond_result = (RuntimeObject)this.accept(node.getFStopCondition());
	        value = (String)cond_result.getProperties().get("singleton instance");
	    }
	    
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
	    visitList(node.getFRaisedException());
	    
	    // If operation returns something that is not VOID, return it?
	    
	    // Pop the expressionContext
	    interpreterContext.getCurrentFrame().popExpressionContext();
		return null;
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
	    RuntimeObject result = null; // The result to be returned by this visit
	    RuntimeObject ro_target = null; // Runtime repr. of target
	    // if target is null, means that it is an attribute of self object. We find self
	    // object in current callFrame
		if (target == null)
		{
		    ro_target = interpreterContext.getCurrentFrame().getSelf();
		}
		
		// TODO : handle the case of calls like "toto.titi.tutu" -> recursive
		// FIXME : is this done automatically
		if (FCallFeature.class.isInstance(target))
		{
		    result = (RuntimeObject)this.accept(target); 
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
		        ro_target = (ro_target!=null)?ro_target:((Variable)e_context.getVariables().get(var_name)).getRuntimeObject();
		        FType t_target = 
		            ((Variable)e_context.getVariables().get(var_name)).getType();
		        
		        // RuntimeObject feature = factory.getTypeDefinitionByName(qname);
		        Vector feature = getFeatureType(t_target, node);
		        
		        // Is the callfeature an operation call? So that we create a new call
		        // frame and accept this operation in order to process it.
		        if (feature!=null && feature.get(0).equals("FOperation"))
		        {
		            // Create a context for this operation call, setting self object to ro_target
		            interpreterContext.pushNewCallFrame(ro_target);
		            // Get the FOperation corresponding to this operation call
		            FOperation foperation = (FOperation)feature.get(1);
		            // Get the parameters of this operation
		        	ArrayList parameters = visitList(node.getFParameters());
		            interpreterContext.getCurrentFrame().setParameters(parameters);
		            
		            // Resolve this operation call
		            result = (RuntimeObject)this.accept(foperation);
		            
		            // After operation has been evaluated, pop its context
		            interpreterContext.getFrameStack().pop();
		        }
		        // Is it a property? If yes, update the RuntimeObject repr.g the target node !
		        else if (feature!=null && feature.get(0).equals("FProperty"))
		        {
		            // The property 
		            FProperty fproperty = (FProperty)feature.get(1);
		            // The Runtime representation of this property. 
		            RuntimeObject ro_property = null;
		            RuntimeObject attributes = (RuntimeObject)ro_target.getMetaclass().getProperties().get("ownedAttributes");
		            
		            Iterator it = ((ArrayList)attributes.getData().get("CollectionArrayList")).iterator();
		            while (it.hasNext() && ro_property == null)
		            {
		                RuntimeObject attr = (RuntimeObject)it.next();
		                if (attr.getProperties().get("name").equals(fproperty.getFName()))
		                {
		                    ro_property = attr;
		                    // Get the value of the property
		                    result = fr.irisa.triskell.kermeta.runtime.language.Object.get(
		                            ro_target, ro_property);
		                }
		            }
			     }
		    }
		    else
		    {
		        // TODO raise an exception / undefined variable?
		    }
		    
		}
		// else it is a class (kermeta_behavior::TypeLiteral).
		// TypeLiteral : a class (we can have .new, .a_reflective_property, an enumeration
		if (FTypeLiteral.class.isInstance(target))
		{
		    // TODO 
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
	    
		String jclassName  = node.getFJclass(); 
		String jmethodName = node.getFJmethod();
		
		Object[] paramsArray = new Object[node.getFParameters().size()];
		Class[] paramtypes = new Class[node.getFParameters().size()];
		
		// Get the param types for invokated method
		Iterator it = node.getFParameters().iterator();
		int i = 0;
		while (it.hasNext())
		{
		    paramtypes[i] = RuntimeObject.class;
		    paramsArray[i] = it.next();
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
	    return fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(node.getFValue());
	}
	
	/**
	 * @return the value of this node as a boolean
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.behavior.FBooleanLiteral) 
	 */
	public Object visit(FBooleanLiteral node) {
	    return fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.create(node.isFValue());
	}
	
    /** 
     * @return the value of this node as a runtime object
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.behavior.FStringLiteral)
     */
    public Object visit(FStringLiteral node) {
        return fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getFValue());
    }
	/**
	 * Visit a classDefinition node has the following consequences :
	 * - create the "self" RuntimeObject and link it to the current CallFrame context 
	 */
	public Object visit(FClassDefinition node)
	{
	    // Get the qualified name of this class
	    String qname = KMReflect.getQualifiedName(node);
	    RuntimeObject result = factory.getTypeDefinitionByName(qname);
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
	 */
	public ArrayList getImports() {
		return imports;
	}
	/**
	 * @return Returns the usings.
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
                context = (ExpressionContext)frame.getBlockStack().get(i-1);
                if (context.getVariables().containsKey(varName))
                {
                    found=true;
                }
                j--;
            }
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
     * @return a Vector of 2 elements. First one is the name of the feature type, 
     * second one the ecore object of the feature. 
     */
    public static Vector getFeatureType(FType type, FCallFeature feature)
    {
        Vector result = null;
        String result_str = null;
        Object result_elt = null;
        // If type is a FClass
        if (FClass.class.isInstance(type))
        {	// map... 
            EList operations = ((FClass)type).getFOwnedOperation();
            int i = 0;
            while (i < operations.size() && result == null)
            {	
                result_elt = operations.get(i++);
                if (((FOperation)operations.get(i)).getFName().equals(feature.getFName()))
                    result_str = "FOperation";
            }
            if (result_str == null)
            {
                EList attributes = ((FClass)type).getFOwnedAttribute();
                while (i < attributes.size() && result == null)
                {
                    result_elt = attributes.get(i++);
                    if (((FProperty)operations.get(i++)).getFName().equals(feature.getFName()))
                        result_str = "FProperty";
                }   
            }
            if (result_str!=null)
            {
                result = new Vector(2);
                result.add(result_str); result.add(result_elt);
            }
        }
        // TODO : test for other kinds of types or Exception? -- is feature valuable
        // in a source code for another target type than FClass?
        return result;
    }
     
    
    
    
}




