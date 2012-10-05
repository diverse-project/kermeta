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
 * A representation of the model object '<em><b>Reusable Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.ReusableResource#getUrl <em>Url</em>}</li>
 *   <li>{@link org.kermeta.kp.ReusableResource#getAlternateUrls <em>Alternate Urls</em>}</li>
 *   <li>{@link org.kermeta.kp.ReusableResource#getReusableResourceName <em>Reusable Resource Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getReusableResource()
 * @model
 * @generated
 */
public interface ReusableResource extends EObject {
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
   * @see org.kermeta.kp.KpPackage#getReusableResource_Url()
   * @model required="true"
   * @generated
   */
	String getUrl();

	/**
   * Sets the value of the '{@link org.kermeta.kp.ReusableResource#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
	void setUrl(String value);

	/**
   * Returns the value of the '<em><b>Alternate Urls</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternate Urls</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Alternate Urls</em>' attribute list.
   * @see org.kermeta.kp.KpPackage#getReusableResource_AlternateUrls()
   * @model
   * @generated
   */
	EList<String> getAlternateUrls();

	/**
   * Returns the value of the '<em><b>Reusable Resource Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reusable Resource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Reusable Resource Name</em>' attribute.
   * @see #setReusableResourceName(String)
   * @see org.kermeta.kp.KpPackage#getReusableResource_ReusableResourceName()
   * @model required="true"
   * @generated
   */
	String getReusableResourceName();

	/**
   * Sets the value of the '{@link org.kermeta.kp.ReusableResource#getReusableResourceName <em>Reusable Resource Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reusable Resource Name</em>' attribute.
   * @see #getReusableResourceName()
   * @generated
   */
	void setReusableResourceName(String value);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model required="true"
   * @generated
   */
	EList<String> allUrls();

} // ReusableResource
