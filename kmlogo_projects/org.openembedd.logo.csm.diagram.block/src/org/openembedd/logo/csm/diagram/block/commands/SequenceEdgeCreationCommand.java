/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.commands;

import org.eclipse.gef.EditDomain;
import org.topcased.modeler.commands.CreateTypedEdgeCommand;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;

/**
 * Sequence edge creation command
 * 
 * @generated
 */
public class SequenceEdgeCreationCommand extends CreateTypedEdgeCommand
{

	/**
	 * @param domain
	 *        the edit domain
	 * @param newObj
	 *        the graph edge of the new connection
	 * @param src
	 *        the graph element of the source
	 * @generated
	 */
	public SequenceEdgeCreationCommand(EditDomain domain, GraphEdge newObj, GraphElement src)
	{
		this(domain, newObj, src, true);
	}

	/**
	 * @param domain
	 *        the edit domain
	 * @param newObj
	 *        the graph edge of the new connection
	 * @param src
	 *        the graph element of the source
	 * @param needModelUpdate
	 *        set it to true if the model need to be updated
	 * @generated
	 */
	public SequenceEdgeCreationCommand(EditDomain domain, GraphEdge newObj, GraphElement src, boolean needModelUpdate)
	{
		super(domain, newObj, src, needModelUpdate);
	}

	/**
	 * @generated
	 */
	protected void redoModel()
	{
		// TODO add specific code if super method is not sufficient
		super.redoModel();
	}

	/**
	 * @generated
	 */
	protected void undoModel()
	{
		// TODO add specific code if super method is not sufficient
		super.undoModel();
	}

}
