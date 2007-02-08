

/*$Id: NatureHelper.java,v 1.1 2007-02-08 15:30:03 ftanguy Exp $
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
public class NatureHelper {

	/**
	 * This method checks if the given project has a nature corresponding to the given nature ID.
	 * You must know that if the project is closed, the checking can not be done. As a consequence, 
	 * the return value is false.
	 * @param project The project checked.
	 * @param natureID The ID of the nature.
	 * @return Returns true or false wether the project has the nature. Returns false if the project is closed.
	 * @throws CoreException
	 */
	static public boolean doesProjectHaveNature(IProject project, String natureID) throws CoreException {
		// To get the project description, it must be opened
		if ( ! project.isOpen() ) 
			return false;
		return project.getDescription().hasNature( natureID );

	}
	
	
	static public void addNatureToProject(final IProject project, final String natureID) throws CoreException {
		IWorkspaceRunnable operation = new IWorkspaceRunnable() {
		      public void run(IProgressMonitor monitor) throws CoreException {
		    	  if ( ! doesProjectHaveNature(project, natureID) ) {
		    		  IProjectDescription description = project.getDescription();
		    		  description.setNatureIds( new String[] {natureID} );
		    		  project.setDescription(description, null);
		    	  }
		      }
		};
		ResourcesPlugin.getWorkspace().run(operation, null);
	}
	
}


