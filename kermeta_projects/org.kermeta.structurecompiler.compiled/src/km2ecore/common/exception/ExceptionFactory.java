/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package km2ecore.common.exception;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see km2ecore.common.exception.ExceptionPackage
 * @generated
 */
public interface ExceptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExceptionFactory eINSTANCE = km2ecore.common.exception.impl.ExceptionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Undefined Uri EPackage Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undefined Uri EPackage Exception</em>'.
	 * @generated
	 */
	UndefinedUriEPackageException createUndefinedUriEPackageException();

	/**
	 * Returns a new object of class '<em>Undefined Value Type Instance Class Name Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undefined Value Type Instance Class Name Exception</em>'.
	 * @generated
	 */
	UndefinedValueTypeInstanceClassNameException createUndefinedValueTypeInstanceClassNameException();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExceptionPackage getExceptionPackage();

} //ExceptionFactory
