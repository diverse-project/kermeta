/* $Id: RunLogo.java,v 1.5 2007/12/06 14:48:47 dvojtise Exp $
 * License   : EPL
 * Copyright : IRISA / INRIA 
 * ----------------------------------------------------------------------------
 * Authors       : 
 *		Didier Vojtisek
 */
package org.kermeta.art.runtime2sca.ui.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
//import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
//import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import runtime2SCA.runner.Main__mainWithParameter__Runner;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.ErrorMessage;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.OKMessage;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;


public class Runtime2SCAAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
    protected IFile inputFile;
    
	// private Shell shell;
	
	/**
	 * Constructor for Action1.
	 */
	public Runtime2SCAAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	//	shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IOConsole console = new EclipseConsole("Runtime2SCA");
		console.println(new InfoMessage("Creating SCA model for : " + inputFile.getLocation().toOSString() + "..."));
		
		try {			
			IFile out_file = inputFile.getWorkspace().getRoot().getFile(
					inputFile.getFullPath().removeFileExtension().addFileExtension("composite"));
			String file_uri = "file:/" + inputFile.getLocation().toOSString();
			String out = out_file.getLocation().toOSString();

			// if you have an error here, maybe you need to export the package from the compiled version
			String[] params = {file_uri,out};
			Main__mainWithParameter__Runner.main_forDeployedVersion(params);
			console.println(new OKMessage("done."));
			
			
		} catch (Throwable e) {
			console.println(new ErrorMessage("Runtime2SCA error : "));
			console.println(new ThrowableMessage(e));
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single  file
			currentSelection = (StructuredSelection)selection;
			@SuppressWarnings("unchecked")
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				inputFile = (IFile)it.next();
			}
		}
	}

}
