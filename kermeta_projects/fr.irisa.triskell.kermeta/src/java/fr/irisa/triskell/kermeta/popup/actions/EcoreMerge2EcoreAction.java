/* $Id: EcoreMerge2EcoreAction.java,v 1.2 2007-08-02 12:26:10 cfaucher Exp $
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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

import fr.irisa.triskell.kermeta.tools.wizards.EcoreMerge2EcoreWizard;

/**
 * This action will generate an ecore file from several ecore files The current
 * version ovewrite the destination
 */
public class EcoreMerge2EcoreAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected List<IFile> ecorefiles = new ArrayList<IFile>();

	/**
	 * Constructor for Kermeta2EcoreAction.
	 */
	public EcoreMerge2EcoreAction() {
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
		/*
		 * MessageDialog.openWarning( shell, "Warning", "This feature has not
		 * been tested, it cannot be considered as stable.\n" + "The ecore file
		 * produced may contain errors.");
		 * 
		 */

		EcoreMerge2EcoreWizard wizard = new EcoreMerge2EcoreWizard();
		wizard.init(PlatformUI.getWorkbench(), currentSelection);
		WizardDialog wizDialog = new org.eclipse.jface.wizard.WizardDialog(
				shell, wizard);
		wizDialog.setTitle("Merge these ecore files into an ecore file");
		wizDialog.open();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			// the selection should be less 2 ecore files
			currentSelection = (StructuredSelection) selection;
			ecorefiles.clear();
			@SuppressWarnings("unchecked")
			Iterator it = currentSelection.iterator();

			while (it.hasNext()) {
				ecorefiles.add((IFile) it.next());
			}
		}
	}
}
