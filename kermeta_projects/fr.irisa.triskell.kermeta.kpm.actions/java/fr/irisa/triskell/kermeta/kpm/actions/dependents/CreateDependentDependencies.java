/*$Id: CreateDependentDependencies.java,v 1.1 2007-08-06 14:32:51 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	CreateDependentDependencies.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.actions.dependents;

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
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;

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
			// The unit may be a ghost. It has no container.
			if ( kpm == null )
				return;
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
			for ( KermetaUnit importedKermetaUnit : (List<KermetaUnit>) kermetaUnit.getImportedKermetaUnits() ) {
				
				if ( ! importedKermetaUnit.isFramework() ) {
		
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
		/*In in = InOutHelper.createIn();
		Out out2 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.update");
		Rule rule = RuleHelper.createRule(kpm, 
			"require " + importedUnit.getValue(), 
			"require", "update", in, out2);
		unit.beDependentOf(importedUnit, rule.getType());		*/
		unit.beDependentOf(importedUnit, kpm.getRuleType("require") );
	}

	
}