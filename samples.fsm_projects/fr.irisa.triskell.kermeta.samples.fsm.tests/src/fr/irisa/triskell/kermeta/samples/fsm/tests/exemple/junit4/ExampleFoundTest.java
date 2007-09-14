package fr.irisa.triskell.kermeta.samples.fsm.tests.exemple.junit4;

import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.PlatformUI;
import org.junit.*;

import fr.irisa.triskell.kermeta.samples.fsm.tests.Utils;

import org.openembedd.tests.utils.UiTools;
import org.osgi.framework.Bundle;

public class ExampleFoundTest {

	@Before
	public void resetExampleProject() {
		/* 
		 * clean up the workspace before testing creation of the example
		 */
		Utils.cleanProject();
	}
	
	@Test
	public void pluginExists() {
		Bundle  basicDemoPlugin = Platform.getBundle(Utils.PLUGIN_NAME);
		
		Assert.assertTrue("The basic demo plug-in must be in the OpenEmbeDD bundle.", basicDemoPlugin != null);
	}
	
	@Test
	public void exampleExists() {
		
		/*
		 * try to open the "New" wizard, which should offer an "Example" sub-menu 
		 * containing an "OpenEmbeDD demo" directory with an "OpenEmbeDD basic demo" item
		 */
		Assert.assertTrue("There must be a '"+Utils.WIZARD_ID+"' wizard in the workbench",
				PlatformUI.getWorkbench().getNewWizardRegistry().findWizard(Utils.WIZARD_ID) != null);
	}
	
	@Test
	public void projectCanBeCreated() throws Exception {
		Utils.createProject();
		
		Assert.assertTrue("the project "+Utils.PROJECT_NAME+" must have been created in workspace.",
				UiTools.getProject(Utils.PROJECT_NAME).exists());
		Assert.assertTrue("the project "+Utils.PROJECT_NAME+" must be open in workspace.",
				UiTools.getProject(Utils.PROJECT_NAME).isOpen());
	}
	
//	@Test
//	public void modelExist() throws Exception {
//		Utils.createProject();
//		
//		Assert.assertTrue("the model "+Utils.MODEL_NAME+" must be present in workspace.", 
//				UiTools.getProject(Utils.PROJECT_NAME).exists(new Path("model/"+Utils.MODEL_NAME)));
//	}
}
