/* $Id: KermetaRemoteDebugPlatform.java,v 1.2 2005-11-23 16:18:59 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaRemoteDebugPlatform.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 18, 2005
 * Authors       : zdrey
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
	 * */
	public Object notify(String command, String reason) throws RemoteException {
		Object result = null;
		currentCommand = command;
		// Show the stack frames
		try
		{	
			// Remember we only work with one thread in our Kermeta case : so, TODO
			// is to put this in a getThread() method.
			KermetaDebugThread kd_thread = ((KermetaDebugThread)target.getThreads()[0]);
			
			// 1) process the "command"
			if (command.equals("suspend")) // suspend is first asked by the KRI
			{	
				RemoteCallFrame[] frames =  target.getRemoteInterpreter().getFrames(); //target.getRemoteInterpreter().getFrames();
				IStackFrame[] iframes = defineStackFrames(frames);
				kd_thread.setStackFrames(iframes);
				System.err.println("notify done");
				target.getRemoteInterpreter().block();
			}
			if (command.equals("resume")) // resume is first asked by the KRDP itself
			{
				System.err.println("KRDP : interpreter resumed!!");
				target.getRemoteInterpreter().unblock();
			}
			
			// This command is sent by the KRI, just to ask if it is still block or not
			if (command.equals("ask"))
			{
				System.err.println("KRDP is notified : ASK ");
				
			}

			// 2) process the "reason"
			if (reason.equals("stepEnd"))
			{
				System.err.println("step ended!!");
				target.getStepHandler().stepEnd(kd_thread);
				target.getRemoteInterpreter().block();
			}
			
			//if (reason.equals("clientRequest")) ???
			
		} catch (DebugException e) {
		e.printStackTrace();
		}
		
		return result;
		
	}
	
	public String getCommand()
	{
		return currentCommand;
	}
	
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
