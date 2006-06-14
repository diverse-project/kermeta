package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class FinalStateFigure extends StateFigure {
	/**
	 * Constructor <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FinalStateFigure() {
		super();
	}

	private static final int ROUND_CORNER = 10;

	/**
	 * @generated NOT
	 */
	protected void paintBorder(Graphics graphics) {
		super.paintBorder(graphics);

		graphics.pushState();
		Rectangle paintRect = getBounds().getCopy();
		paintRect.expand(-4, -4);
		graphics.drawRoundRectangle(paintRect, ROUND_CORNER, ROUND_CORNER);
		graphics.popState();
	}

}
