/* $Id: KermetaLaunchConfigTabGroup.java,v 1.2 2005-05-23 13:14:52 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaLaunchConfigTabGroup.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.internal.ui.launchConfigurations.PerspectivesTab;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.RefreshTab;

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
        System.err.println("Create tabs");
        if (mode.equals(ILaunchManager.RUN_MODE))
        {
            ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
                    new ArgumentConfigurationTab(),
                    new GeneralConfigurationTab()
          			};
            setTabs(tabs);
        }
        else
        {
            System.err.println("Could not create tabs");
        }

    }
}
