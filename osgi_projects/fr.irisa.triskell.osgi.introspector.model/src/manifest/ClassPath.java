/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassPath.java,v 1.1 2008-08-19 07:04:45 edaubert Exp $
 */
package manifest;

import jar.SystemEntry;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Class Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.ClassPath#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.ClassPath#getReference <em>Reference</em>}</li>
 *   <li>{@link manifest.ClassPath#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getClassPath()
 * @model
 * @generated
 */
public interface ClassPath extends EObject {
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
	 * @see manifest.ManifestPackage#getClassPath_Resolved()
	 * @model dataType="manifest.boolean"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.ClassPath#isResolved <em>Resolved</em>}' attribute.
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
	 * @see manifest.ManifestPackage#getClassPath_Reference()
	 * @model dataType="manifest.String"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link manifest.ClassPath#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry</em>' reference.
	 * @see #setEntry(SystemEntry)
	 * @see manifest.ManifestPackage#getClassPath_Entry()
	 * @model
	 * @generated
	 */
	SystemEntry getEntry();

	/**
	 * Sets the value of the '{@link manifest.ClassPath#getEntry <em>Entry</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(SystemEntry value);

} // ClassPath
