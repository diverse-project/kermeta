/* $Id$
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : ExtendedStructurePaletteManager.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 28, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.topcased.modeler.editor.GraphElementCreationFactory;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.palette.ModelerCreationToolEntry;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.extensions.ExtendedGraphElementCreationFactory;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

/**
 * This class extends StructurePaletteManager, so this latter class remains a
 * totally generated class. We will have to think about a way to do this kind of
 * extension more properly. (yet it is to add palette items that are linked to
 * special graph elements that needed to be hand-written)
 * 
 * @generated NOT
 */
public class ExtendedStructurePaletteManager extends StructurePaletteManager {

	public ExtendedStructurePaletteManager(ICreationUtils creationUtils) {
		super(creationUtils);
	}

	protected void createBasicDrawer() {
		super.createBasicDrawer_public();
		// getRoot().remove(getBasicDrawer());
		List<CreationToolEntry> entries = new ArrayList<CreationToolEntry>();
		ModelerCreationToolEntry objectTool;
		CreationFactory factory;
		String newObjTxt;
		newObjTxt = "Standard Property";
		factory = new ExtendedGraphElementCreationFactory(getCreationUtils(),
				StructurePackage.eINSTANCE.getProperty());
		objectTool = new ModelerCreationToolEntry(newObjTxt, newObjTxt,
				factory, StructureImageRegistry.getImageDescriptor("PROPERTY"),
				null, 0, 0, 0, 0);
		entries.add(objectTool);
		// getBasicDrawer().add(objectTool);
		// getRoot().add(0,getBasicDrawer());

		newObjTxt = "Operation";
		factory = new GraphElementCreationFactory(getCreationUtils(),
				StructurePackage.eINSTANCE.getOperation());
		objectTool = new ModelerCreationToolEntry(newObjTxt, newObjTxt,
				factory,
				StructureImageRegistry.getImageDescriptor("OPERATION"), null,
				-1, -1, 0, 0);
		entries.add(objectTool);

		/*newObjTxt = "Tag";
		factory = new GraphElementCreationFactory(getCreationUtils(),
				StructurePackage.eINSTANCE.getTag());
		objectTool = new ModelerCreationToolEntry(newObjTxt, newObjTxt,
				factory, StructureImageRegistry.getImageDescriptor("TAG"),
				null, 70, 50, 70, 50);
		entries.add(objectTool);*/
		getBasicDrawer().addAll(entries);
	}

	/**
	 * This is a stupid copy of the super class ' method
	 * 
	 * @see fr.irisa.triskell.kermeta.graphicaleditor.diagram.StructurePaletteManager#createCategories()
	 */
	protected void createCategories() {
		createBasicDrawer();
		createEdgesDrawer_public();
	}

	/**
	 * This is a stupid copy of the super class ' method since visibility seems
	 * not to
	 * 
	 * @see fr.irisa.triskell.kermeta.graphicaleditor.diagram.StructurePaletteManager#updateCategories()
	 */
	protected void updateCategories() {
		getRoot().remove(getBasicDrawer());
		createBasicDrawer();
		getRoot().remove(getEdgesDrawer());
		createEdgesDrawer_public();
	}

}
