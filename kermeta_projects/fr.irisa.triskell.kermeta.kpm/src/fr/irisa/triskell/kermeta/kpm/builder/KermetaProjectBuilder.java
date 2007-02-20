

/*$Id: KermetaProjectBuilder.java,v 1.11 2007-02-20 14:24:02 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.builder;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;

import fr.irisa.triskell.kermeta.kpm.*;
import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;

/**
 * 
 * @author ftanguy
 *
 */
public class KermetaProjectBuilder extends IncrementalProjectBuilder {
	
	private KPM kpm;
	
	
	public KermetaProjectBuilder() {
		
	}
	
	//////////////////////////
	//////////////////////////
	//		Building		//
	//////////////////////////
	//////////////////////////
	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		
		/*
		 * Kind of hack to avoid getting an old kpm memory object not accessible anymore.
		 */
		Object o = args.get("kpm");
		if ( o instanceof String ) {
			IResourceHelper.attachDefaultBuilderToKermetaProject( KermetaWorkspace.getInstance().getKermetaProject(getProject()) );
			return null;
		} else
			kpm = (KPM) o;

		switch ( kind ) {
		
		case IncrementalProjectBuilder.AUTO_BUILD :
			IProject project = getProject();
			IResourceDelta delta = getDelta( project );
			if ( delta != null ) {		
				try {
					monitor.beginTask("Building " + project.getName(), IProgressMonitor.UNKNOWN);
					KermetaDeltaVisitor visitor = new KermetaDeltaVisitor(kpm, monitor);
					monitor.subTask("Accepting changes for " + project.getName());
					delta.accept(visitor);
					monitor.worked(1);
					checkCancel(monitor);
					KermetaProject kproject = KermetaWorkspace.getInstance().getKermetaProject(project);
					
					monitor.subTask("Saving " + project.getName());
					kproject.save();
					monitor.worked(1);
					project.refreshLocal(IResource.DEPTH_INFINITE, null);
				} finally {
					monitor.done();
				}
			}
			break;
			
		case IncrementalProjectBuilder.CLEAN_BUILD :
			break;
		
		case IncrementalProjectBuilder.FULL_BUILD :
			project = getProject();
			delta = getDelta( project );
			if ( delta != null ) {
				try {
					monitor.beginTask("Building " + project.getName(), IProgressMonitor.UNKNOWN);
					KermetaDeltaVisitor visitor = new KermetaDeltaVisitor(kpm, monitor);
					delta.accept(visitor);
					KermetaProject kproject = KermetaWorkspace.getInstance().getKermetaProject(project);
					kproject.save();
					project.refreshLocal(IResource.DEPTH_INFINITE, null);
				} finally {
					monitor.done();
				}
			}
			//build();
			break;
			
		case IncrementalProjectBuilder.INCREMENTAL_BUILD :
			//build();
			break;
		
		default :
			break;
			
		}
		
		KermetaWorkspace.getInstance().changer(null);
		
		return null;
	}
	
	protected void checkCancel(IProgressMonitor monitor) {
		if (monitor.isCanceled()) {
			forgetLastBuiltState();//not always necessary
		    throw new OperationCanceledException();
		}
	}
	//////////////////////////////
	//////////////////////////////
	//		End of Building		//
	//////////////////////////////
	//////////////////////////////
}
