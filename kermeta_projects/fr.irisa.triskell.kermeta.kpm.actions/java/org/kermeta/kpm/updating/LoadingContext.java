

/*$Id: LoadingContext.java,v 1.7 2008-08-06 14:13:41 dvojtise Exp $
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
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kpm.IAction;
import org.kermeta.kpm.KermetaUnitHost;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.plugin.KPMActions;

public class LoadingContext implements IAction {

	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor) {

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
			for ( Unit u : l ) {
				try {
					LoaderPlugin.getDefault().load(u.getName(), args);
					IFile file = ResourceHelper.getIFile( u.getName() );
					KermetaUnit newValue = IOPlugin.getDefault().getKermetaUnit( u.getName() );
					KermetaUnitHost.getInstance().updateValue(file, newValue);	

				} catch (URIMalformedException e) {
					KPMActions.log.warn("Exception while loading " + u.getName(),e);
				} catch (NotRegisteredURIException e) {
					KPMActions.log.warn("Exception while loading " + u.getName(),e);
				} catch (IdNotFoundException e) {
					KPMActions.log.warn("Exception while loading " + u.getName(),e);
				}
			}
			
			/*
			 * 
			 * In the arguments can be found the content of the file to be typechecked, but only for the one wich received the update event.
			 * So when the load has been processed for it, we must remove the content from the args.
			 * This file is always the first to be processed.
			 * 
			 */
			args.remove("content");
		} finally {
			monitor.worked(1);
		}
	}

}


