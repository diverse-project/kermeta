

/*$Id: TypecheckContext.java,v 1.5 2008-05-28 09:25:09 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	TypecheckContext.java
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kpm.IAction;
import org.kermeta.kpm.KPMPlugin;
import org.kermeta.kpm.KpmManager;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

public class TypecheckContext implements IAction {

	@SuppressWarnings("unchecked")
	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor) {
		List<Unit> l = null;
		try  {
			monitor.subTask("Typechecking");
			
			/*
			 * 
			 * Getting the list of units to reload.
			 * 
			 */
			l = (List<Unit>) args.get("context");
			
			/*
			 * 
			 * We are going to work on a copy because we update the list at the same time.
			 * 
			 */
			List<Unit> copy = new ArrayList<Unit>(l);
			
			for ( Unit currentUnit : copy ) {
				/*
				 * 
				 * Getting the corresponding kermeta unit.
				 * 
				 */
				KermetaUnit kermetaUnit = IOPlugin.getDefault().getKermetaUnit(currentUnit.getName());
				
				/*
				 * 
				 * Getting the list of kermeta units.
				 * 
				 */
				List<KermetaUnit> kl = new ArrayList<KermetaUnit>();
				kl.add(kermetaUnit);
				kl.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) );
				
				/*
				 * 
				 * Typecheck and Constraintcheck every kermeta units.
				 * 
				 */
				for ( KermetaUnit kunit : kl ) {
					/*
					 * 
					 * Updating the context.
					 * 
					 */
					if ( ! kunit.isFramework() ) {
						Unit u = KpmManager.getDefault().getUnit( kunit.getUri() );
						if ( u != null && ! l.contains(u) )
							l.add(u);
					}
					
					try {
						if ( ! kunit.isErroneous() ) {
							KermetaTypeChecker typechecker = new KermetaTypeChecker(kunit);
							typechecker.checkUnit();
							if ( ! kunit.isErroneous() ) {
								KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker(kunit);
								constraintchecker.checkUnit();
							}
						}
					} catch(Exception e){
						if(l == null)
							KPMPlugin.logErrorMessage("Error getting 'context' in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
						else
							KPMPlugin.logErrorMessage("Error in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
						
					}
				}
				
			}
		} catch(Exception e) {
			if(l == null)
				KPMPlugin.logErrorMessage("Error getting 'context' in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
			else
				KPMPlugin.logErrorMessage("Error in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
			
		}  finally {
			monitor.worked(1);
		}
	}

}


