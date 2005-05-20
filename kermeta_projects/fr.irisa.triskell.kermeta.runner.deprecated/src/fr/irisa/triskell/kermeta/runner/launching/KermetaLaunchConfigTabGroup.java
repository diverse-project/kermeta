/* $Id: KermetaLaunchConfigTabGroup.java,v 1.1 2005-05-20 17:06:48 zdrey Exp $
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


  	//private RefreshTab refreshTab = new RefreshTab();
    /**
     * 
     */
    public KermetaLaunchConfigTabGroup() {
        super();
       
        System.out.println("Tab grouuuup");
        
        //this.initializeFrom()
        // TODO Auto-generated constructor stub
    }

    
    
    public void initializeFrom(ILaunchConfiguration configuration) {
        // TODO Auto-generated method stub
        System.err.println("initiliaze Group of tab");
        
        super.initializeFrom(configuration);
    }
    
    
    public void performApply(ILaunchConfigurationWorkingCopy configuration)
    {
        System.out.println("perform apply!"+configuration);
    }
    
    
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration)
    {
        System.out.println("set defaults!"+configuration);
        super.setDefaults(configuration);
    }
    public void launched(ILaunch launch)
    {
        System.out.println("launched!"+launch);
    }
    
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
                    new GeneralConfigurationTab(),
                    new ArgumentConfigurationTab()
          			};
            setTabs(tabs);
            
            //tabs[0].setLaunchConfigurationDialog()
        }
        else
        {
            System.err.println("Could not create tabs");
        }

    }

}
