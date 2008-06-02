

/*$Id: EventDispatcherTest.java,v 1.3 2008-06-02 13:29:12 ftanguy Exp $
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
import org.kermeta.kpm.KPMPlugin;
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
public class EventDispatcherTest extends WorkbenchTest {

	@Before
	public void setUp() throws InterruptedException {
		_project = _workspace.getRoot().getProject("EventDispatcherTest");
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				_project.create(monitor);
				_project.open(monitor);
				
				IFile file1 = _project.getFile( new Path("oneFile.kmt") );
				InputStream is = new ByteArrayInputStream( KmtContentProvider.exemple1().getBytes() );
				file1.create(is, true, monitor);
				
				return Status.OK_STATUS;
			}
		};
		job.execute();
	}
	
	@After
	public void tearDown() throws InterruptedException {
		KPMPlugin.internalLog.debug("EventDispatcherTest tearDown");
		removeProject();
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


