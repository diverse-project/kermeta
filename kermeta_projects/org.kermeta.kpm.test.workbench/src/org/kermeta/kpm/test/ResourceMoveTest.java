

/*$Id: ResourceMoveTest.java,v 1.3 2008-06-02 13:29:12 ftanguy Exp $
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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kermeta.kpm.KpmManager;

/**
 * 
 * MovingProjectTest
 * 		firstFolder
 * 			oneFile.kmt
 * 		secondFolder
 * 			thirdFolder
 * 				secondFile.kmt
 * 
 * @author paco
 *
 */
public class ResourceMoveTest extends WorkbenchTest {

	@Before
	public void setUp() throws InterruptedException {
		_project = _workspace.getRoot().getProject("MovingProjectTest");
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				_project.create(monitor);
				_project.open(monitor);
				
				IFolder folder1 = _project.getFolder( new Path("firstFolder") );
				folder1.create(true, true, monitor);
				
				IFolder folder2 = _project.getFolder( new Path("secondFolder") );
				folder2.create(true, true, monitor);
				
				IFolder folder3 = folder2.getFolder( new Path("thirdFolder") );
				folder3.create(true, true, monitor);
				
				IFile file1 = folder1.getFile( new Path("oneFile.kmt") );
				InputStream is = new ByteArrayInputStream("some input".getBytes());
				file1.create(is, true, monitor);
				
				IFile file2 = folder3.getFile( new Path("secondFile.kmt") );
				is = new ByteArrayInputStream("some input".getBytes());
				file2.create(is, true, monitor);
				
				return Status.OK_STATUS;
			}
		};
		job.execute();
	}
	
	@After
	public void tearDown() throws InterruptedException {
		removeProject();
	}
	
	@Test
	public void moveFile() throws InterruptedException {
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				IFile file = _workspace.getRoot().getFile( new Path("/MovingProjectTest/firstFolder/oneFile.kmt") );
				file.move( new Path("/MovingProjectTest/secondFolder/oneFile.kmt"), true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.execute();
		IFile oldFile = _workspace.getRoot().getFile( new Path("/MovingProjectTest/firstFolder/oneFile.kmt") );
		IFile newFile = _workspace.getRoot().getFile( new Path("/MovingProjectTest/secondFolder/oneFile.kmt") );
		Assert.assertNull( KpmManager.getDefault().getUnit(oldFile) );
		Assert.assertNotNull(newFile);
		Assert.assertTrue( KpmManager.getDefault().getUnit(newFile).getRules().size() == 1 );
	}
	
	@Test
	public void moveFolder() throws InterruptedException {
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				IFolder folder = _workspace.getRoot().getFolder( new Path("/MovingProjectTest/secondFolder/thirdFolder") );
				folder.move( new Path("/MovingProjectTest/firstFolder/thirdFolder"), true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.execute();		
		IFolder oldFolder = _workspace.getRoot().getFolder( new Path("/MovingProjectTest/secondFolder/thirdFolder") );
		IFile oldFile = _workspace.getRoot().getFile( new Path("/MovingProjectTest/secondFolder/thirdFolder/secondFile.kmt") );
		IFolder newFolder = _workspace.getRoot().getFolder( new Path("/MovingProjectTest/firstFolder/thirdFolder") );
		IFile newFile = _workspace.getRoot().getFile( new Path("/MovingProjectTest/firstFolder/thirdFolder/secondFile.kmt") );
		Assert.assertNull( KpmManager.getDefault().getUnit(oldFolder) );
		Assert.assertNull( KpmManager.getDefault().getUnit(oldFile) );
		Assert.assertNotNull( KpmManager.getDefault().getUnit(newFolder) );
		Assert.assertNotNull( KpmManager.getDefault().getUnit(newFile) );
		Assert.assertTrue( KpmManager.getDefault().getUnit(newFile).getRules().size() == 1 );
	}
	
}


