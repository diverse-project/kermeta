package org.eclipse.emf.emfatic.ui.redsquiggles;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;


public class EmfaticRedSquiggler implements IResourceChangeListener {

	/*
	 * Besides Ch. "Workspace Resource Programming" in JDGE, details can be
	 * found in
	 * 
	 * http://www.eclipse.org/articles/Article-Resource-deltas/resource-deltas.html
	 * 
	 * 
	 */

	public void resourceChanged(IResourceChangeEvent event) {
		IResourceDelta delta = event.getDelta();
		IResourceDeltaVisitor visitor = new EmfaticRedSquigglerDeltaVisitor();
		try {
			delta.accept(visitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
