/*******************************************************************************
 * $Id: PropertyBiDirecFigure.java,v 1.2 2007-07-23 09:21:25 cfaucher Exp $
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
public class PropertyBiDirecFigure extends PolylineConnectionEx implements
		IGraphEdgeFigure, HandleBounds {

	/**
	 * @generated
	 */
	private IEdgeObjectFigure source_nameEdgeObject;

	/**
	 * @generated
	 */
	private Locator source_nameLocator;
	/**
	 * @generated
	 */
	private IEdgeObjectFigure target_nameEdgeObject;

	/**
	 * @generated
	 */
	private Locator target_nameLocator;

	/**
	 * The constructor
	 *
	 * @generated
	 */
	public PropertyBiDirecFigure() {
		super();

		source_nameEdgeObject = new EdgeObjectEditableLabel(this);
		source_nameLocator = new ConnectionEndpointLocator(this, false);
		add(source_nameEdgeObject, source_nameLocator);

		target_nameEdgeObject = new EdgeObjectEditableLabel(this);
		target_nameLocator = new ConnectionEndpointLocator(this, true);
		add(target_nameEdgeObject, target_nameLocator);
	}

	/**
	 * @return the object figure
	 * @generated
	 */
	public IEdgeObjectFigure getSource_nameEdgeObjectFigure() {
		return source_nameEdgeObject;
	}

	/**
	 * @return the object figure
	 * @generated
	 */
	public IEdgeObjectFigure getTarget_nameEdgeObjectFigure() {
		return target_nameEdgeObject;
	}

	/**
	 * @see org.topcased.modeler.figures.IGraphEdgeFigure#getLocator(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	public Locator getLocator(IEdgeObjectFigure edgeObjectfigure) {
		if (edgeObjectfigure == source_nameEdgeObject) {
			return source_nameLocator;
		}
		if (edgeObjectfigure == target_nameEdgeObject) {
			return target_nameLocator;
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