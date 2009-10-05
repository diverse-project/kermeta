/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.commands;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.openembedd.logo.csm.diagram.block.LogoCSMSimpleObjectConstants;
import org.openembedd.logo.csm.logoCSM.Instruction;
import org.topcased.modeler.ModelerPropertyConstants;
import org.topcased.modeler.commands.AbstractRestoreConnectionCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.util.DIUtils;
import org.topcased.modeler.utils.Utils;

/**
 * Instruction restore connection command
 * 
 * @generated
 */
public class InstructionRestoreConnectionCommand extends AbstractRestoreConnectionCommand
{
	/**
	 * @param part
	 *        the EditPart that is restored
	 * @generated
	 */
	public InstructionRestoreConnectionCommand(EditPart part)
	{
		super(part);
	}

	/**
	 * @see org.topcased.modeler.commands.AbstractRestoreConnectionCommand#initializeCommands()
	 * @generated NOT
	 */
	protected void initializeCommands()
	{
		GraphElement elt = getGraphElement();
		EObject eltObject = Utils.getElement(elt);

		if (eltObject instanceof Instruction)
		{
			Iterator<EObject> itDiagContents = getModeler().getActiveDiagram().eAllContents();
			while (itDiagContents.hasNext())
			{
				Object obj = itDiagContents.next();
				if (obj instanceof GraphElement
						&& DIUtils.getProperty((GraphElement) obj, ModelerPropertyConstants.ESTRUCTURAL_FEATURE_ID) == null)
				{
					boolean autoRef = obj.equals(elt);
					GraphElement elt2 = (GraphElement) obj;
					EObject eltObject2 = Utils.getElement(elt2);
					if (eltObject2 instanceof Instruction)
					{
						if (autoRef)
						{
							// autoRef not allowed
						}
						else
						{
							// if the elt is the source of the edge or if it is the target and that the
							// SourceTargetCouple is reversible
							createSequenceFromInstructionToInstruction_Previous(elt, elt2);
							// if elt is the target of the edge or if it is the source and that the SourceTargetCouple
							// is reversible
							createSequenceFromInstructionToInstruction_Previous(elt2, elt);
						}
					}
				}
			}
		}
	}

	/**
	 * @param srcElt
	 *        the source element
	 * @param targetElt
	 *        the target element
	 * @generated
	 */
	private void createSequenceFromInstructionToInstruction_Previous(GraphElement srcElt, GraphElement targetElt)
	{
		Instruction sourceObject = (Instruction) Utils.getElement(srcElt);
		Instruction targetObject = (Instruction) Utils.getElement(targetElt);

		if (targetObject.equals(sourceObject.getNext()) && sourceObject.equals(targetObject.getPrevious()))
		{
			// check if the relation does not exists yet
			if (getExistingEdges(srcElt, targetElt, LogoCSMSimpleObjectConstants.SIMPLE_OBJECT_SEQUENCE).size() == 0)
			{
				GraphEdge edge = Utils.createGraphEdge(LogoCSMSimpleObjectConstants.SIMPLE_OBJECT_SEQUENCE);
				SequenceEdgeCreationCommand cmd = new SequenceEdgeCreationCommand(null, edge, srcElt, false);
				cmd.setTarget(targetElt);
				add(cmd);
			}
		}
	}

}
