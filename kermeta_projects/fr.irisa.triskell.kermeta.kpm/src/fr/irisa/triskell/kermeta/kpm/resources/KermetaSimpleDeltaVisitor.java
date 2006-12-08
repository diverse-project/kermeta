package fr.irisa.triskell.kermeta.kpm.resources;

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
import fr.irisa.triskell.kermeta.kpm.helpers.DependencyHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.StringHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;
import fr.irisa.triskell.kermeta.tools.wizards.Ecore2kmtWizard;

public class KermetaSimpleDeltaVisitor implements IResourceDeltaVisitor {

	/**
	 * 
	 */
	private KPM kpm;

	
	public KermetaSimpleDeltaVisitor(KPM kpm) {
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
			IFile ifile = (IFile) resource;
			if ( ifile.getFullPath().getFileExtension().equals("ecore") ) {
				
				File ecoreFile = kpm.findFile( (IFile) resource );
				if ( ecoreFile == null ) {
					
					String[] nameAndPath = StringHelper.getNameAndPath( ifile.getFullPath() );
					Directory directory = kpm.findDirectory( nameAndPath[1] );
					if ( (directory != null) && directory.isSource() ) {
						ecoreFile = kpm.createFile( ifile );
						ecoreFile.load();
						String kmtFileName = StringHelper.getNewNameWithExtension(ecoreFile, ".kmt");
						File kmtFile = kpm.findFile( kmtFileName, ecoreFile.getPath() );
						if ( kmtFile != null ) 
							DependencyHelper.addEcoreDependencies(kmtFile, ecoreFile);
					}
						
				}
				
			} else {
				File file = kpm.createFileIfNecessary( ifile );
				DependencyHelper.addTypecheckingDependencies(file);
			}
			break;
			
		case IResource.FOLDER :
			//kpm.createDirectoryIfNecessary( (IFolder) resource );
			break;
			
		case IResource.PROJECT :
			if ( IResourceHelper.isNatureKermeta( (IProject) resource ) ) 
				kpm.createProjectIfNecessary( (IProject) resource );
			else mustContinue = false;
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
			kpm.removeFile( (IFile) resource );
			break;
			
		case IResource.FOLDER :
			kpm.removeDirectory( (IFolder) resource );
			break;
			
		case IResource.PROJECT :
			if ( IResourceHelper.isNatureKermeta( (IProject) resource ) )
				kpm.removeProject( (IProject) resource );
			else mustContinue = false;
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
		
		case IResource.FOLDER :
			Directory directory = kpm.findDirectory( (IFolder) resource );
			if ( directory != null ) {
				
				if ( ! directory.isSource() )
					kpm.removeDirectory(directory);
				System.out.println();
			}
			break;
		
		case IResource.PROJECT :
			Project project = kpm.findProject( (IProject) resource );
			boolean isNatureKermeta = IResourceHelper.isNatureKermeta( (IProject) resource );
			
			if ( (project == null) && isNatureKermeta ) {
				kpm.createProject( (IProject) resource );
				mustContinue = false;
			} else if ( (project != null) && ! isNatureKermeta ) {
				kpm.removeProject( project );
				mustContinue = false;
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
