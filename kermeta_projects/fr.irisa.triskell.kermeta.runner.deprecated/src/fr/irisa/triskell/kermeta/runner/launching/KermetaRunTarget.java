/* $Id: KermetaRunTarget.java,v 1.7 2005-06-24 17:17:50 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaRunTarget.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.debug.core.ILaunch;

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
    
}
