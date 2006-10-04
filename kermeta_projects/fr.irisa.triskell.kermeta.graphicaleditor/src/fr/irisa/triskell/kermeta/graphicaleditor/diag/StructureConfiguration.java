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

import java.net.URL;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.EditPartFactory;
import org.topcased.modeler.editor.EditPart2ModelAdapterFactory;
import org.topcased.modeler.editor.IConfiguration;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.IPaletteManager;
import org.topcased.modeler.graphconf.DiagramGraphConf;

import fr.irisa.triskell.kermeta.graphicaleditor.StructurePlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.ClassDefinitionEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.OperationEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.PackageEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.PropertyNodeEditPart;

/**
 * A diagram configuration : manages Palette, EditPartFactory for this diagram.
 * <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureConfiguration implements IConfiguration {
	private StructurePaletteManager paletteManager;

	private StructureEditPartFactory editPartFactory;

	private StructureCreationNodeUtils creationUtilsNode;
	private StructureCreationEdgeUtils creationUtilsEdge;

	/**
	 * The DiagramGraphConf that contains graphical informations on the
	 * configuration
	 */
	private DiagramGraphConf diagramGraphConf;
	
	/**
	 * Constructor. Initialize Adapter factories.
	 * 
	 * @generated
	 */
	public StructureConfiguration() {
		registerAdapters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getId()
	 * @generated
	 */
	public String getId() {
		return new String("fr.irisa.triskell.kermeta.graphicaleditor");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getName()
	 * @generated
	 */
	public String getName() {
		return new String("Kermeta class diagram");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getEditPartFactory()
	 * @generated
	 */
	public EditPartFactory getEditPartFactory() {
		if (editPartFactory == null)
			editPartFactory = new StructureEditPartFactory();

		return editPartFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getPaletteManager()
	 * @generated NOT
	 */
	public IPaletteManager getPaletteManager() {
		if (paletteManager == null)
			paletteManager = new StructurePaletteManager(getCreationUtils(), getCreationUtilsEdge());

		return paletteManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getCreationUtils()
	 * @generated
	 */
	public ICreationUtils getCreationUtils() {
		if (creationUtilsNode == null)
			creationUtilsNode = new StructureCreationNodeUtils(getDiagramGraphConf());

		return creationUtilsNode;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getCreationUtilsEdge()
	 * @generated NOT
	 */
	public ICreationUtils getCreationUtilsEdge() {
		if (creationUtilsEdge == null)
			creationUtilsEdge = new StructureCreationEdgeUtils(getDiagramGraphConf());

		return creationUtilsEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getDiagramGraphConf()
	 * @generated
	 */
	public DiagramGraphConf getDiagramGraphConf() {
		if (diagramGraphConf == null) {
			URL url = StructurePlugin
					.getDefault()
					.getBundle()
					.getResource(
							"fr/irisa/triskell/kermeta/graphicaleditor/diag/diagram.graphconf");
			if (url != null) {
				URI fileURI = URI.createURI(url.toString());
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.getResource(fileURI, true);
				if (resource != null
						&& resource.getContents().get(0) instanceof DiagramGraphConf) {
					diagramGraphConf = (DiagramGraphConf) resource
							.getContents().get(0);
				}
			} else {
				StructurePlugin
						.log(
								"The *.diagramgraphconf file can not be retrieved. Check if the path is correct in the Configuration class of your diagram.",
								IStatus.WARNING);
			}
		}

		return diagramGraphConf;
	}

	/**
	 * Registers the Adapter Factories for all the EditParts
	 * @generated
	 */
	private void registerAdapters() {
		Platform
				.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(
								PackageEditPart.class,
								fr.irisa.triskell.kermeta.language.structure.Package.class),
						PackageEditPart.class);
		Platform
				.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(
								ClassDefinitionEditPart.class,
								fr.irisa.triskell.kermeta.language.structure.ClassDefinition.class),
						ClassDefinitionEditPart.class);
		Platform
				.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(
								PropertyNodeEditPart.class,
								fr.irisa.triskell.kermeta.language.structure.Property.class),
						PropertyNodeEditPart.class);
		Platform
				.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(
								OperationEditPart.class,
								fr.irisa.triskell.kermeta.language.structure.Operation.class),
						OperationEditPart.class);
	}
}