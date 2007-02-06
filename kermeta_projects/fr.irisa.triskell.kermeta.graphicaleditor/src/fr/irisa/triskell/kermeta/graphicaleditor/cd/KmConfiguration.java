/*******************************************************************************
 * $Id: KmConfiguration.java,v 1.1 2007-02-06 17:45:46 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd;

import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.EditPartFactory;
import org.topcased.modeler.editor.IConfiguration;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.IPaletteManager;
import org.topcased.modeler.graphconf.DiagramGraphConf;
import org.topcased.modeler.graphconf.exceptions.MissingGraphConfFileException;

import fr.irisa.triskell.kermeta.graphicaleditor.KmPlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.ClassDefinitionEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.OperationEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.PackageEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.PropertyEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.PropertyNodeEditPart;

/**
 * A diagram configuration : manages Palette, EditPartFactory for this diagram.
 *
 * @generated
 */
public class KmConfiguration implements IConfiguration {
	/**
	 * @generated
	 */
	private KmPaletteManager paletteManager;

	/**
	 * @generated
	 */
	private KmEditPartFactory editPartFactory;

	/**
	 * @generated
	 */
	private KmCreationUtils creationUtils;

	/**
	 * The DiagramGraphConf that contains graphical informations on the configuration
	 * @generated
	 */
	private DiagramGraphConf diagramGraphConf;

	/**
	 * Constructor. Initialize Adapter factories.
	 *
	 * @generated
	 */
	public KmConfiguration() {
		registerAdapters();
	}

	/**
	 * Registers the Adapter Factories for all the EditParts
	 *
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
		Platform
				.getAdapterManager()
				.registerAdapters(
						new EditPart2ModelAdapterFactory(
								PropertyEditPart.class,
								fr.irisa.triskell.kermeta.language.structure.Property.class),
						PropertyEditPart.class);
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getId()
	 * @generated
	 */
	public String getId() {
		return new String("fr.irisa.triskell.kermeta.graphicaleditor.cd");
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getName()
	 * @generated
	 */
	public String getName() {
		return new String("Kermeta class diagram");
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getEditPartFactory()
	 * @generated
	 */
	public EditPartFactory getEditPartFactory() {
		if (editPartFactory == null)
			editPartFactory = new KmEditPartFactory();

		return editPartFactory;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getPaletteManager()
	 * @generated
	 */
	public IPaletteManager getPaletteManager() {
		if (paletteManager == null)
			paletteManager = new KmPaletteManager(getCreationUtils());

		return paletteManager;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getCreationUtils()
	 * @generated
	 */
	public ICreationUtils getCreationUtils() {
		if (creationUtils == null)
			creationUtils = new KmCreationUtils(getDiagramGraphConf());

		return creationUtils;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getDiagramGraphConf()
	 * @generated
	 */
	public DiagramGraphConf getDiagramGraphConf() {
		if (diagramGraphConf == null) {
			URL url = KmPlugin
					.getDefault()
					.getBundle()
					.getResource(
							"fr/irisa/triskell/kermeta/graphicaleditor/cd/diagram.graphconf");
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
				new MissingGraphConfFileException(
						"The *.diagramgraphconf file can not be retrieved. Check if the path is correct in the Configuration class of your diagram.");
			}
		}

		return diagramGraphConf;
	}

}