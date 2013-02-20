/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore.util;

import fr.tm.elibel.smartqvt.qvt.emof.Element;
import fr.tm.elibel.smartqvt.qvt.emof.NamedElement;
import fr.tm.elibel.smartqvt.qvt.emof.TypedElement;

import fr.tm.elibel.smartqvt.qvt.essentialocl.Variable;

import fr.tm.elibel.smartqvt.qvt.qvtbase.Domain;
import fr.tm.elibel.smartqvt.qvt.qvtbase.Pattern;
import fr.tm.elibel.smartqvt.qvt.qvtbase.Rule;

import fr.tm.elibel.smartqvt.qvt.qvtcore.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage
 * @generated
 */
public class QvtcoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QvtcorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QvtcoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QvtcorePackage.eINSTANCE;
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
	protected QvtcoreSwitch modelSwitch =
		new QvtcoreSwitch() {
			public Object caseArea(Area object) {
				return createAreaAdapter();
			}
			public Object caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			public Object caseBottomPattern(BottomPattern object) {
				return createBottomPatternAdapter();
			}
			public Object caseCoreDomain(CoreDomain object) {
				return createCoreDomainAdapter();
			}
			public Object caseCorePattern(CorePattern object) {
				return createCorePatternAdapter();
			}
			public Object caseEnforcementOperation(EnforcementOperation object) {
				return createEnforcementOperationAdapter();
			}
			public Object caseGuardPattern(GuardPattern object) {
				return createGuardPatternAdapter();
			}
			public Object caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			public Object casePropertyAssignment(PropertyAssignment object) {
				return createPropertyAssignmentAdapter();
			}
			public Object caseRealizedVariable(RealizedVariable object) {
				return createRealizedVariableAdapter();
			}
			public Object caseVariableAssignment(VariableAssignment object) {
				return createVariableAssignmentAdapter();
			}
			public Object caseObject(fr.tm.elibel.smartqvt.qvt.emof.Object object) {
				return createObjectAdapter();
			}
			public Object caseElement(Element object) {
				return createElementAdapter();
			}
			public Object casePattern(Pattern object) {
				return createPatternAdapter();
			}
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object caseDomain(Domain object) {
				return createDomainAdapter();
			}
			public Object caseRule(Rule object) {
				return createRuleAdapter();
			}
			public Object caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			public Object caseVariable(Variable object) {
				return createVariableAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Area
	 * @generated
	 */
	public Adapter createAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern <em>Bottom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern
	 * @generated
	 */
	public Adapter createBottomPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.CoreDomain <em>Core Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.CoreDomain
	 * @generated
	 */
	public Adapter createCoreDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.CorePattern <em>Core Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.CorePattern
	 * @generated
	 */
	public Adapter createCorePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation <em>Enforcement Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation
	 * @generated
	 */
	public Adapter createEnforcementOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.GuardPattern <em>Guard Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.GuardPattern
	 * @generated
	 */
	public Adapter createGuardPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.PropertyAssignment <em>Property Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.PropertyAssignment
	 * @generated
	 */
	public Adapter createPropertyAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable <em>Realized Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable
	 * @generated
	 */
	public Adapter createRealizedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.VariableAssignment
	 * @generated
	 */
	public Adapter createVariableAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.emof.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
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

} //QvtcoreAdapterFactory
