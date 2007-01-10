/**
 * 
 */
package fr.irisa.triskell.kermeta.core.natures;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author ftanguy
 *
 */
public class KermetaNatureHelper {

	static public void addKermetaNature(final IProject project) throws CoreException {
		IWorkspaceRunnable operation = new IWorkspaceRunnable() {
		      public void run(IProgressMonitor monitor) throws CoreException {
		    	  if ( ! isNatureKermeta(project) ) {
		    		  IProjectDescription description = project.getDescription();
		    		  description.setNatureIds( new String[] {KermetaNature.ID} );
		    		  project.setDescription(description, null);
		    	  }
		      }
		};
		ResourcesPlugin.getWorkspace().run(operation, null);
	}
	
	static private boolean isNatureKermeta(IProject project) throws CoreException {
		// To get the project description, it must be opened
		if ( ! project.isOpen() ) 
			return false;
		return project.getDescription().hasNature( KermetaNature.ID );
	}
	
	/**
	 * 
	 * @return
	 * @throws CoreException
	 */
	static public Set<IProject> getKermetaProjects() throws CoreException {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		HashSet <IProject> kermetaProjects = new HashSet <IProject> ();
		for (int i = 0; i < projects.length; i++) {
			if ( isNatureKermeta(projects[i]) )
				kermetaProjects.add(projects[i]);
		}
		return kermetaProjects;
	}
}
