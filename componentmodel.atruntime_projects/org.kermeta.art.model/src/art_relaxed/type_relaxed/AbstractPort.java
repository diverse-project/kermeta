/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.type_relaxed;

import art_relaxed.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.type_relaxed.AbstractPort#getService <em>Service</em>}</li>
 *   <li>{@link art_relaxed.type_relaxed.AbstractPort#getRole <em>Role</em>}</li>
 *   <li>{@link art_relaxed.type_relaxed.AbstractPort#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link art_relaxed.type_relaxed.AbstractPort#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getAbstractPort()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPort extends NamedElement {
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
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getAbstractPort_Service()
	 * @model required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link art_relaxed.type_relaxed.AbstractPort#getService <em>Service</em>}' reference.
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
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getAbstractPort_Role()
	 * @model dataType="art_relaxed.String" required="true"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link art_relaxed.type_relaxed.AbstractPort#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getAbstractPort_Protocol()
	 * @model dataType="art_relaxed.String"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link art_relaxed.type_relaxed.AbstractPort#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

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
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getAbstractPort_Uri()
	 * @model dataType="art_relaxed.String"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link art_relaxed.type_relaxed.AbstractPort#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // AbstractPort
