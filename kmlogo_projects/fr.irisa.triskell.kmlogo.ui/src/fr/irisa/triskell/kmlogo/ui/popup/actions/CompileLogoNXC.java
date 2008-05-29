/* $Id: CompileLogoNXC.java,v 1.5 2008-05-29 12:09:30 vmahe Exp $
 * Project   : KmLogo
 * File      : CompileLogoNXC.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 14, 2007
 * Authors       : 
 *		Franck Fleurey
 *		Didier Vojtisek
 */
package fr.irisa.triskell.kmlogo.ui.popup.actions;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.ErrorMessage;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.OKMessage;
import fr.irisa.triskell.kmlogo.ui.CompileNXCLogoK;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class CompileLogoNXC implements IObjectActionDelegate, Runnable {

	protected StructuredSelection currentSelection;
    protected IFile logoFile;
	
	/**
	 * Constructor for Action1.
	 */
	public CompileLogoNXC() {
		super();
	}
	
	public void run() {
		IOConsole console = new EclipseConsole("Logo2NXC compiler");
		console.println(new InfoMessage("Compiling model : " + logoFile.getLocation().toOSString() + "..."));
		
		try {			
			IFile out_file = logoFile.getWorkspace().getRoot().getFile(logoFile.getFullPath().removeFileExtension().addFileExtension("nxc"));
			String file_uri = "file:/" + logoFile.getLocation().toOSString();
			String out = out_file.getLocation().toOSString();

			CompileNXCLogoK.run(file_uri, out, console);
			
			out_file.refreshLocal(IResource.DEPTH_ONE, null);
			
			console.println(new OKMessage("Model compiled successfully."));
			
		} catch (Exception e) {
			console.println(new ErrorMessage("Error : " +  e.getMessage()));
			e.printStackTrace();
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		new Thread(this).start();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			Iterator<IFile> it = currentSelection.iterator();

			while(it.hasNext()) {
				logoFile = it.next();
			}

		}
		
	}

}
