/* $Id: KermetaRemoteInterpreter.java,v 1.3 2005-11-24 14:22:37 zdrey Exp $
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
import java.util.Hashtable;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.debug.IKermetaDebugCondition;


import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.remote.RemoteCallFrame;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.util.KermetaDebugWrapper;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher;


public class KermetaRemoteInterpreter extends UnicastRemoteObject implements IKermetaRemoteInterpreter {

	
	/** The client that ask requests to the interpreter */
	// TODO : put in protected!
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
	public Hashtable conditions;
	
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

		createStopConditions();
		createKermetaInterpreter();
	}

	/** Initialize all the stop condition that could control the interpreter */
	public void createStopConditions()
	{
		conditions = new Hashtable();
		conditions.put(RunnerConstants.RESUME, new ResumeCondition(this));
		conditions.put(RunnerConstants.STEP_INTO, new StepIntoCondition(this));
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
        // Set the condition
        interpreter.setDebugCondition((IKermetaDebugCondition)conditions.get(RunnerConstants.RESUME));
       // interpreter.invoke_debug();
	}
	
	/** Shortcut method to change the interpreter stop condition */
	public void setDebugCondition(String cond_name)
	{
		interpreter.setDebugCondition((IKermetaDebugCondition)conditions.get(cond_name));
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
	
	public synchronized void block() throws RemoteException
	{
		blocked = true;
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void unblock() throws RemoteException
	{ 
		blocked = false;
		notify();
	}
	/*
	 * 
	 *  A C C E S S O R S
	 * 
	 */


}
