/* $Id: CompilerPlugin.java,v 1.2 2008-10-16 09:05:32 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.compiler
 * File      : CompilerPlugin.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 22, 2007
 * Authors       : cfaucher
 */

package org.kermeta.compiler;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class CompilerPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.compiler";

	// The shared instance
	private static CompilerPlugin plugin;
	
	/**
	 * The constructor
	 */
	public CompilerPlugin() {
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
	public static CompilerPlugin getDefault() {
		return plugin;
	}
	
	/**
	 * This method logs an error message and an associated exception (as a trace)
	 * It will post the message both in the ErrorLog view in Eclipse and in the Log4J
	 * @param message String
	 */
	public static void logErrorMessage(String message, Throwable e) {
		if (message == null)
			message= "";
		// eclipse logger
		getDefault().getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.ERROR, message, e));
		
	}
	
	/**
	 * This method logs a warning message and an associated exception (as a trace)
	 * It will post the message both in the ErrorLog view in Eclipse and in the Log4J
	 * @param message String
	 */
	public static void logWarningMessage(String message, Throwable e) {
		if (message == null)
			message= "";
		// eclipse logger
		getDefault().getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, IStatus.WARNING, message, e));
		
	}
}
