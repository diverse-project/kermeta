/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.kermeta.art2adaptation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.art2adaptation.Art2adaptationPackage
 * @generated
 */
public class Art2adaptationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Art2adaptationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2adaptationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Art2adaptationPackage.eINSTANCE;
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
	protected Art2adaptationSwitch<Adapter> modelSwitch =
		new Art2adaptationSwitch<Adapter>() {
			@Override
			public Adapter caseAdaptationPrimitive(AdaptationPrimitive object) {
				return createAdaptationPrimitiveAdapter();
			}
			@Override
			public Adapter caseAdaptationModel(AdaptationModel object) {
				return createAdaptationModelAdapter();
			}
			@Override
			public Adapter caseComponentTypeAdaptation(ComponentTypeAdaptation object) {
				return createComponentTypeAdaptationAdapter();
			}
			@Override
			public Adapter caseComponentInstanceAdaptation(ComponentInstanceAdaptation object) {
				return createComponentInstanceAdaptationAdapter();
			}
			@Override
			public Adapter caseAddComponentType(AddComponentType object) {
				return createAddComponentTypeAdapter();
			}
			@Override
			public Adapter caseRemoveComponentType(RemoveComponentType object) {
				return createRemoveComponentTypeAdapter();
			}
			@Override
			public Adapter caseAddComponentInstance(AddComponentInstance object) {
				return createAddComponentInstanceAdapter();
			}
			@Override
			public Adapter caseRemoveComponentInstance(RemoveComponentInstance object) {
				return createRemoveComponentInstanceAdapter();
			}
			@Override
			public Adapter caseThirdPartyAdaptation(ThirdPartyAdaptation object) {
				return createThirdPartyAdaptationAdapter();
			}
			@Override
			public Adapter caseAddThirdParty(AddThirdParty object) {
				return createAddThirdPartyAdapter();
			}
			@Override
			public Adapter caseRemoveThirdParty(RemoveThirdParty object) {
				return createRemoveThirdPartyAdapter();
			}
			@Override
			public Adapter caseBindingAdaptation(BindingAdaptation object) {
				return createBindingAdaptationAdapter();
			}
			@Override
			public Adapter caseAddBinding(AddBinding object) {
				return createAddBindingAdapter();
			}
			@Override
			public Adapter caseRemoveBinding(RemoveBinding object) {
				return createRemoveBindingAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.AdaptationPrimitive <em>Adaptation Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.AdaptationPrimitive
	 * @generated
	 */
	public Adapter createAdaptationPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.AdaptationModel <em>Adaptation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.AdaptationModel
	 * @generated
	 */
	public Adapter createAdaptationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.ComponentTypeAdaptation <em>Component Type Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.ComponentTypeAdaptation
	 * @generated
	 */
	public Adapter createComponentTypeAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.ComponentInstanceAdaptation <em>Component Instance Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.ComponentInstanceAdaptation
	 * @generated
	 */
	public Adapter createComponentInstanceAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.AddComponentType <em>Add Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.AddComponentType
	 * @generated
	 */
	public Adapter createAddComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.RemoveComponentType <em>Remove Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.RemoveComponentType
	 * @generated
	 */
	public Adapter createRemoveComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.AddComponentInstance <em>Add Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.AddComponentInstance
	 * @generated
	 */
	public Adapter createAddComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.RemoveComponentInstance <em>Remove Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.RemoveComponentInstance
	 * @generated
	 */
	public Adapter createRemoveComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.ThirdPartyAdaptation <em>Third Party Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.ThirdPartyAdaptation
	 * @generated
	 */
	public Adapter createThirdPartyAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.AddThirdParty <em>Add Third Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.AddThirdParty
	 * @generated
	 */
	public Adapter createAddThirdPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.RemoveThirdParty <em>Remove Third Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.RemoveThirdParty
	 * @generated
	 */
	public Adapter createRemoveThirdPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.BindingAdaptation <em>Binding Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.BindingAdaptation
	 * @generated
	 */
	public Adapter createBindingAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.AddBinding <em>Add Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.AddBinding
	 * @generated
	 */
	public Adapter createAddBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2adaptation.RemoveBinding <em>Remove Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2adaptation.RemoveBinding
	 * @generated
	 */
	public Adapter createRemoveBindingAdapter() {
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

} //Art2adaptationAdapterFactory
