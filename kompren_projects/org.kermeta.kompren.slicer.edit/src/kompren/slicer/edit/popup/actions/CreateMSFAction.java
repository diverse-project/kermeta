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
	
	
	protected void compile(final IFile file) {
		if(file.getFileExtension().equals("komprent")) {
			CreateKomprenModelsAction action = new CreateKomprenModelsAction();
			action.convertKomprentFile(file);
		}
				
		// org2.kermeta.kompren.slicer.KomprenCompiler compiler = new org2.kermeta.kompren.slicer.KomprenCompiler();
		// compiler.compile(uriSlicer, "MSF"+file.getName());
	}



	@Override
	protected boolean supportExtension(final IFile file) {
		return file.getFileExtension().equals("komprent") || file.getFileExtension().equals("kompren");
	}
}
