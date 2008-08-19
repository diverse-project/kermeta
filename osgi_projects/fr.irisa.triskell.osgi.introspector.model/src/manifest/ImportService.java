/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportService.java,v 1.5 2008-08-19 07:04:45 edaubert Exp $
 */
package manifest;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Import Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.ImportService#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.ImportService#getServiceReference <em>Service Reference</em>}</li>
 *   <li>{@link manifest.ImportService#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getImportService()
 * @model
 * @generated
 */
public interface ImportService extends MANIFESTEntry {
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
	 * @see manifest.ManifestPackage#getImportService_Resolved()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.ImportService#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Reference</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Reference</em>' attribute.
	 * @see #setServiceReference(String)
	 * @see manifest.ManifestPackage#getImportService_ServiceReference()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	String getServiceReference();

	/**
	 * Sets the value of the '{@link manifest.ImportService#getServiceReference <em>Service Reference</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Reference</em>' attribute.
	 * @see #getServiceReference()
	 * @generated
	 */
	void setServiceReference(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see manifest.ManifestPackage#getImportService_Service()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link manifest.ImportService#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

} // ImportService
