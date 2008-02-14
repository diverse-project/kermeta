/*$Id: RemoveDependentDependencies.java,v 1.2 2008-02-14 07:13:46 uid21732 Exp $
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Unit;


public class RemoveDependentDependencies implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args, List<Parameter> parameters) {
		
		try {
			monitor.subTask("Removing Dependencies");
			
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
					 * Getting the entries to remove.
					 * 
					 * 
					 */
					List<Dependency> entriesToRemove = new ArrayList<Dependency> ();
					for ( Dependency d : unit.getDependencies() )
						if ( ! findImportedUnit(kermetaUnit, d.getTo()) )
							entriesToRemove.add(d);

					/*
					 * 
					 * Remove the found entries.
					 * 
					 * 
					 */
					for ( Dependency currentDependency : entriesToRemove ) {
						if ( currentDependency.getTo() != null )
							currentDependency.getTo().getDependents().remove(currentDependency);
						unit.getDependents().remove(currentDependency);
					}
				}
			}
			
		} finally {
			
			monitor.worked(1);
			
		}

	}

	private boolean findImportedUnit(KermetaUnit kermetaUnit, Unit unitToFind) {
		
		if ( unitToFind == null )
			return false;
		
		for ( KermetaUnit currentKermetaUnit : (List<KermetaUnit>) kermetaUnit.getImportedKermetaUnits() ) {
			IFile currentFile = ResourceHelper.getIFile(currentKermetaUnit.getUri());
			if ( (currentFile != null) && currentFile.getFullPath().toString().equals(unitToFind.getValue()) )
				return true;
		}
		return false;
	}
}