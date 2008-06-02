

/*$Id: ResourceCreationTest.java,v 1.2 2008-06-02 09:13:02 ftanguy Exp $
* Project : org.kermeta.kpm.test.workbench
* File : 	ResourceCreation.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 mai 08
* Authors : paco
*/

package org.kermeta.kpm.test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
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

import fr.irisa.triskell.kermeta.kpm.Unit;


public class ResourceCreationTest {

	private IWorkspace _workspace;

	@Before
	public void setUp() {
		_workspace = ResourcesPlugin.getWorkspace();
	}
	
	@After
	public void tearDown() throws InterruptedException {
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("oneProject");
				project.delete(true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		job.join();
		Thread.sleep(1000);
	}
	
	@Test
	public void createProject() throws InterruptedException {
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("oneProject");
				project.create(monitor);
				project.open(monitor);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		job.join();
		Thread.sleep(1000);
		IProject project = _workspace.getRoot().getProject("oneProject");
		Assert.assertNotNull( KpmManager.getDefault().getUnit(project) );
	}
	
	@Test
	public void createFolder() throws InterruptedException {
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("oneProject");
				project.create(monitor);
				project.open(monitor);
				IFolder folder = project.getFolder( "oneFolder");
				folder.create(true, true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		job.join();
		Thread.sleep(1000);
		IFolder folder = _workspace.getRoot().getFolder( new Path("/oneProject/oneFolder") );
		Assert.assertNotNull( KpmManager.getDefault().getUnit(folder) );
	}	
	
	@Test
	public void createFile() throws InterruptedException {
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("oneProject");
				project.create(monitor);
				project.open(monitor);
				IFolder folder = project.getFolder( "oneFolder");
				folder.create(true, true, monitor);
				InputStream is = new ByteArrayInputStream( "some input".getBytes() );
				IFile file = folder.getFile( "oneFile.kmt" );
				file.create(is, false, monitor);
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		job.join();
		Thread.sleep(1000);
		IFile file = _workspace.getRoot().getFile( new Path("/oneProject/oneFolder/oneFile.kmt") );
		Unit unit = KpmManager.getDefault().getUnit(file);
		Assert.assertNotNull( unit );
		if ( unit != null )
			Assert.assertTrue( unit.getRules().size() == 1 );
	}	
	
}


