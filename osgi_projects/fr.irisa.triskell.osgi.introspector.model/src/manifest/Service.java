/**
 * <copyright>
 * </copyright>
 *
 * $Id: Service.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link manifest.Service#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 * 
 * @see manifest.ManifestPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(jar.Class)
	 * @see manifest.ManifestPackage#getService_Interface()
	 * @model required="true"
	 * @generated
	 */
	jar.Class getInterface();

	/**
	 * Sets the value of the '{@link manifest.Service#getInterface <em>Interface</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(jar.Class value);

} // Service
