/* $Id: IKermetaRemoteInterpreter.java,v 1.3 2005-11-24 14:22:37 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : IKermetaRemoteInterpreter.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 18, 2005
 * Authors       : zdrey
 * Note : be careful, java.rmi.Remote is only available since java 5
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.RemoteCallFrame;;

/**
 * Server side (receive and process the requests)
 *
 */
public interface IKermetaRemoteInterpreter extends Remote
{

	/**
	 * Execute the command given in arguments
	 * @param command
	 */
	public abstract Object execute(String command) throws RemoteException;
	public abstract void registerKermetaRemoteDebugPlatform(IKermetaRemoteDebugPlatform p) throws RemoteException;
	public abstract DebugInterpreter getInterpreter() throws RemoteException;
	public abstract void setInterpreter(DebugInterpreter interpreter) throws RemoteException;
	public abstract IKermetaRemoteDebugPlatform getRemoteDebugPlatform() throws RemoteException;
	
	public abstract RemoteCallFrame[] getFrames() throws RemoteException;
	public abstract void setFrames(RemoteCallFrame[] frames) throws RemoteException;
	
	// Blocks itself
	public abstract void block() throws RemoteException;
	public abstract void unblock() throws RemoteException;
	
	// Change the stop condition strategy
	public void setDebugCondition(String cond_name) throws RemoteException;
}
