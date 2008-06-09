

/*$Id: NewKermetaProjectWizard.java,v 1.4 2008-06-09 10:02:23 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
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
			 final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(page.getProjectName());
			 IWorkspaceRunnable operation = new IWorkspaceRunnable() {
				 public void run(IProgressMonitor monitor) throws CoreException {
					 project.create(monitor);
					 project.open(monitor);
					 NatureHelper.addNatureToProject(project, KermetaNature.ID);
					 if ( page.createFolders() ) {
						 
						 createFolder(project, page.getSrcFolder(), monitor);
						 createFolder(project, page.getModelFolder(), monitor);
						 createFolder(project, page.getMetamodelFolder(), monitor);

					 }
				 }
			};
			ResourcesPlugin.getWorkspace().run(operation, null);
		} catch (CoreException exception) {
			exception.printStackTrace();
			return false;
		}
		return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * Creates folder hierarchically from a path relative to a project.
	 * @param project
	 * @param path
	 * @param monitor
	 * @throws CoreException
	 */
	private void createFolder(IProject project, String path, IProgressMonitor monitor) throws CoreException {
		String[] strings = path.split("/");
		IContainer currentContainer = project;
		for ( String s : strings ) {
			IFolder folder = currentContainer.getFolder( new Path(s) );
			folder.create(true, true, monitor);
			currentContainer = folder;
		}
	}
	
}
