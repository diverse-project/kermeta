/* $Id: ResumeCondition.java,v 1.1 2005-11-24 14:22:37 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : ResumeCondition.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 24, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.debug.IKermetaDebugCondition;

public class ResumeCondition implements IKermetaDebugCondition {

	public KermetaRemoteInterpreter remoteInterpreter;
	
	public ResumeCondition(KermetaRemoteInterpreter remote)
	{
		remoteInterpreter = remote;
	}
	
	/**
	 * This method, that should be called "shouldBlock", is called by the DebugInterpreter
	 * and control the blocked/unblocked mode of the RemoteInterpreter thread
	 */
	public void blockInterpreter() {
		// TODO Auto-generated method stub

	}

	public String getConditionType() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDebugInterpreter(DebugInterpreter interpreter) {
		// TODO Auto-generated method stub

	}

	public boolean evaluate() {
		// TODO Auto-generated method stub
		return false;
	}

}
