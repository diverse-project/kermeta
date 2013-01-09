package kompren.slicer.edit.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;

public class CreateKomprenModelsAction extends KomprenAction {

	public CreateKomprenModelsAction() {
		super();
	}


	@Override
	public void run(final IAction action) {
		for(final IFile file : paths)
			convertKomprentFile(file);
	}



	protected void convertKomprentFile(final IFile file) {
		org.kermeta.kompren.MainRunner.convertAsXMI(file.getLocation().toString());
		try { file.getParent().refreshLocal(IResource.DEPTH_ONE, null); }
		catch(final CoreException ex) { ex.printStackTrace(System.err); }
	}


	@Override
	protected boolean supportExtension(final IFile file) {
		return file.getFileExtension().equals("komprent");
	}
}
