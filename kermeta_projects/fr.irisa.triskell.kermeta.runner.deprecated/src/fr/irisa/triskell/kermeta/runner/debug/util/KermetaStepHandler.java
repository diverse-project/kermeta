/* $Id: KermetaStepHandler.java,v 1.1 2005-11-10 15:44:28 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaStepHandler.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 10, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.util;

import org.eclipse.debug.core.DebugEvent;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;

/** 
 * This is a class that handles the step commands.(step into, step over) 
 * 
 *
 */
public class KermetaStepHandler {
	
	/** The target that contains infos like the interpreter 
	 * */
	KermetaDebugTarget target;
	DebugInterpreter interpreter; // we get it from the KermetaDebugTarget
	
	
	public KermetaStepHandler(KermetaDebugTarget p_target)
	{
		target = p_target;
		interpreter = target.getDebugInterpreter();
	}
	
	/**
	 * Step into method : 
	 * Evaluate the current expression
	 * Fire a STEP_END event
	 * */
	public void doStepInto(KermetaDebugThread thread)
	{
		// Get the current interpreter
		
		// Evaluate the current expressino
		
		// Go to next frame if necessary?
		
		// Fire step end request
		
	}
	
	public void doStepOver(KermetaDebugThread thread)
	{
		// Get the current interpreter and current statement
		
		
		// Evaluate the current statement
		
		// Go to next frame if necessary?
		
		// Graphic action : go to the next statement. -> how to find next line?:
		// "simple" : use KermetaDebugWrapper, and wrap the CallFrames of the new
		// state of the debug interpreter Context.
		

		// Fire step end request
		stepEnd(thread);
	}
	
	public void doStepReturn(KermetaDebugThread thread)
	{
		
	}
	
	/**
	 * Cleans up when a step completes. 
	 * Thread state is set to suspended. 
	 * Stepping state is set to false 
	 * Stack frames and variables are incrementally updated 
	 * The step request is deleted and removed as and event listener A suspend event is fired
	 * @param thread
	 */
	public void stepEnd(KermetaDebugThread thread)
	{
		// Suspend back the execution
		thread.setSuspended(true);
		// Fire the step end event
		thread.fireEvent(new DebugEvent(thread, DebugEvent.STEP_END));
	}

}
