package fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures;

import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.modeler.figures.ModelerLabelFigure;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class OperationFigure extends ModelerLabelFigure {
	//org.topcased.draw2d.figures.EditableLabelFigure {
	/**
	 * Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationFigure() {

		super();
	}

	/**
	 * The provider is used to control the operation.
	 * @param provider
	 */
	public OperationFigure(TextProvider provider) {
		super(provider);
		((EditableLabel) getLabel()).setIcon(StructureImageRegistry
				.getImage("OPERATION"));
	}

}