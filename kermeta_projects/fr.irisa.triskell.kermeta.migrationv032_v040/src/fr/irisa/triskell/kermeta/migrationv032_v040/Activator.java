package fr.irisa.triskell.kermeta.migrationv032_v040;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.irisa.triskell.kermeta.migrationv032_v040";	

	// The shared instance
	private static Activator plugin;
	

	public static final String PLUGIN_CONSOLE_NAME = "KerMeta.Plugin.Console"; // connects to the same console as the main console in kermeta
	protected MessageConsoleStream consoleStream = null;
	
	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		

		if(StdLibKermetaUnitHelper.STD_LIB_URI == null) StdLibKermetaUnitHelper.setURItoDefault();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
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
	    IResource iresource = ResourcesPlugin.getWorkspace().getRoot().findMember(newpath);
	    if (iresource instanceof IFile)
	        selectedFile = (IFile) iresource;
	    return selectedFile;
	}
}
