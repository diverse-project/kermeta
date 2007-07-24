/* $Id: MigrateAction.java,v 1.2 2007-07-24 13:46:23 ftanguy Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : KmtPrinter.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 18 Jan. 2007
 * Authors : 
 *        	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.migrationv032_v040.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import fr.irisa.triskell.kermeta.migrationv032_v040.tools.wizards.KmtPrinterWizard;

/**
 * 
 * 		Action that will be called from the popup menu for migrating from kmt v0.3.2 to v0.4.0
 * @author dvojtise
 *
 */
public class MigrateAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
    protected IFile kmtfile;
    
	/**
	 * Constructor for Action1.
	 */
	public MigrateAction() {
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
		MessageDialog.openWarning(
			shell,
			"Migrationv032_v040 Plug-in",
			"This wizard will help you to migrate your kmt from 0.3.x to 0.4.0 textual syntax. \n"+
			"However, there are limitations:\n" +
			" - Your program is supposed to work with kermeta v0.3.2.\n" +
			" - text presentation will be lost ( new lines, indentation and simple comments like  //// or //* simple comment *//). \n\n"+
			"If you need more information about the actual changes in the syntax, please look on the web site http://www.kermeta.org/download/migration_changes/");
		KmtPrinterWizard wizard =  new KmtPrinterWizard();
    	wizard.init(PlatformUI.getWorkbench(),currentSelection);
    	WizardDialog wizDialog =  new org.eclipse.jface.wizard.WizardDialog(shell,wizard);
    	wizDialog.setTitle("Migrate this kmt file into kmt file");
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
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				kmtfile = (IFile)it.next();
			}

		}
	}

}
