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

package fr.irisa.triskell.kermeta.graphicaleditor.diag;

/**
 * A collection of Roles. Each identifier is used to key the EditPolicy.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public interface StructureEditPolicyConstants {

	/** The key used to install an <i>Package</i> EditPolicy. */
	String PACKAGE_EDITPOLICY = "Package EditPolicy";

	/** The key used to install an <i>ClassDefinition</i> EditPolicy. */
	String CLASSDEFINITION_EDITPOLICY = "ClassDefinition EditPolicy";

	/** The key used to install an <i>Property</i> EditPolicy. */
	String PROPERTY_EDITPOLICY = "Property EditPolicy";

	/** The key used to install an <i>Operation</i> EditPolicy. */
	String OPERATION_EDITPOLICY = "Operation EditPolicy";

	/** The key used to install an <i>Inheritance</i> EditPolicy. */
	String INHERITANCE_EDITPOLICY = "Inheritance EditPolicy";
	
	/** The key used to install a <i>Delete Inheritance Edge</i> EditPolicy. */
    String DELETE_INHERITANCE_EDGE_EDITPOLICY = "Delete Inheritance Edge EditPolicy";
}