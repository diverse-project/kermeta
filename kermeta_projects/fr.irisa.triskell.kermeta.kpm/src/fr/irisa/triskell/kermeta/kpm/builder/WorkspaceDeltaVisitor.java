package fr.irisa.triskell.kermeta.kpm.builder;

import java.util.ArrayList;
import java.util.Date;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.eclipse.resources.NatureHelper;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.resources.KermetaNature;


/**
 * This visitor is used to perform specific actions when the workspace has changed.
 * 
 * For the moment, the adding of kmt file, the adding and removing of kermeta project are handled.
 * 
 * @author paco
 *
 */

public class WorkspaceDeltaVisitor implements IResourceDeltaVisitor {
	
	
	private KermetaProject currentProject;
	private ArrayList<KermetaProject> projectsToOpen;
	
	
	public WorkspaceDeltaVisitor(ArrayList<KermetaProject> projectsToOpen) {
		this.projectsToOpen = projectsToOpen;
	}
	
	
	public boolean visit(IResourceDelta delta) throws CoreException {
		
		boolean mustContinue = true;
		
		switch ( delta.getKind() ) {
		
		case IResourceDelta.ADDED :
			mustContinue = processAdding (delta.getResource() );
			break;
			
		case IResourceDelta.CHANGED :
			mustContinue = processChanging( delta.getResource() );
			break;

		case IResourceDelta.REMOVED :
			mustContinue = processRemoving( delta.getResource() );
			break;
			
		default :
			break;
		
		}
		
		return mustContinue;
	}

	
	private boolean processAdding(IResource resource) throws CoreException {
		
		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
		
		case IResource.FILE:
			if ( (resource.getFileExtension() != null) && resource.getFileExtension().equals("kmt") ) {
				Unit unit = KPMHelper.getOrCreateUnit(currentProject.getKpm(), resource.getFullPath().toString());
				KPMHelper.addCloseDependencyOnKMTFile(currentProject.getKpm(), unit);
				KPMHelper.addOpenDependencyOnKMTFile(currentProject.getKpm(), unit);
				KPMHelper.addUpdateDependencyOnKMTFile(currentProject.getKpm(), unit);
				//unit.receiveSynchroneEvent("update");
				currentProject.save();
			}
			break;
			
		case IResource.FOLDER :
			break;
			
		case IResource.PROJECT :
			if ( NatureHelper.doesProjectHaveNature( (IProject) resource, KermetaNature.ID ) ) { 
				currentProject = KermetaWorkspace.getInstance().addKermetaProject( (IProject) resource );
				projectsToOpen.add(currentProject);
				currentProject.save();
			} else mustContinue = false;
			break;
			
		default :
			break;
		
		}
		
		return mustContinue;
	}
	
	private boolean processChanging(IResource resource) throws CoreException {
		
		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
			
		case IResource.PROJECT :
			if ( NatureHelper.doesProjectHaveNature( (IProject) resource, KermetaNature.ID ) ) { 
				currentProject = KermetaWorkspace.getInstance().getKermetaProject( (IProject) resource);
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
			
		case IResource.PROJECT :
			currentProject = KermetaWorkspace.getInstance().getKermetaProject( (IProject) resource);
			if ( currentProject != null ) {
				Unit unit = currentProject.getKpm().findUnit( resource.getFullPath().toString() );
				unit.receiveSynchroneEvent("close", null);
				KermetaWorkspace.getInstance().removeKermetaProject( (IProject) resource );
				mustContinue = false;
			}
			break;
			
		default :
			break;
		
		}
		
		return mustContinue;
	}
	
}
