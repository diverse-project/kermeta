

/*$Id: ConstraintCheck.java,v 1.3 2007-07-02 14:03:06 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	ConstraintCheck.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.kpm.actions.typecheck;

import java.util.Date;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.utils.KermetaUnitHelper;

public class ConstraintCheck implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map args) {
		
		
		if ( monitor.isCanceled() )
			return;
		
		try {
			
			monitor.beginTask("", 1);
			monitor.subTask( "Constraint Checking " + unit.getValue() );
			
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
			if ( (kermetaUnit == null) || kermetaUnit.messages.unitHasError )
				return;
			
			/*
			 * 
			 * Checking the unit.
			 * 
			 */
			KermetaConstraintChecker checker = new KermetaConstraintChecker(kermetaUnit);
			checker.checkUnit();
			
			/*
			 * 
			 * Maybe, some objects needs ths Kermeta Unit.
			 * Let's update their value.
			 * 
			 * 
			 */
			KermetaUnitHost.getInstance().update(unit, kermetaUnit);
			
			monitor.worked(1);
			
		} finally {
			
			monitor.done();
			
		}


	}

}


