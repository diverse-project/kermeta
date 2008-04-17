/*******************************************************************************
 * $Id: KmPaletteManager.java,v 1.5 2008-04-17 12:06:12 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerConnectionCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

/**
 * Generated Palette Manager
 *
 * @generated
 */
public class KmPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer nodeDrawer;

	/**
	 * @generated
	 */
	private PaletteDrawer edgeDrawer;

	/**
	 * @generated
	 */
	private ICreationUtils creationUtils;

	/**
	 * The Constructor
	 *
	 * @param utils the creation utils for the tools of the palette 
	 * @generated
	 */
	public KmPaletteManager(ICreationUtils utils) {
		super();
		this.creationUtils = utils;
	}

	/**
	 * Creates the main categories of the palette
	 *
	 * @generated
	 */
	protected void createCategories() {
		createNodeDrawer();
		createEdgeDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 *
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
	 *
	 * @generated NOT
	 * remove all "xxx_LARGE"
	 * 
	 */
	private void createNodeDrawer() {
		nodeDrawer = new PaletteDrawer("Node", null);
		List entries = new ArrayList();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				StructurePackage.eINSTANCE.getPackage(), "default");
		entries.add(new ModelerCreationToolEntry("Package", "Package", factory,
				KmImageRegistry.getImageDescriptor("PACKAGE"), null));

		factory = new GraphElementCreationFactory(creationUtils,
				StructurePackage.eINSTANCE.getClassDefinition(), "default");
		entries.add(new ModelerCreationToolEntry("ClassDefinition",
				"ClassDefinition", factory, KmImageRegistry
						.getImageDescriptor("CLASSDEFINITION"), null));

		factory = new GraphElementCreationFactory(creationUtils,
				StructurePackage.eINSTANCE.getProperty(), "propertyNode");
		entries.add(new ModelerCreationToolEntry("Property", "Property",
				factory, KmImageRegistry.getImageDescriptor("PROPERTYNODE"),
				null));

		factory = new GraphElementCreationFactory(creationUtils,
				StructurePackage.eINSTANCE.getOperation(), "default");
		entries
				.add(new ModelerCreationToolEntry("Operation", "Operation",
						factory, KmImageRegistry
								.getImageDescriptor("OPERATION"), null));

		nodeDrawer.addAll(entries);
		getRoot().add(nodeDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated NOT
	 * "PROPERTY" becomes "PROPERTYEDGE"
	 * remove all "xxx_LARGE"
	 */
	private void createEdgeDrawer() {
		edgeDrawer = new PaletteDrawer("Edge", null);
		List entries = new ArrayList();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				KmSimpleObjectConstants.SIMPLE_OBJECT_INHERITANCE, "default",
				false);
		entries.add(new ModelerConnectionCreationToolEntry("Inheritance link",
				"Inheritance link", factory, KmImageRegistry
						.getImageDescriptor("INHERITANCE"), null));

		factory = new GraphElementCreationFactory(creationUtils,
				StructurePackage.eINSTANCE.getProperty(), "default");
		entries.add(new ModelerConnectionCreationToolEntry("Property",
				"Property", factory, KmImageRegistry
						.getImageDescriptor("PROPERTYEDGE"), null));

		edgeDrawer.addAll(entries);
		getRoot().add(edgeDrawer);
	}

}
