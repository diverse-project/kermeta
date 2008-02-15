/* $Id: KermetaRunTarget.java,v 1.22 2008-02-15 14:35:44 dvojtise Exp $
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

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IThread;

import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
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
    	initConsole(this);
    	kermeta_process = new KermetaRunProcess(startFile, className, opName, args, "Kermeta Run Thread", false, console, this);
    	kermeta_process.updateThreadClassLoader( this.javaClassPathAttribute, getCurrentProjectOutputPath(), getCurrentProjectRequiredEntries());
    	setKermetaInterpreter( ((KermetaRunProcess) kermeta_process).getInterpreter() ); 
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
		if ( kermetaInterpreter != null )
		{
			ExpressionInterpreter interpreter = kermetaInterpreter.getMemory().getCurrentInterpreter();
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
		if ( kermeta_process != null )
			return kermeta_process.state != KermetaProcess.STATE_TERMINATED;
		return true;
	}
}
