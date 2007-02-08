/**
 * 
 */
package fr.irisa.triskell.kermeta.resources;

import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.eclipse.resources.NatureHelper;

/**
 * @author ftanguy
 *
 */
public class KermetaResourceHelper {

	static public void createKermetaProject(String projectName) throws CoreException {
		final IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
		description.setLocation( null );

		 final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		 IWorkspaceRunnable operation = new IWorkspaceRunnable() {
			 public void run(IProgressMonitor monitor) throws CoreException {
				 project.create(description, monitor);
				 project.open(monitor);
				 NatureHelper.addNatureToProject(project, KermetaNature.ID);
			 }
		};
		ResourcesPlugin.getWorkspace().run(operation, null);
	}
}
