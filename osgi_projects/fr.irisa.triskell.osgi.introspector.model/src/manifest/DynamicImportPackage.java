/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicImportPackage.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Dynamic Import Package</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link manifest.DynamicImportPackage#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 * 
 * @see manifest.ManifestPackage#getDynamicImportPackage()
 * @model
 * @generated
 */
public interface DynamicImportPackage extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Packages</em>' attribute list.
	 * @see manifest.ManifestPackage#getDynamicImportPackage_Packages()
	 * @model dataType="manifest.String" required="true"
	 * @generated
	 */
	EList<String> getPackages();

	void addPackage(String packageName);

} // DynamicImportPackage
