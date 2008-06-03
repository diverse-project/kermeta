

/*$Id: ProjectVisitor.java,v 1.3 2008-06-03 07:43:58 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	ProjectVisitor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal.builder;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;

/**
 * Handle the creation of a new project into the workspace.
 * 
 * Its responsibility is to add a corresponding unit of the newly project into the kpm model
 * and to add a kpm builder to it in order to get notified as soon as changes happen.
 * 
 * @author paco
 *
 */
public class ProjectVisitor implements IResourceVisitor {

	public boolean visit(IResource resource) throws CoreException {
		boolean goOn = true;
		switch( resource.getType() ) {
		
		case IResource.PROJECT :
			IProject project = (IProject) resource;
			if ( project.isOpen() )
				addBuilderIfNecessary(project);
			goOn = false;
			break;
		
		default :
			break;
			
		}
		
		return goOn;
	}

	/**
	 * Add a KPM builder to handle any change in the workspace.
	 * Anytime there is a change, the build method of the builder is called and actions can be performed.
	 * @param project
	 * @throws CoreException
	 */
	private void addBuilderIfNecessary(IProject project) throws CoreException {
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();
		for (int i = 0; i < commands.length; ++i)
			if (commands[i].getBuilderName().equals(KpmProjectBuilder.ID) )
				return;
		//add builder to project
		ICommand command = desc.newCommand();
		command.setBuilderName(KpmProjectBuilder.ID);
		ICommand[] nc = new ICommand[commands.length + 1];
		// Add it before other builders.
		System.arraycopy(commands, 0, nc, 1, commands.length);
		nc[0] = command;
		desc.setBuildSpec(nc);
		project.setDescription(desc, null);
		project.build( IncrementalProjectBuilder.INCREMENTAL_BUILD, null );
	}
	
}


