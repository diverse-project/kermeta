/* $Id: KermetaRunTarget.java,v 1.14 2006-06-19 15:47:16 dvojtise Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaRunTarget.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 * 
 * IMPORTANT NOTE : This class is not used since in the KermtaLaunchConfiguration,
 * the interpreter is directly launched through the static method runKermeta in the 
 * class KermetaLaunchConfiguraiton. For consistence purpose, this should be changed
 * in order to use new KermetaRunTarget.start().
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleListener;
import org.eclipse.ui.console.IOConsole;

import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.console.KermetaConsole;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.runner.debug.process.KermetaProcess;
import fr.irisa.triskell.kermeta.runner.debug.process.KermetaRunProcess;

/**
 * Target that is launched in run mode
 */
public class KermetaRunTarget extends AbstractKermetaTarget
{
    
	
	public KermetaConsole console;
	
    public KermetaRunTarget(ILaunch p_launch)
    {
    	super(p_launch);
    }
    

    public void start()
    {
    	initPath();
    	initConsole();
    	kermeta_process = new KermetaRunProcess(startFile, className, opName, args, "Kermeta Run Thread", false, console);
    	    	
    	kermeta_process.updateThreadClassLoader( this.javaClassPathAttribute, getCurrentProjectPath());
    	kermeta_process.start();
    }


	public IThread[] getThreads() throws DebugException {
		return threads;
	}
	
	/** Initialize the run console for the Run mode. This method is not 
	 * defined in AbstractKermetaTarget, since we only need to create a specific console in Run mode.
	 */
	public void initConsole()
	{
		String shortname = startFile.contains("/")?startFile.substring(startFile.lastIndexOf("/")):startFile;
	    String consolename = shortname + ": "+ className + "::" + opName;
	    console = new KermetaConsole(consolename, this);
	}


	/**
	 * @see fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget#terminate()
	 */
	public void terminate() throws DebugException {
		System.err.println("Terminate on Kermeta run Target");
		kermeta_process.state = KermetaProcess.STATE_TERMINATED;

/*		if (process != null)
		{
			process.terminate();
		}	
		else
			System.err.println("Process is null");*/
		
		// setState(RunnerConstants.TERMINATE);
		fireTerminateEvent();
	}


	/** (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget#isTerminated()
	 */
	public boolean isTerminated() {
		System.out.println("IS TERMINATED");
		return process == null || kermeta_process.state == KermetaProcess.STATE_TERMINATED;
	}
    
	public boolean canTerminate() {return true; }//System.err.println("KermetaRunTarget.canTerminate");return (kermeta_process.state!=KermetaProcess.STATE_TERMINATED); }

}
