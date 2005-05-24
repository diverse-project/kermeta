/* $Id: KermetaNewProjectWizard.java,v 1.1 2005-05-24 17:07:35 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaNewProjectWizard.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 24, 2005
 * Authors: zdrey
 * Todo :
 * 	-  define a properties file, and replace the hard coded strings
 */
package fr.irisa.triskell.kermeta.runner.wizards;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;

/**
 * The Wizard to create a new Kermeta project
 * A Kermeta project has the following characteristics :
 * Composed of this folder template (optional):
 * 	-> KProjectName
 *       |_ sources/ -> sources (transformations)
 * 		 |_ build/ -> can contain the precompiled kermeta libs
 *       |_ models/ -> any model to transform
 *       |_ metamodels/ -> any model from which models may come from
 * 
 * -> Later, we can imagine a kind of .classpath, that contains the STD_LIB_URI
 * paths or some other paths
 * ----------------------------------------------------------------------------
 * Note : this class is "invoked" when user selects, in Eclipse, the item : 
 * 			File > New > Project > Kermeta > New K. Project
 * Through this path, the only available items are related exclusively to the 
 * creation of a Project.
 * But the creation of a Kermeta Project is also available through this path :
 * 			File > New > Other > Kermeta > New K. Project
 * 
 */
public class KermetaNewProjectWizard extends Wizard implements INewWizard
{
	public static final String NEW_PROJECT_WIZARD_ID = ""; //$NON-NLS-1$

	private KermetaNewProjectWizardPage fMainPage;

	/** Content and structure of the extension? */
	private IConfigurationElement fConfigElement;

	private IWorkbench workbench;

	private IStructuredSelection selection;

	private String RuntimetllFolder;

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("New project creation wizard");
	}

	/**
	 * Add the page for new project configuration to current wizard.
	 * @see Wizard#addPages
	 */
	public void addPages() {
		super.addPages();
		fMainPage = new KermetaNewProjectWizardPage(null); //$NON-NLS-1$
		fMainPage.setTitle("New K Project creation page");//$NON-NLS-1$
		fMainPage.setDescription("Define properties of Kermeta new project"); //$NON-NLS-1$
		addPage(fMainPage);

	}

	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) {
		fConfigElement = config;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IWizard#performCancel()
	 */
	public boolean performCancel() {
		//	fKermetaPage.performCancel();
		return super.performCancel();
	}


	/**
	 * Main processing method for the JAXBProjectCreationWizard object
	 * 
	 * @param monitor
	 *            monitor to use during project creation
	 * @exception CoreException
	 */
	public void run(IProgressMonitor monitor) throws CoreException {
		finish(monitor);
	}

	/**
	 * @param monitor
	 *            monitor used during project creation to see the progression speed
	 * @return true created ok, false not ok
	 */
	public boolean finish(IProgressMonitor monitor) {
		String RuntimeFilePath;

		// create the new file resource
		System.out.println("Click on Finish");

		String sep = System.getProperty("file.separator");
		IProject newProject = fMainPage.getProjectHandle();
		if (newProject == null) {
			return false;
		}
		// ie.- creation was unsuccessful

		// Since the file resource was created fine, open it for editing
		// if requested by the user
		try
		{
			newProject.create(null);
			newProject.open(null);
			IFolder source = newProject.getFolder("src");
			createFolder(source);
			
			//output folder
			IFolder output = newProject.getFolder("bin");
			createFolder(output);

			//		model folder
			IFolder model = newProject.getFolder("models");
			createFolder(model);

			//		metamodel folder
			IFolder metamodel = newProject.getFolder("metamodels");
			createFolder(metamodel);

			// 		extern language folder
			IFolder extern = newProject.getFolder("extern");
			createFolder(extern);
		}
		catch (CoreException e)
		{
		    e.printStackTrace();
		}
		return true;
	}

	/**
	 * helper method that recusrively create the requested folder
	 * 
	 * @param folder
	 */
	private void createFolder(IFolder folder) throws CoreException {
		if (!folder.getParent().exists())
			createFolder((IFolder) folder.getParent());
		folder.create(true, true, null);

	}



	/*
	 * (non-Javadoc) Method declared on BasicNewResourceWizard.
	 */
	protected void initializeDefaultPageImageDescriptor() {
		String iconPath = "icons/";//$NON-NLS-1$		
	}

    /**
	 * <ul>
	 * <li><b>Role</b> : Create the project with initial folders</li>
	 * <li><b>Use</b>  : This method is invoked when the user clicks on the <em>Finish</em> 
	 * button.</li>
	 * <ul>
     * @see org.eclipse.jface.wizard.Wizard#performFinish()
     */
    public boolean performFinish() {
        return false;
    }


    
}
