/*******************************************************************************
 * $Id: KmDiagramFigure.java,v 1.3 2007-07-23 09:21:24 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.figures;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.topcased.draw2d.figures.ILabel;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.figures.DiagramFigure;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmImageRegistry;

/**
 * The figure to display a Kermeta class diagram.
 *
 * @generated
 */
public class KmDiagramFigure extends DiagramFigure {
	/**
	 * @see org.topcased.draw2d.figures.ContainerFigure#createLabel().
	 * @generated NOT
	 */
	protected ILabel createLabel() {
		Label header = new Label(KmImageRegistry.getImage("PACKAGE"));
		header.setLabelAlignment(PositionConstants.LEFT);
		header.setBorder(new PackageHeaderFigureBorder());

		return header;
	}

	/**
	 * A Border at the left, top and right of the label
	 * @generated NOT
	 */
	public static class PackageHeaderFigureBorder extends AbstractBorder {
		/**
		 * @generated NOT
		 */
		private static final Insets INSETS = new Insets(3, 3, 1, 4);

		/**
		 * @see org.eclipse.draw2d.Border#getInsets(org.eclipse.draw2d.IFigure)
		 * @generated NOT
		 */
		public Insets getInsets(IFigure figure) {
			return INSETS;
		}

		/**
		 * Draw the 3 borders
		 * 
		 * @see org.eclipse.draw2d.Border#paint(org.eclipse.draw2d.IFigure,
		 *      org.eclipse.draw2d.Graphics, org.eclipse.draw2d.geometry.Insets)
		 *      @generated NOT
		 */
		public void paint(IFigure figure, Graphics graphics, Insets insets) {
			graphics.pushState();

			graphics.drawLine(
					getPaintRectangle(figure, insets).getBottomLeft(), tempRect
							.getTopLeft());
			graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(),
					tempRect.getTopRight());
			graphics.drawLine(getPaintRectangle(figure, insets).getTopRight()
					.translate(-1, 0), tempRect.getBottomRight().translate(-1,
					0));

			graphics.popState();
		}
	}
}
