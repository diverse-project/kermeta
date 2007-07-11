/*******************************************************************************
 * $Id: PropertyBiDirecEditPart.java,v 1.1 2007-07-11 14:50:46 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.edit;

import org.eclipse.draw2d.IFigure;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.EdgeObject;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.edit.GraphEdgeEditPart;
import org.topcased.modeler.figures.IEdgeObjectFigure;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmEdgeObjectConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.figures.PropertyBiDirecFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.policies.PropertyBiDirecEdgeObjectUVEditPolicy;

/**
 * PropertyBiDirec controller
 *
 * @generated
 */
public class PropertyBiDirecEditPart extends GraphEdgeEditPart {

	/**
	 * Constructor
	 *
	 * @param model the graph object
	 * @generated
	 */
	public PropertyBiDirecEditPart(GraphEdge model) {
		super(model);
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(
				ModelerEditPolicyConstants.EDGE_OBJECTS_UV_EDITPOLICY,
				new PropertyBiDirecEdgeObjectUVEditPolicy());

	}

	/**
	 * @return the Figure
	 * @generated
	 */
	protected IFigure createFigure() {
		PropertyBiDirecFigure connection = new PropertyBiDirecFigure();

		return connection;
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getEdgeObjectFigure(org.topcased.modeler.di.model.EdgeObject)
	 * @generated
	 */
	public IEdgeObjectFigure getEdgeObjectFigure(EdgeObject edgeObject) {
		if (KmEdgeObjectConstants.SOURCE_NAME_EDGE_OBJECT_ID.equals(edgeObject
				.getId())) {
			return ((PropertyBiDirecFigure) getFigure())
					.getSource_nameEdgeObjectFigure();
		}
		if (KmEdgeObjectConstants.TARGET_NAME_EDGE_OBJECT_ID.equals(edgeObject
				.getId())) {
			return ((PropertyBiDirecFigure) getFigure())
					.getTarget_nameEdgeObjectFigure();
		}
		return null;
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#refreshEdgeObjects()
	 * @generated
	 */
	protected void refreshEdgeObjects() {
		super.refreshEdgeObjects();
		updateSource_nameLabel();
		updateTarget_nameLabel();
	}

	/**
	 * Update the source_name Label
	 *
	 * @generated
	 */
	private void updateSource_nameLabel() {
		//TODO set the text to update
		//((Label) ((PropertyBiDirecFigure) getFigure()).getSource_nameEdgeObjectFigure()).setText(((PropertyBiDirec) getEObject()).getSource_name());
	}

	/**
	 * Update the target_name Label
	 *
	 * @generated
	 */
	private void updateTarget_nameLabel() {
		//TODO set the text to update
		//((Label) ((PropertyBiDirecFigure) getFigure()).getTarget_nameEdgeObjectFigure()).setText(((PropertyBiDirec) getEObject()).getTarget_name());
	}

}