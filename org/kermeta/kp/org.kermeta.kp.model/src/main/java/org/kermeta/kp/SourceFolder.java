/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * source pointing to all the content of a folder
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.SourceFolder#getFolderName <em>Folder Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getSourceFolder()
 * @model
 * @generated
 */
public interface SourceFolder extends Source {
	/**
   * Returns the value of the '<em><b>Folder Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Folder Name</em>' attribute.
   * @see #setFolderName(String)
   * @see org.kermeta.kp.KpPackage#getSourceFolder_FolderName()
   * @model
   * @generated
   */
	String getFolderName();

	/**
   * Sets the value of the '{@link org.kermeta.kp.SourceFolder#getFolderName <em>Folder Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Folder Name</em>' attribute.
   * @see #getFolderName()
   * @generated
   */
	void setFolderName(String value);

} // SourceFolder
