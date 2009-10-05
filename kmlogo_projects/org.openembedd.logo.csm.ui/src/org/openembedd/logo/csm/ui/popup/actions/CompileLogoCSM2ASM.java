/**
 * Copyright : IRISA / INRIA Rennes Bretagne Atlantique - OpenEmbeDD integration team
 * 
 * This plug-in is under the terms of the EPL License. http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Vincent Mahe
 */
package org.openembedd.logo.csm.ui.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.openembedd.logo.csm.ui.CompileLogoCSM2ASMWrapper;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.ErrorMessage;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.OKMessage;

public class CompileLogoCSM2ASM implements IObjectActionDelegate, Runnable
{

	protected StructuredSelection	currentSelection;
	protected IFile					csmFile;

	/**
	 * Constructor for the action.
	 */
	public CompileLogoCSM2ASM()
	{
		super();
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart)
	{}

	public void run(IAction action)
	{
		new Thread(this).start();
	}

	public void selectionChanged(IAction action, ISelection selection)
	{
		if (selection instanceof StructuredSelection)
		{
			currentSelection = (StructuredSelection) selection;
			Iterator<IFile> it = currentSelection.iterator();

			while (it.hasNext())
			{
				csmFile = it.next();
			}
		}
	}

	public void run()
	{
		// create a new Kermeta console for the execution
		IOConsole console = new EclipseConsole("LogoCSM 2 ASM Compiler");
		console.println(new InfoMessage("Compiling CSM model: " + csmFile.getFullPath().removeFileExtension()));

		try
		{
			// output model file
			IFile asmFile = csmFile.getWorkspace().getRoot().getFile(
				csmFile.getFullPath().removeFileExtension().addFileExtension("asmlogo"));

			String asmFileUri = "file:/" + asmFile.getLocation().toOSString();

			// input model file
			String csmFileUri = "file:/" + csmFile.getLocation().toOSString();

			CompileLogoCSM2ASMWrapper.run(csmFileUri, asmFileUri, console);

			asmFile.refreshLocal(IResource.DEPTH_ONE, null);

			console.println(new OKMessage("CSM model compiled to ASM successfully"));

		}
		catch (Exception e)
		{
			console.println(new ErrorMessage("Error: " + e.getMessage()));
		}
	}

}
