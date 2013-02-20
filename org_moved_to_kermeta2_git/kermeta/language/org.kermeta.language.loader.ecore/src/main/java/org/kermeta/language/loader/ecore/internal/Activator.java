/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2011
* Authors : 
*     Arnaud Blouin
*/
package org.kermeta.language.loader.ecore.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {
	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.loader.ecore"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	//The bundle context
	private BundleContext myContext;
	

	/**
	 * The constructor
	 */
	public Activator() {
		super();
	}

	public void start(final BundleContext context) throws Exception {
		plugin = this;
		setMyContext(context);
	}

	public void stop(final BundleContext context) throws Exception {
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	private void setMyContext(final BundleContext myContext) {
		this.myContext = myContext;
	}

	public BundleContext getMyContext() {
		return myContext;
	}

	public void reflexivityLoaderContext() {
		kermeta.utils.ReflexivityLoader.bundleContext_$eq(getMyContext());
	}
}

