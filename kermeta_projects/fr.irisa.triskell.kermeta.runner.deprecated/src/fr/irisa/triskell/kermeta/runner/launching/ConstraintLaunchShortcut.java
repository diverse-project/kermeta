/* $Id: ConstraintLaunchShortcut.java,v 1.3 2006-12-27 15:48:12 ftanguy Exp $
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

}
