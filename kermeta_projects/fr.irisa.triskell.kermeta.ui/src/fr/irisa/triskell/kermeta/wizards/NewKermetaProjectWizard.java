

/*$Id: NewKermetaProjectWizard.java,v 1.3 2008-05-28 09:25:42 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import fr.irisa.triskell.eclipse.resources.NatureHelper;
import fr.irisa.triskell.kermeta.resources.KermetaNature;

public class NewKermetaProjectWizard extends Wizard implements INewWizard {

	NewKermetaProjectWizardPage page = new NewKermetaProjectWizardPage();
	
	public NewKermetaProjectWizard() {
		addPage( page );
	}

	public NewKermetaProjectWizardPage getPage() {
		return page;
	}
	
	@Override
	public boolean performFinish() {
		try {
			final IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(page.getProjectName());
			 //description.setLocation( Platform.getLocation() );
			description.setLocation( null );

			 final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(page.getProjectName());
			 IWorkspaceRunnable operation = new IWorkspaceRunnable() {
				 public void run(IProgressMonitor monitor) throws CoreException {
					 project.create(description, monitor);
					 project.open(monitor);
					 NatureHelper.addNatureToProject(project, KermetaNature.ID);
					 //KermetaNatureHelper.addKermetaNature(project);
				 }
			};
			ResourcesPlugin.getWorkspace().run(operation, null);
			//IResourceHelper.createKermetaProject( page.getProjectName() );
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
