package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Color;
import org.topcased.modeler.ColorRegistry;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.ModelerPlugin;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.FPropertyRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.UpdateFPropertyNodeCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs.FPropertyEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils.FPropertyEditPartCommonInterface;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.FPropertyFigureNode;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.structure.FProperty;

/**
 * The FProperty object controller
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * This is the brother of FPropertyEditPart
 * This edit part is only valid for properties which type is a PrimitiveType.
 * @generated NOT
 */
public class FPropertyEditPartNode extends FMultiplicityElementEditPart implements FPropertyEditPartCommonInterface {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param obj
	 * @generated NOT
	 */
	public FPropertyEditPartNode(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new FPropertyRestoreConnectionCommand(getHost());
					}
				});

		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY,
				new ResizableEditPolicy());

		installEditPolicy(
				ModelerEditPolicyConstants.CHANGE_BACKGROUND_COLOR_EDITPOLICY,
				null);
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated NOT
	 */
	protected IFigure createFigure() {

		return new FPropertyFigureNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultBackgroundColor()
	 * @generated NOT
	 */
	protected Color getDefaultBackgroundColor() {
		return ColorRegistry.getInstance().get("241,235,130");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultWidth()
	 * @generated NOT
	 */
	protected int getDefaultWidth() {
		return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultHeight()
	 * @generated NOT
	 */
	protected int getDefaultHeight() {
		return -1;
	}

	// This is special code added to introduce some actions on the ClassDefinition element
	/**
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#refreshHeaderLabel()
	 */
	protected void refreshHeaderLabel() {
		FPropertyFigureNode fig = (FPropertyFigureNode) getFigure();
		Label lbl = (Label) fig.getLabel();
		updateLabel(lbl);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.FPropertyEditPartCommonInterface#performRequest(org.eclipse.gef.Request)
	 */
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_OPEN) {
			FPropertyEditDialog propertyDlg = new FPropertyEditDialog(
					getModelFProperty(), ModelerPlugin
							.getActiveWorkbenchShell()); 
			if (propertyDlg.open() == Window.OK) {
				UpdateFPropertyNodeCommand command = new UpdateFPropertyNodeCommand(
						getModelFProperty(), propertyDlg.getData());
				getViewer().getEditDomain().getCommandStack().execute(command);
			}
		} else {
			super.performRequest(request);
		}
	}

	// This is special code added to introduce some actions on the ClassDefinition element
	/**
	 * Thanks to topcased source code
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#performRequest(Request)
	 * @generated NOT NOT
	 */
	protected void updateLabel(Label label) {
		String text = "";
		if (getModelFProperty().getFName() != null
				&& !"".equals(getModelFProperty().getFName()))
			text = getModelFProperty().getFName();
		else
			text = "null";
		boolean first = true;
		
		// The property type
		if (getModelFProperty().getFType() != null) {
			text += " : "
					+ KermetaUtils.getDefault().getLabelForFType(
							getModelFProperty().getFType());
		}
		label.setText(text);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the model object
	 * @generated NOT NOT
	 * it should be but in fact it is not generated (I copied it from Ecore editor).
	 * A bug in topcased gen process?
	 */
	protected FProperty getModelFProperty() {
		return (FProperty) Utils.getElement(getGraphNode());
	}

	/**
	 * cheating to call a protected method (can't change the visibility of the 
	 * methods of the upper-inherited class */
	public IFigure adaptedCreateFigure() {
		return createFigure();
	}
	
	/**
	 * cheating to call a protected method (can't change the visibility of the 
	 * methods of the upper-inherited class */
	public void adaptedCreateEditPolicies() {
		createEditPolicies();
	}

}