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

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit;

import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx;
import org.eclipse.swt.graphics.Color;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.EdgeObject;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.policies.EdgeObjectOffsetEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;

import fr.irisa.triskell.kermeta.samples.fsm.Transition;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.FsmEditorEdgeObjectConstants;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.figures.TransitionFigure;

/**
 * Transition controller <br>
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TransitionEditPart extends EMFGraphEdgeEditPart {

	/**
	 * Constructor <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param model
	 *            the graph object
	 * @generated
	 */
	public TransitionEditPart(GraphEdge model) {
		super(model);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(
				ModelerEditPolicyConstants.EDGE_OBJECTS_OFFSET_EDITPOLICY,
				new EdgeObjectOffsetEditPolicy());

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the Figure
	 * @generated
	 */
	protected IFigure createFigure() {
		TransitionFigure connection = new TransitionFigure();
		createSourceDecoration(connection);
		createTargetDecoration(connection);

		return connection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param connection
	 *            the PolylineConnection
	 * @generated
	 */
	private void createSourceDecoration(PolylineConnection connection) {

		// no decoration

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param connection
	 *            the PolylineConnection
	 * @generated
	 */
	private void createTargetDecoration(PolylineConnection connection) {

		PolylineDecoration decoration = new PolylineDecoration();
		decoration.setScale(10, 5);
		connection.setTargetDecoration(decoration);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getEdgeObjectFigure(org.topcased.modeler.di.model.EdgeObject)
	 * @generated
	 */
	public IEdgeObjectFigure getEdgeObjectFigure(EdgeObject edgeObject) {
		if (FsmEditorEdgeObjectConstants.INPUT_EDGE_OBJECT_ID.equals(edgeObject
				.getId())) {
			return ((TransitionFigure) getFigure()).getInputEdgeObjectFigure();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getDefaultRouter(org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx)
	 * @generated
	 */
	protected ConnectionRouter getDefaultRouter(ConnectionLayerEx cLayer) {
		return cLayer.getObliqueRouter();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#refreshEdgeObjects()
	 * @generated
	 */
	protected void refreshEdgeObjects() {
		super.refreshEdgeObjects();
		updateInputLabel();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Update the input Label
	 * 
	 * @generated NOT
	 */
	private void updateInputLabel() {
		String outputLabel = ((Transition) getEObject()).getOutput();
		if (outputLabel == null || outputLabel.equals("")) {
			outputLabel = "NC";
		}
		((Label) ((TransitionFigure) getFigure()).getInputEdgeObjectFigure())
				.setText(((Transition) getEObject()).getInput() + " / "
						+ outputLabel);
		((Label) ((TransitionFigure) getFigure()).getInputEdgeObjectFigure())
				.setForegroundColor(new Color(null, 0, 0, 180));
	}

	@Override
	protected Color getDefaultBackgroundColor() {
		return new Color(null, 180, 240, 240);
	}

}