/**
 * <copyright>
 * </copyright>
 *
 * $Id: File.java,v 1.2 2006-12-12 16:06:12 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.File#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getFile()
 * @model
 * @generated
 */
public interface File extends Unit, AbstractFile {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.kpm.Directory#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Directory)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getFile_Container()
	 * @see fr.irisa.triskell.kermeta.kpm.Directory#getContents
	 * @model opposite="contents"
	 * @generated
	 */
	Directory getContainer();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.File#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Directory value);

} // File