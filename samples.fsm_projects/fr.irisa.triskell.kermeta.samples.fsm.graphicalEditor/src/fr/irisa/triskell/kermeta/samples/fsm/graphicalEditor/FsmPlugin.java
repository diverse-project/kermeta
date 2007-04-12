/*******************************************************************************
 * $Id: FsmPlugin.java,v 1.4 2007-04-12 13:56:26 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
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
public class FsmPlugin extends AbstractUIPlugin {
	/**
	 * The shared instance
	 * @generated
	 */
	private static FsmPlugin plugin;

	/**
	 * The constructor.
	 *
	 * @generated
	 */
	public FsmPlugin() {
		super();
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 *
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 * @generated
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 *
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 * @generated
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 *
	 * @return the singleton
	 * @generated
	 */
	public static FsmPlugin getDefault() {
		return plugin;
	}

	/**
	 * @return the Plugin Id
	 * @generated
	 */
	public static String getId() {
		return getDefault().getBundle().getSymbolicName();
	}

	/**
	 * Log a message with given level into the Eclipse log file
	 *
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
	 *
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
	 *
	 * @param status the status to log
	 * @generated
	 */
	public static void log(IStatus status) {
		ResourcesPlugin.getPlugin().getLog().log(status);
	}

	/**
	 * Display a dialog box with the specified level
	 * 
	 * @param title title dialog box
	 * @param message message displayed
	 * @param level message level
	 * @generated
	 */
	public static void displayDialog(final String title, final String message, int level) {
		if (level == IStatus.INFO) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					MessageDialog.openInformation(getActiveWorkbenchShell(),
							(title == null) ? "Information" : title,
							(message == null) ? "" : message);
				}
			});
		} else if (level == IStatus.WARNING) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					MessageDialog.openWarning(getActiveWorkbenchShell(),
							(title == null) ? "Warning" : title,
							(message == null) ? "" : message);
				}
			});
		} else if (level == IStatus.ERROR) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					MessageDialog.openError(getActiveWorkbenchShell(),
							(title == null) ? "Error" : title,
							(message == null) ? "" : message);
				}
			});
		}
	}

	/**
	 * Returns the active workbench shell
	 * 
	 * @return the active workbench shell
	 * @generated
	 */
	public static Shell getActiveWorkbenchShell() {
		IWorkbenchWindow workBenchWindow = getActiveWorkbenchWindow();
		if (workBenchWindow == null) {
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
	public static IWorkbenchPage getActivePage() {
		IWorkbenchWindow window = getActiveWorkbenchWindow();
		if (window != null) {
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
	public static IWorkbenchWindow getActiveWorkbenchWindow() {
		if (getDefault() == null) {
			return null;
		}
		IWorkbench workBench = getDefault().getWorkbench();
		if (workBench == null) {
			return null;
		}
		return workBench.getActiveWorkbenchWindow();
	}
}
