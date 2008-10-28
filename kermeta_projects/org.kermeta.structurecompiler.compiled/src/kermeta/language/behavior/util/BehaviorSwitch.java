/**
 * <copyright>
 * </copyright>
 *
 * $Id: BehaviorSwitch.java,v 1.6 2008-10-28 13:18:40 cfaucher Exp $
 */
package kermeta.language.behavior.util;

import java.util.List;

import kermeta.language.behavior.*;

import kermeta.language.structure.MultiplicityElement;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.TypeContainer;
import kermeta.language.structure.TypedElement;

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
 * @see kermeta.language.behavior.BehaviorPackage
 * @generated
 */
public class BehaviorSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviorPackage.eINSTANCE;
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
		case BehaviorPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = caseExpression(block);
			if (result == null)
				result = caseTypeContainer(block);
			if (result == null)
				result = caseObject(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.RESCUE: {
			Rescue rescue = (Rescue) theEObject;
			T result = caseRescue(rescue);
			if (result == null)
				result = caseObject(rescue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseTypeContainer(expression);
			if (result == null)
				result = caseObject(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.CALL_VARIABLE: {
			CallVariable callVariable = (CallVariable) theEObject;
			T result = caseCallVariable(callVariable);
			if (result == null)
				result = caseCallExpression(callVariable);
			if (result == null)
				result = caseExpression(callVariable);
			if (result == null)
				result = caseTypeContainer(callVariable);
			if (result == null)
				result = caseObject(callVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.CALL_FEATURE: {
			CallFeature callFeature = (CallFeature) theEObject;
			T result = caseCallFeature(callFeature);
			if (result == null)
				result = caseCallExpression(callFeature);
			if (result == null)
				result = caseExpression(callFeature);
			if (result == null)
				result = caseTypeContainer(callFeature);
			if (result == null)
				result = caseObject(callFeature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.CALL_EXPRESSION: {
			CallExpression callExpression = (CallExpression) theEObject;
			T result = caseCallExpression(callExpression);
			if (result == null)
				result = caseExpression(callExpression);
			if (result == null)
				result = caseTypeContainer(callExpression);
			if (result == null)
				result = caseObject(callExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.CALL_SUPER_OPERATION: {
			CallSuperOperation callSuperOperation = (CallSuperOperation) theEObject;
			T result = caseCallSuperOperation(callSuperOperation);
			if (result == null)
				result = caseCallExpression(callSuperOperation);
			if (result == null)
				result = caseExpression(callSuperOperation);
			if (result == null)
				result = caseTypeContainer(callSuperOperation);
			if (result == null)
				result = caseObject(callSuperOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.CALL_RESULT: {
			CallResult callResult = (CallResult) theEObject;
			T result = caseCallResult(callResult);
			if (result == null)
				result = caseCallVariable(callResult);
			if (result == null)
				result = caseCallExpression(callResult);
			if (result == null)
				result = caseExpression(callResult);
			if (result == null)
				result = caseTypeContainer(callResult);
			if (result == null)
				result = caseObject(callResult);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.CALL_VALUE: {
			CallValue callValue = (CallValue) theEObject;
			T result = caseCallValue(callValue);
			if (result == null)
				result = caseCallExpression(callValue);
			if (result == null)
				result = caseExpression(callValue);
			if (result == null)
				result = caseTypeContainer(callValue);
			if (result == null)
				result = caseObject(callValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.ASSIGNMENT: {
			Assignment assignment = (Assignment) theEObject;
			T result = caseAssignment(assignment);
			if (result == null)
				result = caseExpression(assignment);
			if (result == null)
				result = caseTypeContainer(assignment);
			if (result == null)
				result = caseObject(assignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.CONDITIONAL: {
			Conditional conditional = (Conditional) theEObject;
			T result = caseConditional(conditional);
			if (result == null)
				result = caseExpression(conditional);
			if (result == null)
				result = caseTypeContainer(conditional);
			if (result == null)
				result = caseObject(conditional);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.RAISE: {
			Raise raise = (Raise) theEObject;
			T result = caseRaise(raise);
			if (result == null)
				result = caseExpression(raise);
			if (result == null)
				result = caseTypeContainer(raise);
			if (result == null)
				result = caseObject(raise);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.TYPE_REFERENCE: {
			TypeReference typeReference = (TypeReference) theEObject;
			T result = caseTypeReference(typeReference);
			if (result == null)
				result = caseMultiplicityElement(typeReference);
			if (result == null)
				result = caseTypedElement(typeReference);
			if (result == null)
				result = caseTypeContainer(typeReference);
			if (result == null)
				result = caseNamedElement(typeReference);
			if (result == null)
				result = caseObject(typeReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.LITERAL: {
			Literal literal = (Literal) theEObject;
			T result = caseLiteral(literal);
			if (result == null)
				result = caseExpression(literal);
			if (result == null)
				result = caseTypeContainer(literal);
			if (result == null)
				result = caseObject(literal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.EMPTY_EXPRESSION: {
			EmptyExpression emptyExpression = (EmptyExpression) theEObject;
			T result = caseEmptyExpression(emptyExpression);
			if (result == null)
				result = caseExpression(emptyExpression);
			if (result == null)
				result = caseTypeContainer(emptyExpression);
			if (result == null)
				result = caseObject(emptyExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.JAVA_STATIC_CALL: {
			JavaStaticCall javaStaticCall = (JavaStaticCall) theEObject;
			T result = caseJavaStaticCall(javaStaticCall);
			if (result == null)
				result = caseExpression(javaStaticCall);
			if (result == null)
				result = caseTypeContainer(javaStaticCall);
			if (result == null)
				result = caseObject(javaStaticCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.LAMBDA_EXPRESSION: {
			LambdaExpression lambdaExpression = (LambdaExpression) theEObject;
			T result = caseLambdaExpression(lambdaExpression);
			if (result == null)
				result = caseExpression(lambdaExpression);
			if (result == null)
				result = caseTypeContainer(lambdaExpression);
			if (result == null)
				result = caseObject(lambdaExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.LAMBDA_PARAMETER: {
			LambdaParameter lambdaParameter = (LambdaParameter) theEObject;
			T result = caseLambdaParameter(lambdaParameter);
			if (result == null)
				result = caseObject(lambdaParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.INTEGER_LITERAL: {
			IntegerLiteral integerLiteral = (IntegerLiteral) theEObject;
			T result = caseIntegerLiteral(integerLiteral);
			if (result == null)
				result = caseLiteral(integerLiteral);
			if (result == null)
				result = caseExpression(integerLiteral);
			if (result == null)
				result = caseTypeContainer(integerLiteral);
			if (result == null)
				result = caseObject(integerLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.STRING_LITERAL: {
			StringLiteral stringLiteral = (StringLiteral) theEObject;
			T result = caseStringLiteral(stringLiteral);
			if (result == null)
				result = caseLiteral(stringLiteral);
			if (result == null)
				result = caseExpression(stringLiteral);
			if (result == null)
				result = caseTypeContainer(stringLiteral);
			if (result == null)
				result = caseObject(stringLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.BOOLEAN_LITERAL: {
			BooleanLiteral booleanLiteral = (BooleanLiteral) theEObject;
			T result = caseBooleanLiteral(booleanLiteral);
			if (result == null)
				result = caseLiteral(booleanLiteral);
			if (result == null)
				result = caseExpression(booleanLiteral);
			if (result == null)
				result = caseTypeContainer(booleanLiteral);
			if (result == null)
				result = caseObject(booleanLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.TYPE_LITERAL: {
			TypeLiteral typeLiteral = (TypeLiteral) theEObject;
			T result = caseTypeLiteral(typeLiteral);
			if (result == null)
				result = caseLiteral(typeLiteral);
			if (result == null)
				result = caseExpression(typeLiteral);
			if (result == null)
				result = caseTypeContainer(typeLiteral);
			if (result == null)
				result = caseObject(typeLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.VOID_LITERAL: {
			VoidLiteral voidLiteral = (VoidLiteral) theEObject;
			T result = caseVoidLiteral(voidLiteral);
			if (result == null)
				result = caseLiteral(voidLiteral);
			if (result == null)
				result = caseExpression(voidLiteral);
			if (result == null)
				result = caseTypeContainer(voidLiteral);
			if (result == null)
				result = caseObject(voidLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.LOOP: {
			Loop loop = (Loop) theEObject;
			T result = caseLoop(loop);
			if (result == null)
				result = caseExpression(loop);
			if (result == null)
				result = caseTypeContainer(loop);
			if (result == null)
				result = caseObject(loop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.SELF_EXPRESSION: {
			SelfExpression selfExpression = (SelfExpression) theEObject;
			T result = caseSelfExpression(selfExpression);
			if (result == null)
				result = caseExpression(selfExpression);
			if (result == null)
				result = caseTypeContainer(selfExpression);
			if (result == null)
				result = caseObject(selfExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviorPackage.VARIABLE_DECL: {
			VariableDecl variableDecl = (VariableDecl) theEObject;
			T result = caseVariableDecl(variableDecl);
			if (result == null)
				result = caseExpression(variableDecl);
			if (result == null)
				result = caseTypeContainer(variableDecl);
			if (result == null)
				result = caseObject(variableDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rescue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rescue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRescue(Rescue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallVariable(CallVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallFeature(CallFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallExpression(CallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Super Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Super Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallSuperOperation(CallSuperOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallResult(CallResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallValue(CallValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaise(Raise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Empty Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyExpression(EmptyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Static Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Static Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaStaticCall(JavaStaticCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaExpression(LambdaExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaParameter(LambdaParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Type Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLiteral(TypeLiteral object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfExpression(SelfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDecl(VariableDecl object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Type Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeContainer(TypeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
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

} //BehaviorSwitch
