/* $Id: StepOverCondition.java,v 1.6 2005-12-09 16:25:36 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : StepOverCondition.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 30, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.conditions;

import java.rmi.RemoteException;

import fr.irisa.triskell.kermeta.ast.FBlock;
import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;
import fr.irisa.triskell.kermeta.interpreter.CallFrame;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;

// TODO : create an abstractKermetaStepCondition : the block method is always the same!
public class StepOverCondition extends AbstractBreakpointStopCondition {

	public KermetaRemoteInterpreter remoteInterpreter;
	
	public StepOverCondition(KermetaRemoteInterpreter r) 
	{
		remoteInterpreter = r;
		wasBreakpoint = false;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition#blockInterpreter()
	 */
	public void blockInterpreter() {
		
		try
		{
			if (this.evaluate() == true)
			{
				if (remoteInterpreter.getInterpreter().getCurrentState().equals(RunnerConstants.TERMINATE))
					// no reason is needed for terminate.
					remoteInterpreter.getRemoteDebugUI().notify(RunnerConstants.TERMINATE, "");
				else
				{
					remoteInterpreter.getRemoteDebugUI().notify(RunnerConstants.SUSPEND, 
							RunnerConstants.STEP_END);
					remoteInterpreter.block();
				}
			}
		}
		catch (RemoteException e)
		{
			e.printStackTrace();
		}
		
	}

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition#evaluate()
	 */
	public boolean evaluate() {
		// Command ... not the right word : stepInto, stepEnd, terminate......
		String cmd = remoteInterpreter.getInterpreter().getCurrentState(); 
		return (cmd.equals(RunnerConstants.STEP_END));
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition#getConditionType()
	 */
	public String getConditionType() { return RunnerConstants.STEP_OVER; }	

}
