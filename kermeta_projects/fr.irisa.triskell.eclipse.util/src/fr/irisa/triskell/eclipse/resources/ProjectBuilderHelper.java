

/*$Id: NatureHelper.java,v 1.2 2007-02-12 09:28:52 ftanguy Exp $
 * Project : fr.irisa.triskell.eclipse.util
 * File : 	NatureHelper.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 7, 2007
 * Authors : ftanguy
 */

/**
 * 
 */
package fr.irisa.triskell.eclipse.resources;

import org.eclipse.core.resources.ICommand;
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
public class ProjectBuilderHelper {

	/**
	 * This method checks if the given project has a builder corresponding to the given builder ID.
	 * You must know that if the project is closed, the checking can not be done. As a consequence, 
	 * the return value is false.
	 * @param project The project checked.
	 * @param builderID The ID of the builder.
	 * @return Returns true or false wether the project has the builder. Returns false if the project is closed.
	 * @throws CoreException
	 */
	static public boolean doesProjectHaveBuilder(IProject project, String builderID) throws CoreException  {
		// To get the project description, it must be opened
		if ( ! project.isOpen() ) 
			return false;

		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();
		for (int i = 0; i < commands.length; ++i)
			if (commands[i].getBuilderName().equals(builderID) )
				return true;
		return false;

	}


	static public void addBuilderToProject(final IProject project, final String builderID) throws CoreException {
		IWorkspaceRunnable operation = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				if ( ! doesProjectHaveBuilder(project, builderID) ) {
					IProjectDescription desc = project.getDescription();


					//add builder to project
					ICommand[] commands = desc.getBuildSpec();
					ICommand command = desc.newCommand();
					command.setBuilderName(builderID);
					ICommand[] nc = new ICommand[commands.length + 1];
					// Add it before other builders.
					System.arraycopy(commands, 0, nc, 1, commands.length);
					nc[0] = command;
					desc.setBuildSpec(nc);
					project.setDescription(desc, null);		    		  
				}
			}
		};
		ResourcesPlugin.getWorkspace().run(operation, null);
	}


	static public void removeBuilderFromProject(final IProject project, final String builderID) throws CoreException {

		IWorkspaceRunnable operation = new IWorkspaceRunnable() {

			public void run(IProgressMonitor monitor) throws CoreException {
				if ( doesProjectHaveBuilder(project, builderID) ) {
					IProjectDescription description = project.getDescription();

					ICommand[] commands = description.getBuildSpec();
					if ( (commands.length ) != 0 ) {

						ICommand[] nc = new ICommand[commands.length - 1];
						int j = 0;
						for (int i=0; i< commands.length; i++) {
							if ( commands[i].getBuilderName() != builderID )
								nc[j++] = commands[i];
						}	
						description.setBuildSpec(nc);
						project.setDescription(description, monitor);
					}	    		  
				}
			}

		};

		ResourcesPlugin.getWorkspace().run(operation, null);
	}

}


