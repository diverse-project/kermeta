/* $Id: IKermetaRemoteDebugUI.java,v 1.2 2005-12-01 18:29:07 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : IKermetaRemoteDebugUI.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 18, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.eclipse.debug.core.DebugException;

/**
 * Client side
 *
 */
public interface IKermetaRemoteDebugUI extends Remote {

	/**
	 * Notify method called from the Server (RemoteInterpreter) to tell "this" Interface
	 * that the command has been processed
	 */
	public abstract Object notify(String command, String reason) throws RemoteException;
	
	/**
	 * Get the current command that is being processed
	 * @return
	 * @throws RemoteException
	 */
	public abstract String getCommand() throws RemoteException;
	
	/**
	 * Callback method that is called when the RemoteInterpreter has been binded
	 * in the RMI protocole.
	 * @throws RemoteException
	 */
	public abstract void remoteInterpreterCreated() throws RemoteException;
	
	// stepping, running, suspended..
	/**
	 * Get the current state of the Debug, among :
	 * - isStepping
	 * - resumed
	 * - suspended
	 */
	public abstract String getDebugState() throws RemoteException;
	
	/** 
	 * Get the locations of the breakpoints on the main file that is being
	 * debugged 
	 */
	public abstract Integer[] getBreakpointLines() throws RemoteException;

	// should not be in the interface
	public abstract void unregisterRemoteInterpreter() throws RemoteException;

}
