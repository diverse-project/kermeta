/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.ImportFile#getUrl <em>Url</em>}</li>
 *   <li>{@link org.kermeta.kp.ImportFile#getBytecodeFrom <em>Bytecode From</em>}</li>
 *   <li>{@link org.kermeta.kp.ImportFile#getPackageEquivalences <em>Package Equivalences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getImportFile()
 * @model
 * @generated
 */
public interface ImportFile extends EObject {
	/**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.kermeta.kp.KpPackage#getImportFile_Url()
   * @model required="true"
   * @generated
   */
	String getUrl();

	/**
   * Sets the value of the '{@link org.kermeta.kp.ImportFile#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
	void setUrl(String value);

	/**
   * Returns the value of the '<em><b>Bytecode From</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bytecode From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bytecode From</em>' reference.
   * @see #setBytecodeFrom(ReusableResource)
   * @see org.kermeta.kp.KpPackage#getImportFile_BytecodeFrom()
   * @model
   * @generated
   */
	ReusableResource getBytecodeFrom();

	/**
   * Sets the value of the '{@link org.kermeta.kp.ImportFile#getBytecodeFrom <em>Bytecode From</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bytecode From</em>' reference.
   * @see #getBytecodeFrom()
   * @generated
   */
	void setBytecodeFrom(ReusableResource value);

	/**
   * Returns the value of the '<em><b>Package Equivalences</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.kp.PackageEquivalence}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Equivalences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Package Equivalences</em>' containment reference list.
   * @see org.kermeta.kp.KpPackage#getImportFile_PackageEquivalences()
   * @model containment="true"
   * @generated
   */
	EList<PackageEquivalence> getPackageEquivalences();

} // ImportFile
