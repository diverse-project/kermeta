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

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.PropertyRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.UpdatePropertyNodeCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs.PropertyEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils.PropertyEditPartCommonInterface;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.PropertyFigureNode;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.Property;

/**
 * The Property object controller
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * This is the brother of PropertyEditPart
 * This edit part is only valid for properties which type is a PrimitiveType.
 * @generated NOT
 */
public class PropertyEditPartNode extends MultiplicityElementEditPart implements PropertyEditPartCommonInterface {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param obj
	 * @generated NOT
	 */
	public PropertyEditPartNode(GraphNode obj) {
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
						return new PropertyRestoreConnectionCommand(getHost());
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

		return new PropertyFigureNode();
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
		PropertyFigureNode fig = (PropertyFigureNode) getFigure();
		Label lbl = (Label) fig.getLabel();
		updateLabel(lbl);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.PropertyEditPartCommonInterface#performRequest(org.eclipse.gef.Request)
	 */
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_OPEN) {
			PropertyEditDialog propertyDlg = new PropertyEditDialog(
					getModelProperty(), ModelerPlugin
							.getActiveWorkbenchShell()); 
			if (propertyDlg.open() == Window.OK) {
				UpdatePropertyNodeCommand command = new UpdatePropertyNodeCommand(
						getModelProperty(), propertyDlg.getData());
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
		if (getModelProperty().getName() != null
				&& !"".equals(getModelProperty().getName()))
			text = getModelProperty().getName();
		else
			text = "null";
		Boolean first = true;
		
		// The property type
		if (getModelProperty().getType() != null) {
			text += " : "
					+ KermetaUtils.getDefault().getLabelForType(
							getModelProperty().getType());
		}
		label.setText(text);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the model object
	 * @generated NOT
	 * it should be but in fact it is not generated (I copied it from Ecore editor).
	 * A bug in topcased gen process?
	 */
	protected Property getModelProperty() {
		return (Property) Utils.getElement(getGraphNode());
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