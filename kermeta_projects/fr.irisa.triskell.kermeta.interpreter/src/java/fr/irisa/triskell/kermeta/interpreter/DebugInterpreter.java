/* $Id: DebugInterpreter.java,v 1.5 2005-11-24 18:36:44 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : DebugInterpreter.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 8, 2005
 * Authors       : (zdrey)
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


import fr.irisa.triskell.kermeta.behavior.FAssignement;
import fr.irisa.triskell.kermeta.behavior.FBlock;
import fr.irisa.triskell.kermeta.behavior.FBooleanLiteral;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FExpression;

import fr.irisa.triskell.kermeta.behavior.FRescue;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;

/**
 * This is the ExpressionInterpreter improved to handle the debugging mode 
 */
public class DebugInterpreter extends ExpressionInterpreter {

    EObject current_eobject;
    FBlock current_block;
    
    public static final String DEBUG_WAIT = "wait";
    public static final String DEBUG_STEPINTO = "stepInto";
    public static final String DEBUG_RESUME = "resume";
    public static final String DEBUG_SUSPEND = "suspend";
    public boolean interpreterSuspended = true;
    // The reason of a suspension, and that correspond to a end-user command
    // (step, stop...)
    public String currentCommand = "";
    public boolean VISIT_DONE ;
    
    public FClass entryObject ;
    public FOperation entryOperation ;
    public ArrayList entryArguments  ;
    
    public EObject currentNode; // The current node that is being interpreted.
    public ArrayList currentResultList;
    public IKermetaDebugCondition debugCondition;
     
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
        debugMessage = DEBUG_WAIT;
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
        debugMessage = DEBUG_WAIT;
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
			System.err.println("before invoke");
			processDebugCommand(entryOperation);
	        // Resolve this operation call
	        result = (RuntimeObject)this.accept(entryOperation);
	        processPostCommand();
	        System.err.println("after invoke");
        }
        finally {
	        // After operation has been evaluated, pop its context
	        interpreterContext.popCallFrame();
        }
        return result;
	}
	
	public void terminate()
	{
		interpreterContext.popCallFrame();
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
		System.err.println("VISIT OPERATION IN DEBUG MODE!");
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
    	if (!isSuspended())
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
    	 
    	 System.out.println("END of visit block in debug mode");
    	 return result;
    }
    
    /** 
     * 
     */
    public Object visitFCallFeature(FCallFeature node) {
    	
    	System.err.println("DebugInterpreter : visitFCallFeature");
    	Object result = null;
    	
    	processDebugCommand(node);
    	//if (!isSuspended())
    	
    	result = super.visitFCallFeature(node);
    	
    	processPostCommand();
    	
        return result;
    }
    
	/**
	 * visit a list of expressions (usually come from a FBlock)
	 * @param expressions
	 * @return an ArratList of RuntimeObjects
	 */
/*	public ArrayList visitList(EList expressions)
	{
		ArrayList result_list = new ArrayList();
		// NTOE : if pos == -1, it means that there is no next expression to evaluate!
		int pos = processDebugCommandList(expressions);
		// We have not yet called visitList....
		if (pos == 0)
		{
			// This is not good: curretnResultList should depend on a CallFrame
			currentResultList = result_list;
		}
		/// else... if currentNode instanceof FBlock then
		//	we get ...
		// This is a copy of the visitList of expresssionInterpreter.
		// We just changed iterator to list iterator
		// TODO : create a specific method in Exp. interpreter (visitList(exp, current_pos))
		Iterator it = expressions.listIterator(pos);
		while(it.hasNext()) {
			currentResultList.add(this.accept((EObject)it.next()));
		}
		processPostCommand();
		return result_list;
	}
	*/
    
    public ArrayList visitList(EList expressions)
    {
    	return super.visitList(expressions);
    }
    
    /** Update the needed values for the debug */
/*	public Object accept(EObject node) {
		// Throw an error if the node is null
		if (node == null) {
			throw new Error("Error in visitor : the node to visit is null");
		}
		// Get the accept command
		AcceptCommand cmd = KermetaOptimizedVisitor.getAcceptCmd(node);
		// Throw an error is the command is null
		if (cmd == null) {
			throw new Error(
					"Error in visitor : no strategy to handle node of type "
							+ node.getClass().getName());
		}
		// accept the node
		return cmd.accept(node, this);
	}*/
    
 
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
    
    public void checkDebugCommand()
    {
    	
    }
    
    /** Called after an operation (a visit more precisely) is done */
    public void processPostCommand()
    {
//    	 If the command was a step
    	System.err.println("the step is done! (postCommand message)");
    	if (isStepping()) setSuspended(true, "stepEnd");
    		

    }

    /**
     * 
     * @param current_node
     */
    public Object processDebugCommand(EObject current_node)
    {
    	System.err.println("SUSPENDU!");
    	if (getDebugCondition()!=null)
    		getDebugCondition().blockInterpreter();
    	
    	// If user
    	//processCommand(getCurrentCommand());
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

    
	public void processCommand(String cmd)
	{
		currentCommand    = cmd ;
		if ( cmd.equals(DEBUG_STEPINTO) ) {
			interpreterSuspended = false;
		}
		else if ( cmd.equals(DEBUG_SUSPEND) ) {	
			interpreterSuspended = true;
		}
		else if ( cmd.equals(DEBUG_RESUME)) {
			interpreterSuspended = true;
		}
		// stepOver, stepReturn belong to the next iteration of the DebugInterpreter 
	
	}
	
	/*
	 * Special accessors for interactive debug mode
	 * 
	 */
	
	//
	public boolean isStepping()
	{
		if (currentCommand.equals(DEBUG_STEPINTO)) System.out.println("Step mode is on.");
		return currentCommand.equals(DEBUG_STEPINTO);
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
		// Send a DEBUG_SUSPEND event, with reason "STEP_END" e.g
		//processDebugCommand();
	}
	public boolean isSuspended() { return interpreterSuspended == true; }
	

	public String getCurrentCommand()
	{	return currentCommand; }
	public void setCurrentCommand(String command)
	{	currentCommand = command;}
    
	public void setDebugCondition(IKermetaDebugCondition debug_cond)
	{
		debugCondition = debug_cond;
		debugCondition.setDebugInterpreter(this);
	}
	
	public IKermetaDebugCondition getDebugCondition()
	{
		return debugCondition;
	}
	
}
