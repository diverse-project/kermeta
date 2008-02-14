/*$Id: CreateDependentDependencies.java,v 1.2 2008-02-14 07:13:46 uid21732 Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	CreateDependentDependencies.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.kpm.updating;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.KPMHelper;

public class CreateDependentDependencies implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args, List<Parameter> parameters) {			
		try {
			monitor.setTaskName("Create Dependencies");
			
			/*
			 * 
			 * Getting kpm.
			 * 
			 */
			KPM kpm = (KPM) unit.eContainer();
			
			/*
			 * 
			 * Getting the list of units to reload.
			 * 
			 */
			@SuppressWarnings("unchecked")
			List<Unit> l = (List<Unit>) args.get("context");
			
			for ( Unit u : l ) {
				String uri = "platform:/resource" + u.getValue();
				KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit(uri);
				if ( kermetaUnit != null ) {
					/*
					 * 
					 * For each Kermeta Unit imported, create a dependency if necessary.
					 * 
					 * 
					 */
					for ( KermetaUnit importedKermetaUnit : kermetaUnit.getImportedKermetaUnits() ) {
						if ( ! importedKermetaUnit.isFramework() ) {
							IFile importedFile = ResourceHelper.getIFile(importedKermetaUnit.getUri());
							// the uri may be an incorrect path, ignore it (the typecheckec will do its job to report the error
							if ( importedFile != null ) {							
								Unit importedUnit = kpm.findUnit(importedFile.getFullPath().toString());
								/*
								 * 
								 * If the unit does not exist, create it because we need it.
								 * 
								 */
								if ( importedUnit == null ) {
									importedUnit = KPMHelper.getOrCreateUnit(kpm, importedFile.getFullPath().toString() );
									// Setting the timestamp is correct here because the unit has been typechecked.
									importedUnit.setLastTimeModified( new Date(importedFile.getLocalTimeStamp()) );
								}
									
								if ( (importedUnit.findDependentUnit("require", unit) == null)
										|| (unit.findUnitIDependOn("require", importedUnit) == null) ) 
									createRequireDependency(kpm, unit, importedUnit);									
							}
						}
					}
				}
			}
						
		} finally {
			
			monitor.worked(1);
			
		}
		
	}

	
	private void createRequireDependency(KPM kpm, Unit unit, Unit importedUnit) {
		unit.beDependentOf(importedUnit, kpm.getRuleType("require") );
	}
	
}