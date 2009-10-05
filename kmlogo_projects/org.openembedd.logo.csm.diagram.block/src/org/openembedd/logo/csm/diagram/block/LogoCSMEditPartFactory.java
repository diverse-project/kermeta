/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.openembedd.logo.csm.diagram.block.edit.BackEditPart;
import org.openembedd.logo.csm.diagram.block.edit.BlockEditPart;
import org.openembedd.logo.csm.diagram.block.edit.ClearEditPart;
import org.openembedd.logo.csm.diagram.block.edit.ForwardEditPart;
import org.openembedd.logo.csm.diagram.block.edit.IfEditPart;
import org.openembedd.logo.csm.diagram.block.edit.InstructionEditPart;
import org.openembedd.logo.csm.diagram.block.edit.LeftEditPart;
import org.openembedd.logo.csm.diagram.block.edit.LogoCSMDiagramEditPart;
import org.openembedd.logo.csm.diagram.block.edit.PenDownEditPart;
import org.openembedd.logo.csm.diagram.block.edit.PenUpEditPart;
import org.openembedd.logo.csm.diagram.block.edit.RepeatEditPart;
import org.openembedd.logo.csm.diagram.block.edit.RightEditPart;
import org.openembedd.logo.csm.diagram.block.edit.SequenceEditPart;
import org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.GraphEdgeEditPart;
import org.topcased.modeler.edit.GraphNodeEditPart;
import org.topcased.modeler.utils.Utils;

/**
 * Part Factory : associates a model object to its controller. <br>
 * 
 * @generated
 */
public class LogoCSMEditPartFactory implements EditPartFactory
{
	/**
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart,java.lang.Object)
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model)
	{
		if (model instanceof Diagram)
		{
			return new LogoCSMDiagramEditPart((Diagram) model);
		}
		else if (model instanceof GraphNode)
		{
			final GraphNode node = (GraphNode) model;
			EObject element = Utils.getElement(node);
			if (element != null)
			{
				if ("http://openembedd.org/logoCSM".equals(element.eClass().getEPackage().getNsURI()))
				{
					return (EditPart) new NodeLogoCSMSwitch(node).doSwitch(element);
				}

				return new EMFGraphNodeEditPart(node);
			}

			if (node.getSemanticModel() instanceof SimpleSemanticModelElement)
			{
				// Manage the Element that are not associated with a model object
			}
			return new GraphNodeEditPart(node);
		}
		else if (model instanceof GraphEdge)
		{
			final GraphEdge edge = (GraphEdge) model;
			EObject element = Utils.getElement(edge);
			if (element != null)
			{
				if ("http://openembedd.org/logoCSM".equals(element.eClass().getEPackage().getNsURI()))
				{
					return (EditPart) new EdgeLogoCSMSwitch(edge).doSwitch(element);
				}

				return new EMFGraphEdgeEditPart(edge);
			}

			if (edge.getSemanticModel() instanceof SimpleSemanticModelElement)
			{
				// Manage the Element that are not associated with a model object
				if (LogoCSMSimpleObjectConstants.SIMPLE_OBJECT_SEQUENCE.equals(((SimpleSemanticModelElement) edge
						.getSemanticModel()).getTypeInfo()))
				{
					return new SequenceEditPart(edge);
				}
			}

			return new GraphEdgeEditPart(edge);
		}

		throw new IllegalStateException("No edit part matches with the '" + model.getClass().getName()
				+ "' model element. Check LogoCSMEditPartFactory#createEditPart(EditPart,Object) class");
	}

	/**
	 * @generated
	 */
	private class NodeLogoCSMSwitch extends LogoCSMSwitch
	{
		/**
		 * The graphical node
		 * 
		 * @generated
		 */
		private GraphNode	node;

		/**
		 * Constructor
		 * 
		 * @param node
		 *        the graphical node
		 * @generated
		 */
		public NodeLogoCSMSwitch(GraphNode node)
		{
			this.node = node;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseInstruction(org.openembedd.logo.csm.logoCSM.Instruction)
		 * @generated
		 */
		public Object caseInstruction(org.openembedd.logo.csm.logoCSM.Instruction object)
		{
			return new InstructionEditPart(node);
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseBack(org.openembedd.logo.csm.logoCSM.Back)
		 * @generated
		 */
		public Object caseBack(org.openembedd.logo.csm.logoCSM.Back object)
		{
			return new BackEditPart(node);
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseForward(org.openembedd.logo.csm.logoCSM.Forward)
		 * @generated
		 */
		public Object caseForward(org.openembedd.logo.csm.logoCSM.Forward object)
		{
			return new ForwardEditPart(node);
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseLeft(org.openembedd.logo.csm.logoCSM.Left)
		 * @generated
		 */
		public Object caseLeft(org.openembedd.logo.csm.logoCSM.Left object)
		{
			return new LeftEditPart(node);
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseRight(org.openembedd.logo.csm.logoCSM.Right)
		 * @generated
		 */
		public Object caseRight(org.openembedd.logo.csm.logoCSM.Right object)
		{
			return new RightEditPart(node);
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#casePenDown(org.openembedd.logo.csm.logoCSM.PenDown)
		 * @generated
		 */
		public Object casePenDown(org.openembedd.logo.csm.logoCSM.PenDown object)
		{
			return new PenDownEditPart(node);
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#casePenUp(org.openembedd.logo.csm.logoCSM.PenUp)
		 * @generated
		 */
		public Object casePenUp(org.openembedd.logo.csm.logoCSM.PenUp object)
		{
			return new PenUpEditPart(node);
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseClear(org.openembedd.logo.csm.logoCSM.Clear)
		 * @generated
		 */
		public Object caseClear(org.openembedd.logo.csm.logoCSM.Clear object)
		{
			return new ClearEditPart(node);
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseBlock(org.openembedd.logo.csm.logoCSM.Block)
		 * @generated
		 */
		public Object caseBlock(org.openembedd.logo.csm.logoCSM.Block object)
		{
			return new BlockEditPart(node);
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseIf(org.openembedd.logo.csm.logoCSM.If)
		 * @generated
		 */
		public Object caseIf(org.openembedd.logo.csm.logoCSM.If object)
		{
			return new IfEditPart(node);
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseRepeat(org.openembedd.logo.csm.logoCSM.Repeat)
		 * @generated
		 */
		public Object caseRepeat(org.openembedd.logo.csm.logoCSM.Repeat object)
		{
			return new RepeatEditPart(node);
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object)
		{
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeLogoCSMSwitch extends LogoCSMSwitch
	{
		/**
		 * The graphical edge
		 * 
		 * @generated
		 */
		private GraphEdge	edge;

		/**
		 * Constructor
		 * 
		 * @param edge
		 *        the graphical edge
		 * @generated
		 */
		public EdgeLogoCSMSwitch(GraphEdge edge)
		{
			this.edge = edge;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object)
		{
			return new EMFGraphEdgeEditPart(edge);
		}
	}

}
