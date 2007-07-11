/*******************************************************************************
 * $Id: PropertyEdgeObjectUVEditPolicy.java,v 1.2 2007-07-11 14:50:45 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.policies;

import org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.figures.PropertyFigure;

/**
 * An edit policy to select and move the name and the cardinality label relative to the EReference connection.
 *
 * @generated
 */
public class PropertyEdgeObjectUVEditPolicy extends EdgeObjectUVEditPolicy {
	/**
	 * @see org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy#isEnd(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	protected boolean isEnd(IEdgeObjectFigure figure) {
		PropertyFigure propertyFigure = (PropertyFigure) getHostFigure();

		if (figure == propertyFigure.getNameEdgeObjectFigure()) {
			return true;
		}

		if (figure == propertyFigure.getMultiplicityEdgeObjectFigure()) {
			return true;
		}

		return true;
	}

}
