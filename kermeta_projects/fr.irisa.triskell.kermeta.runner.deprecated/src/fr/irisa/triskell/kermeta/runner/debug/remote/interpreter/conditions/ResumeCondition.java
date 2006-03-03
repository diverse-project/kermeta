/* $Id: ResumeCondition.java,v 1.8 2006-03-03 15:23:35 dvojtise Exp $
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

//import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
//import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
//import fr.irisa.triskell.kermeta.interpreter.Traceback;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;


public class ResumeCondition extends AbstractBreakpointStopCondition {
	

	public ResumeCondition(KermetaRemoteInterpreter p_interpreter)
	{
		super(p_interpreter);
	}
	
	/**
	 * This method, that should be called "shouldBlock", is called by the DebugInterpreter
	 * and control the blocked/unblocked mode of the RemoteInterpreter thread
	 */
	public void blockInterpreter() {
		try
		{
			if (remoteInterpreter!=null && !remoteInterpreter.getRemoteDebugUI().getDebugState().equals(RunnerConstants.TERMINATE))
			{
				if (remoteInterpreter.getInterpreter().getCurrentState().equals( RunnerConstants.TERMINATE ))
					remoteInterpreter.getRemoteDebugUI().notify(RunnerConstants.TERMINATE, "");
				else if (evaluate() == true)
				{	// tell the reason
					if (wasBreakpoint)
					{
						remoteInterpreter.getRemoteDebugUI().notify(RunnerConstants.SUSPEND, RunnerConstants.BREAKPOINT);
					}
					// otherwise, if user choice, the GUI already notifyied.
					// blocked by user choice or breakpoint
					remoteInterpreter.block();
				}
			}
			
		}catch (RemoteException e) { e.printStackTrace();}
	}
	
	/**
	 * For the ResumeCondition, evaluation of stop consists on :
	 * - comparing the position of the debugging and the location of all the breakpoints
	 * - checking the state of the remoteDebugUI; if it is suspended, then the stop condition is true
	 * else, it is false.
	 */
	public boolean evaluate() {
	//	return (isSuspended);
		// If the stop condition is the presence of a breakpoint
		wasBreakpoint = super.evaluate();
		return ( wasBreakpoint || isSuspended );
	}

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition#getConditionType()
	 */
	public String getConditionType() { return RunnerConstants.RESUME; }
	
	


}
