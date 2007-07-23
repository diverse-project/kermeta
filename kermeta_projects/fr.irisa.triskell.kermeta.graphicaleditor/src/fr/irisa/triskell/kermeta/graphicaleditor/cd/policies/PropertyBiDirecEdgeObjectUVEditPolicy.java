/*******************************************************************************
 * $Id: PropertyBiDirecEdgeObjectUVEditPolicy.java,v 1.2 2007-07-23 09:21:24 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.policies;

import org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.figures.PropertyBiDirecFigure;

/**
 * An edit policy to select and move the name and the cardinality label relative to the EReference connection.
 *
 * @generated
 */
public class PropertyBiDirecEdgeObjectUVEditPolicy extends
		EdgeObjectUVEditPolicy {
	/**
	 * @see org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy#isEnd(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	protected boolean isEnd(IEdgeObjectFigure figure) {
		PropertyBiDirecFigure propertybidirecFigure = (PropertyBiDirecFigure) getHostFigure();

		if (figure == propertybidirecFigure.getSource_nameEdgeObjectFigure()) {
			return false;
		}
		if (figure == propertybidirecFigure.getTarget_nameEdgeObjectFigure()) {
			return true;
		}

		return true;
	}

}
