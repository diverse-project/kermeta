package org.openembedd.logo.csm.tutorial;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;



/**
 * The main plugin class to be used in the desktop.
 */
public class LogoCSMDemoPlugin extends AbstractUIPlugin
{
	// The plug-in ID
	public static final String PLUGIN_ID = "org.openembedd.logo.csm.tutorial";

	
	// The shared instance
	private static LogoCSMDemoPlugin plugin;
	
	/**
	 * The constructor
	 */
	public LogoCSMDemoPlugin() {
		plugin = this;
	}
	
	public ImageDescriptor getImageDescriptor(String path)
	{
		return AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static LogoCSMDemoPlugin getDefault() {
		return plugin;
	}
}
