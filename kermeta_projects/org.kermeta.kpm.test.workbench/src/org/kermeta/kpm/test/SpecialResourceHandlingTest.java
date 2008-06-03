

/*$Id: SpecialResourceHandlingTest.java,v 1.1 2008-06-03 07:44:01 ftanguy Exp $
* Project : org.kermeta.kpm.test.workbench
* File : 	SpecialResourceHandlingTest.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 3 juin 08
* Authors : paco
*/

package org.kermeta.kpm.test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.irisa.triskell.eclipse.wizard.AbstractExampleWizard;

public class SpecialResourceHandlingTest extends WorkbenchTest {

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
	public void changingProjectFile() throws CoreException {
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				String s = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
				s += "<projectDescription>";
				s += "<name>fr.irisa.triskell.kermeta.samples.fsm.demo</name>";
				s += "<comment></comment>";
				s += "<projects>";
				s += "</projects>";
				s += "<buildSpec>";
				s += "</buildSpec>";
				s += "<natures>";
				s += "<nature>fr.irisa.triskell.kermeta.KermetaNature</nature>";
				s += "</natures>";
				s += "</projectDescription>";
				ByteArrayInputStream is = new ByteArrayInputStream( s.getBytes() );
				try {
					IFile file = _project.getFile(".project");
					file.setContents(is, true, true, monitor);
				} finally {
					try {
						is.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				return Status.OK_STATUS;
			}
		};
		job.execute();
		boolean found = false;
		IProjectDescription desc = _project.getDescription();
		ICommand[] commands = desc.getBuildSpec();
		for (int i = 0; i < commands.length; ++i)
			if (commands[i].getBuilderName().equals( "fr.irisa.triskell.kermeta.kpm.kpmBuilder" ) ) {
				found = true;
				break;
			}
		Assert.assertTrue( found );
	}
	
}


