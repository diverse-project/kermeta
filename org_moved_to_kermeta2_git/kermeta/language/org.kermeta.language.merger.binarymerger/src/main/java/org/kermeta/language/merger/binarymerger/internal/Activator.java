/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2011
* Authors : 
*      Cédric Bouhours <cedric.bouhours@inria.fr>
*/
package org.kermeta.language.merger.binarymerger.internal;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;



/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.binarymerger"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	//The bundle context
	private BundleContext myContext;
	

	/**
	 * The constructor
	 */
	public Activator() {
	}

	public void start(BundleContext context) throws Exception {
		plugin = this;
		setMyContext(context);
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	private void setMyContext(BundleContext myContext) {
		this.myContext = myContext;
	}

	public BundleContext getMyContext() {
		return myContext;
	}

	public void reflexivityLoaderContext() {
		kermeta.utils.ReflexivityLoader.bundleContext_$eq(getMyContext());
	}
}
