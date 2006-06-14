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

import org.eclipse.gef.EditPartFactory;
import org.topcased.modeler.editor.IConfiguration;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.IPaletteManager;

/**
 * A diagram configuration : manages Palette, EditPartFactory for this diagram.
 * <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmDiagramConfiguration implements IConfiguration {
	private FsmDiagramPaletteManager paletteManager;

	private FsmDiagramEditPartFactory editPartFactory;

	private FsmDiagramCreationUtils creationUtils;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getId()
	 * @generated
	 */
	public String getId() {
		return new String("fsmdiagram");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getName()
	 * @generated
	 */
	public String getName() {
		return new String("Fsm_Diagram");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getEditPartFactory()
	 * @generated
	 */
	public EditPartFactory getEditPartFactory() {
		if (editPartFactory == null)
			editPartFactory = new FsmDiagramEditPartFactory();

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
			paletteManager = new FsmDiagramPaletteManager(getCreationUtils());

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
			creationUtils = new FsmDiagramCreationUtils();

		return creationUtils;
	}
}