/*******************************************************************************
 * $Id: PropertyEditPart.java,v 1.2 2007-02-19 18:04:53 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.edit;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
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

import fr.irisa.triskell.kermeta.graphicaleditor.KmPlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmEdgeObjectConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.figures.PropertyFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.policies.PropertyEdgeObjectUVEditPolicy;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

/**
 * Property controller
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
	 * Initialize the multiplicities and mainly the upper_bound to 1
	 * 
	 * @generated NOT
	 */
	private void multiplicityInitialization() {
		if (getProperty().getUpper() == 0) {
			getProperty().setUpper(1);
		}
	}

	/**
	 * Constructor
	 * 
	 * @param model
	 *            the graph object
	 * @generated NOT added multiplicityInitialization() call
	 */
	public PropertyEditPart(GraphEdge model) {
		super(model);
		multiplicityInitialization();
	}

	/**
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
	 * @return the Figure
	 * @generated
	 */
	protected IFigure createFigure() {
		PropertyFigure connection = new PropertyFigure();

		createTargetDecoration(connection);

		return connection;
	}

	/**
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
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getEdgeObjectFigure(org.topcased.modeler.di.model.EdgeObject)
	 * @generated
	 */
	public IEdgeObjectFigure getEdgeObjectFigure(EdgeObject edgeObject) {
		if (KmEdgeObjectConstants.NAME_EDGE_OBJECT_ID
				.equals(edgeObject.getId())) {
			return ((PropertyFigure) getFigure()).getNameEdgeObjectFigure();
		}
		if (KmEdgeObjectConstants.MULTIPLICITY_EDGE_OBJECT_ID.equals(edgeObject
				.getId())) {
			return ((PropertyFigure) getFigure())
					.getMultiplicityEdgeObjectFigure();
		}
		return null;
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#refreshEdgeObjects()
	 * @generated NOT
	 * added updateSourceDecoration and updateTargetDecoration call
	 */
	protected void refreshEdgeObjects() {
		super.refreshEdgeObjects();

		updateSourceDecoration();
		updateTargetDecoration();
		updateNameLabel();
		updateMultiplicityLabel();
	}

	/**
	 * Update the name Label
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
			icon = KmImageRegistry.getImage("ERROR");
			lbl = "name";
			hoverLbl.setText("The Reference name must be set");
		}

		if (getProperty().isIsDerived()) {
			lbl = "/ " + lbl;
		}
		theLabel.setIcon(icon);
		theLabel.setText(lbl);
		theLabel.setToolTip(hoverLbl);
	}

	/**
	 * Update the multiplicity Label
	 * 
	 * @generated NOT
	 */
	private void updateMultiplicityLabel() {
		/*
		 * Generated code ((Label) ((PropertyFigure) getFigure())
		 * .getMultiplicityEdgeObjectFigure()) .setText(((Property)
		 * getEObject()).getMultiplicity());
		 */
		Label targetCount = (Label) getPropertyFigure()
				.getMultiplicityEdgeObjectFigure();
		try {
			targetCount.setText(createCountString(getProperty()));
			// targetCount.setIcon(null);
		} catch (BoundsFormatException e) {
			Label hoverLbl = new Label(e.getMessage());
			targetCount.setText("multiplicity");
			targetCount.setToolTip(hoverLbl);
			// targetCount.setIcon(StructureImageRegistry.getImage("ERROR"));

			IStatus status = new Status(IStatus.ERROR, KmPlugin.getDefault()
					.getBundle().getSymbolicName(), IStatus.ERROR, e
					.getMessage(), null);
			ResourcesPlugin.getPlugin().getLog().log(status);
		}
	}

	// ---------------------------------------
	// Added methods dedicated to DirectEdit
	// ---------------------------------------

	/**
	 * Handle selection
	 * 
	 * @param value
	 *            The value of the selection
	 * @generated
	 */
	public void setSelected(int value) {
		super.setSelected(value);
		((EditableLabel) ((PropertyFigure) getFigure())
				.getNameEdgeObjectFigure()).setSelected(value != 0);
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
	 * @param requestLoc
	 *            the location of the cursor
	 * @return true if the cursor is over the EditableLabel
	 * @generated
	 */
	private boolean directEditHitTest(Point requestLoc) {
		Label nameName = (Label) ((PropertyFigure) getFigure())
				.getNameEdgeObjectFigure();
		if (nameName != null) {
			nameName.translateToRelative(requestLoc);
			if (nameName.containsPoint(requestLoc))
				return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private void performDirectEdit() {
		if (manager == null) {
			Label nameName = (Label) ((PropertyFigure) getFigure())
					.getNameEdgeObjectFigure();
			manager = new ModelerLabelDirectEditManager(this,
					TextCellEditor.class, new LabelCellEditorLocator(nameName),
					nameName);
		}
		manager.show();
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
	 * Get the PolylineConnection associated with the edge figure
	 * 
	 * @return the PolylineConnection
	 * @generated NOT
	 */
	private PolylineConnection getConnection() {
		return (PolylineConnection) getFigure();
	}

	// Addition of features for the DirectEdit

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
			throw new BoundsFormatException("LowerBound must be [0..*]");
		if (upper < -1)
			throw new BoundsFormatException("UpperBound must be [-1..*]");
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