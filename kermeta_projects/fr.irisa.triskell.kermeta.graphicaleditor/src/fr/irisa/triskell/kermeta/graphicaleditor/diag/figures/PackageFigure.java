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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.draw2d.figures.Label;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageFigure extends org.topcased.draw2d.figures.PackageFigure {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 */
	protected IFigure createHeader() {
		EditableLabel mainFigure = new EditableLabel(StructureImageRegistry.getImage("PACKAGE"));
		mainFigure.setLabelAlignment(PositionConstants.CENTER);
		
		ComposedLabel label = new ComposedLabel(new Label(), mainFigure,
				new Label(), false);
		return label;
	}
}