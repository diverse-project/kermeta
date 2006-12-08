package fr.irisa.triskell.kermeta.kpm.helpers;

import java.util.ArrayList;
import java.util.Collection;
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
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.builder.KermetaChangeListener;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;

public class IResourceHelper {

	static final public IWorkspace workspace = ResourcesPlugin.getWorkspace();
	static final public IWorkspaceRoot root = workspace.getRoot();
	
	//////////////////////////
	//////////////////////////
	//		Accessors		//
	//////////////////////////
	//////////////////////////
	static public String getAbsolutePath() {
		return root.getLocation().toString();
	}

	static public IFile getIFile (File file) {
		Path path = new Path(file.getRelativeName());
		return root.getFile(path);
	}
	
	static public IFile getIFile (String fileName, String filePath) {
		Path path = new Path( filePath + "/" + fileName );
		return root.getFile(path);
	}
	
	static public IFolder getIFolder (Directory directory) {
		Path path = new Path(directory.getRelativeName());
		return root.getFolder(path);
	}
	
	static public IProject getIProject (Project project) {
		return root.getProject(project.getName());
	}
	//////////////////////////////////
	//////////////////////////////////	
	//		End of Accessors		//
	//////////////////////////////////
	//////////////////////////////////
	
	
	static public boolean isNatureKermeta(IProject project) throws CoreException {
		// To get the project description, it must be opened
		if ( ! project.isOpen() ) project.open(null);
		return project.getDescription().hasNature("fr.irisa.triskell.kermeta.runner.kermetanature");
	}
	
	//////////////////////////////////
	//////////////////////////////////
	//		Workspace Mechanism		//
	//////////////////////////////////
	//////////////////////////////////
	/**
	 * 
	 * @return
	 */
	static public IProject[] getProjects() {
		return root.getProjects();
	}
	
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
	 * Touching the workspace makes every projects be sent a change event.
	 * @throws CoreException
	 */
	static public void touchWorkspace() throws CoreException {
		Set<IProject> kermetaProjects = getKermetaProjects();
		for ( IProject project : kermetaProjects ) {
			project.touch(null);
		}
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
	static private String builderID = "fr.irisa.triskell.kermeta.kpm.kermetaProjectBuilder";
	
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
		Hashtable args = new Hashtable ();
		args.put ( "kpm", KermetaWorkspace.getInstance().getKpm() );
		
		command.setArguments(args);
		command.setBuilderName(builderID);
		// We consider only one builder for the moment.
		// Then we erase the others.
		ICommand[] newCommands = new ICommand[1];
		newCommands[0] = command;
		description.setBuildSpec(newCommands);
		project.setDescription(description, null);		
	}

	static public void attachDefaultBuilderToKermetaProject(IProject project) throws CoreException {
		attachBuilderToKermetaProject(builderID, project);
	}
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		End of Builder Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////
	
	
	
	
	//////////////////////
	//////////////////////
	//		Testing		//
	//////////////////////
	//////////////////////
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
	//		End of Testing		//
	//////////////////////////////
	//////////////////////////////
	
}
