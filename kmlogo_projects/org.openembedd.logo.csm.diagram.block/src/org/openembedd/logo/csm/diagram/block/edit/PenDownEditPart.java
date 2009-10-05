/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.commands.Command;
import org.openembedd.logo.csm.diagram.block.commands.PenDownRestoreConnectionCommand;
import org.openembedd.logo.csm.diagram.block.figures.PenDownFigure;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;

/**
 * The PenDown object controller
 * 
 * @generated
 */
public class PenDownEditPart extends InstructionEditPart
{
	/**
	 * Constructor
	 * 
	 * @param obj
	 *        the graph node
	 * @generated
	 */
	public PenDownEditPart(GraphNode obj)
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
				return new PenDownRestoreConnectionCommand(getHost());
			}
		});

	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated
	 */
	protected IFigure createFigure()
	{

		return new PenDownFigure();
	}

}
