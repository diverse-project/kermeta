/* $Id: TutorialAspectsPlugin.java,v 1.1 2007-12-20 15:46:21 cfaucher Exp $
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : oct. 07
 * Authors       :
 * 		Cyril Faucher <cfaucher@irisa.fr> 
 */
package org.kermeta.tutorial.aspects.documentation;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class TutorialAspectsPlugin extends AbstractUIPlugin {

	//The shared instance.
	private static TutorialAspectsPlugin plugin;
	
	public static String PROJECT_NAME = "org.kermeta.tutorial.aspects.documentation";
	
	/**
	 * The constructor.
	 */
	public TutorialAspectsPlugin() {
		plugin = this;
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
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static TutorialAspectsPlugin getDefault() {
		return plugin;
	}

}
