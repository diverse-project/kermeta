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

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.figures;

import org.eclipse.draw2d.Locator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.topcased.modeler.edit.locators.EdgeObjectOffsetLocator;
import org.topcased.modeler.figures.EdgeObjectOffsetEditableLabel;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.figures.IEdgeObjectOffsetFigure;
import org.topcased.modeler.figures.IGraphEdgeFigure;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionFigure extends PolylineConnectionEx implements
		IGraphEdgeFigure {

	private IEdgeObjectFigure inputEdgeObject;

	private Locator inputLocator;

	/**
	 * The constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionFigure() {
		super();

		inputEdgeObject = new EdgeObjectOffsetEditableLabel(this);
		inputLocator = new EdgeObjectOffsetLocator(
				(IEdgeObjectOffsetFigure) inputEdgeObject);
		add(inputEdgeObject, inputLocator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the object figure
	 * @generated
	 */
	public IEdgeObjectFigure getInputEdgeObjectFigure() {
		return inputEdgeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.figures.IGraphEdgeFigure#getLocator(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	public Locator getLocator(IEdgeObjectFigure edgeObjectfigure) {

		if (edgeObjectfigure == inputEdgeObject) {
			return inputLocator;
		}

		return null;
	}

}