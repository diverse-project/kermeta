/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 * 
 * @generated
 */
public class LogoCSMPlugin extends AbstractUIPlugin
{
	// The shared instance
	private static LogoCSMPlugin	plugin;

	/**
	 * The constructor.
	 * 
	 * @generated
	 */
	public LogoCSMPlugin()
	{
		super();
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 * @generated
	 */
	public void start(BundleContext context) throws Exception
	{
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 * @generated
	 */
	public void stop(BundleContext context) throws Exception
	{
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 * 
	 * @return the singleton
	 * @generated
	 */
	public static LogoCSMPlugin getDefault()
	{
		return plugin;
	}

	/**
	 * @return the Plugin Id
	 * @generated
	 */
	public static String getId()
	{
		return getDefault().getBundle().getSymbolicName();
	}

	/**
	 * Returns the active workbench shell
	 * 
	 * @return the active workbench shell
	 * @generated
	 */
	public static Shell getActiveWorkbenchShell()
	{
		IWorkbenchWindow workBenchWindow = getActiveWorkbenchWindow();
		if (workBenchWindow == null)
		{
			return null;
		}
		return workBenchWindow.getShell();
	}

	/**
	 * Returns the active workbench page or <code>null</code> if none.
	 * 
	 * @return the active workbench page
	 * @generated
	 */
	public static IWorkbenchPage getActivePage()
	{
		IWorkbenchWindow window = getActiveWorkbenchWindow();
		if (window != null)
		{
			return window.getActivePage();
		}
		return null;
	}

	/**
	 * Returns the active workbench window
	 * 
	 * @return the active workbench window
	 * @generated
	 */
	public static IWorkbenchWindow getActiveWorkbenchWindow()
	{
		if (getDefault() == null)
		{
			return null;
		}
		IWorkbench workBench = getDefault().getWorkbench();
		if (workBench == null)
		{
			return null;
		}
		return workBench.getActiveWorkbenchWindow();
	}

	/**
	 * Log a message with given level into the Eclipse log file
	 * 
	 * @param message
	 *        the message to log
	 * @param level
	 *        the message priority
	 * @generated
	 */
	public static void log(String message, int level)
	{
		IStatus status = null;
		status = new Status(level, getId(), IStatus.OK, message, null);
		log(status);
	}

	/**
	 * Log an exception into the Eclipse log file
	 * 
	 * @param e
	 *        the exception to log
	 * @generated
	 */
	public static void log(Throwable e)
	{
		if (e instanceof InvocationTargetException)
		{
			e = ((InvocationTargetException) e).getTargetException();
		}

		IStatus status = null;
		if (e instanceof CoreException)
		{
			status = ((CoreException) e).getStatus();
		}
		else
		{
			status = new Status(IStatus.ERROR, getId(), IStatus.OK, "Error", e);
		}

		log(status);
	}

	/**
	 * Log an IStatus
	 * 
	 * @param status
	 *        the status to log
	 * @generated
	 */
	public static void log(IStatus status)
	{
		ResourcesPlugin.getPlugin().getLog().log(status);
	}
}
