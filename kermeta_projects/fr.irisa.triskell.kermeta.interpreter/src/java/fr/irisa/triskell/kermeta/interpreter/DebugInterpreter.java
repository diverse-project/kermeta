/* $Id: DebugInterpreter.java,v 1.22 2007-10-15 07:13:58 barais Exp $
 * Project   : Kermeta (First iteration)
 * File      : DebugInterpreter.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 8, 2005
 * Authors       : (zdrey)
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;
import fr.irisa.triskell.kermeta.language.behavior.Loop;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;

/**
 * This is the ExpressionInterpreter improved to handle the debugging mode
 * Principles of the debug interpreter :
 * 
 *  - a pre and a post statements condition the interruption of the debugging mode,
 *  according to the type of command (step, resume, ...) that the user requested. 
 */
public class DebugInterpreter extends ExpressionInterpreter {

    EObject current_eobject;
    Block current_block;
    
    public static final String DEBUG_STEPEND = "stepEnd";
    public static final String DEBUG_STEPINTO = "stepInto";
    public static final String DEBUG_STEPOVER = "stepOver";
    
    public boolean interpreterSuspended = true;

    public String oldCommand = "";
    /** The stop condition for the stepOver command */ 
    protected CallFrame stepOverCallFrame;
    /** This frame is used when we switch from stepInto to stepOver*/
    protected CallFrame current_frame;
    /** A table of { oid : runtimeObject }*/
    protected Hashtable currentVisibleRuntimeObjects;
    
    public fr.irisa.triskell.kermeta.language.structure.Class entryObject ;
    public Operation entryOperation ;
    public ArrayList entryArguments  ;
    public AbstractKermetaDebugCondition debugCondition;
    
    /**
     * @param pMemory
     */
    public DebugInterpreter(RuntimeMemory pMemory) {
        super(pMemory);
        currentState = DEBUG_RESUME;
        currentVisibleRuntimeObjects = new Hashtable();
    }
    
    /**
	 * Initialize the foperation argument on the ro_target Runtime Object;
	 *  arguments to this call are given as an ArrayList;
	 *  no invocation of operation is done here.
	 *  Note : invoke() method of ExpressionInterpreter is chunked into
	 *  initialize and invoke_debug. 
	 * @param ro_target
	 * @param foperation
	 * @param arguments
	 */
	public void initialize(RuntimeObject ro_target,Operation foperation,ArrayList arguments) {
		
		fr.irisa.triskell.kermeta.language.structure.Class self_type = (fr.irisa.triskell.kermeta.language.structure.Class)ro_target.getMetaclass().getKCoreObject();
		
		entryObject = self_type;
		entryOperation = foperation;
		entryArguments = arguments;
		
		CallableOperation op = new CallableOperation(foperation, self_type);
		// Create a context for this operation call, setting self object to ro_target
		// We should have a CallFeature
        interpreterContext.pushOperationCallFrame(ro_target, op, arguments, null);
        current_frame = getInterpreterContext().peekCallFrame();
	}
	
	/**
	 * Run the execution of the program
	 * The argument is probably not well placed!! 
	 * But we need it -- think about how to make KermetaConsole available
	 * FIXME : put the console handling somewhere
	 */
	public Object invoke_debug()
	{
		Object result = memory.voidINSTANCE;
		
		// Resolve this operation call
		result = (RuntimeObject)this.accept(entryOperation);
		
		// finally block removed
		// {
		
		// After operation has been evaluated, pop its context
		interpreterContext.popCallFrame();
		// Remote side of the interpreter reads this attribute and act accordingly
		currentState = DEBUG_TERMINATE;
		// Run a last time the debug command that tests if we can interrupt.....laborious
		shouldTerminate();
		processDebugCommand(entryOperation);
		// }
		return result;
	}
    
	/**
	 * Visit an operation definition. 
	 * This visit usually follows the visit of a CallFeature that is an operation call 
	 * This has the following steps :
	 * 	- Create an expression context for the variables defined at "top level" in this operation
	 *
	 * "Here" begins the debugging/execution of a Kermeta program
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation node) {
		Object result = memory.voidINSTANCE;
		result = super.visitOperation(node);
		return result;
	}

    /**
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitAssignment(fr.irisa.triskell.kermeta.behavior.Assignment)
     */
    public Object visitAssignment(Assignment node) {
    	Object result = memory.voidINSTANCE;
    	shouldTerminate();
    	processDebugCommand(node);
    	result = super.visitAssignment(node);
        processPostCommand(node);
        return result;
    }
    
    /** 
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitCallFeature(fr.irisa.triskell.kermeta.behavior.CallFeature)
     */
    public Object visitCallFeature(CallFeature node) {
    	Object result = memory.voidINSTANCE;
    	// (Simple test to terminate)
    	//shouldTerminate();
    	processDebugCommand(node);
    	result = super.visitCallFeature(node);
    	processPostCommand(node);
        return result;
    }
    

    /**
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitBlock(fr.irisa.triskell.kermeta.behavior.Block)
     * @note : we don't need to control neither the execution of a Block, nor 
     * the execution of a Loop, nor FConditional : they directly contains not executable
     * statement : so, we control only the children of those elements ( FStopCondition, the list
     * of statements inside the Block, etc.)
     * (We don't have to stop in a block decl.)
     * We just need to stop the execution
     */
    public Object visitBlock(Block node)  {
    	shouldTerminate();
    	return super.visitBlock(node);
    }
    /**
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitConditional(fr.irisa.triskell.kermeta.behavior.Conditional)
	 */
	public Object visitConditional(Conditional node) {
		shouldTerminate();
		return super.visitConditional(node);
	}

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitLoop(fr.irisa.triskell.kermeta.behavior.Loop)
	 */
	public Object visitLoop(Loop node) {
		shouldTerminate();
		return super.visitLoop(node);
	}

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitCallSuperOperation(fr.irisa.triskell.kermeta.behavior.CallSuperOperation)
	 */
	public Object visitCallSuperOperation(CallSuperOperation node) {
		Object result = memory.voidINSTANCE;
		shouldTerminate();
		processDebugCommand(node);
		result = super.visitCallSuperOperation(node);
		processPostCommand(node);
		return result;
	}
	
	

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitJavaStaticCall(fr.irisa.triskell.kermeta.behavior.JavaStaticCall)
	 */
	public Object visitJavaStaticCall(JavaStaticCall node) {
		Object result = memory.voidINSTANCE;
		shouldTerminate();
		processDebugCommand(node);
		result = super.visitJavaStaticCall(node);
		processPostCommand(node);
		return result;
	}
	

	
	/**
	 * Visit a variable declaration also deserves a stop in the step mode. 
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitVariableDecl(fr.irisa.triskell.kermeta.behavior.VariableDecl)
	 */
	public Object visitVariableDecl(VariableDecl node) {
		Object result = memory.voidINSTANCE;
		shouldTerminate();
		processDebugCommand(node);
		result = super.visitVariableDecl(node);
		processPostCommand(node);
		return result;
	}

	

	/** 
	 * Called after a visit is done : this method updates the "currentState" attribute
	 * of the debug interpreter according to the kind of command the user asked 
	 * for (typically, stepInto, stepOver, or resume), so that the "KermetaRemoteInterpreter"  can block its thread
	 * accordingly.
	 * @param node the node of the visit that preceded the call of this postCommand */
    public void processPostCommand(fr.irisa.triskell.kermeta.language.structure.Object node)
    {
    	current_frame = getInterpreterContext().peekCallFrame();
    	
    	// If it is step over and
    	// if the stepOverCallframe that conditioned the stop of the stepOver was poped
    	// (this case occurs for example when a step-over command follows a step-into),
    	// then we set it to the last peeked frame.
    	if (isSteppingOver() && !interpreterContext.getFrameStack().contains(stepOverCallFrame))
    	{
    		stepOverCallFrame = getInterpreterContext().peekCallFrame();
    	}
    	// If it is a step-over, and we are in the stepOverCallFrame, and the last
    	// statement that had to be evaluated correspond to the node that we just visited,
    	// then it means the visit of the statement is completed, so, we can stop.
    	if (isSteppingOver() && current_frame.equals(stepOverCallFrame)
    			 &&
    			 node.equals(current_frame.peekExpressionContext().getStatement())
    			 && 
    			 !(node instanceof Block)) 
    	{
    		setSuspended(true, DEBUG_STEPEND);
    	} 
    	// If command is a step-into, then we stop systematically after a visit 
    	else if (isSteppingInto() ) 
    	{
    		setSuspended(true, DEBUG_STEPEND);
    	}
    }

    /**
     * Decorating method called before the appropriate visitMethod executions.
     * @param current_node
     */
    public Object processDebugCommand(EObject current_node)
    {	
    	if (getDebugCondition()!=null) 
    	{	// Tell the debug condition where we are
    		initVisibleRuntimeObjects();
    		getDebugCondition().setCurrentNode(current_node);
    		getDebugCondition().blockInterpreter();
    	}
    	return null;
    }
    
	/*
	 * Special accessors for interactive debug mode
	 * 
	 */
	
	/** Accessors for booleans */
	public boolean isSteppingInto()
	{	return (getDebugCondition().getConditionType().equals(DEBUG_STEPINTO));}

	public boolean isSteppingOver()
	{	return (getDebugCondition().getConditionType().equals(DEBUG_STEPOVER));}
	
	
	/** 
	 * Put the interpreter in pause mode
	 * @param reason choices :
	 * 	- stepEnd
	 *  - stepOver
	 *  - stepInto
	 */
	public void setSuspended(boolean suspended, String reason)
	{
		interpreterSuspended = suspended;
		currentState = reason;
	}
	public boolean isSuspended() { return interpreterSuspended == true; }
	    
	/** Returns the call frame in which the step over command has begun */
	public CallFrame getStepOverCallFrame() {	return stepOverCallFrame; }
	/** Sets the call frame where the step over should "stop". Called by the
	 *  "remote side" of the interpreter
	 *  if "top" is set to true, then stepOverCallFrame will be the top call frame
	 *  in the stack.
	 *   */
	public void setStepOverCallFrame(boolean top)
	{
		// peekCallFrame is null if this method is called before interpreter
		// was initialized : still sync. problems?
		if (!getInterpreterContext().getFrameStack().isEmpty() && 
			stepOverCallFrame == null
		)	
			if (top == false)
				stepOverCallFrame = getInterpreterContext().peekCallFrame();
			else
			{
				stepOverCallFrame = (CallFrame)getInterpreterContext().getFrameStack().firstElement();
			}
	}

	/** 
	 * Unset the stepOverCallFrame marker frame when we are no more in a 
	 * step over mode. */
	public void unsetStepOverCallFrame()
	{ stepOverCallFrame = null; }
	
	public void setDebugCondition(AbstractKermetaDebugCondition debug_cond)
	{
		currentState = debug_cond.getConditionType();
		debugCondition = debug_cond;
	}
	
	public AbstractKermetaDebugCondition getDebugCondition()
	{ return debugCondition; }
	
	/** 
	 * TODO : constrain the access to the current operation call frame?
	 * Find and return the runtimeobject given by its OID in the context of the interpreter. return null 
	 * if the RuntimeObject was not found.
	 */
    public RuntimeObject getRuntimeObjectByOID(long oid)
    {
    	RuntimeObject result = memory.voidINSTANCE;
    	if (getInterpreterContext().getFrameStack().isEmpty()==false 
    		&& getInterpreterContext().peekCallFrame().hasVariables())
    	{
    		// We need to parse the current context?
    		Iterator it = getInterpreterContext().peekCallFrame().getVariables().iterator();
    		while (it.hasNext() && result == null)
    		{
    			Variable variable = (Variable)it.next();
    			RuntimeObject rvalue = variable.getRuntimeObject();
    			if (rvalue.getOId() == oid) result = rvalue;
    		}
    	}
    	return result;
    }
    
    
    /** Returns a hashtable of all the RuntimeObject available in the current frame*/
    public Hashtable initVisibleRuntimeObjects()
    {
    	Hashtable<String, RuntimeObject> variables = new Hashtable<String, RuntimeObject>();
    	if (getInterpreterContext().getFrameStack().isEmpty()==false)
    	{	
    		for (Object fnext : getInterpreterContext().getFrameStack())
    		{
    			CallFrame frame = (CallFrame)fnext;
    			if (frame.hasVariables())
    			{
    				// We need to parse the current context?
    				for (Object vnext : frame.getVariables()) {
    					Variable v =  (Variable)vnext;
        				RuntimeObject ro = v.getRuntimeObject();
    					variables.put(v.getName(), ro);
    					currentVisibleRuntimeObjects.put(ro.getOId(), ro);
    				}
    				// Also add "self" object?
    				currentVisibleRuntimeObjects.put(frame.getSelf().getOId(), frame.getSelf());
    			}
    		}
    	}
    	//result.putAll(getInterpreterContext().getMemory().getRuntimeObjects().values());
    	return variables;
    }
    
    /** */
    public Hashtable getVisibleRuntimeObjects(long oid)
    {
    	Hashtable result = new Hashtable();
    	RuntimeObject ro = (RuntimeObject) currentVisibleRuntimeObjects.get(oid);
    	
    	// try to find the object in the properties?
    	if (ro.getProperties()!=null || !ro.getProperties().isEmpty())
    	{
    		Hashtable properties = ro.getProperties();
    		Hashtable pmap = getRuntimeObjectListForProperties(properties);
    		for (Object pmnext : pmap.entrySet())
    		{
    			Map.Entry next = (Map.Entry)pmnext;
    			Object[] next_value = (Object [])next.getValue();
    			result.put(next_value[0], next_value[1]);
    		}
    	}
    	if (RuntimeObject.COLLECTION_VALUE.equals(ro.getPrimitiveType()))
    	{
    		Collection collection = (Collection)ro.getJavaNativeObject();
    		Hashtable cmap = getRuntimeObjectList(collection);
    		for (Object cmnext : cmap.entrySet())  
    		{
    			Map.Entry next = (Map.Entry)cmnext;
    			Object[] next_value = (Object [])next.getValue();
    			result.put(next_value[0], next_value[1]);
    		}
    	}
    	return result;
    }
    
    
    public synchronized void updateVisibleRuntimeObjects(Hashtable vro)
    {
    	for (Object vronext : vro.values())
    	{
    		RuntimeObject next = (RuntimeObject)vronext;
    		currentVisibleRuntimeObjects.put(next.getOId(), next);
    	}
    }
    
    protected synchronized Hashtable getRuntimeObjectList(Collection rolist)
    {
    	Hashtable result = new Hashtable();
    	int i = 0;
    	for (Object ronext : rolist)
    	{
    		String name = "";
    		RuntimeObject next = (RuntimeObject)ronext;
    		name = "["+Integer.toString(i)+"]";
    		result.put(next.getOId(), new Object[] {name, next});
    		i+=1;
    	}
    	return result;
    }
    

    protected synchronized Hashtable getRuntimeObjectListForProperties(Hashtable romap)
    {
    	Hashtable result = new Hashtable();
    	Iterator it = romap.keySet().iterator();
    	int i = 0;
    	for (Object knext : romap.keySet())
    	{
    		String name = (String)knext;
    		RuntimeObject ro = (RuntimeObject)romap.get(name);
    		result.put(ro.getOId(), new Object[] {name, ro}); 
    		i+=1;
    	}
    	return result;
    }
    

    /**
     * tool function
     * @return the name property of the runtime object if available
     */
    public static String getRONameProp(RuntimeObject rObject){
    	RuntimeObject roName = (RuntimeObject)rObject.getProperties().get("name");
        return  roName == null ? "" : (String)roName.getJavaNativeObject().toString();
    }
}
