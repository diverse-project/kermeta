/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExceptionsSwitch.java,v 1.10 2009-01-21 09:15:56 cfaucher Exp $
 */
package kermeta.exceptions.util;

import java.util.List;

import kermeta.exceptions.AbstractClassInstantiationError;
import kermeta.exceptions.CallOnVoidTarget;
import kermeta.exceptions.ConstraintViolatedException;
import kermeta.exceptions.ConstraintViolatedInv;
import kermeta.exceptions.ConstraintViolatedPost;
import kermeta.exceptions.ConstraintViolatedPre;
import kermeta.exceptions.DivisionByZero;
import kermeta.exceptions.DynamicExpressionException;
import kermeta.exceptions.EmptyCollection;
import kermeta.exceptions.ExceptionsPackage;
import kermeta.exceptions.FileNotFoundException;
import kermeta.exceptions.IOException;
import kermeta.exceptions.IncompatibleTypeError;
import kermeta.exceptions.IndexOutOfBound;
import kermeta.exceptions.IteratorIsOff;
import kermeta.exceptions.NotImplementedException;
import kermeta.exceptions.OverflowError;
import kermeta.exceptions.ResourceCreateException;
import kermeta.exceptions.ResourceLoadException;
import kermeta.exceptions.ResourceMixedLevelsException;
import kermeta.exceptions.ResourceSaveException;
import kermeta.exceptions.ResourceUnconformityException;
import kermeta.exceptions.RuntimeError;
import kermeta.exceptions.StringFormatException;
import kermeta.exceptions.StringIndexOutOfBound;
import kermeta.exceptions.TypeCastError;
import kermeta.exceptions.UnregisteredMetamodelException;
import kermeta.exceptions.UpperBoundReachedError;
import kermeta.exceptions.VoidOperandError;

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
 * @see kermeta.exceptions.ExceptionsPackage
 * @generated
 */
public class ExceptionsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExceptionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ExceptionsPackage.eINSTANCE;
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
		case ExceptionsPackage.EXCEPTION: {
			kermeta.exceptions.Exception exception = (kermeta.exceptions.Exception) theEObject;
			T result = caseException(exception);
			if (result == null)
				result = caseObject(exception);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.RUNTIME_ERROR: {
			RuntimeError runtimeError = (RuntimeError) theEObject;
			T result = caseRuntimeError(runtimeError);
			if (result == null)
				result = caseException(runtimeError);
			if (result == null)
				result = caseObject(runtimeError);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.CALL_ON_VOID_TARGET: {
			CallOnVoidTarget callOnVoidTarget = (CallOnVoidTarget) theEObject;
			T result = caseCallOnVoidTarget(callOnVoidTarget);
			if (result == null)
				result = caseRuntimeError(callOnVoidTarget);
			if (result == null)
				result = caseException(callOnVoidTarget);
			if (result == null)
				result = caseObject(callOnVoidTarget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.TYPE_CAST_ERROR: {
			TypeCastError typeCastError = (TypeCastError) theEObject;
			T result = caseTypeCastError(typeCastError);
			if (result == null)
				result = caseRuntimeError(typeCastError);
			if (result == null)
				result = caseException(typeCastError);
			if (result == null)
				result = caseObject(typeCastError);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.NOT_IMPLEMENTED_EXCEPTION: {
			NotImplementedException notImplementedException = (NotImplementedException) theEObject;
			T result = caseNotImplementedException(notImplementedException);
			if (result == null)
				result = caseRuntimeError(notImplementedException);
			if (result == null)
				result = caseException(notImplementedException);
			if (result == null)
				result = caseObject(notImplementedException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.UPPER_BOUND_REACHED_ERROR: {
			UpperBoundReachedError upperBoundReachedError = (UpperBoundReachedError) theEObject;
			T result = caseUpperBoundReachedError(upperBoundReachedError);
			if (result == null)
				result = caseRuntimeError(upperBoundReachedError);
			if (result == null)
				result = caseException(upperBoundReachedError);
			if (result == null)
				result = caseObject(upperBoundReachedError);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.ABSTRACT_CLASS_INSTANTIATION_ERROR: {
			AbstractClassInstantiationError abstractClassInstantiationError = (AbstractClassInstantiationError) theEObject;
			T result = caseAbstractClassInstantiationError(abstractClassInstantiationError);
			if (result == null)
				result = caseRuntimeError(abstractClassInstantiationError);
			if (result == null)
				result = caseException(abstractClassInstantiationError);
			if (result == null)
				result = caseObject(abstractClassInstantiationError);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.INCOMPATIBLE_TYPE_ERROR: {
			IncompatibleTypeError incompatibleTypeError = (IncompatibleTypeError) theEObject;
			T result = caseIncompatibleTypeError(incompatibleTypeError);
			if (result == null)
				result = caseRuntimeError(incompatibleTypeError);
			if (result == null)
				result = caseException(incompatibleTypeError);
			if (result == null)
				result = caseObject(incompatibleTypeError);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.DIVISION_BY_ZERO: {
			DivisionByZero divisionByZero = (DivisionByZero) theEObject;
			T result = caseDivisionByZero(divisionByZero);
			if (result == null)
				result = caseException(divisionByZero);
			if (result == null)
				result = caseObject(divisionByZero);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.OVERFLOW_ERROR: {
			OverflowError overflowError = (OverflowError) theEObject;
			T result = caseOverflowError(overflowError);
			if (result == null)
				result = caseException(overflowError);
			if (result == null)
				result = caseObject(overflowError);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.VOID_OPERAND_ERROR: {
			VoidOperandError voidOperandError = (VoidOperandError) theEObject;
			T result = caseVoidOperandError(voidOperandError);
			if (result == null)
				result = caseException(voidOperandError);
			if (result == null)
				result = caseObject(voidOperandError);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.STRING_INDEX_OUT_OF_BOUND: {
			StringIndexOutOfBound stringIndexOutOfBound = (StringIndexOutOfBound) theEObject;
			T result = caseStringIndexOutOfBound(stringIndexOutOfBound);
			if (result == null)
				result = caseException(stringIndexOutOfBound);
			if (result == null)
				result = caseObject(stringIndexOutOfBound);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.STRING_FORMAT_EXCEPTION: {
			StringFormatException stringFormatException = (StringFormatException) theEObject;
			T result = caseStringFormatException(stringFormatException);
			if (result == null)
				result = caseException(stringFormatException);
			if (result == null)
				result = caseObject(stringFormatException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.INDEX_OUT_OF_BOUND: {
			IndexOutOfBound indexOutOfBound = (IndexOutOfBound) theEObject;
			T result = caseIndexOutOfBound(indexOutOfBound);
			if (result == null)
				result = caseException(indexOutOfBound);
			if (result == null)
				result = caseObject(indexOutOfBound);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.EMPTY_COLLECTION: {
			EmptyCollection emptyCollection = (EmptyCollection) theEObject;
			T result = caseEmptyCollection(emptyCollection);
			if (result == null)
				result = caseException(emptyCollection);
			if (result == null)
				result = caseObject(emptyCollection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.ITERATOR_IS_OFF: {
			IteratorIsOff iteratorIsOff = (IteratorIsOff) theEObject;
			T result = caseIteratorIsOff(iteratorIsOff);
			if (result == null)
				result = caseException(iteratorIsOff);
			if (result == null)
				result = caseObject(iteratorIsOff);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.IO_EXCEPTION: {
			IOException ioException = (IOException) theEObject;
			T result = caseIOException(ioException);
			if (result == null)
				result = caseException(ioException);
			if (result == null)
				result = caseObject(ioException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.FILE_NOT_FOUND_EXCEPTION: {
			FileNotFoundException fileNotFoundException = (FileNotFoundException) theEObject;
			T result = caseFileNotFoundException(fileNotFoundException);
			if (result == null)
				result = caseIOException(fileNotFoundException);
			if (result == null)
				result = caseException(fileNotFoundException);
			if (result == null)
				result = caseObject(fileNotFoundException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION: {
			ConstraintViolatedException constraintViolatedException = (ConstraintViolatedException) theEObject;
			T result = caseConstraintViolatedException(constraintViolatedException);
			if (result == null)
				result = caseException(constraintViolatedException);
			if (result == null)
				result = caseObject(constraintViolatedException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.CONSTRAINT_VIOLATED_PRE: {
			ConstraintViolatedPre constraintViolatedPre = (ConstraintViolatedPre) theEObject;
			T result = caseConstraintViolatedPre(constraintViolatedPre);
			if (result == null)
				result = caseConstraintViolatedException(constraintViolatedPre);
			if (result == null)
				result = caseException(constraintViolatedPre);
			if (result == null)
				result = caseObject(constraintViolatedPre);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.CONSTRAINT_VIOLATED_POST: {
			ConstraintViolatedPost constraintViolatedPost = (ConstraintViolatedPost) theEObject;
			T result = caseConstraintViolatedPost(constraintViolatedPost);
			if (result == null)
				result = caseConstraintViolatedException(constraintViolatedPost);
			if (result == null)
				result = caseException(constraintViolatedPost);
			if (result == null)
				result = caseObject(constraintViolatedPost);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.CONSTRAINT_VIOLATED_INV: {
			ConstraintViolatedInv constraintViolatedInv = (ConstraintViolatedInv) theEObject;
			T result = caseConstraintViolatedInv(constraintViolatedInv);
			if (result == null)
				result = caseConstraintViolatedException(constraintViolatedInv);
			if (result == null)
				result = caseException(constraintViolatedInv);
			if (result == null)
				result = caseObject(constraintViolatedInv);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.RESOURCE_LOAD_EXCEPTION: {
			ResourceLoadException resourceLoadException = (ResourceLoadException) theEObject;
			T result = caseResourceLoadException(resourceLoadException);
			if (result == null)
				result = caseException(resourceLoadException);
			if (result == null)
				result = caseObject(resourceLoadException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.RESOURCE_SAVE_EXCEPTION: {
			ResourceSaveException resourceSaveException = (ResourceSaveException) theEObject;
			T result = caseResourceSaveException(resourceSaveException);
			if (result == null)
				result = caseException(resourceSaveException);
			if (result == null)
				result = caseObject(resourceSaveException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.RESOURCE_MIXED_LEVELS_EXCEPTION: {
			ResourceMixedLevelsException resourceMixedLevelsException = (ResourceMixedLevelsException) theEObject;
			T result = caseResourceMixedLevelsException(resourceMixedLevelsException);
			if (result == null)
				result = caseResourceSaveException(resourceMixedLevelsException);
			if (result == null)
				result = caseException(resourceMixedLevelsException);
			if (result == null)
				result = caseObject(resourceMixedLevelsException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.RESOURCE_CREATE_EXCEPTION: {
			ResourceCreateException resourceCreateException = (ResourceCreateException) theEObject;
			T result = caseResourceCreateException(resourceCreateException);
			if (result == null)
				result = caseException(resourceCreateException);
			if (result == null)
				result = caseObject(resourceCreateException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.RESOURCE_UNCONFORMITY_EXCEPTION: {
			ResourceUnconformityException resourceUnconformityException = (ResourceUnconformityException) theEObject;
			T result = caseResourceUnconformityException(resourceUnconformityException);
			if (result == null)
				result = caseException(resourceUnconformityException);
			if (result == null)
				result = caseObject(resourceUnconformityException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.UNREGISTERED_METAMODEL_EXCEPTION: {
			UnregisteredMetamodelException unregisteredMetamodelException = (UnregisteredMetamodelException) theEObject;
			T result = caseUnregisteredMetamodelException(unregisteredMetamodelException);
			if (result == null)
				result = caseException(unregisteredMetamodelException);
			if (result == null)
				result = caseObject(unregisteredMetamodelException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExceptionsPackage.DYNAMIC_EXPRESSION_EXCEPTION: {
			DynamicExpressionException dynamicExpressionException = (DynamicExpressionException) theEObject;
			T result = caseDynamicExpressionException(dynamicExpressionException);
			if (result == null)
				result = caseException(dynamicExpressionException);
			if (result == null)
				result = caseObject(dynamicExpressionException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeError(RuntimeError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call On Void Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call On Void Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallOnVoidTarget(CallOnVoidTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Cast Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Cast Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCastError(TypeCastError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Implemented Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Implemented Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotImplementedException(NotImplementedException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Bound Reached Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Bound Reached Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpperBoundReachedError(UpperBoundReachedError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Class Instantiation Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Class Instantiation Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractClassInstantiationError(
			AbstractClassInstantiationError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incompatible Type Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incompatible Type Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncompatibleTypeError(IncompatibleTypeError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division By Zero</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division By Zero</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivisionByZero(DivisionByZero object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overflow Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overflow Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverflowError(OverflowError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Operand Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Operand Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidOperandError(VoidOperandError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Index Out Of Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Index Out Of Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIndexOutOfBound(StringIndexOutOfBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Format Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Format Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringFormatException(StringFormatException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Out Of Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Out Of Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexOutOfBound(IndexOutOfBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyCollection(EmptyCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Is Off</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Is Off</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorIsOff(IteratorIsOff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOException(IOException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Not Found Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Not Found Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileNotFoundException(FileNotFoundException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Violated Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Violated Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintViolatedException(ConstraintViolatedException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Violated Pre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Violated Pre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintViolatedPre(ConstraintViolatedPre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Violated Post</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Violated Post</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintViolatedPost(ConstraintViolatedPost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Violated Inv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Violated Inv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintViolatedInv(ConstraintViolatedInv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Load Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Load Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceLoadException(ResourceLoadException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Save Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Save Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceSaveException(ResourceSaveException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Mixed Levels Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Mixed Levels Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceMixedLevelsException(
			ResourceMixedLevelsException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Create Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Create Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceCreateException(ResourceCreateException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Unconformity Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Unconformity Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceUnconformityException(
			ResourceUnconformityException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unregistered Metamodel Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unregistered Metamodel Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnregisteredMetamodelException(
			UnregisteredMetamodelException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Expression Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Expression Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicExpressionException(DynamicExpressionException object) {
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

} //ExceptionsSwitch
