/* $Id: RemoteDebugCondition.java,v 1.2 2005-11-24 14:22:37 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : RemoteDebugCondition.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 23, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;


import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.debug.IKermetaDebugCondition;

public class RemoteDebugCondition implements IKermetaDebugCondition {

	
	protected KermetaRemoteInterpreter remoteInterpreter;
	
	public RemoteDebugCondition(KermetaRemoteInterpreter remote_i)
	{
		remoteInterpreter = remote_i ;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.debug.remote.IKermetaInterruptCondition#blockInterpreter()
	 * -> should be "shouldBlock 
	 */
	public void blockInterpreter() {
		try {
			remoteInterpreter.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.debug.remote.IKermetaInterruptCondition#getConditionType()
	 */
	public String getConditionType() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.debug.remote.IKermetaInterruptCondition#setDebugInterpreter(fr.irisa.triskell.kermeta.interpreter.DebugInterpreter)
	 */
	public void setDebugInterpreter(DebugInterpreter arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.debug.remote.IKermetaInterruptCondition#evaluate()
	 */
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
