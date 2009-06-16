/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.type;

import art.CardinalityElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.type.Port#getService <em>Service</em>}</li>
 *   <li>{@link art.type.Port#getRole <em>Role</em>}</li>
 *   <li>{@link art.type.Port#getIsOptional <em>Is Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.type.TypePackage#getPort()
 * @model annotation="kermeta ecore='true'"
 * @generated
 */
public interface Port extends CardinalityElement {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see art.type.TypePackage#getPort_Service()
	 * @model required="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link art.type.Port#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see art.type.TypePackage#getPort_Role()
	 * @model dataType="art.String" required="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link art.type.Port#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(Boolean)
	 * @see art.type.TypePackage#getPort_IsOptional()
	 * @model default="true" dataType="art.Boolean"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	Boolean getIsOptional();

	/**
	 * Sets the value of the '{@link art.type.Port#getIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #getIsOptional()
	 * @generated
	 */
	void setIsOptional(Boolean value);

} // Port
