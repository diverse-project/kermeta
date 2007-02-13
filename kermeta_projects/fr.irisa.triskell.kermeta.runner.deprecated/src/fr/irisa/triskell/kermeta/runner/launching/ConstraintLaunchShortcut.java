/* $Id: ConstraintLaunchShortcut.java,v 1.4 2007-02-13 08:08:12 ftanguy Exp $
 * Project: Kermeta (Second iteration)
 * File: ConstraintLaunchShortcut.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: 16 mai 2006
 * Authors: jmottu
 */
package fr.irisa.triskell.kermeta.runner.launching;

/**
 * @author jmottu
 *
 */
public class ConstraintLaunchShortcut extends KermetaLaunchShortcut {

    private static final String ID_CONSTRAINT_APPLICATION = "ConstraintLaunchConfiguration";

    public ConstraintLaunchShortcut() {
    	//launchManager	= 	DebugPlugin.getDefault().getLaunchManager();
    	configurationType = launchManager.getLaunchConfigurationType(ID_CONSTRAINT_APPLICATION);	
    }

}
