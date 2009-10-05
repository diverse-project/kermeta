/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.requests.CreationFactory;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerConnectionCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;
import org.topcased.modeler.editor.palette.ModelerPaletteManager;

/**
 * Generated Palette Manager
 * 
 * @generated
 */
public class LogoCSMPaletteManager extends ModelerPaletteManager
{
	// declare all the palette categories of the diagram
	/**
	 * @generated
	 */
	private PaletteDrawer	primitivesDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer	controlDrawer;
	/**
	 * @generated
	 */
	private PaletteDrawer	linksDrawer;

	/**
	 * @generated
	 */
	private ICreationUtils	creationUtils;

	/**
	 * The Constructor
	 * 
	 * @param utils
	 *        the creation utils for the tools of the palette
	 * @generated
	 */
	public LogoCSMPaletteManager(ICreationUtils utils)
	{
		super();
		this.creationUtils = utils;
	}

	/**
	 * Creates the main categories of the palette
	 * 
	 * @generated
	 */
	protected void createCategories()
	{
		createPrimitivesDrawer();
		createControlDrawer();
		createLinksDrawer();
	}

	/**
	 * Updates the main categories of the palette
	 * 
	 * @generated
	 */
	protected void updateCategories()
	{
		// deletion of the existing categories and creation of the updated categories

		getRoot().remove(primitivesDrawer);
		createPrimitivesDrawer();

		getRoot().remove(controlDrawer);
		createControlDrawer();

		getRoot().remove(linksDrawer);
		createLinksDrawer();
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 * 
	 * @generated
	 */
	private void createPrimitivesDrawer()
	{
		primitivesDrawer = new PaletteDrawer("Primitives", null);
		List entries = new ArrayList();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils, LogoCSMPackage.eINSTANCE.getForward(), "default");
		entries.add(new ModelerCreationToolEntry("Go Forward", "Go Forward", factory, LogoCSMImageRegistry
				.getImageDescriptor("FORWARD"), LogoCSMImageRegistry.getImageDescriptor("FORWARD_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils, LogoCSMPackage.eINSTANCE.getBack(), "default");
		entries.add(new ModelerCreationToolEntry("Go Backward", "Go Backward", factory, LogoCSMImageRegistry
				.getImageDescriptor("BACK"), LogoCSMImageRegistry.getImageDescriptor("BACK_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils, LogoCSMPackage.eINSTANCE.getLeft(), "default");
		entries.add(new ModelerCreationToolEntry("Turn Left", "Turn Left", factory, LogoCSMImageRegistry
				.getImageDescriptor("LEFT"), LogoCSMImageRegistry.getImageDescriptor("LEFT_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils, LogoCSMPackage.eINSTANCE.getRight(), "default");
		entries.add(new ModelerCreationToolEntry("Turn Right", "Turn Right", factory, LogoCSMImageRegistry
				.getImageDescriptor("RIGHT"), LogoCSMImageRegistry.getImageDescriptor("RIGHT_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils, LogoCSMPackage.eINSTANCE.getPenUp(), "default");
		entries.add(new ModelerCreationToolEntry("Pen Up", "Pen Up", factory, LogoCSMImageRegistry
				.getImageDescriptor("PENUP"), LogoCSMImageRegistry.getImageDescriptor("PENUP_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils, LogoCSMPackage.eINSTANCE.getPenDown(), "default");
		entries.add(new ModelerCreationToolEntry("Pen Down", "Pen Down", factory, LogoCSMImageRegistry
				.getImageDescriptor("PENDOWN"), LogoCSMImageRegistry.getImageDescriptor("PENDOWN_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils, LogoCSMPackage.eINSTANCE.getClear(), "default");
		entries.add(new ModelerCreationToolEntry("Clear the window", "Clear the window", factory, LogoCSMImageRegistry
				.getImageDescriptor("CLEAR"), LogoCSMImageRegistry.getImageDescriptor("CLEAR_LARGE")));

		primitivesDrawer.addAll(entries);
		getRoot().add(primitivesDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 * 
	 * @generated
	 */
	private void createControlDrawer()
	{
		controlDrawer = new PaletteDrawer("Control", null);
		List entries = new ArrayList();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils, LogoCSMPackage.eINSTANCE.getBlock(), "default");
		entries.add(new ModelerCreationToolEntry("Block", "Block", factory, LogoCSMImageRegistry
				.getImageDescriptor("BLOCK"), LogoCSMImageRegistry.getImageDescriptor("BLOCK_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils, LogoCSMPackage.eINSTANCE.getIf(), "default");
		entries.add(new ModelerCreationToolEntry("If", "If", factory, LogoCSMImageRegistry.getImageDescriptor("IF"),
			LogoCSMImageRegistry.getImageDescriptor("IF_LARGE")));

		factory = new GraphElementCreationFactory(creationUtils, LogoCSMPackage.eINSTANCE.getRepeat(), "default");
		entries.add(new ModelerCreationToolEntry("Repeat", "Repeat", factory, LogoCSMImageRegistry
				.getImageDescriptor("REPEAT"), LogoCSMImageRegistry.getImageDescriptor("REPEAT_LARGE")));

		controlDrawer.addAll(entries);
		getRoot().add(controlDrawer);
	}

	/**
	 * Creates the Palette container containing all the Palette entries for each figure.
	 * 
	 * @generated
	 */
	private void createLinksDrawer()
	{
		linksDrawer = new PaletteDrawer("Links", null);
		List entries = new ArrayList();

		CreationFactory factory;

		factory = new GraphElementCreationFactory(creationUtils, LogoCSMSimpleObjectConstants.SIMPLE_OBJECT_SEQUENCE,
			"default", false);
		entries.add(new ModelerConnectionCreationToolEntry("Sequence", "Sequence", factory, LogoCSMImageRegistry
				.getImageDescriptor("SEQUENCE"), LogoCSMImageRegistry.getImageDescriptor("SEQUENCE_LARGE")));

		linksDrawer.addAll(entries);
		getRoot().add(linksDrawer);
	}

}
