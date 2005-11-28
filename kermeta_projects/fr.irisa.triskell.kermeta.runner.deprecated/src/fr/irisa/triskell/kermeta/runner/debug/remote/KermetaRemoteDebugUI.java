/* $Id: KermetaRemoteDebugUI.java,v 1.1 2005-11-28 18:54:35 zdrey Exp $
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
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;

import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaBreakpoint;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaStackFrame;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.IKermetaRemoteDebugUI;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.IKermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableCallFrame;
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
				System.err.println("RESUME IN NOTIFY!");
				target.getRemoteInterpreter().unblock();
				processResumeReason(reason);
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
		KermetaStackFrame[] result = new KermetaStackFrame[0];
		if (frames != null && frames.length > 0)
		{
			result = new KermetaStackFrame[frames.length];
			
			for (int i=0; i<frames.length; i++)
			{
				IPath path = AbstractKermetaTarget.getIPathFromString(frames[i].filepath);
				KermetaDebugThread thread = target.getMainThread();
				
				KermetaStackFrame f = new KermetaStackFrame(
						thread, frames[i].name, 
						path, frames[i].line); // null : IPath
				result[i] = f;
			}
		}
		return result;
	}
	
	/**
	 * @return an array of integers that correspond to the lines where the breakpoints
	 * are located
	 */
	public Integer[] getBreakpointLines()
	{
		Integer[] lines = new Integer[0];
		
		ArrayList bps = target.getBreakpoints();
		Iterator it   = bps.iterator();
		lines = new Integer[bps.size()];
		int i = 0;
		while (it.hasNext())
		{
			lines[i++] = ((KermetaBreakpoint)it.next()).getLine();
		}
		return lines;
	}
	
	/** 
	 * Callback remote method
	 * Lookup the remote remoteInterpreter and created remote debug platform that will be registered then. 
	 * */
	public void remoteInterpreterCreated() throws RemoteException
	{
		try
		{
			Registry reg = LocateRegistry.getRegistry("localhost", 5002);
			IKermetaRemoteInterpreter remoteInterpreter = (IKermetaRemoteInterpreter)reg.lookup("remote_interpreter");
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
				System.err.println("maison:"+target);
				System.err.println("reason:"+target.getMainThread());
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
		
		// The step into reasons -> directly affect the Interpreter
		if (reason.equals(RunnerConstants.CLIENT_REQUEST))
		{
			target.getRemoteInterpreter().setDebugCondition(RunnerConstants.RESUME);
		}
		else if (reason.equals(RunnerConstants.STEP_INTO))
		{
			target.getRemoteInterpreter().setDebugCondition(RunnerConstants.STEP_INTO);
		}
 
		// other cases : STEP_OVER, STEP_RETURN,
	}
}
