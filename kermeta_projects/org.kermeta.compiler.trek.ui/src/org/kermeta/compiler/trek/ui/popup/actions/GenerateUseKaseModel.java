/*$Id: GenerateUseKaseModel.java,v 1.3 2008-06-16 13:05:38 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	GenerateUseKaseModel.java
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
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.common.KCompilerConstants;
import org.kermeta.compiler.trek.ui.command.AssignTestCasesToUseCasesCommand;


public class GenerateUseKaseModel implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected List<IFolder> folders = new ArrayList<IFolder>();
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateUseKaseModel() {
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
		InitializeUseCasesModel.initializeTrekFiles(folders);
		
		List<IFile> usecasesFiles = new ArrayList<IFile>();
		List<IFolder> subFolders = new ArrayList<IFolder>();
		for(IFolder folder : folders) {
			try {				
				for(IResource subResource : folder.members(false) ) {
					// populate the subfolders list
					if(subResource instanceof IFolder) {
						subFolders.add((IFolder) subResource);
					}
					// populate the list of trek files containing the definition of use cases
					if(subResource instanceof IFile) {
						if(((IFile) subResource).getFileExtension().equals(KCompilerConstants.TREK_EXT)) {
							usecasesFiles.add((IFile) subResource);
						}
					}
				}
				InitializeTestCasesModel.initializeTrekFiles(subFolders);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		AssignTestCasesToUseCasesCommand cmd = new AssignTestCasesToUseCasesCommand(usecasesFiles, subFolders);
		cmd.execute();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			currentSelection = (StructuredSelection) selection;
			folders.clear();
			Iterator it = currentSelection.iterator();

			while (it.hasNext()) {
				Object obj = (Object) it.next();
				if(obj instanceof IFolder) {
					folders.add((IFolder) obj);
				}
			}
		}
	}

}
