/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.type;

import pattern.art.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.type.AbstractPort#getService <em>Service</em>}</li>
 *   <li>{@link pattern.art.type.AbstractPort#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.type.TypePackage#getAbstractPort()
 * @model
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
	 * @see pattern.art.type.TypePackage#getAbstractPort_Service()
	 * @model
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link pattern.art.type.AbstractPort#getService <em>Service</em>}' reference.
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
	 * @see pattern.art.type.TypePackage#getAbstractPort_Role()
	 * @model dataType="pattern.art.String"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link pattern.art.type.AbstractPort#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

} // AbstractPort
