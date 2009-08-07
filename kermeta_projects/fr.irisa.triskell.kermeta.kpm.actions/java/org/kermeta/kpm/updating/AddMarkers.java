

/*$Id: AddMarkers.java,v 1.6 2008-07-25 09:44:17 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	AddMarkers.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 feb. 08
* Authors : paco
*/

package org.kermeta.kpm.updating;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitRequire;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kpm.IAction;
import org.kermeta.kpm.KPMPlugin;

import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;

public class AddMarkers implements IAction {

	@SuppressWarnings("unchecked")
	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor) {
		
		List<Unit> l = null;
		try {
			monitor.subTask("Adding Markers");
			
			/*
			 * 
			 * Getting the list of units to reload.
			 * 
			 */
			l = (List<Unit>) args.get("context");
			
			
			for ( Unit u : l ) {
				KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit(u.getName());
				
				/* 
				 * First, add errors to requires if necessary. 
				 * Ie. if this unit is erroneous, then notify the other units that 
				 */
				if ( kermetaUnit != null )
					addRequireErrors(kermetaUnit);
			
				
				/*
				 * KPM doesn't deal with unit that comes from the EMF Registry and a plugin
				 * So, need to deal with error that can come from them
				 */
				if ( kermetaUnit != null ){
					for(KermetaUnitRequire unitRequire : kermetaUnit.getKermetaUnitRequires()){
						KermetaUnit requiredUnit = unitRequire.getKermetaUnit();
						if(requiredUnit.isErroneous() || requiredUnit.isWarned()){
							if(EMFRegistryHelper.isRegistered(requiredUnit.getUri()) &&
									! EMFRegistryHelper.isDynamicallyRegistered(requiredUnit.getUri()) ){
								addRequireErrors(requiredUnit);
								//KermetaUnitRequire r = findRequire(requiredUnit, kermetaUnit);
								/*if ( unitRequire != null ) {
									String message = "Registered EPackage " + requiredUnit.getUri() + " contains errors.\n\n";
									message = message + KermetaUnitHelper.getErrorsAsString( requiredUnit );
									kermetaUnit.error( message, unitRequire );
								}*/
							}
							// DVK: currently it also doesn't deal ecore files, maybe a better correction would be to tell kpm to chek the ecore files ? 
							// must check the cpu overhead
							if(requiredUnit.getUri().endsWith(".ecore")){
								addRequireErrors(requiredUnit);
							}
						}						
					}
					
				}
				
				/* 
				 * Mark the error of this file 
				 */
				if ( kermetaUnit != null ) {
					IFile file = ResourceHelper.getIFile(u.getName());
					if(file != null){
						KermetaMarkersHelper.clearMarkers(file);
						KermetaMarkersHelper.createMarkers(file, kermetaUnit);
					}
					else{
						KPMPlugin.logErrorMessage("Cannot mark " + u.getName() + " because not able to get the IFile", null);
					}
				} else {
					// The kermeta unit has not been found.
					// That is strange maybe should warn.
				}
				
				
				
			}
			
		} catch(Exception e){
			if(l == null)
				KPMPlugin.logErrorMessage("Error getting 'context' in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
			else
				KPMPlugin.logErrorMessage("Error in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
			
		} finally {
			monitor.worked(1);
		}
		
	}
	
	private void addRequireErrors(KermetaUnit kermetaUnit) {
		if ( kermetaUnit.isErroneous() ) {
			// if the unit has error, find all the unit that require it and add an error message on the require that link the units
			for ( KermetaUnit importer : kermetaUnit.getImporters() ) {
				KermetaUnitRequire r = findRequire(kermetaUnit, importer);
				if ( r != null ) {
					String message = "Resource " + kermetaUnit.getUri() + " contains errors.\n\n";
					message = message + KermetaUnitHelper.getErrorsAsString( kermetaUnit );
					importer.error( message, r.getRequire() );
				}
			}
		}
		else if ( kermetaUnit.isWarned() ) {
			// if the unit has warning, find all the unit that require it and add a warning message on the require that link the units
			for ( KermetaUnit importer : kermetaUnit.getImporters() ) {
				KermetaUnitRequire r = findRequire(kermetaUnit, importer);
				if ( r != null ) {
					String message = "Resource " + kermetaUnit.getUri() + " contains warnings.\n\n";
					message = message + KermetaUnitHelper.getWarningsAsString( kermetaUnit );
					importer.warning( message, r.getRequire() );
				}
			}
		}
	}
	
	private KermetaUnitRequire findRequire(KermetaUnit importedUnit, KermetaUnit importerUnit) {
		for ( KermetaUnitRequire r : importerUnit.getKermetaUnitRequires() ) {
			if ( r.getKermetaUnit() == importedUnit )
				return r;
		}
		return null;
	}

}


