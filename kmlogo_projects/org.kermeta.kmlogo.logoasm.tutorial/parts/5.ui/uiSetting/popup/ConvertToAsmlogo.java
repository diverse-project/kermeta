package org.kermeta.kmlogo.logoasm.ui.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.kmlogo.logoasm.ui.ConvertToAsmlogoK;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.OKMessage;
//import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class ConvertToAsmlogo implements IObjectActionDelegate {

	private Shell shell;
	protected StructuredSelection currentSelection;
	protected IFile logoFile;
	
	
	/**
	 * Constructor for Action1.
	 */
	public ConvertToAsmlogo() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IOConsole console = new EclipseConsole("Logo Converter");
		console.println(new InfoMessage("Launching logo converter on file : " + logoFile.getLocation().toOSString() + "..."));
		String file_uri = "file:/" + logoFile.getLocation().toOSString();
		ConvertToAsmlogoK.run(file_uri, console);
		MessageDialog.openInformation(
			shell,
			"Logo",
			"Conversion succesful. Check your workspace for converted file *.logoasm");
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//project.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		console.println(new OKMessage("Execution terminated successfully."));
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			@SuppressWarnings("unchecked")
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				logoFile = (IFile)it.next();
			}

		}
		
	
	}

}
