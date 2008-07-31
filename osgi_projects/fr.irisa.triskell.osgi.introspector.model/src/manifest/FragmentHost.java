/**
 * <copyright>
 * </copyright>
 *
 * $Id: FragmentHost.java,v 1.3 2008-07-31 13:43:52 edaubert Exp $
 */
package manifest;

import option.FragmentHostDirective;
import framework.Bundle;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Fragment Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.FragmentHost#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.FragmentHost#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.FragmentHost#getBundle <em>Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getFragmentHost()
 * @model
 * @generated
 */
public interface FragmentHost extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directives</em>' containment reference.
	 * @see #setDirectives(FragmentHostDirective)
	 * @see manifest.ManifestPackage#getFragmentHost_Directives()
	 * @model containment="true"
	 * @generated
	 */
	FragmentHostDirective getDirectives();

	/**
	 * Sets the value of the '{@link manifest.FragmentHost#getDirectives <em>Directives</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directives</em>' containment reference.
	 * @see #getDirectives()
	 * @generated
	 */
	void setDirectives(FragmentHostDirective value);

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
	 * @see manifest.ManifestPackage#getFragmentHost_Resolved()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.FragmentHost#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bundle</em>' reference.
	 * @see #setBundle(Bundle)
	 * @see manifest.ManifestPackage#getFragmentHost_Bundle()
	 * @model required="true"
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * Sets the value of the '{@link manifest.FragmentHost#getBundle <em>Bundle</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(Bundle value);

} // FragmentHost
