/**
 * <copyright>
 * </copyright>
 *
 * $Id: KTestCase.java,v 1.4 2007-11-26 17:04:18 cfaucher Exp $
 */
package org.kermeta.trek;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KTest Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.trek.KTestCase#getVerifies <em>Verifies</em>}</li>
 *   <li>{@link org.kermeta.trek.KTestCase#getUri <em>Uri</em>}</li>
 *   <li>{@link org.kermeta.trek.KTestCase#getType <em>Type</em>}</li>
 *   <li>{@link org.kermeta.trek.KTestCase#getResultId <em>Result Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.trek.TrekPackage#getKTestCase()
 * @model
 * @generated
 */
public interface KTestCase extends TrekModelElement {
	/**
	 * Returns the value of the '<em><b>Verifies</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.trek.KUseCase}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.trek.KUseCase#getVerifiedBy <em>Verified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verifies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verifies</em>' reference list.
	 * @see org.kermeta.trek.TrekPackage#getKTestCase_Verifies()
	 * @see org.kermeta.trek.KUseCase#getVerifiedBy
	 * @model opposite="verifiedBy"
	 * @generated
	 */
	EList<KUseCase> getVerifies();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.kermeta.trek.TrekPackage#getKTestCase_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KTestCase#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.kermeta.trek.KTestCaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.kermeta.trek.KTestCaseType
	 * @see #setType(KTestCaseType)
	 * @see org.kermeta.trek.TrekPackage#getKTestCase_Type()
	 * @model
	 * @generated
	 */
	KTestCaseType getType();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KTestCase#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.kermeta.trek.KTestCaseType
	 * @see #getType()
	 * @generated
	 */
	void setType(KTestCaseType value);

	/**
	 * Returns the value of the '<em><b>Result Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Id</em>' attribute.
	 * @see #setResultId(String)
	 * @see org.kermeta.trek.TrekPackage#getKTestCase_ResultId()
	 * @model
	 * @generated
	 */
	String getResultId();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KTestCase#getResultId <em>Result Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Id</em>' attribute.
	 * @see #getResultId()
	 * @generated
	 */
	void setResultId(String value);

} // KTestCase
