/*******************************************************************************
 * $Id: OperationEditPart.java,v 1.9 2008-09-26 14:11:07 dvojtise Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Font;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.LabelDirectEditPolicy;
import org.topcased.modeler.edit.policies.ResizableEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.KmPlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.commands.OperationRestoreConnectionCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.commands.OperationUpdateCommand;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.dialogs.OperationEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.utils.EditPartUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.figures.OperationFigure;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.modelhelper.LabelHelper;

/**
 * The Operation object controller
 *
 * @generated
 */
public class OperationEditPart extends EMFGraphNodeEditPart {

	/**
	 * Constructor
	 *
	 * @param obj the graph node
	 * @generated
	 */
	public OperationEditPart(GraphNode obj) {
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 *
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

		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated
	 */
	protected IFigure createFigure() {

		return new OperationFigure();
	}

	/**
	 * 
	 * @return the model object
	 * @generated NOT
	 * it should be but in fact it is not generated (I copied it
	 * from Ecore editor). A bug in topcased gen process?
	 */
	protected Operation getModelOperation() {
		return (Operation) Utils.getElement(getGraphNode());
	}

	/**
	 * @see org.topcased.modeler.edit.GraphEdgeEditPart#getDefaultFont()
	 * @generated NOT
	 */
	protected Font getDefaultFont() {
		return EditPartUtils.changeFont(getModelOperation().isIsAbstract());
	}

	/**
	 * Update the ComposedLabel with the correct Suffix label (if necessary) and
	 * the right icon and font for the Main EditableLabel
	 * 
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#refreshHeaderLabel()
	 * @generated NOT
	 */
	protected void refreshHeaderLabel() {
		super.refreshHeaderLabel();

		OperationFigure fig = (OperationFigure) getFigure();
		EditableLabel lbl = (EditableLabel) fig.getLabel();
		lbl.setIcon(KmImageRegistry.getImage("OPERATION"));
		//  DVK temporarily disabled in 1.2.0 
		// lbl.setAlignment(PositionConstants.LEFT);
		updateLabel(lbl);
	}

	/**
	 * Thanks to topcased source code
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#performRequest(Request)
	 * @generated NOT
	 */
	protected void updateLabel(EditableLabel label) {
		label.setText(LabelHelper.getExtendedLabel(getModelOperation()));
	}

	/**
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#performRequest(Request)
	 * @generated NOT
	 */
	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_OPEN) {
			OperationEditDialog operationDlg = new OperationEditDialog(
					getModelOperation(), KmPlugin.getActiveWorkbenchShell());
			if (operationDlg.open() == Window.OK) {
				OperationUpdateCommand command = new OperationUpdateCommand(
						getModelOperation(), operationDlg.getData());
				getViewer().getEditDomain().getCommandStack().execute(command);
			}
		} else {
			super.performRequest(request);
		}
	}
}