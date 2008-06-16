/*$Id: AssignTestCasesToUseCases.java,v 1.9 2008-06-16 13:04:04 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	AssignTestCasesToUseCases.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 nov. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.popup.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.common.KCompilerConstants;
import org.kermeta.compiler.trek.ui.command.AssignTestCasesToUseCasesCommand;


public class AssignTestCasesToUseCases implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected List<IFile> usecasesFiles = new ArrayList<IFile>();
	
	protected List<IFolder> folders = new ArrayList<IFolder>();
	
	
	/**
	 * Constructor for the action: AssignTestCasesToUseCases.
	 */
	public AssignTestCasesToUseCases() {
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
		AssignTestCasesToUseCasesCommand cmd = new AssignTestCasesToUseCasesCommand(usecasesFiles, folders);
		cmd.execute();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		
		usecasesFiles.clear();
		folders.clear();
		if (selection instanceof StructuredSelection) {
			currentSelection = (StructuredSelection) selection;
			
			Iterator it = currentSelection.iterator();

			while (it.hasNext()) {
				Object obj = (Object) it.next();
				if(obj instanceof IFile && ((IFile)obj).getFileExtension().equals(KCompilerConstants.TREK_EXT) ) {
					usecasesFiles.add((IFile) obj);
				}
				if(obj instanceof IFolder) {
					folders.add((IFolder) obj);
				}
			}
		}
		
		if(usecasesFiles.size()>0 && folders.size()>0) {
			action.setEnabled(true);
		} else {
			action.setEnabled(false);
		}
			
	}

}
