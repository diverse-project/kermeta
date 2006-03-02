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
import org.topcased.modeler.ColorRegistry;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.ModelerPlugin;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.FOperationRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands.UpdateFOperationCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs.FOperationEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils.EditPartUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.FOperationFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;

/**
 * The FOperation object controller
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FOperationEditPart extends EMFGraphNodeEditPart {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param obj
	 * @generated
	 */
	public FOperationEditPart(GraphNode obj) {
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
						return new FOperationRestoreConnectionCommand(getHost());
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
	 * @generated
	 */
	protected IFigure createFigure() {

		return new FOperationFigure();
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
		FOperationFigure fig = (FOperationFigure) getFigure();
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
			FOperationEditDialog operationDlg = new FOperationEditDialog(
					getModelFOperation(), ModelerPlugin
							.getActiveWorkbenchShell());
			if (operationDlg.open() == Window.OK) {
				UpdateFOperationCommand command = new UpdateFOperationCommand(
						getModelFOperation(), operationDlg.getData());
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
		if (getModelFOperation().getFName() != null
				&& !"".equals(getModelFOperation().getFName()))
			text = getModelFOperation().getFName();
		else
			text = "null";
		boolean first = true;
		// The type parameters
		if (getModelFOperation().getFTypeParameter().size() > 0) {
			text += "<";
			for (Iterator it = getModelFOperation().getFTypeParameter()
					.iterator(); it.hasNext();) {
				FTypeVariable var = (FTypeVariable) it.next();
				if (first)
					first = false;
				else
					text += ",";
				text += KermetaUtils.getDefault().getLabelForFTypeVariable(var);
			}
			text += ">";
		}
		// Now the parameters
		text += "(";
		first = true;
		for (Iterator it = getModelFOperation().getFOwnedParameter().iterator(); it
				.hasNext();) {
			FParameter param = (FParameter) it.next();
			if (first)
				first = false;
			else
				text += ",";
			text += KermetaUtils.getDefault()
					.getLabelForFType(param.getFType());
		}
		text += ")";
		// The return type
		if (getModelFOperation().getFType() != null) {
			text += " : "
					+ KermetaUtils.getDefault().getLabelForFType(
							getModelFOperation().getFType());
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
	protected FOperation getModelFOperation() {
		return (FOperation) Utils.getElement(getGraphNode());
	}
	
	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getDefaultFont()
	 */
	protected Font getDefaultFont() {
		return EditPartUtils.changeFont(getModelFOperation().isFIsAbstract());
	}

}