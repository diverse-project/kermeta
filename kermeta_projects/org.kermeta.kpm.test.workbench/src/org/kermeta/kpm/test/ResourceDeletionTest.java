

/*$Id: ResourceDeletionTest.java,v 1.1 2008-06-02 06:48:31 ftanguy Exp $
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
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kermeta.kpm.KpmManager;

public class ResourceDeletionTest {

	private IWorkspace _workspace;
	
	@Before
	public void setUp() {
		_workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("DeletionProjectTest");
				project.create(monitor);
				project.open(monitor);
				IFolder folder = project.getFolder( new Path("oneFolder") );
				folder.create(true, true, monitor);
				IFile file = folder.getFile( new Path("oneFile.kmt") );
				InputStream is = new ByteArrayInputStream("some input".getBytes());
				file.create(is, true, monitor);
			}
		};
		try {
			_workspace.run(r, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown() {
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("DeletionProjectTest");
				project.delete(true, monitor);
			}
		};
		try {
			_workspace.run(r, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void removeFile() {
		final IFile file = _workspace.getRoot().getFile( new Path("/DeletionProjectTest/oneFolder/oneFile.kmt") );
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				file.delete(true, monitor);
			}
		};
		try {
			_workspace.run(r, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNull( KpmManager.getDefault().getUnit(file) );
	}
	
	@Test
	public void removeFolder() {
		IFile file = _workspace.getRoot().getFile( new Path("/DeletionProjectTest/oneFolder/oneFile.kmt") );
		final IFolder folder = _workspace.getRoot().getFolder( new Path("/DeletionProjectTest/oneFolder") );
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				folder.delete(true, monitor);
			}
		};
		try {
			_workspace.run(r, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNull( KpmManager.getDefault().getUnit(folder) );
		Assert.assertNull( KpmManager.getDefault().getUnit(file) );
	}
	
	@Test
	public void removeProject() {
		IFile file = _workspace.getRoot().getFile( new Path("/DeletionProjectTest/oneFolder/oneFile.kmt") );
		IFolder folder = _workspace.getRoot().getFolder( new Path("/DeletionProjectTest/oneFolder") );
		final IProject project = _workspace.getRoot().getProject( "DeletionProjectTest" );
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				project.delete(true, monitor);
			}
		};
		try {
			_workspace.run(r, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNull( KpmManager.getDefault().getUnit(project) );
		Assert.assertNull( KpmManager.getDefault().getUnit(folder) );
		Assert.assertNull( KpmManager.getDefault().getUnit(file) );
	}
	
}


