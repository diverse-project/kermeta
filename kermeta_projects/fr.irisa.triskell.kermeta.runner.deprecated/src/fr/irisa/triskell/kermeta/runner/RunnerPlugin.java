package fr.irisa.triskell.kermeta.runner;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.plugin.*;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.runner.console.KermetaConsole;

import java.util.*;

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
	
	// The opened consoles for ConsoleManager... depreceated
	private static IConsole[] consoles;
	
	public static final String PLUGIN_ID="fr.irisa.triskell.kermeta.runner";
	
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
		this.context = context;
		super.start(context);
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
	
	

	/**
	 * This method shows the current perspective.
	 * TODO : move it somewhere else
	 */
	private void __showPerspective()
	{
	    IWorkbenchPage page = getActivePage();
	    try {
	        //String pId = PlatformUI.getWorkbench().getPerspectiveRegistry().getDefaultPerspective();
	        
	        PlatformUI.getWorkbench().showPerspective(page.getPerspective().getId(), page.getWorkbenchWindow());
	    } catch (WorkbenchException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}


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
    
    
}
