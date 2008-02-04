

/*$Id: ConstraintCheck.java,v 1.5 2008-02-04 10:54:46 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	ConstraintCheck.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.kpm.actions.typecheck;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
public class ConstraintCheck implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args, List<Parameter> parameters) {		
		
		if ( monitor.isCanceled() )
			return;
		
		try {
			
			monitor.beginTask("", 1);
			monitor.subTask( "Constraint Checking " + unit.getValue() );

			IFile file = ResourceHelper.getIFile(unit.getValue());

			/*
			 * 
			 * Getting the Kermeta Unit.
			 * 
			 */
			KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit( "platform:/resource" + unit.getValue() );
			
			/*
			 * 
			 * If the Kermeta Unit is null, it means that the file must have already processed before.
			 * Therefore we quit.
			 * 
			 * 
			 */
			if ( kermetaUnit == null )
				return;
			
			if ( kermetaUnit.isErroneous() )
				return;
			
			/*
			 * 
			 * Checking the unit.
			 * 
			 */
			KermetaConstraintChecker checker = new KermetaConstraintChecker(kermetaUnit, new NullProgressMonitor());
			checker.checkUnit();
			
			/*
			 * 
			 * Maybe, some objects needs ths Kermeta Unit.
			 * Let's update their value.
			 * 
			 * 
			 */
			KermetaUnitHost.getInstance().updateValue(file, kermetaUnit);
			
			monitor.worked(1);
		} catch (IdNotFoundException e) {
			e.printStackTrace();
		} finally {
			
			monitor.done();
			
		}


	}

}


