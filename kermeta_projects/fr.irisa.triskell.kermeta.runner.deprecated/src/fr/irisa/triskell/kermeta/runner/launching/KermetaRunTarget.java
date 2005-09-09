/* $Id: KermetaRunTarget.java,v 1.8 2005-09-09 18:04:21 zdrey Exp $
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

/**
 * Target that is launched in run mode
 */
public class KermetaRunTarget extends KermetaTarget {
    
    public KermetaRunTarget(ILaunch launch)
    {
        super(launch);
    }
    

    public void start()
    {
        startKermetaProcess();
    }



    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugTarget#getThreads()
     */
    public IThread[] getThreads() throws DebugException {
        // TODO Auto-generated method stub
        return null;
    }



    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IDebugTarget#hasThreads()
     */
    public boolean hasThreads() throws DebugException {
        // TODO Auto-generated method stub
        return false;
    }
    
}
