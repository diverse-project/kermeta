/*******************************************************************************
 * $Id: PackageFigure.java,v 1.5 2008-09-26 14:11:07 dvojtise Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.draw2d.figures.Label;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.KmImageRegistry;

/**
 * @generated
 */
public class PackageFigure extends org.topcased.draw2d.figures.PackageFigure {
	/**
	 * Constructor
	 *
	 * @generated
	 */
	public PackageFigure() {
		super();
	}

	/**
	 * Create the edited label
	 * 
	 * @return the edited label
	 * @generated NOT
	 * fully added
	 */
	protected IFigure createHeader() {
		Label mainFigure = new Label(KmImageRegistry.getImage("PACKAGE"));
		//  DVK temporarily disabled in 1.2.0 
		// mainFigure.setAlignment(PositionConstants.CENTER);

		ComposedLabel label = new ComposedLabel(new Label(), mainFigure,
				new Label(), false);
		return label;
	}
}