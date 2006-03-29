package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import java.util.Iterator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.topcased.draw2d.figures.EditableLabel.TextProvider;
import org.topcased.modeler.ColorRegistry;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.ModelerPlugin;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.OperationRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.UpdateOperationCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs.OperationEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils.EditPartUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.OperationFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

/**
 * The Operation object controller
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param obj the graph node
	 * @generated
	 */
	public OperationEditPart(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEditPolicies() {
		super.createEditPolicies();

		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY,
				new RestoreEditPolicy() {
					protected Command getRestoreConnectionsCommand(
							RestoreConnectionsRequest request) {
						return new OperationRestoreConnectionCommand(getHost());
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
	 * This figure create a label that only contains the name, so that the user
	 * can modify only the name and not the return type of the operation.
	 * Inspired by EOperationEditPart.java
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated NOT
	 */
	protected IFigure createFigure() {

		OperationFigure lbl = new OperationFigure(new TextProvider() {
			public String getText() {
				return ((Operation) getEObject()).getName();
			}
		});
		return lbl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultBackgroundColor()
	 * @generated
	 */
	protected Color getDefaultBackgroundColor() {
		return ColorRegistry.getInstance().get("241,235,235");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultWidth()
	 * @generated
	 */
	protected int getDefaultWidth() {
		return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.GraphNodeEditPart#getDefaultHeight()
	 * @generated
	 */
	protected int getDefaultHeight() {
		return -1;
	}

	// This is special code added to introduce some actions on the ClassDefinition element
	/**
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#refreshHeaderLabel()
	 */
	protected void refreshHeaderLabel() {
		OperationFigure fig = (OperationFigure) getFigure();
		Label lbl = (Label) fig.getLabel();
		updateLabel(lbl);
	}

	/**
	 * Thanks to topcased source code
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#performRequest(Request)
	 * @generated NOT
	 */
	public void performRequest(Request request) {

		if (request.getType() == RequestConstants.REQ_OPEN) {
			OperationEditDialog operationDlg = new OperationEditDialog(
					getModelOperation(), ModelerPlugin
							.getActiveWorkbenchShell());
			if (operationDlg.open() == Window.OK) {
				UpdateOperationCommand command = new UpdateOperationCommand(
						getModelOperation(), operationDlg.getData());
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
	 * @generated NOT
	 */
	protected void updateLabel(Label label) {
		String text = "";
		if (getModelOperation().getName() != null
				&& !"".equals(getModelOperation().getName()))
			text = getModelOperation().getName();
		else
			text = "null";
		Boolean first = true;
		// The type parameters
		if (getModelOperation().getTypeParameter().size() > 0) {
			text += "<";
			for (Iterator it = getModelOperation().getTypeParameter()
					.iterator(); it.hasNext();) {
				TypeVariable var = (TypeVariable) it.next();
				if (first)
					first = false;
				else
					text += ",";
				text += KermetaUtils.getDefault().getLabelForTypeVariable(var);
			}
			text += ">";
		}
		// Now the parameters
		text += "(";
		first = true;
		for (Iterator it = getModelOperation().getOwnedParameter().iterator(); it
				.hasNext();) {
			Parameter param = (Parameter) it.next();
			if (first)
				first = false;
			else
				text += ",";
			text += KermetaUtils.getDefault().getLabelForType(param.getType());
		}
		text += ")";
		// The return type
		if (getModelOperation().getType() != null) {
			text += " : "
					+ KermetaUtils.getDefault().getLabelForType(
							getModelOperation().getType());
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
	protected Operation getModelOperation() {
		return (Operation) Utils.getElement(getGraphNode());
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getDefaultFont()
	 */
	protected Font getDefaultFont() {
		return EditPartUtils.changeFont(getModelOperation().isIsAbstract());
	}

}