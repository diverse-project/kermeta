

/*$Id: ResourceChangeListener.java,v 1.2 2008-06-02 06:45:22 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	ResourceChangeListener.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal.builder;

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
			event.getDelta().accept(this);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public boolean visit(IResourceDelta delta) throws CoreException {
		boolean goOn = true;
		switch( delta.getResource().getType() ) {
		case IResource.PROJECT :
			// This can be an heavy process, so we do it into a job.
			final IResourceDelta d = delta;
			WorkspaceJob job = new WorkspaceJob("Blah") {
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
					if ( d.getKind() == IResourceDelta.ADDED ) {
						ProjectVisitor v = new ProjectVisitor();
						d.getResource().accept(v);						
					} else if ( d.getKind() == IResourceDelta.REMOVED ) {
						DeltaVisitor v = new DeltaVisitor(InternalKpmManager.getDefault().getKpm(), monitor);
						d.accept(v);
					}
					return Status.OK_STATUS;
				}
			};
			job.schedule();
			goOn = false;
			break;
			
		default :
			break;
		}
		return goOn;
	}

}


