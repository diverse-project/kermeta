/***********************************************************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 **********************************************************************************************************************/
package org.openembedd.logo.csm.diagram.block.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.openembedd.logo.csm.diagram.block.commands.SequenceDeleteCommand;
import org.topcased.modeler.di.model.GraphEdge;

/**
 * This Edit Policy provides the sequence delete command.
 */
public class SequenceDeletionEditPolicy extends ConnectionEditPolicy
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editpolicies.ConnectionEditPolicy#getDeleteCommand(org.eclipse.gef.requests.GroupRequest)
	 */
	protected Command getDeleteCommand(GroupRequest request)
	{
		Object model = getHost().getModel();
		if (model instanceof GraphEdge)
		{
			return new SequenceDeleteCommand((GraphEdge) model);
		}
		return null;
	}
}
