package fr.irisa.triskell.kermeta.kpm.popup;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.kermeta.kpm.helpers.KpmHelper;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.KPM;

public class DependencyVisitor implements IResourceVisitor {

	private KPM kpm;
	
	public static final int ADDING = 0;
	public static final int REMOVING = 1;
	
	private int mode;
	
	public DependencyVisitor(KPM kpm) {
		this.kpm = kpm;
		mode = ADDING;
	}
	
	public DependencyVisitor(KPM kpm, int mode) {
		this.kpm = kpm;
		this.mode = mode;
	}
	
	public boolean visit(IResource resource) throws CoreException {
		switch ( mode ) {
		case ADDING :
			return addingVisit(resource);
		case REMOVING :
			return removingVisit(resource);
		default : 
			break;
		}
		return false;
	}

	public boolean addingVisit(IResource resource) {
		
		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
		
		case IResource.FILE :
			File file = kpm.findFile( (IFile) resource );
			if ( file == null )
				KpmHelper.createKMTFile( (IFile) resource, kpm);
			break;
			
		case IResource.FOLDER :
		//	kpm.createDirectoryIfNecessary( (IFolder) resource );
			break;
			
		case IResource.PROJECT :
			//kpm.createProjectIfNecessary( (IProject) resource );
			break;
			
		case IResource.ROOT :
			break;
			
		default :
			break;
		
		}
		return mustContinue;
	}
	
	public boolean removingVisit(IResource resource) {
		
		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
		
		case IResource.FILE :
			File file = kpm.findFile( (IFile) resource );
			if ( file != null )
				kpm.removeFile( file );
			break;
			
		case IResource.FOLDER :
			//kpm.removeDirectory( (IFolder) resource );
			break;
			
		case IResource.PROJECT :
			//	kpm.removeProject( (IProject) resource );
			break;
			
		case IResource.ROOT :
			break;
			
		default :
			break;
		
		}
		return mustContinue;
	}
	 
}
