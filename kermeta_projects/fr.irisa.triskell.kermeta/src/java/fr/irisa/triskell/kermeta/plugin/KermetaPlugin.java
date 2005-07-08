package fr.irisa.triskell.kermeta.plugin;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.*;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

import java.net.URL;
import java.util.*;

/**
 * The main plugin class to be used in the desktop.
 */
public class KermetaPlugin extends AbstractUIPlugin {
	//The shared instance.
	private static KermetaPlugin plugin;
	//Resource bundle.
	private ResourceBundle resourceBundle;
	
//	 logger for this plugin
	static protected Logger pluginLog;
	
	
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

		// initialize the log4j system using the configuration file contained in this plugin
		try {
			URL url = getBundle().getEntry("/kermeta_log4j_configuration.xml");		
			System.setProperty(fr.irisa.triskell.kermeta.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName,
					Platform.asLocalURL(url).getFile());
		} catch (Exception e) {
			System.out.print("Not able to retreive kermeta_log4j_configuration.xml in the kermeta plugin => using default log configuration");
			// don't worry about that, the log4j will simply use its default configuration
		}
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
}
