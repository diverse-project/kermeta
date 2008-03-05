/*$Id: KPMResourceVisitor.java,v 1.4 2008-03-05 08:09:54 ftanguy Exp $
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

	/**		The project to be processed.	*/
	private KermetaProject project;

	/**
	 * 
	 * @param project The project to be processed.
	 */
	public KPMResourceVisitor(KermetaProject project) {
		this.project = project;
	}
	
	public boolean visit(IResource resource) throws CoreException {

		boolean mustContinue = true;
		
		switch ( resource.getType() ) {
		
		case IResource.FILE:
			/*
			 * 
			 * One file has been found, let's create a unit for it and add rules if the files matches
			 * certain conditions.
			 * 
			 */
			Unit unit = KPMHelper.getOrCreateUnit(project.getKpm(), resource.getFullPath().toString());
			unit.setLastTimeModified( project.getProjectUnit().getLastTimeModified() );
			project.getKpm().getUnits().add(unit);
			KPMHelper.addRules(project.getKpm(), unit);
			// Unit with no rules are useless and then can be safely removed from the model.
			if ( unit.getRules().isEmpty() )
				project.getKpm().removeUnit( resource.getFullPath().toString() );
			break;
			
		case IResource.FOLDER :
			/*
			 * 
			 * Do nothing for the moment. We do not have any actions on folders.
			 * 
			 */
			break;
			
		case IResource.PROJECT :
			/*
			 * 
			 * Just do nothing and continue the visit.
			 * 
			 */
			break;
			
		default :
			break;
		
		}
		
		return mustContinue;
		
	}

}
