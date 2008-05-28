

/*$Id: ResourceChangeListener.java,v 1.1 2008-05-28 09:26:15 ftanguy Exp $
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
			final IResourceDelta d = delta;
			WorkspaceJob job = new WorkspaceJob("Blah") {
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
					if ( d.getKind() == IResourceDelta.ADDED ) {
						ProjectVisitor v = new ProjectVisitor();
						d.getResource().accept(v);						
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


