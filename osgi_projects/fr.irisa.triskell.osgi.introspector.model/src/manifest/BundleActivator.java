/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleActivator.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle Activator</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link manifest.BundleActivator#getActivator <em>Activator</em>}</li>
 * </ul>
 * </p>
 * 
 * @see manifest.ManifestPackage#getBundleActivator()
 * @model
 * @generated
 */
public interface BundleActivator extends MANIFESTEntry {
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
	 * Sets the value of the '{@link manifest.BundleActivator#getActivator <em>Activator</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Activator</em>' reference.
	 * @see #getActivator()
	 * @generated
	 */
	void setActivator(jar.Class value);

} // BundleActivator
