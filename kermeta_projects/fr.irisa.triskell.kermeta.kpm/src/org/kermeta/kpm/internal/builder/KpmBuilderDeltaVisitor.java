

/*$Id: DeltaVisitor.java,v 1.3 2008-06-03 07:43:58 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	DeltaVisitor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.kpm.EventDispatcher;
import org.kermeta.kpm.KpmManager;

import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * A visitor for changes event. Depending on the event, it looks for a unit corresponding to the resource that has changed
 * and send a proper kpm event or add/remove it from the kpm model.
 * 
 * The visit is monitored so at any time the process can be cancelled.
 * 
 * It is trigerred on Building Projects having the KpmBuilder command
 * 
 * @author paco
 *
 */
public class KpmBuilderDeltaVisitor extends UnitCreator implements IResourceDeltaVisitor {

	/**
	 * The monitor used for visiting the delta.
	 */
	private IProgressMonitor _monitor;
	
	/**
	 * 
	 * @param monitor
	 */
	public KpmBuilderDeltaVisitor(KPM kpm, IProgressMonitor monitor) {
		super(kpm);
		_monitor = monitor;
	}
	
	public boolean visit(IResourceDelta delta) throws CoreException {
		switch( delta.getKind() ) {
		
		case IResourceDelta.ADDED :
			handleAdd( delta.getResource() );
			break;
			
		case IResourceDelta.CHANGED :
			handleChange( delta.getResource() );
			break;
			
		case IResourceDelta.REMOVED :
			handleRemove( delta.getResource() );
			break;
		
		}
		return true;
	}

	/**
	 * Send an update event to the unit corresponding to the given resource.
	 * @param resource The resource corresponding to a unit to be sent an update event.
	 */
	private void handleChange(IResource resource) {
		Unit unit = KpmManager.getDefault().getUnit(resource);
		if ( unit != null )
			EventDispatcher.sendEvent(unit, "update", null, _monitor);
	}
	
	/**
	 * Create the unit corresponding to the given resource and add dependencies to it.
	 * @param resource The resource corresponding to a unit to be created.
	 */
	private void handleAdd(IResource resource) {
		Unit unit = conditionalGetOrCreateUnit(resource, true);
		if ( unit != null )
			EventDispatcher.sendEvent(unit, "update", null, _monitor);
	}
	
	/**
	 * Remove safely a unit corresponding to the resource.
	 * @param resource The resource corresponding to a unit to be deleted.
	 */
	private void handleRemove(IResource resource) {
		String name = "platform:/resource" + resource.getFullPath().toString();
		_kpm.removeUnit(name);
	}
	
}


