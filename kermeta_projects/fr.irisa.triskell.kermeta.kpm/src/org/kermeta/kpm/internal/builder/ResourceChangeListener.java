

/*$Id: ResourceChangeListener.java,v 1.5 2008-06-03 07:43:58 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	ResourceChangeListener.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.kermeta.kpm.internal.InternalKpmManager;

/**
 * This class is used to handle project create/deletion only.
 * Its responsibilities is to add/remove the necessary unit to the kpm model.
 * 
 * @author paco
 *
 */
public class ResourceChangeListener implements IResourceChangeListener, IResourceDeltaVisitor {

	public void resourceChanged(IResourceChangeEvent event) {
		try {
			// Visiting the delta.
			event.getDelta().accept(this);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public boolean visit(IResourceDelta delta) throws CoreException {
		// Flag stating whether to continue the visit or not.
		boolean goOn = true;
		
		switch( delta.getResource().getType() ) {
		
		// Only handling project changes.
		case IResource.PROJECT :
			// This can be an heavy process, so we do it into a job.
			handleProject(delta);
			break;

		case IResource.FILE :
			handleFile( (IFile) delta.getResource() );
			goOn = false;
			break;
			
		case IResource.FOLDER :
			goOn = false;
			break;
			
		default :
			break;
		}
		return goOn;
	}
	
	/**
	 * Add or remove units coming from a project.
	 * @param delta
	 */
	private void handleProject(final IResourceDelta delta) {
		WorkspaceJob job = new WorkspaceJob("KPM inspecting changes of " + delta.getResource().getName()) {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				if ( delta.getKind() == IResourceDelta.ADDED ) {
					// Project addition, let's add a builder to it.
					ProjectVisitor v = new ProjectVisitor();
					delta.getResource().accept(v);						
				} else if ( delta.getKind() == IResourceDelta.REMOVED ) {
					// Project deletion, let's remove any units coming from that project.
					DeltaVisitor v = new DeltaVisitor(InternalKpmManager.getDefault().getKpm(), monitor);
					delta.accept(v);
				} 
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}
	
	/**
	 * When the .project file is modified, we cannot be sure that the KPM builder is still present.
	 * So to be sure, we call the ProjectVisitor to add a new builder if necessary.
	 * @param file
	 * @throws CoreException 
	 */
	private void handleFile(final IFile file) throws CoreException {
		if ( file.getFileExtension().equals("project") ) {
			// Do it in a job because it will provoke a change in the workspace.
			WorkspaceJob job = new WorkspaceJob("Add KPM builder to " + file.getProject().getFullPath().toString()) {
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
					ProjectVisitor v = new ProjectVisitor();
					file.getProject().accept(v);
					return Status.OK_STATUS;
				}
			};
			job.schedule();
		}
	}

}


