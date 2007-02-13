/* $Id: KermetaRunTarget.java,v 1.18 2007-02-13 09:20:53 ftanguy Exp $
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

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
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
    public KermetaRunTarget(ILaunch p_launch)
    {
    	super(p_launch);
    }
    

    public void start() {
    	initPath();
    	initConsole();
    	kermeta_process = new KermetaRunProcess(startFile, className, opName, args, "Kermeta Run Thread", false, console);
    	kermeta_process.updateThreadClassLoader( this.javaClassPathAttribute, getCurrentProjectPath());
    	kermeta_process.start();
    }


	public IThread[] getThreads() throws DebugException {
		return threads;
	}


	/**
	 * @see fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget#terminate()
	 */
	public void terminate() throws DebugException {
		kermeta_process.state = KermetaProcess.STATE_TERMINATED;
		// This condition is verified if KermetaInterpreter could not be instanciated
		// for example, when there are parse errors.
		if (console.getKermetaInterpreter()!=null)
		{
			ExpressionInterpreter interpreter = console.getKermetaInterpreter().getMemory().getCurrentInterpreter();
			// this condition is verified when the interpretation process terminates naturally
			if (interpreter != null)
				interpreter.setCurrentState(ExpressionInterpreter.DEBUG_TERMINATE);
		}
		fireTerminateEvent();
	}


	/** (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget#isTerminated()
	 */
	public boolean isTerminated() {
		return process == null || kermeta_process.state == KermetaProcess.STATE_TERMINATED;
	}
    
	public boolean canTerminate() {
		return kermeta_process.state != KermetaProcess.STATE_TERMINATED;
	}
}
