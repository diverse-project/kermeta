package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Font;
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

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEdgeObjectConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.StructureEditPolicyConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.StructurePlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.StructureConfiguration;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils.EditPartUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils.PropertyEditPartCommonInterface;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.PropertyFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.PropertyLabelEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.TagLinkEdgeCreationEditPolicy;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaConstants;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

/**
 * Property controller <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyEditPart extends EMFGraphEdgeEditPart implements
		PropertyEditPartCommonInterface {

	/**
	 * Decoration of the edges (diamong, arrow, or nothing) -- topcased
	 */
	private RotatableDecoration srcDecor, targetDecor;

	/**
	 * The opposite property linked to the one represented
	 * @generated NOT 
	 */
	private Property opposite;

	/** The DirectEditManager for the name label (seems to require 1 editmanager per Label object */
	protected DirectEditManager nameManager;
	protected DirectEditManager multiplicityManager;

	/**
	 * Contains the String related to the label to edit
	 */
	protected String labelToEdit;
	
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param model the graph object
	 * @generated
	 */
	public PropertyEditPart(GraphEdge model) {
		super(model);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 * @generated NOT
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();
		// Provide the Policy to associate the EAnnotation to an Ecore object
		installEditPolicy(StructureEditPolicyConstants.TAGLINK_EDITPOLICY,
				new TagLinkEdgeCreationEditPolicy());

		installEditPolicy(
				ModelerEditPolicyConstants.EDGE_OBJECTS_UV_EDITPOLICY,
				new PropertyLabelEditPolicy());
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the Figure
	 * @generated NOT
	 */
	protected IFigure createFigure() {
		return new PropertyFigure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param connection the PolylineConnection
	 * @generated
	 */
	private void createSourceDecoration(PolylineConnection connection) {

		PolygonDecoration decoration = new PolygonDecoration();
		PointList decorationPointList = new PointList();
		decorationPointList.addPoint(0, 0);
		decorationPointList.addPoint(-1, 1);
		decorationPointList.addPoint(-2, 0);
		decorationPointList.addPoint(-1, -1);
		decoration.setTemplate(decorationPointList);
		decoration.setScale(10, 5);
		connection.setSourceDecoration(decoration);

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
	 * Handle selection
	 * 
	 * @param value The value of the selection
	 */
	public void setSelected(int value) {
		super.setSelected(value);
		getPropertyFigure().getNameLabel().setSelected(
				value == 0 ? false : true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getDefaultRouter(org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx)
	 * @generated NOT
	 */
	protected ConnectionRouter getDefaultRouter(ConnectionLayerEx cLayer) {
		return cLayer.getRectilinearRouter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#refreshEdgeObjects()
	 * @generated NOT
	 */
	protected void refreshEdgeObjects() {
		super.refreshEdgeObjects();
		updateSourceDecoration();
		updateTargetDecoration();
		updateNameLabel();
		updateTargetCount();
		updateTargetName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Update the name Label
	 * @generated NOT
	 */
	private void updateNameLabel() {
		((Label) ((PropertyFigure) getFigure()).getNameLabel())
				.setText(((Property) getEObject()).getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param  requestLoc the location of the cursor
	 * @return true if the cursor is over the EditableLabel
	 * @generated
	 */
	private boolean directEditHitTest(Point requestLoc) {
		Label nameName = (Label) ((PropertyFigure) getFigure())
				.getNameLabel();
		if (nameName != null) {
			labelToEdit = StructureEdgeObjectConstants.NAME_LABEL_ID;
			nameName.translateToRelative(requestLoc);
			if (nameName.containsPoint(requestLoc))
				
				return true;
			labelToEdit = null;
		}
		// below : Not tested!
		nameName = (Label) ((PropertyFigure) getFigure())
		.getMultiplicityLabel();
		if (nameName != null) {
			labelToEdit = StructureEdgeObjectConstants.MULTIPLICITY_LABEL_ID;
			nameName.translateToRelative(requestLoc);
			if (nameName.containsPoint(requestLoc))
				return true;
			labelToEdit = null;
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Only launched if directeEditHitTest returned true (see performRequest)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void performDirectEdit() {
		Label targetName = null;
		if (labelToEdit.equals(StructureEdgeObjectConstants.NAME_LABEL_ID))
		{
			if (nameManager == null)
			{
				targetName = (Label) ((PropertyFigure) getFigure())
				.getNameLabel();
				nameManager = new ModelerLabelDirectEditManager(this,
						TextCellEditor.class,
						new LabelCellEditorLocator(targetName), targetName);
			}
			nameManager.show();
		}
		else
		{
			if (multiplicityManager == null)
			{
				targetName = (Label) ((PropertyFigure) getFigure())
				.getMultiplicityLabel();
				multiplicityManager = new ModelerLabelDirectEditManager(this,
						TextCellEditor.class,
						new LabelCellEditorLocator(targetName), targetName);
			}
			multiplicityManager.show();
		}
		
	}

	/*
	 *  HANDLE OF [ LOWER .. UPPER ]
	 */

	/**
	 * Check basic rules on multiplicity of a property 
	 * */
	private String createCountString(Property prop)
			throws BoundsFormatException {
		int lower = prop.getLower();
		int upper = prop.getUpper();

		if (lower < 0)
			throw new BoundsFormatException("LowerBound must be [0..n]");
		if (upper < -1)
			throw new BoundsFormatException("UpperBound must be [-1..n]");
		if (upper < lower)
			throw new BoundsFormatException("Upper must be > Lower");
		return lower + ".." + (upper == -1 ? "*" : "" + upper);

	}

	/**
	 * Update the multiplicity view 
	 */
	protected void updateTargetCount() {
		Label targetCount = getPropertyFigure().getMultiplicityLabel();
		try {
			targetCount.setText(createCountString(getProperty()));
			targetCount.setLabelAlignment(PositionConstants.LEFT);
		} catch (BoundsFormatException e) {
			targetCount.setText("error");
			IStatus status = new Status(IStatus.ERROR, StructurePlugin
					.getDefault().getBundle().getSymbolicName(), IStatus.ERROR,
					e.getMessage(), null);
			ResourcesPlugin.getPlugin().getLog().log(status);
		}
	}

	/*
	 *  HANDLE OPPOSITE
	 * 
	 */
	protected void updateOpposite(Property opp) {
		if (opposite == opp)
			return;
		if (opposite != null)
			opposite.eAdapters().remove(getModelListener());
	}

	/**
	 * Update the name of the property 
	 * property.name
	 */
	protected void updateTargetName() {

		getPropertyFigure().getNameLabel().setText(getProperty().getName());
	}

	/* -------------------------------------------------------------------------
	 * 
	 * 
	 *  This was supposed to be generated but wasent
	 * 
	 * 
	 * 
	 * -------------------------------------------------------------------------
	 */

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the PolylineConnection
	 * @generated
	 */
	private PolylineConnection getConnection() {
		return (PolylineConnection) getFigure();
	}

	/* -------------------------------------------------------------------------
	 * 
	 * 
	 *  The above code was not generated and is an adapted copy of
	 *  topcased ecore editor.
	 * 
	 * 
	 * 
	 * -------------------------------------------------------------------------
	 */

	/**
	 * <!-- begin-user-doc --> The decoration of the containment figure <!--
	 * end-user-doc -->
	 * 
	 * @return a PolygonDecoration
	 * @generated NOT
	 */
	private PolygonDecoration createPolygonDecoration() {
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
	 * <!-- begin-user-doc --> The decoration of the reference (if one-way
	 * reference) <!-- end-user-doc -->
	 * 
	 * @return a PolylineDecoration
	 * @generated NOT
	 */
	private PolylineDecoration createPolylineDecoration() {
		PolylineDecoration decoration = new PolylineDecoration();
		decoration.setScale(10, 5);
		return decoration;
	}

	protected void updateTargetDecoration() {
		if (getProperty().getOpposite() != null) {
			targetDecor = null;
			getConnection().setTargetDecoration(targetDecor);
		} else if (targetDecor == null) {
			targetDecor = createPolylineDecoration();
			getConnection().setTargetDecoration(targetDecor);
		}
	}

	/** 
	 * Thanks topcased
	 * This method updates the connection end of the property-edge (diamond or not)
	 * according to its "isComposite" property.
	 */
	protected void updateSourceDecoration() { // Condition -----------------------
		if (getProperty().isIsComposite()) {
			if (srcDecor == null) {
				srcDecor = createPolygonDecoration();
				getConnection().setSourceDecoration(srcDecor);
			}
		} else if (srcDecor != null) {
			srcDecor = null;
			getConnection().setSourceDecoration(srcDecor);
		}
	}

	public PropertyFigure getPropertyFigure() {
		return (PropertyFigure) getFigure();
	}

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	public Property getProperty() {
		return (Property) getEObject();
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getEdgeObjectFigure(org.topcased.modeler.di.model.EdgeObject)
	 */
	public IEdgeObjectFigure getEdgeObjectFigure(EdgeObject edgeObject) {
		if (StructureEdgeObjectConstants.MULTIPLICITY_LABEL_ID
				.equals(edgeObject.getId())) {
			return getPropertyFigure().getMultiplicityLabel();
		} else if (StructureEdgeObjectConstants.NAME_LABEL_ID.equals(edgeObject
				.getId())) {
			return getPropertyFigure().getNameLabel();
		}

		return null;
	}

	/*
	 * 
	 * 
	 * 
	 *  These are inherited methods that we have to rewrite manually.
	 * 
	 * 
	 * 
	 */

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#handlePropertyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	protected void handleModelChanged(Notification msg) {

		switch (msg.getFeatureID(Property.class)) {
		case StructurePackage.PROPERTY__IS_COMPOSITE:
			refreshVisuals();
		case StructurePackage.PROPERTY__IS_DERIVED:
			break;// update the police
		case StructurePackage.PROPERTY__IS_ORDERED:
			break;
		case StructurePackage.PROPERTY__IS_READ_ONLY:
			break;
		case StructurePackage.PROPERTY__IS_UNIQUE:
			break;
		case StructurePackage.PROPERTY__LOWER:
		case StructurePackage.PROPERTY__UPPER:
			updateTargetCount();
		case StructurePackage.PROPERTY__NAME:
		//updateTargetDecoration();
		case StructurePackage.PROPERTY__OPPOSITE:
			updateOpposite(opposite);
		case StructurePackage.PROPERTY__TYPE:
			break;

		}
		super.handleModelChanged(msg);
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getDefaultFont()
	 */
	protected Font getDefaultFont() {
		return EditPartUtils.changeFont(getProperty().isIsDerived());
	}

	/**
	 * cheating to call a protected method (can't change the visibility of the 
	 * methods of the upper-inherited class */
	public IFigure adaptedCreateFigure() {
		return createFigure();
	}

	public void adaptedCreateEditPolicies() {
		createEditPolicies();
	}

}