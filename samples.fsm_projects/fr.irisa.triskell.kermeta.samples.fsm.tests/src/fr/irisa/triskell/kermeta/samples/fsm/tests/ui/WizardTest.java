package fr.irisa.triskell.kermeta.samples.fsm.tests.ui;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;
import org.junit.Assert;
import org.junit.Test;
import org.openembedd.tests.utils.UiTools;

import fr.irisa.triskell.kermeta.samples.fsm.FsmPlugin;
import fr.irisa.triskell.kermeta.samples.fsm.tests.Utils;
import fr.irisa.triskell.kermeta.samples.fsm.wizards.FsmSampleExampleWizard;

public class WizardTest {

	
	
	@Test public void wizardExists() {
		Assert.assertTrue("There must be a '"+Utils.WIZARD_ID+"' wizard in the workbench",
				PlatformUI.getWorkbench().getNewWizardRegistry().findWizard( "fr.irisa.triskell.kermeta.samples.fsm.wizard" ) != null);
	}
	
	
	@Test public void creationSamplesproject() throws CoreException {
		final FsmSampleExampleWizard wizard;
		wizard = (FsmSampleExampleWizard) PlatformUI.getWorkbench().getNewWizardRegistry().findWizard("fr.irisa.triskell.kermeta.samples.fsm.wizard").createWizard();
		Assert.assertTrue( wizard != null );
			
		UIJob job = new UIJob("blah") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
		        WizardDialog dialog = new WizardDialog(null, wizard);
		        dialog.create();
		        dialog.setBlockOnOpen(false);
		        dialog.open();
		        wizard.performFinish();
		        dialog.close();
		        return Status.OK_STATUS;
			}	
		};
		UiTools.executeUIJob(job);
		
		Assert.assertTrue( ResourcesPlugin.getWorkspace().getRoot().getProject( FsmPlugin.DEMO_PROJECT_NAME ).exists() );
		
	}
	
	
	
}
