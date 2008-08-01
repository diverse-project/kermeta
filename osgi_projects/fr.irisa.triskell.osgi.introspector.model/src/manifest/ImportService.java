/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportService.java,v 1.3 2008-08-01 09:44:38 edaubert Exp $
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
 *   <li>{@link manifest.ImportService#getService <em>Service</em>}</li>
 *   <li>{@link manifest.ImportService#getServiceElement <em>Service Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getImportService()
 * @model
 * @generated
 */
public interface ImportService extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see manifest.ManifestPackage#getImportService_Resolved()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.ImportService#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

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
	String getService();

	/**
	 * Sets the value of the '{@link manifest.ImportService#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * Returns the value of the '<em><b>Service Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Element</em>' reference.
	 * @see #setServiceElement(Service)
	 * @see manifest.ManifestPackage#getImportService_ServiceElement()
	 * @model
	 * @generated
	 */
	Service getServiceElement();

	/**
	 * Sets the value of the '{@link manifest.ImportService#getServiceElement <em>Service Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Element</em>' reference.
	 * @see #getServiceElement()
	 * @generated
	 */
	void setServiceElement(Service value);

} // ImportService
