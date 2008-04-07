

/*$Id: LoadingContext.java,v 1.3 2008-04-07 14:54:00 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm.actions
* File : 	LoadingContext.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 févr. 08
* Authors : paco
*/

package org.kermeta.kpm.updating;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.interest.exception.IdNotFoundException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.extension.IAction;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Parameter;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.hosting.KermetaUnitHost;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.resources.KermetaMarkersHelper;

public class LoadingContext implements IAction {

	public void execute(Out out, Unit unit, IProgressMonitor monitor, Map<String, Object> args, List<Parameter> parameters) {

		try {
			monitor.subTask("Loading Context");
								
			/*
			 * 
			 * Preparing the options for the loader.
			 * 
			 */
			if ( args == null )
				args = new HashMap<String, Object>();
			args.put( LoadingOptions.ECORE_QuickFixEnabled, true );
			
			/*
			 * 
			 * Getting the list of units to reload.
			 * 
			 */
			@SuppressWarnings("unchecked")
			List<Unit> l = (List<Unit>) args.get("context");
			
			/*
			 * 
			 * For the units of the context load the kermeta unit.
			 * There should be only one.
			 * 
			 */
			KermetaUnit kermetaUnit = null;
			for ( Unit u : l ) {
				String uri = "platform:/resource" + u.getValue();
				kermetaUnit = LoaderPlugin.getDefault().load(uri, args);
			}
			
			/*
			 * 
			 * In the arguments can be found the content of the file to be typechecked, but only for the one wich received the update event.
			 * So when the load has been processed for it, we must remove the content from the args.
			 * This file is always the first to be processed.
			 * 
			 */
			args.remove("content");
			
			List<KermetaUnit> k = KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit);
			k.add(kermetaUnit);
			// The load may have created some new kermeta unit, let's put them in the context
			for ( KermetaUnit currentUnit : k ) {
				KPM kpm = (KPM) unit.eContainer();
				Unit u = kpm.findUnit( currentUnit.getUri().replace("platform:/resource", "") );
				if ( u != null ) {
					l.add( u );
					/*
					 * 
					 * Marking errors if there are some.
					 * 
					 */
					if (kermetaUnit.isErroneous() ) {
						IFile file = ResourceHelper.getIFile( currentUnit.getUri() );
						KermetaMarkersHelper.createMarkers(file, kermetaUnit);
					} else {
						/*
						 * 
						 * Update the interested object about the new kermeta unit.
						 * 
						 */
						IFile file = ResourceHelper.getIFile( currentUnit.getUri() );
						KermetaUnitHost.getInstance().updateValue(file, kermetaUnit);
					}
				}
			}
			
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
		} catch (IdNotFoundException e) {
			// We do not care about. Nobody is interested in the unit.
		} finally {
			monitor.worked(1);
		}
	}

}


