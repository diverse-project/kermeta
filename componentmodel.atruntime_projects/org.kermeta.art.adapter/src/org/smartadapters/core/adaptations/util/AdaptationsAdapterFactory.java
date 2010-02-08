/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.smartadapters.core.Adaptation;

import org.smartadapters.core.adaptations.*;

import org.smartadapters.core.setAdaptation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.smartadapters.core.adaptations.AdaptationsPackage
 * @generated
 */
public class AdaptationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdaptationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdaptationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationsSwitch<Adapter> modelSwitch =
		new AdaptationsSwitch<Adapter>() {
			@Override
			public Adapter caseSetruntimeSystem(SetruntimeSystem object) {
				return createSetruntimeSystemAdapter();
			}
			@Override
			public Adapter caseSetruntimeinstanceComponentInstance(SetruntimeinstanceComponentInstance object) {
				return createSetruntimeinstanceComponentInstanceAdapter();
			}
			@Override
			public Adapter caseSetruntimeinstancePrimitiveInstance(SetruntimeinstancePrimitiveInstance object) {
				return createSetruntimeinstancePrimitiveInstanceAdapter();
			}
			@Override
			public Adapter caseSetruntimeinstanceCompositeInstance(SetruntimeinstanceCompositeInstance object) {
				return createSetruntimeinstanceCompositeInstanceAdapter();
			}
			@Override
			public Adapter caseSetruntimeinstanceTransmissionBinding(SetruntimeinstanceTransmissionBinding object) {
				return createSetruntimeinstanceTransmissionBindingAdapter();
			}
			@Override
			public Adapter caseAdaptation(Adaptation object) {
				return createAdaptationAdapter();
			}
			@Override
			public Adapter casesetAdaptation(setAdaptation object) {
				return createsetAdaptationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.smartadapters.core.adaptations.SetruntimeSystem <em>Setruntime System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.smartadapters.core.adaptations.SetruntimeSystem
	 * @generated
	 */
	public Adapter createSetruntimeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance <em>Setruntimeinstance Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance
	 * @generated
	 */
	public Adapter createSetruntimeinstanceComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance <em>Setruntimeinstance Primitive Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance
	 * @generated
	 */
	public Adapter createSetruntimeinstancePrimitiveInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance <em>Setruntimeinstance Composite Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance
	 * @generated
	 */
	public Adapter createSetruntimeinstanceCompositeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding <em>Setruntimeinstance Transmission Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding
	 * @generated
	 */
	public Adapter createSetruntimeinstanceTransmissionBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.smartadapters.core.Adaptation <em>Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.smartadapters.core.Adaptation
	 * @generated
	 */
	public Adapter createAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.smartadapters.core.setAdaptation <em>set Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.smartadapters.core.setAdaptation
	 * @generated
	 */
	public Adapter createsetAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AdaptationsAdapterFactory
