package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.draw2d.ConnectionRouter;
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
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Font;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.EdgeObject;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.LabelCellEditorLocator;
import org.topcased.modeler.edit.ModelerLabelDirectEditManager;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEdgeObjectConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils.EditPartUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.FPropertyFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.FPropertyEdgeObjectUVEditPolicy;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.StructurePackage;

/**
 * FProperty controller <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FPropertyEditPart extends EMFGraphEdgeEditPart {
	
	/**
	 * Decoration of the edges (diamong, arrow, or nothing) -- topcased
	 * @generated NOT
	 */
    private RotatableDecoration srcDecor, targetDecor;

    /**
     * The opposite property linked to the one represented
     * @generated NOT 
     */
    private FProperty opposite;
	

	/** The DirectEditManager */
	protected DirectEditManager manager;
	
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param model the graph object
	 * @generated
	 */
	public FPropertyEditPart(GraphEdge model) {
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
				new FPropertyEdgeObjectUVEditPolicy());
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
		FPropertyFigure connection = new FPropertyFigure();
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
		if (StructureEdgeObjectConstants.FNAME_EDGE_OBJECT_ID.equals(edgeObject
				.getId())) {
			return ((FPropertyFigure) getFigure()).getfNameEdgeObjectFigure();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getDefaultRouter(org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx)
	 * @generated
	 */
	protected ConnectionRouter getDefaultRouter(ConnectionLayerEx cLayer) {
		return cLayer.getObliqueRouter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Initially generated (called generated updatefNameLabel)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateSourceDecoration();
		updatefNameLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Update the fName Label
	 * @generated
	 */
	private void updatefNameLabel() {
		((Label) ((FPropertyFigure) getFigure()).getfNameEdgeObjectFigure())
				.setText(((FProperty) getEObject()).getFName());
	}

	//---------------------------------------
	// Ajout des fonctions pour le DirectEdit
	//---------------------------------------

	/**
	 * Handle selection
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value The value of the selection
	 * @generated
	 */
	public void setSelected(int value) {
		super.setSelected(value);
		((EditableLabel) ((FPropertyFigure) getFigure())
				.getfNameEdgeObjectFigure()).setSelected(value == 0 ? false
				: true);
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
		Label fnameName = (Label) ((FPropertyFigure) getFigure())
				.getfNameEdgeObjectFigure();
		if (fnameName != null) {
			fnameName.translateToRelative(requestLoc);
			if (fnameName.containsPoint(requestLoc))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private void performDirectEdit() {
		if (manager == null) {
			Label fnameName = (Label) ((FPropertyFigure) getFigure())
					.getfNameEdgeObjectFigure();
			manager = new ModelerLabelDirectEditManager(this,
					TextCellEditor.class,
					new LabelCellEditorLocator(fnameName), fnameName);
		}
		manager.show();
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
    private PolylineConnection getConnection()
    {
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
    private PolygonDecoration createPolygonDecoration()
    {
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
    private PolylineDecoration createPolylineDecoration()
    {
        PolylineDecoration decoration = new PolylineDecoration();
        decoration.setScale(10, 5);
        return decoration;
    }
	
	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the model object
     * @generated
     */
    protected FProperty getFProperty()
    {
        return (FProperty) Utils.getElement(getGraphEdge());
    }
	
    protected void updateTargetDecoration()
    {
        if (getFProperty().getFOpposite() != null)
        {
            targetDecor = null;
            getConnection().setTargetDecoration(targetDecor);
        }
        else if (targetDecor == null)
        {
            targetDecor = createPolylineDecoration();
            getConnection().setTargetDecoration(targetDecor);
        }
    }
    
    /** 
     * Thanks topcased
     * This method updates the connection end of the property-edge (diamond or not)
     * according to its "isComposite" property.
     */
    protected void updateSourceDecoration()
    {	// Condition -----------------------
        if (getFProperty().isFIsComposite())
        {
            if (srcDecor == null)
            {
                srcDecor = createPolygonDecoration();
                getConnection().setSourceDecoration(srcDecor);
            }
        }
        else if (srcDecor != null)
        {
            srcDecor = null;
            getConnection().setSourceDecoration(srcDecor);
        }
    }

    public FPropertyFigure getFPropertyFigure()
    {
        return (FPropertyFigure) getFigure();
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
	protected void handlePropertyChanged(Notification msg) {
		
		switch (msg.getFeatureID(FProperty.class))
        {
			case StructurePackage.FPROPERTY__FIS_COMPOSITE:
        	    refreshVisuals();
			case StructurePackage.FPROPERTY__FIS_DERIVED: 
				break;// update the police
			case StructurePackage.FPROPERTY__FIS_ORDERED: break;
			case StructurePackage.FPROPERTY__FIS_READ_ONLY: break;
			case StructurePackage.FPROPERTY__FIS_UNIQUE: break;
			case StructurePackage.FPROPERTY__FLOWER: break;
			case StructurePackage.FPROPERTY__FUPPER: break;
			case StructurePackage.FPROPERTY__FNAME: break;
			case StructurePackage.FPROPERTY__FOPPOSITE: break;
			case StructurePackage.FPROPERTY__FTYPE: break;

        }
        super.handlePropertyChanged(msg);
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getDefaultFont()
	 */
	protected Font getDefaultFont() {
		return EditPartUtils.changeFont(getFProperty().isFIsDerived());
	}
	
	
}