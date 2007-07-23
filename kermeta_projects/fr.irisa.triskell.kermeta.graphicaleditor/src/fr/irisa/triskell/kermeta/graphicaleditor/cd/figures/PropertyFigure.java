/*******************************************************************************
 * $Id: PropertyFigure.java,v 1.3 2007-07-23 09:21:25 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.figures;

import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.handles.HandleBounds;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.topcased.modeler.figures.EdgeObjectEditableLabel;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.figures.IGraphEdgeFigure;

/**
 * @generated
 */
public class PropertyFigure extends PolylineConnectionEx implements
		IGraphEdgeFigure, HandleBounds {

	/**
	 * @generated
	 */
	private IEdgeObjectFigure nameEdgeObject;

	/**
	 * @generated
	 */
	private Locator nameLocator;

	/**
	 * @generated
	 */
	private IEdgeObjectFigure multiplicityEdgeObject;

	/**
	 * @generated
	 */
	private Locator multiplicityLocator;

	/**
	 * The constructor
	 *
	 * @generated
	 */
	public PropertyFigure() {
		super();

		nameEdgeObject = new EdgeObjectEditableLabel(this);
		nameLocator = new ConnectionEndpointLocator(this, true);
		add(nameEdgeObject, nameLocator);

		multiplicityEdgeObject = new EdgeObjectEditableLabel(this);
		multiplicityLocator = new ConnectionEndpointLocator(this, true);
		add(multiplicityEdgeObject, multiplicityLocator);
	}

	/**
	 * @return the object figure
	 * @generated
	 */
	public IEdgeObjectFigure getNameEdgeObjectFigure() {
		return nameEdgeObject;
	}

	/**
	 * @return the object figure
	 * @generated
	 */
	public IEdgeObjectFigure getMultiplicityEdgeObjectFigure() {
		return multiplicityEdgeObject;
	}

	/**
	 * @see org.topcased.modeler.figures.IGraphEdgeFigure#getLocator(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	public Locator getLocator(IEdgeObjectFigure edgeObjectfigure) {
		if (edgeObjectfigure == nameEdgeObject) {
			return nameLocator;
		}
		if (edgeObjectfigure == multiplicityEdgeObject) {
			return multiplicityLocator;
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