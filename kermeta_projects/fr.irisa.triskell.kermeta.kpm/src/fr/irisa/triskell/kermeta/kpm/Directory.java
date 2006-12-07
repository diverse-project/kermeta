/**
 * <copyright>
 * </copyright>
 *
 * $Id: Directory.java,v 1.3 2006-12-07 13:47:21 ftanguy Exp $
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
public interface Directory extends File {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.kpm.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getDirectory_Contents()
	 * @model type="fr.irisa.triskell.kermeta.kpm.File"
	 * @generated
	 */
	EList getContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueDataType="fr.irisa.triskell.kermeta.kpm.String"
	 * @generated
	 */
	void setSource(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="fr.irisa.triskell.kermeta.kpm.boolean"
	 * @generated
	 */
	boolean isSource();

} // Directory