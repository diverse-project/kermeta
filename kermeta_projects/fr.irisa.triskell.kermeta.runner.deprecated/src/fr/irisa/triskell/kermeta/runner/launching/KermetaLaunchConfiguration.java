/* $Id: KermetaLaunchConfiguration.java,v 1.1 2005-05-20 17:06:48 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaLaunchConfiguration.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 * Description: 
 */
package fr.irisa.triskell.kermeta.runner.launching;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

/**
 * 
 */
public class KermetaLaunchConfiguration extends LaunchConfigurationDelegate 
//LaunchConfigurationDelegate
{

    /**
     * 
     */
    public KermetaLaunchConfiguration() {
        super();
        System.out.println("Coucou Launcher!");
    }
	
	/**
	 * (Eclipse doc) Launches the given configuration in the specified mode, contributing
	 * debug targets to the given launch object. The
	 * launch object has already been registered with the launch manager.
	 * 
	 * @param configuration the configuration to launch
	 * @param mode the mode in which to launch, one of the mode constants
	 * defined by ILaunchManager - RUN_MODE or DEBUG_MODE.
	 * @param launch the launch object to contribute processes and debug
	 *  targets to
	 * @param monitor progress monitor, not used here
	 * @exception CoreException if launching fails
	 * 
	 * @see ILaunchConfigurationDelegate#launch(ILaunchConfiguration, String, ILaunch, IProgressMonitor) 
	 */
	public void launch(
	        ILaunchConfiguration configuration,
	        String mode,
	        ILaunch launch, IProgressMonitor monitor) throws CoreException {
	    System.out.println("Coucou Launcher (launch)!");
	    try
	    {
//		final String currentMode = pMode;
//		final ILaunchConfiguration configuration = pConfiguration;
//		final ILaunch launch = pLaunch;
	        //configuration.
	        System.out.println("Coucou Launcher (launch)!");
	        //
	        //  If the mode choosen was Run a Kermeta debug target was created
	        
	        if (mode.equals(ILaunchManager.RUN_MODE)) {
	            // 
	            // Set the source locator to launch
	            launch.setSourceLocator(new KermetaSourceLocator());
	            KermetaRunTarget runtarget = new KermetaRunTarget(); 
	            // Set the run target with current launch
	            // Add it as a debug target
	            launch.addDebugTarget(runtarget);
	            
	            //   launch.getLaunchConfiguration().
	            // Run the launcher with configurationParam, launchParam, currentMode
	            
	            // Terminate the run target
	            //runtarget.terminate();
	        }
	        else
	        {
	            System.out.println("ImplementationError : Debug mode not implemented yet");
	        }
	    }
	    catch (Exception e)
	    {
	        System.err.println("There is a plugin error");
	        e.printStackTrace();
	    }
	}
	

}
