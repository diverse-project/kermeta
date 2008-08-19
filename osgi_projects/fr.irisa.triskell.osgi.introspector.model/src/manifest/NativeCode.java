/**
 * <copyright>
 * </copyright>
 *
 * $Id: NativeCode.java,v 1.1 2008-08-19 07:04:45 edaubert Exp $
 */
package manifest;

import jar.SystemEntry;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Native Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.NativeCode#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.NativeCode#getReference <em>Reference</em>}</li>
 *   <li>{@link manifest.NativeCode#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getNativeCode()
 * @model
 * @generated
 */
public interface NativeCode extends EObject {
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
	 * @see manifest.ManifestPackage#getNativeCode_Resolved()
	 * @model dataType="manifest.boolean"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.NativeCode#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see manifest.ManifestPackage#getNativeCode_Reference()
	 * @model dataType="manifest.String"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link manifest.NativeCode#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(SystemEntry)
	 * @see manifest.ManifestPackage#getNativeCode_File()
	 * @model
	 * @generated
	 */
	SystemEntry getFile();

	/**
	 * Sets the value of the '{@link manifest.NativeCode#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(SystemEntry value);

} // NativeCode
