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
   * Returns a new object of class '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency</em>'.
   * @generated
   */
	Dependency createDependency();

	/**
   * Returns a new object of class '<em>Source</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Source</em>'.
   * @generated
   */
	Source createSource();

	/**
   * Returns a new object of class '<em>Weave Directive</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Weave Directive</em>'.
   * @generated
   */
	WeaveDirective createWeaveDirective();

	/**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
	Option createOption();

	/**
   * Returns a new object of class '<em>String Expression</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>String Expression</em>'.
   * @generated
   */
	StringExpression createStringExpression();

	/**
   * Returns a new object of class '<em>Mix Expression</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Mix Expression</em>'.
   * @generated
   */
	MixExpression createMixExpression();

	/**
   * Returns a new object of class '<em>Package Equivalence</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Equivalence</em>'.
   * @generated
   */
	PackageEquivalence createPackageEquivalence();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	KpPackage getKpPackage();

} //KpFactory
