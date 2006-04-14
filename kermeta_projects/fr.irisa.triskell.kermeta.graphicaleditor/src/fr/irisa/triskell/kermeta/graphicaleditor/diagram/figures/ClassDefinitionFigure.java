package fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures;

import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.draw2d.figures.Label;
import org.topcased.modeler.ecore.EcoreImageRegistry;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;


/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassDefinitionFigure extends
		org.topcased.draw2d.figures.ClassFigure {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDefinitionFigure() {
		super();
	}

    /**
     * @see org.topcased.draw2d.figures.ClassFigure#drawFigure()
     */
    protected void drawFigure()
    {
        ToolbarLayout layout = new ToolbarLayout();
        setLayoutManager(layout);
        setBorder(new CompoundBorder(new LineBorder(), new MarginBorder(1)));
        setOpaque(true);

        EditableLabel mainFigure = new EditableLabel();
        mainFigure.setLabelAlignment(PositionConstants.CENTER);
        mainFigure.setIcon(StructureImageRegistry
				.getImage("CLASSDEFINITION"));

        setLabel(new ComposedLabel(new Label(), mainFigure, new Label(), false));
        add(getLabel());

        setContentPane(new Figure());
        getContentPane().setLayoutManager(new ToolbarLayout());
        add(getContentPane());

    }

	
}