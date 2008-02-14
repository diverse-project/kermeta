/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoaderFactory.java,v 1.2 2008-02-14 07:12:49 uid21732 Exp $
 */
package org.kermeta.io.loader;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.io.loader.LoaderPackage
 * @generated
 */
public interface LoaderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoaderFactory eINSTANCE = org.kermeta.io.loader.impl.LoaderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Loading Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loading Step</em>'.
	 * @generated
	 */
	LoadingStep createLoadingStep();

	/**
	 * Returns a new object of class '<em>KMT Loader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KMT Loader</em>'.
	 * @generated
	 */
	KMTLoader createKMTLoader();

	/**
	 * Returns a new object of class '<em>Ecore Loader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Loader</em>'.
	 * @generated
	 */
	EcoreLoader createEcoreLoader();

	/**
	 * Returns a new object of class '<em>KM Loader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KM Loader</em>'.
	 * @generated
	 */
	KMLoader createKMLoader();

	/**
	 * Returns a new object of class '<em>Loading Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loading Context</em>'.
	 * @generated
	 */
	LoadingContext createLoadingContext();

	/**
	 * Returns a new object of class '<em>Abstract Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Step</em>'.
	 * @generated
	 */
	AbstractStep createAbstractStep();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LoaderPackage getLoaderPackage();

} //LoaderFactory
