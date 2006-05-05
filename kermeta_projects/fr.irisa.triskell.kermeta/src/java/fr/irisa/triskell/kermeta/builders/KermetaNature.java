package fr.irisa.triskell.kermeta.builders;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class KermetaNature implements IProjectNature {

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = "fr.irisa.triskell.kermeta.runner.kermetanature";

	private IProject project;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	public void configure() throws CoreException {
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();

		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(KermetaProjectBuilder.BUILDER_ID)) {
				return;
			}
		}

		ICommand[] newCommands = new ICommand[commands.length + 1];
		System.arraycopy(commands, 0, newCommands, 0, commands.length);
		ICommand command = desc.newCommand();
		command.setBuilderName(KermetaProjectBuilder.BUILDER_ID);
		newCommands[newCommands.length - 1] = command;
		desc.setBuildSpec(newCommands);
		project.setDescription(desc, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	public void deconfigure() throws CoreException {
		IProjectDescription description = getProject().getDescription();
		ICommand[] commands = description.getBuildSpec();
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(KermetaProjectBuilder.BUILDER_ID)) {
				ICommand[] newCommands = new ICommand[commands.length - 1];
				System.arraycopy(commands, 0, newCommands, 0, i);
				System.arraycopy(commands, i + 1, newCommands, i,
						commands.length - i - 1);
				description.setBuildSpec(newCommands);
				return;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	public IProject getProject() {
		return project;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	public void setProject(IProject project) {
		this.project = project;
	}
	
	/***
	 * Checks for the presence of a builder in a project.  If the builder is
	 * missing, it is added.  If it is already there, nothing happens.
	 * @param project The project to check.
	 * @param builder The builder to check for.
	 */
	private void checkBuilder(IProject project, String builder) throws CoreException
	{
		// get project description and then the associated build commands
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();
		
		// determine if builder already associated
		boolean foundBuilder = false;
		
		for (int i = 0; i < commands.length; ++i)
		{
			if (commands[i].getBuilderName().equals(builder))
			{
				foundBuilder = true;
				break;
			}
		}
		// add builder if not already in project
		if (!foundBuilder)
		{
			addBuilder(project, builder);
		}
		
	}
	
	private static void addBuilder(IProject project, String builder) throws CoreException
	    {
	       IProjectDescription desc = project.getDescription();
	       ICommand[] commands = desc.getBuildSpec();
	       ICommand command = desc.newCommand();
	       command.setBuilderName(builder);
	       // create map with arguments specific to builder in project here
	       // command.setArguments(Map args);
	       ICommand[] newCommands = new ICommand[commands.length + 1];
	 
	       // Add it after other builders.
	       System.arraycopy(commands, 0, newCommands, 1, commands.length);
	       newCommands[0] = command;
	       desc.setBuildSpec(newCommands);
	       project.setDescription(desc, null);
	    }

}
