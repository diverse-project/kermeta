package fr.irisa.triskell.kermeta.graphicaleditor.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerConnectionCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
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
	private PaletteDrawer basicDrawer;

	private PaletteDrawer edgesDrawer;

	private ICreationUtils creationUtils;

	/**
	 * The Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param utils the creation utils for the tools of the palette 
	 * @generated
	 */
	public StructurePaletteManager(ICreationUtils utils) {
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
		createBasicDrawer();
		createEdgesDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void updateCategories() {
		// deletion of the existing categories and creation of the updated categories

		getRoot().remove(basicDrawer);
		createBasicDrawer();

		getRoot().remove(edgesDrawer);
		createEdgesDrawer();
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private void createBasicDrawer() {
		basicDrawer = new PaletteDrawer("Basic", null);
		List entries = new ArrayList();

		CreationFactory factory;
		String newObjTxt;

		ModelerCreationToolEntry objectTool;
		ModelerConnectionCreationToolEntry connectionTool;

		newObjTxt = "Package";
		factory = new GraphElementCreationFactory(creationUtils,
				StructurePackage.eINSTANCE.getPackage());
		objectTool = new ModelerCreationToolEntry(newObjTxt, newObjTxt,
				factory, StructureImageRegistry.getImageDescriptor("PACKAGE"),
				null, 70, 50, 70, 50);
		entries.add(objectTool);
		newObjTxt = "ClassDefinition";
		factory = new GraphElementCreationFactory(creationUtils,
				StructurePackage.eINSTANCE.getClassDefinition());
		objectTool = new ModelerCreationToolEntry(newObjTxt, newObjTxt,
				factory, StructureImageRegistry
						.getImageDescriptor("CLASSDEFINITION"), null, 70, 40,
				70, 70);
		entries.add(objectTool);
		newObjTxt = "Operation";
		factory = new GraphElementCreationFactory(creationUtils,
				StructurePackage.eINSTANCE.getOperation());
		objectTool = new ModelerCreationToolEntry(newObjTxt, newObjTxt,
				factory,
				StructureImageRegistry.getImageDescriptor("OPERATION"), null,
				-1, -1, 0, 0);
		entries.add(objectTool);
		newObjTxt = "Tag";
		factory = new GraphElementCreationFactory(creationUtils,
				StructurePackage.eINSTANCE.getTag());
		objectTool = new ModelerCreationToolEntry(newObjTxt, newObjTxt,
				factory, StructureImageRegistry.getImageDescriptor("TAG"),
				null, 70, 50, 70, 50);
		entries.add(objectTool);

		basicDrawer.addAll(entries);
		getRoot().add(basicDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private void createEdgesDrawer() {
		edgesDrawer = new PaletteDrawer("Edges", null);
		List entries = new ArrayList();

		CreationFactory factory;
		String newObjTxt;

		ModelerCreationToolEntry objectTool;
		ModelerConnectionCreationToolEntry connectionTool;

		newObjTxt = "Property";
		factory = new GraphElementCreationFactory(creationUtils,
				StructurePackage.eINSTANCE.getProperty());
		connectionTool = new ModelerConnectionCreationToolEntry(newObjTxt,
				newObjTxt, factory, StructureImageRegistry
						.getImageDescriptor("PROPERTY"), null);
		entries.add(connectionTool);

		newObjTxt = "Inheritance";
		factory = new GraphElementCreationFactory(creationUtils,
				StructureEditPolicyConstants.INHERITANCE_EDITPOLICY, false);
		connectionTool = new ModelerConnectionCreationToolEntry(newObjTxt,
				newObjTxt, factory, StructureImageRegistry
						.getImageDescriptor("INHERITANCE"), null);
		entries.add(connectionTool);

		newObjTxt = "TagLink";
		factory = new GraphElementCreationFactory(creationUtils,
				StructureEditPolicyConstants.TAGLINK_EDITPOLICY, false);
		connectionTool = new ModelerConnectionCreationToolEntry(newObjTxt,
				newObjTxt, factory, StructureImageRegistry
						.getImageDescriptor("TAGLINK"), null);
		entries.add(connectionTool);
		// below : only generated for test purposes
	/*	newObjTxt = "PropertyAsNode";
		factory = new GraphElementCreationFactory(creationUtils,
				StructureEditPolicyConstants.PROPERTYASNODE_EDITPOLICY, true);
		objectTool = new ModelerCreationToolEntry(newObjTxt, newObjTxt,
				factory, StructureImageRegistry
						.getImageDescriptor("PROPERTYASNODE"), null, 0, 0, 0, 0);
		entries.add(objectTool);*/

		edgesDrawer.addAll(entries);
		getRoot().add(edgesDrawer);
	}

	/*
	 * 
	 * Please do not remove the following code. They are accessors
	 * used by inherited class ExtendedStructurePaletteManager.
	 */

	/**
	 * Dirty change of visibility for createBasicDrawer.
	 * The aim is to let createBasicDrawer be regenerated correctly.
	 * */
	public void createBasicDrawer_public() {
		createBasicDrawer();
	}

	public void createEdgesDrawer_public() {
		createEdgesDrawer();
	}

	/**
	 * @return Returns the basicDrawer.
	 */
	public PaletteDrawer getBasicDrawer() {
		return basicDrawer;
	}

	/**
	 * @return Returns the creationUtils.
	 */
	public ICreationUtils getCreationUtils() {
		return creationUtils;
	}

	/**
	 * @return Returns the edgesDrawer.
	 */
	public PaletteDrawer getEdgesDrawer() {
		return edgesDrawer;
	}

}
