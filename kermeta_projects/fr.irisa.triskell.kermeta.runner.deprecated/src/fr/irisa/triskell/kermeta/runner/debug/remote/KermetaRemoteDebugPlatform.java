/* $Id: KermetaRemoteDebugPlatform.java,v 1.1 2005-11-22 09:31:35 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaRemoteDebugPlatform.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 18, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote;

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

	KermetaDebugTarget target;
	public KermetaRemoteDebugPlatform(KermetaDebugTarget p_target) throws RemoteException {
		super();
		target = p_target;
	}

	/** Notify the server that the command is finished*/
	public Object notify(String command) throws RemoteException {
		Object result = null;
		System.out.println("Debug Platform is notified");
		if (command.equals("suspend"))
		{
			// Show the stack frames // Remember we only work with one thread in our Kermeta case
			try {
				RemoteCallFrame[] frames =  target.getRemoteInterpreter().getFrames(); //target.getRemoteInterpreter().getFrames();
				IStackFrame[] iframes = defineStackFrames(frames);
				((KermetaDebugThread)target.getThreads()[0]).setStackFrames(iframes);
				System.err.println("notify done");
			} catch (DebugException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Do something
		}
		return result;
		
	}
	
	public IStackFrame[] defineStackFrames(RemoteCallFrame[] frames) throws DebugException
	{
		KermetaStackFrame[] result = new KermetaStackFrame[frames.length];
		System.err.println("Define stack frames : ");
		for (int i=0; i<frames.length; i++)
		{
			IPath path = AbstractKermetaTarget.getIPathFromString("testRunner/" + frames[i].filepath);
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
