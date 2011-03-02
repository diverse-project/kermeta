/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.SourceFile#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getSourceFile()
 * @model
 * @generated
 */
public interface SourceFile extends Source {
	/**
   * Returns the value of the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>File Name</em>' attribute.
   * @see #setFileName(String)
   * @see org.kermeta.kp.KpPackage#getSourceFile_FileName()
   * @model
   * @generated
   */
	String getFileName();

	/**
   * Sets the value of the '{@link org.kermeta.kp.SourceFile#getFileName <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Name</em>' attribute.
   * @see #getFileName()
   * @generated
   */
	void setFileName(String value);

} // SourceFile
