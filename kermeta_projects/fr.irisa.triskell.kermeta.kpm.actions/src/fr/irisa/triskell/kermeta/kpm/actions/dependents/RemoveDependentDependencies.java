/*$Id: RemoveDependentDependencies.java,v 1.2 2007-04-13 14:46:10 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
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
import fr.irisa.triskell.kermeta.kpm.DependencyEntry;
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
			ArrayList<DependencyEntry> entriesToRemove = new ArrayList<DependencyEntry> ();
			Iterator<DependencyEntry> iterator = unit.getDependsOnUnits().iterator();
			while ( iterator.hasNext() ) {
				DependencyEntry currentDependencyEntry = iterator.next();
				if ( ! findImportedUnit(kermetaUnit, currentDependencyEntry.getUnit()) )
					entriesToRemove.add(currentDependencyEntry);
			}
			
			
			/*
			 * 
			 * Remove the found entries.
			 * 
			 * 
			 */
			for ( DependencyEntry currentDependencyEntry : entriesToRemove ) {
				unit.getDependsOnUnits().remove(currentDependencyEntry);
				DependencyEntry entryToRemove = currentDependencyEntry.getUnit().findDependentUnit("require", unit);
				currentDependencyEntry.getUnit().getDependentUnits().remove(entryToRemove);	
			}
			

	}

	private boolean findImportedUnit(KermetaUnit kermetaUnit, Unit unitToFind) {
		for ( KermetaUnit currentKermetaUnit : kermetaUnit.importedUnits ) {
			IFile currentFile = ResourceHelper.getIFileFromAbsoluteName(currentKermetaUnit.getUri());
			if ( currentFile.getFullPath().toString().equals(unitToFind.getValue()) )
				return true;
		}
		return false;
	}
}