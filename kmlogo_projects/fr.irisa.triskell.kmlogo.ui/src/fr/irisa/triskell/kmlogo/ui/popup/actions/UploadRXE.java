/* $Id: UploadRXE.java,v 1.6 2008-06-03 14:12:46 vmahe Exp $
 * Project   : KmLogo
 * File      : UploadRXE.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 14, 2007
 * Authors       : 
 *		Franck Fleurey
 *		Didier Vojtisek
 */
package fr.irisa.triskell.kmlogo.ui.popup.actions;



import icommand.nxt.FileSystem;
import icommand.nxt.comm.NXTCommand;

import java.io.File;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.eclipse.console.messages.ErrorMessage;
import fr.irisa.triskell.eclipse.console.messages.InfoMessage;
import fr.irisa.triskell.eclipse.console.messages.OKMessage;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;


public class UploadRXE implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
    protected IFile nxcFile;
	
	/**
	 * Constructor for Action1.
	 */
	public UploadRXE() {
		super();
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

		IOConsole console = new EclipseConsole("Logo uploadRXE");
		console.println(new InfoMessage("Uploading File " +  nxcFile.getLocation().toOSString()));
    	
    	 try {
    		 NXTCommand.open();
    		 
    		 File nxcToUpload = new File(nxcFile.getLocation().toOSString());
    		 FileSystem.upload(nxcToUpload);
    		 
    		 NXTCommand.close();
    		 
    		 console.println(new OKMessage("File Uploaded"));
    		 
    	 } catch(Throwable e) {
    		 console.println(new ErrorMessage("ERROR : " ));
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
			// the selection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				nxcFile = (IFile)it.next();
			}

		}
	}

}
