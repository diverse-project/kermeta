

/*$Id: TypecheckContext.java,v 1.2 2008-02-14 07:13:46 uid21732 Exp $
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

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;
import fr.irisa.triskell.kermeta.typechecker.CallableFeaturesCache;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

public class TypecheckContext implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args, List<Parameter> parameters) {

		try  {
			monitor.subTask("Typechecking");
			
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
				String uri = "platform:/resource" + u.getValue();
				KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit(uri);
				if ( kermetaUnit == null || kermetaUnit.isErroneous() ) {
					error = true;
					break;
				}
			}
				
			/*
			 * 
			 * If the load succeeded ie no errors, let's proceed to the type checking.
			 * 
			 */
			if ( ! error ) {
				for ( Unit u : l ) {
					String uri = "platform:/resource" + u.getValue();
					KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit(uri);
					if ( kermetaUnit != null ) {
						/*
						 * 
						 * Typechecking the unit.
						 * 
						 */
						KermetaTypeChecker typechecker = new KermetaTypeChecker(kermetaUnit);
						typechecker.checkUnit();
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
				CallableFeaturesCache.destroyInstance();
			}
		} finally {
			monitor.worked(1);
		}
	}

}


