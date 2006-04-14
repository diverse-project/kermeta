package fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures;

import org.eclipse.draw2d.IFigure;
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
	 * @generated NOT
	 */
	public PackageFigure() {
		super();
	}
	
    /**
     * Create the edited label
     * @return the edited label
     */
    protected IFigure createHeader()
    {
    	EditableLabel editLabel = new EditableLabel();
        ComposedLabel label = new ComposedLabel(new Label(), editLabel , new Label(), false);
		editLabel.setIcon(StructureImageRegistry.getImage("PACKAGE"));
        return label;
    }

}