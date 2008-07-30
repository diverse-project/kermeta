/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleVersion.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle Version</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link manifest.BundleVersion#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 * 
 * @see manifest.ManifestPackage#getBundleVersion()
 * @model
 * @generated
 */
public interface BundleVersion extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(Version)
	 * @see manifest.ManifestPackage#getBundleVersion_Version()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link manifest.BundleVersion#getVersion <em>Version</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Version</em>' containment
	 *            reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

} // BundleVersion
