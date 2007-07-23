/*$Id: KPMResourceVisitor.java,v 1.3 2007-07-23 13:59:45 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
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
			Unit unit = KPMHelper.getOrCreateUnit(project.getKpm(), resource.getFullPath().toString());
			unit.setLastTimeModified( project.getProjectUnit().getLastTimeModified() );
			project.getKpm().getUnits().add(unit);
			KPMHelper.addRules(project.getKpm(), unit);
			if ( unit.getRules().isEmpty() )
				project.getKpm().removeUnit( resource.getFullPath().toString() );
			/*if ( resource.getFileExtension() != null ) {
				if ( resource.getFileExtension().equals("kmt") ) {

					KPMHelper.addCloseDependencyOnKMTFile(project.getKpm(), unit);
					KPMHelper.addOpenDependencyOnKMTFile(project.getKpm(), unit);
					KPMHelper.addUpdateDependencyOnKMTFile(project.getKpm(), unit);
				} else if ( resource.getFileExtension().equals("km") ) {
					Unit unit = KPMHelper.getOrCreateUnit(project.getKpm(), resource.getFullPath().toString());
					unit.setLastTimeModified( project.getProjectUnit().getLastTimeModified() );
					project.getKpm().getUnits().add(unit);
					KPMHelper.ad
				} else if ( resource.getFileExtension().equals("ecore") ) {
					Unit unit = KPMHelper.getOrCreateUnit(project.getKpm(), resource.getFullPath().toString());
					unit.setLastTimeModified( project.getProjectUnit().getLastTimeModified() );
					project.getKpm().getUnits().add(unit);
				}
			}*/
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
