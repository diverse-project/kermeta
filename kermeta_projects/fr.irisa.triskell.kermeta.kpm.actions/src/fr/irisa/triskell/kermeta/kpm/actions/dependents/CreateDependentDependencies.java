/*$Id: CreateDependentDependencies.java,v 1.3 2007-04-17 11:29:23 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
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
import org.eclipse.core.runtime.Status;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.In;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.DependencyHelper;
import fr.irisa.triskell.kermeta.kpm.helpers.InOutHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.kpm.plugin.KPMPlugin;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;

public class CreateDependentDependencies implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map args) {
			if ( monitor.isCanceled() )
				return;
			
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
		
					IFile importedFile = ResourceHelper.getIFileFromAbsoluteName(importedKermetaUnit.getUri());
					if(importedFile == null){
							KPMPlugin.getDefault().getLog().log(new Status(Status.WARNING, "fr.irisa.triskell.kermeta.kpm.actions",
			                    Status.OK, 
			                    "ignoring imported unit : " +importedKermetaUnit.getUri()+ " (cannot find it); was imported from " + kermetaUnit.getUri(), 
			                    null));
					}
					else {
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
		
	}

	
	private void createRequireDependency(KPM kpm, Unit unit, Unit importedUnit) {
		In in = InOutHelper.createIn();
		Out out2 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.update");
		Dependency dependency = DependencyHelper.createDependency(kpm, 
			"require " + importedUnit.getValue(), 
			"require", "update", in, out2);
		unit.beDependentOf(importedUnit, dependency.getType());		
	}

	
}