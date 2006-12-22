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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Color;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.EdgeObject;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.LabelCellEditorLocator;
import org.topcased.modeler.edit.ModelerLabelDirectEditManager;
import org.topcased.modeler.edit.policies.EdgeObjectOffsetEditPolicy;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;

import fr.irisa.triskell.kermeta.samples.fsm.Transition;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.FsmEdgeObjectConstants;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.figures.TransitionFigure;

/**
 * Transition controller <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionEditPart extends EMFGraphEdgeEditPart {

	/**
	 * The DirectEditManager
	 * @generated
	 */
	protected DirectEditManager manager;

	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param model the graph object
	 * @generated
	 */
	public TransitionEditPart(GraphEdge model) {
		super(model);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(
				ModelerEditPolicyConstants.EDGE_OBJECTS_OFFSET_EDITPOLICY,
				new EdgeObjectOffsetEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the Figure
	 * @generated
	 */
	protected IFigure createFigure() {
		TransitionFigure connection = new TransitionFigure();

		createTargetDecoration(connection);

		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param connection the PolylineConnection
	 * @generated
	 */
	private void createTargetDecoration(PolylineConnection connection) {

		PolylineDecoration decoration = new PolylineDecoration();
		decoration.setScale(10, 5);
		connection.setTargetDecoration(decoration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getEdgeObjectFigure(org.topcased.modeler.di.model.EdgeObject)
	 * @generated
	 */
	public IEdgeObjectFigure getEdgeObjectFigure(EdgeObject edgeObject) {
		if (FsmEdgeObjectConstants.INPUT_EDGE_OBJECT_ID.equals(edgeObject
				.getId())) {
			return ((TransitionFigure) getFigure()).getInputEdgeObjectFigure();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

	//---------------------------------------
	// Ajout des fonctions pour le DirectEdit
	//---------------------------------------

	/**
	 * Handle selection
	 *
	 * @param value The value of the selection
	 * @generated
	 */
	public void setSelected(int value) {
		super.setSelected(value);
		((EditableLabel) ((TransitionFigure) getFigure())
				.getInputEdgeObjectFigure()).setSelected(value != 0);
	}

	/**
	 * @see org.eclipse.gef.EditPart#performRequest(org.eclipse.gef.Request)
	 * @generated
	 */
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			if (request instanceof DirectEditRequest
					&& !(directEditHitTest(((DirectEditRequest) request)
							.getLocation().getCopy())))
				return;
			performDirectEdit();
		}
	}

	/**
	 * @param  requestLoc the location of the cursor
	 * @return true if the cursor is over the EditableLabel
	 * @generated
	 */
	private boolean directEditHitTest(Point requestLoc) {
		Label inputName = (Label) ((TransitionFigure) getFigure())
				.getInputEdgeObjectFigure();
		if (inputName != null) {
			inputName.translateToRelative(requestLoc);
			if (inputName.containsPoint(requestLoc))
				return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private void performDirectEdit() {
		if (manager == null) {
			Label inputName = (Label) ((TransitionFigure) getFigure())
					.getInputEdgeObjectFigure();
			manager = new ModelerLabelDirectEditManager(this,
					TextCellEditor.class,
					new LabelCellEditorLocator(inputName), inputName);
		}
		manager.show();
	}

}