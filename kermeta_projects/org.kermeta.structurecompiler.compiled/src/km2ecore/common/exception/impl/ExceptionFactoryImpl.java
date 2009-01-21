/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExceptionFactoryImpl.java,v 1.10 2009-01-21 09:16:02 cfaucher Exp $
 */
package km2ecore.common.exception.impl;

import km2ecore.common.exception.*;

import org.eclipse.emf.ecore.EClass;
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
public class ExceptionFactoryImpl extends EFactoryImpl implements
		ExceptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExceptionFactory init() {
		try {
			ExceptionFactory theExceptionFactory = (ExceptionFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.kermeta.org/km2ecore/common/exception/kermeta_temp_uri");
			if (theExceptionFactory != null) {
				return theExceptionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExceptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionFactoryImpl() {
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
		case ExceptionPackage.UNDEFINED_URI_EPACKAGE_EXCEPTION:
			return createUndefinedUriEPackageException();
		case ExceptionPackage.UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION:
			return createUndefinedValueTypeInstanceClassNameException();
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
	public UndefinedUriEPackageException createUndefinedUriEPackageException() {
		UndefinedUriEPackageExceptionImpl undefinedUriEPackageException = new UndefinedUriEPackageExceptionImpl();
		return undefinedUriEPackageException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndefinedValueTypeInstanceClassNameException createUndefinedValueTypeInstanceClassNameException() {
		UndefinedValueTypeInstanceClassNameExceptionImpl undefinedValueTypeInstanceClassNameException = new UndefinedValueTypeInstanceClassNameExceptionImpl();
		return undefinedValueTypeInstanceClassNameException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionPackage getExceptionPackage() {
		return (ExceptionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExceptionPackage getPackage() {
		return ExceptionPackage.eINSTANCE;
	}

} //ExceptionFactoryImpl
