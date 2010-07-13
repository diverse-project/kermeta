/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package directives.util;

import directives.*;

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
 * @see directives.DirectivesPackage
 * @generated
 */
public class DirectivesSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DirectivesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectivesSwitch() {
		if (modelPackage == null) {
			modelPackage = DirectivesPackage.eINSTANCE;
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
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
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
			case DirectivesPackage.COMPOSITION_DIRECTIVE: {
				CompositionDirective compositionDirective = (CompositionDirective)theEObject;
				T result = caseCompositionDirective(compositionDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.ELEMENT_DIRECTIVE: {
				ElementDirective elementDirective = (ElementDirective)theEObject;
				T result = caseElementDirective(elementDirective);
				if (result == null) result = caseCompositionDirective(elementDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseUnaryDirective(create);
				if (result == null) result = caseElementDirective(create);
				if (result == null) result = caseCompositionDirective(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.CONCAT: {
				Concat concat = (Concat)theEObject;
				T result = caseConcat(concat);
				if (result == null) result = caseBinaryDirective(concat);
				if (result == null) result = caseElementDirective(concat);
				if (result == null) result = caseCompositionDirective(concat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.CHANGE: {
				Change change = (Change)theEObject;
				T result = caseChange(change);
				if (result == null) result = caseBinaryDirective(change);
				if (result == null) result = caseElementDirective(change);
				if (result == null) result = caseCompositionDirective(change);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.DESTROY: {
				Destroy destroy = (Destroy)theEObject;
				T result = caseDestroy(destroy);
				if (result == null) result = caseUnaryDirective(destroy);
				if (result == null) result = caseElementDirective(destroy);
				if (result == null) result = caseCompositionDirective(destroy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.MERGE: {
				Merge merge = (Merge)theEObject;
				T result = caseMerge(merge);
				if (result == null) result = caseBinaryDirective(merge);
				if (result == null) result = caseElementDirective(merge);
				if (result == null) result = caseCompositionDirective(merge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.SET: {
				Set set = (Set)theEObject;
				T result = caseSet(set);
				if (result == null) result = caseChange(set);
				if (result == null) result = caseBinaryDirective(set);
				if (result == null) result = caseElementDirective(set);
				if (result == null) result = caseCompositionDirective(set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.ADD: {
				Add add = (Add)theEObject;
				T result = caseAdd(add);
				if (result == null) result = caseChange(add);
				if (result == null) result = caseBinaryDirective(add);
				if (result == null) result = caseElementDirective(add);
				if (result == null) result = caseCompositionDirective(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.REMOVE: {
				Remove remove = (Remove)theEObject;
				T result = caseRemove(remove);
				if (result == null) result = caseChange(remove);
				if (result == null) result = caseBinaryDirective(remove);
				if (result == null) result = caseElementDirective(remove);
				if (result == null) result = caseCompositionDirective(remove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.UNARY_DIRECTIVE: {
				UnaryDirective unaryDirective = (UnaryDirective)theEObject;
				T result = caseUnaryDirective(unaryDirective);
				if (result == null) result = caseElementDirective(unaryDirective);
				if (result == null) result = caseCompositionDirective(unaryDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.BINARY_DIRECTIVE: {
				BinaryDirective binaryDirective = (BinaryDirective)theEObject;
				T result = caseBinaryDirective(binaryDirective);
				if (result == null) result = caseElementDirective(binaryDirective);
				if (result == null) result = caseCompositionDirective(binaryDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseElementRef(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseLiteral(stringLiteral);
				if (result == null) result = caseElementRef(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = caseElementRef(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.INTEGER_LITERAL: {
				IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
				T result = caseIntegerLiteral(integerLiteral);
				if (result == null) result = caseLiteral(integerLiteral);
				if (result == null) result = caseElementRef(integerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.VOID_LITERAL: {
				VoidLiteral voidLiteral = (VoidLiteral)theEObject;
				T result = caseVoidLiteral(voidLiteral);
				if (result == null) result = caseLiteral(voidLiteral);
				if (result == null) result = caseElementRef(voidLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.ID_REF: {
				IDRef idRef = (IDRef)theEObject;
				T result = caseIDRef(idRef);
				if (result == null) result = caseObjectRef(idRef);
				if (result == null) result = caseElementRef(idRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.NAME_REF: {
				NameRef nameRef = (NameRef)theEObject;
				T result = caseNameRef(nameRef);
				if (result == null) result = caseObjectRef(nameRef);
				if (result == null) result = caseElementRef(nameRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.ELEMENT_REF: {
				ElementRef elementRef = (ElementRef)theEObject;
				T result = caseElementRef(elementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.META_REF: {
				MetaRef metaRef = (MetaRef)theEObject;
				T result = caseMetaRef(metaRef);
				if (result == null) result = caseElementRef(metaRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.PROP_REF: {
				PropRef propRef = (PropRef)theEObject;
				T result = casePropRef(propRef);
				if (result == null) result = caseElementRef(propRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DirectivesPackage.OBJECT_REF: {
				ObjectRef objectRef = (ObjectRef)theEObject;
				T result = caseObjectRef(objectRef);
				if (result == null) result = caseElementRef(objectRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionDirective(CompositionDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDirective(ElementDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcat(Concat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChange(Change object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroy(Destroy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerge(Merge object) {
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
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemove(Remove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryDirective(UnaryDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryDirective(BinaryDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidLiteral(VoidLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDRef(IDRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameRef(NameRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementRef(ElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaRef(MetaRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prop Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prop Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropRef(PropRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectRef(ObjectRef object) {
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

} //DirectivesSwitch
