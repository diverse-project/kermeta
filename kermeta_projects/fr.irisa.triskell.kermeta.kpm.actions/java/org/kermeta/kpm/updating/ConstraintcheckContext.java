

/*$Id: ConstraintcheckContext.java,v 1.3 2008-05-28 09:25:09 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	TypecheckContext.java
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
import org.kermeta.kpm.IAction;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;

public class ConstraintcheckContext implements IAction {

	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor) {

		try  {
			monitor.subTask("Constraint Checking");
			
			/*
			 * 
			 * Getting the list of units to reload.
			 * 
			 */
			@SuppressWarnings("unchecked")
			List<Unit> l = (List<Unit>) args.get("context");
			
			/*
			 * 
			 * First pass to check if one unit is erroneous.
			 * 
			 */
			boolean error = false;
			for ( Unit u : l ) {
				String uri = "platform:/resource" + u.getName();
				KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit(uri);
				if ( kermetaUnit == null || kermetaUnit.isErroneous() ) {
					error = true;
					break;
				}
			}
				
			/*
			 * 
			 * If the type checking succeeded ie no errors, let's proceed to the constraint checking.
			 * 
			 */
			if ( ! error ) {
				for ( Unit u : l ) {
					String uri = "platform:/resource" + u.getName();
					KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit(uri);
					if ( kermetaUnit != null && ! kermetaUnit.isErroneous() ) {
						/*
						 * 
						 * Constraint checking the unit.
						 * 
						 */
						KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker(kermetaUnit);
						constraintchecker.checkUnit();
						/*
						 * 
						 * Marking errors if there are some.
						 * 
						 */
						if (kermetaUnit.isErroneous() ) {
							IFile file = ResourceHelper.getIFile(uri);
							KermetaMarkersHelper.createMarkers(file, kermetaUnit);
						}
					} else {
						// The kermeta unit has not been found.
						// That is strange maybe should warn.
					}
				}
			}
				
		} finally {
			monitor.worked(1);
		}
	}

}


