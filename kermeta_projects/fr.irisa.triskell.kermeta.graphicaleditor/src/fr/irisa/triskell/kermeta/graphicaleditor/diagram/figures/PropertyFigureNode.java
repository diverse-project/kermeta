package fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures;

import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.modeler.figures.ModelerLabelFigure;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;


/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class PropertyFigureNode extends ModelerLabelFigure {
		//org.topcased.draw2d.figures.EditableLabelFigure {
	/**
	 * Constructor
	 * @generated NOT
	 */
	public PropertyFigureNode(TextProvider provider) {
		super(provider);
		((EditableLabel) getLabel()).setIcon(StructureImageRegistry
				.getImage("PROPERTY"));
	}

}