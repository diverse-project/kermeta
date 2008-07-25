/*$Id: KpmTestPlugin.java,v 1.2 2008-07-25 08:49:11 dvojtise Exp $
* Project : org.kermeta.runner.ui
* File : 	DebugUIPlugin.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.kpm.test;

import org.apache.commons.logging.Log;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.log4j.util.LogConfigurationHelper;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class KpmTestPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.kpm.kpm.test";

	// The shared instance
	private static KpmTestPlugin plugin;
	
	// Log4j logger for this plugin
	final static public Log internalLog = LogConfigurationHelper.getLogger("KpmTestPlugin");
	
	/**
	 * The constructor
	 */
	public KpmTestPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
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
	public static KpmTestPlugin getDefault() {
		return plugin;
	}

}
