package fr.irisa.triskell.kermeta.plugin;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.irisa.triskell.kermeta.KermetaIcons;
import fr.irisa.triskell.kermeta.FileRegistry;
import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;



/**
 * The main plugin class to be used in the desktop.
 */
public class KermetaPlugin extends AbstractUIPlugin {
	
	final static public String ID = "fr.irisa.triskell.kermeta";
	
	//The shared instance.
	private static KermetaPlugin plugin = null;

	//Icons "registry"
	protected static KermetaIcons kermetaIcons;
	// Logger for this plugin
	protected static Logger pluginLog;
	
	private IOConsole console = null;
	
	/**
	 * The constructor.
	 */
	public KermetaPlugin() {
		super();
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 * */
	 
	public void start(BundleContext context) throws Exception {
		super.start(context);

		// check the compatibility of dependent  stuff ... 
		new CompatibilityChecker().check();
		
		/*
		 * 
		 * Register files that have been set up within Register File extension point.
		 * 
		 */
		FileRegistry.registerAll();
		
		FileRegistry.getPackage("http://kermeta/framework");
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 */
	public static KermetaPlugin getDefault() {
		return plugin;
	}
	
	/**	 
	 * @return Logger : a log4j logger
	 */
	public static Logger getLogger()
	{
		if(pluginLog == null) pluginLog = LoggerFactory.getLogger("Kermeta");
		return pluginLog;
	}
	
	
	/**
	 * get current MessageConsole. Create a new one if it doesn't exist
	 * @return MessageConsole
	 */
	public IOConsole getConsole() {
		if ( console == null )
			console = new EclipseConsole("Kermeta Console");
	    return console;
    }

	
	/* ACCESSORS */
	public static KermetaIcons getKermetaIcons() { return kermetaIcons; }
	
	/*
	 * -------------------------------------------------------------------------
	 * 
	 * A set of helper methods to access the Eclipse workbench/workspace easily
	 * 
	 * -------------------------------------------------------------------------
	 */
	
	/**
	 * (CommontTab) Convenience method for getting the workspace root.
	 */
	public static IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}
	
	/**
	 * (CommontTab) Convenience method for getting the member resource 
	 * of the workspace root
	 */
	public static IContainer getContainer(String path) {
		Path containerPath = new Path(path);
		return (IContainer) getWorkspaceRoot().findMember(containerPath);
	}
	
}
