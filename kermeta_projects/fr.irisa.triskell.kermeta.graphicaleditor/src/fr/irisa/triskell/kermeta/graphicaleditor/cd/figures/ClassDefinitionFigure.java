/*******************************************************************************
 * $Id: ClassDefinitionFigure.java,v 1.1 2007-02-06 17:45:46 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.figures;

import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.draw2d.figures.Label;

/**
 * @generated
 */
public class ClassDefinitionFigure extends
		org.topcased.draw2d.figures.ClassFigure {
	/**
	 * Constructor
	 *
	 * @generated
	 */
	public ClassDefinitionFigure() {
		super();
	}

	/**
	 * @override
	 * @see org.topcased.draw2d.figures.ClassFigure#drawFigure()
	 * @generated NOT
	 */
	protected void drawFigure() {
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new CompoundBorder(new LineBorder(), new MarginBorder(1)));
		setOpaque(true);

		EditableLabel mainFigure = new EditableLabel();
		mainFigure.setLabelAlignment(PositionConstants.CENTER);

		setLabel(new ComposedLabel(new Label(), mainFigure, new Label(), false));
		add(getLabel());

		setContentPane(new Figure());
		getContentPane().setLayoutManager(new ToolbarLayout());
		add(getContentPane());
	}
}