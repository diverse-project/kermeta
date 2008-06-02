

/*$Id: EventDispatcherTest.java,v 1.2 2008-06-02 09:13:02 ftanguy Exp $
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
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kpm.EventDispatcher;
import org.kermeta.kpm.KpmManager;
import org.kermeta.kpm.test.util.KmtContentProvider;

import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * 
 * EventDispatcherTest
 * 		oneFile.kmt
 * 		
 * @author paco
 *
 */
public class EventDispatcherTest {

	private IWorkspace _workspace;
	
	@Before
	public void setUp() throws InterruptedException {
		_workspace = ResourcesPlugin.getWorkspace();
		WorkspaceJob job = new WorkspaceJob("") {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				IProject project = _workspace.getRoot().getProject("EventDispatcherTest");
				project.create(monitor);
				project.open(monitor);
				
				IFile file1 = project.getFile( new Path("oneFile.kmt") );
				InputStream is = new ByteArrayInputStream( KmtContentProvider.exemple1().getBytes() );
				file1.create(is, true, monitor);
				
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
				IProject project = _workspace.getRoot().getProject("EventDispatcherTest");
				project.delete(true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		job.join();
		Thread.sleep(1000);
	}
		
	@Test
	public void sendUpdateEventToKmtFile() {
		IFile file = _workspace.getRoot().getFile( new Path("/EventDispatcherTest/oneFile.kmt") );
		Unit unit = KpmManager.getDefault().getUnit(file);
		if ( unit == null ) {
			Assert.fail("Not able to get the unit for " + file.getFullPath().toString() + ". Please check the creation tests before.");
			return;
		}
		EventDispatcher.sendEvent(unit, "update", null, null);
		Assert.assertNotNull( IOPlugin.getDefault().findKermetaUnit("kermeta") );		
		Assert.assertNotNull( IOPlugin.getDefault().findKermetaUnit(file) );
		Assert.assertTrue( IOPlugin.getDefault().findKermetaUnit(file).isTypeChecked() );
		Assert.assertTrue( IOPlugin.getDefault().findKermetaUnit(file).isConstraintChecked() );
		Assert.assertFalse( IOPlugin.getDefault().findKermetaUnit(file).isErroneous() );
	}
}


