

/*$Id: KpmProjectBuilder.java,v 1.5 2008-08-06 14:11:25 dvojtise Exp $
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
import org.kermeta.kpm.KPMPlugin;
import org.kermeta.kpm.internal.InternalKpmManager;

/**
 * This builder is trigerred on save in project that have the KPMBuilder command
 */
public class KpmProjectBuilder extends IncrementalProjectBuilder {

	static final public String ID = "fr.irisa.triskell.kermeta.kpm.kpmBuilder";
	
	public KpmProjectBuilder() {
	}

	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		try {
			KPMPlugin.internalLog.debug("Starting Build of Project " + getProject().getFullPath().toString() );
			if (kind == IncrementalProjectBuilder.FULL_BUILD) {
				KPMPlugin.internalLog.debug(" incremental project builder ask to do a full build on project " + getProject().getFullPath().toString() );
            	fullBuild(monitor);
			} else {
				IResourceDelta delta = getDelta(getProject());
	            if (delta == null) {
	            	KPMPlugin.internalLog.debug("will do a full build on project " + getProject().getFullPath().toString() );
	            	fullBuild(monitor);
	            } else {
	            	KPMPlugin.internalLog.debug("will do an incremental build on project " + getProject().getFullPath().toString() );
	            	incrementalBuild(delta, monitor);
	            }
	         }
			InternalKpmManager.getDefault().removeProject( getProject() );
			KPMPlugin.internalLog.debug("Endind Build of Project " + getProject().getFullPath().toString() );
		} catch (CoreException e) {
			KPMPlugin.internalLog.error(e.getMessage(),e);
			throw e;
		}
		return null;
	}

	/**
	 * When a full build is requested, a visit of the entire project is performed.
	 * @param monitor
	 * @throws CoreException 
	 */
	private void fullBuild(IProgressMonitor monitor) throws CoreException {
		Initializor i = new Initializor( InternalKpmManager.getDefault().getKpm(), false );
		getProject().accept(i);
	}
	
	/**
	 * When an incremental build is requested, only the delta is visited.
	 * @param delta
	 * @param monitor
	 * @throws CoreException 
	 */
	private void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) throws CoreException {
		KpmBuilderDeltaVisitor v = new KpmBuilderDeltaVisitor(InternalKpmManager.getDefault().getKpm(), monitor);
		delta.accept(v);
	}
	
}


