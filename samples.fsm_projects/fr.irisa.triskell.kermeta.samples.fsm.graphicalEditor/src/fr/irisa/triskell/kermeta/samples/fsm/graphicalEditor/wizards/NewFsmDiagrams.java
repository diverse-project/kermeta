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

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.wizards;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.topcased.modeler.ModelerPlugin;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.di.model.DiagramInterchangeFactory;
import org.topcased.modeler.di.model.EMFSemanticModelBridge;
import org.topcased.modeler.diagrams.model.Diagrams;
import org.topcased.modeler.diagrams.model.DiagramsFactory;
import org.topcased.modeler.extensions.Template;
import org.topcased.modeler.extensions.TemplatesManager;
import org.topcased.modeler.wizards.DiagramsPage;

import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.FsmImageRegistry;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.FsmPlugin;

/**
 * Generated wizard that offers the model creation facilities. <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NewFsmDiagrams extends Wizard implements INewWizard {
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
		setDefaultPageImageDescriptor(FsmImageRegistry
				.getImageDescriptor("NEW_PAGE_WZD"));
		setDialogSettings(FsmPlugin.getDefault().getDialogSettings());
		setWindowTitle("Create new Fsm diagrams");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 * @generated
	 */
	public boolean performFinish() {
		boolean result = true;
		if (diagPage.isPageComplete()) {
			result = result & createModelFile();
			result = result & createDiagramFile();
			if (createdFile != null && result) {
				// Open the newly created model
				try {
					IDE.openEditor(FsmPlugin.getDefault().getWorkbench()
							.getActiveWorkbenchWindow().getActivePage(),
							createdFile, true);
				} catch (PartInitException pie) {
					FsmPlugin.log(pie);
				}
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 * @generated
	 */
	public void addPages() {
		diagPage = new FsmDiagramsPage("New Fsm Graphical Editor Diagram",
				selection);
		diagPage.setTitle("Fsm Diagrams");
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return true if the model file was successfully created
	 * @generated
	 */
	private boolean createModelFile() {
		if (diagPage.isNewModel()) {
			try {
				Template template = TemplatesManager.getInstance().find(
						diagPage.getTemplateId()).getTemplateModel();
				template.setDestination(diagPage.getSelectedIContainer());
				template.addVariable("name", diagPage.getModelName());

				template.generate(new NullProgressMonitor());
			} catch (CoreException ce) {
				FsmPlugin.log(ce);
				ModelerPlugin.displayDialog(null,
						"An error occured during the template generation.",
						IStatus.ERROR);
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return true if the diagram file was successfully created
	 * @generated
	 */
	private boolean createDiagramFile() {
		if (diagPage.isNewModel()) {
			try {
				Template template = TemplatesManager.getInstance().find(
						diagPage.getTemplateId()).getTemplateDI();
				template.setDestination(diagPage.getSelectedIContainer());
				template.addVariable("name", diagPage.getModelName());

				createdFile = (IFile) template
						.generate(new NullProgressMonitor());
			} catch (CoreException ce) {
				FsmPlugin.log(ce);
				ModelerPlugin.displayDialog(null,
						"An error occured during the template generation.",
						IStatus.ERROR);
				return false;
			}
		} else {
			// retrieve the Diagrams and the DiagramInterchange factory singletons
			DiagramsFactory factory = DiagramsFactory.eINSTANCE;
			DiagramInterchangeFactory factory2 = DiagramInterchangeFactory.eINSTANCE;

			// create the EObject of the diagram model
			Diagrams diagrams = factory.createDiagrams();
			Diagram rootDiagram = factory2.createDiagram();
			EMFSemanticModelBridge emfSemanticModelBridge = factory2
					.createEMFSemanticModelBridge();

			// set the properties of the diagrams model
			diagrams.setModel(diagPage.getRootEObject());
			diagrams.getDiagrams().add(rootDiagram);

			// set the properties of the Diagram
			rootDiagram.setSize(new Dimension(100, 100));
			rootDiagram.setViewport(new Point(0, 0));
			rootDiagram.setPosition(new Point(0, 0));
			rootDiagram.setName(diagPage.getModelName());
			rootDiagram.setSemanticModel(emfSemanticModelBridge);

			// set the properties of the SemanticModelBridge
			emfSemanticModelBridge.setElement(diagPage.getDiagramEObject());
			emfSemanticModelBridge.setPresentation(diagPage.getDiagramId());

			// create the diagram file and add the created model into
			createdFile = ResourcesPlugin.getWorkspace().getRoot().getFile(
					new Path(diagPage.getSelectedIContainer().getFullPath()
							.toString()
							+ File.separator
							+ diagPage.getModelName()
							+ ".fsmdi"));
			ResourceSet rsrcSet = new ResourceSetImpl();
			URI uri = URI.createPlatformResourceURI(createdFile.getFullPath()
					.toString());
			Resource resource = rsrcSet.createResource(uri);
			resource.getContents().add(diagrams);

			// Save the resource contents to the file system.
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				FsmPlugin.log(e);
				ModelerPlugin.displayDialog(null,
						"The Diagram file could not be saved.", IStatus.ERROR);
			}
		}
		return true;
	}
}
