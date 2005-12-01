/* $Id: StepIntoCondition.java,v 1.2 2005-12-01 18:29:07 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : StepIntoCondition.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 24, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.conditions;

import java.rmi.RemoteException;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;

public class StepIntoCondition extends AbstractKermetaDebugCondition {

	public KermetaRemoteInterpreter remoteInterpreter;
	
	
	public StepIntoCondition(KermetaRemoteInterpreter remote)
	{
		remoteInterpreter = remote;
	}
	
	public StepIntoCondition() {}
	
	/** 
	 * */
	public void blockInterpreter() {
		try
		{
			if (this.evaluate() == true)
			{
				// cmd : the current command that the interpreter is/was just executing, or
				// the current state. (stepping : stepInto or stepOver, suspended : stepEnd or terminate)
				String cmd = remoteInterpreter.getInterpreter().getCurrentCommand();
				if (cmd.equals( RunnerConstants.TERMINATE ))
				{
					remoteInterpreter.getRemoteDebugUI().notify(RunnerConstants.TERMINATE, "");
				}
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

	public void setRemoteInterpreter(KermetaRemoteInterpreter remote)
	{
		remoteInterpreter = remote;
	}

	/** 
	 * Evaluate this stop condition necessary to stop or continue the debugging
	 * StepInto condition has a very simple evaluation : we suspend after each
	 * atomic execution
	 * (Note for later : StepOver will be a bit more complicated : we have
	 * to check if we are "back" to the CallFrame just before StepOver or
	 * still in an embedded CallFrame.) 
	 * @return true if the stop condition is verified (i.e if we have to stop!)
	 * */
	public boolean evaluate() {
		// Command ... not the right word : stepInto, stepEnd......
		String cmd = remoteInterpreter.getInterpreter().getCurrentCommand();
		// tell the UI that the step command is done.
		return (cmd.equals(RunnerConstants.TERMINATE) || cmd.equals(RunnerConstants.STEP_END));
	}

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition#getConditionType()
	 */
	public String getConditionType() { return RunnerConstants.STEP_INTO; }

	
}
