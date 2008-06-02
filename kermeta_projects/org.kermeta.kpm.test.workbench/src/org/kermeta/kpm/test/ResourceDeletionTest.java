

/*$Id: ResourceDeletionTest.java,v 1.3 2008-06-02 13:29:12 ftanguy Exp $
* Project : org.kermeta.kpm.test.workbench
* File : 	ResourceDeletionTest.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 mai 08
* Authors : paco
*/

package org.kermeta.kpm.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kermeta.kpm.KPMPlugin;
import org.kermeta.kpm.KpmManager;

public class ResourceDeletionTest extends WorkbenchTest {

	@Before
	public void setUp() throws InterruptedException {
		KPMPlugin.internalLog.debug("ResourceDeletionTest setUp");
		_project = _workspace.getRoot().getProject("DeletionProjectTest");
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				_project.create(monitor);
				_project.open(monitor);
				IFolder folder = _project.getFolder( new Path("oneFolder") );
				folder.create(true, true, monitor);
				IFile file = folder.getFile( new Path("oneFile.kmt") );
				InputStream is = new ByteArrayInputStream("some input".getBytes());
				file.create(is, true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.execute();
	}
	
	@After
	public void tearDown() throws InterruptedException {
		KPMPlugin.internalLog.debug("ResourceDeletionTest tearDown");
		removeProject();
	}
	
	@Test
	public void removeFile() throws InterruptedException {
		KPMPlugin.internalLog.debug("ResourceDeletionTest removeFile");
		final IFile file = _workspace.getRoot().getFile( new Path("/DeletionProjectTest/oneFolder/oneFile.kmt") );
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				file.delete(true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.execute();
		Assert.assertNull( KpmManager.getDefault().getUnit(file) );
	}
	
	@Test
	public void removeFolder() throws InterruptedException {
		KPMPlugin.internalLog.debug("ResourceDeletionTest removeFolder");
		IFile file = _workspace.getRoot().getFile( new Path("/DeletionProjectTest/oneFolder/oneFile.kmt") );
		final IFolder folder = _workspace.getRoot().getFolder( new Path("/DeletionProjectTest/oneFolder") );
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				folder.delete(true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.execute();
		Assert.assertNull( KpmManager.getDefault().getUnit(folder) );
		Assert.assertNull( KpmManager.getDefault().getUnit(file) );
	}
	
	@Test
	public void removeProject() throws InterruptedException {
		IFile file = _workspace.getRoot().getFile( new Path("/DeletionProjectTest/oneFolder/oneFile.kmt") );
		IFolder folder = _workspace.getRoot().getFolder( new Path("/DeletionProjectTest/oneFolder") );
		// Removing a project does not result in a build. So we use the default WorkspaceJob api for that.
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				_project.delete(true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		// Need to wait for assertion the time for kpm to handle deletion events.
		Thread.sleep(2500);
		Assert.assertNull( KpmManager.getDefault().getUnit(_project) );
		Assert.assertNull( KpmManager.getDefault().getUnit(folder) );
		Assert.assertNull( KpmManager.getDefault().getUnit(file) );
	}
	
}


