/*$Id: KPMPlugin.java,v 1.10 2007-04-24 13:33:47 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.plugin;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class KPMPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.irisa.triskell.kermeta.kpm";
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("KPM");

	// The shared instance
	private static KPMPlugin plugin;
	
	/**
	 * The constructor
	 */
	public KPMPlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
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
	public static KPMPlugin getDefault() {
		return plugin;
	}


}
