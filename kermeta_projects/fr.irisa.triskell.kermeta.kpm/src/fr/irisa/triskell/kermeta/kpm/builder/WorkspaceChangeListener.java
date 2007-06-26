/*$Id: WorkspaceChangeListener.java,v 1.4 2007-06-26 12:29:04 ftanguy Exp $
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
import org.eclipse.core.runtime.NullProgressMonitor;

import fr.irisa.triskell.kermeta.extension.Interest;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;

public class WorkspaceChangeListener implements IResourceChangeListener {

	public void resourceChanged(IResourceChangeEvent event) {

		ArrayList<KermetaProject> projectsToOpen = new ArrayList<KermetaProject> ();	
		
		WorkspaceDeltaVisitor visitor = new WorkspaceDeltaVisitor(projectsToOpen);
		try {
			if ( event.getDelta() != null )
				event.getDelta().accept(visitor);

			for ( KermetaProject project : projectsToOpen )
				project.open();

			visitor.dispatchEvents();
			
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}
}
