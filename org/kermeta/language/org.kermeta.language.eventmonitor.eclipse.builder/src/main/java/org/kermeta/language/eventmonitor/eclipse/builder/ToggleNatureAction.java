/*$Id $
* Project : org.kermeta.language.eventmonitor.eclipse.builder
* File : 	ToggleNatureAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : 20 juil. 2010
* Authors :  Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
*/
package org.kermeta.language.eventmonitor.eclipse.builder;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.language.api.kevent.KEvent;
import org.kermeta.language.api.kevent.KEventFactory;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.eventmonitor.eclipse.builder.art2.impl.Art2ComponentEventMonitorEclipseBuilder;

public class ToggleNatureAction implements IObjectActionDelegate {

	private ISelection selection;
	
	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
	protected KEventFactory evtFactory = KEventFactory.getInstance();
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		Art2ComponentEventMonitorEclipseBuilder.getDefault().getLogPort().process(
				mFactory.createDebugMessage("popupMenu Add/Remove nature triggered" , Art2ComponentEventMonitorEclipseBuilder.getDefault().getBundleSymbolicName()));
		if (selection instanceof IStructuredSelection) {
			for (Iterator it = ((IStructuredSelection) selection).iterator(); it
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
	private void toggleNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			Art2ComponentEventMonitorEclipseBuilder.getDefault().getLogPort().process(
					mFactory.createDebugMessage("Nbr of Natures found on " +project.getDescription() + " : " + natures.length , Art2ComponentEventMonitorEclipseBuilder.getDefault().getBundleSymbolicName()));
			for (int i = 0; i < natures.length; ++i) {
				if (KermetaNature.NATURE_ID.equals(natures[i])) {
					Art2ComponentEventMonitorEclipseBuilder.getDefault().getLogPort().process(
							mFactory.createDebugMessage("Nature add at : " + project.getDescription().toString() + "an event should be triggered" , Art2ComponentEventMonitorEclipseBuilder.getDefault().getBundleSymbolicName()));
					// Remove the nature
					String[] newNatures = new String[natures.length - 1];
					System.arraycopy(natures, 0, newNatures, 0, i);
					System.arraycopy(natures, i + 1, newNatures, i,
							natures.length - i - 1);
					description.setNatureIds(newNatures);
					project.setDescription(description, null);
					return;
				}
			}

			Art2ComponentEventMonitorEclipseBuilder.getDefault().getLogPort().process(
					mFactory.createInfoMessage("Add Kermeta Nature to project : " + project.getName() + "an event should be triggered" , Art2ComponentEventMonitorEclipseBuilder.getDefault().getBundleSymbolicName()));
			KEvent e = evtFactory.createSimpleEvent(project.getName());
			Art2ComponentEventMonitorEclipseBuilder.getDefault().processKEvent(e);
			// Add the nature
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = KermetaNature.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		} catch (CoreException e) {
			Art2ComponentEventMonitorEclipseBuilder.getDefault().getLogPort().process(
					mFactory.createErrorMessage("Exception : " + e , Art2ComponentEventMonitorEclipseBuilder.getDefault().getBundleSymbolicName()));
		}
	}

}
