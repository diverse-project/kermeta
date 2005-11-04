/* $Id: KermetaRunTarget.java,v 1.9 2005-11-04 17:00:36 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaRunTarget.java
 * License: GPL
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

import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;

/**
 * Target that is launched in run mode
 */
public class KermetaRunTarget extends AbstractKermetaTarget {
    
	
    public KermetaRunTarget(ILaunch p_launch)
    {
    	launch = p_launch;
    }
    

    public void start()
    {
        startKermetaProcess();
    }


	public IThread[] getThreads() throws DebugException {
		return threads;
	}
    
}
