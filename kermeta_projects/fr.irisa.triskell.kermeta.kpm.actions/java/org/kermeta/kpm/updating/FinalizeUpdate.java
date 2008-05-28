

/*$Id: FinalizeUpdate.java,v 1.3 2008-05-28 09:25:09 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	FinalizeUpdate.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 févr. 08
* Authors : paco
*/

package org.kermeta.kpm.updating;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.kpm.IAction;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;

public class FinalizeUpdate implements IAction {

	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor) {

		try {
			/*
			 * 
			 * Getting the list of units to reload.
			 * 
			 */
			@SuppressWarnings("unchecked")
			List<Unit> l = (List<Unit>) args.get("context");
			
			for ( Unit u : l ) {
				/*
				 * 
				 * Set the right timestamps to mark this unit as processed.
				 * 
				 */
				IFile file = ResourceHelper.getIFile(u.getName());
				u.setLastTimeModified( new Date(file.getLocalTimeStamp()) );
			}		
		} finally {
			monitor.done();
		}
		
	}

}


