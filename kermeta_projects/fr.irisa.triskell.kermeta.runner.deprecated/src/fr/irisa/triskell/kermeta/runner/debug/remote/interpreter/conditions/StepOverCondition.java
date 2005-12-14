/* $Id: StepOverCondition.java,v 1.7 2005-12-14 17:19:55 zdrey Exp $
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

	
	public StepOverCondition(KermetaRemoteInterpreter r) 
	{
		super(r);
	}

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition#blockInterpreter()
	 */
	public void blockInterpreter() {
		
		try
		{  
			// We don't need to evaluate anything if the GUI side as stopped the Debugging before the Interpreter
			// side.
			if (remoteInterpreter!=null && !remoteInterpreter.getRemoteDebugUI().getDebugState().equals(RunnerConstants.TERMINATE))
			{
				if (this.evaluate() == true)
				{
					if (remoteInterpreter.getInterpreter().getCurrentState().equals( RunnerConstants.TERMINATE ))
						remoteInterpreter.getRemoteDebugUI().notify(RunnerConstants.TERMINATE, "");
					else
					{
						remoteInterpreter.getRemoteDebugUI().notify(RunnerConstants.SUSPEND, 
							RunnerConstants.STEP_END);
						remoteInterpreter.block();
					}
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
		if (remoteInterpreter.getInterpreter()!=null) // means : if remoteInterpreter is not yet initialized..
		{
			String cmd = remoteInterpreter.getInterpreter().getCurrentState(); 
			return (cmd.equals(RunnerConstants.STEP_END)||cmd.equals(RunnerConstants.TERMINATE));
		}
		return false;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition#getConditionType()
	 */
	public String getConditionType() { return RunnerConstants.STEP_OVER; }	

}
