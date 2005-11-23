/* $Id: IKermetaRemoteDebugPlatform.java,v 1.2 2005-11-23 16:18:59 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : IKermetaRemoteDebugPlatform.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 18, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Client side
 * @author zdrey
 *
 */
public interface IKermetaRemoteDebugPlatform extends Remote {

	/**
	 * Notify method called from the Server to tell him the command has been processed
	 */
	public abstract Object notify(String command, String reason) throws RemoteException;
	public abstract String getCommand() throws RemoteException;
	public abstract void remoteInterpreterCreated() throws RemoteException;

}
