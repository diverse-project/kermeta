/* $Id: ConstraintLaunchShortcut.java,v 1.2 2006-10-19 08:49:17 ftanguy Exp $
 * Project: Kermeta (Second iteration)
 * File: ConstraintLaunchShortcut.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: 16 mai 2006
 * Authors: jmottu
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchManager;

/**
 * @author jmottu
 *
 */
public class ConstraintLaunchShortcut extends KermetaLaunchShortcut {

    private static final String ID_CONSTRAINT_APPLICATION = "ConstraintLaunchConfiguration";

    public ConstraintLaunchShortcut()
    {
    	launchManager	= 	DebugPlugin.getDefault().getLaunchManager();
    	configurationType = launchManager.getLaunchConfigurationType(ID_CONSTRAINT_APPLICATION);	
    }
    
	   /**
     * Get the Kermeta configuration type (there is only one..)
     * @return
     */
    protected ILaunchConfigurationType getKermetaLaunchConfigurationType()
    {
		ILaunchManager lm= DebugPlugin.getDefault().getLaunchManager();
		return lm.getLaunchConfigurationType(ID_CONSTRAINT_APPLICATION);
    }
}
