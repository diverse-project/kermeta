/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.implem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OS Gi Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.implem.OSGiComponent#getURL <em>URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.implem.ImplemPackage#getOSGiComponent()
 * @model
 * @generated
 */
public interface OSGiComponent extends ComponentImplementation {
	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see art.implem.ImplemPackage#getOSGiComponent_URL()
	 * @model dataType="art.String" required="true"
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link art.implem.OSGiComponent#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

} // OSGiComponent
