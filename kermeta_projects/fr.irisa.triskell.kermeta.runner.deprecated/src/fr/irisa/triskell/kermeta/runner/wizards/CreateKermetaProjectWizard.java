/* $Id: CreateKermetaProjectWizard.java,v 1.3 2005-05-30 17:19:20 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: CreateKermetaProjectWizard.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 25, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;

/**
 * "At the image of" CreateProject Wizard.
 * Internal workbench Wizard that manages the creation of a new project
 * resource in the workspace
 */
public class CreateKermetaProjectWizard extends Wizard {

    private KermetaNewProjectWizard wizard;
    private KermetaNewProjectWizardPage page;
    private IConfigurationElement configurationElement;
    
    /**
     * Creates an empty wizard for creating a new project
     * in the workspace.
     */
    public CreateKermetaProjectWizard(KermetaNewProjectWizard wizard, KermetaNewProjectWizardPage page) {
        super();
        this.wizard = wizard;
        this.page = page;
    }
    
    /**
     * Creates a new project resource with the entered name.
     *
     * @return the created project resource, or <code>null</code> if the project
     *    was not created
     */
    private IProject createNewProject() {
        // get a project handle
        final IProject newProjectHandle = wizard.getNewProjectPage().getProjectHandle();
        
        // get a project descriptor
        IPath defaultPath = Platform.getLocation();
        IPath newPath = wizard.getNewProjectPage().getLocationPath();
        if (defaultPath.equals(newPath))
            newPath = null;
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        final IProjectDescription description = workspace.newProjectDescription(newProjectHandle.getName());
        description.setLocation(newPath);
        
        // define the operation to create a new project
        WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
            protected void execute(IProgressMonitor monitor) throws CoreException {
                createProject(description, newProjectHandle, monitor);
            }
        };
        

        // define the operation to create the folders of this new project
        WorkspaceModifyOperation opf = new WorkspaceModifyOperation() {
            protected void execute(IProgressMonitor monitor) throws CoreException {
                page.createFolders(newProjectHandle);
            }};
        
        
        
        // run the operation to create a new project
        try {
            setContainer(wizard.getContainer());
            getContainer().run(true, true, op);
            
        }
        catch (InterruptedException e) {
            return null;
        }
        catch (InvocationTargetException e) {
            System.err.println("Attention ça va être long.......");
            e.printStackTrace();
            
            Throwable t = e.getTargetException();
            if (t instanceof CoreException) {
                if (((CoreException)t).getStatus().getCode() == IResourceStatus.CASE_VARIANT_EXISTS) {
                    MessageDialog.openError(
                            getShell(), 
                            IDEWorkbenchMessages.getString("CreateProjectWizard.errorTitle"),  //$NON-NLS-1$
                            IDEWorkbenchMessages.getString("CreateProjectWizard.caseVariantExistsError")  //$NON-NLS-1$,
                    );	
                } else {
                    ErrorDialog.openError(
                            getShell(), 
                            IDEWorkbenchMessages.getString("CreateProjectWizard.errorTitle"),  //$NON-NLS-1$
                            null, // no special message
                            ((CoreException) t).getStatus());
                }
            } else {
                // Unexpected runtime exceptions and errors may still occur.
                RunnerPlugin.getDefault().getLog().log(
                        new Status(
                                Status.ERROR, 
                                PlatformUI.PLUGIN_ID, 
                                0, 
                                t.toString(),
                                t));
                MessageDialog.openError(
                        getShell(),
                        IDEWorkbenchMessages.getString("CreateProjectWizard.errorTitle"),  //$NON-NLS-1$
                        IDEWorkbenchMessages.format("CreateProjectWizard.internalError", new Object[] {t.getMessage()})); //$NON-NLS-1$
            }
            return null;
        }
        
        return newProjectHandle;
    }
    
    /**
     * Creates a project resource given the project handle and description.
     *
     * @param description the project description to create a project resource for
     * @param projectHandle the project handle to create a project resource for
     * @param monitor the progress monitor to show visual progress with
     *
     * @exception CoreException if the operation fails
     * @exception OperationCanceledException if the operation is canceled
     */
    private void createProject(IProjectDescription description, IProject projectHandle, IProgressMonitor monitor) throws CoreException, OperationCanceledException {
        try {
            monitor.beginTask("", 2000); //$NON-NLS-1$
            
            projectHandle.create(description, new SubProgressMonitor(monitor,1000));
            
            if (monitor.isCanceled())
                throw new OperationCanceledException();
            
            projectHandle.open(new SubProgressMonitor(monitor,1000));

            //page.createFolders(projectHandle);
            
        } finally {
            monitor.done();
        }
    }
    
    /**
     * Returns the current project name.
     *
     * @return the project name or <code>null</code>
     *   if no project name is known
     */
    public String getProjectName() {
        return wizard.getNewProjectPage().getProjectName();
    }
    
    /**
     * Method called when user has clicked on the finish Button
     * Method declared on IWizard.
     */
    public boolean performFinish() {
        
        if (wizard.getNewProject() != null)
        {
            System.out.println("Should never occur : new project exists " +
            		"before the 'Finish' action...");
            return true;
        }
        
        IProject project = createNewProject();
        if (project != null) {
            wizard.setNewProject(project);
            page.createFolders(project);

			BasicNewProjectResourceWizard.updatePerspective(this.configurationElement);
            return true;
        } else {
            return false;
        }
    }
    
    

    /* (non-Javadoc)
     * @see org.eclipse.jface.wizard.IWizard#setContainer(org.eclipse.jface.wizard.IWizardContainer)
     */
    public void setContainer(IWizardContainer wizardContainer) {
        // TODO Auto-generated method stub
        super.setContainer(wizardContainer);
    }
    
	/**
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
	    System.out.println("Call of setInitializationData");
	    this.configurationElement = config;
	}
}
