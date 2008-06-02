

/*$Id: ResourceDeletionTest.java,v 1.2 2008-06-02 09:13:02 ftanguy Exp $
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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kermeta.kpm.KpmManager;

public class ResourceDeletionTest {

	private IWorkspace _workspace;
	
	@Before
	public void setUp() throws InterruptedException {
		_workspace = ResourcesPlugin.getWorkspace();
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("DeletionProjectTest");
				project.create(monitor);
				project.open(monitor);
				IFolder folder = project.getFolder( new Path("oneFolder") );
				folder.create(true, true, monitor);
				IFile file = folder.getFile( new Path("oneFile.kmt") );
				InputStream is = new ByteArrayInputStream("some input".getBytes());
				file.create(is, true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		job.join();
		Thread.sleep(1000);
	}
	
	@After
	public void tearDown() throws InterruptedException {
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("DeletionProjectTest");
				project.delete(true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		job.join();
		Thread.sleep(1000);
	}
	
	@Test
	public void removeFile() throws InterruptedException {
		final IFile file = _workspace.getRoot().getFile( new Path("/DeletionProjectTest/oneFolder/oneFile.kmt") );
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				file.delete(true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		job.join();
		Thread.sleep(1000);
		Assert.assertNull( KpmManager.getDefault().getUnit(file) );
	}
	
	@Test
	public void removeFolder() throws InterruptedException {
		IFile file = _workspace.getRoot().getFile( new Path("/DeletionProjectTest/oneFolder/oneFile.kmt") );
		final IFolder folder = _workspace.getRoot().getFolder( new Path("/DeletionProjectTest/oneFolder") );
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				folder.delete(true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		job.join();
		Thread.sleep(1000);
		Assert.assertNull( KpmManager.getDefault().getUnit(folder) );
		Assert.assertNull( KpmManager.getDefault().getUnit(file) );
	}
	
	@Test
	public void removeProject() throws InterruptedException {
		IFile file = _workspace.getRoot().getFile( new Path("/DeletionProjectTest/oneFolder/oneFile.kmt") );
		IFolder folder = _workspace.getRoot().getFolder( new Path("/DeletionProjectTest/oneFolder") );
		final IProject project = _workspace.getRoot().getProject( "DeletionProjectTest" );
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				project.delete(true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		job.join();
		Thread.sleep(1000);
		Assert.assertNull( KpmManager.getDefault().getUnit(project) );
		Assert.assertNull( KpmManager.getDefault().getUnit(folder) );
		Assert.assertNull( KpmManager.getDefault().getUnit(file) );
	}
	
}


