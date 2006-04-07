package fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;

/**
 * A Border at the left, top and right of the label
 */
public class PackageHeaderFigureBorder extends AbstractBorder {
	private static final Insets INSETS = new Insets(3, 3, 1, 4);

	/**
	 * @see org.eclipse.draw2d.Border#getInsets(org.eclipse.draw2d.IFigure)
	 */
	public Insets getInsets(IFigure figure) {
		return INSETS;
	}

	/**
	 * Draw the 3 borders
	 * @see org.eclipse.draw2d.Border#paint(org.eclipse.draw2d.IFigure, org.eclipse.draw2d.Graphics, org.eclipse.draw2d.geometry.Insets)
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