/* $Id: DebugInterpreter.java,v 1.7 2005-12-01 18:42:33 zdrey Exp $
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


import fr.irisa.triskell.kermeta.behavior.FAssignement;
import fr.irisa.triskell.kermeta.behavior.FBlock;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FCallVariable;
import fr.irisa.triskell.kermeta.behavior.FConditionnal;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.behavior.FLoop;
import fr.irisa.triskell.kermeta.behavior.FVariableDecl;

import fr.irisa.triskell.kermeta.behavior.FRescue;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;

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
    // The reason of a suspension, and that correspond to a end-user command
    // (step, stop...)
    // TOODO : rename currentCommand into currentState
    public String currentCommand = "";
    // The call frame is used 
    protected CallFrame stepOverCallFrame; 
    
    public FClass entryObject ;
    public FOperation entryOperation ;
    public ArrayList entryArguments  ;
    
    public EObject currentNode; // The current node that is being interpreted.
    public ArrayList currentResultList;
    public AbstractKermetaDebugCondition debugCondition;
     
    // A reference to the KermetaRemoteInterpreter that drives our DebugInterpreter.
    public boolean debugMode;
    public String debugMessage;
    
    /**
     * @param pMemory
     */
    public DebugInterpreter(RuntimeMemory pMemory) {
        super(pMemory);
        // Debug mode. Can be modified for the stepOver/stepReturn instructions.
        debugMode = true;
    }
    
    /**
	 * Initialize the foperation argument on the ro_target Runtime Object;
	 *  arguments to this call are given as an ArrayList
	 *  no invocation of operation is done here
	 * @param ro_target
	 * @param foperation
	 * @param arguments
	 * @return
	 */
	public Object initialize(RuntimeObject ro_target,FOperation foperation,ArrayList arguments) {
		
		RuntimeObject result=null;
		RuntimeObjectFactory roFactory = memory.getROFactory(); 
		
		FClass self_type = (FClass)ro_target.getMetaclass().getData().get("kcoreObject");
		
		entryObject = self_type;
		entryOperation = foperation;
		entryArguments = arguments;
		
		CallableOperation op = new CallableOperation(foperation, self_type);
		// Create a context for this operation call, setting self object to ro_target
		// We should have a FCallFeature
        interpreterContext.pushOperationCallFrame(ro_target, op, arguments, null);
		return result;
	}
	
	/**
	 * Special invocation method initialize and invoke are splitted so that specific
	 * initializations can be done outside the interpreter.
	 * @return
	 */
	public Object invoke_debug()
	{
		Object result = null;
		try {
	        // Resolve this operation call
	        result = (RuntimeObject)this.accept(entryOperation);
       }
       finally {
	        // After operation has been evaluated, pop its context
    	   System.out.println("  ---- pop!!!!!!!");
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
		processPostCommand();
		
		return result;
	}

	

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFAssignement(fr.irisa.triskell.kermeta.behavior.FAssignement)
     */
    public Object visitFAssignement(FAssignement node) {
    	Object result = null;
    	processDebugCommand(node);
    	result = super.visitFAssignement(node);
        processPostCommand();
        return result;
    }
    
    /* (non-Javadoc)
     * Yet the code is not properly "shared" with the ExpressionInterpreter.
     * As soon as it works well, we will adapt it.
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFBlock(fr.irisa.triskell.kermeta.behavior.FBlock)
     */
    public Object visitFBlock(FBlock node)
    {
    	 RuntimeObject result = memory.voidINSTANCE;
    	 
    	 processDebugCommand(node);
    	 result = (RuntimeObject)super.visitFBlock(node);
    	 processPostCommand();
    	 
    	 return result;
    }
    
    /** 
     * 
     */
    public Object visitFCallFeature(FCallFeature node) {
    	Object result = null;
    	processDebugCommand(node);
    	result = super.visitFCallFeature(node);
    	processPostCommand();
    	
        return result;
    }
    
    
    
	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitFLoop(fr.irisa.triskell.kermeta.behavior.FLoop)
	 */
	public Object visitFLoop(FLoop node) {
		Object result = null;
		processDebugCommand(node);
		result = super.visitFLoop(node);
		processPostCommand();
		return result;
	}

	public Object visitFConditionnal(FConditionnal node) {
		Object result = null;
		//processDebugCommand(node);
		result = super.visitFConditionnal(node);
		//processPostCommand();
		return result;
	}
	

    /* 
     *
     * The following methods represent the debugger commands.
     * Later command pattern use will be useful
     * Yet, we only have implemented step over, but we have to consider the following:
     *  
     *  - step over (step without going into subroutine) 
     *  - step into
     *  - step X where X is the number of statements to execute before next step
     *  - run to next breakpoint
     */

    
	/**
     * 
     * @return true if we have a debug message, false otherwise
     */
    public boolean hasDebugMessage()
    {
    	return (!debugMessage.equals(""));
    }
    
    /** set the debugMode */
    public void setDebugMode(boolean debug_mode)
    {
    	debugMode = debug_mode;
    }
    
    public void setDebugMessage(String debug_message)
    {
    	debugMessage = debug_message;
    }
    
    public String getDebugMessage(String debug_message)
    {
    	return debugMessage;
    }
    
    /*
     *  TODO : Put it in a special {facade} class
     * 
     * 
     */
    
    /** Called after an operation (a visit more precisely) is done */
    public void processPostCommand()
    {
    	System.err.println("* FirstCallFrame = " + interpreterContext.getFrameStack().firstElement() +
				"\n* the peeked : " + getInterpreterContext().peekCallFrame() + "\n");
    	CallFrame current_frame = getInterpreterContext().peekCallFrame();
    	
    	// If the stepOverCallFrame that conditioned the stop of the stepOver was poped
    	// then we set it to the last peeked frame.
    	// On stepInto mode, stepOverCallFrame is not set.
    	if (!interpreterContext.getFrameStack().contains(stepOverCallFrame) && !isStepping())
    	{
    		stepOverCallFrame = current_frame;
    	}
    	
    	
    	// If the command was a stepInto : suspend the debugintepreter
    	
    	if (isStepping()) setSuspended(true, DEBUG_STEPEND);
    	if (currentCommand.equals(DEBUG_STEPOVER) 
    			&& 
    			!stepOverCallFrame.equals(current_frame)
    		   //!current_frame.equals(interpreterContext.getFrameStack().firstElement())
    			
   			)
    		setSuspended(false, DEBUG_STEPOVER);
    	else if (currentCommand.equals(DEBUG_STEPOVER) && 
    			current_frame.equals(interpreterContext.getFrameStack().firstElement())
    	)
    		setSuspended(true, DEBUG_STEPEND);
    	// If the command was a stepOver : get the current call frame.
    	// If it is not the last registered at the last stepOver execution,
    	// do not suspend.
   /* 	if (isStepping()) 
    	{
    		
    		// Step over can stop if and only if :
    		// - The stepOverCallFrame is null,
    		// - The stepOverCallFrame is the one where we were before stepping
    		// - The stepOverCallFrame is no more in the frame stack.
    		if ( stepOverCallFrame == null ||
    	 	// ||  stepOverCallFrame.equals(this.getInterpreterContext().peekCallFrame())
    	 	// || !this.getInterpreterContext().getFrameStack().contains(stepOverCallFrame))
    			getInterpreterContext().getFrameStack().size()>0 && 
    			stepOverCallFrame.equals(this.getInterpreterContext().getFrameStack().get(0)))
    		{
    			
    			setSuspended(true, DEBUG_STEPEND);
    		}
    		else
    		{
    			currentCommand = getDebugCondition().getConditionType();
    			setSuspended(false, getDebugCondition().getConditionType());
    		}
    	}
    	else
    	{
    		
    	//	setSuspended(false, getDebugCondition().getConditionType());
    	} */
    }

    /**
     * 
     * @param current_node
     */
    public Object processDebugCommand(EObject current_node)
    {
    	if (getDebugCondition()!=null)
    	{
    		//System.err.println("last debug condition : " + getDebugCondition().getConditionType());
    		// Tell the debug condition where we are
    		getDebugCondition().setCurrentNode(current_node);
    		getDebugCondition().blockInterpreter();
    	}
    	return null;
    }
    
    /** Returns the position of the listIterator from which we have to
     *  debug interprete.*/
    public int processDebugCommandList(EList expressions) {
    	
    	Iterator exp_it = expressions.iterator();
    	int current_position = 0;
    	boolean node_found = false;
    	// If currentNode is not null
    	if (currentNode != null)
    	{
    		while (exp_it.hasNext() && !node_found)
    		{
    			EObject node = (EObject)exp_it.next();
    			if (node == currentNode)
    			{
    				node_found = true;
    			}
    			current_position+=1;
    		}
    	}
    	// If there is no more node to process
    	else current_position = expressions.size();
    	// If we have not found the current node position
    	if (!node_found && current_position==expressions.size()) 
    		current_position = 0;
		return current_position;
	}
	
	/*
	 * Special accessors for interactive debug mode
	 * 
	 */
	
	//
	public boolean isStepping()
	{
		return (currentCommand.equals(DEBUG_STEPINTO));// || currentCommand.equals(DEBUG_STEPOVER));
	}
	
	/** 
	 * Put the interpreter in pause mode
	 * 
	 * @param reason choices :
	 * 	- stepEnd
	 */
	public void setSuspended(boolean suspended, String reason)
	{
		interpreterSuspended = suspended;
		currentCommand = reason;
	}
	public boolean isSuspended() { return interpreterSuspended == true; }
	

	public String getCurrentCommand()
	{	return currentCommand; }
	public void setCurrentCommand(String command)
	{	currentCommand = command;}
    
	/** Returns the call frame in which the step over command has begun */
	public CallFrame getStepOverCallFrame()
	{	return stepOverCallFrame; }
	public void setStepOverCallFrame()
	{
		// peekCallFrame is null if this method is called before interpreter
		// was initialized : still sync. problems
		if (!getInterpreterContext().getFrameStack().isEmpty() && 
			stepOverCallFrame == null
		)
			
			stepOverCallFrame = getInterpreterContext().peekCallFrame(); 
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
	 * Visit a variable declaration also deserves a stop in the step mode. 
	 * @see fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter#visitFVariableDecl(fr.irisa.triskell.kermeta.behavior.FVariableDecl)
	 */
	public Object visitFVariableDecl(FVariableDecl node) {
		Object result = null;
		processDebugCommand(node);
		result = super.visitFVariableDecl(node);
		processPostCommand();
		return result;
	}
	
}
