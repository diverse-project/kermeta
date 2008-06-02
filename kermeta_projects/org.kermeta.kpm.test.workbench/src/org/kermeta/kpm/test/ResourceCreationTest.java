

/*$Id: ResourceCreationTest.java,v 1.1 2008-06-02 06:48:31 ftanguy Exp $
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
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
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
	public void tearDown() {
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("oneProject");
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
	public void createProject() {
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("oneProject");
				project.create(monitor);
				project.open(monitor);
			}
		};
		try {
			_workspace.run(r, null);
			// Wait for event handling
		} catch (CoreException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		IProject project = _workspace.getRoot().getProject("oneProject");
		Assert.assertNotNull( KpmManager.getDefault().getUnit(project) );
	}
	
	@Test
	public void createFolder() {
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("oneProject");
				project.create(monitor);
				project.open(monitor);
				IFolder folder = project.getFolder( "oneFolder");
				folder.create(true, true, monitor);
			}
		};
		try {
			_workspace.run(r, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		// Wait for event handling
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		IFolder folder = _workspace.getRoot().getFolder( new Path("/oneProject/oneFolder") );
		Assert.assertNotNull( KpmManager.getDefault().getUnit(folder) );
	}	
	
	@Test
	public void createFile() {
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
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
			}
		};
		try {
			_workspace.run(r, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		// Wait for event handling
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		IFile file = _workspace.getRoot().getFile( new Path("/oneProject/oneFolder/oneFile.kmt") );
		Unit unit = KpmManager.getDefault().getUnit(file);
		Assert.assertNotNull( unit );
		if ( unit != null )
			Assert.assertTrue( unit.getRules().size() == 1 );
	}	
	
}


