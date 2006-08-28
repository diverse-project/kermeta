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

import java.net.URL;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.EditPartFactory;
import org.topcased.modeler.editor.IConfiguration;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.IPaletteManager;
import org.topcased.modeler.graphconf.DiagramGraphConf;

import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.FsmPlugin;

/**
 * A diagram configuration : manages Palette, EditPartFactory for this diagram.
 * <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmConfiguration implements IConfiguration {
	private FsmPaletteManager paletteManager;

	private FsmEditPartFactory editPartFactory;

	private FsmCreationUtils creationUtils;

	/**
	 * The DiagramGraphConf that contains graphical informations on the
	 * configuration
	 */
	private DiagramGraphConf diagramGraphConf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getId()
	 * @generated
	 */
	public String getId() {
		return new String(
				"fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getName()
	 * @generated
	 */
	public String getName() {
		return new String("Fsm Diagram");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getEditPartFactory()
	 * @generated
	 */
	public EditPartFactory getEditPartFactory() {
		if (editPartFactory == null)
			editPartFactory = new FsmEditPartFactory();

		return editPartFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getPaletteManager()
	 * @generated
	 */
	public IPaletteManager getPaletteManager() {
		if (paletteManager == null)
			paletteManager = new FsmPaletteManager(getCreationUtils());

		return paletteManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getCreationUtils()
	 * @generated
	 */
	public ICreationUtils getCreationUtils() {
		if (creationUtils == null)
			creationUtils = new FsmCreationUtils(getDiagramGraphConf());

		return creationUtils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getDiagramGraphConf()
	 * @generated
	 */
	public DiagramGraphConf getDiagramGraphConf() {
		if (diagramGraphConf == null) {
			URL url = FsmPlugin
					.getDefault()
					.getBundle()
					.getResource(
							"fr/irisa/triskell/kermeta/samples/fsm/graphicalEditor/diagram/diagram.graphconf");
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
				FsmPlugin
						.log(
								"The *.diagramgraphconf file can not be retrieved. Check if the path is correct in the Configuration class of your diagram.",
								IStatus.WARNING);
			}
		}

		return diagramGraphConf;
	}

}