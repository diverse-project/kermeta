/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExceptionsFactoryImpl.java,v 1.5 2008-10-16 13:17:27 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.AbstractClassInstantiationError;
import kermeta.exceptions.CallOnVoidTarget;
import kermeta.exceptions.ConstraintViolatedException;
import kermeta.exceptions.ConstraintViolatedInv;
import kermeta.exceptions.ConstraintViolatedPost;
import kermeta.exceptions.ConstraintViolatedPre;
import kermeta.exceptions.DivisionByZero;
import kermeta.exceptions.DynamicExpressionException;
import kermeta.exceptions.EmptyCollection;
import kermeta.exceptions.ExceptionsFactory;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExceptionsFactoryImpl extends EFactoryImpl implements
		ExceptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExceptionsFactory init() {
		try {
			ExceptionsFactory theExceptionsFactory = (ExceptionsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.kermeta.org/kermeta/1_2_0//kermeta/exceptions/kermeta_temp_uri");
			if (theExceptionsFactory != null) {
				return theExceptionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExceptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ExceptionsPackage.EXCEPTION:
			return createException();
		case ExceptionsPackage.RUNTIME_ERROR:
			return createRuntimeError();
		case ExceptionsPackage.CALL_ON_VOID_TARGET:
			return createCallOnVoidTarget();
		case ExceptionsPackage.TYPE_CAST_ERROR:
			return createTypeCastError();
		case ExceptionsPackage.NOT_IMPLEMENTED_EXCEPTION:
			return createNotImplementedException();
		case ExceptionsPackage.UPPER_BOUND_REACHED_ERROR:
			return createUpperBoundReachedError();
		case ExceptionsPackage.ABSTRACT_CLASS_INSTANTIATION_ERROR:
			return createAbstractClassInstantiationError();
		case ExceptionsPackage.INCOMPATIBLE_TYPE_ERROR:
			return createIncompatibleTypeError();
		case ExceptionsPackage.DIVISION_BY_ZERO:
			return createDivisionByZero();
		case ExceptionsPackage.OVERFLOW_ERROR:
			return createOverflowError();
		case ExceptionsPackage.VOID_OPERAND_ERROR:
			return createVoidOperandError();
		case ExceptionsPackage.STRING_INDEX_OUT_OF_BOUND:
			return createStringIndexOutOfBound();
		case ExceptionsPackage.STRING_FORMAT_EXCEPTION:
			return createStringFormatException();
		case ExceptionsPackage.INDEX_OUT_OF_BOUND:
			return createIndexOutOfBound();
		case ExceptionsPackage.EMPTY_COLLECTION:
			return createEmptyCollection();
		case ExceptionsPackage.ITERATOR_IS_OFF:
			return createIteratorIsOff();
		case ExceptionsPackage.IO_EXCEPTION:
			return createIOException();
		case ExceptionsPackage.FILE_NOT_FOUND_EXCEPTION:
			return createFileNotFoundException();
		case ExceptionsPackage.CONSTRAINT_VIOLATED_EXCEPTION:
			return createConstraintViolatedException();
		case ExceptionsPackage.CONSTRAINT_VIOLATED_PRE:
			return createConstraintViolatedPre();
		case ExceptionsPackage.CONSTRAINT_VIOLATED_POST:
			return createConstraintViolatedPost();
		case ExceptionsPackage.CONSTRAINT_VIOLATED_INV:
			return createConstraintViolatedInv();
		case ExceptionsPackage.RESOURCE_LOAD_EXCEPTION:
			return createResourceLoadException();
		case ExceptionsPackage.RESOURCE_SAVE_EXCEPTION:
			return createResourceSaveException();
		case ExceptionsPackage.RESOURCE_MIXED_LEVELS_EXCEPTION:
			return createResourceMixedLevelsException();
		case ExceptionsPackage.RESOURCE_CREATE_EXCEPTION:
			return createResourceCreateException();
		case ExceptionsPackage.RESOURCE_UNCONFORMITY_EXCEPTION:
			return createResourceUnconformityException();
		case ExceptionsPackage.UNREGISTERED_METAMODEL_EXCEPTION:
			return createUnregisteredMetamodelException();
		case ExceptionsPackage.DYNAMIC_EXPRESSION_EXCEPTION:
			return createDynamicExpressionException();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.exceptions.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeError createRuntimeError() {
		RuntimeErrorImpl runtimeError = new RuntimeErrorImpl();
		return runtimeError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOnVoidTarget createCallOnVoidTarget() {
		CallOnVoidTargetImpl callOnVoidTarget = new CallOnVoidTargetImpl();
		return callOnVoidTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCastError createTypeCastError() {
		TypeCastErrorImpl typeCastError = new TypeCastErrorImpl();
		return typeCastError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotImplementedException createNotImplementedException() {
		NotImplementedExceptionImpl notImplementedException = new NotImplementedExceptionImpl();
		return notImplementedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundReachedError createUpperBoundReachedError() {
		UpperBoundReachedErrorImpl upperBoundReachedError = new UpperBoundReachedErrorImpl();
		return upperBoundReachedError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractClassInstantiationError createAbstractClassInstantiationError() {
		AbstractClassInstantiationErrorImpl abstractClassInstantiationError = new AbstractClassInstantiationErrorImpl();
		return abstractClassInstantiationError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncompatibleTypeError createIncompatibleTypeError() {
		IncompatibleTypeErrorImpl incompatibleTypeError = new IncompatibleTypeErrorImpl();
		return incompatibleTypeError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionByZero createDivisionByZero() {
		DivisionByZeroImpl divisionByZero = new DivisionByZeroImpl();
		return divisionByZero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverflowError createOverflowError() {
		OverflowErrorImpl overflowError = new OverflowErrorImpl();
		return overflowError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidOperandError createVoidOperandError() {
		VoidOperandErrorImpl voidOperandError = new VoidOperandErrorImpl();
		return voidOperandError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringIndexOutOfBound createStringIndexOutOfBound() {
		StringIndexOutOfBoundImpl stringIndexOutOfBound = new StringIndexOutOfBoundImpl();
		return stringIndexOutOfBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringFormatException createStringFormatException() {
		StringFormatExceptionImpl stringFormatException = new StringFormatExceptionImpl();
		return stringFormatException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexOutOfBound createIndexOutOfBound() {
		IndexOutOfBoundImpl indexOutOfBound = new IndexOutOfBoundImpl();
		return indexOutOfBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyCollection createEmptyCollection() {
		EmptyCollectionImpl emptyCollection = new EmptyCollectionImpl();
		return emptyCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorIsOff createIteratorIsOff() {
		IteratorIsOffImpl iteratorIsOff = new IteratorIsOffImpl();
		return iteratorIsOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createIOException() {
		IOExceptionImpl ioException = new IOExceptionImpl();
		return ioException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNotFoundException createFileNotFoundException() {
		FileNotFoundExceptionImpl fileNotFoundException = new FileNotFoundExceptionImpl();
		return fileNotFoundException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintViolatedException createConstraintViolatedException() {
		ConstraintViolatedExceptionImpl constraintViolatedException = new ConstraintViolatedExceptionImpl();
		return constraintViolatedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintViolatedPre createConstraintViolatedPre() {
		ConstraintViolatedPreImpl constraintViolatedPre = new ConstraintViolatedPreImpl();
		return constraintViolatedPre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintViolatedPost createConstraintViolatedPost() {
		ConstraintViolatedPostImpl constraintViolatedPost = new ConstraintViolatedPostImpl();
		return constraintViolatedPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintViolatedInv createConstraintViolatedInv() {
		ConstraintViolatedInvImpl constraintViolatedInv = new ConstraintViolatedInvImpl();
		return constraintViolatedInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLoadException createResourceLoadException() {
		ResourceLoadExceptionImpl resourceLoadException = new ResourceLoadExceptionImpl();
		return resourceLoadException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSaveException createResourceSaveException() {
		ResourceSaveExceptionImpl resourceSaveException = new ResourceSaveExceptionImpl();
		return resourceSaveException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceMixedLevelsException createResourceMixedLevelsException() {
		ResourceMixedLevelsExceptionImpl resourceMixedLevelsException = new ResourceMixedLevelsExceptionImpl();
		return resourceMixedLevelsException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCreateException createResourceCreateException() {
		ResourceCreateExceptionImpl resourceCreateException = new ResourceCreateExceptionImpl();
		return resourceCreateException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceUnconformityException createResourceUnconformityException() {
		ResourceUnconformityExceptionImpl resourceUnconformityException = new ResourceUnconformityExceptionImpl();
		return resourceUnconformityException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnregisteredMetamodelException createUnregisteredMetamodelException() {
		UnregisteredMetamodelExceptionImpl unregisteredMetamodelException = new UnregisteredMetamodelExceptionImpl();
		return unregisteredMetamodelException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicExpressionException createDynamicExpressionException() {
		DynamicExpressionExceptionImpl dynamicExpressionException = new DynamicExpressionExceptionImpl();
		return dynamicExpressionException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionsPackage getExceptionsPackage() {
		return (ExceptionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExceptionsPackage getPackage() {
		return ExceptionsPackage.eINSTANCE;
	}

} //ExceptionsFactoryImpl
