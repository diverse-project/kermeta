/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExceptionsAdapterFactory.java,v 1.1 2008-09-04 15:40:34 cfaucher Exp $
 */
package kermeta.exceptions.util;

import kermeta.exceptions.AbstractClassInstantiationError;
import kermeta.exceptions.CallOnVoidTarget;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.exceptions.ExceptionsPackage
 * @generated
 */
public class ExceptionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExceptionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExceptionsPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionsSwitch<Adapter> modelSwitch = new ExceptionsSwitch<Adapter>() {
		@Override
		public Adapter caseException(kermeta.exceptions.Exception object) {
			return createExceptionAdapter();
		}

		@Override
		public Adapter caseRuntimeError(RuntimeError object) {
			return createRuntimeErrorAdapter();
		}

		@Override
		public Adapter caseCallOnVoidTarget(CallOnVoidTarget object) {
			return createCallOnVoidTargetAdapter();
		}

		@Override
		public Adapter caseTypeCastError(TypeCastError object) {
			return createTypeCastErrorAdapter();
		}

		@Override
		public Adapter caseNotImplementedException(
				NotImplementedException object) {
			return createNotImplementedExceptionAdapter();
		}

		@Override
		public Adapter caseUpperBoundReachedError(UpperBoundReachedError object) {
			return createUpperBoundReachedErrorAdapter();
		}

		@Override
		public Adapter caseAbstractClassInstantiationError(
				AbstractClassInstantiationError object) {
			return createAbstractClassInstantiationErrorAdapter();
		}

		@Override
		public Adapter caseIncompatibleTypeError(IncompatibleTypeError object) {
			return createIncompatibleTypeErrorAdapter();
		}

		@Override
		public Adapter caseDivisionByZero(DivisionByZero object) {
			return createDivisionByZeroAdapter();
		}

		@Override
		public Adapter caseOverflowError(OverflowError object) {
			return createOverflowErrorAdapter();
		}

		@Override
		public Adapter caseVoidOperandError(VoidOperandError object) {
			return createVoidOperandErrorAdapter();
		}

		@Override
		public Adapter caseStringIndexOutOfBound(StringIndexOutOfBound object) {
			return createStringIndexOutOfBoundAdapter();
		}

		@Override
		public Adapter caseStringFormatException(StringFormatException object) {
			return createStringFormatExceptionAdapter();
		}

		@Override
		public Adapter caseIndexOutOfBound(IndexOutOfBound object) {
			return createIndexOutOfBoundAdapter();
		}

		@Override
		public Adapter caseEmptyCollection(EmptyCollection object) {
			return createEmptyCollectionAdapter();
		}

		@Override
		public Adapter caseIteratorIsOff(IteratorIsOff object) {
			return createIteratorIsOffAdapter();
		}

		@Override
		public Adapter caseIOException(IOException object) {
			return createIOExceptionAdapter();
		}

		@Override
		public Adapter caseFileNotFoundException(FileNotFoundException object) {
			return createFileNotFoundExceptionAdapter();
		}

		@Override
		public Adapter caseConstraintViolatedPre(ConstraintViolatedPre object) {
			return createConstraintViolatedPreAdapter();
		}

		@Override
		public Adapter caseConstraintViolatedPost(ConstraintViolatedPost object) {
			return createConstraintViolatedPostAdapter();
		}

		@Override
		public Adapter caseConstraintViolatedInv(ConstraintViolatedInv object) {
			return createConstraintViolatedInvAdapter();
		}

		@Override
		public Adapter caseResourceLoadException(ResourceLoadException object) {
			return createResourceLoadExceptionAdapter();
		}

		@Override
		public Adapter caseResourceSaveException(ResourceSaveException object) {
			return createResourceSaveExceptionAdapter();
		}

		@Override
		public Adapter caseResourceMixedLevelsException(
				ResourceMixedLevelsException object) {
			return createResourceMixedLevelsExceptionAdapter();
		}

		@Override
		public Adapter caseResourceCreateException(
				ResourceCreateException object) {
			return createResourceCreateExceptionAdapter();
		}

		@Override
		public Adapter caseResourceUnconformityException(
				ResourceUnconformityException object) {
			return createResourceUnconformityExceptionAdapter();
		}

		@Override
		public Adapter caseUnregisteredMetamodelException(
				UnregisteredMetamodelException object) {
			return createUnregisteredMetamodelExceptionAdapter();
		}

		@Override
		public Adapter caseDynamicExpressionException(
				DynamicExpressionException object) {
			return createDynamicExpressionExceptionAdapter();
		}

		@Override
		public Adapter caseObject(kermeta.language.structure.Object object) {
			return createObjectAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.RuntimeError <em>Runtime Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.RuntimeError
	 * @generated
	 */
	public Adapter createRuntimeErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.CallOnVoidTarget <em>Call On Void Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.CallOnVoidTarget
	 * @generated
	 */
	public Adapter createCallOnVoidTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.TypeCastError <em>Type Cast Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.TypeCastError
	 * @generated
	 */
	public Adapter createTypeCastErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.NotImplementedException <em>Not Implemented Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.NotImplementedException
	 * @generated
	 */
	public Adapter createNotImplementedExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.UpperBoundReachedError <em>Upper Bound Reached Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.UpperBoundReachedError
	 * @generated
	 */
	public Adapter createUpperBoundReachedErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.AbstractClassInstantiationError <em>Abstract Class Instantiation Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.AbstractClassInstantiationError
	 * @generated
	 */
	public Adapter createAbstractClassInstantiationErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.IncompatibleTypeError <em>Incompatible Type Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.IncompatibleTypeError
	 * @generated
	 */
	public Adapter createIncompatibleTypeErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.DivisionByZero <em>Division By Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.DivisionByZero
	 * @generated
	 */
	public Adapter createDivisionByZeroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.OverflowError <em>Overflow Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.OverflowError
	 * @generated
	 */
	public Adapter createOverflowErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.VoidOperandError <em>Void Operand Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.VoidOperandError
	 * @generated
	 */
	public Adapter createVoidOperandErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.StringIndexOutOfBound <em>String Index Out Of Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.StringIndexOutOfBound
	 * @generated
	 */
	public Adapter createStringIndexOutOfBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.StringFormatException <em>String Format Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.StringFormatException
	 * @generated
	 */
	public Adapter createStringFormatExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.IndexOutOfBound <em>Index Out Of Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.IndexOutOfBound
	 * @generated
	 */
	public Adapter createIndexOutOfBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.EmptyCollection <em>Empty Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.EmptyCollection
	 * @generated
	 */
	public Adapter createEmptyCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.IteratorIsOff <em>Iterator Is Off</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.IteratorIsOff
	 * @generated
	 */
	public Adapter createIteratorIsOffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.IOException
	 * @generated
	 */
	public Adapter createIOExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.FileNotFoundException <em>File Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.FileNotFoundException
	 * @generated
	 */
	public Adapter createFileNotFoundExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.ConstraintViolatedPre <em>Constraint Violated Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.ConstraintViolatedPre
	 * @generated
	 */
	public Adapter createConstraintViolatedPreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.ConstraintViolatedPost <em>Constraint Violated Post</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.ConstraintViolatedPost
	 * @generated
	 */
	public Adapter createConstraintViolatedPostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.ConstraintViolatedInv <em>Constraint Violated Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.ConstraintViolatedInv
	 * @generated
	 */
	public Adapter createConstraintViolatedInvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.ResourceLoadException <em>Resource Load Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.ResourceLoadException
	 * @generated
	 */
	public Adapter createResourceLoadExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.ResourceSaveException <em>Resource Save Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.ResourceSaveException
	 * @generated
	 */
	public Adapter createResourceSaveExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.ResourceMixedLevelsException <em>Resource Mixed Levels Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.ResourceMixedLevelsException
	 * @generated
	 */
	public Adapter createResourceMixedLevelsExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.ResourceCreateException <em>Resource Create Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.ResourceCreateException
	 * @generated
	 */
	public Adapter createResourceCreateExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.ResourceUnconformityException <em>Resource Unconformity Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.ResourceUnconformityException
	 * @generated
	 */
	public Adapter createResourceUnconformityExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.UnregisteredMetamodelException <em>Unregistered Metamodel Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.UnregisteredMetamodelException
	 * @generated
	 */
	public Adapter createUnregisteredMetamodelExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.exceptions.DynamicExpressionException <em>Dynamic Expression Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.exceptions.DynamicExpressionException
	 * @generated
	 */
	public Adapter createDynamicExpressionExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kermeta.language.structure.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kermeta.language.structure.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
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

} //ExceptionsAdapterFactory
