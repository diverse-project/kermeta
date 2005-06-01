/* $Id: KermetaNewProjectWizard.java,v 1.4 2005-06-01 15:50:59 zdrey Exp $
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

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;

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

	/** The main wizard page to create a Kermeta project */
	protected KermetaNewProjectWizardPage newprojectPage;

	private CreateKermetaProjectWizard createWizard;
	
	private IWorkbench workbench;
	

	private IStructuredSelection selection;

    private IProject newProject;

    /** */
    //private WizardDialog wizardDialog;

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		
		setWindowTitle("New project creation wizard");
		// This is eclipse IDE philosophy compliant...TODO : simplify?)
		//setWizardDialog(new WizardDialog(getShell(), this));
		newprojectPage = new KermetaNewProjectWizardPage(null); //$NON-NLS-1$
		newprojectPage.setTitle("New K Project creation page");//$NON-NLS-1$
		newprojectPage.setDescription("Define properties of Kermeta new project"); //$NON-NLS-1$
		//newprojectPage.setWizardDialog(wizardDialog);
		this.createWizard = new CreateKermetaProjectWizard(this, newprojectPage);
	}

	/**
	 * Add the page for new project configuration to current wizard.
	 * @see Wizard#addPages
	 */
	public void addPages() {
		super.addPages();
		addPage(newprojectPage);
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
	 * @deprecated
	 * 
	 */
	public boolean finish(IProgressMonitor monitor) {

		// create the new file resource
		String sep = System.getProperty("file.separator");
		newProject = newprojectPage.getProjectHandle();
		if (newProject == null) {
			return false;
		}
		// FIXME : is it really the role of the Wizard page?
		/*newprojectPage.createFolders();*/
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
    public boolean performFinish()
    {
        return createWizard.performFinish();
    }

    /**
     * 
     * @return the project that was created through this project wizard.
     */
    public IProject getProject() {    return newProject;    }
    public IProject getNewProject() {    return newProject;    }
    
    public KermetaNewProjectWizardPage getNewProjectPage()  {
        return newprojectPage;
    }

    /**
     * Set newProject
     * @param project
     */
    public void setNewProject(IProject project)
    {
        newProject = project;
    }
    
   /* public void setWizardDialog(WizardDialog dialog) {
        wizardDialog = dialog;
    }*/
    
    
}
