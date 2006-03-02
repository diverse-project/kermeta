package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.edit.DiagramEditPart;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.StructureDiagramFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies.StructureDiagramLayoutEditPolicy;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureDiagramEditPart extends DiagramEditPart {

	/**
	 * The Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param model
	 * @generated
	 */
	public StructureDiagramEditPart(Diagram model) {
		super(model);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.DiagramEditPart#getLayoutEditPolicy()
	 * @generated
	 */
	protected EditPolicy getLayoutEditPolicy() {
		return new StructureDiagramLayoutEditPolicy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.DiagramEditPart#createBodyFigure()
	 * @generated
	 */
	protected IFigure createBodyFigure() {
		return new StructureDiagramFigure();
	}
}