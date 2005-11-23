/* $Id: RemoteDebugCondition.java,v 1.1 2005-11-23 16:18:59 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : RemoteDebugCondition.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 23, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import java.rmi.RemoteException;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.debug.IKermetaDebugCondition;

public class RemoteDebugCondition  implements IKermetaDebugCondition {

	
	protected KermetaRemoteInterpreter remoteInterpreter;
	
	public RemoteDebugCondition(KermetaRemoteInterpreter remote_i)
	{
		remoteInterpreter = remote_i ;
	}
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.interpreter.debug.IKermetaDebugCondition#blockInterpreter()
	 *
	 */
	public void blockInterpreter() {
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.interpreter.debug.IKermetaDebugCondition#getConditionType()
	 */
	public String getConditionType() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDebugInterpreter(DebugInterpreter arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean evaluate() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
