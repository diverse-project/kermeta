/* $Id: KermetaLaunchConfiguration.java,v 1.25 2007-07-24 13:47:19 ftanguy Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaLaunchConfiguration.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey, dvojtise
 * Description: 
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugTarget;


public class KermetaLaunchConfiguration implements ILaunchConfigurationDelegate 
{
    /*
     * 
     * STATIC FIELDS
     *
     */
    public final static String KM_FILENAME = "fr.irisa.triskell.kermeta.launching.KM_FILENAME";
    public final static String KM_CLASSQNAME = "fr.irisa.triskell.kermeta.launching.KM_CLASSQNAME";
    public final static String KM_OPERATIONNAME = "fr.irisa.triskell.kermeta.launching.KM_OPERATIONNAME";
    // list of value separated by a comma
    public final static String KM_ARGUMENTS = "fr.irisa.triskell.kermeta.launching.KM_ARGUMENTS";
    public final static String KM_PROJECTNAME = "fr.irisa.triskell.kermeta.launching.KM_PROJECTNAME";
 
    protected static int instanceCount = 0;
    protected AbstractKermetaTarget target;
    
    /**
     * Constructor
     */
    public KermetaLaunchConfiguration()
    {
        super();
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
	    
	    launch.setSourceLocator(new KermetaSourceLocator());
	    
	    monitor.beginTask("Kermeta is interpreting",IProgressMonitor.UNKNOWN);
	    try
	    {
	        //  If the mode choosen is Run a Kermeta run target is created
	        if (mode.equals(ILaunchManager.RUN_MODE)) 
	        {   
	            target = new KermetaRunTarget(launch);
	            // Set the run target with current launch
	            // Add it as a debug target --> not really useful?
	            launch.addDebugTarget(target);
	            // Start interpreter
	            target.start();
	            // Terminate the run target

	            launch.removeDebugTarget(target);
	            DebugPlugin.getDefault().getLaunchManager().removeLaunch(launch);
	        } else {
	            target = new KermetaDebugTarget(launch);	            
	            // start the debug (target is added to launch through this method call)
	            target.start();
	        } 
	    } catch (KermetaInterpreterError e) {
	    	RunnerPlugin.errorDialog(e.getMessage());
	    	RunnerPlugin.pluginLog.error("There is a plugin error: '(" + e);	
	    } catch (Exception e) {
	    	RunnerPlugin.log(e);
	    	RunnerPlugin.pluginLog.error("There is a plugin error: '(" + e);
	        //e.printStackTrace();
	    }
	    System.gc();
	    monitor.done();
	    RunnerPlugin.pluginLog.info("Total memory after launch terminated : "+ Runtime.getRuntime().freeMemory());
	}

    
	/**
	 * Convenience method to get the launch manager.
	 * @return the launch manager
	 */
	public ILaunchManager getLaunchManager()
	{
		return DebugPlugin.getDefault().getLaunchManager();
	}

	

}
