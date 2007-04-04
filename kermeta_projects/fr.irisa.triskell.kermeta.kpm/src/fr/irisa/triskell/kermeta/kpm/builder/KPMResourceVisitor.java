package fr.irisa.triskell.kermeta.kpm.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;


/**
 * This visitor is used to add units to kpm file of a project.
 * 
 * For each kmt file, it creates a unit and add the proper dependencies.
 * 
 * @author paco
 *
 */
public class KPMResourceVisitor implements IResourceVisitor {

	private KermetaProject project;

	public KPMResourceVisitor(KermetaProject project) {
		this.project = project;
	}
	
	public boolean visit(IResource resource) throws CoreException {

		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
		
		case IResource.FILE:
			if ( (resource.getFileExtension() != null) && resource.getFileExtension().equals("kmt") ) {
				Unit unit = KPMHelper.getOrCreateUnit(project.getKpm(), resource.getFullPath().toString());
				unit.setLastTimeModified( project.getProjectUnit().getLastTimeModified() );
				project.getKpm().getUnits().add(unit);
				KPMHelper.addCloseDependencyOnKMTFile(project.getKpm(), unit);
				KPMHelper.addOpenDependencyOnKMTFile(project.getKpm(), unit);
				KPMHelper.addUpdateDependencyOnKMTFile(project.getKpm(), unit);
			}
			break;
			
		case IResource.FOLDER :
			break;
			
		case IResource.PROJECT :
			break;
			
		default :
			break;
		
		}
		
		return mustContinue;
		
	}

}
