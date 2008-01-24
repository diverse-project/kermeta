/* $Id: Activator.java,v 1.2 2008-01-24 14:15:17 dvojtise Exp $
 * Project: OCL
 * File: Activator.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * Authors : 
 * 		Mark Skipper
 *		Olivier Barais
 * 		Didier Vojtisek
 */
package fr.irisa.triskell.kermeta.ocl;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import fr.irisa.triskell.kermeta.ocl.OptionManager;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.irisa.triskell.kermeta.ocl";
	

	// helper to get options of the plugin
	private OptionManager optionManager;

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

    public OptionManager getOptionManager () {
        if (optionManager == null) {
        	optionManager = new OptionManager(getPreferenceStore());
        }
        return optionManager;
    }
}
