/* $Id: Kermeta2EcoreAction.java,v 1.7 2006-11-06 15:02:53 dvojtise Exp $
 * Project : Kermeta
 * File : Kermeta2EcoreAction.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 8 juil. 2005
 * Authors : 
 * 		Didier Vojtisek	<dvojtise@irisa.fr>
 * Description :  	
 * 	see class javadoc.	
 * History :
 */
package fr.irisa.triskell.kermeta.popup.actions;


import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
//import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import fr.irisa.triskell.kermeta.tools.wizards.Kermeta2EcoreWizard;

/**
 * This action will generate an ecore file from a kermeta file
 * The Ecore will have the body of the opetation as annotations 
 * The current version ovewrite the destination
 */
public class Kermeta2EcoreAction implements IObjectActionDelegate {
		
	protected StructuredSelection currentSelection;
	protected IFile kmtfile;
	    
	/**
	 * Constructor for Kermeta2EcoreAction.
	 */
	public Kermeta2EcoreAction() {
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
		Shell shell = new Shell();
	    /*MessageDialog.openWarning(
				shell,
				"Warning",
				"This feature has not been tested, it cannot be considered as stable.\n"
				+ "The ecore file produced may contain errors.");
	    */
	    // determine weither this is a km or another format
	    boolean isKM =(kmtfile.getFileExtension().compareTo("km") == 0);
	    
    	Kermeta2EcoreWizard wizard =  new Kermeta2EcoreWizard(isKM);
    	wizard.init(PlatformUI.getWorkbench(),currentSelection);
    	WizardDialog wizDialog =  new org.eclipse.jface.wizard.WizardDialog(shell,wizard);
    	wizDialog.setTitle("Exports this kmt file into an ecore file");
    	wizDialog.open();		   
	}
	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.kmt (or a *.km ?) file
			currentSelection = (StructuredSelection)selection;
			@SuppressWarnings("unchecked")
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				kmtfile = (IFile)it.next();
			}
		}
	}
}
