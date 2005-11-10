/* $Id: StepOverCommand.java,v 1.1 2005-11-10 15:44:28 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : StepOverCommand.java
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

public class StepOverCommand extends AbstractDebugCommand {

	public StepOverCommand(KermetaDebugThread t)
	{
		thread = t;
	}
	
	public void execute()
	{
		System.err.println("step over command!");
		DebugInterpreter interpreter = 
			((KermetaDebugTarget)thread.getDebugTarget()).getDebugInterpreter();
		
		// Resume the thread
		thread.setSuspended(false);
		// Send the event that step_over request is "activated"
		thread.fireEvent(new DebugEvent(thread, DebugEvent.RESUME, DebugEvent.STEP_OVER));
		
		/*interpreter.setDebugMessage(DebugInterpreter.DEBUG_STEPOVER);
		 interpreter.visitFOperation(interpreter.entryOperation);*/
		
		// Ask the step handler to execute the request
		// it also takes in charge the suspension of the thread and event sending 
		// when action is complete.
		((KermetaDebugTarget)target).getStepHandler().doStepOver(thread);
		
		
		
	}
}
