/* $Id: KermetaLaunchConfiguration.java,v 1.10 2005-06-10 15:41:45 zdrey Exp $
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.runner.console.KermetaConsole;

/**
 * 
 */
public class KermetaLaunchConfiguration extends LaunchConfigurationDelegate 
{
    /*
     * 
     * STATIC FIELDS
     *
     */
    public static String KM_FILENAME = "KM_FILENAME";
    public static String KM_CLASSQNAME = "KM_CLASSQNAME";
    public static String KM_OPERATIONNAME = "KM_OPERATIONNAME";
    public static String KM_PROJECTNAME = "KM_PROJECTNAME";
    
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
	    
	    try
	    {
	        //  If the mode choosen is Run a Kermeta run target is created
	        if (mode.equals(ILaunchManager.RUN_MODE)) 
	        {   
	            
	            //launch.setSourceLocator(new KermetaSourceLocator());
	           
	            KermetaRunTarget runtarget = new KermetaRunTarget(launch); 
	            // Set the run target with current launch
	            // Add it as a debug target
	            launch.addDebugTarget(runtarget);
	            // Run the launcher with configurationParam, launchParam, currentMode
	            runKermeta(fconfiguration, fmode);
                //runKermeta(configuration, mode);
	            
	            // Terminate the run target
	            runtarget.terminate();
	            launch.removeDebugTarget(runtarget);

	        }
	        else
	        {
	            System.out.println("ImplementationError : Debug mode not implemented yet");
	        }
	    }
	    catch (KermetaInterpreterError e)
	    {
	        MessageDialog.openError(new Shell(), "Kermeta interpreter error", e.getMessage());
	    }
	    catch (Exception e)
	    {
	        System.err.println("There is a plugin error :'(");
	        e.printStackTrace();
	    }
	}

    /**
     * This method run the Kermeta interpreter, according to the data given by
     * the user through the launch configuration window.
     * @param configuration
     * @param mode
     */
    private void runKermeta(ILaunchConfiguration configuration, String mode) {
        try {
            
            
            String fileNameString = configuration.getAttribute(KM_FILENAME, "");
            String classQualifiedNameString = configuration.getAttribute(KM_CLASSQNAME, "");
            String operationString = configuration.getAttribute(KM_OPERATIONNAME, "");
           
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
            KermetaConsole console = new KermetaConsole();
            // Remove the preceding consoles
            console.removeCurrentConsole();
            // Add a MessageConsole
            console.addConsole();	
	        try
	        {
	            
	            String uri = "platform:/resource/" + selectedFile.getFullPath().toString();
	            
	            // 	Get the values given by the user in the runPopupDialog
	            KermetaInterpreter interpreter = new KermetaInterpreter(uri);
	            
	            interpreter.setEntryPoint(classQualifiedNameString, operationString);
	            interpreter.setKStream(console);     
    	        interpreter.launch();
    	
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
            
            // TODO Auto-generated method stub
        } catch (CoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
	

}
