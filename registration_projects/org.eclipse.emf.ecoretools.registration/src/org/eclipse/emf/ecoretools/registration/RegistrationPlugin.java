/* $Id: RegistrationPlugin.java,v 1.3 2008-01-28 13:47:32 dvojtise Exp $
 * Project   : org.eclipse.emf.ecoretools.registration
 * File      : RegistrationPlugin.java
 * License   : EPL
 * Copyright : INRIA
 * ----------------------------------------------------------------------------
 * Creation date : Feb 14, 2006
 * Authors       : Didier Vojtisek <dvojtise@irisa.fr>
 */
package org.eclipse.emf.ecoretools.registration;

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
	

}
