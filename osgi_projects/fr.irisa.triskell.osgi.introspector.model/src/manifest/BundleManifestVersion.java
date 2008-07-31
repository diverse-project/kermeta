/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleManifestVersion.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package manifest;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle Manifest Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.BundleManifestVersion#getManifestVersion <em>Manifest Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getBundleManifestVersion()
 * @model
 * @generated
 */
public interface BundleManifestVersion extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Manifest Version</b></em>' attribute.
	 * The literals are from the enumeration {@link manifest.MANIFESTVersionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest Version</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest Version</em>' attribute.
	 * @see manifest.MANIFESTVersionEnum
	 * @see #setManifestVersion(MANIFESTVersionEnum)
	 * @see manifest.ManifestPackage#getBundleManifestVersion_ManifestVersion()
	 * @model required="true"
	 * @generated
	 */
	MANIFESTVersionEnum getManifestVersion();

	/**
	 * Sets the value of the '{@link manifest.BundleManifestVersion#getManifestVersion <em>Manifest Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest Version</em>' attribute.
	 * @see manifest.MANIFESTVersionEnum
	 * @see #getManifestVersion()
	 * @generated
	 */
	void setManifestVersion(MANIFESTVersionEnum value);

} // BundleManifestVersion
