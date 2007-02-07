/*******************************************************************************
 * $Id: InheritanceEditPart.java,v 1.2 2007-02-07 14:11:55 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.topcased.modeler.ModelerColorConstants;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.edit.GraphEdgeEditPart;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmEditPolicyConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.figures.InheritanceFigure;

/**
 * Inheritance controller
 *
 * @generated
 */
public class InheritanceEditPart extends GraphEdgeEditPart {

	/**
	 * Constructor
	 *
	 * @param model the graph object
	 * @generated
	 */
	public InheritanceEditPart(GraphEdge model) {
		super(model);
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(ModelerEditPolicyConstants.CHANGE_FONT_EDITPOLICY,
				null);
	}

	/**
	 * @return the Figure
	 * @generated
	 */
	protected IFigure createFigure() {
		InheritanceFigure connection = new InheritanceFigure();

		createTargetDecoration(connection);

		return connection;
	}

	/**
	 * @param connection the PolylineConnection
	 * @generated
	 */
	private void createTargetDecoration(PolylineConnection connection) {

		PolygonDecoration decoration = new PolygonDecoration();
		decoration.setScale(14, 6);
		decoration.setBackgroundColor(ModelerColorConstants.white);
		connection.setTargetDecoration(decoration);

	}

}