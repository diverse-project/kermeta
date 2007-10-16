/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.kermeta.trek.graphicaleditor.diag;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.requests.CreationFactory;
import org.kermeta.trek.TrekPackage;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;

/**
 * Generated Palette Manager
 *
 * @generated
 */
public class TrekPaletteManager extends ModelerPaletteManager {
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer categoryDrawer;

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
	public TrekPaletteManager(ICreationUtils utils) {
		super();
		this.creationUtils = utils;
	}

	/**
	 * Creates the main categories of the palette
	 *
	 * @generated
	 */
	protected void createCategories() {
		createCategoryDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 *
	 * @generated
	 */
	protected void updateCategories() {
		// deletion of the existing categories and creation of the updated categories

		getRoot().remove(categoryDrawer);
		createCategoryDrawer();
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 *
	 * @generated
	 */
	private void createCategoryDrawer() {
		categoryDrawer = new PaletteDrawer("Category", null);
		List entries = new ArrayList();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils,
				TrekPackage.eINSTANCE.getKUseCase(), "default");
		entries.add(new ModelerCreationToolEntry("K Use Case", "K Use Case",
				factory, TrekImageRegistry.getImageDescriptor("KUSECASE"),
				TrekImageRegistry.getImageDescriptor("KUSECASE_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils,
				TrekPackage.eINSTANCE.getKTestCase(), "default");
		entries.add(new ModelerCreationToolEntry("K Test Case", "K Test Case",
				factory, TrekImageRegistry.getImageDescriptor("KTESTCASE"),
				TrekImageRegistry.getImageDescriptor("KTESTCASE_LARGE")));

		categoryDrawer.addAll(entries);
		getRoot().add(categoryDrawer);
	}

}
