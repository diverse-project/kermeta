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
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

import fr.irisa.triskell.eclipse.resources.NatureHelper;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.resources.KermetaNature;

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
	
	//////////////////////////
	//////////////////////////
	//		Accessors		//
	//////////////////////////
	//////////////////////////
	/**
	 * Get the eclipse root path. It means the absolute workspace path.
	 */
	static public String getAbsolutePath() {
		return ResourceHelper.root.getLocation().toString();
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
		IResource result = ResourceHelper.getIFile(relativeName);
		/*if ( ! result.exists() )
			result = ResourceHelper.getIFolder(relativeName);
		if ( ! result.exists() )
			result = ResourceHelper.getIProject(relativeName);*/
		return result;
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	static public IFile getIFile (File file) {
		return ResourceHelper.getIFile( file.getPath() );
	}
		
	/**
	 * 
	 * @return
	 */
	static public IProject[] getProjects() {
		return ResourceHelper.root.getProjects();
	}

	static public IFolder getIFolder(Directory directory) {
		return ResourceHelper.getIFolder( directory.getPath() );
	}
	
	static public IProject getIProject(Project project) {
		return ResourceHelper.getIProject(project.getName());
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
	static public boolean couldFileBeTypechecked(IFile file) {
		boolean result = false;
		String extension = file.getFileExtension();
		if(extension == null) return false;
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
		IProject[] projects = ResourceHelper.root.getProjects();
		HashSet <IProject> kermetaProjects = new HashSet <IProject> ();
		for (int i = 0; i < projects.length; i++) {
			if ( NatureHelper.doesProjectHaveNature(projects[i], KermetaNature.ID) )
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
	/*static public void refreshWorkspace() throws CoreException {
		root.refreshLocal(IResource.DEPTH_INFINITE, null);
	}*/
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
	static public void attachBuilderToKermetaProject(String builderID, KermetaProject project) throws CoreException {
		
		IProject iproject = project.getValue();
		IProjectDescription description = iproject.getDescription();
		ICommand command = description.newCommand();
		// preparing arguments for the builder.
		// We put the KPM object so that the builder can use it
		// to apply dependencies. This is EXTREMLY important.
		Hashtable <Object, Object> args = new Hashtable <Object, Object> ();
		//args.put ( "kpm", KermetaWorkspace.getInstance().getKpm() );
		args.put ( "kpm", project.getKpm() );
		
		command.setArguments(args);
		command.setBuilderName(builderID);
		// We consider only one builder for the moment.
		// Then we erase the others.
		ICommand[] newCommands = new ICommand[1];
		newCommands[0] = command;
		description.setBuildSpec(newCommands);
		iproject.setDescription(description, null);		
		
		System.out.println( "Builder added to : " + iproject.getName() );

	}

	static public void attachDefaultBuilderToKermetaProject(KermetaProject project) throws CoreException {
		attachBuilderToKermetaProject(builderID, project);
	}
	
	static public void removeKermetaBuilder(KermetaProject project) throws CoreException {
		IProject iproject = project.getValue();
		IProjectDescription description = iproject.getDescription();
		description.setBuildSpec( new ICommand[] {} );
		iproject.setDescription(description, null);
	}
	
	static public void reattachKermetaBuilder(KermetaProject project) throws CoreException {
		removeKermetaBuilder(project);
		attachDefaultBuilderToKermetaProject(project);
	}
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		End of Builder Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////

	
	static public void createKermetaProject(String projectName) throws CoreException {
		final IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
		 //description.setLocation( Platform.getLocation() );
		description.setLocation( null );

		 final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		 IWorkspaceRunnable operation = new IWorkspaceRunnable() {
			 public void run(IProgressMonitor monitor) throws CoreException {
				 project.create(description, monitor);
				 project.open(monitor);
				 NatureHelper.addNatureToProject(project, KermetaNature.ID);
				 //KermetaNatureHelper.addKermetaNature(project);
				 KermetaWorkspace.getInstance().addKermetaProject(project);
			 }
		};
		ResourcesPlugin.getWorkspace().run(operation, null);
	}
	
}
