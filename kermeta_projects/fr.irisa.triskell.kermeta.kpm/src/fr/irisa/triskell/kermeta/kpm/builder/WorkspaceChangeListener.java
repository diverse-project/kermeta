/*$Id: WorkspaceChangeListener.java,v 1.6 2008-03-05 08:09:54 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.builder;

import java.util.ArrayList;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.runtime.CoreException;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;

/**
 * 
 * This listener handles any changes in the workspace. 
 * Changes can be :
 * 		- a resource creation
 * 		- a resource deletion
 * 		- a resource change
 * 
 * Those changes are taken into account by WorkspaceDeltaVisitor class that will a list of
 * events to dispatch on units.
 * 
 * @author paco
 *
 */
public class WorkspaceChangeListener implements IResourceChangeListener {

	public void resourceChanged(IResourceChangeEvent event) {

		ArrayList<KermetaProject> projectsToOpen = new ArrayList<KermetaProject> ();	
		
		WorkspaceDeltaVisitor visitor = new WorkspaceDeltaVisitor(projectsToOpen);
		try {
			/*
			 * 
			 * Visiting the changes.
			 * 
			 */
			if ( event.getDelta() != null )
				event.getDelta().accept(visitor);

			/*
			 * 
			 * Some project may have to be opened.
			 * 
			 */
			for ( KermetaProject project : projectsToOpen )
				project.open();

			/*
			 * 
			 * Send for real the events.
			 * 
			 */
			visitor.dispatchEvents();
			
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}
}
