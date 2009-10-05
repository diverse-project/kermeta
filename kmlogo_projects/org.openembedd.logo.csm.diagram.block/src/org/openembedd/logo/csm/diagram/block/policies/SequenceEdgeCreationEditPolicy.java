/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.commands.Command;
import org.openembedd.logo.csm.diagram.block.LogoCSMSimpleObjectConstants;
import org.openembedd.logo.csm.diagram.block.commands.SequenceEdgeCreationCommand;
import org.openembedd.logo.csm.logoCSM.Instruction;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy;
import org.topcased.modeler.utils.SourceTargetData;
import org.topcased.modeler.utils.Utils;

/**
 * Sequence edge creation
 * 
 * @generated
 */
public class SequenceEdgeCreationEditPolicy extends AbstractEdgeCreationEditPolicy
{
	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#createCommand(org.eclipse.gef.EditDomain,
	 *      org.topcased.modeler.di.model.GraphEdge, org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected CreateTypedEdgeCommand createCommand(EditDomain domain, GraphEdge edge, GraphElement source)
	{
		return new SequenceEdgeCreationCommand(domain, edge, source);
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkEdge(org.topcased.modeler.di.model.GraphEdge)
	 * @generated
	 */
	protected boolean checkEdge(GraphEdge edge)
	{
		if (edge.getSemanticModel() instanceof SimpleSemanticModelElement)
		{
			return LogoCSMSimpleObjectConstants.SIMPLE_OBJECT_SEQUENCE.equals(((SimpleSemanticModelElement) edge
					.getSemanticModel()).getTypeInfo());
		}
		return false;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkSource(org.topcased.modeler.di.model.GraphElement)
	 * @generated NOT
	 */
	protected boolean checkSource(GraphElement source)
	{
		EObject object = Utils.getElement(source);
		if (object instanceof Instruction)
		{
			Instruction ins = (Instruction) object;
			return (ins.getNext() == null);
		}
		return false;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkTargetForSource(org.topcased.modeler.di.model.GraphElement,
	 *      org.topcased.modeler.di.model.GraphElement)
	 * @generated NOT
	 */
	protected boolean checkTargetForSource(GraphElement source, GraphElement target)
	{
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		// The source and the target must have the same container
		if (sourceObject instanceof Instruction && targetObject instanceof Instruction
				&& sourceObject.eContainer().equals(targetObject.eContainer()))
		{
			if (!sourceObject.equals(targetObject))
			{
				Instruction ins = (Instruction) targetObject;
				return (ins.getPrevious() == null);
			}
		}
		return false;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#checkCommand(org.eclipse.gef.commands.Command)
	 * @generated
	 */
	protected boolean checkCommand(Command command)
	{
		return command instanceof SequenceEdgeCreationCommand;
	}

	/**
	 * @see org.topcased.modeler.edit.policies.AbstractEdgeCreationEditPolicy#getSourceTargetData(org.topcased.modeler.di.model.GraphElement,
	 *      org.topcased.modeler.di.model.GraphElement)
	 * @generated
	 */
	protected SourceTargetData getSourceTargetData(GraphElement source, GraphElement target)
	{
		EObject sourceObject = Utils.getElement(source);
		EObject targetObject = Utils.getElement(target);

		if (sourceObject instanceof org.openembedd.logo.csm.logoCSM.Instruction
				&& targetObject instanceof org.openembedd.logo.csm.logoCSM.Instruction)
		{
			return new SourceTargetData(false, false, SourceTargetData.NONE, null, null, null, null, null, "next",
				null, "previous");
		}
		return null;
	}

}
