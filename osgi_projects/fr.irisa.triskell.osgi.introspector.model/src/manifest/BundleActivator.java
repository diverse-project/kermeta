/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleActivator.java,v 1.3 2008-08-19 07:04:45 edaubert Exp $
 */
package manifest;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle Activator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.BundleActivator#getReference <em>Reference</em>}</li>
 *   <li>{@link manifest.BundleActivator#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.BundleActivator#getActivator <em>Activator</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getBundleActivator()
 * @model
 * @generated
 */
public interface BundleActivator extends MANIFESTEntry {
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
	 * @see manifest.ManifestPackage#getBundleActivator_Reference()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link manifest.BundleActivator#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

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
	 * @see manifest.ManifestPackage#getBundleActivator_Resolved()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.BundleActivator#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Activator</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Activator</em>' reference.
	 * @see #setActivator(jar.Class)
	 * @see manifest.ManifestPackage#getBundleActivator_Activator()
	 * @model required="true"
	 * @generated
	 */
	jar.Class getActivator();

	/**
	 * Sets the value of the '{@link manifest.BundleActivator#getActivator <em>Activator</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activator</em>' reference.
	 * @see #getActivator()
	 * @generated
	 */
	void setActivator(jar.Class value);

} // BundleActivator
