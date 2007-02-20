

/*$Id: Typecheck.java,v 1.3 2007-02-20 14:25:01 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.kermeta.kpm.workspace.IAction;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaUnitInterest;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;

public class Typecheck implements IAction {

	/**
	 * When calling this method, we know that the unit is a kmt file and there is only one ecore file dependent.
	 */
	public void execute(Unit unit, ArrayList<String> dependents, Hashtable params, IProgressMonitor monitor) {
		
		try {
			monitor.subTask("Typechecking " + unit.getName() );
			
			KermetaUnitInterest changer = (KermetaUnitInterest) params.get("changer");
			
			if ( changer != null )
				KermetaWorkspace.getInstance().updateKermetaUnit(changer);

			monitor.worked(1);
						
		} finally {
			monitor.done();
		}

	}

}
