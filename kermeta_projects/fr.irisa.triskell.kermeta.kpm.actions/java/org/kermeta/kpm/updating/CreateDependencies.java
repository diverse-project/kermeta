/*$Id: CreateDependencies.java,v 1.1 2008-05-28 09:25:09 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	CreateDependentDependencies.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.kpm.updating;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kpm.IAction;
import org.kermeta.kpm.KPMPlugin;
import org.kermeta.kpm.KpmManager;

import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class CreateDependencies implements IAction {

	@SuppressWarnings("unchecked")
	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor) {
		List<Unit> l= null;
		try {
			monitor.setTaskName("Create Dependencies");
			
			/*
			 * 
			 * Getting the list of units to reload.
			 * 
			 */
			l = (List<Unit>) args.get("context");
			
			for ( Unit master : l ) {
				KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit(master.getName());
				if ( kermetaUnit != null && ! kermetaUnit.isFramework() ) {
					for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) ) {
						if ( ! importedUnit.isFramework() ) {
							
							Unit dependent = KpmManager.getDefault().conditionalAddUnit( importedUnit.getUri() );							
							if ( dependent != null ) // still null, The uri can be something like http://**, then there is no unit for that.
								master.beDependentOf(dependent, "require");
						}
					}
				}
			}
			KpmManager.getDefault().save(); 			
		} catch(Exception e){
			if(l == null)
				KPMPlugin.logErrorMessage("Error getting 'context' in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
			else
				KPMPlugin.logErrorMessage("Error in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
			
		}  finally {
			
			monitor.worked(1);
			
		}
		
	}
	
}