package fr.irisa.triskell.kermeta.graphicaleditor.diagram.policies;

import org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.PropertyFigure;

/**
 * An edit policy to select and move the name and the cardinality label relative
 * to the EReference connection .<br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyEdgeObjectUVEditPolicy extends EdgeObjectUVEditPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy#isEnd(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	protected boolean isEnd(IEdgeObjectFigure figure) {
		PropertyFigure fpropertyFigure = (PropertyFigure) getHostFigure();

		if (figure == fpropertyFigure.getfNameEdgeObjectFigure()) {
			return true;
		}

		return true;
	}

}
