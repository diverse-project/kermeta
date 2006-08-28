/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *   Jacques Lescot (Anyware Technologies), Thomas Friol (Anyware Technologies),
 *   Nicolas Lalevée (Anyware Technologies) - initial API and implementation 
 ******************************************************************************/

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmPlugin extends AbstractUIPlugin {
	// The shared instance
	private static FsmPlugin plugin;

	/**
	 * The constructor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmPlugin() {
		super();
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 * @generated
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 * @generated
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton
	 * @generated
	 */
	public static FsmPlugin getDefault() {
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the Plugin Id
	 * @generated
	 */
	public static String getId() {
		return getDefault().getBundle().getSymbolicName();
	}

	/**
	 * Log a message with given level into the Eclipse log file
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param message the message to log
	 * @param level the message priority
	 * @generated
	 */
	public static void log(String message, int level) {
		IStatus status = null;
		status = new Status(level, getId(), IStatus.OK, message, null);
		log(status);
	}

	/**
	 * Log an exception into the Eclipse log file
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param e the exception to log
	 * @generated
	 */
	public static void log(Throwable e) {
		if (e instanceof InvocationTargetException)
			e = ((InvocationTargetException) e).getTargetException();

		IStatus status = null;
		if (e instanceof CoreException)
			status = ((CoreException) e).getStatus();
		else
			status = new Status(IStatus.ERROR, getId(), IStatus.OK, "Error", e);

		log(status);
	}

	/**
	 * Log an IStatus
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param status the status to log
	 * @generated
	 */
	public static void log(IStatus status) {
		ResourcesPlugin.getPlugin().getLog().log(status);
	}
}
