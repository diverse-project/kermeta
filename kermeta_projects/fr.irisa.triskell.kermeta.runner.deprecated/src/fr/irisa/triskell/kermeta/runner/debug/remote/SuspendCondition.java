/* $Id: SuspendCondition.java,v 1.1 2005-11-24 18:33:18 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : StepIntoCondition.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 24, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import java.rmi.RemoteException;

import org.eclipse.debug.core.model.IStackFrame;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.IKermetaDebugCondition;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;

public class SuspendCondition implements IKermetaDebugCondition {

	public KermetaRemoteInterpreter remoteInterpreter;
	
	public SuspendCondition(KermetaRemoteInterpreter remote)
	{
		remoteInterpreter = remote;
	}
	
	public SuspendCondition() {}
	
	public void blockInterpreter() {
		if (this.evaluate() == true)
		{	
			try
			{
				// first notify
				remoteInterpreter.getRemoteDebugPlatform().notify(RunnerConstants.SUSPEND, "");
				
				// then block
				remoteInterpreter.block();
			}
			catch (RemoteException e) { e.printStackTrace(); }
		}
		else
		{
			try { remoteInterpreter.unblock(); }
			catch (RemoteException e) { e.printStackTrace(); }
		}
				

	}

	public String getConditionType() {
		return "suspend";
	}

	public void setDebugInterpreter(DebugInterpreter interpreter) {
		// TODO Auto-generated method stub

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
		if (cmd.equals(RunnerConstants.SUSPEND))
		{
			return true;
		}
		if (cmd.equals(RunnerConstants.STEP_INTO)||cmd.equals(RunnerConstants.RESUME))
		{
			return false;
		}
		// The other commands should be disabled!!
		return false;
	}
	
	public RemoteCallFrame[] getRemoteCallFrames()
	{
		RemoteCallFrame[] frames =  remoteInterpreter.getFrames(); //target.getRemoteInterpreter().getFrames();
		return frames;
	}

}
