/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.implem_relaxed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OS Gi Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.implem_relaxed.OSGiComponent#getImplementingClass <em>Implementing Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.implem_relaxed.Implem_relaxedPackage#getOSGiComponent()
 * @model
 * @generated
 */
public interface OSGiComponent extends ComponentImplementation {
	/**
	 * Returns the value of the '<em><b>Implementing Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementing Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementing Class</em>' attribute.
	 * @see #setImplementingClass(String)
	 * @see art_relaxed.implem_relaxed.Implem_relaxedPackage#getOSGiComponent_ImplementingClass()
	 * @model dataType="art_relaxed.String" required="true"
	 * @generated
	 */
	String getImplementingClass();

	/**
	 * Sets the value of the '{@link art_relaxed.implem_relaxed.OSGiComponent#getImplementingClass <em>Implementing Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementing Class</em>' attribute.
	 * @see #getImplementingClass()
	 * @generated
	 */
	void setImplementingClass(String value);

} // OSGiComponent
