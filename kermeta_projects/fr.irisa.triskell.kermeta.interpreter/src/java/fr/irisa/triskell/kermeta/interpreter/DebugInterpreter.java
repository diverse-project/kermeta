/* $Id: DebugInterpreter.java,v 1.14 2005-12-15 18:42:20 zdrey Exp $
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
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;


import fr.irisa.triskell.kermeta.behavior.FAssignement;
import fr.irisa.triskell.kermeta.behavior.FBlock;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FCallResult;
import fr.irisa.triskell.kermeta.behavior.FCallSuperOperation;
import fr.irisa.triskell.kermeta.behavior.FJavaStaticCall;

import fr.irisa.triskell.kermeta.behavior.FConditionnal;

import fr.irisa.triskell.kermeta.behavior.FLoop;
import fr.irisa.triskell.kermeta.behavior.FVariableDecl;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FObject;

import fr.irisa.triskell.kermeta.structure.FOperation;
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
    FBlock current_block;
    
    public static final String DEBUG_STEPEND = "stepEnd";
    public static final String DEBUG_STEPINTO = "stepInto";
    public static final String DEBUG_STEPOVER = "stepOver";
    public static final String DEBUG_RESUME = "resume";
    public static final String DEBUG_SUSPEND = "suspend";
    public static final String DEBUG_TERMINATE = "terminate";
    public boolean interpreterSuspended = true;
    // TODO : rename currentState into currentState
    /** The reason/state of the debugging
    (among stepEnd, stepInto, stepOver.) */
    public String currentState = "";
    public String oldCommand = "";
    /** The stop condition for the stepOver command */ 
    protected CallFrame stepOverCallFrame;
    /** This frame is used when we switch from stepInto to stepOver*/
    protected CallFrame lastCallFrame;
    protected CallFrame current_frame;
    /** A table of { oid : runtimeObject }*/
    protected Hashtable currentVisibleRuntimeObjects;
    
    public FClass entryObject ;
    public FOperation entryOperation ;
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
	public void initialize(RuntimeObject ro_target,FOperation foperation,ArrayList arguments) {
		
		FClass self_type = (FClass)ro_target.getMetaclass().getData().get("kcoreObject");
		
		entryObject = self_type;
		entryOperation = foperation;
		entryArguments = arguments;
		
		CallableOperation op = new CallableOperation(foperation, self_type);
		// Create a context for this operation call, setting self object to ro_target
		// We should have a FCallFeature
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
		System.out.println("Begin invoke_debug");
		Object result = memory.voidINSTANCE;
		
		// Resolve this operation call
		result = (RuntimeObject)this.accept(entryOperation);
		System.out.println("operation invoked!");
		
		// finally block removed
		// {
		
		// After operation has been evaluated, pop its context
		interpreterContext.popCallFrame();
		// Remote side of the interpreter reads this attribute and act accordingly
		currentState = DEBUG_TERMINATE;
		// Run a last time the debug command that tests if we can interrupt.....laborious
		if (shouldTerminate()) return result;
		processDebugCommand(entryOperation);
		// }
		return result;
	}
    
	/**
	 * Visit an operation definition. 
	 * This visit usually follows the visit of a FCallFeature that is an operation call 
	 * This has the following steps :
	 * 	- Create an expression context for the variables defined at "top level" in this operation
	 *
	 * "Here" begins the debugging/execution of a Kermeta program
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitFOperation(FOperation node) {
		Object result = memory.voidINSTANCE;
		result = super.visitFOperation(node);
		return result;
	}

    /**
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFAssignement(fr.irisa.triskell.kermeta.behavior.FAssignement)
     */
    public Object visitFAssignement(FAssignement node) {
    	Object result = memory.voidINSTANCE;
    	if (shouldTerminate()) return result;
    	processDebugCommand(node);
    	result = super.visitFAssignement(node);
        processPostCommand(node);
        return result;
    }
    
    /** 
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFCallFeature(fr.irisa.triskell.kermeta.behavior.FCallFeature)
     */
    public Object visitFCallFeature(FCallFeature node) {
    	Object result = memory.voidINSTANCE;
    	// (Simple test to terminate)
    	//if (shouldTerminate()) return result;
    	processDebugCommand(node);
    	result = super.visitFCallFeature(node);
    	processPostCommand(node);
        return result;
    }
    

    /**
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFBlock(fr.irisa.triskell.kermeta.behavior.FBlock)
     * @note : we don't need to control neither the execution of a FBlock, nor 
     * the execution of a FLoop, nor FConditional : they directly contains not executable
     * statement : so, we control only the children of those elements ( FStopCondition, the list
     * of statements inside the FBlock, etc.)
     * (We don't have to stop in a block decl.)
     * We just need to stop the execution
     */
    public Object visitFBlock(FBlock node)  {
    	if (shouldTerminate()) return memory.voidINSTANCE;
    	return super.visitFBlock(node);
    }
    /**
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitFConditionnal(fr.irisa.triskell.kermeta.behavior.FConditionnal)
	 */
	public Object visitFConditionnal(FConditionnal node) {
		if (shouldTerminate()) return memory.voidINSTANCE;
		return super.visitFConditionnal(node);
	}

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitFLoop(fr.irisa.triskell.kermeta.behavior.FLoop)
	 */
	public Object visitFLoop(FLoop node) {
		if (shouldTerminate()) return memory.voidINSTANCE;
		return super.visitFLoop(node);
	}

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitFCallSuperOperation(fr.irisa.triskell.kermeta.behavior.FCallSuperOperation)
	 */
	public Object visitFCallSuperOperation(FCallSuperOperation node) {
		Object result = memory.voidINSTANCE;
		if (shouldTerminate()) return result;
		processDebugCommand(node);
		result = super.visitFCallSuperOperation(node);
		processPostCommand(node);
		return result;
	}
	
	

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitFJavaStaticCall(fr.irisa.triskell.kermeta.behavior.FJavaStaticCall)
	 */
	public Object visitFJavaStaticCall(FJavaStaticCall node) {
		Object result = memory.voidINSTANCE;
		if (shouldTerminate()) return result;
		processDebugCommand(node);
		result = super.visitFJavaStaticCall(node);
		processPostCommand(node);
		return result;
	}
	

	
	/**
	 * Visit a variable declaration also deserves a stop in the step mode. 
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitFVariableDecl(fr.irisa.triskell.kermeta.behavior.FVariableDecl)
	 */
	public Object visitFVariableDecl(FVariableDecl node) {
		Object result = memory.voidINSTANCE;
		if (shouldTerminate()) return result;
		processDebugCommand(node);
		result = super.visitFVariableDecl(node);
		processPostCommand(node);
		return result;
	}

	

	/** 
	 * Called after a visit is done : this method updates the "currentState" attribute
	 * of the debug interpreter according to the kind of command the user asked 
	 * for (typically, stepInto, stepOver, or resume), so that the "KermetaRemoteInterpreter"  can block its thread
	 * accordingly.
	 * @param node the node of the visit that preceded the call of this postCommand */
    public void processPostCommand(FObject node)
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
    			 !(node instanceof FBlock)) 
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
	/** @return the current command being executed by the debuginterpreter */
	public String getCurrentState() {	return currentState; }
	/** set the current command being executed by the debuginterpreter */
	public void setCurrentState(String command) {	currentState = command;}
    
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
	
	
	
	/**
	 * @return Returns the lastCallFrame.
	 */
	public CallFrame getLastCallFrame() {
		return lastCallFrame;
	}

	/**
	 * @param lastCallFrame The lastCallFrame to set.
	 */
	public void setLastCallFrame(CallFrame lastCallFrame) {
		this.lastCallFrame = lastCallFrame;
	}

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
    	Hashtable variables = new Hashtable();
    	if (getInterpreterContext().getFrameStack().isEmpty()==false)
    	{	
    		Iterator fit = getInterpreterContext().getFrameStack().iterator();
    		while (fit.hasNext())
    		{
    			CallFrame frame = (CallFrame)fit.next();
    			if (frame.hasVariables())
    			{
    				// We need to parse the current context?
    				Iterator it = frame.getVariables().iterator();
    				while (it.hasNext()) {
    					Variable v =  (Variable)it.next();
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
    		Hashtable pmap = getRuntimeObjectListForProperties(properties, "property");
    		Iterator pmap_it = pmap.entrySet().iterator(); 
    		while (pmap_it.hasNext())
    		{
    			Map.Entry next = (Map.Entry)pmap_it.next();
    			Object[] next_value = (Object [])next.getValue();
    			result.put(next_value[0], next_value[1]);
    		}
    	}
    	if (ro.getData().get("CollectionArrayList") !=null)
    	{
    		Collection collection = (Collection)ro.getData().get("CollectionArrayList");
    		Hashtable cmap = getRuntimeObjectList(collection, "collection");
    		Iterator cmap_it = cmap.entrySet().iterator(); 
    		while (cmap_it.hasNext())
    		{
    			Map.Entry next = (Map.Entry)cmap_it.next();
    			Object[] next_value = (Object [])next.getValue();
    			result.put(next_value[0], next_value[1]);
    		}
    	}
    	return result;
    }
    
    
    public synchronized void updateVisibleRuntimeObjects(Hashtable vro)
    {
    	Iterator vro_it = vro.values().iterator();
    	while (vro_it.hasNext())
    	{
    		RuntimeObject next = (RuntimeObject)vro_it.next();
    		currentVisibleRuntimeObjects.put(next.getOId(), next);
    	}
    }
    
    protected synchronized Hashtable getRuntimeObjectList(Collection rolist, String list_type)
    {
    	Hashtable result = new Hashtable();
    	Iterator it = rolist.iterator();
    	int i = 0;
    	while (it.hasNext())
    	{
    		String name = "";
    		RuntimeObject next = (RuntimeObject)it.next();
    		name = "["+Integer.toString(i)+"]";
    		result.put(next.getOId(), new Object[] {name, next});
    		i+=1;
    	}
    	return result;
    }
    

    protected synchronized Hashtable getRuntimeObjectListForProperties(Hashtable romap, String list_type)
    {
    	Hashtable result = new Hashtable();
    	Iterator it = romap.keySet().iterator(); int i = 0;
    	while (it.hasNext())
    	{
    		String name = (String)it.next();
    		RuntimeObject ro = (RuntimeObject)romap.get(name);
    		result.put(ro.getOId(), new Object[] {name, ro}); 
    		i+=1;
    	}
    	return result;
    }
    
    /** Accessor */
    public boolean shouldTerminate()
    {
    	return getCurrentState().equals(DEBUG_TERMINATE);
    }
	
    /**
     * tool function
     * @return the name property of the runtime object if available
     */
    public static String getRONameProp(RuntimeObject rObject){
    	RuntimeObject roName = (RuntimeObject)rObject.getProperties().get("name");
    	System.err.println("object : " + roName);
        return  roName == null ? "" : (String)roName.getData().get("StringValue");
    }
}
