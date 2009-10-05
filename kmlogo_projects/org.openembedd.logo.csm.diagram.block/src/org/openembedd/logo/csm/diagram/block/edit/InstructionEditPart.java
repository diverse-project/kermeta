/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.commands.Command;
import org.openembedd.logo.csm.diagram.block.LogoCSMEditPolicyConstants;
import org.openembedd.logo.csm.diagram.block.commands.InstructionRestoreConnectionCommand;
import org.openembedd.logo.csm.diagram.block.figures.InstructionFigure;
import org.openembedd.logo.csm.diagram.block.policies.InstructionEditPolicy;
import org.openembedd.logo.csm.diagram.block.policies.SequenceEdgeCreationEditPolicy;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.policies.RestoreEditPolicy;
import org.topcased.modeler.requests.RestoreConnectionsRequest;

/**
 * The Instruction object controller
 * 
 * @generated
 */
public class InstructionEditPart extends EMFGraphNodeEditPart
{
	/**
	 * Constructor
	 * 
	 * @param obj
	 *        the graph node
	 * @generated
	 */
	public InstructionEditPart(GraphNode obj)
	{
		super(obj);
	}

	/**
	 * Creates edit policies and associates these with roles
	 * 
	 * @generated NOT
	 */
	protected void createEditPolicies()
	{
		super.createEditPolicies();

		installEditPolicy(LogoCSMEditPolicyConstants.SEQUENCE_EDITPOLICY, new SequenceEdgeCreationEditPolicy());

		installEditPolicy(ModelerEditPolicyConstants.RESTORE_EDITPOLICY, new RestoreEditPolicy()
		{
			protected Command getRestoreConnectionsCommand(RestoreConnectionsRequest request)
			{
				return new InstructionRestoreConnectionCommand(getHost());
			}
		});

		// To manage expression editing
		installEditPolicy(LogoCSMEditPolicyConstants.INSTRUCTION_EDITPOLICY, new InstructionEditPolicy());
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 * @generated
	 */
	protected IFigure createFigure()
	{

		return new InstructionFigure();
	}

}
