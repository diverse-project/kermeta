/*$Id: RemoveDependencies.java,v 1.1 2008-05-28 09:25:09 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	RemoveDependentDependencies.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package org.kermeta.kpm.updating;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kpm.IAction;
import org.kermeta.kpm.KPMPlugin;

import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;


public class RemoveDependencies implements IAction {

	@SuppressWarnings("unchecked")
	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor) {
		List<Unit> l = null;
		
		try {
			monitor.subTask("Removing Dependencies");
			
			/*
			 * 
			 * Getting the list of units to reload.
			 * 
			 */
			l = (List<Unit>) args.get("context");
			
			for ( Unit u : l ) {
				KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit(u.getName());
				if ( kermetaUnit != null ) {
					/*
					 * 
					 * Getting the entries to remove.
					 * 
					 * 
					 */
					List<Dependency> entriesToRemove = new ArrayList<Dependency> ();
					for ( Dependency d : unit.getDependents() )
						if ( d.getType().equals("require") )
							entriesToRemove.add(d);
						
					/*
					 * 
					 * Remove the found entries.
					 * 
					 * 
					 */
					for ( Dependency d : entriesToRemove ) {
						d.getFrom().getMasters().remove(d);
						d.getTo().getDependents().remove(d);
						//d.setFrom(null);
						//d.setTo(null);
					}
				}
			}
		/*	do not need to save now, will be saved during the CreateDependencies
		 	try {
				unit.eResource().save(null);
			} catch (IOException e) {
				e.printStackTrace();
			} */						
			
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