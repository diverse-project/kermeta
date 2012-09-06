package kompren.slicer.edit.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org2.kermeta.kompren.slicer.Slicer;

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
			file = ResourcesPlugin.getWorkspace().getRoot().getFile(file.getFullPath().removeFileExtension().addFileExtension("kompren"));
		}
try {
		final Resource resource = new ResourceSetImpl().getResource(URI.createFileURI(file.getLocation().toString()), true);
		final Slicer slicer = (Slicer)resource.getContents().get(0);
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(slicer.getName());
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

			compiler.compile("platform:/resource"+file.getFullPath());
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		}catch(CoreException ex) { ex.printStackTrace(); }
}catch(Exception e){System.out.println("err1:"); e.printStackTrace();}

	}



	@Override
	protected boolean supportExtension(final IFile file) {
		return file.getFileExtension().equals("komprent") || file.getFileExtension().equals("kompren");
	}
}
