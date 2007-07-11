/*******************************************************************************
 * $Id: ModelTypeModelerProvider.java,v 1.3 2007-07-11 14:50:45 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.topcased.modeler.providers.ILabelFeatureProvider;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

/**
 * This is the item provider adpater for a {@link fr.irisa.triskell.kermeta.model.ModelType}
 * object.
 * <!-- begin-user-doc --> 
 * <!-- end-user-doc -->
 * @generated
 */

public class ModelTypeModelerProvider extends TypeModelerProvider implements
		ILabelFeatureProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param adapterFactory the adapter factory
	 * 
	 * @generated
	 */
	public ModelTypeModelerProvider(AdapterFactory adapterFactory) {
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