/* $Id: KermetaRemoteDebugUI.java,v 1.8 2005-12-13 18:08:58 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaRemoteDebugUI.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 18, 2005
 * Authors       : 
 * 	zdrey <zdrey@irisa.fr>
 * 	dpollet <dpollet@irisa.fr>
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaBreakpoint;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaStackFrame;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaValue;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaVariable;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.IKermetaRemoteDebugUI;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.IKermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableBreakpoint;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableCallFrame;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableValue;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableVariable;
import fr.irisa.triskell.kermeta.runner.debug.util.KermetaDebugWrapper;

public class KermetaRemoteDebugUI extends UnicastRemoteObject implements IKermetaRemoteDebugUI {

	protected KermetaDebugTarget target;
	protected String currentCommand;
	
	public KermetaRemoteDebugUI(KermetaDebugTarget p_target) throws RemoteException {
		super();
		target = p_target;
		currentCommand = RunnerConstants.RESUME;
	}

	/**
	 * This method is called by the GUI side. The KermetaRemoteDebugUI takes
	 * the role of an Observer of the GUI changes. 
	 * 
	 * 
	 * Command :
	 * 	- can only be "resume", "suspend"
	 *  Reason :
	 *  - stepEnd, stepInto, stepOver
	 *  
	 *  Note : only one thread is handled, so we have no complex handling of threads,
	 *  and by default we always get the first one (target.getMainThread())
	 *  
	 *  This method is declared synchronized in order to avoid concurrent access to the interpreter
	 *  context (the call frames e.g) 
	 * */
	public synchronized Object notify(String command, String reason) throws RemoteException {
		Object result = null;
		currentCommand = command;
		// Not sure it is the best way to test that, and the best place
		if (target.getRemoteInterpreter() == null) return null;
		// Show the stack frames
		// CREATE/TERMINATE?
		try
		{	
			// 1) process the "command" sent by the user through the GUI
			if (command.equals(RunnerConstants.SUSPEND))
			{
				// the debug condition will "control" the debugger continuation or suspension
				// its stop the debugger as soon as its evaluation is true during the 
				// execution
				target.getRemoteInterpreter().changeSuspendedState(true);
				target.getMainThread().setStackFrames(createKermetaStackFrames());
				processSuspendReason(reason);
			}
			else if (command.equals(RunnerConstants.RESUME))
			{
				target.getRemoteInterpreter().changeSuspendedState(false);
				processResumeReason(reason);
				// Unblock AFTER the interpreter state is set properly!
				target.getRemoteInterpreter().unblock();
			}
			else if (command.equals(RunnerConstants.TERMINATE))
			{
				System.out.println("J'ai terminé!");
				// Is it correct ?
				target.getRemoteInterpreter().askTerminate();
				target.getKermetaProcess().terminate();
				target.unsetKermetaProcess(); // just set the process to null...
				// "Kill" the remote interpreter
				// target.getRemoteInterpreter().;
				// "Kill" the remote debug platform
			}

			// Is there a reason? (usually, the reason is given only by the interpreter side, 
			// when it finished the execution of a command (for example, step :-))
							
			
		} catch (DebugException e) {	e.printStackTrace(); }
		
		return result;
		
	}
	
	/**
	 * The debug state tells the user if the debug is running, suspended, or terminated.
	 * It blocks or unblocks accordingly the RemoteInterpreter
	 * @see fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.IKermetaRemoteDebugUI#getDebugState()
	 */
	public String getDebugState() throws RemoteException {
		return target.getStateAsString();
	}

	public String getCommand()
	{
		return currentCommand;
	}
	
	/**
	 * Returns the stackFrames Eclipse elements corresponding to the given array
	 * of RemoteCallFrames.
	 * @param frames the frames to convert in KermetaStackFrames (==IStackFrames)
	 * @return the converted KermetaStackFrames 
	 * @throws DebugException
	 * 
	 */
	protected synchronized IStackFrame[] createKermetaStackFrames() throws DebugException, RemoteException
	{
		SerializableCallFrame[] frames = target.getRemoteInterpreter().getSerializableCallFrames();
		KermetaStackFrame[] result = null;
		IPath path = null;
		if (frames != null && frames.length > 0) // sometimes a nullpointerexception occures line 154...
		{
			result = new KermetaStackFrame[frames.length];
			
			for (int i=0; i<frames.length; i++)
			{
				KermetaStackFrame f = null;
				KermetaDebugThread thread = target.getMainThread();
				if (frames[i] != null)
				{
					path = AbstractKermetaTarget.getIPathFromString(frames[i].filepath);
					System.out.println("frames[i].filepath:" + frames[i].filepath +"; IPATH : " +path);
					f = new KermetaStackFrame(
							thread, frames[i].name, 
							path, frames[i].line); // null : IPath
					f.setVariables(createKermetaVariables(frames[i].variables));
				}
				else // create an empty frame to avoid GUI errors...
				{	System.out.println("when is the frames[i] null???");
					f = new KermetaStackFrame( thread, "empty frame", null, 0);
				}
				result[i] = f;
			}
		}
		return result;
	}
	
	/**
	 * TODO: should we carrément define a constructor : 
	 * KermetaVariable(SerializableVariable v) ?
	 * @param vars
	 * @return an array of IVariable or null if there are no variable
	 * @throws DebugException
	 */
	public IVariable[] createKermetaVariables(SerializableVariable[] vars)
	{
		KermetaVariable[] result = null;
		if (vars != null)
		{
			result = new KermetaVariable[vars.length]; 
			for (int i=0; i<vars.length; i++)
			{
				result[i] = new KermetaVariable(
						target, vars[i]);
				/*result[i] = new KermetaVariable(
						target, 
						vars[i].name, 
						vars[i].type, 
						new KermetaValue(
								target,  
								vars[i].getValue()
								vars[i].value.valueString,
								vars[i].value.refTypeName,
								vars[i].value.runtimeOID )); */
			}
		}
		return result;
	}
	
	/**
	 * @return an array of integers that correspond to the lines where the breakpoints
	 * are located
	 */
	public SerializableBreakpoint[] getSerializableBreakpoints()
	{	
		ArrayList bps = target.getBreakpoints();
		SerializableBreakpoint[] result = new SerializableBreakpoint[bps.size()];
		//System.out.println("Breakpoint (KermetaRDBUI) : " + bps.size() );
		Iterator it   = bps.iterator();
		int i = 0;
		while (it.hasNext())
		{
			KermetaBreakpoint bp = (KermetaBreakpoint)it.next();
			result[i] = new SerializableBreakpoint(bp.getLine(), bp.getFile());
			i += 1;
		}
		return result;
	}
	
	/** 
	 * Callback remote method
	 * Lookup the remote remoteInterpreter and created remote debug platform that will be registered then. 
	 * */
	public void remoteInterpreterCreated() throws RemoteException
	{
		try
		{
			Registry reg = LocateRegistry.getRegistry("localhost", 5001);
			System.out.println("Lookup remote interpreter : " + reg);
			IKermetaRemoteInterpreter remoteInterpreter = (IKermetaRemoteInterpreter)reg.lookup("remote_interpreter");
			System.out.println("Lookup successful ");
			remoteInterpreter.registerKermetaRemoteDebugUI(this);
			target.setRemoteInterpreter(remoteInterpreter);

		}
		catch (NotBoundException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Process the reason (step end? breakpoint? ) of the command (step) that 
	 * was sent by the interpreter side 
	 */
	protected void processSuspendReason(String reason) throws RemoteException
	{	
		// The suspend reasons -> directly affect the GUI
		if (reason.equals(RunnerConstants.STEP_END))
		{
			// This statement fires event to tell the GUI to suspend back.
			try
			{
				target.getStepHandler().stepEnd(target.getMainThread());
			}
			catch (DebugException e) { e.printStackTrace(); }
		}
		
		else if (reason.equals(RunnerConstants.BREAKPOINT))
		{
			try { target.getStepHandler().breakpointFound(target.getMainThread()); }
			catch (DebugException e) { e.printStackTrace(); }
		}
		
	}
	
	protected void processResumeReason(String reason) throws RemoteException
	{	
		// other cases : EVALUATION, EVALUATION_IMPLICIT / UNSPECIFIED and CLIENTREQUEST
		// if we were in the same stop condition type earlier, we do not need to change it...
	/*	if (!target.getRemoteInterpreter().getDebugCondition().equals(reason))
		{*/
			// The step into reasons -> directly affect the Interpreter
			// I know, it could be shorter
			if (reason.equals(RunnerConstants.CLIENT_REQUEST))
			{
				target.getRemoteInterpreter().setDebugCondition(RunnerConstants.RESUME);
			}
			else 
			{
				target.getRemoteInterpreter().setDebugCondition(reason);
			}
	//	}
		// other cases : STEP_OVER, STEP_RETURN,
	}

	public void unregisterRemoteInterpreter() throws RemoteException {
		target.getRemoteInterpreter().terminate();

	}

	/** Create the properties of the instance represented by the given KermetaValue */
	public IVariable[] createKermetaVariablesForSerializableValue(SerializableValue s_value) {
		IVariable[] result = null;
		try {
			SerializableVariable[] svars = target.getRemoteInterpreter().getSerializableVariablesFromSerializableValue(s_value);
			result = createKermetaVariables(svars);
		} catch (RemoteException e) { e.printStackTrace(); }
		
		return result;
	}
	
	/** Create the properties of the instance represented by the given KermetaValue */
	public IVariable[] createKermetaVariablesForValue(SerializableValue s_value) {
		IVariable[] result = null;
		try {
			SerializableVariable[] svars = target.getRemoteInterpreter().getSerializableVariablesFromSerializableValue(s_value);
			result = createKermetaVariables(svars);
		} catch (RemoteException e) { e.printStackTrace(); }
		
		return result;
	}
	
}
