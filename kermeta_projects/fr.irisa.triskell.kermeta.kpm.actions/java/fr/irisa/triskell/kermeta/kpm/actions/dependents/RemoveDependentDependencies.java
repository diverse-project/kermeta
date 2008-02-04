/*$Id: RemoveDependentDependencies.java,v 1.5 2008-02-04 10:54:46 ftanguy Exp $
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
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;


public class RemoveDependentDependencies implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args, List<Parameter> parameters) {
		
		if ( monitor.isCanceled() )
			return;
		
		try {
		
			monitor.beginTask("", 1);
			monitor.subTask("Removing Dependent Dependencies for " + unit.getValue());
									
			/*
			 * 
			 * Getting the Kermeta Unit.
			 * 
			 * 
			 */
			KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit( "platform:/resource" + unit.getValue() );
			
			
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
				if ( ! findImportedUnit(kermetaUnit, currentDependency.getTo(), monitor) )
					entriesToRemove.add(currentDependency);
			}
			
			
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
			
			monitor.worked(1);
			
		} finally {
			
			monitor.done();
			
		}

	}

	private boolean findImportedUnit(KermetaUnit kermetaUnit, Unit unitToFind,IProgressMonitor monitor) {
		
		if ( unitToFind == null )
			return false;
		
		
		if ( monitor.isCanceled() )
			return false;
			
		for ( KermetaUnit currentKermetaUnit : (List<KermetaUnit>) kermetaUnit.getImportedKermetaUnits() ) {
			IFile currentFile = ResourceHelper.getIFile(currentKermetaUnit.getUri());
			if ( (currentFile != null) && currentFile.getFullPath().toString().equals(unitToFind.getValue()) )
				return true;
		}
		return false;
	}
}