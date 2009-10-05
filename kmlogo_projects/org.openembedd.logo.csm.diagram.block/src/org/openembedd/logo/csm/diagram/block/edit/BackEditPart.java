/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.commands.Command;
import org.openembedd.logo.csm.diagram.block.commands.BackRestoreConnectionCommand;
import org.openembedd.logo.csm.diagram.block.figures.BackFigure;
import org.openembedd.logo.csm.logoCSM.Back;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.topcased.draw2d.figures.ImageWithLabelFigure;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;
import org.topcased.modeler.utils.Utils;

/**
 * The Back object controller
 * 
 * @generated
 */
public class BackEditPart extends InstructionEditPart
{
	private final static String	DEFAULT_LABEL	= "No value defined";

	/**
	 * Constructor
	 * 
	 * @param obj
	 *        the graph node
	 * @generated
	 */
	public BackEditPart(GraphNode obj)
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
				return new BackRestoreConnectionCommand(getHost());
			}
		});

	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated NOT
	 */
	protected IFigure createFigure()
	{
		BackFigure figure = new BackFigure();
		Back model = (Back) Utils.getElement((GraphElement) this.getModel());
		if (model.getSteps() != null)
			figure.getLabel().setText(model.getSteps().parseExpression());
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
		if (msg.getNotifier() instanceof Back && msg.getFeatureID(Back.class) == LogoCSMPackage.BACK__STEPS)
		{
			IFigure figure = getFigure();
			Back model = (Back) Utils.getElement((GraphElement) this.getModel());
			if (figure instanceof ImageWithLabelFigure)
			{
				if (model.getSteps() != null)
					((ImageWithLabelFigure) figure).getLabel().setText(model.getSteps().parseExpression());
				else
					((ImageWithLabelFigure) figure).getLabel().setText(DEFAULT_LABEL);
			}
		}
		super.handleModelChanged(msg);
	}
}
