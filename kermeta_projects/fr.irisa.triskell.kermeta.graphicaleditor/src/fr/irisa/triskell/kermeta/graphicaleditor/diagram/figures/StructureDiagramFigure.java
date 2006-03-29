package fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures;

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
 * The figure to display a kmClassDiagram.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureDiagramFigure extends DiagramFigure {
	/**
	 * @see org.topcased.draw2d.figures.ContainerFigure#createLabel()
	 */
	protected ILabel createLabel() {
		Label header = new Label();
		header.setLabelAlignment(PositionConstants.LEFT);
		header.setIcon(StructureImageRegistry.getImage("PACKAGE"));
		header.setBorder(new PackageHeaderFigureBorder());

		return header;
	}

	/**
	 * A Border at the left, top and right of the label
	 */
	public static class PackageHeaderFigureBorder extends AbstractBorder {
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

}
