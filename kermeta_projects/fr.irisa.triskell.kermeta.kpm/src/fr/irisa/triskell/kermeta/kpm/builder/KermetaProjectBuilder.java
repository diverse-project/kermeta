package fr.irisa.triskell.kermeta.kpm.builder;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.kermeta.kpm.*;
import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;

/**
 * 
 * @author ftanguy
 *
 */
public class KermetaProjectBuilder extends IncrementalProjectBuilder {
	
	private KPM kpm;
	
	
	//////////////////////////
	//////////////////////////
	//		Building		//
	//////////////////////////
	//////////////////////////
	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		kpm = (KPM) args.get("kpm");

		switch ( kind ) {
		
		case IncrementalProjectBuilder.AUTO_BUILD :
			System.out.println("auto_build");
			IProject project = getProject();
			IResourceDelta delta = getDelta( project );
			if ( delta != null ) {
				KermetaDeltaVisitor visitor = new KermetaDeltaVisitor(kpm);
				delta.accept(visitor);
				project.refreshLocal(IResource.DEPTH_INFINITE, null);
			}
			break;
			
		case IncrementalProjectBuilder.CLEAN_BUILD :
			System.out.println("Clean_build");
			break;
		
		case IncrementalProjectBuilder.FULL_BUILD :
			System.out.println("full_build");
			project = getProject();
			delta = getDelta( project );
			if ( delta != null ) {
				KermetaDeltaVisitor visitor = new KermetaDeltaVisitor(kpm);
				delta.accept(visitor);
				project.refreshLocal(IResource.DEPTH_INFINITE, null);
			}
			//build();
			break;
			
		case IncrementalProjectBuilder.INCREMENTAL_BUILD :
			System.out.println("incremental_build");
			//build();
			break;
		
		default :
			break;
			
		}
		
		KermetaWorkspace.getInstance().save();
		
		return null;
	}
	//////////////////////////////
	//////////////////////////////
	//		End of Building		//
	//////////////////////////////
	//////////////////////////////
}
