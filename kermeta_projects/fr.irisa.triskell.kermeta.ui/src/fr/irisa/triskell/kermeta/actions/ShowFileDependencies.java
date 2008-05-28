/*$Id: ShowFileDependencies.java,v 1.4 2008-05-28 09:25:42 ftanguy Exp $
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

import fr.irisa.triskell.kermeta.ui.views.FileDependenciesViewPart;

public class ShowFileDependencies implements IObjectActionDelegate {


	private IFile _file;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		if ( _file != null ) {
			FileDependenciesViewPart.resource = _file;
			try {
				FileDependenciesViewPart view = (FileDependenciesViewPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView( FileDependenciesViewPart.ID );
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().bringToTop(view);
				view.createInput();
			} catch (PartInitException e) {
				e.printStackTrace();
			}
			_file = null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if ( selection instanceof TreeSelection ) {
			TreeSelection treeSelection = (TreeSelection) selection;
			_file = (IFile) treeSelection.getFirstElement();
		}
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
