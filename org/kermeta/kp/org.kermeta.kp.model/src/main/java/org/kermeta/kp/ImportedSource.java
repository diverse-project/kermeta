/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.ImportedSource#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getImportedSource()
 * @model abstract="true"
 * @generated
 */
public interface ImportedSource extends Source {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Dependency)
	 * @see org.kermeta.kp.KpPackage#getImportedSource_From()
	 * @model
	 * @generated
	 */
	Dependency getFrom();

	/**
	 * Sets the value of the '{@link org.kermeta.kp.ImportedSource#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Dependency value);

} // ImportedSource
