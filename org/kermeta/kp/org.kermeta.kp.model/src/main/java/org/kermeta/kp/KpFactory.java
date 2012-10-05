/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.kp.KpPackage
 * @generated
 */
public interface KpFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	KpFactory eINSTANCE = org.kermeta.kp.impl.KpFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Kermeta Project</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Kermeta Project</em>'.
   * @generated
   */
	KermetaProject createKermetaProject();

	/**
   * Returns a new object of class '<em>Package Equivalence</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Equivalence</em>'.
   * @generated
   */
	PackageEquivalence createPackageEquivalence();

	/**
   * Returns a new object of class '<em>Metamodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metamodel</em>'.
   * @generated
   */
  Metamodel createMetamodel();

  /**
   * Returns a new object of class '<em>Reusable Resource</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Reusable Resource</em>'.
   * @generated
   */
	ReusableResource createReusableResource();

	/**
   * Returns a new object of class '<em>Import Project Sources</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Project Sources</em>'.
   * @generated
   */
	ImportProjectSources createImportProjectSources();

	/**
   * Returns a new object of class '<em>Import Project Jar</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Project Jar</em>'.
   * @generated
   */
	ImportProjectJar createImportProjectJar();

	/**
   * Returns a new object of class '<em>Import Bytecode Jar</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Bytecode Jar</em>'.
   * @generated
   */
	ImportBytecodeJar createImportBytecodeJar();

	/**
   * Returns a new object of class '<em>Import File</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Import File</em>'.
   * @generated
   */
	ImportFile createImportFile();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	KpPackage getKpPackage();

} //KpFactory
