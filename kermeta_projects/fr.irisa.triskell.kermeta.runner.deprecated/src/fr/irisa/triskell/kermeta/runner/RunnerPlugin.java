/* $Id: RunnerPlugin.java,v 1.18 2007-07-24 13:47:20 ftanguy Exp $
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
import java.io.File;
import java.io.PrintWriter;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

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
	//Resource context.
	private BundleContext context;
	
	//
	private RunnerIcons runnerIcons;
	
	// logger for this plugin
	final static public Logger pluginLog = LogConfigurationHelper.getLogger("KermetaRunner");
	
	// The opened consoles for ConsoleManager... depreceated
	private static IConsole[] consoles;
	
	public static final String PLUGIN_ID="fr.irisa.triskell.kermeta.runner";
	// FIXME : change the location of this variable
	public static final String PLUGIN_EDITOR_ID="org.eclipse.ui.editors.text.texteditor";
	
	/**
	 * The constructor.
	 */
	public RunnerPlugin() {
		super();
		plugin = this;
		consoles = new IConsole[] {};
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
		this.context = context;
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
     * @return current workspace
     */
    public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
    }
    
    
    public static IWorkbenchPage getActivePage() {
		return getDefault().internalGetActivePage();
	  }

	private IWorkbenchPage internalGetActivePage() {
			IWorkbenchWindow window= getWorkbench().getActiveWorkbenchWindow();
			if (window == null)
				return null;
			return getWorkbench().getActiveWorkbenchWindow().getActivePage();
		}
	
	
	public IConsoleView getConsoleView() throws CoreException {
		//org.eclipse.ui.console.ConsoleView
		IConsoleView consoleView = null;
		// does not work
/*		IViewDescriptor ref_view = getWorkbench().getViewRegistry().find(
				"org.eclipse.ui.console.ConsoleView");
		consoleView = (IConsoleView)ref_view.createView(); */
		return consoleView;
	}
	

	/**
	 * This method shows the current perspective.
	 * TODO : move it somewhere else
	 */
/*	private void __showPerspective()
	{
	    IWorkbenchPage page = getActivePage();
	    try {
	        //String pId = PlatformUI.getWorkbench().getPerspectiveRegistry().getDefaultPerspective();
	        
	        PlatformUI.getWorkbench().showPerspective(page.getPerspective().getId(), page.getWorkbenchWindow());
	    } catch (WorkbenchException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}*/


    /**
     * Helper method used by OpenKermetaPerspective
     * @return the active workbench window
     */
    public static IWorkbenchWindow getActiveWorkbenchWindow()
    {
        return getDefault().getWorkbench().getActiveWorkbenchWindow();
    }

    /**
     * Helper method used by OpenKermetaPerspective to print the exception log
     * @param e
     */
    public static void logException(WorkbenchException e) {
        System.err.println("log Exception is not implemented, but you have this one :P : "+e);
    }
    
    
    public IConsole[] getConsoles()
    {
        return consoles;
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

		Shell shell = getActiveWorkbenchShell();
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
	
	/**
	 * Returns the active workbench shell or <code>null</code> if none
	 *
	 * @return the active workbench shell or <code>null</code> if none
	 */
	public static Shell getActiveWorkbenchShell()
	{
	    IWorkbenchWindow window = getActiveWorkbenchWindow();
	    if (window == null)
	        window = getDefault().getWorkbench().getWorkbenchWindows()[0];
	    if (window != null)
	    {
	        
	        return window.getShell();
	    }
	    return null;
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
	
	/** 
	 * Accessor as created in the Eclipse usual plugins
	 * @return
	 */
	public static String getUniqueIdentifier()
	{
		return PLUGIN_ID;
	}
	
	/**
	 * Picked from Pydev :P
	 * Dirty trials.
	 */
	public static IEditorInput createEditorInput(IPath path)
	{
		IEditorInput edInput;
		IWorkspace w = ResourcesPlugin.getWorkspace();      
		IFile file = w.getRoot().getFileForLocation(path);
		if (file == null  || !file.exists())
		{
			//it is probably an external file
			File file2 = path.toFile();
			edInput = createEditorInput(file2);
		}
		else
		{
			edInput = new FileEditorInput(file);
		}
		return edInput;
	}
	
	
    private static IEditorInput createEditorInput(File file) {
    	IFile[] workspaceFile= getWorkspaceFile(file);
        if (workspaceFile != null && workspaceFile.length > 0)
        {	
        	// todo : study org.eclipse.ui.part
            return new FileEditorInput(workspaceFile[0]);
        }
        else { System.out.println("oups, file not found in workspace : " + file);}
        // return new PydevFileEditorInput(file);
        return null;
    }
    
    

    /**
     * We suppose for the moment that the file is available.
     * We have to change that for next version.
     * @param file
     * @return
     */
    public static IFile[] getWorkspaceFile(File file) {
        IWorkspace workspace= ResourcesPlugin.getWorkspace();
        IPath location= Path.fromOSString(file.getAbsolutePath());
        IFile[] files= workspace.getRoot().findFilesForLocation(location);
        return files;
    }
    

    
}
