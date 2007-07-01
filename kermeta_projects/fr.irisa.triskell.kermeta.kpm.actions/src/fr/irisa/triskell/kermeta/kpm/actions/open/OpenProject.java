package fr.irisa.triskell.kermeta.kpm.actions.open;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.extension.Interest;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.NameFilterHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.utils.KermetaUnitHelper;

public class OpenProject implements IAction, Interest {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map args) {

		try {
						
			KPM kpm = (KPM) unit.eContainer();	
			monitor.beginTask("", kpm.getUnits().size() );
			monitor.subTask("Opening Kermeta Project " + unit.getValue());
			
			/*
			 * 
			 * Getting optional arguments.
			 * 
			 * 
			 */
			boolean forceOpening = false;
			if ( args != null ) {
				Boolean value = (Boolean) args.get("forceOpening");
				if ( value != null ) {
					forceOpening = value;
				}
			}
			
			
			/*
			 * 
			 * Updating dependent units may result in a deadlock.
			 * So updated units must be stored to avoid deadlock.
			 * 
			 * 
			 */
			Map map = new HashMap();
			List<Unit> updatedUnits = new ArrayList<Unit> ();
			map.put("updatedUnits", updatedUnits);
			
	
			KermetaUnitHelper.unloadAllKermetaUnit();
			
			/*
			 * 
			 * For each unit of the project, we check if the update dependency is 
			 * satisfied or not.
			 * 
			 * 
			 * 
			 */
			// Here the list of units is copied because during the process, some units can be added
			// wich can lead a concurrent modification exception.
			List <Unit> copy = new ArrayList( kpm.getUnits() );
			Iterator<Unit> iterator = copy.iterator();
			while ( iterator.hasNext() ) {
				
				Unit currentUnit = iterator.next();
				
				/*
				 * 
				 * Getting the Update Dependency.
				 * 
				 * 
				 */
				Rule updateRule = currentUnit.findRule("update");

				
				/*
				 * 
				 * If Update Dependency is not satisfied, let's update the unit.
				 * We declare an interest for the current unit so that the kermeta unit
				 * will be accessible in every others actions.
				 * 
				 * 
				 */
				if ( forceOpening ||
					(updateRule != null) && ! isUpdateDependencySatisfied(updateRule, currentUnit) ) {
					
					if ( ! updatedUnits.contains(currentUnit) ) {
					
						if ( monitor.isCanceled() )
							return;
						
						KermetaUnitHelper.unloadAllKermetaUnit();
						
						KermetaUnitHost.getInstance().declareInterest(this, currentUnit);
						map.put("forceTypechecking", true);
						currentUnit.receiveSynchroneEvent("update", map, new SubProgressMonitor(monitor, 0) );
						KermetaUnit kermetaUnit = KermetaUnitHost.getInstance().getValue(currentUnit);
						if ( kermetaUnit != null )
							markAsUpdated(currentUnit, kermetaUnit, updatedUnits, kpm);
						KermetaUnitHost.getInstance().undeclareInterest(this, currentUnit);
						
					}
				}
				
				monitor.worked(1);
				
			}	
			
			/*
			 * 
			 * Modifications have been done. They must be saved.
			 * 
			 * 
			 */
			KermetaProject project = KermetaWorkspace.getInstance().getKermetaProject(unit.getValue());
			project.save();
			
		} finally {
			monitor.done();
		}
		
	}

	
	private boolean isUpdateDependencySatisfied(Rule rule, Unit unit) {
		boolean satisfied = true;
		/*
		 * 
		 * A dependency is not satisfied if one out is not satisfied.
		 * So we look for one unsatisfied out.
		 * 
		 * 
		 */
		Iterator<Out> iterator = rule.getOuts().iterator();
		while ( satisfied && iterator.hasNext() ) {
			Out currentOut = iterator.next();
			String outputString = NameFilterHelper.getOuputString(unit,currentOut);
			/*
			 * 
			 * An out may not result in an other file.
			 * Consequently, if outputString is empty string there is no dependent file.
			 * 
			 * 
			 */
			if ( ! outputString.equals("") ) {
				IFile dependentFile = ResourceHelper.getIFile( outputString );
				IFile currentFile = ResourceHelper.getIFile( unit.getValue() );

				if ( currentOut.evaluate(unit) && dependentFile.getLocalTimeStamp() < currentFile.getLocalTimeStamp() )
					satisfied = false;
				
			}	
			
		}
		
		return satisfied;
	}


	private void markAsUpdated(Unit unit, KermetaUnit kermetaUnit, List<Unit> updatedUnits, KPM kpm) {

		updatedUnits.add(unit);
		/*for ( KermetaUnit currentKermetaUnit : kermetaUnit.importedUnits ) {
			if ( ! currentKermetaUnit.getUri().equals(StdLibKermetaUnitHelper.STD_LIB_URI) ) {
				IFile file = ResourceHelper.getIFileFromAbsoluteName( currentKermetaUnit.getUri() );
				Unit currentUnit = kpm.findUnit(file.getFullPath().toString());
				if ( (currentUnit != null) && ! updatedUnits.contains(currentUnit) ) {
					System.out.println(currentKermetaUnit.getUri());
					KermetaUnitHost.getInstance().declareInterest(this, currentUnit);
					KermetaUnitHost.getInstance().update(currentUnit, currentKermetaUnit);
					HashMap map = new HashMap();
					map.put("updatedUnits", updatedUnits);
					
*/
					/*
					 * 
					 * Sometimes an imported Kermeta Unit could not have been loaded and type checked 
					 * because of previous errors in others imported files. Then if the Kermeta Unit is already typechecked
					 * the typechecking action can be bypassed by changing the modification date.
					 * 
					 * 
					 */
			/*		if ( currentKermetaUnit.isType_checked() )
						currentUnit.setLastTimeModified( new Date(file.getLocalTimeStamp()) );
					
					currentUnit.receiveSynchroneEvent("update", map);
					KermetaUnitHost.getInstance().undeclareInterest(this, currentUnit);
					markAsUpdated(currentUnit, currentKermetaUnit, updatedUnits, kpm);
				}
			}
		}*/
		
	}
	
	
	public void updateValue(Object newValue) {
		// Do nothing
	}
	
}
