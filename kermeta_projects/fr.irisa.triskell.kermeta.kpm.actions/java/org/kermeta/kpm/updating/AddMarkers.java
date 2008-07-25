

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
			
			/*
			 * 
			 * First, add errors to requires if necessary.
			 * 
			 */
			for ( Unit u : l ) {
				KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit(u.getName());
				if ( kermetaUnit != null )
					addRequireErrors(kermetaUnit);
			}
			
			for ( Unit u : l ) {
				KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit(u.getName());
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
					String message = "File " + kermetaUnit.getUri() + " contains errors.\n\n";
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
					String message = "File " + kermetaUnit.getUri() + " contains warnings.\n\n";
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


