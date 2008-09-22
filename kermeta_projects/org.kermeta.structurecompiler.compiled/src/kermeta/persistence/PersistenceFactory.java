/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceFactory.java,v 1.3 2008-09-22 14:48:27 cfaucher Exp $
 */
package kermeta.persistence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.persistence.PersistencePackage
 * @generated
 */
public interface PersistenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistenceFactory eINSTANCE = kermeta.persistence.impl.PersistenceFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>EMF Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Resource</em>'.
	 * @generated
	 */
	EMFResource createEMFResource();

	/**
	 * Returns a new object of class '<em>Dangling Diagnostic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dangling Diagnostic</em>'.
	 * @generated
	 */
	DanglingDiagnostic createDanglingDiagnostic();

	/**
	 * Returns a new object of class '<em>EMF Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Repository</em>'.
	 * @generated
	 */
	EMFRepository createEMFRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersistencePackage getPersistencePackage();

} //PersistenceFactory
