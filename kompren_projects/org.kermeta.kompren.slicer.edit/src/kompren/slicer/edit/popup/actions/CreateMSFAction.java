package kompren.slicer.edit.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;

public class CreateMSFAction extends KomprenAction {

	public CreateMSFAction() {
		super();
	}


	@Override
	public void run(final IAction action) {
		for(final IFile file : paths)
			compile(file);
	}
	
	
	protected void compile(final IFile fileCompil) {
		IFile file = fileCompil;

		if(file.getFileExtension().equals("komprent")) {
			CreateKomprenModelsAction action = new CreateKomprenModelsAction();
			action.convertKomprentFile(file);
			file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(file.getFullPath().removeFileExtension().addFileExtension("kompren"));
		}

		String projectName = file.getName().replace(".kompren", "");
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		
		try {
			if(!project.exists()) {
				project.create(null);
				project.open(null);
				IProjectDescription description = project.getDescription();
				description.setNatureIds(new String[] { "org.kermeta.language.texteditor.eclipse.nature.KermetaNatureID"});
				project.setDescription(description, null);
			}
			else project.open(null);
			
			org.kermeta.kompren.org.kermeta.kompren.slicer.compilerrunner.MainRunner.init();
			org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KomprenCompiler compiler =
				org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KerRichFactory.createKomprenCompiler();
			
			compiler.compile("platform:/resource"+file.getFullPath(), "/"+projectName);
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		}catch(CoreException ex) { ex.printStackTrace(); }
	}



	@Override
	protected boolean supportExtension(final IFile file) {
		return file.getFileExtension().equals("komprent") || file.getFileExtension().equals("kompren");
	}
}
