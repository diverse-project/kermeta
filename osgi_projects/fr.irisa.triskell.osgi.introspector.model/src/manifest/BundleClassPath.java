/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleClassPath.java,v 1.3 2008-08-11 14:19:26 edaubert Exp $
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
 *   <li>{@link manifest.BundleClassPath#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.BundleClassPath#getReferences <em>References</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see manifest.ManifestPackage#getBundleClassPath_Resolved()
	 * @model default="false" dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.BundleClassPath#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' attribute list.
	 * @see manifest.ManifestPackage#getBundleClassPath_References()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	EList<String> getReferences();

	void addEntry(SystemEntry entry);
	
	void addEntryReference(String reference);

} // BundleClassPath
