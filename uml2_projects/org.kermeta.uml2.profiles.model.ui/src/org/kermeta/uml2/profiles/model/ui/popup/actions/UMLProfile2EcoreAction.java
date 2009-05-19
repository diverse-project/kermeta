/* $Id:$ 
 * License : EPL
 * Copyright : IRISA/INRIA
 * Authors :
 * 				Didier Vojtisek
 */
package org.kermeta.uml2.profiles.model.ui.popup.actions;

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
import org.kermeta.uml2.profiles.model.ui.wizards.UMLProfile2EcoreWizard;

public class UMLProfile2EcoreAction implements IObjectActionDelegate {

	
	protected StructuredSelection currentSelection;
    protected IFile inputFile;
    
	/**
	 * Constructor for Action1.
	 */
	public UMLProfile2EcoreAction() {
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
		UMLProfile2EcoreWizard wizard =  new UMLProfile2EcoreWizard();
    	wizard.init(PlatformUI.getWorkbench(), currentSelection);
    	WizardDialog wizDialog =  new org.eclipse.jface.wizard.WizardDialog(shell, wizard);
    	wizDialog.setTitle("Export this model to textual file");
    	wizDialog.open();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			// The selection should be a single  file
			currentSelection = (StructuredSelection) selection;
			@SuppressWarnings("unchecked")
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				inputFile = (IFile)it.next();
			}
		}
	}

}
