/* $Id: ResumeCondition.java,v 1.3 2005-12-06 18:53:16 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : ResumeCondition.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 24, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.conditions;


import java.rmi.RemoteException;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.Traceback;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.structure.FObject;

public class ResumeCondition extends AbstractBreakpointStopCondition {
	
	public ResumeCondition(KermetaRemoteInterpreter p_interpreter)
	{
		remoteInterpreter = p_interpreter;
	}
	
	/**
	 * This method, that should be called "shouldBlock", is called by the DebugInterpreter
	 * and control the blocked/unblocked mode of the RemoteInterpreter thread
	 */
	public void blockInterpreter() {
		if (evaluate() == true)
		{
			try
			{
				// blocked because the execution of the program is finished
				if (remoteInterpreter.getInterpreter().getCurrentCommand().equals(RunnerConstants.TERMINATE))
					remoteInterpreter.getRemoteDebugUI().notify(RunnerConstants.TERMINATE, "");
			}
			catch (RemoteException e) { e.printStackTrace();}
			// blocked by user choice or breakpoint
			remoteInterpreter.block();
		}
	}
	
	/**
	 * For the ResumeCondition, evaluation of stop consists on :
	 * - comparing the position of the debugging and the location of all the breakpoints
	 * - checking the state of the remoteDebugUI; if it is suspended, then the stop condition is true
	 * else, it is false.
	 */
	public boolean evaluate() {
		return (isSuspended);
	//	return ( super.evaluate() || isSuspended );
	}

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition#getConditionType()
	 */
	public String getConditionType() { return RunnerConstants.RESUME; }
	
	


}
