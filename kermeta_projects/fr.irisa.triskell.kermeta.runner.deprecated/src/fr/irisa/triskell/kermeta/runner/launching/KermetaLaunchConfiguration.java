/* $Id: KermetaLaunchConfiguration.java,v 1.12 2005-07-08 12:23:43 dvojtise Exp $
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
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
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.console.KermetaConsole;


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
	    
	    // NOTE : "final" forces a copy of the parameters, so that we are sure
	    // that a reference of those params are not stored by the Plugin framework
	    final ILaunchConfiguration fconfiguration = configuration;
	    final String fmode = mode;
	    // Get the configuration values :
        String fileNameString = fconfiguration.getAttribute(KM_FILENAME, "");
        String classQualifiedNameString = fconfiguration.getAttribute(KM_CLASSQNAME, "");
        String operationString = fconfiguration.getAttribute(KM_OPERATIONNAME, "");
        launch.setSourceLocator(new KermetaSourceLocator());
	    
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
                runKermeta(fileNameString, classQualifiedNameString, operationString);
	            // Terminate the run target
	            runtarget.terminate();
	            launch.removeDebugTarget(runtarget);
	            DebugPlugin.getDefault().getLaunchManager().removeLaunch(launch);
	    		
	        }
	        else
	        {
	        	RunnerPlugin.pluginLog.error("ImplementationError : Debug mode not implemented yet");
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
     * @param configuration
     * @param mode
     */
    private static void runKermeta(String fileNameString, String classQualifiedNameString, String operationString)
    {
        
        IFile selectedFile = null;
	    IResource iresource = RunnerPlugin.getWorkspace().getRoot().findMember(fileNameString);
	    if (iresource instanceof IFile)
	        selectedFile = (IFile) iresource;
	    else
	    {  // TODO : throw an exception!
	    }
        // Reparse file ... This is a {temporary!!} patch to get KermetaUnit of
        // selectedFile, because it is not serializable (get a kind of Serialize error
        // when launching performApply
       // KermetaUnit kunit = KermetaRunHelper.parse(selectedFile);
	   /* KermetaConsole console = new KermetaConsole();
	    console.removeCurrentConsole();
	    console.addConsole();*/
        KermetaConsole console = KermetaConsole.getSingletonConsole();
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
                       
            // 	Get the values given by the user in the runPopupDialog
            KermetaInterpreter interpreter = new KermetaInterpreter(uri);
            
            interpreter.setEntryPoint(classQualifiedNameString, operationString);
            interpreter.setKStream(console);     
	        interpreter.launch();
	        interpreter.setKStream(null);
	        interpreter.freeJavaMemory();
	        KermetaUnitFactory.resetDefaultLoader();
		    
        }
        catch (KermetaRaisedException kerror)
        {
            console.print("Uncaught exception in Kermeta program\n");
            console.print(kerror.getMessage());
        }
        catch (KermetaInterpreterError ierror)
        {
            console.print("Uncaught exception in Kermeta interpreter:\n");
            console.print(ierror.getMessage());
        }
        catch (Throwable e)
        {
            console.print("\nKermetaInterpreter internal error \n" +
            		"-------------------------------------------\n");
            console.print(e.getMessage());
            e.printStackTrace();
        }
        console.print("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        // this console is not used any more
        //console.removeConsoleListener();
       
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
