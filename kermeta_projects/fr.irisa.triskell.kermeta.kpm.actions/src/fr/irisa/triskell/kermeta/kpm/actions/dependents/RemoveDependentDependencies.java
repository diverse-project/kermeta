/*$Id: RemoveDependentDependencies.java,v 1.4 2007-05-15 15:22:45 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	RemoveDependentDependencies.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.actions.dependents;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;


public class RemoveDependentDependencies implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map args) {
			
			if ( monitor.isCanceled() )
				return;
			
			monitor.subTask("Removing Dependent Dependencies for " + unit.getValue());
			
			
			
			/*
			 * 
			 * Getting the Kermeta Unit.
			 * 
			 * 
			 */
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
			 * Getting the entries to remove.
			 * 
			 * 
			 */
			ArrayList<Dependency> entriesToRemove = new ArrayList<Dependency> ();
			Iterator<Dependency> iterator = unit.getDependencies().iterator();
			while ( iterator.hasNext() ) {
				Dependency currentDependency = iterator.next();
				if ( ! findImportedUnit(kermetaUnit, currentDependency.getTo()) )
					entriesToRemove.add(currentDependency);
			}
			
			
			/*
			 * 
			 * Remove the found entries.
			 * 
			 * 
			 */
			for ( Dependency currentDependency : entriesToRemove ) {
				currentDependency.getTo().getDependents().remove(currentDependency);
				unit.getDependents().remove(currentDependency);
			}
			

	}

	private boolean findImportedUnit(KermetaUnit kermetaUnit, Unit unitToFind) {
		for ( KermetaUnit currentKermetaUnit : kermetaUnit.importedUnits ) {
			IFile currentFile = ResourceHelper.getIFile(currentKermetaUnit.getUri());
			if ( currentFile.getFullPath().toString().equals(unitToFind.getValue()) )
				return true;
		}
		return false;
	}
}