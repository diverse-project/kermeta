/**
 * <copyright>
 * </copyright>
 *
 * $Id: Service.java,v 1.4 2008-08-11 14:19:26 edaubert Exp $
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
 *   <li>{@link manifest.Service#getInterface <em>Interface</em>}</li>
 *   <li>{@link manifest.Service#getInterfaceReference <em>Interface Reference</em>}</li>
 *   <li>{@link manifest.Service#isResolved <em>Resolved</em>}</li>
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
	 * Sets the value of the '{@link manifest.Service#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(jar.Class value);

	/**
	 * Returns the value of the '<em><b>Interface Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Reference</em>' attribute.
	 * @see #setInterfaceReference(String)
	 * @see manifest.ManifestPackage#getService_InterfaceReference()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	String getInterfaceReference();

	/**
	 * Sets the value of the '{@link manifest.Service#getInterfaceReference <em>Interface Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Reference</em>' attribute.
	 * @see #getInterfaceReference()
	 * @generated
	 */
	void setInterfaceReference(String value);

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
	 * @see manifest.ManifestPackage#getService_Resolved()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.Service#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

} // Service
