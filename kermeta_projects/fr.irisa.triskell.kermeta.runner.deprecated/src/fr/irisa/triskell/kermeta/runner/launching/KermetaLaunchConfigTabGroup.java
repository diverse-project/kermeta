/* $Id: KermetaLaunchConfigTabGroup.java,v 1.10 2005-09-09 18:04:21 zdrey Exp $
 * Project: Kermeta.runner
 * File: KermetaLaunchConfigTabGroup.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
//import org.eclipse.jdt.debug.ui.launchConfigurations.JavaArgumentsTab;

/**
 * 
 */
public class KermetaLaunchConfigTabGroup extends
        AbstractLaunchConfigurationTabGroup
{
    /**
     * Create the tabs needed to configure the launch of a Kermeta program.
     * Thess tabs appear in configuration dialog open after a clikc on "Run..." or "Debug..."
     * @see org.eclipse.debug.ui.ILaunchConfigurationTabGroup#createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog, java.lang.String)
     */
    public void createTabs(ILaunchConfigurationDialog dialog, String mode)
    {
        ILaunchConfigurationTab[] tabs;
        if (mode.equals(ILaunchManager.RUN_MODE))
        {
            tabs = new ILaunchConfigurationTab[] {
                    new ArgumentConfigurationTab(),
                    new CommonTab()/*,
                    new JavaArgumentsTab()
                    ,
                    new GeneralConfigurationTab()*/
          			};
        }
        else
        {
            tabs = new ILaunchConfigurationTab[] {
                    new ArgumentConfigurationTab(),
                    new CommonTab()
            };
        }
        setTabs(tabs);
    }
}
