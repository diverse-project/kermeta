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

package fr.irisa.triskell.kermeta.graphicaleditor.diag.figures;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.topcased.draw2d.figures.ILabel;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.figures.DiagramFigure;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;


/**
 * The figure to display a Kermeta class diagram.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureDiagramFigure extends DiagramFigure {
	
	/**
     * @see org.topcased.draw2d.figures.ContainerFigure#createLabel()
     */
    protected ILabel createLabel()
    {
        Label header = new Label(StructureImageRegistry.getImage("PACKAGE"));
        header.setLabelAlignment(PositionConstants.LEFT);
        header.setBorder(new PackageHeaderFigureBorder());
        
        return header;
    }
    
    /**
     * A Border at the left, top and right of the label
     */
    public static class PackageHeaderFigureBorder extends AbstractBorder
    {
        private static final Insets INSETS = new Insets(3, 3, 1, 4);
        
        /**
         * @see org.eclipse.draw2d.Border#getInsets(org.eclipse.draw2d.IFigure)
         */
        public Insets getInsets(IFigure figure)
        {
            return INSETS;
        }
        
        /**
         * Draw the 3 borders
         * 
         * @see org.eclipse.draw2d.Border#paint(org.eclipse.draw2d.IFigure,
         *      org.eclipse.draw2d.Graphics, org.eclipse.draw2d.geometry.Insets)
         */
        public void paint(IFigure figure, Graphics graphics, Insets insets)
        {
            graphics.pushState();
            
            graphics.drawLine(getPaintRectangle(figure, insets).getBottomLeft(), tempRect.getTopLeft());
            graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getTopRight());
            graphics.drawLine(getPaintRectangle(figure, insets).getTopRight().translate(-1, 0),
                    tempRect.getBottomRight().translate(-1, 0));
            
            graphics.popState();
        }
    }
}
