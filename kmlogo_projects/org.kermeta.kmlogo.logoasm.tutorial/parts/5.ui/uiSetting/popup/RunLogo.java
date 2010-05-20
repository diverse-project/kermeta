/* $Id: RunLogo.java,v 1.5 2007-12-06 14:48:47 dvojtise Exp $
 * Project   : KmLogo
 * File      : RunLogo.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 14, 2007
 * Authors       : 
 *		Franck Fleurey
 *		Didier Vojtisek
 *		Haja Rambelontsalama
 */
package org.kermeta.kmlogo.logoasm.ui.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.kmlogo.logoasm.ui.RunLogoK;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.ErrorMessage;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.OKMessage;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;

/**
 * The action may take a long time, so the concrete action is embedded in a Runnable Thread
 *
 */
public class RunLogo implements IObjectActionDelegate, Runnable {

	protected StructuredSelection currentSelection;
    protected IFile logoFile;
	
	/**
	 * Constructor for Action1.
	 */
	public RunLogo() {
		super();
	}
	
	public void run() {
		
		IOConsole console = new EclipseConsole("Logo Simulator");
		console.println(new InfoMessage("Launching logo interpreter on file : " + logoFile.getLocation().toOSString() + "..."));
		
		try {			
				
			String file_uri = "file:/" + logoFile.getLocation().toOSString();
		    
			RunLogoK.run(file_uri, console);
			console.println(new OKMessage("Execution terminated successfully."));
			
			
		} catch (Throwable e) {
			console.println(new ErrorMessage("Logo runtime error : "));
			console.println(new ThrowableMessage(e));
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
	 * Create a new thread for this concrete action
	 */
	public void run(IAction action) {
		new Thread(this).start();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 * This allow to retrieve the file selected by the user when activating the popup
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
