

/*$Id: FinalizeUpdate.java,v 1.2 2008-02-14 07:13:46 uid21732 Exp $
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

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;

public class FinalizeUpdate implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args, List<Parameter> parameters) {

		try {
			/*
			 * 
			 * Getting the list of units to reload.
			 * 
			 */
			@SuppressWarnings("unchecked")
			List<Unit> l = (List<Unit>) args.get("context");
			
			for ( Unit u : l ) {
				String uri = "platform:/resource" + u.getValue();
				/*
				 * 
				 * Set the right timestamps to mark this unit as processed.
				 * 
				 */
				IFile file = ResourceHelper.getIFile(uri);
				u.setLastTimeModified( new Date(file.getLocalTimeStamp()) );
			}
			
	 		/*
	 		 * 
	 		 * Saving the kpm file.
	 		 * 
	 		 */
	 		IFile file = ResourceHelper.getIFile( "platform:/resource" + unit.getValue() );
	 		KermetaProject project = KermetaWorkspace.getInstance().getKermetaProject( file.getProject() );
	 		project.save();

		} finally {
			monitor.done();
		}
		
	}

}


