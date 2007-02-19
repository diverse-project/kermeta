/*******************************************************************************
 * $Id: NewKmDiagrams.java,v 1.2 2007-02-19 18:04:53 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
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
import org.topcased.modeler.extensions.Template;
import org.topcased.modeler.extensions.TemplatesManager;
import org.topcased.modeler.tools.DiagramFileInitializer;
import org.topcased.modeler.wizards.DiagramsPage;

import fr.irisa.triskell.kermeta.graphicaleditor.KmImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.KmPlugin;

/**
 * Generated wizard that offers the model creation facilities.
 *
 * @generated
 */
public class NewKmDiagrams extends Wizard implements INewWizard {
	/**
	 * @generated
	 */
	private IStructuredSelection selection;

	/**
	 * @generated
	 */
	private DiagramsPage diagPage;

	/**
	 * @generated
	 */
	private IFile createdFile;

	/**
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection sel) {
		createdFile = null;
		selection = sel;

		// TODO put the Wizard image
		setDefaultPageImageDescriptor(KmImageRegistry
				.getImageDescriptor("NEW_PAGE_WZD"));
		setDialogSettings(KmPlugin.getDefault().getDialogSettings());
		setWindowTitle("Create new Km diagrams");
	}

	/**
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 * @generated
	 */
	public boolean performFinish() {
		boolean result = true;
		if (diagPage.isPageComplete()) {
			if (diagPage.isNewModel()) {
				result = result & createModelFile();
				result = result & createDiagramFile();
				if (createdFile != null && result) {
					// Open the newly created model
					try {
						IDE.openEditor(KmPlugin.getDefault().getWorkbench()
								.getActiveWorkbenchWindow().getActivePage(),
								createdFile, true);
					} catch (PartInitException pie) {
						KmPlugin.log(pie);
					}
				}
			} else {
				createDiagramFromExistingModel();
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean createDiagramFromExistingModel() {
		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			/**
			 * @see org.eclipse.ui.actions.WorkspaceModifyOperation#execute(org.eclipse.core.runtime.IProgressMonitor)
			 */
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException,
					InterruptedException {
				DiagramFileInitializer initializer = new DiagramFileInitializer();
				try {
					initializer.createDiagram(diagPage.getRootEObject(),
							diagPage.getDiagramId(), diagPage.isInitialized(),
							monitor);
				} catch (IOException ioe) {
					throw new InvocationTargetException(ioe);
				}
			}
		};

		try {
			getContainer().run(false, true, op);
			return true;
		} catch (InvocationTargetException ite) {
			KmPlugin.log(ite);
		} catch (InterruptedException ie) {
			// Wizard stopped
		}
		return false;
	}

	/**
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 * @generated
	 */
	public void addPages() {
		diagPage = new KmDiagramsPage("New Kermeta class diagram Diagram",
				selection);
		diagPage.setTitle("Km Diagrams");
		diagPage.setDescription("Define the model diagram informations.");
		addPage(diagPage);
	}

	/**
	 * @see org.eclipse.jface.wizard.IWizard#canFinish()
	 * @generated
	 */
	public boolean canFinish() {
		return diagPage.isPageComplete();
	}

	/**
	 * @return true if the model file was successfully created
	 * @generated
	 */
	private boolean createModelFile() {
		try {
			Template template = TemplatesManager.getInstance().find(
					diagPage.getTemplateId()).getTemplateModel();
			template.setDestination(diagPage.getSelectedIContainer());
			template.addVariable("name", diagPage.getModelName());

			IResource res = template.generate(new NullProgressMonitor());
		} catch (CoreException ce) {
			KmPlugin.log(ce);
			KmPlugin.displayDialog(null,
					"An error occured during the template generation.",
					IStatus.ERROR);
			return false;
		}
		return true;
	}

	/**
	 * @return true if the diagram file was successfully created
	 * @generated
	 */
	private boolean createDiagramFile() {
		try {
			Template template = TemplatesManager.getInstance().find(
					diagPage.getTemplateId()).getTemplateDI();
			template.setDestination(diagPage.getSelectedIContainer());
			template.addVariable("name", diagPage.getModelName());

			createdFile = (IFile) template.generate(new NullProgressMonitor());
		} catch (CoreException ce) {
			KmPlugin.log(ce);
			KmPlugin.displayDialog(null,
					"An error occured during the template generation.",
					IStatus.ERROR);
			return false;
		}
		return true;
	}
}
