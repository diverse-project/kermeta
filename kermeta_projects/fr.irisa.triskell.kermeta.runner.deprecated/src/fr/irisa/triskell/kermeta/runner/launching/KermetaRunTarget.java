/* $Id: KermetaRunTarget.java,v 1.11 2006-05-16 15:35:59 jmottu Exp $
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

import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;

/**
 * Target that is launched in run mode
 */
public class KermetaRunTarget extends AbstractKermetaTarget {
    
	
    public KermetaRunTarget(ILaunch p_launch)
    {
    	launch = p_launch;
    	launch.getLaunchConfiguration();
    }
    

    public void start()
    {
        //startKermetaProcess();

        
        initPath();
    	kermeta_process = new KermetaRunProcess(startFile, className, opName, args, "Kermeta Run Thread", false);
    	//ClassLoader previousClassLoader = kermeta_process.getContextClassLoader();
    	kermeta_process.updateThreadClassLoader( this.javaClassPathAttribute);
    	kermeta_process.start();
       /* new Thread() {
	        public void run() {
	            this.setName("Kermeta Run Thread");
	        	// Run in a thread --> is it really useful??
	            initPath();
	            ClassLoader cl = this.getContextClassLoader();
	           // cl.getResourceAsStream()
	            KermetaLauncher.getDefault().runKermeta(startFile, className, opName, args, false);
			}
	    }.start();*/
    	// restore classloader

    	//kermeta_process.setContextClassLoader( previousClassLoader);
    }
    
    


	public IThread[] getThreads() throws DebugException {
		return threads;
	}
    
}
