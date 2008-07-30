/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportService.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Import Service</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link manifest.ImportService#isResolve <em>Resolve</em>}</li>
 * <li>{@link manifest.ImportService#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 * 
 * @see manifest.ManifestPackage#getImportService()
 * @model
 * @generated
 */
public interface ImportService extends MANIFESTEntry {
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
	 * Sets the value of the '{@link manifest.ImportService#getService <em>Service</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * Returns the value of the '<em><b>Resolve</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolve</em>' attribute.
	 * @see #setResolve(boolean)
	 * @see manifest.ManifestPackage#getImportService_Resolve()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolve();

	/**
	 * Sets the value of the '{@link manifest.ImportService#isResolve <em>Resolve</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolve</em>' attribute.
	 * @see #isResolve()
	 * @generated
	 */
	void setResolve(boolean value);

} // ImportService
