/*$Id: Ecore2KmAction.java,v 1.1 2007-01-11 17:02:02 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta
* File : 	Ecore2KmAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 janv. 07
* Authors : cfaucher
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

import fr.irisa.triskell.kermeta.tools.wizards.UnitExporterWizard;

public class Ecore2KmAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
    protected IFile ecorefile;
    
	/**
	 * Constructor for Ecore2KmAction.
	 */
	public Ecore2KmAction() {
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
	   
    	UnitExporterWizard wizard =  new UnitExporterWizard();
    	wizard.defaultOutputExtension = "km";
    	wizard.init(PlatformUI.getWorkbench(),currentSelection);
    	WizardDialog wizDialog =  new org.eclipse.jface.wizard.WizardDialog(shell,wizard);
    	wizDialog.setTitle("Compile the ecore file into a typechecked xmi file");
    	wizDialog.open();
	}

    /**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the se=lection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			@SuppressWarnings("unchecked")
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				ecorefile = (IFile)it.next();
			}
		}
	}

}
