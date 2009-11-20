/*$Id: ToggleNatureAction.java,v 1.6 2008-05-28 09:25:42 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.kpm.internal.builder.KpmProjectBuilder;

import fr.irisa.triskell.eclipse.resources.NatureHelper;
import fr.irisa.triskell.eclipse.resources.ProjectBuilderHelper;
import fr.irisa.triskell.kermeta.resources.KermetaNature;

public class ToggleNatureAction implements IObjectActionDelegate {

	private ISelection selection;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it
					.hasNext();) {
				Object element = it.next();
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element)
							.getAdapter(IProject.class);
				}
				if (project != null) {
					toggleNature(project);
				}
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
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction,
	 *      org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * Toggles sample nature on a project
	 * 
	 * @param project
	 *            to have sample nature added or removed
	 */
	private void toggleNature(final IProject project) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRunnable operation = new IWorkspaceRunnable() {
		     
			
			public void run(IProgressMonitor monitor) throws CoreException {

				if ( ! project.hasNature(KermetaNature.ID) ) {
					NatureHelper.addNatureToProject(project, KermetaNature.ID);
					ProjectBuilderHelper.addBuilderToProject(project, KpmProjectBuilder.ID);
			    	/*KPMResourceVisitor visitor = new KPMResourceVisitor(kermetaProject);
			    	project.accept(visitor);
			    	kermetaProject.save();*/
			    } else {
					NatureHelper.removeNatureFromProject(project, KermetaNature.ID);
					ProjectBuilderHelper.removeBuilderFromProject(project, KpmProjectBuilder.ID);
				}

		      }
		   };
		   
		   
	  		try {
		   workspace.run(operation, null);
		
		} catch (CoreException e) {
		}		
		
		
		
		

	}

}
