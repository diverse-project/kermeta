/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.smartadapters.core.adaptations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptationsFactoryImpl extends EFactoryImpl implements AdaptationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdaptationsFactory init() {
		try {
			AdaptationsFactory theAdaptationsFactory = (AdaptationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://SmartAdapters4ART/smartadapters/core/adaptations"); 
			if (theAdaptationsFactory != null) {
				return theAdaptationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdaptationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdaptationsPackage.SETRUNTIME_SYSTEM: return createSetruntimeSystem();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE: return createSetruntimeinstanceComponentInstance();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE: return createSetruntimeinstancePrimitiveInstance();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE: return createSetruntimeinstanceCompositeInstance();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING: return createSetruntimeinstanceTransmissionBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetruntimeSystem createSetruntimeSystem() {
		SetruntimeSystemImpl setruntimeSystem = new SetruntimeSystemImpl();
		return setruntimeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetruntimeinstanceComponentInstance createSetruntimeinstanceComponentInstance() {
		SetruntimeinstanceComponentInstanceImpl setruntimeinstanceComponentInstance = new SetruntimeinstanceComponentInstanceImpl();
		return setruntimeinstanceComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetruntimeinstancePrimitiveInstance createSetruntimeinstancePrimitiveInstance() {
		SetruntimeinstancePrimitiveInstanceImpl setruntimeinstancePrimitiveInstance = new SetruntimeinstancePrimitiveInstanceImpl();
		return setruntimeinstancePrimitiveInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetruntimeinstanceCompositeInstance createSetruntimeinstanceCompositeInstance() {
		SetruntimeinstanceCompositeInstanceImpl setruntimeinstanceCompositeInstance = new SetruntimeinstanceCompositeInstanceImpl();
		return setruntimeinstanceCompositeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetruntimeinstanceTransmissionBinding createSetruntimeinstanceTransmissionBinding() {
		SetruntimeinstanceTransmissionBindingImpl setruntimeinstanceTransmissionBinding = new SetruntimeinstanceTransmissionBindingImpl();
		return setruntimeinstanceTransmissionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationsPackage getAdaptationsPackage() {
		return (AdaptationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdaptationsPackage getPackage() {
		return AdaptationsPackage.eINSTANCE;
	}

} //AdaptationsFactoryImpl
