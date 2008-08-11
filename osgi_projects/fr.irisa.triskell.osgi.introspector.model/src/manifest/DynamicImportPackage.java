/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicImportPackage.java,v 1.3 2008-08-11 14:19:26 edaubert Exp $
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
 *   <li>{@link manifest.DynamicImportPackage#getPackagesReference <em>Packages Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getDynamicImportPackage()
 * @model
 * @generated
 */
public interface DynamicImportPackage extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Packages Reference</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages Reference</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages Reference</em>' attribute list.
	 * @see manifest.ManifestPackage#getDynamicImportPackage_PackagesReference()
	 * @model dataType="manifest.String" required="true"
	 * @generated
	 */
	EList<String> getPackagesReference();

	void addPackageReference(String packageName);

} // DynamicImportPackage
