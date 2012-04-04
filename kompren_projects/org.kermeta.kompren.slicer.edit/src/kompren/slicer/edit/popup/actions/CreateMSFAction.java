package kompren.slicer.edit.popup.actions;

import org.eclipse.core.resources.IFile;
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
	
	
	private void compile(final IFile file) {
		// org2.kermeta.kompren.slicer.KomprenCompiler compiler = new org2.kermeta.kompren.slicer.KomprenCompiler();
		// compiler.compile(uriSlicer, "MSF"+file.getName());
	}



	@Override
	protected boolean supportExtension(final IFile file) {
		return file.getFileExtension().equals("komprent") || file.getFileExtension().equals("kompren");
	}
}
