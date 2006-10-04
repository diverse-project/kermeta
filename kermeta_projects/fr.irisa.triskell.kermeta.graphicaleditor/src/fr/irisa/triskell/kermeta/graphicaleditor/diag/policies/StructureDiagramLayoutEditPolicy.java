/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *   Jacques Lescot (Anyware Technologies), Thomas Friol (Anyware Technologies),
 *   Nicolas Lalev�e (Anyware Technologies) - initial API and implementation 
 ******************************************************************************/

package fr.irisa.triskell.kermeta.graphicaleditor.diag.policies;

import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class StructureDiagramLayoutEditPolicy extends ModelerLayoutEditPolicy {
	/**
	 * Default contructor. 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDiagramLayoutEditPolicy() {
		super();
	}

	/**
	 * @see org.topcased.modeler.edit.policies.ModelerLayoutEditPolicy#isExternalObjectAllowed(org.topcased.modeler.di.model.GraphNode,
	 *      org.topcased.modeler.di.model.GraphNode)
	 * @generated NOT
	 */
	protected boolean isExternalObjectAllowed(GraphNode parent, GraphNode child) {
		return true;
	}
}