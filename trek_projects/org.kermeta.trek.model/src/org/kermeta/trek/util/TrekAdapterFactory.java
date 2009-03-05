/**
 * <copyright>
 * </copyright>
 *
 * $Id: TrekAdapterFactory.java,v 1.4 2007-11-26 17:04:19 cfaucher Exp $
 */
package org.kermeta.trek.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.kermeta.trek.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.trek.TrekPackage
 * @generated
 */
public class TrekAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TrekPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrekAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TrekPackage.eINSTANCE;
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
	protected TrekSwitch<Adapter> modelSwitch =
		new TrekSwitch<Adapter>() {
			@Override
			public Adapter caseUseKaseModel(UseKaseModel object) {
				return createUseKaseModelAdapter();
			}
			@Override
			public Adapter caseKUseCase(KUseCase object) {
				return createKUseCaseAdapter();
			}
			@Override
			public Adapter caseKTestCase(KTestCase object) {
				return createKTestCaseAdapter();
			}
			@Override
			public Adapter caseKUserStory(KUserStory object) {
				return createKUserStoryAdapter();
			}
			@Override
			public Adapter caseKTagElement(KTagElement object) {
				return createKTagElementAdapter();
			}
			@Override
			public Adapter caseTrekModelElement(TrekModelElement object) {
				return createTrekModelElementAdapter();
			}
			@Override
			public Adapter caseKStatus(KStatus object) {
				return createKStatusAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.kermeta.trek.UseKaseModel <em>Use Kase Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.trek.UseKaseModel
	 * @generated
	 */
	public Adapter createUseKaseModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.trek.KUseCase <em>KUse Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.trek.KUseCase
	 * @generated
	 */
	public Adapter createKUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.trek.KTestCase <em>KTest Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.trek.KTestCase
	 * @generated
	 */
	public Adapter createKTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.trek.KUserStory <em>KUser Story</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.trek.KUserStory
	 * @generated
	 */
	public Adapter createKUserStoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.trek.KTagElement <em>KTag Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.trek.KTagElement
	 * @generated
	 */
	public Adapter createKTagElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.trek.TrekModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.trek.TrekModelElement
	 * @generated
	 */
	public Adapter createTrekModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.trek.KStatus <em>KStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.trek.KStatus
	 * @generated
	 */
	public Adapter createKStatusAdapter() {
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

} //TrekAdapterFactory
