/* $Id: TestPlugin.java,v 1.1 2007-09-10 08:35:16 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.tests
 * File       : TestPlugin.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 07 Sep. 2007
 * Authors : 
 *        Cyril Faucher <cfaucher@irisa.fr>
 * Description : 
 *			Plugin dedicated to the Kermeta tests
 */

package fr.irisa.triskell.kermeta.tests.plugin;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


/**
 * The main plugin class to be used in the desktop.
 */
public class TestPlugin extends AbstractUIPlugin {
	//The shared instance.
	private static TestPlugin plugin = null;
	
	public static final String PLUGIN_TESTS_PATH = "platform:/plugin/fr.irisa.triskell.kermeta.tests/";
	
	/**
	 * The constructor.
	 */
	public TestPlugin() {
		super();
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 * */
	 
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
	public static TestPlugin getDefault() {
		return plugin;
	}
	
}
