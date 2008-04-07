

/*$Id: UnloadContext.java,v 1.3 2008-04-07 14:54:00 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	UnloadContext.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 févr. 08
* Authors : paco
*/

package org.kermeta.kpm.updating;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.loader.plugin.LoaderPlugin;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.RuleType;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;

/**
 * 
 * Given a file, let's unload its kermeta unit and all importers.
 * 
 * @author paco
 *
 */
public class UnloadContext implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args, List<Parameter> parameters) {

		try {
			monitor.subTask("Unloading Context");
					
			/*
			 * 
			 * Getting kpm.
			 * 
			 */
			KPM kpm = (KPM) unit.eContainer();
			
			/*
			 * 
			 * Getting the require rule type.
			 * 
			 */
			RuleType type = kpm.getRuleType("require");
			
			/*
			 * 
			 * Getting the units to unload and unload them.
			 * 
			 */
			List<Unit> l = getUnitsToUnload(unit, type);
			// Storing the list of units in order to reuse it in the next actions.
			List<Unit> c = new ArrayList<Unit>();
			args.put("context", c);
	 		for ( Unit u : l ) {
	 			/*
	 			 * 
	 			 * Unloading kermeta units from the memory.
	 			 * 
	 			 */
	 			String uri = "platform:/resource" + u.getValue();
	 			LoaderPlugin.getDefault().unload(uri);
	 			/*
	 			 * 
	 			 * Removing markers.
	 			 * 
	 			 */
	 			IFile file = ResourceHelper.getIFile(uri);
	 			KermetaMarkersHelper.clearMarkers(file);
	 			
	 			if ( u.equals(unit) )
	 				c.add(u);
	 		}
	 		
		} finally {
			monitor.worked(1);
		}
	}
	
	private List<Unit> getUnitsToUnload(Unit base, RuleType type) {
		List<Unit> l = new ArrayList<Unit>();
		getUnitsToUnload(base, l, type);
		return l;
	}
	
	private void getUnitsToUnload(Unit currentUnit, List<Unit> l, RuleType type) {
		if ( ! l.contains(currentUnit) ) {
			l.add(currentUnit);
			for ( Dependency d : currentUnit.getDependents() )
				if ( d.getType().equals(type) )
					getUnitsToUnload(d.getFrom(), l, type);
		}
	}

}


