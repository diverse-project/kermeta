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

package fr.irisa.triskell.kermeta.graphicaleditor.diag.policies;

import org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy;
import org.topcased.modeler.figures.IEdgeObjectFigure;

import fr.irisa.triskell.kermeta.graphicaleditor.diag.figures.PropertyFigure;

/**
 * An edit policy to select and move the name and the cardinality label relative
 * to the EReference connection .<br>
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PropertyEdgeObjectUVEditPolicy extends EdgeObjectUVEditPolicy {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.topcased.modeler.edit.policies.EdgeObjectUVEditPolicy#isEnd(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated NOT
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
