/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *   Jacques Lescot (Anyware Technologies), Thomas Friol (Anyware Technologies),
 *   Nicolas Lalevée (Anyware Technologies) - initial API and implementation 
 ******************************************************************************/

package fr.irisa.triskell.kermeta.graphicaleditor.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.IDE;
import org.topcased.modeler.ModelerPlugin;
import org.topcased.modeler.extensions.Template;
import org.topcased.modeler.extensions.TemplatesManager;
import org.topcased.modeler.tools.DiagramFileInitializer;
import org.topcased.modeler.wizards.DiagramsPage;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.StructurePlugin;

/**
 * Generated wizard that offers the model creation facilities. <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NewStructureDiagrams extends Wizard implements INewWizard {
	private IStructuredSelection selection;

	private DiagramsPage diagPage;

	private IFile createdFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection sel) {
		createdFile = null;
		selection = sel;

		// TODO put the Wizard image
		setDefaultPageImageDescriptor(StructureImageRegistry
				.getImageDescriptor("NEW_PAGE_WZD"));
		setDialogSettings(StructurePlugin.getDefault().getDialogSettings());
		setWindowTitle("Create new Kermeta diagrams");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 * @generated
	 */
	public void addPages() {
		diagPage = new StructureDiagramsPage("New Kermeta metamodeler Diagram",
				selection);
		diagPage.setTitle("Kermeta Diagrams");
		diagPage.setDescription("Define the model diagram informations.");
		addPage(diagPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.wizard.IWizard#canFinish()
	 * @generated
	 */
	public boolean canFinish() {
		return diagPage.isPageComplete();
	}
	
	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.jface.wizard.IWizard#performFinish()
     * @generated
     */
    public boolean performFinish()
    {
        boolean result = true;
        if (diagPage.isPageComplete())
        {
            if (diagPage.isNewModel())
            {
                result = result & createModelFile();
                result = result & createDiagramFile();
                if (createdFile != null && result)
                {
                    // Open the newly created model
                    try
                    {
                        IDE.openEditor(
                                StructurePlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage(),
                                createdFile, true);
                    }
                    catch (PartInitException pie)
                    {
                    	StructurePlugin.log(pie);
                    }
                }
            }
            else
            {
                createDiagramFromExistingModel();
            }
        }
        return result;
    }

    private boolean createDiagramFromExistingModel()
    {
        WorkspaceModifyOperation op = new WorkspaceModifyOperation()
        {
            /**
             * @see org.eclipse.ui.actions.WorkspaceModifyOperation#execute(org.eclipse.core.runtime.IProgressMonitor)
             */
            protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException,
                    InterruptedException
            {
                DiagramFileInitializer initializer = new DiagramFileInitializer();
                try
                {
                    initializer.createDiagram(diagPage.getRootEObject(), diagPage.getDiagramId(),
                            diagPage.isInitialized(), monitor);
                }
                catch (IOException ioe)
                {
                    throw new InvocationTargetException(ioe);
                }
            }
        };

        try
        {
            getContainer().run(false, true, op);
            return true;
        }
        catch (InvocationTargetException ite)
        {
        	StructurePlugin.log(ite);
        }
        catch (InterruptedException ie)
        {
            // Wizard stopped
        }
        return false;
    }
    
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return true if the model file was successfully created
     * @generated
     */
    private boolean createModelFile()
    {
        try
        {
            Template template = TemplatesManager.getInstance().find(diagPage.getTemplateId()).getTemplateModel();
            template.setDestination(diagPage.getSelectedIContainer());
            template.addVariable("name", diagPage.getModelName());

            template.generate(new NullProgressMonitor());
        }
        catch (CoreException ce)
        {
        	StructurePlugin.log(ce);
            ModelerPlugin.displayDialog(null, "An error occured during the template generation.", IStatus.ERROR);
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return true if the diagram file was successfully created
     * @generated
     */
    private boolean createDiagramFile()
    {
        try
        {
            Template template = TemplatesManager.getInstance().find(diagPage.getTemplateId()).getTemplateDI();
            template.setDestination(diagPage.getSelectedIContainer());
            template.addVariable("name", diagPage.getModelName());

            createdFile = (IFile) template.generate(new NullProgressMonitor());
        }
        catch (CoreException ce)
        {
        	StructurePlugin.log(ce);
            ModelerPlugin.displayDialog(null, "An error occured during the template generation.", IStatus.ERROR);
            return false;
        }
        return true;
    }
}
