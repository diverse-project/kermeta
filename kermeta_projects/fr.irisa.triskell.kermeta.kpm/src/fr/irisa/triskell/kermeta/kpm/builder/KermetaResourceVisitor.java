package fr.irisa.triskell.kermeta.kpm.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.helpers.DependencyHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;

public class KermetaResourceVisitor implements IResourceVisitor {

	private KPM kpm;
	
	public KermetaResourceVisitor(KPM kpm) {
		this.kpm = kpm;
	}
	
	public boolean visit(IResource resource) throws CoreException {
		
		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
		
		case IResource.FILE :
			File file = kpm.createFileIfNecessary( (IFile) resource );
			DependencyHelper.addTypecheckingDependencies(file);
			break;
			
		case IResource.FOLDER :
			kpm.createDirectoryIfNecessary( (IFolder) resource );
			break;
			
		case IResource.PROJECT :
			kpm.createProjectIfNecessary( (IProject) resource );
			break;
			
		case IResource.ROOT :
			break;
			
		default :
			break;
		
		}
		return mustContinue;
	}

}
