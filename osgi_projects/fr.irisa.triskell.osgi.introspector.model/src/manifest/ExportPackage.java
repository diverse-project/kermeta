/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExportPackage.java,v 1.3 2008-08-11 14:19:26 edaubert Exp $
 */
package manifest;

import jar.Package;
import option.ExportPackageDirective;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Export Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.ExportPackage#getPackages <em>Packages</em>}</li>
 *   <li>{@link manifest.ExportPackage#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.ExportPackage#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.ExportPackage#getPackageReference <em>Package Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getExportPackage()
 * @model
 * @generated
 */
public interface ExportPackage extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' reference list.
	 * The list contents are of type {@link jar.Package}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' reference list.
	 * @see manifest.ManifestPackage#getExportPackage_Packages()
	 * @model
	 * @generated
	 */
	EList<jar.Package> getPackages();

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

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see manifest.ManifestPackage#getExportPackage_Resolved()
	 * @model default="true" dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.ExportPackage#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Package Reference</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Reference</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Reference</em>' attribute list.
	 * @see manifest.ManifestPackage#getExportPackage_PackageReference()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	EList<String> getPackageReference();

	void addExportPackage(Package _package);

	void addExportPackageReference(String reference);

	void addDirective(ExportPackageDirective directive);

} // ExportPackage
