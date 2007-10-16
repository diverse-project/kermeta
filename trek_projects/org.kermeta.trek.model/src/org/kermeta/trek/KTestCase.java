/**
 * <copyright>
 * </copyright>
 *
 * $Id: KTestCase.java,v 1.2 2007-10-16 08:20:33 cfaucher Exp $
 */
package org.kermeta.trek;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KTest Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.trek.KTestCase#getVerifies <em>Verifies</em>}</li>
 *   <li>{@link org.kermeta.trek.KTestCase#getTestCase <em>Test Case</em>}</li>
 *   <li>{@link org.kermeta.trek.KTestCase#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.trek.TrekPackage#getKTestCase()
 * @model
 * @generated
 */
public interface KTestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Verifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verifies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verifies</em>' reference.
	 * @see #setVerifies(KUseCase)
	 * @see org.kermeta.trek.TrekPackage#getKTestCase_Verifies()
	 * @model
	 * @generated
	 */
	KUseCase getVerifies();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KTestCase#getVerifies <em>Verifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verifies</em>' reference.
	 * @see #getVerifies()
	 * @generated
	 */
	void setVerifies(KUseCase value);

	/**
	 * Returns the value of the '<em><b>Test Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Case</em>' attribute.
	 * @see #setTestCase(String)
	 * @see org.kermeta.trek.TrekPackage#getKTestCase_TestCase()
	 * @model required="true"
	 * @generated
	 */
	String getTestCase();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KTestCase#getTestCase <em>Test Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Case</em>' attribute.
	 * @see #getTestCase()
	 * @generated
	 */
	void setTestCase(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see org.kermeta.trek.TrekPackage#getKTestCase_File()
	 * @model required="true"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KTestCase#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

} // KTestCase
