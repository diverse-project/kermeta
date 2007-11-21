/* $Id: RunnerPlugin.java,v 1.19 2007-11-21 14:13:05 ftanguy Exp $
 * Project: Kermeta.runner
 * File: runner.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey, dvojtise
 * Description: 
 */
package fr.irisa.triskell.kermeta.runner;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.runner.console.ConsoleTerminateAction;
import fr.irisa.triskell.kermeta.runner.debug.model.AbstractKermetaTarget;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * The main plugin class to be used in the desktop.
 */
public class RunnerPlugin extends AbstractUIPlugin 
{//implements ILaunchShortcut {
	//The shared instance. 
	private static RunnerPlugin plugin;
	//Resource bundle.
	private ResourceBundle resourceBundle;

	//
	private RunnerIcons runnerIcons;
	
	// logger for this plugin
	final static public Logger pluginLog = LogConfigurationHelper.getLogger("KermetaRunner");
	
	public static final String PLUGIN_ID="fr.irisa.triskell.kermeta.runner";
	// FIXME : change the location of this variable
	public static final String PLUGIN_EDITOR_ID="org.eclipse.ui.editors.text.texteditor";
	
	/**
	 * The constructor.
	 */
	public RunnerPlugin() {
		super();
		plugin = this;
		try {
			resourceBundle = ResourceBundle.getBundle("fr.irisa.triskell.kermeta.runner.RunnerPluginResources");
			
		} catch (MissingResourceException x) {
			resourceBundle = null;
		}
	}

	/**
	 * This method is called upon plug-in activation
	 * 
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		this.runnerIcons = new RunnerIcons(RunnerPlugin.getDefault().getBundle().getEntry("/"));
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 * (Useful in static methods)
	 */
	public static RunnerPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns the string from the plugin's resource bundle,
	 * or 'key' if not found.
	 */
	public static String getResourceString(String key) {
		ResourceBundle bundle = RunnerPlugin.getDefault().getResourceBundle();
		try {
			return (bundle != null) ? bundle.getString(key) : key;
		} catch (MissingResourceException e) {
			return key;
		}
	}
	
	public static RunnerIcons getRunnerIcons()
	{
		return plugin.runnerIcons;
	}

	/**
	 * Returns the plugin's resource bundle,
	 */
	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}

    /**
     * Helper method used by OpenKermetaPerspective to print the exception log
     * @param e
     */
    public static void logException(WorkbenchException e) {
        System.err.println("log Exception is not implemented, but you have this one :P : "+e);
    }

    /**
     * @param string
     * @param e
     */
    public void logError(String string, Exception e) {
        System.err.println(string+": "+e);
        e.printStackTrace();
        
    }
    
    public static void log(Throwable e)
	{
		log(new Status(IStatus.ERROR, PLUGIN_ID, 0, "Debug Error", e)); //$NON-NLS-1$
	}

	public static void errorDialog(String message)
	{
		errorDialog(message, null);
	}

	public static void errorDialog(String message, IStatus status)
	{

		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		if (shell != null)
		{
			shell.getDisplay().syncExec(new DisplayErrorThread(shell, message,status));
		}
	}
	
	public static void log(int fSeverity, String fText, Exception fException)
	{
		
		
		Status status, result;
		MultiStatus multiStatus;
		
			
		if( fException != null )
		{
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		PrintWriter swr = new PrintWriter(out);
		fException.printStackTrace(swr);
		String buf = (fException.getMessage()+"\n"+out.toString());
		StringTokenizer tok = new StringTokenizer(buf, "\n");
		multiStatus = new MultiStatus(PLUGIN_ID,fSeverity,fText, fException);
		while(tok.hasMoreElements())
		{
			status =
			new Status(fSeverity, PLUGIN_ID, 0,tok.nextToken(),null);
			multiStatus.add(status);	
		}
			
		
		result = multiStatus;
		}
		 else
		 {
		  	result = new Status(fSeverity, PLUGIN_ID, 0,fText,fException);
		 }
		log(new Status(fSeverity, PLUGIN_ID, 0,fText,fException));
		errorDialog(fText, result);
	}
	
	/**
	 * Logs the specified status with this plug-in's log.
	 *
	 * @param status status to log
	 */
	private static void log(IStatus status)
	{
	    getDefault().getLog().log(status);
	    Throwable e = status.getException();
	    if (e != null)
	        e.printStackTrace();
	}
		
	static class DisplayErrorThread implements Runnable 
	{
	    Shell  mShell;
	    String mMessage;
	    IStatus mStatus;
	    
	    public DisplayErrorThread(Shell fShell, String fMessage,IStatus fStatus)
	    {
	        mShell = fShell;
	        mMessage = fMessage;
	        mStatus = fStatus;
	    }
	    
	    public void run()
	    {
	        if (mStatus == null)
	            MessageDialog.openError(mShell, "Kermeta Error", mMessage);
	        else
	            ErrorDialog.openError(mShell, "Error", null, mStatus); //$NON-NLS-1$
	        
	    }
	 }
    
	private Hashtable<AbstractKermetaTarget, ConsoleTerminateAction> terminateActions = new Hashtable<AbstractKermetaTarget, ConsoleTerminateAction> ();

	public void prepareExecution(AbstractKermetaTarget target, ConsoleTerminateAction action) {
		terminateActions.put(target, action);
	}
	
	public void stopExecution(AbstractKermetaTarget target) {
		terminateActions.get(target).setEnabled(false);
	}
	
}
