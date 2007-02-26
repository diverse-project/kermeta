/*******************************************************************************
 * $Id$
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.topcased.draw2d.figures.BorderedLabel;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @generated NOT
 */
public class StateFigure extends BorderedLabel {
	
	private static final int ROUND_CORNER = 10;
	
	/**
	 * Constructor
	 *
	 * @generated
	 */
	public StateFigure() {
		super();
	}

	/**
	 * @see org.topcased.draw2d.figures.BorderedLabel#outlineShape(org.eclipse.draw2d.Graphics)
	 * @generated NOT
	 */
	protected void outlineShape(Graphics graphics) {
		Rectangle r = getBounds();

		Rectangle outer = Rectangle.SINGLETON;
		outer.x = r.x + 1 / 2;
		outer.y = r.y + 1 / 2;
		outer.width = r.width - 1;
		outer.height = r.height - 1;

		graphics.drawRoundRectangle(outer, ROUND_CORNER, ROUND_CORNER);
	}
}