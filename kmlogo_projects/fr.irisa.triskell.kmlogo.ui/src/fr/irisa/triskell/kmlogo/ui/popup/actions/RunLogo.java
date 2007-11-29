/* $Id: RunLogo.java,v 1.3 2007-11-29 16:31:48 dvojtise Exp $
 * Project   : KmLogo
 * File      : RunLogo.java
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
import fr.irisa.triskell.eclipse.console.messages.ConsoleMessage;
import fr.irisa.triskell.kmlogo.ui.RunLogoK;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

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
		console.println(new ConsoleMessage("Launching logo interpreter on file : " + logoFile.getLocation().toOSString() + "...", EclipseConsole.INFO));
		
		try {			
				
			String file_uri = "file:/" + logoFile.getLocation().toOSString();

			try {
				RunLogoK.run(file_uri, console);
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			console.println(new ConsoleMessage("Execution terminated successfully.", EclipseConsole.OK));
			
		} catch (Exception e) {
			console.println(new ConsoleMessage("Logo runtime error : " +  e.getMessage(), EclipseConsole.ERROR));
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
			// the se=lection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				logoFile = (IFile)it.next();
			}

		}
		
	}

}
