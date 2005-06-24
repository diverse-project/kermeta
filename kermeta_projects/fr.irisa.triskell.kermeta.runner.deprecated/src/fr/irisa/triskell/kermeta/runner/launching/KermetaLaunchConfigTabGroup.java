/* $Id: KermetaLaunchConfigTabGroup.java,v 1.8 2005-06-24 17:17:51 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaLaunchConfigTabGroup.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import java.util.jar.JarEntry;

import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaArgumentsTab;
import org.eclipse.jdt.launching.sourcelookup.JavaProjectSourceLocation;

/**
 * 
 */
public class KermetaLaunchConfigTabGroup extends
        AbstractLaunchConfigurationTabGroup
{
    
    
    /**
     * Create the tabs needed to configure the launch of a Kermeta program
     * @see org.eclipse.debug.ui.ILaunchConfigurationTabGroup#createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog, java.lang.String)
     */
    public void createTabs(ILaunchConfigurationDialog dialog, String mode)
    {
        
        if (mode.equals(ILaunchManager.RUN_MODE))
        {
            ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
                    new ArgumentConfigurationTab(),
                    new CommonTab(),
                    new JavaArgumentsTab()
                    /*,
                    
                    new GeneralConfigurationTab()*/
          			};
            setTabs(tabs);
        }
        else
        {
            System.err.println("Could not create tabs : only Run mode is implemented");
        }
        
    }
}
