/*$Id: Activator.java,v 1.1 2008-02-11 15:04:07 dvojtise Exp $
* Project : org.kermeta.uml2.profiles.model
* File : 	Activator.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 11 févr. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.uml2.profiles.model.plugin;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {


	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.uml2.profiles.model";

	public static final String PLUGIN_TESTS_PATH = "platform:/plugin/org.kermeta.uml2.profiles.model/";
	
	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
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
	public static Activator getDefault() {
		return plugin;
	}

}
