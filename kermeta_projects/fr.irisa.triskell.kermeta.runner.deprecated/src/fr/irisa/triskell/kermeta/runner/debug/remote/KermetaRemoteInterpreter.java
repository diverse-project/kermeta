/* $Id: KermetaRemoteInterpreter.java,v 1.2 2005-11-23 16:18:59 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaRemoteInterpreter.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 18, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;

import fr.irisa.triskell.kermeta.runner.debug.remote.RemoteCallFrame;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.util.KermetaDebugWrapper;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher;


public class KermetaRemoteInterpreter extends UnicastRemoteObject implements IKermetaRemoteInterpreter {

	
	/** The client that ask requests to the interpreter */
	public IKermetaRemoteDebugPlatform remoteDebugPlatform;
	public DebugInterpreter interpreter;
	public String startfile;
	public String classname;
	public String opname;
	public String args;
	public boolean invoked;
	public boolean blocked;
	/** The debug condition controls the freeze/block of the thread until
	 *  a new event occurs */
	//public RemoteDebugCondition debugCondition;
	
	// Ask platform if it can unblock
	public static final String ASK_PLATFORM = "ask";
	
	// "degraded" Objects that represent the interpreter context
	public RemoteCallFrame[] frames; 
	 
	
	public KermetaRemoteInterpreter(String p_startfile, String p_classname, String p_opname, String p_args) throws RemoteException {
		super(); 
		startfile = p_startfile;
		classname = p_classname;
		opname    = p_opname;
		args      = p_args;
		invoked = false; 
		blocked = false;
		createKermetaInterpreter();

	//	debugCondition = new RemoteDebugCondition(this);
		
	}

	/**
	 * Execute the command defined by the given argument
	 * TODO : implement the pattern command
	 */
	public Object execute(String command) throws RemoteException {
		
		String reason = "";
		// Memory access
		if (command.equals("suspend"))
		{
			System.out.println("suspend");
			interpreter.setSuspended(true, "");
			
		}
		if (command.equals("stepInto"))
		{			
			System.out.println("salut toto");
			if (invoked == false)
			{ invoked = true; interpreter.invoke_debug(); } 
			
			interpreter.setSuspended(false, "stepInto");
			// After the interpreter did its work by its side, we can get what is its
			// new state
			// And the reason of the stop .. stepEnd, or terminated
			if (interpreter.isSuspended())
			{
				reason = interpreter.getCurrentCommand();
				// if command/reason was stepEnd -> send "stepEnd"
			}
			System.out.println("fin de salut toto");
//			interpreter.invoke_debug();
			
		}
		
		// Ask command :
		if (command.equals("ask"))
		{
			System.out.println("ask command!");
		}
		
		// The reason conditions the type of event we have to send to the GUI
		remoteDebugPlatform.notify(command, reason);
		return null;
	}
	
	/** Register the client which is the KermetaDebugPlatform*/
	public void registerKermetaRemoteDebugPlatform(IKermetaRemoteDebugPlatform p_debugplatform) throws RemoteException {
		remoteDebugPlatform = p_debugplatform;
	}
	
	
	/**
	 * Creates the Kermeta interpreter and sets it to the KermetaDebugTarget.
	 * If the interpreter is launched under a separate process, it is this method
	 * that you need to redefine.
	 *
	 */
	public void createKermetaInterpreter()
	{
		//Instanciate the debug interpreter
		System.err.println("START FILE : " + startfile);
		KermetaInterpreter global_interpreter = KermetaLauncher.getDefault().runKermeta(
        		startfile, classname, opname, args, true) ; //, null);//debugCondition);
        
        interpreter = (DebugInterpreter)global_interpreter.getMemory().getCurrentInterpreter();
        //interpreter.setDebugCondition(new RemoteDebugCondition(this));
       // interpreter.invoke_debug();
	}
	


	/**
	 * @return Returns the interpreter.
	 */
	public DebugInterpreter getInterpreter() {
		return interpreter;
	}

	/**
	 * @param interpreter The interpreter to set.
	 */
	public void setInterpreter(DebugInterpreter interpreter) {
		this.interpreter = interpreter;
	}
	

	/**
	 * @return Returns the remoteDebugPlatform.
	 */
	public IKermetaRemoteDebugPlatform getRemoteDebugPlatform() {
		return remoteDebugPlatform;
	}
	
	public void setFrames(RemoteCallFrame[] p_frames)
	{
		frames = p_frames;
	}
	
	public RemoteCallFrame[] getFrames()
	{
		return KermetaDebugWrapper.getRemoteCallFrames(interpreter);
	}

	public boolean isBlocked()
	{
		return blocked;
	}
	
	public void block() throws RemoteException { blocked = true; }
	public void unblock() throws RemoteException { blocked = false; }
	/*
	 * 
	 *  A C C E S S O R S
	 * 
	 */


}
