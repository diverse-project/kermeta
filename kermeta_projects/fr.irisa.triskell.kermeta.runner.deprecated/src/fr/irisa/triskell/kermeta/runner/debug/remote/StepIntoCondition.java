/* $Id: StepIntoCondition.java,v 1.1 2005-11-24 14:22:37 zdrey Exp $
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

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.debug.IKermetaDebugCondition;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;

public class StepIntoCondition implements IKermetaDebugCondition {

	public KermetaRemoteInterpreter remoteInterpreter;
	
	public StepIntoCondition(KermetaRemoteInterpreter remote)
	{
		remoteInterpreter = remote;
	}
	
	public void blockInterpreter() {
/*		if (this.evaluate() == true)
		{	
			try { remoteInterpreter.block(); }
			catch (RemoteException e) { e.printStackTrace(); }
		}
		else
		{
			try { remoteInterpreter.unblock(); }
			catch (RemoteException e) { e.printStackTrace(); }
		}
*/				

	}

	public String getConditionType() {
		return "stepInto";
	}

	public void setDebugInterpreter(DebugInterpreter interpreter) {
		// TODO Auto-generated method stub

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
		if (cmd.equals(RunnerConstants.STEP_END))
		{
			return true;
		}
		// The interpreter commands must be updated as often as necessary!!!
		// Are we still in stepping mode?
		if (cmd.equals(RunnerConstants.STEP_INTO))
		{
			return false;
		}
		return false;
	}

}
