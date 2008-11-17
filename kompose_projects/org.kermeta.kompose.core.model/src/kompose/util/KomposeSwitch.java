/**
 * <copyright>
 * </copyright>
 *
 * $Id: KomposeSwitch.java,v 1.1.1.1 2008-11-17 15:36:42 mclavreu Exp $
 */
package kompose.util;

import java.util.List;

import kompose.*;

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
 * @see kompose.KomposePackage
 * @generated
 */
public class KomposeSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KomposePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KomposeSwitch() {
		if (modelPackage == null) {
			modelPackage = KomposePackage.eINSTANCE;
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
			case KomposePackage.ELEMENT_DIRECTIVE: {
				ElementDirective elementDirective = (ElementDirective)theEObject;
				Object result = caseElementDirective(elementDirective);
				if (result == null) result = caseCompositionDirective(elementDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.COMPOSITION_DIRECTIVE: {
				CompositionDirective compositionDirective = (CompositionDirective)theEObject;
				Object result = caseCompositionDirective(compositionDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.REMOVE: {
				Remove remove = (Remove)theEObject;
				Object result = caseRemove(remove);
				if (result == null) result = caseChange(remove);
				if (result == null) result = caseElementDirective(remove);
				if (result == null) result = caseCompositionDirective(remove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.ADD: {
				Add add = (Add)theEObject;
				Object result = caseAdd(add);
				if (result == null) result = caseChange(add);
				if (result == null) result = caseElementDirective(add);
				if (result == null) result = caseCompositionDirective(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.CREATE: {
				Create create = (Create)theEObject;
				Object result = caseCreate(create);
				if (result == null) result = caseElementDirective(create);
				if (result == null) result = caseCompositionDirective(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.SET: {
				Set set = (Set)theEObject;
				Object result = caseSet(set);
				if (result == null) result = caseChange(set);
				if (result == null) result = caseElementDirective(set);
				if (result == null) result = caseCompositionDirective(set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.ELEMENT_REF: {
				ElementRef elementRef = (ElementRef)theEObject;
				Object result = caseElementRef(elementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.NAME_REF: {
				NameRef nameRef = (NameRef)theEObject;
				Object result = caseNameRef(nameRef);
				if (result == null) result = caseElementRef(nameRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.ID_REF: {
				IDRef idRef = (IDRef)theEObject;
				Object result = caseIDRef(idRef);
				if (result == null) result = caseElementRef(idRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.CHANGE: {
				Change change = (Change)theEObject;
				Object result = caseChange(change);
				if (result == null) result = caseElementDirective(change);
				if (result == null) result = caseCompositionDirective(change);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				Object result = caseLiteral(literal);
				if (result == null) result = caseElementRef(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				Object result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseLiteral(stringLiteral);
				if (result == null) result = caseElementRef(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				Object result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = caseElementRef(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.INTEGER_LITERAL: {
				IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
				Object result = caseIntegerLiteral(integerLiteral);
				if (result == null) result = caseLiteral(integerLiteral);
				if (result == null) result = caseElementRef(integerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.VOID_LITERAL: {
				VoidLiteral voidLiteral = (VoidLiteral)theEObject;
				Object result = caseVoidLiteral(voidLiteral);
				if (result == null) result = caseLiteral(voidLiteral);
				if (result == null) result = caseElementRef(voidLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.CONTEXT: {
				Context context = (Context)theEObject;
				Object result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.COMPOSER: {
				Composer composer = (Composer)theEObject;
				Object result = caseComposer(composer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KomposePackage.MERGEABLE: {
				Mergeable mergeable = (Mergeable)theEObject;
				Object result = caseMergeable(mergeable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public Object caseElementDirective(ElementDirective object) {
		return null;
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
	public Object caseCompositionDirective(CompositionDirective object) {
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
	public Object caseRemove(Remove object) {
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
	public Object caseAdd(Add object) {
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
	public Object caseCreate(Create object) {
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
	public Object caseSet(Set object) {
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
	public Object caseElementRef(ElementRef object) {
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
	public Object caseNameRef(NameRef object) {
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
	public Object caseIDRef(IDRef object) {
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
	public Object caseChange(Change object) {
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
	public Object caseLiteral(Literal object) {
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
	public Object caseStringLiteral(StringLiteral object) {
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
	public Object caseBooleanLiteral(BooleanLiteral object) {
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
	public Object caseIntegerLiteral(IntegerLiteral object) {
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
	public Object caseVoidLiteral(VoidLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComposer(Composer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mergeable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mergeable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMergeable(Mergeable object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //KomposeSwitch
