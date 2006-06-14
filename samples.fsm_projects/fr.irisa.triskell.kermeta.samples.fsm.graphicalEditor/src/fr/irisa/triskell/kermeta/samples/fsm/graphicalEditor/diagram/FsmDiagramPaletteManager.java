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

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerConnectionCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;

import fr.irisa.triskell.kermeta.samples.fsm.FsmPackage;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.FsmEditorImageRegistry;

/**
 * Generated Palette Manager
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmDiagramPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	private PaletteDrawer objectsDrawer;

	private ICreationUtils creationUtils;

	/**
	 * The Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param utils the creation utils for the tools of the palette 
	 * @generated
	 */
	public FsmDiagramPaletteManager(ICreationUtils utils) {
		super();
		this.creationUtils = utils;
	}

	/**
	 * Creates the main categories of the palette
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCategories() {
		createObjectsDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void updateCategories() {
		// deletion of the existing categories and creation of the updated categories

		getRoot().remove(objectsDrawer);
		createObjectsDrawer();
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private void createObjectsDrawer() {
		objectsDrawer = new PaletteDrawer("Objects", null);
		List entries = new ArrayList();

		CreationFactory factory;
		String newObjTxt;

		ModelerCreationToolEntry objectTool;
		ModelerConnectionCreationToolEntry connectionTool;

		newObjTxt = "State";
		factory = new GraphElementCreationFactory(creationUtils,
				FsmPackage.eINSTANCE.getState());
		objectTool = new ModelerCreationToolEntry(newObjTxt, newObjTxt,
				factory, FsmEditorImageRegistry.getImageDescriptor("STATE"),
				null, 60, 40, 0, 0);
		entries.add(objectTool);
		newObjTxt = "Transition";
		factory = new GraphElementCreationFactory(creationUtils,
				FsmPackage.eINSTANCE.getTransition());
		connectionTool = new ModelerConnectionCreationToolEntry(newObjTxt,
				newObjTxt, factory, FsmEditorImageRegistry
						.getImageDescriptor("TRANSITION"), null);
		entries.add(connectionTool);

		objectsDrawer.addAll(entries);
		getRoot().add(objectsDrawer);
	}

}
