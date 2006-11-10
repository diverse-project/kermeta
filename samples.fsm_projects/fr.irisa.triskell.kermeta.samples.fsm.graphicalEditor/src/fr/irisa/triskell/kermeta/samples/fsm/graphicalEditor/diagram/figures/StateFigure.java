/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *   Jacques Lescot (Anyware Technologies), Thomas Friol (Anyware Technologies),
 *   Nicolas Lalevée (Anyware Technologies) - initial API and implementation 
 ******************************************************************************/

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @generated
 */
public class StateFigure extends org.topcased.draw2d.figures.BorderedLabel {
	
	private static final int ROUND_CORNER = 10;
	
	/**
	 * Constructor
	 * @generated
	 */
	public StateFigure() {
		super();
	}

    /**
     * @see org.topcased.draw2d.figures.BorderedLabel#outlineShape(org.eclipse.draw2d.Graphics)
     */
    protected void outlineShape(Graphics graphics)
    {
        Rectangle r = getBounds();

        Rectangle outer = Rectangle.SINGLETON;
        outer.x = r.x + lineWidth / 2;
        outer.y = r.y + lineWidth / 2;
        outer.width = r.width - lineWidth;
        outer.height = r.height - lineWidth;

        graphics.drawRoundRectangle(outer, ROUND_CORNER, ROUND_CORNER);
    }
}