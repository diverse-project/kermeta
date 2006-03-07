package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.EdgeObject;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.figures.IEdgeObjectFigure;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEdgeObjectConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils.PropertyEditPartCommonInterface;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.PropertyFigureEdge;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.PropertyEdgeObjectUVEditPolicy;
import fr.irisa.triskell.kermeta.language.structure.Property;

/**
 * Property controller <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyEditPartEdge extends EMFGraphEdgeEditPart implements PropertyEditPartCommonInterface
{
	
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param model the graph object
	 * @generated
	 */
	public PropertyEditPartEdge(GraphEdge model) {
		super(model);
	}

	/**
	 * Upon activation, attach to the model element as a property change
	 * listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void activate() {
		super.activate();
		getEObject().eAdapters().add(modelListener);
	}

	/**
	 * Upon deactivation, detach from the model element as a property change
	 * listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deactivate() {
		getEObject().eAdapters().remove(modelListener);
		super.deactivate();
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
				ModelerEditPolicyConstants.EDGE_OBJECTS_UV_EDITPOLICY,
				new PropertyEdgeObjectUVEditPolicy());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the Figure
	 * @generated
	 */
	protected IFigure createFigure() {
		PropertyFigureEdge connection = new PropertyFigureEdge();
		createSourceDecoration(connection);
		createTargetDecoration(connection);

		return connection;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getEdgeObjectFigure(org.topcased.modeler.di.model.EdgeObject)
	 * @generated
	 */
	public IEdgeObjectFigure getEdgeObjectFigure(EdgeObject edgeObject) {
		if (StructureEdgeObjectConstants.FLOWER_EDGE_OBJECT_ID
				.equals(edgeObject.getId())) {
			return ((PropertyFigureEdge) getFigure()).getfLowerEdgeObjectFigure();
		}
		if (StructureEdgeObjectConstants.FUPPER_EDGE_OBJECT_ID
				.equals(edgeObject.getId())) {
			return ((PropertyFigureEdge) getFigure()).getfUpperEdgeObjectFigure();
		}
		if (StructureEdgeObjectConstants.FNAME_EDGE_OBJECT_ID.equals(edgeObject
				.getId())) {
			return ((PropertyFigureEdge) getFigure()).getfNameEdgeObjectFigure();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getDefaultRouter(org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx)
	 * @generated NOT
	 */
	protected ConnectionRouter getDefaultRouter(ConnectionLayerEx cLayer) {
		return cLayer.getObliqueRouter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();

		updatefLowerLabel();
		updatefUpperLabel();
		updatefNameLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Update the fLower Label
	 * @generated NOT -> adaptation were necessary
	 */ 
	private void updatefLowerLabel() {
		((Label) ((PropertyFigureEdge) getFigure()).getfLowerEdgeObjectFigure())
				.setText(String.valueOf(((Property) getEObject()).getLower()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Update the fUpper Label
	 * @generated NOT
	 */
	private void updatefUpperLabel() {
		((Label) ((PropertyFigureEdge) getFigure()).getfUpperEdgeObjectFigure())
				.setText(String.valueOf(((Property) getEObject()).getUpper()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Update the fName Label
	 * @generated
	 */
	private void updatefNameLabel() {
		((Label) ((PropertyFigureEdge) getFigure()).getfNameEdgeObjectFigure())
				.setText(((Property) getEObject()).getName());
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