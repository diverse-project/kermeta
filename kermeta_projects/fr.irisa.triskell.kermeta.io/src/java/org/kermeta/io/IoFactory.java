/**
 * <copyright>
 * </copyright>
 *
 * $Id: IoFactory.java,v 1.2 2007-07-20 15:08:08 ftanguy Exp $
 */
package org.kermeta.io;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.io.IoPackage
 * @generated
 */
public interface IoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoFactory eINSTANCE = org.kermeta.io.impl.IoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Kermeta Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kermeta Unit</em>'.
	 * @generated
	 */
	KermetaUnit createKermetaUnit();

	/**
	 * Returns a new object of class '<em>Kermeta Unit Storer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kermeta Unit Storer</em>'.
	 * @generated
	 */
	KermetaUnitStorer createKermetaUnitStorer();

	/**
	 * Returns a new object of class '<em>Package Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Entry</em>'.
	 * @generated
	 */
	PackageEntry createPackageEntry();

	/**
	 * Returns a new object of class '<em>Error Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Message</em>'.
	 * @generated
	 */
	ErrorMessage createErrorMessage();

	/**
	 * Returns a new object of class '<em>Warning Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warning Message</em>'.
	 * @generated
	 */
	WarningMessage createWarningMessage();

	/**
	 * Returns a new object of class '<em>Parse Error Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parse Error Message</em>'.
	 * @generated
	 */
	ParseErrorMessage createParseErrorMessage();

	/**
	 * Returns a new object of class '<em>Parsing Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parsing Error</em>'.
	 * @generated
	 */
	ParsingError createParsingError();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IoPackage getIoPackage();

} //IoFactory
