

/*$Id: UnloadContext.java,v 1.4 2008-05-28 09:25:09 ftanguy Exp $
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
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kpm.IAction;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.Usage;
import fr.irisa.triskell.kermeta.kpm.Out;
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

	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor) {

		try {
			monitor.subTask("Unloading Context");
			
			/*
			 * 
			 * Getting the units to unload and unload them.
			 * 
			 */
			List<Unit> l = getUnitsToUnload(unit, "require");
			args.put("context", l);
	 		for ( Unit u : l ) {
	 			/*
	 			 * 
	 			 * Unloading kermeta units from the memory.
	 			 * 
	 			 */
	 			IOPlugin.getDefault().unload(u.getName());
	 			
	 			//LoaderPlugin.getDefault().unload(u.getName());
	 			/*
	 			 * 
	 			 * Removing markers.
	 			 * 
	 			 */
	 			IFile file = ResourceHelper.getIFile(u.getName());
	 			KermetaMarkersHelper.clearMarkers(file);
	 		}
	 		
		} finally {
			monitor.worked(1);
		}
	}
	
	private List<Unit> getUnitsToUnload(Unit base, String type) {
		List<Unit> l = new ArrayList<Unit>();
		getUnitsToUnload(base, l, type);
		return l;
	}
	
	private void getUnitsToUnload(Unit currentUnit, List<Unit> l, String type) {
		if ( ! l.contains(currentUnit) ) {
			l.add(currentUnit);
			for ( Usage d : currentUnit.getUsedBy() )
				if ( d.getType().equals(type) )
					getUnitsToUnload(d.getUserUnit(), l, type);
		}
	}

}


