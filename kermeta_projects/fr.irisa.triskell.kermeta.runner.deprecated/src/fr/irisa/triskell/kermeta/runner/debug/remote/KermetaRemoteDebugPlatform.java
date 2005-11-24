/* $Id: KermetaRemoteDebugPlatform.java,v 1.4 2005-11-24 18:33:18 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaRemoteDebugPlatform.java
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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;

import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaStackFrame;
import fr.irisa.triskell.kermeta.runner.debug.util.KermetaDebugWrapper;

public class KermetaRemoteDebugPlatform extends UnicastRemoteObject implements IKermetaRemoteDebugPlatform {

	protected KermetaDebugTarget target;
	protected String currentCommand;
	
	
	
	public KermetaRemoteDebugPlatform(KermetaDebugTarget p_target) throws RemoteException {
		super();
		target = p_target;
	}

	/** Notify the server that the command is finished
	 * Command :
	 * 	- can only be "resume", "suspend"
	 *  Reason :
	 *  - stepEnd, stepInto, stepOver 
	 * */
	public synchronized Object notify(String command, String reason) throws RemoteException {
		Object result = null;
		currentCommand = command;
		// Show the stack frames
		try
		{	
			// Remember we only work with one thread in our Kermeta case : so, TODO
			// is to put this in a getThread() method.
			KermetaDebugThread kd_thread = ((KermetaDebugThread)target.getThreads()[0]);
			
			// 1) process the "command"
			if (command.equals(RunnerConstants.SUSPEND)) // suspend is first asked by the KRI
			{	
				
				System.err.println("notify done");
				target.getRemoteInterpreter().setDebugCondition(RunnerConstants.SUSPEND);
				IStackFrame[] iframes = defineStackFrames(target.getRemoteInterpreter().getFrames());
				kd_thread.setStackFrames(iframes);
			}
			if (command.equals("resume")) // resume is first asked by the KRDP itself
			{
				System.err.println("KRDP : interpreter resumed!!");
				target.getRemoteInterpreter().setDebugCondition(RunnerConstants.RESUME);
			}
			
			// 2) process the "reason"
			if (reason.equals(RunnerConstants.STEP_END))
			{
				System.err.println("step ended!!");
				// This statement fires event to tell the GUI to suspend back.
				target.getStepHandler().stepEnd(kd_thread);
				// This statement tells the remoteInterpreter to block
				target.getRemoteInterpreter().block();
			}
			// If it is stepInto, we must unblock the interpreter
			if (reason.equals(RunnerConstants.STEP_INTO))
			{
				// the debug condition will control if the debugger can continue or not
				// its stop the debugger as soon as its evaluation is true during the 
				// execution
				target.getRemoteInterpreter().setDebugCondition(RunnerConstants.STEP_INTO);
				target.getRemoteInterpreter().unblock();
			}
			
		} catch (DebugException e) {
		e.printStackTrace();
		}
		catch (Exception e) {
				e.printStackTrace();
				}
		return result;
		
	}
	
	/**
	 * The debug state tells the user if the debug is running, suspended, or terminated.
	 * It blocks or unblocks accordingly the RemoteInterpreter
	 * @see fr.irisa.triskell.kermeta.runner.debug.remote.IKermetaRemoteDebugPlatform#getDebugState()
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
	 */
	public IStackFrame[] defineStackFrames(RemoteCallFrame[] frames) throws DebugException
	{
		KermetaStackFrame[] result = new KermetaStackFrame[frames.length];
		System.err.println("Define stack frames : ");
		for (int i=0; i<frames.length; i++)
		{
			IPath path = AbstractKermetaTarget.getIPathFromString(frames[i].filepath);
			// we can do the following instruction since we *know* that we work with one thread.
			KermetaDebugThread thread = (KermetaDebugThread)target.getThreads()[0];
			
			KermetaStackFrame f = new KermetaStackFrame(
					thread, frames[i].name, 
					path, frames[i].line); // null : IPath
			System.err.println("Define stack frames -- end -- : " + thread + frames[i].name + frames.length + path+frames[i].filepath + frames[i].line);
			System.err.println("target?" + f.getDebugTarget() + "; " );
			
			result[i] = f;
		}
		return result;
	}
	
	
	/** Callback remote method */
	public void remoteInterpreterCreated() throws RemoteException
	{
		try
		{
			Registry reg = LocateRegistry.getRegistry("localhost", 5002);
			IKermetaRemoteInterpreter remoteInterpreter = (IKermetaRemoteInterpreter)reg.lookup("remote_interpreter");
			remoteInterpreter.registerKermetaRemoteDebugPlatform(this);
			target.setRemoteInterpreter(remoteInterpreter);
		}
		catch (NotBoundException e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * 
	 * LOCAL METHODS 
	 * 
	 * 
	 */
	
	
	/**
	 * "main"
	 * @throws RemoteException
	 */
/*	public void register() throws RemoteException
	{
		try
		{
			
			Registry reg = LocateRegistry.getRegistry(5001);
			
			IKermetaRemoteInterpreter remote_interpreter = (IKermetaRemoteInterpreter)reg.lookup("remote_interpreter");
			
			remote_interpreter.registerKermetaRemoteDebugPlatform(new KermetaRemoteDebugPlatform());
			
			remote_interpreter.execute("toto");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
		
*/
}
