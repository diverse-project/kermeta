package fr.irisa.triskell.kermeta.ocl.ui.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.kermeta.ocl.GenerateKMT;

public class OCLResourceVisitor implements IResourceVisitor {

	private String _modelEcorePath;
	
	public OCLResourceVisitor(String modelEcorePath) {
		_modelEcorePath = modelEcorePath;
	}
	
	
	public boolean visit(IResource resource) throws CoreException {
		if ( resource instanceof IFile ) {
			IFile file = (IFile) resource;
			if ( file.getFileExtension().equals("ocl") ) {
				IPath outKmtPath = file.getLocation().removeFileExtension().addFileExtension("kmt");
				String output = outKmtPath.toString();
				String input = file.getFullPath().toString();
				
				URI ecoreURI = URI.createURI( "platform:/resource" + _modelEcorePath );
				URI oclURI = URI.createURI( "platform:/resource" + input );
				URI kmtURI = URI.createURI( output );

				GenerateKMT generator = new GenerateKMT(new EclipseConsole("OCL 2 KMT"));
				generator.generate(ecoreURI, oclURI, kmtURI);	
			}
		}
		return true;
	}

}
