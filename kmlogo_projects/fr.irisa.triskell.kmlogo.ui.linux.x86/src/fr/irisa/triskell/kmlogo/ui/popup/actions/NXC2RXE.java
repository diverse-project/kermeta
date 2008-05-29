/**
 * Copyright : IRISA / INRIA Rennes Bretagne Atlantique - OpenEmbeDD integration team
 * 
 * This plug-in is under the terms of the EPL License. http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 * @author Vincent Mahe
 */
package fr.irisa.triskell.kmlogo.ui.popup.actions;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.openembedd.launchexec.Console;
import org.openembedd.launchexec.ExecCommand;
import org.openembedd.launchexec.Plugin;

/**
 * This Action calls the Lego NBC compiler native executable for Linux.
 * It runs on each selected file. It translates the Lego NXC (Not eXactly C)
 * <input>.nxc file into the Lego assembly language <output>.rxe file.
 */
public class NXC2RXE implements IObjectActionDelegate
{
	/** The file selection */
	private StructuredSelection	selection;
	
	private final String PLUGIN_ID = "fr.irisa.triskell.kmlogo.ui.linux.x86";

	/**
	 * Constructor
	 */
	public NXC2RXE()
	{
		super();
		this.selection = null;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart)
	{}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action)
	{
		Console console = new Console("NBC console");

		String[] cmd = new String[3];

		try
		{
			URL binaryURL = Platform.getBundle(PLUGIN_ID).getEntry("/lib/nxt/nbc");
			if (binaryURL != null)
			{
				// Localize the binary file on the file system
				// Get the absolute path to the resource
				String binaryPath = FileLocator.toFileURL(binaryURL).getPath();
				
				// Execute the chmod command on the binary
				// This is a trick to add the execution bit
				cmd[0] = "chmod";
				cmd[1] = "a+x";
				cmd[2] = new File(binaryPath).getAbsolutePath();
				
				// Execute the chmod command and print the result in the console
				ExecCommand command = new ExecCommand(console, cmd);
				command.execute();
				
				// Apply the binary on each selected file
				cmd[0] = cmd[2];
				for (Iterator<?> it = selection.iterator(); it.hasNext();)
				{
					Object obj = (Object) it.next();
					if (obj instanceof IFile)
					{
						IFile file = (IFile) obj;

						// Add the path to the input file as second argument
						cmd[1] = file.getLocation().toOSString();
						// and the path to the output file (localized in the same directory)
						cmd[2] = "-O=" + file.getLocation().removeFileExtension().addFileExtension("rxe").toOSString();

						// Execute the binary command and print the result in the console
						command = new ExecCommand(console, cmd);
						command.execute();

						// Refresh the directory
						try
						{
							file.getParent().refreshLocal(1, null);
						}
						catch (CoreException ce)
						{
							Plugin.getDefault().getLog().log(
								new Status(IStatus.ERROR, Plugin.PLUGIN_ID, 0, "Refreshing error.", ce));
						}
					}
				}
			}
			else
				Plugin.getDefault().getLog().log(
					new Status(IStatus.ERROR, Plugin.PLUGIN_ID, "Cannot find the NBC native utilities."));
		}
		catch (IOException ioe)
		{
			Plugin.getDefault().getLog().log(
				new Status(IStatus.ERROR, Plugin.PLUGIN_ID, 0,
					"An I/O Exception has been thrown during the search of the executable.", ioe));
		}

		// Close the console output stream
		console.dispose();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection)
	{
		if (selection instanceof StructuredSelection)
		{
			this.selection = (StructuredSelection) selection;
		}
	}

}
