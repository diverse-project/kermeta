/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import smartadapters4ART.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see smartadapters4ART.Smartadapters4ARTPackage
 * @generated
 */
public class Smartadapters4ARTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Smartadapters4ARTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smartadapters4ARTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Smartadapters4ARTPackage.eINSTANCE;
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
	protected Smartadapters4ARTSwitch<Adapter> modelSwitch =
		new Smartadapters4ARTSwitch<Adapter>() {
			@Override
			public Adapter caseAspect(Aspect object) {
				return createAspectAdapter();
			}
			@Override
			public Adapter caseAdaptation(Adaptation object) {
				return createAdaptationAdapter();
			}
			@Override
			public Adapter caseCloneAdaptation(CloneAdaptation object) {
				return createCloneAdaptationAdapter();
			}
			@Override
			public Adapter caseCreateAdaptation(CreateAdaptation object) {
				return createCreateAdaptationAdapter();
			}
			@Override
			public Adapter caseSetAdaptation(SetAdaptation object) {
				return createSetAdaptationAdapter();
			}
			@Override
			public Adapter caseUnsetAdaptation(UnsetAdaptation object) {
				return createUnsetAdaptationAdapter();
			}
			@Override
			public Adapter caseAdviceModel(AdviceModel object) {
				return createAdviceModelAdapter();
			}
			@Override
			public Adapter casePointcutModel(PointcutModel object) {
				return createPointcutModelAdapter();
			}
			@Override
			public Adapter caseInstantiationStrategy(InstantiationStrategy object) {
				return createInstantiationStrategyAdapter();
			}
			@Override
			public Adapter caseGlobalInstantiation(GlobalInstantiation object) {
				return createGlobalInstantiationAdapter();
			}
			@Override
			public Adapter caseScopedInstantiation(ScopedInstantiation object) {
				return createScopedInstantiationAdapter();
			}
			@Override
			public Adapter casePerRoleMatch(PerRoleMatch object) {
				return createPerRoleMatchAdapter();
			}
			@Override
			public Adapter casePerElementMatch(PerElementMatch object) {
				return createPerElementMatchAdapter();
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
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.Aspect
	 * @generated
	 */
	public Adapter createAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.Adaptation <em>Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.Adaptation
	 * @generated
	 */
	public Adapter createAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.CloneAdaptation <em>Clone Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.CloneAdaptation
	 * @generated
	 */
	public Adapter createCloneAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.CreateAdaptation <em>Create Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.CreateAdaptation
	 * @generated
	 */
	public Adapter createCreateAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.SetAdaptation <em>Set Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.SetAdaptation
	 * @generated
	 */
	public Adapter createSetAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.UnsetAdaptation <em>Unset Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.UnsetAdaptation
	 * @generated
	 */
	public Adapter createUnsetAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.AdviceModel <em>Advice Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.AdviceModel
	 * @generated
	 */
	public Adapter createAdviceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.PointcutModel <em>Pointcut Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.PointcutModel
	 * @generated
	 */
	public Adapter createPointcutModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.InstantiationStrategy <em>Instantiation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.InstantiationStrategy
	 * @generated
	 */
	public Adapter createInstantiationStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.GlobalInstantiation <em>Global Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.GlobalInstantiation
	 * @generated
	 */
	public Adapter createGlobalInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.ScopedInstantiation <em>Scoped Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.ScopedInstantiation
	 * @generated
	 */
	public Adapter createScopedInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.PerRoleMatch <em>Per Role Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.PerRoleMatch
	 * @generated
	 */
	public Adapter createPerRoleMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartadapters4ART.PerElementMatch <em>Per Element Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartadapters4ART.PerElementMatch
	 * @generated
	 */
	public Adapter createPerElementMatchAdapter() {
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

} //Smartadapters4ARTAdapterFactory
