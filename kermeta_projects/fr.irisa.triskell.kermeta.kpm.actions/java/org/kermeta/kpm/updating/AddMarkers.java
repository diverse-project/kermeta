

/*$Id: AddMarkers.java,v 1.2 2008-02-14 07:13:46 uid21732 Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	AddMarkers.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 févr. 08
* Authors : paco
*/

package org.kermeta.kpm.updating;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;

public class AddMarkers implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args, List<Parameter> parameters) {

		try {
			monitor.subTask("Adding Markers");
			
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
					IFile file = ResourceHelper.getIFile(uri);
					KermetaMarkersHelper.clearMarkers(file);
					KermetaMarkersHelper.createMarkers(file, kermetaUnit);
				} else {
					// The kermeta unit has not been found.
					// That is strange maybe should warn.
				}
			}
			
		} finally {
			monitor.worked(1);
		}
		
	}

}


