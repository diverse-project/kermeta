/* $Id: KermetaLaunchConfigTabGroup.java,v 1.2 2008-04-30 13:58:49 ftanguy Exp $
 * Project: org.kermeta.runner.ui
 * File: KermetaLaunchConfigTabGroup.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 */
package org.kermeta.runner.launching.compiled;

import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.kermeta.runner.launching.ArgumentConfigurationTab;
import org.kermeta.runner.launching.InterpreterJavaClasspathTab;

/**
 * Create the tabs needed to configure the launch configuration of a Kermeta program.
 * 
 */
public class KermetaLaunchCompiledConfigTabGroup extends
        AbstractLaunchConfigurationTabGroup
{
    /**
     * Create the tabs needed to configure the launch of a Kermeta program.
     * These tabs appear in configuration dialog open after a clikc on "Run..." or "Debug..."
     * @see org.eclipse.debug.ui.ILaunchConfigurationTabGroup#createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog, java.lang.String)
     */
    public void createTabs(ILaunchConfigurationDialog dialog, String mode)
    {
        ILaunchConfigurationTab[] tabs;
        if (mode.equals(ILaunchManager.RUN_MODE))
        {   // This the Run mode
            tabs = new ILaunchConfigurationTab[] {
                    new CompilerArgumentConfigurationTab(),
                    new CommonTab(),
                    new InterpreterJavaClasspathTab() ,
                    new org.kermeta.runner.launching.compiled.PropertyFileEditorTab(this)
          			};
            
        }
        else
        {	// This the Debug mode
            tabs = new ILaunchConfigurationTab[] {
                    new ArgumentConfigurationTab(),
                    new CommonTab()
            };
        }
        setTabs(tabs);
        
    }
}
