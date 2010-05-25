/* $Id: $
 * Creation date: Oct, 2008
 * License: EPL
 * Copyright: IRISA/INRIA
 * Authors:
 *		Didier Vojtisek
 */
package org.kermeta.uml2.profile.marte.ui.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
//import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import org.kermeta.uml2.profile.marte.ui.Activator;

public class CheckModelAction implements IObjectActionDelegate {

	@SuppressWarnings("unused")
	private Shell shell;
	
	protected StructuredSelection currentSelection;
    protected IFile fileToCheck;

    protected String checker_kermeta_code = "platform:/plugin/org.kermeta.uml2.profile.marte/wfr/checker/MarteChecker.kmt";
	protected String checker_main_class = "MarteChecker::Main";
	protected String checker_main_operation = "main";
	
	/**
	 * Constructor for Action1.
	 */
	public CheckModelAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		
		InterpretedCheckerJob job = new InterpretedCheckerJob("UML Marte Model checker job", 
					Activator.PLUGIN_ID, 
					checker_kermeta_code, 
					checker_main_class, 
					checker_main_operation, 
					fileToCheck);
		job.schedule();
		/*MessageDialog.openInformation(
			shell,
			"uml.marte.profile Ui Plug-in",
			"check marte constraints was executed.");*/
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.uml file
			currentSelection = (StructuredSelection)selection;
			@SuppressWarnings("unchecked")
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				fileToCheck = (IFile)it.next();
			}

		}
		
	}

}
