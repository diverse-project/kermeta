/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleClassPath.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package manifest;

import jar.SystemEntry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle Class Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.BundleClassPath#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getBundleClassPath()
 * @model
 * @generated
 */
public interface BundleClassPath extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' reference list.
	 * The list contents are of type {@link jar.SystemEntry}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entries</em>' reference list.
	 * @see manifest.ManifestPackage#getBundleClassPath_Entries()
	 * @model required="true"
	 * @generated
	 */
	EList<SystemEntry> getEntries();

	void addEntry(SystemEntry entry);

} // BundleClassPath
