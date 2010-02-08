/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.implem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OS Gi Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.implem.OSGiType#getGenerateInstanceBundle <em>Generate Instance Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.implem.ImplemPackage#getOSGiType()
 * @model
 * @generated
 */
public interface OSGiType extends TypeImplementation {
	/**
	 * Returns the value of the '<em><b>Generate Instance Bundle</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Instance Bundle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Instance Bundle</em>' attribute.
	 * @see #setGenerateInstanceBundle(Boolean)
	 * @see pattern.art.implem.ImplemPackage#getOSGiType_GenerateInstanceBundle()
	 * @model default="true" dataType="pattern.art.Boolean"
	 * @generated
	 */
	Boolean getGenerateInstanceBundle();

	/**
	 * Sets the value of the '{@link pattern.art.implem.OSGiType#getGenerateInstanceBundle <em>Generate Instance Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Instance Bundle</em>' attribute.
	 * @see #getGenerateInstanceBundle()
	 * @generated
	 */
	void setGenerateInstanceBundle(Boolean value);

} // OSGiType
