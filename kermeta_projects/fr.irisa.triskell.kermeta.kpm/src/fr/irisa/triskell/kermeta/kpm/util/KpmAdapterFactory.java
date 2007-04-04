/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmAdapterFactory.java,v 1.4 2007-04-04 13:43:56 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.util;

import fr.irisa.triskell.kermeta.kpm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage
 * @generated
 */
public class KpmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KpmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KpmPackage.eINSTANCE;
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
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KpmSwitch modelSwitch =
		new KpmSwitch() {
			public Object caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			public Object caseIn(In object) {
				return createInAdapter();
			}
			public Object caseAction(Action object) {
				return createActionAdapter();
			}
			public Object caseOut(Out object) {
				return createOutAdapter();
			}
			public Object caseFilter(Filter object) {
				return createFilterAdapter();
			}
			public Object caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			public Object caseNestedExpression(NestedExpression object) {
				return createNestedExpressionAdapter();
			}
			public Object caseORExpression(ORExpression object) {
				return createORExpressionAdapter();
			}
			public Object caseANDExpression(ANDExpression object) {
				return createANDExpressionAdapter();
			}
			public Object caseFilterExpression(FilterExpression object) {
				return createFilterExpressionAdapter();
			}
			public Object caseTypeFilter(TypeFilter object) {
				return createTypeFilterAdapter();
			}
			public Object caseNameFilter(NameFilter object) {
				return createNameFilterAdapter();
			}
			public Object caseAbstractEntity(AbstractEntity object) {
				return createAbstractEntityAdapter();
			}
			public Object caseType(Type object) {
				return createTypeAdapter();
			}
			public Object caseNullExpression(NullExpression object) {
				return createNullExpressionAdapter();
			}
			public Object caseEvent(Event object) {
				return createEventAdapter();
			}
			public Object caseSimpleExpression(SimpleExpression object) {
				return createSimpleExpressionAdapter();
			}
			public Object caseKPM(KPM object) {
				return createKPMAdapter();
			}
			public Object caseUnit(Unit object) {
				return createUnitAdapter();
			}
			public Object caseExistFilter(ExistFilter object) {
				return createExistFilterAdapter();
			}
			public Object caseDependencyType(DependencyType object) {
				return createDependencyTypeAdapter();
			}
			public Object caseDependencyEntry(DependencyEntry object) {
				return createDependencyEntryAdapter();
			}
			public Object defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.In <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.In
	 * @generated
	 */
	public Adapter createInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Out <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Out
	 * @generated
	 */
	public Adapter createOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.NestedExpression <em>Nested Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.NestedExpression
	 * @generated
	 */
	public Adapter createNestedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.ORExpression <em>OR Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.ORExpression
	 * @generated
	 */
	public Adapter createORExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.ANDExpression <em>AND Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.ANDExpression
	 * @generated
	 */
	public Adapter createANDExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.FilterExpression <em>Filter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.FilterExpression
	 * @generated
	 */
	public Adapter createFilterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.TypeFilter <em>Type Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.TypeFilter
	 * @generated
	 */
	public Adapter createTypeFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.NameFilter <em>Name Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.NameFilter
	 * @generated
	 */
	public Adapter createNameFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.AbstractEntity <em>Abstract Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractEntity
	 * @generated
	 */
	public Adapter createAbstractEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.NullExpression <em>Null Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.NullExpression
	 * @generated
	 */
	public Adapter createNullExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.SimpleExpression <em>Simple Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.SimpleExpression
	 * @generated
	 */
	public Adapter createSimpleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.KPM <em>KPM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM
	 * @generated
	 */
	public Adapter createKPMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.ExistFilter <em>Exist Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.ExistFilter
	 * @generated
	 */
	public Adapter createExistFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.DependencyType
	 * @generated
	 */
	public Adapter createDependencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.triskell.kermeta.kpm.DependencyEntry <em>Dependency Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.triskell.kermeta.kpm.DependencyEntry
	 * @generated
	 */
	public Adapter createDependencyEntryAdapter() {
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

} //KpmAdapterFactory
