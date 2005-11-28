/* $Id: KermetaRemoteInterpreter.java,v 1.1 2005-11-28 18:54:35 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaRemoteInterpreter.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 18, 2005
 * Authors       : 
 *  zdrey <zdrey@irisa.fr>
 * 	dpollet <dpollet@irisa.fr>
 */
package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;


import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.conditions.ResumeCondition;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.conditions.StepIntoCondition;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.conditions.SuspendCondition;
import fr.irisa.triskell.kermeta.runner.debug.util.KermetaDebugWrapper;
import fr.irisa.triskell.kermeta.runner.launching.KermetaLauncher;


public class KermetaRemoteInterpreter extends UnicastRemoteObject implements IKermetaRemoteInterpreter {

	
	/** The client that ask requests to the remoteInterpreter */
	// TODO : put in protected!
	public IKermetaRemoteDebugUI remoteDebugUI;
	public DebugInterpreter interpreter;
	public String startfile;
	public String classname;
	public String opname;
	public String args;
	public boolean blocked;
	/** The debug condition controls the freeze/block of the thread until
	 *  a new event occurs */
	public Hashtable conditions;
	
	// Ask platform if it can unblock
	public static final String ASK_PLATFORM = "ask";
	
	public KermetaRemoteInterpreter(String p_startfile, String p_classname, String p_opname, String p_args) throws RemoteException {
		super(); 
		startfile = p_startfile;
		classname = p_classname;
		opname    = p_opname;
		args      = p_args;
		blocked = false;

		createStopConditions();
		createKermetaInterpreter();
	}

	/** Initialize all the stop condition that could control the remoteInterpreter */
	public void createStopConditions()
	{
		conditions = new Hashtable();
		//	IKermetaDebugCondition debugCond = null;
		conditions.put(RunnerConstants.SUSPEND, new SuspendCondition(this));
		conditions.put(RunnerConstants.RESUME, new ResumeCondition(this));
		conditions.put(RunnerConstants.STEP_INTO, new StepIntoCondition(this));
	}
	
	/**
	 * Execute the command defined by the given argument
	 * 
	 */
	public Object execute(String command) throws RemoteException {

		String reason = "";
		// Memory access
		if (command.equals(RunnerConstants.SUSPEND))
		{ 
			interpreter.setSuspended(true, "");
		}
		
		if (command.equals(RunnerConstants.STEP_INTO))
		{			 
			interpreter.setSuspended(false, "stepInto");
			// After the remoteInterpreter did its work by its side, we can get what is its
			// new state
			// And the reason of the stop .. stepEnd, or terminated
			if (interpreter.isSuspended())
			{
				reason = interpreter.getCurrentCommand();
				// if command/reason was stepEnd -> send "stepEnd"
			}
			System.out.println("fin de salut toto");
		}
		
		// The reason conditions the type of event we have to send to the GUI
		remoteDebugUI.notify(command, reason);
		return null;
	}
	
	/** Register the client which is the KermetaDebugPlatform*/
	public void registerKermetaRemoteDebugUI(IKermetaRemoteDebugUI p_debugplatform) throws RemoteException {
		remoteDebugUI = p_debugplatform;
	}
	
	
	/**
	 * Creates the Kermeta remoteInterpreter and sets it to the KermetaDebugTarget.
	 * If the remoteInterpreter is launched under a separate process, it is this method
	 * that you need to redefine.
	 *
	 */
	public void createKermetaInterpreter()
	{
		//Instanciate the debug remoteInterpreter
		KermetaInterpreter global_interpreter = KermetaLauncher.getDefault().runKermeta(
        		startfile, classname, opname, args, true) ; //, null);//debugCondition);
        
        interpreter = (DebugInterpreter)global_interpreter.getMemory().getCurrentInterpreter();
        // Set the condition of running
        setDebugCondition(RunnerConstants.RESUME);
        
       
	}
	
	/** Shortcut method to change the remoteInterpreter stop condition */
	public void setDebugCondition(String cond_name)
	{
		// modify the remoteInterpreter currentCommand --> pre-state : step_into e.g
		// note : after remoteInterpreter ahas done, it defines a post-state : step_end
		interpreter.setCurrentCommand(cond_name);
		interpreter.setDebugCondition((AbstractKermetaDebugCondition)conditions.get(cond_name));
	}

	/**
	 * @return Returns the remoteInterpreter.
	 */
	public DebugInterpreter getInterpreter() {
		return interpreter;
	}

	/**
	 * @param interpreter the DebugInterpreter that can be accessed through this 
	 * remoteIntepreter
	 */
	public void setInterpreter(DebugInterpreter interpreter) {
		this.interpreter = interpreter;
	}
	
	/** @return Returns the remoteDebugUI. */
	public IKermetaRemoteDebugUI getRemoteDebugUI() {
		return remoteDebugUI;
	}
		
	public synchronized SerializableCallFrame[] getSerializableCallFrames()
	{	return KermetaDebugWrapper.createSerializableCallFrames(interpreter); }
	
	public synchronized void block()
	{
		try {
			System.out.println("block");
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/** Unblocks the thread of the interpreter */
	public synchronized void unblock() throws RemoteException
	{ 
		System.out.println("un-block");
		interpreter.getDebugCondition().setSuspended(false);
		notifyAll();
	}
	
	/*
	 * 
	 *  A C C E S S O R S
	 * 
	 */
	
	public void changeSuspendedState(boolean isSuspended) throws RemoteException {
		interpreter.getDebugCondition().setSuspended(true);
	}

}
