/**
 * <copyright>
 * </copyright>
 *
 * $Id: Directory.java,v 1.4 2006-12-12 16:06:12 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;


import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.Directory#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDirectory()
 * @model
 * @generated
 */
public interface Directory extends Unit, AbstractDirectory {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.File}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.kpm.File#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDirectory_Contents()
	 * @see fr.irisa.triskell.kermeta.kpm.File#getContainer
	 * @model type="fr.irisa.triskell.kermeta.kpm.File" opposite="container"
	 * @generated
	 */
	EList getContents();

} // Directory