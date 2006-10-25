package fr.irisa.triskell.kermeta.plugin;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.plugin.*;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.KermetaIcons;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.*;

/**
 * The main plugin class to be used in the desktop.
 */
public class KermetaPlugin extends AbstractUIPlugin {
	//The shared instance.
	private static KermetaPlugin plugin = null;
	//Resource bundle.
	private ResourceBundle resourceBundle;
	//Icons "registry"
	protected static KermetaIcons kermetaIcons;
	// Logger for this plugin
	protected static Logger pluginLog;
	
	public static final String PLUGIN_CONSOLE_NAME = "KerMeta.Plugin.Console";
	protected MessageConsoleStream consoleStream = null;
    
	
	/**
	 * The constructor.
	 */
	public KermetaPlugin() {
		/*note : be careful this method must not fail ! otherwise all the plugin that depends on it will fail too with a non explicit message !
		 */
		super();
		plugin = this;
		try {
			resourceBundle = ResourceBundle.getBundle("fr.irisa.triskell.kermeta.KermetaPluginResources");
		} catch (MissingResourceException x) {
			resourceBundle = null;
		}
	}

	/**
	 * This method is called upon plug-in activation
	 * */
	 
	public void start(BundleContext context) throws Exception {
		/*note : be careful this method must not fail ! otherwise all the plugin that depends on it will fail too with a non explicit message !
		 */
		super.start(context);
		kermetaIcons = new KermetaIcons(KermetaPlugin.getDefault().getBundle().getEntry("/"));
		// initialize the log4j system using the configuration file contained in this plugin
		try {
			URL url = getBundle().getEntry("/kermeta_log4j_configuration.xml");		
			System.setProperty(fr.irisa.triskell.kermeta.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName,
					Platform.asLocalURL(url).getFile());
		} catch (Exception e) {
			System.out.print("Not able to retreive kermeta_log4j_configuration.xml in the kermeta plugin => using default log configuration");
			// don't worry about that, the log4j will simply use its default configuration
		}
		if(StdLibKermetaUnitHelper.STD_LIB_URI == null) StdLibKermetaUnitHelper.setURItoDefault();
		
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
	 * Returns the string from the plugin's resource bundle,
	 * or 'key' if not found.
	 */
	public static String getResourceString(String key) {
		ResourceBundle bundle = KermetaPlugin.getDefault().getResourceBundle();
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
	 * @return Logger : a log4j logger
	 */
	public static Logger getLogger()
	{
		if(pluginLog == null) pluginLog = LogConfigurationHelper.getLogger("Kermeta");
		return pluginLog;
	}
	
	/**
	 * get current MessageConsoleStream. Create a new one if it doesn't exist
	 * @return MessageConsoleStream
	 */
	public MessageConsoleStream getConsoleStream() {

		if(consoleStream == null)
			this.newConsole();			
	    return consoleStream;
    }
	
	/**
	 * get current MessageConsole. Create a new one if it doesn't exist
	 * @return MessageConsole
	 */
	public MessageConsole getConsole() {

		MessageConsole messageConsole = null;
	    
		IConsoleManager consoleManager = null;
	    
	    ConsolePlugin cplugin = ConsolePlugin.getDefault();
	    consoleManager = cplugin.getConsoleManager();
	    IConsole[] consoles = consoleManager.getConsoles();
	    // retreives existing console
	    for ( int i = 0; i < consoles.length; i++)
	    {
	    	if (consoles[i].getName().compareTo(PLUGIN_CONSOLE_NAME)==0)
	    	{
	    		messageConsole = (MessageConsole)consoles[i];
	    	}
	    }
	    if (messageConsole == null)
	    {
	    	messageConsole = new MessageConsole(PLUGIN_CONSOLE_NAME, null);
	    	consoleStream = messageConsole.newMessageStream();
	        consoleManager.addConsoles( new IConsole[]{messageConsole});
		    consoleManager.showConsoleView(messageConsole);
	    }
	    
	    return messageConsole;
    }
	
	/**
	 * reset MessageConsole. 
	 * @return MessageConsoleStream (for direct use)
	 */
	public MessageConsoleStream newConsole() {

		MessageConsole messageConsole = null;
	    
		IConsoleManager consoleManager = null;
	    
	    ConsolePlugin cplugin = ConsolePlugin.getDefault();
	    consoleManager = cplugin.getConsoleManager();
	    IConsole[] consoles = consoleManager.getConsoles();
	    // removes existing console
	    for ( int i = 0; i < consoles.length; i++)
	    {
	    	if (consoles[i].getName().compareTo(PLUGIN_CONSOLE_NAME)==0)
	    	{
	    		consoleManager.removeConsoles(new IConsole[]{consoles[i]});
	    	}
	    }
	    if (messageConsole == null)
	    {
	    	messageConsole = new MessageConsole(PLUGIN_CONSOLE_NAME, null);
	    	consoleStream = messageConsole.newMessageStream();
	        consoleManager.addConsoles( new IConsole[]{messageConsole});
		    consoleManager.showConsoleView(messageConsole);
	    }
	    else
	    {
	    	consoleStream = messageConsole.newMessageStream();	        
	    }
	    return consoleStream;
    }
	
	public void consolePrintStackTrace(Throwable e)
	{
		ByteArrayOutputStream oStream = new java.io.ByteArrayOutputStream();		
		PrintWriter pw = new PrintWriter(oStream);			
		e.printStackTrace(pw);
		pw.flush();
		MessageConsoleStream mcs = getConsole().newMessageStream();
		consoleStream = mcs;
    	mcs.setColor(new Color(null, 255,0,0));
    	mcs.println(oStream.toString());
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
	
	/**
	 * Convenience method that finds the IFile element corresponding to the uri 
	 * given by <code>filepath</code>. The filepath must refer to a file
	 * that exists in the user workspace. Please use method 
	 * IDEWorkbenchPlugin.getPluginWorkspace().getRoot().getFile() if the 
	 * given path does not refer to an existing file. 
	 * @param filepath The file path, ideally represented 
	 * as <code>platform:/resource/path_relative_to_the_current_workspace</code>
	 * @return the corresponding IFile in the current workspace. 
	 */
	public static IFile getIFileFromString(String filepath)
	{
	    IFile selectedFile = null;
	    String newpath = filepath;
	    if (filepath!=null && filepath.startsWith("platform:/resource/"))
    		newpath = filepath.toString().substring(19); 
	    IResource iresource = getWorkspaceRoot().findMember(newpath);
	    if (iresource instanceof IFile)
	        selectedFile = (IFile) iresource;
	    return selectedFile;
	}
	
}
