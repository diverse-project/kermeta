/**
 * <copyright>
 * </copyright>
 *
 * $Id: SystemEntry.java,v 1.4 2008-08-19 07:04:43 edaubert Exp $
 */
package jar;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>System Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jar.SystemEntry#isBundleClassPath <em>Bundle Class Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see jar.JarPackage#getSystemEntry()
 * @model abstract="true"
 * @generated
 */
public interface SystemEntry extends BundleEntry {

	/**
	 * Returns the value of the '<em><b>Bundle Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Class Path</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Class Path</em>' attribute.
	 * @see #setBundleClassPath(boolean)
	 * @see jar.JarPackage#getSystemEntry_BundleClassPath()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isBundleClassPath();

	/**
	 * Sets the value of the '{@link jar.SystemEntry#isBundleClassPath <em>Bundle Class Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Class Path</em>' attribute.
	 * @see #isBundleClassPath()
	 * @generated
	 */
	void setBundleClassPath(boolean value);
} // SystemEntry
