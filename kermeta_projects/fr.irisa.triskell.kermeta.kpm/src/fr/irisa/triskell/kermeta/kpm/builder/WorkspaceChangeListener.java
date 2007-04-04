package fr.irisa.triskell.kermeta.kpm.builder;

import java.util.ArrayList;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;

public class WorkspaceChangeListener implements IResourceChangeListener {

	public void resourceChanged(IResourceChangeEvent event) {

		ArrayList<KermetaProject> projectsToOpen = new ArrayList<KermetaProject> ();
		
		WorkspaceDeltaVisitor visitor = new WorkspaceDeltaVisitor(projectsToOpen);
		try {
			if ( event.getDelta() != null )
				event.getDelta().accept(visitor);
			if ( projectsToOpen.size() != 0 ) {
				for ( KermetaProject project : projectsToOpen )
					project.open();
					//project.getProjectUnit().receiveAsynchroneEvent("open", null);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
