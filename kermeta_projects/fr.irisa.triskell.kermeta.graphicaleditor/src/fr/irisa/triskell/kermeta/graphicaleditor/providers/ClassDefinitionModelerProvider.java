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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.topcased.modeler.providers.IDeletePartnerProvider;
import org.topcased.modeler.providers.ILabelFeatureProvider;

import fr.irisa.triskell.kermeta.common.KermetaCommonUtils;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

import java.util.Iterator;

/**
 * This is the item provider adpater for a
 * {@link fr.irisa.triskell.kermeta.model.ClassDefinition} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class ClassDefinitionModelerProvider extends
		TypeContainerModelerProvider implements ILabelFeatureProvider,
		IDeletePartnerProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param adapterFactory
	 *            the adapter factory
	 * 
	 * @generated
	 */
	public ClassDefinitionModelerProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.topcased.modeler.providers.ILabelFeatureProvider#getLabelFeature(java.lang.Object)
	 * @generated
	 */
	public EAttribute getLabelFeature(Object object) {
		return StructurePackage.eINSTANCE.getNamedElement_Name();
	}

	/**
	 * @see org.topcased.modeler.providers.IDeletePartnerProvider#getDeletePartners(java.lang.Object)
	 */
	public List getDeletePartners(Object object) {
		ArrayList deletelist = new ArrayList();

		ClassDefinition theClassDef = (ClassDefinition) object;

		// Get the types that refer the cuurent ClassDefinition
		for (Iterator itLinks = KermetaCommonUtils.getOwnedTypesForTypeDefinitions(
				theClassDef).iterator(); itLinks.hasNext();) {
			Object objType = itLinks.next();
			if (objType instanceof ParameterizedType) {
				ParameterizedType paramType = (ParameterizedType) objType;
				// Give the TypeDefinition that references the ParameterizedType
				GenericTypeDefinition refObj = paramType.getTypeDefinition();
				if (refObj instanceof ClassDefinition) {
					// If the referenced ClassDefinition is the same than the current
					// => this ParameterizedType must be deleted
					if (theClassDef == ((ClassDefinition) refObj)) {
						deletelist.add(paramType);
						
						// Get the container of the ParametizedType
						// and if it is an instance of Property, then
						// it will be deleted because it is the case
						// when we delete a property/reference
						if(paramType.eContainer() instanceof Property) {
							deletelist.add(paramType.eContainer());
						}
					}
				}
			}
		}

		return deletelist;
	}
}