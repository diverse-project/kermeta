/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExportPackage.java,v 1.4 2008-08-19 07:04:45 edaubert Exp $
 */
package manifest;

import option.ExportPackageDirective;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Export Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.ExportPackage#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.ExportPackage#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getExportPackage()
 * @model
 * @generated
 */
public interface ExportPackage extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see manifest.ManifestPackage#getExportPackage_Packages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<manifest.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
	 * The list contents are of type {@link option.ExportPackageDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directives</em>' containment reference list.
	 * @see manifest.ManifestPackage#getExportPackage_Directives()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExportPackageDirective> getDirectives();

	// void addExportPackage(Package _package);

	// void addExportPackageReference(String reference);

	void addPackage(manifest.Package _package);

	void addDirective(ExportPackageDirective directive);

} // ExportPackage
