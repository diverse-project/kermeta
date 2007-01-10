/**
 * 
 */
package fr.irisa.triskell.kermeta.core.resources;

import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.kermeta.core.natures.KermetaNatureHelper;

/**
 * @author ftanguy
 *
 */
public class KermetaResourcesHelper {

	static public void createKermetaProject(String projectName) throws CoreException {
		final IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
		 //description.setLocation( Platform.getLocation() );
		description.setLocation( null );

		 final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		 IWorkspaceRunnable operation = new IWorkspaceRunnable() {
			 public void run(IProgressMonitor monitor) throws CoreException {
				 project.create(description, monitor);
				 project.open(monitor);
				 KermetaNatureHelper.addKermetaNature(project);
			 }
		};
		ResourcesPlugin.getWorkspace().run(operation, null);
	}
}
