

/*$Id: KpmProjectBuilder.java,v 1.1 2008-05-28 09:26:15 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	KpmIncrementalProjectBuilder.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal.builder;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.kpm.internal.InternalKpmManager;

public class KpmProjectBuilder extends IncrementalProjectBuilder {

	static final public String ID = "fr.irisa.triskell.kermeta.kpm.kpmBuilder";
	
	public KpmProjectBuilder() {
	}

	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		if (kind == IncrementalProjectBuilder.FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
            if (delta == null) {
            	fullBuild(monitor);
            } else {
               incrementalBuild(delta, monitor);
            }
         }
		return null;
	}

	/**
	 * 
	 * @param monitor
	 * @throws CoreException 
	 */
	private void fullBuild(IProgressMonitor monitor) throws CoreException {
		Initializor i = new Initializor( InternalKpmManager.getDefault().getKpm(), false );
		getProject().accept(i);
	}
	
	/**
	 * 
	 * @param delta
	 * @param monitor
	 * @throws CoreException 
	 */
	private void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) throws CoreException {
		DeltaVisitor v = new DeltaVisitor(InternalKpmManager.getDefault().getKpm(), monitor);
		delta.accept(v);
	}
	
}


