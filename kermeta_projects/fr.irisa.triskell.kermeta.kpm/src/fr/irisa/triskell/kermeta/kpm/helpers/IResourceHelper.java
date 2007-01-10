package fr.irisa.triskell.kermeta.kpm.helpers;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.core.natures.KermetaNature;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;

/**
 * 
 * This class should be accessed in a static way. It provides some usefull accessors
 * regarding the eclipse filesystem especially the IResource system.
 * 
 * Providing a high abstraction makes the code of the project much more cleaner.
 * 
 * @author ftanguy
 *
 */
public class IResourceHelper {

	/**
	 * The eclipse workspace.
	 */
	static final public IWorkspace workspace = ResourcesPlugin.getWorkspace();
	
	/**
	 * The eclipse root (in fact the workspace root).
	 */
	static final public IWorkspaceRoot root = workspace.getRoot();
	
	//////////////////////////
	//////////////////////////
	//		Accessors		//
	//////////////////////////
	//////////////////////////
	/**
	 * Get the eclipse root path. It means the absolute workspace path.
	 */
	static public String getAbsolutePath() {
		return root.getLocation().toString();
	}

	static public IResource getIResource (Unit unit) {
		if ( unit instanceof File )
			return getIFile( (File) unit);
		if ( unit instanceof Directory )
			return getIFolder( (Directory) unit);
		if ( unit instanceof Project )
			return getIProject( (Project) unit);
		return null;
	}
	
	/**
	 * 
	 * @param relativeName
	 * @return
	 */
	static public IResource getIResource (String relativeName) {
		Path path = new Path(relativeName);
		IResource result = root.getFile(path);
		return result;
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	static public IFile getIFile (File file) {
		return getIFile( file.getPath() );
	}

	/**
	 * 
	 * @param relativeName
	 * @return
	 */
	static public IFile getIFile (String relativeName) {
		Path path = new Path( relativeName );
		return root.getFile(path);
	}
	
	/**
	 * 
	 * @param fileName
	 * @param filePath
	 * @return
	 */
	static public IFile getIFile (String fileName, String filePath) {
		return getIFile( filePath + "/" + fileName );
	}
	
	/**
	 * 
	 * @param directory
	 * @return
	 */
	static public IFolder getIFolder (Directory directory) {
		Path path = new Path(directory.getPath());
		return root.getFolder(path);
	}
	
	/**
	 * 
	 * @param project
	 * @return
	 */
	static public IProject getIProject (Project project) {
		return root.getProject(project.getName());
	}
	
	/**
	 * 
	 * @return
	 */
	static public IProject[] getProjects() {
		return root.getProjects();
	}
	//////////////////////////////////
	//////////////////////////////////	
	//		End of Accessors		//
	//////////////////////////////////
	//////////////////////////////////
	
	
	//////////////////////
	//////////////////////
	//		Testing		//
	//////////////////////
	//////////////////////
	static public boolean isNatureKermeta(IProject project) throws CoreException {
		// To get the project description, it must be opened
		if ( ! project.isOpen() ) 
			return false;
		return project.getDescription().hasNature( KermetaNature.ID );
	}
	
	static public boolean couldFileBeTypechecked(IFile file) {
		boolean result = false;
		String extension = file.getFileExtension();
		if ( extension.equals("km") )
			result = true;
		else if ( extension.equals("kmt") )
			result = true;
		return result;
	}
	//////////////////////////////
	//////////////////////////////
	//		End of testing		//
	//////////////////////////////
	//////////////////////////////
	
	//////////////////////////////////
	//////////////////////////////////
	//		Workspace Mechanism		//
	//////////////////////////////////
	//////////////////////////////////

	
	/**
	 * 
	 * @return
	 * @throws CoreException
	 */
	static public Set<IProject> getKermetaProjects() throws CoreException {
		IProject[] projects = root.getProjects();
		HashSet <IProject> kermetaProjects = new HashSet <IProject> ();
		for (int i = 0; i < projects.length; i++) {
			if ( isNatureKermeta(projects[i]) )
				kermetaProjects.add(projects[i]);
		}
		return kermetaProjects;
	}
	
	/**
	 * Refreshing the workspace makes Eclipse creating modifications events (like files creation).
	 * These modifications are then handled by a listener which delagates to some nices classes to perform
	 * specifics actions.
	 * @throws CoreException
	 */
	static public void refreshWorkspace() throws CoreException {
		root.refreshLocal(IResource.DEPTH_INFINITE, null);
	}
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		End of Workspace Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////

	
	//////////////////////////////////
	//////////////////////////////////
	//		Builder Mechanism		//
	//////////////////////////////////
	//////////////////////////////////
	static final public String builderID = "fr.irisa.triskell.kermeta.kpm.kermetaProjectBuilder";
	
	/**
	 * Attach a builder to a KermetaProject. The builder will be instantiate
	 * when the system will call the build method on the project.
	 * @param builderID
	 * @param kProject
	 * @see org.eclipse.core.resources.ICommand
	 * @see org.eclipse.core.resources.IProject
	 * @see org.eclipse.core.resources.IProjectDescription
	 */
	static public void attachBuilderToKermetaProject(String builderID, IProject project) throws CoreException {
		
		IProjectDescription description = project.getDescription();
		ICommand command = description.newCommand();
		// preparing arguments for the builder.
		// We put the KPM object so that the builder can use it
		// to apply dependencies. This is EXTREMLY important.
		Hashtable <Object, Object> args = new Hashtable <Object, Object> ();
		args.put ( "kpm", KermetaWorkspace.getInstance().getKpm() );
		
		command.setArguments(args);
		command.setBuilderName(builderID);
		// We consider only one builder for the moment.
		// Then we erase the others.
		ICommand[] newCommands = new ICommand[1];
		newCommands[0] = command;
		description.setBuildSpec(newCommands);
		project.setDescription(description, null);		
		
		System.out.println( "Builder added to : " + project.getName() );

	}

	static public void attachDefaultBuilderToKermetaProject(IProject project) throws CoreException {
		attachBuilderToKermetaProject(builderID, project);
	}
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		End of Builder Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////

	
}
