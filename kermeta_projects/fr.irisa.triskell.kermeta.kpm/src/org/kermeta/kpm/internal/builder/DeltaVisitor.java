

/*$Id: DeltaVisitor.java,v 1.1 2008-05-28 09:26:15 ftanguy Exp $
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

public class DeltaVisitor extends UnitCreator implements IResourceDeltaVisitor {

	/**
	 * 
	 */
	private IProgressMonitor _monitor;
	
	/**
	 * 
	 * @param monitor
	 */
	public DeltaVisitor(KPM kpm, IProgressMonitor monitor) {
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
	 * @param resource
	 */
	private void handleChange(IResource resource) {
		Unit unit = KpmManager.getDefault().getUnit(resource);
		if ( unit != null )
			EventDispatcher.sendEvent(unit, "update", null, _monitor);
	}
	
	/**
	 * Create the unit corresponding to the given resource and add dependencies to it.
	 * @param resource
	 */
	private void handleAdd(IResource resource) {
		createUnit(resource);
	}
	
	/**
	 * Remove safely a unit corresponding to the resource.
	 * @param resource
	 */
	private void handleRemove(IResource resource) {
		String name = "platform:/resource" + resource.getFullPath().toString();
		_kpm.removeUnit(name);
	}
	
}


