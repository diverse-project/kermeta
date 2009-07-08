/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.implem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OS Gi Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.implem.OSGiPort#getServiceId <em>Service Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.implem.ImplemPackage#getOSGiPort()
 * @model
 * @generated
 */
public interface OSGiPort extends PortImplementation {
	/**
	 * Returns the value of the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Id</em>' attribute.
	 * @see #setServiceId(String)
	 * @see art.implem.ImplemPackage#getOSGiPort_ServiceId()
	 * @model dataType="art.String" required="true"
	 * @generated
	 */
	String getServiceId();

	/**
	 * Sets the value of the '{@link art.implem.OSGiPort#getServiceId <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Id</em>' attribute.
	 * @see #getServiceId()
	 * @generated
	 */
	void setServiceId(String value);

} // OSGiPort
