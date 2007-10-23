/* $Id: FsmPlugin.java,v 1.7 2007-10-23 13:39:54 dvojtise Exp $
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : oct. 07
 * Authors       :
 * 		Cyril Faucher <cfaucher@irisa.fr> 
 */
package fr.irisa.triskell.kermeta.samples.fsm;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class FsmPlugin extends AbstractUIPlugin {

	//The shared instance.
	private static FsmPlugin plugin;
	
	public static String FSM_WIAZRD_ID = "fr.irisa.triskell.kermeta.samples.fsm.wizard";
	
	public static String PROJECT_NAME = "fr.irisa.triskell.kermeta.samples.fsm";
	
	public static String DEMO_PROJECT_NAME = "fr.irisa.triskell.kermeta.samples.fsm.demo";
	
	/**
	 * The constructor.
	 */
	public FsmPlugin() {
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
	public static FsmPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("fr.irisa.triskell.kermeta.samples.fsm", path);
	}
}
