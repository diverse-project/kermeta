/**
 * <copyright>
 * </copyright>
 *
 * $Id: Folder.java,v 1.1 2008-07-30 14:08:03 edaubert Exp $
 */
package jar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link jar.Folder#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 * 
 * @see jar.JarPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends SystemEntry {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment
	 * reference list. The list contents are of type {@link jar.SystemEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entries</em>' containment reference
	 *         list.
	 * @see jar.JarPackage#getFolder_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemEntry> getEntries();

	void addEntry(SystemEntry entry);

	SystemEntry getEntry(String fullPath);

} // Folder
