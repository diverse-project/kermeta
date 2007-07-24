/*$Id: AddMarkers.java,v 1.10 2007-07-24 13:46:35 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	AddMarkers.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.actions.marker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.extension.Interest;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.helpers.NameFilterHelper;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;

public class AddMarkers implements IAction, Interest {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map args) {
		
		if ( monitor.isCanceled() )
			return;
		
		try {
		
			monitor.beginTask("", 1);
			monitor.subTask("Adding Markers to " + unit.getValue());
			
			/*
			 * 
			 * Getting the Kermeta Unit.
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
			 * Clearing markers. Depending the Kermeta Unit, markers may be added.
			 * 
			 */
			IFile file = ResourceHelper.getIFile(unit.getValue());
			if ( file == null )
				return;
			KermetaMarkersHelper.clearMarkers(file);
			ArrayList<Unit> markedUnits = new ArrayList<Unit> ();
			markDependent(out, file, unit, unit, markedUnits, false);

			
			/*
			 * 
			 * We will need the project to take a decision.
			 * 
			 */
			IProject project = file.getProject();
			QualifiedName key = new QualifiedName("fr.irisa.triskell.kermeta.kpm", "applyRequireDependencies");
			
			
			/*
			 * 
			 * Updating dependent units may result in a deadlock.
			 * So updated units must be stored to avoid deadlock.
			 * 
			 * 
			 */
			HashMap map = new HashMap();
			List<Unit> updatedUnits = new ArrayList<Unit> ();
			if ( args != null ) {
				updatedUnits = (List) args.get("updatedUnits");
				if ( updatedUnits == null )
					updatedUnits  = new ArrayList<Unit> ();
				map.put("updatedUnits", updatedUnits);
			}
			
			
			/*
			 * 
			 * If file does not contain errors, then dependent files need an update.
			 * Avoiding deadlock by checking if the unit has already been updated.
			 * 
			 * 
			 */
			if ( ! kermetaUnit.isErrored() ) {
				
				Iterator<Dependency> iterator = unit.getDependents().iterator();
				while ( iterator.hasNext() ) {
					Unit currentUnit = iterator.next().getFrom();
					if ( ! updatedUnits.contains(currentUnit) ) {
						KermetaUnitHost.getInstance().declareInterest(this, currentUnit);
						map.put("forceTypechecking", true);
						
						/*
						 * 
						 * If the require properties is set to true, let's process them.
						 * 
						 */
						try {
							if ( Boolean.parseBoolean(project.getPersistentProperty(key)) == true )
								currentUnit.receiveSynchroneEvent("update", map, monitor);
						} catch (CoreException e) {}
						
						KermetaUnitHost.getInstance().undeclareInterest(this, currentUnit);
					}
				}
				
			}
			
			
			/*
			 * 
			 * If file does contain error, then dependent files must also be marked as erroneous.
			 * 
			 * 
			 */
			else {
				KermetaMarkersHelper.createMarkers(file, kermetaUnit);
				markedUnits.clear();
				try {
					markDependent(out, file, unit, unit, markedUnits, true);
				} catch (URIMalformedException e) {
					e.printStackTrace();
				}				
			}
			
			monitor.worked(1);
			
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} finally {
			
			monitor.done();
			
		}
			

	}

	private void markDependent(Out out, IFile first, Unit top, Unit unit, List<Unit> markedUnits, boolean adding) throws URIMalformedException {
		
		if ( markedUnits.contains(unit) )
			return;
		
		String message = "File " + first.getFullPath().toString() + " contains error(s).\n";
		KermetaUnit kermetaUnit = IOPlugin.getDefault().getKermetaUnit( "platform:/resource" + first.getFullPath().toString());
		message += KermetaUnitHelper.getAllErrorsAsString(kermetaUnit);
		
		if ( top != unit ) {
		
			IFile currentFile = ResourceHelper.getIFile( unit.getValue() );
			
			if ( adding ) 
				KermetaMarkersHelper.createError(currentFile, message);
			else 
				KermetaMarkersHelper.removeMarker(currentFile, message);
		
		}
			
		markOuts(out, unit, message, adding);
		markedUnits.add(unit);
		
		Iterator<Dependency> iterator = unit.getDependents().iterator();
		while ( iterator.hasNext() ) {
			Dependency dependency = iterator.next();
			markDependent(out, first, top, dependency.getFrom(), markedUnits, adding);
		}
		
		
		/*try {
			IMarker[] markers = currentFile.findMarkers(KermetaMarkersHelper.getMarkerType(), true, 0);
			boolean found = false;
			int index = 0;
			while ( ! found && (index<markers.length) ) {
				IMarker currentMarker = markers[index];
				String markerMessage = ((String) currentMarker.getAttribute("message")).replace("\n", "");
				if ( markerMessage.equals(message) )
					found = true;
				index++;
			}
			if ( ! found ) {
				KermetaMarkersHelper.createMarker(currentFile, message);
				Iterator<DependencyEntry> iterator = unit.getDependentUnits().iterator();
				while ( iterator.hasNext() ) {
					DependencyEntry entry = iterator.next();
					markDependent(out, first, entry.getUnit());
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	private void markOuts(Out out, Unit unit, String message, boolean adding) {
		Iterator<Out> iterator = out.getRule().getOuts().iterator();
		while ( iterator.hasNext() ) {
			Out currentOut = iterator.next();
			String outputString = NameFilterHelper.getOuputString(unit, currentOut);
			if ( ! outputString.equals("") ) {
				IFile file = ResourceHelper.getIFile(outputString);
				if ( file != null )
					if ( adding )
						KermetaMarkersHelper.createError(file, message);
					else
						KermetaMarkersHelper.removeMarker(file, message);
			}
		}
	}

	public void updateValue(Object newValue) {
		// TODO Auto-generated method stub
		
	}
	
}
