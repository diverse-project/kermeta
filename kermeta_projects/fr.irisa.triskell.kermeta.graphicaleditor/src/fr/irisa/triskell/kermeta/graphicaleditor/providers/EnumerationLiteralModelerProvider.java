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

package fr.irisa.triskell.kermeta.graphicaleditor.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.topcased.modeler.providers.ILabelFeatureProvider;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

/**
 * This is the item provider adpater for a {@link fr.irisa.triskell.kermeta.model.EnumerationLiteral}
 * object.
 * <!-- begin-user-doc --> 
 * <!-- end-user-doc -->
 * @generated
 */

public class EnumerationLiteralModelerProvider extends
		NamedElementModelerProvider implements ILabelFeatureProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param adapterFactory the adapter factory
	 * 
	 * @generated
	 */
	public EnumerationLiteralModelerProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.topcased.modeler.providers.ILabelFeatureProvider#getLabelFeature(java.lang.Object)
	 * @generated
	 */
	public EAttribute getLabelFeature(Object object) {
		return StructurePackage.eINSTANCE.getNamedElement_Name();
	}
}