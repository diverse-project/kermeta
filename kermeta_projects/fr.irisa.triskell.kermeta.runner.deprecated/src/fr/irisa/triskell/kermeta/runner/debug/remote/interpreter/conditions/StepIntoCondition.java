/* $Id: StepIntoCondition.java,v 1.5 2005-12-09 16:25:36 zdrey Exp $
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

import fr.irisa.triskell.kermeta.ast.FBlock;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.structure.FOperation;

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
				String cmd = remoteInterpreter.getInterpreter().getCurrentState();
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
	 * StepInto stop condition : we suspend after each atomic execution
	 * @return always true 
	 * */
	public boolean evaluate() {
		return true;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition#getConditionType()
	 */
	public String getConditionType() { return RunnerConstants.STEP_INTO; }

	
}
