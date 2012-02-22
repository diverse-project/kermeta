/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Equivalence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.PackageEquivalence#getEcorePackage <em>Ecore Package</em>}</li>
 *   <li>{@link org.kermeta.kp.PackageEquivalence#getJavaPackage <em>Java Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getPackageEquivalence()
 * @model
 * @generated
 */
public interface PackageEquivalence extends EObject {
	/**
   * Returns the value of the '<em><b>Ecore Package</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ecore Package</em>' attribute.
   * @see #setEcorePackage(String)
   * @see org.kermeta.kp.KpPackage#getPackageEquivalence_EcorePackage()
   * @model required="true"
   * @generated
   */
	String getEcorePackage();

	/**
   * Sets the value of the '{@link org.kermeta.kp.PackageEquivalence#getEcorePackage <em>Ecore Package</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ecore Package</em>' attribute.
   * @see #getEcorePackage()
   * @generated
   */
	void setEcorePackage(String value);

	/**
   * Returns the value of the '<em><b>Java Package</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Java Package</em>' attribute.
   * @see #setJavaPackage(String)
   * @see org.kermeta.kp.KpPackage#getPackageEquivalence_JavaPackage()
   * @model required="true"
   * @generated
   */
	String getJavaPackage();

	/**
   * Sets the value of the '{@link org.kermeta.kp.PackageEquivalence#getJavaPackage <em>Java Package</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Package</em>' attribute.
   * @see #getJavaPackage()
   * @generated
   */
	void setJavaPackage(String value);

} // PackageEquivalence
