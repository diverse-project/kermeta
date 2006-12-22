/*******************************************************************************
 * $Id$
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.figures;

import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.handles.HandleBounds;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.topcased.modeler.edit.locators.EdgeObjectOffsetLocator;
import org.topcased.modeler.figures.EdgeObjectOffsetEditableLabel;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.figures.IEdgeObjectOffsetFigure;
import org.topcased.modeler.figures.IGraphEdgeFigure;

/**
 * @generated
 */
public class TransitionFigure extends PolylineConnectionEx implements
		IGraphEdgeFigure, HandleBounds {

	/**
	 * @generated
	 */
	private IEdgeObjectFigure inputEdgeObject;

	/**
	 * @generated
	 */
	private Locator inputLocator;

	/**
	 * The constructor
	 *
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
	 * @return the object figure
	 * @generated
	 */
	public IEdgeObjectFigure getInputEdgeObjectFigure() {
		return inputEdgeObject;
	}

	/**
	 * @see org.topcased.modeler.figures.IGraphEdgeFigure#getLocator(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	public Locator getLocator(IEdgeObjectFigure edgeObjectfigure) {
		if (edgeObjectfigure == inputEdgeObject) {
			return inputLocator;
		}

		return null;
	}

	/**
	 * @see org.eclipse.gef.handles.HandleBounds#getHandleBounds()
	 * @generated
	 */
	public Rectangle getHandleBounds() {
		return getPoints().getBounds();
	}
}