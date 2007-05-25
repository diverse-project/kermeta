/*$Id: KermetaWorkspace.java,v 1.2 2007-05-25 15:04:38 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.resources;

import java.util.Collection;
import java.util.Hashtable;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.eclipse.resources.NatureHelper;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.resources.KermetaNature;

/**
 * 
 * This class is used as a singleton.
 * 
 * 
 * @author paco
 *
 */
public class KermetaWorkspace {
	
	/**
	 * Keep trace of all projects with kermeta nature.
	 */
	private Hashtable <IProject, KermetaProject> projects = new Hashtable <IProject, KermetaProject> ();
	
	/**
	 * Kermeta Workspace is a singleton. 
	 */
	static private KermetaWorkspace instance = null;
	
	/**
	 * Get the only Kermeta Workspace instance.
	 * @return The only instance.
	 */
	static public KermetaWorkspace getInstance() {
		if ( instance == null ) {
			instance = new KermetaWorkspace();
			try {
				instance.initialize();
			} catch (CoreException exception) {
				exception.printStackTrace();
			}
		}
		return instance;
	}
	
	/**
	 * Initialize the Kermeta workspace. Load or create the Kermeta Project Manager object,
	 * and checks if new Kermeta Project have been added.
	 *
	 */
	private void initialize() throws CoreException {
		initializeProjects();
	}
	
	/**
	 * Creates KermetaProjects object. It lists the project of the
	 * Eclipse workspace, check if their nature is a Kermeta nature.
	 * If yes, create a KermetaProject.
	 *
	 */
	private void initializeProjects() throws CoreException {
		IProject[] iprojects = ResourceHelper.root.getProjects();
		for ( int index = 0; index < iprojects.length; index++ ) {
			if ( NatureHelper.doesProjectHaveNature( iprojects[index], KermetaNature.ID ) ) {
				if ( iprojects[index].exists() ) {
					KermetaProject project = new KermetaProject(iprojects[index]);
					projects.put(iprojects[index], project);
				}
			}
		}
	}
		
	/**
	 * Add a new Kermeta project to the kermeta workspace.
	 * @param value
	 * @return
	 * @throws CoreException
	 */
	public KermetaProject addKermetaProject(IProject value) throws CoreException {
		KermetaProject project = new KermetaProject(value);
		projects.put(value, project);
		return project;
	}
	
	/**
	 * Remove a kermeta project from the kermeta workspace.
	 * @param value
	 */
	public void removeKermetaProject(IProject value) {
		projects.remove(value);
	}
	
	/**
	 * Get the kermeta project associated with the given resource.
	 * @param value
	 * @return
	 */
	public KermetaProject getKermetaProject(IProject value) {
		assert( value != null );
		return projects.get(value);
	}
	
	/**
	 * Getting the kermeta project thanks to the name of the project.
	 * @param projectName
	 * @return
	 */
	public KermetaProject getKermetaProject(String projectName) {
		IProject project = ResourceHelper.getIProject(projectName);
		return getKermetaProject(project);
	}
	
	/**
	 * Getting the list of kermeta projects.
	 * @return
	 */
	public Collection<KermetaProject> getKermetaProjects() {
		return projects.values();
	}

}
