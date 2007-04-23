/*$Id: ShowDependentFiles.java,v 1.3 2007-04-23 11:58:54 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.ui.views.DependentFilesViewPart;

public class ShowDependentFiles implements IObjectActionDelegate {


	private ISelection selection;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		
		if ( selection instanceof TreeSelection ) {
			
			TreeSelection treeSelection = (TreeSelection) selection;
			IFile file = (IFile) treeSelection.getFirstElement();
			DependentFilesViewPart.resource = file;
			try {
				//FileDependenciesViewPart view = (FileDependenciesViewPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView( DependentFilesViewPart.ID );
				DependentFilesViewPart view = (DependentFilesViewPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView( DependentFilesViewPart.ID );
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().bringToTop(view);
				view.createInput();
			} catch (PartInitException e) {
				e.printStackTrace();
			}
			
		}
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
		if ( selection instanceof TreeSelection ) {
			
			TreeSelection treeSelection = (TreeSelection) selection;
			IFile file = (IFile) treeSelection.getFirstElement();
			KermetaProject project = KermetaWorkspace.getInstance().getKermetaProject( file.getProject() );
			if ( project == null )
				action.setEnabled(false);
			else
				action.setEnabled(true);
			
		} else
			action.setEnabled(false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction,
	 *      org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

}
