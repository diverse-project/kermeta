/* $Id: KermetaLaunchConfiguration.java,v 1.15 2005-10-20 09:38:01 zdrey Exp $
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

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.jdt.launching.SocketUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.console.KermetaConsole;
import fr.irisa.triskell.kermeta.runner.debug.KermetaDebugTarget;


public class KermetaLaunchConfiguration implements ILaunchConfigurationDelegate 
{
    /*
     * 
     * STATIC FIELDS
     *
     */
    public final static String KM_FILENAME = "KM_FILENAME";
    public final static String KM_CLASSQNAME = "KM_CLASSQNAME";
    public final static String KM_OPERATIONNAME = "KM_OPERATIONNAME";
    public final static String KM_PROJECTNAME = "KM_PROJECTNAME";
 
    protected static int instanceCount = 0;
    protected KermetaTarget target;
    
    
    /**
     * Constructor
     */
    public KermetaLaunchConfiguration()
    {
        super();
        if (instanceCount > 0) RunnerPlugin.pluginLog.error("I should be created only once : KermetaLaunchConfiguration");
        instanceCount = instanceCount++;
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
	    
	    final ILaunchConfiguration fconfiguration = configuration;
	    final String fmode = mode;
	    // Get the configuration values : // Final so that we can pass them to thread
        final String fileNameString = fconfiguration.getAttribute(KM_FILENAME, "");
        final String classQualifiedNameString = fconfiguration.getAttribute(KM_CLASSQNAME, "");
        final String operationString = fconfiguration.getAttribute(KM_OPERATIONNAME, "");
        launch.setSourceLocator(new KermetaSourceLocator());
	    // For remote call of the debugger
        ArrayList commandList = new ArrayList();
        // FIXME this is a obscure method not clear at all
	    
	    IResource iresource = RunnerPlugin.getWorkspace().getRoot().findMember(fileNameString);
	    IFile selectedFile = null;
	    if (iresource instanceof IFile)
	        selectedFile = (IFile) iresource;
	    else { throw new Error("The selected Kermeta to execute is not recognized as to be a file.");}
	    commandList.add(selectedFile.getLocation().toOSString());
	    int requestPort = -1; int eventPort = -1;
	    
	    monitor.beginTask("Kermeta is interpreting",IProgressMonitor.UNKNOWN);
	    try
	    {
	        //  If the mode choosen is Run a Kermeta run target is created
	        if (mode.equals(ILaunchManager.RUN_MODE)) 
	        {   
	            KermetaRunTarget runtarget = new KermetaRunTarget(launch);
	            // Set the run target with current launch
	            // Add it as a debug target
	            launch.addDebugTarget(runtarget);
	            // Run the launcher with configurationParam, launchParam, currentMode
	            //runKermeta(fileNameString, classQualifiedNameString, operationString);
	            /*KermetaLauncher klauncher = KermetaLauncher.getDefault();
	            klauncher.launch(fileNameString, classQualifiedNameString, operationString);*/
	            // Or : 
	            //runtarget.start();
                runKermeta(fileNameString, classQualifiedNameString, operationString, false);
	            // Terminate the run target
	            runtarget.terminate();
	            launch.removeDebugTarget(runtarget);
	            DebugPlugin.getDefault().getLaunchManager().removeLaunch(launch);
	    		
	        }
	        else
	        {
	            target = new KermetaDebugTarget(launch);
	            target.start();
	    		if (!target.isTerminated())
	    		{
	    			launch.addDebugTarget(target);
	    			((KermetaDebugTarget) target)
	    				.getDebugger()
	    				.generateDebugInitEvent();
	    		}
				// FIXME Exception when trying t oaccess a frame..
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

    /**
     * This method run the Kermeta interpreter, according to the data given by
     * the user through the launch configuration window.
     * @param isDebugMode if debug mode is set to false, then the normal 
     * launch method is used for kermeta interpreter, other wise launch_debug method
     * is used (see DebugInterpreter class in fr.irisa.triskell.kermeta.interpreter)
     * @param configuration
     * @param mode
     */
    public static ExpressionInterpreter runKermeta(String fileNameString, String classQualifiedNameString, String operationString, boolean isDebugMode)
    {
        
        IFile selectedFile = null;
	    IResource iresource = RunnerPlugin.getWorkspace().getRoot().findMember(fileNameString);
	    if (iresource instanceof IFile)
	        selectedFile = (IFile) iresource;
	    else
	    {  // TODO : throw an exception!
	    }
	    // Create a KermetaConsole where the interpreter will print the errors.
        KermetaConsole console = KermetaConsole.getSingletonConsole();
        KermetaInterpreter interpreter = null;
        if ( ! console.isInitialized())
        {            
        	// Add a MessageConsole
        	console.addConsole();
        }
        else
        {
        	System.out.println("reusing already initilized KermetaConsole");
            console.reset();
        }
        try
        {
            String uri = "platform:/resource/" + selectedFile.getFullPath().toString();

            //  be sure this value is correctly set        
            KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";
            
            interpreter = new KermetaInterpreter(uri);
            
            interpreter.setEntryPoint(classQualifiedNameString, operationString);
            interpreter.setKStream(console);     
            if (isDebugMode == false)
            {
                interpreter.launch();
    	        interpreter.setKStream(null);
    	        interpreter.freeJavaMemory();
    	        KermetaUnitFactory.resetDefaultLoader();
    	        return null;
            }
            else interpreter.launch_debug();
            
		    
        }
        catch (KermetaRaisedException kerror)
        {
            console.print(kerror.getMessage());
            console.print(kerror.toString());
        }
        catch (KermetaInterpreterError ierror)
        {
            console.print("Kermeta interpreter could not be launched :\n");
            console.print(ierror.getMessage());
        }
        catch (Throwable e)
        {
            console.print("\nKermetaInterpreter internal error \n" +
            		"-------------------------------------------\n");
            console.print("Reported java error : "+e);
            console.print(e.getMessage());
            e.printStackTrace();
        }
        console.print("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        // this console is not used any more
        //console.removeConsoleListener();
        return interpreter.getMemory().getCurrentInterpreter();
        
    }
    
	/**
	 * Convenience method to get the launch manager.
	 * 
	 * @return the launch manager
	 */
	protected ILaunchManager getLaunchManager()
	{
		return DebugPlugin.getDefault().getLaunchManager();
	}

	

}
