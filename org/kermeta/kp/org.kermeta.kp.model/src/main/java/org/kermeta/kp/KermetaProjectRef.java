/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kermeta Project Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.KermetaProjectRef#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProjectRef#getVersion <em>Version</em>}</li>
 *   <li>{@link org.kermeta.kp.KermetaProjectRef#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getKermetaProjectRef()
 * @model
 * @generated
 */
public interface KermetaProjectRef extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see org.kermeta.kp.KpPackage#getKermetaProjectRef_Group()
	 * @model required="true"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link org.kermeta.kp.KermetaProjectRef#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.kermeta.kp.KpPackage#getKermetaProjectRef_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.kermeta.kp.KermetaProjectRef#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * @see org.kermeta.kp.KpPackage#getKermetaProjectRef_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.kermeta.kp.KermetaProjectRef#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // KermetaProjectRef
