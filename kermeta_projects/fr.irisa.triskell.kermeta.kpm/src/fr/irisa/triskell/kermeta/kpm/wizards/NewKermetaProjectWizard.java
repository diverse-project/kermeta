package fr.irisa.triskell.kermeta.kpm.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import fr.irisa.triskell.kermeta.kpm.helpers.IResourceHelper;

public class NewKermetaProjectWizard extends Wizard implements INewWizard {

	NewKermetaProjectWizardPage page = new NewKermetaProjectWizardPage();
	
	public NewKermetaProjectWizard() {
		addPage( page );
	}

	@Override
	public boolean performFinish() {
		try {
			IResourceHelper.createKermetaProject( page.getProjectName() );
			//KermetaResourcesHelper.createKermetaProject( page.getProjectName() );
		} catch (CoreException exception) {
			exception.printStackTrace();
			return false;
		}
		return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

}
