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

package fr.irisa.triskell.kermeta.graphicaleditor.diag.edit;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Image;

import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.EdgeObject;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.LabelCellEditorLocator;
import org.topcased.modeler.edit.ModelerLabelDirectEditManager;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.exceptions.BoundsFormatException;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.StructurePlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.StructureEdgeObjectConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.figures.PropertyFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.policies.PropertyEdgeObjectUVEditPolicy;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

/**
 * Property controller <br>
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PropertyEditPart extends EMFGraphEdgeEditPart {

	/**
	 * @generated NOT
	 */
	private RotatableDecoration srcDecor, targetDecor;

	/**
	 * @generated NOT
	 */
	private Property opposite;

	/**
	 * The DirectEditManager
	 * 
	 * @generated NOT
	 */
	protected DirectEditManager manager;

	/**
	 * @generated NOT
	 */
	private Property oldOppositeProp;

	/**
	 * Constructor <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param model
	 *            the graph object
	 * @generated NOT
	 */
	public PropertyEditPart(GraphEdge model) {
		super(model);
		multiplicityInitialization();
		oldOppositeProp = getProperty().getOpposite();
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
				ModelerEditPolicyConstants.EDGE_OBJECTS_UV_EDITPOLICY,
				new PropertyEdgeObjectUVEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the Figure
	 * @generated
	 */
	protected IFigure createFigure() {
		PropertyFigure connection = new PropertyFigure();
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
	 * The decoration of the containment figure
	 * 
	 * @return the RotatableDecoration
	 * @generated NOT
	 */
	private RotatableDecoration createSourceDecoration() {
		PolygonDecoration decoration = new PolygonDecoration();
		PointList decorationPointList = new PointList();
		decorationPointList.addPoint(0, 0);
		decorationPointList.addPoint(-1, 1);
		decorationPointList.addPoint(-2, 0);
		decorationPointList.addPoint(-1, -1);
		decoration.setTemplate(decorationPointList);
		decoration.setScale(10, 5);
		return decoration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getEdgeObjectFigure(org.topcased.modeler.di.model.EdgeObject)
	 * @generated NOT
	 */
	public IEdgeObjectFigure getEdgeObjectFigure(EdgeObject edgeObject) {
		if (StructureEdgeObjectConstants.MULTIPLICITY_EDGE_OBJECT_ID
				.equals(edgeObject.getId())) {
			return getPropertyFigure().getMultiplicityEdgeObjectFigure();
		}
		if (StructureEdgeObjectConstants.NAME_EDGE_OBJECT_ID.equals(edgeObject
				.getId())) {
			return getPropertyFigure().getNameEdgeObjectFigure();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#refreshEdgeObjects()
	 * @generated NOT
	 */
	protected void refreshEdgeObjects() {
		super.refreshEdgeObjects();

		/* adding */
		updateSourceDecoration();
		updateTargetDecoration();
		updateNameLabel();
		updateMultiplicityLabel();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Update the name Label
	 * 
	 * @generated NOT
	 */
	private void updateNameLabel() {

		Label theLabel = (Label) ((PropertyFigure) getFigure())
				.getNameEdgeObjectFigure();
		String lbl = ((Property) getEObject()).getName();
		Image icon = null;

		Label hoverLbl = new Label("");

		if (lbl == null || lbl.equals("")) {
			icon = StructureImageRegistry.getImage("ERROR");
			lbl = "name";
			hoverLbl.setText("The Reference name must be set");
		}

		if (getProperty().isIsDerived()) {
			lbl = "/ " + lbl;
		} else {

		}
		theLabel.setIcon(icon);
		theLabel.setText(lbl);
		theLabel.setToolTip(hoverLbl);

		/*
		 * for(java.util.Iterator itContent =
		 * getProperty().container().eContents().iterator();
		 * itContent.hasNext();){ java.lang.Object tmp = (java.lang.Object)
		 * itContent.next(); if(tmp instanceof Property) { ((Property)
		 * tmp).getName(); } }
		 */
		// getProperty().container().eContents().
	}

	/**
	 * Get the EReference model object
	 * 
	 * @return the model object
	 * @generated NOT
	 */
	protected Property getProperty() {
		return (Property) Utils.getElement(getGraphEdge());
	}

	/**
	 * The decoration of the reference (if one-way reference)
	 * 
	 * @return the RotatableDecoration
	 * @generated NOT
	 */
	private RotatableDecoration createTargetDecoration() {
		PolylineDecoration decoration = new PolylineDecoration();
		decoration.setScale(10, 5);
		return decoration;
	}

	/**
	 * Handle selection
	 * 
	 * @param value
	 *            The value of the selection
	 * @generated NOT
	 */
	public void setSelected(int value) {
		super.setSelected(value);
		((EditableLabel) getPropertyFigure().getNameEdgeObjectFigure())
				.setSelected(value == 0 ? false : true);
	}

	/**
	 * Get the PolylineConnection associated with the edge figure
	 * 
	 * @return the PolylineConnection
	 * @generated NOT
	 */
	private PolylineConnection getConnection() {
		return (PolylineConnection) getFigure();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Update the multiplicity
	 * Label
	 * 
	 * @generated NOT
	 */
	private void updateMultiplicityLabel() {
		Label targetCount = (Label) getPropertyFigure()
				.getMultiplicityEdgeObjectFigure();
		try {
			targetCount.setText(createCountString(getProperty()));
			targetCount.setIcon(null);
		} catch (BoundsFormatException e) {
			Label hoverLbl = new Label(e.getMessage());
			targetCount.setText("multiplicity");
			targetCount.setToolTip(hoverLbl);
			targetCount.setIcon(StructureImageRegistry.getImage("ERROR"));

			IStatus status = new Status(IStatus.ERROR, StructurePlugin
					.getDefault().getBundle().getSymbolicName(), IStatus.ERROR,
					e.getMessage(), null);
			ResourcesPlugin.getPlugin().getLog().log(status);
		}
	}

	// Addition of features for the DirectEdit
	/**
	 * @see org.eclipse.gef.EditPart#performRequest(org.eclipse.gef.Request)
	 * @generated NOT
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
	 * @generated NOT
	 */
	private boolean directEditHitTest(Point requestLoc) {
		IFigure targetName = getPropertyFigure().getNameEdgeObjectFigure();
		if (targetName != null) {
			targetName.translateToRelative(requestLoc);
			if (targetName.containsPoint(requestLoc))
				return true;
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	private void performDirectEdit() {
		if (manager == null) {
			IFigure targetName = getPropertyFigure().getNameEdgeObjectFigure();
			manager = new ModelerLabelDirectEditManager(this,
					TextCellEditor.class,
					new LabelCellEditorLocator(targetName), targetName);
		}
		manager.show();
	}

	/**
	 * Calculate the String corresponding to the bounds
	 * 
	 * @param ref
	 *            the EReference object
	 * @return the String to display at the endPoint of the connection
	 * @throws BoundsFormatException
	 * @generated NOT
	 */

	private String createCountString(Property ref) throws BoundsFormatException {
		int lower = ref.getLower();
		int upper = ref.getUpper();

		if (lower < 0)
			throw new BoundsFormatException("LowerBound must be [0..n]");
		if (upper < -1)
			throw new BoundsFormatException("UpperBound must be [-1..n]");
		if (upper != -1 && lower > upper)
			throw new BoundsFormatException(
					"UpperBound must be higher than LowerBound");
		if (upper != -1 && upper <= 0)
			throw new BoundsFormatException(
					"UpperBound must be at least equal to 1");

		if (lower == upper)
			return "" + lower;
		return lower + ".." + (upper == -1 ? "*" : "" + upper);
	}

	/**
	 * 
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#handleModelChanged(org.eclipse.emf.common.notify.Notification)
	 * @generated NOT
	 */
	protected void handleModelChanged(Notification msg) {
		switch (msg.getFeatureID(Property.class)) {
		case StructurePackage.PROPERTY__NAME:
			updateNameLabel();
			break;
		case StructurePackage.PROPERTY__LOWER:
		case StructurePackage.PROPERTY__UPPER:
			updateMultiplicityLabel();
			break;
		case StructurePackage.PROPERTY__OPPOSITE:
			updateOpposite(getProperty().getOpposite());
		case StructurePackage.PROPERTY__CONTAINED_TYPE:// CONTAINER
		case StructurePackage.PROPERTY__IS_COMPOSITE:// CONTAINMENT
			refreshVisuals();
			break;
		}
		super.handleModelChanged(msg);
	}

	/**
	 * Initialize the multiplicities and mainly the upper_bound to 1
	 * 
	 * @generated NOT
	 */
	protected void multiplicityInitialization() {
		if (getProperty().getUpper() == 0) {
			getProperty().setUpper(1);
		}
	}

	protected void deleteOpposite(Property opp) {

	}

	/**
	 * @generated NOT
	 */
	private void updateOpposite(Property opp) {

			// old source
			// if opp have not changed then directly return
			// see the ecore editor from Topcased
			if (opposite != null && opposite == opp) {
				return;
			}
			if (opposite != null) {
				opposite.eAdapters().remove(getModelListener());
			}
			opposite = opp;
			if (opposite != null) {
				opposite.eAdapters().add(getModelListener());
			}
	}

	/**
	 * @generated NOT
	 */
	private void updateSourceDecoration() {
		if (getProperty().isIsComposite()) {
			if (srcDecor == null) {
				srcDecor = createSourceDecoration();
				getConnection().setSourceDecoration(srcDecor);
			}
		} else if (srcDecor != null) {
			srcDecor = null;
			getConnection().setSourceDecoration(srcDecor);
		}
	}

	/**
	 * @generated NOT
	 */
	private void updateTargetDecoration() {
		if (getProperty().getOpposite() != null) {
			targetDecor = null;
			getConnection().setTargetDecoration(targetDecor);
		} else if (targetDecor == null) {
			targetDecor = createTargetDecoration();
			getConnection().setTargetDecoration(targetDecor);
		}
	}

	/**
	 * Return the figure associated with the controller
	 * 
	 * @return IFigure
	 * @generated NOT
	 */
	public PropertyFigure getPropertyFigure() {
		return (PropertyFigure) getFigure();
	}
}