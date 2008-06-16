

/*$Id: WorkbenchTest.java,v 1.3 2008-06-16 15:56:21 dvojtise Exp $
* Project : org.kermeta.kpm.test.workbench
* File : 	WorkbenchTest.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 2 juin 08
* Authors : paco
*/

package org.kermeta.kpm.test;

import junit.framework.Assert;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.kermeta.kpm.KpmManager;

public abstract class WorkbenchTest {
	
	/**
	 * 
	 */
	static protected IWorkspace _workspace = ResourcesPlugin.getWorkspace();
	
	/**
	 * The project the test is working on.
	 */
	protected IProject _project;
		
	/**
	 * Remove the project from the workspace and wait sometime to let kpm handling deletion events.
	 * @throws InterruptedException 
	 * 
	 */
	protected void removeProject() throws InterruptedException {
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				_project.delete(true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		Thread.sleep(1000);
		KpmManager.getDefault().removeProject(_project);
	}
	
	/**
	 * Wait until kpm finishes the build of the project.
	 * @param p
	 */
	protected void waitForBuild(IProject p) {
		try {
			int nbTries = 0;
			while ( KpmManager.getDefault().isBeingBuilt(p) && nbTries < 3000) {
				Thread.sleep(100);
				System.out.println("waiting for " + p.getFullPath().toString() );
				nbTries ++;
			}
			// still being build, this means the time out has expired
			if(KpmManager.getDefault().isBeingBuilt(p))
				Assert.fail("Build of " + p.getFullPath().toString() + " took too much time (>" +  nbTries*100 + "ms)");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	abstract public class KpmTestJob extends WorkspaceJob {

		public KpmTestJob() {
			super("");
		}
		
		public void execute() {
			KpmManager.getDefault().addProject(_project);
			schedule();
			waitForBuild(_project);
		}

	}
	
}


