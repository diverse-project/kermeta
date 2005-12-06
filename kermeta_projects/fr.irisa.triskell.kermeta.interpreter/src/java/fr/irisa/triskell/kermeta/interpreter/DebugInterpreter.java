/* $Id: DebugInterpreter.java,v 1.10 2005-12-06 18:56:55 zdrey Exp $
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
import java.util.Iterator;

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
import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
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
    // TODO : rename currentCommand into currentState
    /** The reason/state of the debugging
    (among stepEnd, stepInto, stepOver.) */
    public String currentCommand = "";
    /** The stop condition for the stepOver command */ 
    protected CallFrame stepOverCallFrame; 
    protected CallFrame current_frame;
    
    public FClass entryObject ;
    public FOperation entryOperation ;
    public ArrayList entryArguments  ;
    public AbstractKermetaDebugCondition debugCondition;
	private CallFrame before_call_frame;
	private CallFrame after_call_frame;
	private FOperation currentOperation;
	/** The current statement that is being processed? */
	private FObject currentStatement;
    
    /**
     * @param pMemory
     */
    public DebugInterpreter(RuntimeMemory pMemory) {
        super(pMemory);
        currentCommand = DEBUG_RESUME;
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
	 */
	public Object invoke_debug()
	{
		System.out.println("Begin invoke_debug");
		Object result = null;
		try {
	        // Resolve this operation call
	        result = (RuntimeObject)this.accept(entryOperation);
	        System.out.println("operation invoked!");
       }
	   catch (Exception e)
	   {
		   System.err.println("There is an unexpected exception :( : ");
		   e.printStackTrace();
	   }
       finally {
	        // After operation has been evaluated, pop its context
    	    interpreterContext.popCallFrame();
	        // Remote side of the interpreter reads this attribute and act accordingly
	        currentCommand = DEBUG_TERMINATE;
	        // Run a last time the debug command that tests if we can interrupt.....laborious
	        processDebugCommand(entryOperation);
       }
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
		processDebugCommand(node);
		result = super.visitFOperation(node);
		processPostCommand(node);
		return result;
	}

    /**
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFAssignement(fr.irisa.triskell.kermeta.behavior.FAssignement)
     */
    public Object visitFAssignement(FAssignement node) {
    	Object result = null;
    	processDebugCommand(node);
    	result = super.visitFAssignement(node);
        processPostCommand(node);
        return result;
    }
    
    /** 
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFCallFeature(fr.irisa.triskell.kermeta.behavior.FCallFeature)
     */
    public Object visitFCallFeature(FCallFeature node) {
    	Object result = null;
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
     */
    public Object visitFBlock(FBlock node)  {
    	return (RuntimeObject)super.visitFBlock(node); 
    }
    
	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitFCallSuperOperation(fr.irisa.triskell.kermeta.behavior.FCallSuperOperation)
	 */
	public Object visitFCallSuperOperation(FCallSuperOperation node) {
		Object result = null;
		processDebugCommand(node);
		result = super.visitFCallSuperOperation(node);
		processPostCommand(node);
		return result;
	}
	
	

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitFJavaStaticCall(fr.irisa.triskell.kermeta.behavior.FJavaStaticCall)
	 */
	public Object visitFJavaStaticCall(FJavaStaticCall node) {
		Object result = null;
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
		Object result = null;
		processDebugCommand(node);
		result = super.visitFVariableDecl(node);
		processPostCommand(node);
		return result;
	}

	

	/** 
	 * Called after a visit is done : this method updates the "currentCommand" attribute
	 * of the debug interpreter according to the kind of command the user asked 
	 * for (typically, stepInto, stepOver, or resume), so that the "KermetaRemoteInterpreter"  can block its thread
	 * accordingly.
	 * @param node the node of the visit that preceded the call of this postCommand */
    public void processPostCommand(FObject node)
    {
    	current_frame = getInterpreterContext().peekCallFrame();
    	// If command is a step-into, then we stop systematically after a visit 
    	if (isSteppingInto() ) 
    	{
    		setSuspended(true, DEBUG_STEPEND);
    	}
    	// If it is step over and
    	// if the stepOverCallframe that conditioned the stop of the stepOver was poped
    	// (this case occurs for example when a step-over command follows a step-into),
    	// then we set it to the last peeked frame.
    	else if (isSteppingOver() && !interpreterContext.getFrameStack().contains(stepOverCallFrame))
    	{
    		stepOverCallFrame = getInterpreterContext().peekCallFrame();
    	}
    	// If it is a step-over and we are not yet back in the stepOverCallFrame,
    	// then we can continue
    	else if (isSteppingOver() && !stepOverCallFrame.equals(current_frame))
    		setSuspended(false, DEBUG_STEPOVER);
    	// If it is a step-over, and we are in the stepOverCallFrame, and the last
    	// statement that had to be evaluated correspond to the node that we just visited,
    	// then it means the visit of the statement is completed, so, we can stop.
    	else if (isSteppingOver() && current_frame.equals(stepOverCallFrame)
    			 &&
    			 node.equals(current_frame.peekExpressionContext().getStatement()))
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
    	{
    		// Tell the debug condition where we are
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
	{	return (currentCommand.equals(DEBUG_STEPINTO));}

	public boolean isSteppingOver()
	{	return (currentCommand.equals(DEBUG_STEPOVER));}
	
	
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
		currentCommand = reason;
	}
	public boolean isSuspended() { return interpreterSuspended == true; }
	/** @return the current command being executed by the debuginterpreter */
	public String getCurrentCommand() {	return currentCommand; }
	/** set the current command being executed by the debuginterpreter */
	public void setCurrentCommand(String command) {	currentCommand = command;}
    
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
				System.err.println("step after resume!");
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
    	RuntimeObject result = null;
    	if (getInterpreterContext().getFrameStack().isEmpty()==false 
    		&& getInterpreterContext().peekCallFrame().hasVariables())
    	{
    		// We need to parse the current context?
    		Iterator it = getInterpreterContext().peekCallFrame().getVariables().keySet().iterator();
    		while (it.hasNext() && result == null)
    		{
    			Object nkey = it.next();
    			RuntimeObject rvalue = ((Variable)getInterpreterContext().peekCallFrame().getVariables().get(nkey)).getRuntimeObject();
    			if (rvalue.getOId() == oid) result = rvalue;
    		}
    	}
    	return result;
    }
    
    /** the runtime object stored in the variables of all the call frames */
    public ArrayList getContextRuntimeObjects()
    {
    	ArrayList result = new ArrayList();
    	if (getInterpreterContext().getFrameStack().isEmpty()==false)
    	{	
    		Iterator fit = getInterpreterContext().getFrameStack().iterator();
    		while (fit.hasNext())
    		{
    			CallFrame frame = (CallFrame)fit.next();
    			if (frame.hasVariables())
    			{
    				// We need to parse the current context?
    				Iterator it = frame.getVariables().values().iterator();
    				while (it.hasNext()) {
    					result.add(((Variable)it.next()).getRuntimeObject());
    				}
    				// Also add "self" object?
    				result.add(frame.getSelf());
    			}
    		}
    	}
    	//if (getInterpreterContext())
    	return result;
    }
	
}
