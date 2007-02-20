

/*$Id: NewKermetaProjectWizard.java,v 1.2 2007-02-20 14:24:02 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
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
