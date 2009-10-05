/**
 * Copyright : IRISA / INRIA Rennes Bretagne Atlantique - OpenEmbeDD integration team
 * 
 * This plug-in is under the terms of the EPL License. http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Vincent Mahe
 */
package org.openembedd.logo.csm.ui;

// import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

// import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin
{

	// The plug-in ID
	public static final String	PLUGIN_ID	= "fr.irisa.triskell.kmlogo.ui";

	// Log4j logger for this plugin
	// final static public Logger internalLog = LogConfigurationHelper.getLogger("KMLogoUI");

	// The shared instance
	private static Activator	plugin;

	/**
	 * The constructor
	 */
	public Activator()
	{
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception
	{
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception
	{
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault()
	{
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path
	 * 
	 * @param path
	 *        the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path)
	{
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	/**
	 * This method logs an error message and an associated exception (as a trace) It will post the message both in the
	 * ErrorLog view in Eclipse and in the Log4J
	 * 
	 * @param message
	 *        String
	 */
	public static void logErrorMessage(String message, Throwable e)
	{
		if (message == null)
			message = "";
		// eclipse logger
		getDefault().getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.ERROR, message, e));
		// log4j message
		// internalLog.error(message, e);
	}

	/**
	 * This method logs a warning message and an associated exception (as a trace) It will post the message both in the
	 * ErrorLog view in Eclipse and in the Log4J
	 * 
	 * @param message
	 *        String
	 */
	public static void logWarningMessage(String message, Throwable e)
	{
		if (message == null)
			message = "";
		// eclipse logger
		getDefault().getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, IStatus.WARNING, message, e));
		// log4j message
		// internalLog.warn(message, e);
	}
}
