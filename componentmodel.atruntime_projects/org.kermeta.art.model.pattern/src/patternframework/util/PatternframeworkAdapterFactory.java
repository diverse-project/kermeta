/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patternframework.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import patternframework.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see patternframework.PatternframeworkPackage
 * @generated
 */
public class PatternframeworkAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternframeworkPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternframeworkAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PatternframeworkPackage.eINSTANCE;
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
	protected PatternframeworkSwitch<Adapter> modelSwitch =
		new PatternframeworkSwitch<Adapter>() {
			@Override
			public Adapter caseModelPattern(ModelPattern object) {
				return createModelPatternAdapter();
			}
			@Override
			public Adapter casePModel(PModel object) {
				return createPModelAdapter();
			}
			@Override
			public Adapter casePObject(PObject object) {
				return createPObjectAdapter();
			}
			@Override
			public Adapter casePConstraint(PConstraint object) {
				return createPConstraintAdapter();
			}
			@Override
			public Adapter casePRole(PRole object) {
				return createPRoleAdapter();
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
	 * Creates a new adapter for an object of class '{@link patternframework.ModelPattern <em>Model Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternframework.ModelPattern
	 * @generated
	 */
	public Adapter createModelPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternframework.PModel <em>PModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternframework.PModel
	 * @generated
	 */
	public Adapter createPModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternframework.PObject <em>PObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternframework.PObject
	 * @generated
	 */
	public Adapter createPObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternframework.PConstraint <em>PConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternframework.PConstraint
	 * @generated
	 */
	public Adapter createPConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternframework.PRole <em>PRole</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternframework.PRole
	 * @generated
	 */
	public Adapter createPRoleAdapter() {
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

} //PatternframeworkAdapterFactory
