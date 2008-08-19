/**
 * <copyright>
 * </copyright>
 *
 * $Id: RequireBundle.java,v 1.4 2008-08-19 07:04:45 edaubert Exp $
 */
package manifest;

import option.RequireBundleDirective;

import org.eclipse.emf.common.util.EList;

import framework.Bundle;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Require Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.RequireBundle#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.RequireBundle#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.RequireBundle#getReference <em>Reference</em>}</li>
 *   <li>{@link manifest.RequireBundle#getBundle <em>Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getRequireBundle()
 * @model
 * @generated
 */
public interface RequireBundle extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
	 * The list contents are of type {@link option.RequireBundleDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directives</em>' containment reference list.
	 * @see manifest.ManifestPackage#getRequireBundle_Directives()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<RequireBundleDirective> getDirectives();

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see manifest.ManifestPackage#getRequireBundle_Resolved()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.RequireBundle#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see manifest.ManifestPackage#getRequireBundle_Reference()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link manifest.RequireBundle#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bundle</em>' attribute.
	 * @see #setBundle(String)
	 * @see manifest.ManifestPackage#getRequireBundle_Bundle()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * Sets the value of the '{@link manifest.RequireBundle#getBundle <em>Bundle</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(Bundle value);

	void addDirective(RequireBundleDirective directive);

} // RequireBundle
