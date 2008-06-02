

/*$Id: ResourceCreationTest.java,v 1.4 2008-06-02 14:52:19 ftanguy Exp $
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

/**
 * oneProject
 * 		oneFolder
 * 			oneFile.kmt
 * 			secondFile
 * @author paco
 *
 */
public class ResourceCreationTest extends WorkbenchTest {

	@Before
	public void setUp() {
		_project = _workspace.getRoot().getProject("oneProject");
	}
	
	@After
	public void tearDown() throws InterruptedException {
		removeProject();
	}
	
	@Test
	public void createProject() throws InterruptedException {
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				_project.create(monitor);
				_project.open(monitor);
				return Status.OK_STATUS;
			}
		};
		job.execute();
		Assert.assertNotNull( KpmManager.getDefault().getUnit(_project) );
	}
	
	@Test
	public void createFolder() throws InterruptedException {
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				_project.create(monitor);
				_project.open(monitor);
				IFolder folder = _project.getFolder( "oneFolder");
				folder.create(true, true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.execute();
		IFolder folder = _workspace.getRoot().getFolder( new Path("/oneProject/oneFolder") );
		Assert.assertNotNull( KpmManager.getDefault().getUnit(folder) );
	}	
	
	@Test
	public void createKMTFile() throws InterruptedException {
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				_project.create(monitor);
				_project.open(monitor);
				IFolder folder = _project.getFolder( "oneFolder");
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
		job.execute();
		IFile file = _workspace.getRoot().getFile( new Path("/oneProject/oneFolder/oneFile.kmt") );
		Unit unit = KpmManager.getDefault().getUnit(file);
		Assert.assertNotNull( unit );
		if ( unit != null )
			Assert.assertTrue( unit.getRules().size() == 1 );
	}	
	
	@Test
	public void createFileWithoutExtension() throws InterruptedException {
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				_project.create(monitor);
				_project.open(monitor);
				IFolder folder = _project.getFolder( "oneFolder");
				folder.create(true, true, monitor);
				InputStream is = new ByteArrayInputStream( "some input".getBytes() );
				IFile file = folder.getFile( "secondFile" );
				file.create(is, false, monitor);
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		job.execute();
		IFile file = _workspace.getRoot().getFile( new Path("/oneProject/oneFolder/secondFile") );
		Unit unit = KpmManager.getDefault().getUnit(file);
		Assert.assertNotNull( unit );
	}	
}


