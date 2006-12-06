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

package fr.irisa.triskell.kermeta.graphicaleditor.diag;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerConnectionCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

/**
 * Generated Palette Manager
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructurePaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	private PaletteDrawer nodeDrawer;

	private PaletteDrawer edgeDrawer;

	// private ICreationUtils creationUtilsNode;
	private ICreationUtils creationUtilsNode;
	// private ICreationUtils creationUtilsEdge;
	private ICreationUtils creationUtilsEdge;

	/**
	 * The Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param utils the creation utils for the tools of the palette 
	 * @generated NOT
	 */
	public StructurePaletteManager(ICreationUtils utilsNode, ICreationUtils utilsEdge) {
		super();
		this.creationUtilsNode = utilsNode;
		this.creationUtilsEdge = utilsEdge;
	}

	/**
	 * Creates the main categories of the palette
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCategories() {
		createNodeDrawer();
		createEdgeDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void updateCategories() {
		// deletion of the existing categories and creation of the updated categories

		getRoot().remove(nodeDrawer);
		createNodeDrawer();

		getRoot().remove(edgeDrawer);
		createEdgeDrawer();
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private void createNodeDrawer() {
		nodeDrawer = new PaletteDrawer("Node", null);
		List entries = new ArrayList();

		CreationFactory factory;
		String newObjTxt;

		ModelerCreationToolEntry objectTool;
		ModelerConnectionCreationToolEntry connectionTool;

		factory = new GraphElementCreationFactory(creationUtilsNode,
				StructurePackage.eINSTANCE.getPackage(), "default");
		entries.add(new ModelerCreationToolEntry("Package", "Package",
				factory, StructureImageRegistry.getImageDescriptor("PACKAGE"),
				null));
		
		factory = new GraphElementCreationFactory(creationUtilsNode,
				StructurePackage.eINSTANCE.getClassDefinition(), "default");
		entries.add(new ModelerCreationToolEntry("ClassDefinition", "ClassDefinition",
				factory, StructureImageRegistry
						.getImageDescriptor("CLASSDEFINITION"), null));
		
		factory = new GraphElementCreationFactory(creationUtilsNode,
				StructurePackage.eINSTANCE.getProperty(), "default");
		entries.add(new ModelerCreationToolEntry("Property", "Property as node",
				factory, StructureImageRegistry.getImageDescriptor("PROPERTY_NODE"),
				StructureImageRegistry.getImageDescriptor("PROPERTY_LARGE")));
		
		factory = new GraphElementCreationFactory(creationUtilsNode,
				StructurePackage.eINSTANCE.getOperation(), "default");
		entries.add(new ModelerCreationToolEntry("Operation", "Operation",
				factory,
				StructureImageRegistry.getImageDescriptor("OPERATION"), null));

		nodeDrawer.addAll(entries);
		getRoot().add(nodeDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private void createEdgeDrawer() {
		edgeDrawer = new PaletteDrawer("Edge", null);
		List entries = new ArrayList();

		CreationFactory factory;
		String newObjTxt;

		ModelerCreationToolEntry objectTool;
		ModelerConnectionCreationToolEntry connectionTool;

		factory = new GraphElementCreationFactory(creationUtilsEdge,
				StructureSimpleObjectConstants.SIMPLE_OBJECT_INHERITANCE,
				"default", false);
		entries.add(new ModelerConnectionCreationToolEntry("Inheritance link",
				"Inheritance link", factory, StructureImageRegistry
						.getImageDescriptor("INHERITANCE"), null));

		factory = new GraphElementCreationFactory(creationUtilsEdge,
				StructurePackage.eINSTANCE.getProperty(), "default");
		entries.add(new ModelerConnectionCreationToolEntry("Property",
				"Property as edge", factory, StructureImageRegistry
						.getImageDescriptor("PROPERTY_EDGE"), null));

		edgeDrawer.addAll(entries);
		getRoot().add(edgeDrawer);
	}

}
