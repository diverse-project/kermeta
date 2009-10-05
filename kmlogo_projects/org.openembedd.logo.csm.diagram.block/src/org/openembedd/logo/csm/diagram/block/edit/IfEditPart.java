/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.openembedd.logo.csm.diagram.block.commands.IfRestoreConnectionCommand;
import org.openembedd.logo.csm.diagram.block.figures.IfFigure;
import org.openembedd.logo.csm.diagram.block.policies.IfLayoutEditPolicy;
import org.openembedd.logo.csm.logoCSM.If;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.topcased.draw2d.figures.ImageWithLabelFigure;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.ResizableEditPolicy;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

/**
 * The If object controller
 * 
 * @generated
 */
public class IfEditPart extends InstructionEditPart
{
	private final static String	DEFAULT_LABEL	= "No condition defined";

	/**
	 * Constructor
	 * 
	 * @param obj
	 *        the graph node
	 * @generated
	 */
	public IfEditPart(GraphNode obj)
	{
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 * 
	 * @generated
	 */
	protected void createEditPolicies()
	{
		super.createEditPolicies();

		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY, new RestoreEditPolicy()
		{
			protected Command getRestoreConnectionsCommand(RestoreConnectionsRequest request)
			{
				return new IfRestoreConnectionCommand(getHost());
			}
		});

		installEditPolicy(ModelerEditPolicyConstants.RESIZABLE_EDITPOLICY, new ResizableEditPolicy());

		installEditPolicy(EditPolicy.LAYOUT_ROLE, new IfLayoutEditPolicy());
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated NOT
	 */
	protected IFigure createFigure()
	{
		IfFigure figure = new IfFigure();
		If model = (If) Utils.getElement((GraphElement) this.getModel());
		if (model.getCondition() != null)
			figure.getLabel().setText(model.getCondition().parseExpression());
		else
			figure.getLabel().setText(DEFAULT_LABEL);
		return figure;
	}

	/**
	 * @see org.topcased.modeler.edit.EMFGraphNodeEditPart#handleModelChanged(org.eclipse.emf.common.notify.Notification)
	 * @generated NOT
	 */
	protected void handleModelChanged(Notification msg)
	{
		// On each notification of the model
		if (msg.getNotifier() instanceof If && msg.getFeatureID(If.class) == LogoCSMPackage.IF__CONDITION)
		{
			IFigure figure = getFigure();
			If model = (If) Utils.getElement((GraphElement) this.getModel());
			if (figure instanceof ImageWithLabelFigure)
			{
				if (model.getCondition() != null)
					((ImageWithLabelFigure) figure).getLabel().setText(model.getCondition().parseExpression());
				else
					((ImageWithLabelFigure) figure).getLabel().setText(DEFAULT_LABEL);

			}
		}
		super.handleModelChanged(msg);
	}
}
