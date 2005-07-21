/* $Id: KermetaNewFileWizardAction.java,v 1.3 2005-07-21 23:30:45 ffleurey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaNewFileWizardAction.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 26, 2005
 * Authors: 
 * 		zdrey
 * 		dvojtise
 */
package fr.irisa.triskell.kermeta.runner.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import fr.irisa.triskell.kermeta.runner.wizards.KermetaNewFileWizard;

/**
 * This action call the KermetaNewFileWizard
 */
public class KermetaNewFileWizardAction implements
        IWorkbenchWindowActionDelegate {

	IStructuredSelection theSelection;
	IWorkbench theWorkbench;
    /* (non-Javadoc)
     * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#dispose()
     */
    public void dispose() {

    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
     */
    public void init(IWorkbenchWindow window) {

    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
     */
    public void run(IAction action) {
    	Shell shell = new Shell();		
        KermetaNewFileWizard wizard = new KermetaNewFileWizard();
        wizard.init(theWorkbench, theSelection);
        WizardDialog dialog = new WizardDialog(shell, wizard);
        dialog.open();

    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
     */
    public void selectionChanged(IAction action, ISelection selection) {
    	// Quick fix because the cast causes some ClassCastException
    	if (selection instanceof IStructuredSelection)
    		theSelection = (IStructuredSelection)selection;

    }

}
