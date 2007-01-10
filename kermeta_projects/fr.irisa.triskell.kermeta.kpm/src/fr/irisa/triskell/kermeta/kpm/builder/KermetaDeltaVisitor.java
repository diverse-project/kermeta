package fr.irisa.triskell.kermeta.kpm.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.kermeta.kpm.Directory;
import fr.irisa.triskell.kermeta.kpm.File;
import fr.irisa.triskell.kermeta.kpm.Project;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.KpmHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;

public class KermetaDeltaVisitor implements IResourceDeltaVisitor {

	/**
	 * 
	 */
	private KPM kpm;

	
	public KermetaDeltaVisitor(KPM kpm) {
		this.kpm = kpm;
	}
	
	public boolean visit(IResourceDelta delta) throws CoreException {
		
		boolean mustContinue = false;
		
		switch ( delta.getKind() ) {
		
		case IResourceDelta.ADDED :
			mustContinue = processAdding (delta.getResource() );
			break;
			
		case IResourceDelta.REMOVED :
			mustContinue = processRemoving( delta.getResource() );
			break;
			
		case IResourceDelta.CHANGED :
			mustContinue = processChanging( delta );
			break;
			
		default :
			break;
		
		}
		
		if ( kpm != null )
			KermetaWorkspace.getInstance().save();
		
		return mustContinue;
	}

	
	private boolean processAdding(IResource resource) throws CoreException {
		
		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
		
		case IResource.FILE :
			KpmHelper.createKMTFile( (IFile) resource, kpm);
			break;
			
		case IResource.FOLDER :
			KpmHelper.createDirectory( (IFolder) resource, kpm);
			break;
			
		case IResource.PROJECT :
			if ( IResourceHelper.isNatureKermeta( (IProject) resource ) ) { 
			//	IResourceHelper.attachDefaultBuilderToKermetaProject( (IProject) resource );
				//kpm.createProjectIfNecessary( (IProject) resource );
			} else mustContinue = false;
			break;
			
		default :
			break;
		
		}
		
		return mustContinue;
	}
	
	
	private boolean processRemoving(IResource resource) throws CoreException {
		
		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
		
		case IResource.FILE :
			File file = kpm.findFile( (IFile) resource );
			if ( file != null )
				file.remove();
			break;
			
		case IResource.FOLDER :
			Directory directory = kpm.findDirectory( (IFolder) resource );
			if ( directory != null )
				directory.remove();
			break;
			
		case IResource.PROJECT :
			if ( IResourceHelper.isNatureKermeta( (IProject) resource ) ) {
				//kpm.removeProject( (IProject) resource );
			} else mustContinue = false;
			break;
			
		default :
			break;
		
		}
		return mustContinue;
	}
	
	
	/**
	 * For each kind of resource, the method searches for its existency. If the resource exists, then
	 * a change is applied otherwise it means that the resource must be created.
	 * @param resource
	 */
	private boolean processChanging(IResourceDelta delta) throws CoreException {
		
		boolean mustContinue = true;
		
		IResource resource = delta.getResource();
		
		switch ( resource.getType() ) {
		
		case IResource.FILE :		
			if ( delta.getFlags() == IResourceDelta.CONTENT ) {
				File file = kpm.findFile( (IFile) resource);
				if ( file != null )
					file.changed();
			}
			break;
			
		case IResource.FOLDER :
			Directory directory = kpm.findDirectory( (IFolder) resource );
			if ( directory != null )
				directory.changed();
			break;
			
		case IResource.PROJECT :
			
			if ( delta.getFlags() == IResourceDelta.OPEN ) {
				if ( IResourceHelper.isNatureKermeta( (IProject) resource ) ) {
					//IResourceHelper.attachDefaultBuilderToKermetaProject( (IProject) resource );
				}
			}
			
			Project project = kpm.findProject( (IProject) resource );
			if ( IResourceHelper.isNatureKermeta( (IProject) resource ) ) {
				if ( project != null )
					project.changed();
			}
			break;
			
		case IResource.ROOT :
			break;
			
		default :
			break;
		
		}
		return mustContinue;
	}
}
