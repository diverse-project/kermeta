

/*$Id: IOPlugin.java,v 1.3 2007-05-04 13:53:39 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	IOPlugin.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 févr. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.io.plugin;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.traceability.model.ModelPlugin;

public class IOPlugin extends Plugin {
	
	//	The shared instance.
	private static IOPlugin plugin;
	//Resource bundle.
	private ResourceBundle resourceBundle;
	
	public IOPlugin() {
		super();
		plugin = this;
		try {
			resourceBundle = ResourceBundle.getBundle("fr.irisa.triskell.traceability.model.ModelPluginResources");
		} catch (MissingResourceException x) {
			resourceBundle = null;
		}
		if(StdLibKermetaUnitHelper.STD_LIB_URI == null) StdLibKermetaUnitHelper.setURItoDefault();
		StdLibKermetaUnitHelper.getKermetaUnit();
	}
	
	
	
	
	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
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
	 */
	public static IOPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns the string from the plugin's resource bundle,
	 * or 'key' if not found.
	 */
	public static String getResourceString(String key) {
		ResourceBundle bundle = ModelPlugin.getDefault().getResourceBundle();
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
}


