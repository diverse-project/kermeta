/* $Id: RegistrationPlugin.java,v 1.2 2007-12-13 15:23:11 dvojtise Exp $
 * Project   : org.eclipse.emf.ecoretools.registration
 * File      : RegistrationPlugin.java
 * License   : EPL
 * Copyright : INRIA
 * ----------------------------------------------------------------------------
 * Creation date : Feb 14, 2006
 * Authors       : Didier Vojtisek <dvojtise@irisa.fr>
 */
package org.eclipse.emf.ecoretools.registration;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class RegistrationPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.emf.ecoretools.registration";

	// The shared instance
	private static RegistrationPlugin plugin;
	
	// Logger for this plugin
	protected static Logger pluginLog;
	
	/**
	 * The constructor
	 */
	public RegistrationPlugin() {
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
	public static RegistrationPlugin getDefault() {
		return plugin;
	}
	
	/**	 
	 * @return Logger : a log4j logger
	 */
	public static Logger getLogger()
	{
		if(pluginLog == null) pluginLog = Logger.getRootLogger();
		return pluginLog;
	}

}
