package fr.irisa.triskell.kermeta.kpm.actions;

import java.util.ArrayList;
import java.util.Hashtable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.wizard.ProgressMonitorPart;

import fr.irisa.triskell.kermeta.kpm.workspace.IAction;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaProject;
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
				KermetaWorkspace.getInstance().updateFile(changer);

			monitor.worked(1);
						
		} finally {
			monitor.done();
		}

	}

}
