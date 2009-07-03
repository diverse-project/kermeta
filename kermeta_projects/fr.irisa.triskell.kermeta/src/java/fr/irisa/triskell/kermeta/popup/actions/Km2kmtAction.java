/* $Id: Km2kmtAction.java,v 1.3 2006-11-06 15:02:53 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : Km2kmtAction.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 20 juil. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        action that launch a pretty print of km files into kmt files 
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
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import fr.irisa.triskell.kermeta.tools.wizards.KmtPrinterWizard;

/**
 * action that launch a pretty print of km files into kmt files 
 */
public class Km2kmtAction implements IObjectActionDelegate {
	protected IFile kmfile;
	protected StructuredSelection currentSelection;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// nothing special to do here
		

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		Shell shell = new Shell();
	    /*MessageDialog.openWarning(
				shell,
				"Warning",
				"This feature has not been tested, it cannot be considered as stable.\n"
				+ "The kermeta file produced may contain errors.");
	        */
    	KmtPrinterWizard wizard =  new KmtPrinterWizard();
    	wizard.init(PlatformUI.getWorkbench(),currentSelection);
    	WizardDialog wizDialog =  new org.eclipse.jface.wizard.WizardDialog(shell,wizard);
    	wizDialog.setTitle("PrettyPrint this km file into kmt file");
    	wizDialog.open();
        	

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.km file
			currentSelection = (StructuredSelection)selection;
			@SuppressWarnings("unchecked")
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				kmfile = (IFile)it.next();
			}
		}
	}

}
