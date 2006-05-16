/* $Id: ConstraintLaunchConfiguration.java,v 1.1 2006-05-16 15:35:59 jmottu Exp $
 * Project: Kermeta (Second iteration)
 * File: ConstraintLaunchConfiguration.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: 16 mai 2006
 * Authors: jmottu
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugTarget;

/**
 * @author jmottu
 */
public class ConstraintLaunchConfiguration extends KermetaLaunchConfiguration
{
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
	    
	    launch.setSourceLocator(new KermetaSourceLocator());
	    
	    monitor.beginTask("Kermeta is interpreting",IProgressMonitor.UNKNOWN);
	    try
	    {
	        //  If the mode choosen is Run a Kermeta run target is created
	        if (mode.equals(ILaunchManager.RUN_MODE)) 
	        {   
	            target = new ConstraintRunTarget(launch);
	            // Set the run target with current launch
	            // Add it as a debug target --> not really useful?
	            launch.addDebugTarget(target);
	            // Start interpreter
	            target.start();
	            // Terminate the run target
	            target.terminate();
	            launch.removeDebugTarget(target);
	            DebugPlugin.getDefault().getLaunchManager().removeLaunch(launch);
	        }
	        else
	        {
	            target = new KermetaDebugTarget(launch);	            
	            // start the debug (target is added to launch through this method call)
	            target.start();
	        } 
	    }
	    catch (KermetaInterpreterError e)
	    {
	        MessageDialog.openError(new Shell(), "Kermeta interpreter error", e.getMessage());
	    }
	    catch (Exception e)
	    {
	    	RunnerPlugin.pluginLog.error("There is a plugin error: '(" + e);
	        e.printStackTrace();
	    }
	    System.gc();
	    monitor.done();
	    RunnerPlugin.pluginLog.info("Total memory after launch terminated : "+ Runtime.getRuntime().freeMemory());
	}
}
