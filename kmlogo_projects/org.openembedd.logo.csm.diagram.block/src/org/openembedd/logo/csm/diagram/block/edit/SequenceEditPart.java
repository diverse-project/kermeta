/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPolicy;
import org.openembedd.logo.csm.diagram.block.figures.SequenceFigure;
import org.openembedd.logo.csm.diagram.block.policies.SequenceDeletionEditPolicy;
import org.topcased.modeler.ModelerColorConstants;
import org.topcased.modeler.ModelerEditPolicyConstants;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.edit.GraphEdgeEditPart;

/**
 * Sequence controller
 * 
 * @generated
 */
public class SequenceEditPart extends GraphEdgeEditPart
{

	/**
	 * Constructor
	 * 
	 * @param model
	 *        the graph object
	 * @generated
	 */
	public SequenceEditPart(GraphEdge model)
	{
		super(model);
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 * @generated NOT
	 */
	protected void createEditPolicies()
	{
		super.createEditPolicies();

		installEditPolicy(ModelerEditPolicyConstants.CHANGE_FONT_EDITPOLICY, null);

		// Modify the delete method of the sequence connection
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new SequenceDeletionEditPolicy());
	}

	/**
	 * @return the Figure
	 * @generated
	 */
	protected IFigure createFigure()
	{
		SequenceFigure connection = new SequenceFigure();

		createTargetDecoration(connection);

		return connection;
	}

	/**
	 * @param connection
	 *        the PolylineConnection
	 * @generated
	 */
	private void createTargetDecoration(PolylineConnection connection)
	{

		PolygonDecoration decoration = new PolygonDecoration();
		decoration.setScale(14, 6);
		decoration.setBackgroundColor(ModelerColorConstants.white);
		connection.setTargetDecoration(decoration);

	}

}
