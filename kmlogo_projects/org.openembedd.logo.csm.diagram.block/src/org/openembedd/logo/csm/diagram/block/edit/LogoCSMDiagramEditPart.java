/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.openembedd.logo.csm.diagram.block.figures.LogoCSMDiagramFigure;
import org.openembedd.logo.csm.diagram.block.policies.LogoCSMDiagramLayoutEditPolicy;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.edit.DiagramEditPart;

/**
 * @generated
 */
public class LogoCSMDiagramEditPart extends DiagramEditPart
{

	/**
	 * The Constructor
	 * 
	 * @param model
	 *        the root model element
	 * @generated
	 */
	public LogoCSMDiagramEditPart(Diagram model)
	{
		super(model);
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#getLayoutEditPolicy()
	 * @generated
	 */
	protected EditPolicy getLayoutEditPolicy()
	{
		return new LogoCSMDiagramLayoutEditPolicy();
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#createBodyFigure()
	 * @generated
	 */
	protected IFigure createBodyFigure()
	{
		return new LogoCSMDiagramFigure();
	}
}
