/* $Id: Ecore2KermetaAction.java,v 1.4 2006-11-06 15:02:53 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : Ecore2kmtAction.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 20 juil. 2005
 * Authors : 
 * 		  ffleurey 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        action that launch a pretty print of ecore files into kmt files 
 */
package fr.irisa.triskell.kermeta.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import fr.irisa.triskell.kermeta.tools.wizards.Ecore2kmtWizard;

public class Ecore2KermetaAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
    protected IFile ecorefile;
    
	/**
	 * Constructor for Ecore2KermetaAction.
	 */
	public Ecore2KermetaAction() {
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
				+ "The kermeta file produced may contain errors.");
	       */ 
    	Ecore2kmtWizard wizard =  new Ecore2kmtWizard();
    	wizard.init(PlatformUI.getWorkbench(),currentSelection);
    	WizardDialog wizDialog =  new org.eclipse.jface.wizard.WizardDialog(shell,wizard);
    	wizDialog.setTitle("PrettyPrint this ecore file into kmt file");
    	wizDialog.open();
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
				ecorefile = (IFile)it.next();
			}

		}
	}
}
