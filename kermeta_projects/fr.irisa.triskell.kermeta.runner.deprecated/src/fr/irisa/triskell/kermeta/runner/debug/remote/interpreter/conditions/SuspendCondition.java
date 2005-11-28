/* $Id: SuspendCondition.java,v 1.1 2005-11-28 18:54:36 zdrey Exp $
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

import org.eclipse.debug.core.model.IStackFrame;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableCallFrame;

public class SuspendCondition extends AbstractKermetaDebugCondition {

	public KermetaRemoteInterpreter remoteInterpreter;
	
	public SuspendCondition(KermetaRemoteInterpreter remote)
	{
		remoteInterpreter = remote;
	}
	
	public SuspendCondition() {}
	
	public void blockInterpreter() {
		System.out.println("Block in suspend condition!");
		if (this.evaluate() == true)
		{	
			System.err.println("SuspendCondition is always true");
			// first notify
			//remoteInterpreter.getRemoteDebugUI().notify(RunnerConstants.SUSPEND, "");
			
			// then block
			remoteInterpreter.block();
		}
		else
		{
			try { remoteInterpreter.unblock(); }
			catch (RemoteException e) { e.printStackTrace(); }
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
		if (cmd.equals(RunnerConstants.SUSPEND))
		{
			return true;
		}
		if (cmd.equals(RunnerConstants.STEP_INTO)||cmd.equals(RunnerConstants.RESUME))
		{
			System.err.println("suspend condition evaluation is false");
			return false;
		}
		// The other commands should be disabled!!
		return true;
	}

}
