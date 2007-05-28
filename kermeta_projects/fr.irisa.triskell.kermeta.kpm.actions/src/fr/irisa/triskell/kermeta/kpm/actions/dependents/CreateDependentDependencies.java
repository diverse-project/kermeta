/*$Id: CreateDependentDependencies.java,v 1.7 2007-05-28 12:16:22 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	CreateDependentDependencies.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.actions.dependents;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.In;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.RuleHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.InOutHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;

public class CreateDependentDependencies implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map args) {
		if ( monitor.isCanceled() )
			return;
			
		try {
		
			monitor.beginTask("", 1);
			monitor.subTask("Creating Dependent Dependencies for " + unit.getValue());
			
			/*
			 * 
			 * Getting Kermeta Unit
			 * 
			 * 
			 */
			KPM kpm = (KPM) unit.eContainer();
			KermetaUnit kermetaUnit = KermetaUnitHost.getInstance().getValue(unit);		
			
			
			/*
			 * 
			 * If the Kermeta Unit is null, it means that the file must have already processed before.
			 * Therefore we quit.
			 * 
			 * 
			 */
			if ( kermetaUnit == null )
				return;
			
			/*
			 * 
			 * For each Kermeta Unit imported, create a dependency if necessary.
			 * 
			 * 
			 */
			for ( KermetaUnit importedKermetaUnit : kermetaUnit.importedUnits ) {
				
				if ( ! importedKermetaUnit.getUri().equals(StdLibKermetaUnitHelper.STD_LIB_URI) ) {
		
					IFile importedFile = ResourceHelper.getIFile(importedKermetaUnit.getUri());
						// the uri may be an incorrect path, ignore it (the typecheckec will do its job to report the error
					if(importedFile != null){							
						Unit importedUnit = kpm.findUnit(importedFile.getFullPath().toString());
						
						/*
						 * 
						 * The file required may not exist. Then imported unit may be null.
						 * 
						 */
						if ( importedUnit != null ) {
						
							if ( (importedUnit.findDependentUnit("require", unit) == null)
									|| (unit.findUnitIDependOn("require", importedUnit) == null) ) 
								createRequireDependency(kpm, unit, importedUnit);
							
						}
					}
				}
			}
			
			monitor.worked(1);
			
		} finally {
			
			monitor.done();
			
		}
		
	}

	
	private void createRequireDependency(KPM kpm, Unit unit, Unit importedUnit) {
		In in = InOutHelper.createIn();
		Out out2 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.update");
		Rule rule = RuleHelper.createRule(kpm, 
			"require " + importedUnit.getValue(), 
			"require", "update", in, out2);
		unit.beDependentOf(importedUnit, rule.getType());		
	}

	
}