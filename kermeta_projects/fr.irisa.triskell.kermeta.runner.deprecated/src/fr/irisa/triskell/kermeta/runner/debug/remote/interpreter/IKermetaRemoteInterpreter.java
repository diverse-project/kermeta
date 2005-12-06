/* $Id: IKermetaRemoteInterpreter.java,v 1.4 2005-12-06 18:53:16 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : IKermetaRemoteInterpreter.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 18, 2005
 * Authors       : zdrey
 * Note : be careful, java.rmi.Remote is only available since java 5
 */
package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter;

import java.rmi.Remote;
import java.rmi.RemoteException;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;

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
	public abstract void registerKermetaRemoteDebugUI(IKermetaRemoteDebugUI p) throws RemoteException;
	public abstract DebugInterpreter getInterpreter() throws RemoteException;
	public abstract void setInterpreter(DebugInterpreter interpreter) throws RemoteException;
	public abstract IKermetaRemoteDebugUI getRemoteDebugUI() throws RemoteException;
	
	// Access to the interpreter context
	public abstract SerializableCallFrame[] getSerializableCallFrames() throws RemoteException;
	
	/** @returns the debug condition that is currently attached to the DebugInterpreter */
	public abstract void changeSuspendedState(boolean isSuspended) throws RemoteException;
	
	// Blocks itself
	//public abstract void block() throws RemoteException;
	public abstract void unblock() throws RemoteException;
	
	// Change the stop condition strategy
	public void setDebugCondition(String cond_name) throws RemoteException;
	public String getDebugCondition() throws RemoteException;
	public abstract void terminate() throws RemoteException;
	public abstract SerializableVariable[] getSerializableVariablesFromSerializableValue(SerializableValue s_value) throws RemoteException;
}
