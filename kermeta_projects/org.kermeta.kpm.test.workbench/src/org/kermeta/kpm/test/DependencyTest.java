

/*$Id: DependencyTest.java,v 1.4 2008-06-03 07:44:01 ftanguy Exp $
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
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kermeta.kpm.EventDispatcher;
import org.kermeta.kpm.KpmManager;

import fr.irisa.triskell.eclipse.wizard.AbstractExampleWizard;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * 
 * @author paco
 *
 */
public class DependencyTest extends WorkbenchTest {

	private class Wizard extends AbstractExampleWizard {

		@Override
		protected AbstractUIPlugin getContainerPlugin() {
			return KpmTestPlugin.getDefault();
		}

		@Override
		protected Collection getProjectDescriptors() {
			List<ProjectDescriptor> l = new ArrayList<ProjectDescriptor>();
			ProjectDescriptor p = new ProjectDescriptor( "org.kermeta.kpm.test.workbench", "mon.zip", "fr.irisa.triskell.kermeta.samples.fsm.demoAspect" );
			l.add(p);
			return l;
		}
		
	}
	
	@Before
	public void setUp() throws InterruptedException {
		_project = _workspace.getRoot().getProject("fr.irisa.triskell.kermeta.samples.fsm.demoAspect");
		Wizard w = new Wizard();
		w.performFinish();
		Thread.sleep(1000);
	}
	
	@After
	public void tearDown() throws InterruptedException {
		removeProject();
	}
		
	@Test
	public void checkDependencies() {
		IFile launcher = _workspace.getRoot().getFile( new Path("/fr.irisa.triskell.kermeta.samples.fsm.demoAspect/launcher/fsmLauncher.kmt") );
		Unit launcherUnit = KpmManager.getDefault().getUnit(launcher);
		if ( launcherUnit == null ) {
			Assert.fail("Not able to get the unit for " + launcher.getFullPath().toString() + ". Please check the creation tests before.");
			return;
		}
		EventDispatcher.sendEvent(launcherUnit, "update", null, null);

		IFile constraints = _workspace.getRoot().getFile( new Path("/fr.irisa.triskell.kermeta.samples.fsm.demoAspect/kermeta/constraints/FSMConstraints.kmt") );
		IFile semantics = _workspace.getRoot().getFile( new Path("/fr.irisa.triskell.kermeta.samples.fsm.demoAspect/kermeta/semantics/fsm_Operationnal_Semantics.kmt") );
		IFile fsm = _workspace.getRoot().getFile( new Path("/fr.irisa.triskell.kermeta.samples.fsm.demoAspect/kermeta/fsm.kmt") );

		Unit constraintsUnit = KpmManager.getDefault().getUnit( constraints );
		Unit semanticsUnit = KpmManager.getDefault().getUnit( semantics );
		Unit fsmUnit = KpmManager.getDefault().getUnit( fsm );
		
		Assert.assertTrue( constraintsUnit.getUsedBy().size() == 3 );
		Assert.assertTrue( semanticsUnit.getUsedBy().size() == 3 );
		Assert.assertTrue( fsmUnit.getUsedUsages().size() == 2 );
		Assert.assertTrue( fsmUnit.getUsedBy().size() == 2 );
		Assert.assertTrue( launcherUnit.getUsedUsages().size() == 4 );
	}

	@Test
	public void checkMarkers() throws CoreException, InterruptedException, IOException {
		// Loading and typechecking fsmLauncher.kmt
		IFile launcher = _workspace.getRoot().getFile( new Path("/fr.irisa.triskell.kermeta.samples.fsm.demoAspect/launcher/fsmLauncher.kmt") );
		Unit launcherUnit = KpmManager.getDefault().getUnit(launcher);
		EventDispatcher.sendEvent(launcherUnit, "update", null, null);
	
		// Changing the content of FSMConstraints.kmt
		// The change should be catch by kpm. So an event must be sent and an other typecheck occurs.
		// We introduce here an error that will mark the files that depends on FSMConstraint as erroneous.
		final IFile constraints = _workspace.getRoot().getFile( new Path("/fr.irisa.triskell.kermeta.samples.fsm.demoAspect/kermeta/constraints/FSMConstraints.kmt") );		
		
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				InputStream is = null;
				ByteArrayOutputStream bos = null;
				ByteArrayInputStream bis = null;
				try {
					is = constraints.getContents();
					bos = new ByteArrayOutputStream();
					int i = 0;
					do {
						i = is.read();
						if ( i != -1 )
							bos.write(i);
					} while ( i != -1 );
					bos.write( "\nclass State {}\n".getBytes() );
					bis = new ByteArrayInputStream( bos.toByteArray() );
					constraints.setContents(bis, true, false, null);
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						is.close();
						bos.close();
						bis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				return Status.OK_STATUS;
			}
		};
		job.execute();
		
		IFile fsm = _workspace.getRoot().getFile( new Path("/fr.irisa.triskell.kermeta.samples.fsm.demoAspect/kermeta/fsm.kmt") );

		Assert.assertTrue( fsm.findMarkers( IMarker.PROBLEM, false, 1).length != 0 );
		
	}
}


