/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: StandardSwitch.java,v 1.12 2009-02-23 15:27:04 cfaucher Exp $
 */
package kermeta.standard.util;

import java.util.List;

import kermeta.standard.Bag;
import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.NotComparableException;
import kermeta.standard.OrderedCollection;
import kermeta.standard.OrderedSet;
import kermeta.standard.Real;
import kermeta.standard.Sequence;
import kermeta.standard.Set;
import kermeta.standard.StandardPackage;
import kermeta.standard.Summable;
import kermeta.standard.UnknownJavaObject;
import kermeta.standard.ValueType;

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
 * @see kermeta.standard.StandardPackage
 * @generated
 */
public class StandardSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StandardPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardSwitch() {
		if (modelPackage == null) {
			modelPackage = StandardPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case StandardPackage.VALUE_TYPE: {
			ValueType valueType = (ValueType) theEObject;
			T result = caseValueType(valueType);
			if (result == null)
				result = caseObject(valueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.COMPARABLE: {
			kermeta.standard.Comparable comparable = (kermeta.standard.Comparable) theEObject;
			T result = caseComparable(comparable);
			if (result == null)
				result = caseObject(comparable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.SUMMABLE: {
			Summable<?> summable = (Summable<?>) theEObject;
			T result = caseSummable(summable);
			if (result == null)
				result = caseObject(summable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.BOOLEAN: {
			kermeta.standard.Boolean boolean_ = (kermeta.standard.Boolean) theEObject;
			T result = caseBoolean(boolean_);
			if (result == null)
				result = caseValueType(boolean_);
			if (result == null)
				result = caseObject(boolean_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.INTEGER: {
			kermeta.standard.Integer integer = (kermeta.standard.Integer) theEObject;
			T result = caseInteger(integer);
			if (result == null)
				result = caseValueType(integer);
			if (result == null)
				result = caseObject(integer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.REAL: {
			Real real = (Real) theEObject;
			T result = caseReal(real);
			if (result == null)
				result = caseValueType(real);
			if (result == null)
				result = caseObject(real);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.CHARACTER: {
			kermeta.standard.Character character = (kermeta.standard.Character) theEObject;
			T result = caseCharacter(character);
			if (result == null)
				result = caseValueType(character);
			if (result == null)
				result = caseObject(character);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.STRING: {
			kermeta.standard.String string = (kermeta.standard.String) theEObject;
			T result = caseString(string);
			if (result == null)
				result = caseValueType(string);
			if (result == null)
				result = caseObject(string);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.COLLECTION: {
			Collection<?> collection = (Collection<?>) theEObject;
			T result = caseCollection(collection);
			if (result == null)
				result = caseObject(collection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.SET: {
			Set<?> set = (Set<?>) theEObject;
			T result = caseSet(set);
			if (result == null)
				result = caseCollection(set);
			if (result == null)
				result = caseObject(set);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.BAG: {
			Bag<?> bag = (Bag<?>) theEObject;
			T result = caseBag(bag);
			if (result == null)
				result = caseCollection(bag);
			if (result == null)
				result = caseObject(bag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.ORDERED_COLLECTION: {
			OrderedCollection<?> orderedCollection = (OrderedCollection<?>) theEObject;
			T result = caseOrderedCollection(orderedCollection);
			if (result == null)
				result = caseCollection(orderedCollection);
			if (result == null)
				result = caseObject(orderedCollection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.ORDERED_SET: {
			OrderedSet<?> orderedSet = (OrderedSet<?>) theEObject;
			T result = caseOrderedSet(orderedSet);
			if (result == null)
				result = caseSet(orderedSet);
			if (result == null)
				result = caseOrderedCollection(orderedSet);
			if (result == null)
				result = caseCollection(orderedSet);
			if (result == null)
				result = caseObject(orderedSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.SEQUENCE: {
			Sequence<?> sequence = (Sequence<?>) theEObject;
			T result = caseSequence(sequence);
			if (result == null)
				result = caseBag(sequence);
			if (result == null)
				result = caseOrderedCollection(sequence);
			if (result == null)
				result = caseCollection(sequence);
			if (result == null)
				result = caseObject(sequence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.ITERATOR: {
			Iterator<?> iterator = (Iterator<?>) theEObject;
			T result = caseIterator(iterator);
			if (result == null)
				result = caseObject(iterator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.VOID: {
			kermeta.standard.Void void_ = (kermeta.standard.Void) theEObject;
			T result = caseVoid(void_);
			if (result == null)
				result = caseObject(void_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.NOT_COMPARABLE_EXCEPTION: {
			NotComparableException notComparableException = (NotComparableException) theEObject;
			T result = caseNotComparableException(notComparableException);
			if (result == null)
				result = caseException(notComparableException);
			if (result == null)
				result = caseObject(notComparableException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StandardPackage.UNKNOWN_JAVA_OBJECT: {
			UnknownJavaObject unknownJavaObject = (UnknownJavaObject) theEObject;
			T result = caseUnknownJavaObject(unknownJavaObject);
			if (result == null)
				result = caseObject(unknownJavaObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparable(kermeta.standard.Comparable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Summable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Summable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <G> T caseSummable(Summable<G> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(kermeta.standard.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(kermeta.standard.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal(Real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter(kermeta.standard.Character object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(kermeta.standard.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <G> T caseCollection(Collection<G> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <G> T caseSet(Set<G> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <G> T caseBag(Bag<G> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <G> T caseOrderedCollection(OrderedCollection<G> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <G> T caseOrderedSet(OrderedSet<G> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <G> T caseSequence(Sequence<G> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <G> T caseIterator(Iterator<G> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoid(kermeta.standard.Void object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Comparable Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Comparable Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotComparableException(NotComparableException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Java Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Java Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownJavaObject(UnknownJavaObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(kermeta.language.structure.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseException(kermeta.exceptions.Exception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //StandardSwitch
