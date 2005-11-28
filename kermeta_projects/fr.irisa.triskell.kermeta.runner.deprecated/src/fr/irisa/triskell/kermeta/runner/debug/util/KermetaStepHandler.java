/* $Id: KermetaStepHandler.java,v 1.3 2005-11-28 18:54:35 zdrey Exp $
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
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
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
		thread.fireSuspendEvent(DebugEvent.STEP_END);
	}
	
	public void breakpointFound(KermetaDebugThread thread)
	{
		//	 Suspend back the execution
		thread.setSuspended(true);
		// Fire the breakpoint found event
		thread.fireSuspendEvent(DebugEvent.BREAKPOINT);
	}

}
