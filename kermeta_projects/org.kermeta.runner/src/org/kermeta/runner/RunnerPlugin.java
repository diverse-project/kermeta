/*$Id: RunnerPlugin.java,v 1.4 2008-05-28 13:39:19 dvojtise Exp $
* Project : org.kermeta.runner
* File : 	zgzerg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.runner;

import org.apache.commons.logging.Log;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import org.kermeta.log4j.util.LogConfigurationHelper;

/**
 * The activator class controls the plug-in life cycle
 */
public class RunnerPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.runner";

	// The shared instance
	private static RunnerPlugin plugin;
	
	private BundleContext context;
	
	public BundleContext getContext() {
		return context;
	}

	/** Logger to get the error of this interpreter */
	final static public Log internalLog = LogConfigurationHelper.getLogger("kermeta.runner");
	
	/**
	 * The constructor
	 */
	public RunnerPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		this.context= context;
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
	public static RunnerPlugin getDefault() {
		return plugin;
	}

}
