

/*$Id: TypecheckContext.java,v 1.6 2008-06-10 11:41:03 ftanguy Exp $
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.cachemanager.KermetaUnitStore;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kpm.IAction;
import org.kermeta.kpm.KPMPlugin;
import org.kermeta.kpm.KermetaUnitHost;
import org.kermeta.kpm.KpmManager;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;

public class TypecheckContext implements IAction {

	@SuppressWarnings("unchecked")
	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor) {
		List<Unit> l = null;
		try  {
			monitor.subTask("Typechecking");
			KermetaUnitStore store = IOPlugin.getDefault().getEditionKermetaUnitStore(); 
			
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
			
			List<KermetaUnit> kl = new ArrayList<KermetaUnit>();
			
			for ( Unit currentUnit : copy ) {
				/*
				 * 
				 * Getting the corresponding kermeta unit.
				 * 
				 */
				KermetaUnit kermetaUnit = store.get(currentUnit.getName());
				
				/*
				 * 
				 * Getting the list of kermeta units.
				 * 
				 */
				
				kl.add(kermetaUnit);
			//	kl.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) );
			}	
				/*
				 * Typecheck and Constraintcheck every kermeta units. 
				 */
				HashMap<String, Object> options = new HashMap<String, Object>();
				// additional options for loading the framework
				options.put(LoadingOptions.FRAMEWORK_LOADING, true);
				options.put( LoadingOptions.ECORE_QuickFixEnabled, true );
				// get the framework and the Typechecker context associated to it if it already exist
				// TypeCheckerContext typecheckercontext = store.get(IOPlugin.getFrameWorkURI(), options).getTypeCheckerContext();
				// if (typecheckercontext == null)
				//	typecheckercontext = new TypeCheckerContext(store.get(IOPlugin.getFrameWorkURI(), options));
				//TypeCheckerContext typecheckercontext = new TypeCheckerContext(store.get(IOPlugin.getFrameWorkURI(), options));
				
				/* Merger merger = new Merger();
				Set<KermetaUnit> unitset = new HashSet<KermetaUnit>();
				unitset.addAll(kl);
				KermetaUnit mergedUnit = merger.processInMemory(unitset, "platform:/resource/merged_in_memory.km");
				TypeCheckerContext typecheckercontext1 = new TypeCheckerContext(mergedUnit);
				try {
					if ( ! mergedUnit.isErroneous() ) {
						
						KermetaTypeChecker typechecker = new KermetaTypeChecker(mergedUnit, typecheckercontext1);
						typechecker.checkUnit();
						if ( ! mergedUnit.isErroneous() ) {
							KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker(mergedUnit);
							constraintchecker.checkUnit();
						}
						IFile file = ResourceHelper.getIFile( mergedUnit.getUri() );
						KermetaUnitHost.getInstance().updateValue(file, mergedUnit);			
					}
				} catch (IdNotFoundException e) {
				} catch(Exception e){
					if(l == null)
						KPMPlugin.logErrorMessage("Error getting 'context' in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
					else
						KPMPlugin.logErrorMessage("Error in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
					
				} */
				
				for ( KermetaUnit kunit : kl ) {
					TypeCheckerContext typecheckercontext = new TypeCheckerContext(kunit);
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
							//IOPlugin.getDefault().getKermetaUnit(kunit.getUri()); // make sure this have been loaded in the current context
							
							
							
							KermetaTypeChecker typechecker = new KermetaTypeChecker(kunit, typecheckercontext);
							typechecker.checkUnit();
							if ( ! kunit.isErroneous() ) {
								KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker(kunit);
								constraintchecker.checkUnit();
							}
							IFile file = ResourceHelper.getIFile( kunit.getUri() );
							KermetaUnitHost.getInstance().updateValue(file, kunit);			
						}
					} catch (IdNotFoundException e) {
					} catch(Exception e){
						if(l == null)
							KPMPlugin.logErrorMessage("Error getting 'context' in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
						else
							KPMPlugin.logErrorMessage("Error in the kpm file. Maybe due to an out of date version of '.project.kpm'", e);
						
					}
				}
				
			//}
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


