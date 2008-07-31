/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExportService.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package manifest;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Export Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.ExportService#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getExportService()
 * @model
 * @generated
 */
public interface ExportService extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(Service)
	 * @see manifest.ManifestPackage#getExportService_Service()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link manifest.ExportService#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

} // ExportService
