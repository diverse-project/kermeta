/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmSwitch.java,v 1.4 2007-04-04 13:43:56 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.util;

import fr.irisa.triskell.kermeta.kpm.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage
 * @generated
 */
public class KpmSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KpmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpmSwitch() {
		if (modelPackage == null) {
			modelPackage = KpmPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case KpmPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				Object result = caseDependency(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.IN: {
				In in = (In)theEObject;
				Object result = caseIn(in);
				if (result == null) result = caseAbstractEntity(in);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.ACTION: {
				Action action = (Action)theEObject;
				Object result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.OUT: {
				Out out = (Out)theEObject;
				Object result = caseOut(out);
				if (result == null) result = caseAbstractEntity(out);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.FILTER: {
				Filter filter = (Filter)theEObject;
				Object result = caseFilter(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				Object result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.NESTED_EXPRESSION: {
				NestedExpression nestedExpression = (NestedExpression)theEObject;
				Object result = caseNestedExpression(nestedExpression);
				if (result == null) result = caseExpression(nestedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.OR_EXPRESSION: {
				ORExpression orExpression = (ORExpression)theEObject;
				Object result = caseORExpression(orExpression);
				if (result == null) result = caseNestedExpression(orExpression);
				if (result == null) result = caseExpression(orExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.AND_EXPRESSION: {
				ANDExpression andExpression = (ANDExpression)theEObject;
				Object result = caseANDExpression(andExpression);
				if (result == null) result = caseNestedExpression(andExpression);
				if (result == null) result = caseExpression(andExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.FILTER_EXPRESSION: {
				FilterExpression filterExpression = (FilterExpression)theEObject;
				Object result = caseFilterExpression(filterExpression);
				if (result == null) result = caseSimpleExpression(filterExpression);
				if (result == null) result = caseExpression(filterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.TYPE_FILTER: {
				TypeFilter typeFilter = (TypeFilter)theEObject;
				Object result = caseTypeFilter(typeFilter);
				if (result == null) result = caseFilter(typeFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.NAME_FILTER: {
				NameFilter nameFilter = (NameFilter)theEObject;
				Object result = caseNameFilter(nameFilter);
				if (result == null) result = caseFilter(nameFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.ABSTRACT_ENTITY: {
				AbstractEntity abstractEntity = (AbstractEntity)theEObject;
				Object result = caseAbstractEntity(abstractEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.TYPE: {
				Type type = (Type)theEObject;
				Object result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.NULL_EXPRESSION: {
				NullExpression nullExpression = (NullExpression)theEObject;
				Object result = caseNullExpression(nullExpression);
				if (result == null) result = caseSimpleExpression(nullExpression);
				if (result == null) result = caseExpression(nullExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.EVENT: {
				Event event = (Event)theEObject;
				Object result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.SIMPLE_EXPRESSION: {
				SimpleExpression simpleExpression = (SimpleExpression)theEObject;
				Object result = caseSimpleExpression(simpleExpression);
				if (result == null) result = caseExpression(simpleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.KPM: {
				KPM kpm = (KPM)theEObject;
				Object result = caseKPM(kpm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				Object result = caseUnit(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.EXIST_FILTER: {
				ExistFilter existFilter = (ExistFilter)theEObject;
				Object result = caseExistFilter(existFilter);
				if (result == null) result = caseFilter(existFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.DEPENDENCY_TYPE: {
				DependencyType dependencyType = (DependencyType)theEObject;
				Object result = caseDependencyType(dependencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KpmPackage.DEPENDENCY_ENTRY: {
				DependencyEntry dependencyEntry = (DependencyEntry)theEObject;
				Object result = caseDependencyEntry(dependencyEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIn(In object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOut(Out object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Nested Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Nested Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNestedExpression(NestedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>OR Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>OR Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseORExpression(ORExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>AND Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>AND Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseANDExpression(ANDExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Filter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Filter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFilterExpression(FilterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeFilter(TypeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Name Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Name Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNameFilter(NameFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractEntity(AbstractEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Null Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Null Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNullExpression(NullExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Simple Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Simple Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimpleExpression(SimpleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>KPM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>KPM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseKPM(KPM object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Exist Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Exist Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExistFilter(ExistFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Dependency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Dependency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDependencyType(DependencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Dependency Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Dependency Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDependencyEntry(DependencyEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //KpmSwitch
