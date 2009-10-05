/***********************************************************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies), Jacques Lescot (Anyware
 * Technologies) - initial API and implementation, Christian Brunette (INRIA - OpenEmbeDD integration team)
 **********************************************************************************************************************/
package org.openembedd.logo.csm.diagram.block.commands;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.openembedd.logo.csm.logoCSM.Instruction;
import org.topcased.modeler.di.model.DiagramInterchangeFactory;
import org.topcased.modeler.di.model.GraphConnector;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.utils.Utils;

public class SequenceDeleteCommand extends Command
{
	private static final int	SOURCE_ANCHOR	= 0;

	private static final int	TARGET_ANCHOR	= 1;

	private GraphEdge			deletedEdge;

	private GraphElement		source;

	private GraphElement		target;

	private Instruction			model_src;

	private Instruction			model_dst;

	private GraphElement		parent;

	private GraphConnector		sourceConnector;

	private GraphConnector		targetConnector;

	private boolean				sourceremoved;

	private boolean				targetremoved;

	/**
	 * The Constructor
	 */
	public SequenceDeleteCommand(GraphEdge edge)
	{
		super("Delete Sequence");
		this.deletedEdge = edge;
		setSource(deletedEdge);
		setTarget(deletedEdge);
	}

	/**
	 * Check if the command can be executed
	 * 
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute()
	{
		return true;
	}

	/**
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void redo()
	{
		if (parent != null)
		{
			EList<GraphConnector> anchors = deletedEdge.getAnchor();
			sourceConnector = anchors.get(0);
			targetConnector = anchors.get(1);

			// remove the connection from the parent element
			parent.getContained().remove(deletedEdge);

			// remove the connection from its different Connectors
			deletedEdge.getAnchor().remove(targetConnector);
			deletedEdge.getAnchor().remove(sourceConnector);

			sourceremoved = (sourceConnector.getGraphEdge().size() == 0);
			if (sourceremoved)
			{
				// the connector is useless : remove it
				source.getAnchorage().remove(sourceConnector);
			}

			targetremoved = (targetConnector.getGraphEdge().size() == 0);
			if (targetremoved)
			{
				// the connector is useless : remove it
				target.getAnchorage().remove(targetConnector);
			}
		}
		model_src.setNext(null);
		model_dst.setPrevious(null);
	}

	/**
	 * Removes the connection
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute()
	{
		parent = deletedEdge.getContainer();
		redo();
	}

	/**
	 * Restores the connection
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo()
	{
		model_src.setNext(model_dst);
		model_dst.setPrevious(model_src);

		if (sourceremoved)
			source.getAnchorage().add(sourceConnector);

		if (targetremoved)
			target.getAnchorage().add(targetConnector);

		if (source == target)
		{
			// Creates anchor if needed
			if (source.getAnchorage().isEmpty())
			{
				GraphConnector connector1 = DiagramInterchangeFactory.eINSTANCE.createGraphConnector();
				source.getAnchorage().add(connector1);
			}
			if (source.getAnchorage().size() < 2)
			{
				GraphConnector connector2 = DiagramInterchangeFactory.eINSTANCE.createGraphConnector();
				source.getAnchorage().add(connector2);
			}
			GraphConnector srcConnector = (GraphConnector) source.getAnchorage().get(0);
			GraphConnector tgtConnector = (GraphConnector) source.getAnchorage().get(1);

			// add the edge to the graphical view
			srcConnector.getGraphEdge().add(deletedEdge);
			tgtConnector.getGraphEdge().add(deletedEdge);
		}
		else
		{
			// Creates anchor if needed
			if (source.getAnchorage().isEmpty())
			{
				GraphConnector connector = DiagramInterchangeFactory.eINSTANCE.createGraphConnector();
				source.getAnchorage().add(connector);
			}
			GraphConnector srcConnector = (GraphConnector) source.getAnchorage().get(0);

			if (target.getAnchorage().isEmpty())
			{
				GraphConnector connector = DiagramInterchangeFactory.eINSTANCE.createGraphConnector();
				target.getAnchorage().add(connector);
			}
			GraphConnector tgtConnector = (GraphConnector) target.getAnchorage().get(0);

			// add the edge to the graphical view
			srcConnector.getGraphEdge().add(deletedEdge);
			tgtConnector.getGraphEdge().add(deletedEdge);
		}

		if (parent != null)
		{
			// add the edge to the graphical view
			parent.getContained().add(deletedEdge);
		}
	}

	/**
	 * Retrieve the source Node from the given edge
	 * 
	 * @param edge
	 *        the GraphEdge concerned by the Command
	 */
	private void setSource(GraphEdge edge)
	{
		this.source = (GraphElement) ((GraphConnector) edge.getAnchor().get(SOURCE_ANCHOR)).eContainer();
		EObject obj = Utils.getElement(source);
		if (obj instanceof Instruction)
			model_src = (Instruction) obj;
	}

	/**
	 * Retrieve the target Node from the given edge
	 * 
	 * @param edge
	 *        the GraphEdge concerned by the Command
	 */
	private void setTarget(GraphEdge edge)
	{
		if (edge.getAnchor().size() == 1)
		{
			// the target Node is the same as source Node
			this.target = (GraphElement) ((GraphConnector) edge.getAnchor().get(SOURCE_ANCHOR)).eContainer();
		}
		else
			this.target = (GraphElement) ((GraphConnector) edge.getAnchor().get(TARGET_ANCHOR)).eContainer();
		EObject obj = Utils.getElement(target);
		if (obj instanceof Instruction)
			model_dst = (Instruction) obj;
	}
}
