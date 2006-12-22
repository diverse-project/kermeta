/*******************************************************************************
 * $Id: FsmPaletteManager.java,v 1.3 2006-12-22 10:36:16 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
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

/**
 * Generated Palette Manager
 *
 * @generated
 */
public class FsmPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer objectsDrawer;

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
	public FsmPaletteManager(ICreationUtils utils) {
		super();
		this.creationUtils = utils;
	}

	/**
	 * Creates the main categories of the palette
	 *
	 * @generated
	 */
	protected void createCategories() {
		createObjectsDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 *
	 * @generated
	 */
	protected void updateCategories() {
		// deletion of the existing categories and creation of the updated categories

		getRoot().remove(objectsDrawer);
		createObjectsDrawer();
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createObjectsDrawer() {
		objectsDrawer = new PaletteDrawer("Objects", null);
		List entries = new ArrayList();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				FsmPackage.eINSTANCE.getState(), "default");
		entries.add(new ModelerCreationToolEntry("State", "State", factory,
				FsmImageRegistry.getImageDescriptor("STATE"), FsmImageRegistry
						.getImageDescriptor("STATE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				FsmPackage.eINSTANCE.getTransition(), "default");
		entries.add(new ModelerConnectionCreationToolEntry("Transition",
				"Transition", factory, FsmImageRegistry
						.getImageDescriptor("TRANSITION"), FsmImageRegistry
						.getImageDescriptor("TRANSITION_LARGE")));

		objectsDrawer.addAll(entries);
		getRoot().add(objectsDrawer);
	}

}
