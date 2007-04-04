package fr.irisa.triskell.kermeta.kpm.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.eclipse.resources.NatureHelper;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.resources.KermetaNature;

public class KermetaWorkspace {
	
	/**
	 * Keep trace of all projects with kermeta nature.
	 */
	private Hashtable <IProject, KermetaProject> projects = new Hashtable <IProject, KermetaProject> ();
	
	private List<Unit> units = new ArrayList <Unit> ();
	
	/**
	 * Kermeta Workspace is a singleton. 
	 */
	static private KermetaWorkspace instance = null;
	
	/**
	 * Get the only Kermeta Workspace instance.
	 * @return
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
		IProject[] iprojects = ResourceHelper.root.getProjects();;
		for ( int index = 0; index < iprojects.length; index++ ) {
			if ( NatureHelper.doesProjectHaveNature( iprojects[index], KermetaNature.ID ) ) {
				if ( iprojects[index].exists() ) {
					KermetaProject project = new KermetaProject(iprojects[index]);
					projects.put(iprojects[index], project);
					//IResourceHelper.attachDefaultBuilderToKermetaProject(project);
				}
			}
		}
	}
	//////////////////////////////////
	//////////////////////////////////
	//		End of Constructor		//
	//////////////////////////////////
	//////////////////////////////////
		
	public KermetaProject addKermetaProject(IProject value) throws CoreException {
		KermetaProject project = new KermetaProject(value);
		projects.put(value, project);
		//IResourceHelper.attachDefaultBuilderToKermetaProject(project);
		return project;
	}
	
	public void removeKermetaProject(IProject value) {
		projects.remove(value);
	}
	
	/**
	 * Get the kermeta project associated with the given resource.
	 * @param value
	 * @return
	 */
	public KermetaProject getKermetaProject(IProject value) {
		return projects.get(value);
	}
	
	public KermetaProject getKermetaProject(String projectName) {
		IProject project = ResourceHelper.getIProject(projectName);
		return getKermetaProject(project);
	}
	
	public Collection<KermetaProject> getKermetaProjects() {
		return projects.values();
	}
	
	public Unit foundUnit(String value) {
		for ( Unit currentUnit : units ) {
			if ( currentUnit.getValue().equals(value) )
				return currentUnit;
		}
		return null;
	}
}
