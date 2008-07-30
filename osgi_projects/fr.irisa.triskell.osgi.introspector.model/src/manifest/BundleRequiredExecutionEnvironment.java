/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleRequiredExecutionEnvironment.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle Required Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link manifest.BundleRequiredExecutionEnvironment#getProfile <em>Profile</em>}</li>
 * <li>{@link manifest.BundleRequiredExecutionEnvironment#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 * 
 * @see manifest.ManifestPackage#getBundleRequiredExecutionEnvironment()
 * @model
 * @generated
 */
public interface BundleRequiredExecutionEnvironment extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Profile</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Profile</em>' attribute.
	 * @see #setProfile(String)
	 * @see manifest.ManifestPackage#getBundleRequiredExecutionEnvironment_Profile()
	 * @model dataType="manifest.String" required="true"
	 * @generated
	 */
	String getProfile();

	/**
	 * Sets the value of the '{@link manifest.BundleRequiredExecutionEnvironment#getProfile <em>Profile</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Profile</em>' attribute.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(String)
	 * @see manifest.ManifestPackage#getBundleRequiredExecutionEnvironment_Configuration()
	 * @model dataType="manifest.String"
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link manifest.BundleRequiredExecutionEnvironment#getConfiguration <em>Configuration</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(String value);

} // BundleRequiredExecutionEnvironment
