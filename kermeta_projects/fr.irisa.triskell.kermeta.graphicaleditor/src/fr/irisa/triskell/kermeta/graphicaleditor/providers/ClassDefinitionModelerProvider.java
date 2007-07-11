/*******************************************************************************
 * $Id: ClassDefinitionModelerProvider.java,v 1.7 2007-07-11 14:50:45 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.providers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.topcased.modeler.providers.ILabelFeatureProvider;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.util.KermetaCommonUtils;

/**
 * This is the item provider adpater for a
 * {@link fr.irisa.triskell.kermeta.model.ClassDefinition} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class ClassDefinitionModelerProvider extends
		GenericTypeDefinitionModelerProvider implements ILabelFeatureProvider {
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
	 * @generated NOT
	 * fully added
	 */
	public List getDeletePartners(Object object) {
		ArrayList deletelist = new ArrayList();

		ClassDefinition theClassDef = (ClassDefinition) object;

		// Get the types that refer the cuurent ClassDefinition
		for (Iterator itLinks = KermetaCommonUtils
				.getOwnedTypesForTypeDefinitions(theClassDef).iterator(); itLinks
				.hasNext();) {

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
						if (paramType.eContainer() instanceof Property) {
							deletelist.add(paramType.eContainer());
						}
					}
				}
			}
		}

		return deletelist;
	}
}