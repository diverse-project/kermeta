/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportPackage.java,v 1.4 2008-08-11 14:19:26 edaubert Exp $
 */
package manifest;

import jar.Package;
import option.ImportPackageDirective;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Import Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.ImportPackage#getDirectives <em>Directives</em>}</li>
 *   <li>{@link manifest.ImportPackage#isResolved <em>Resolved</em>}</li>
 *   <li>{@link manifest.ImportPackage#getPackagesReference <em>Packages Reference</em>}</li>
 *   <li>{@link manifest.ImportPackage#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getImportPackage()
 * @model
 * @generated
 */
public interface ImportPackage extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Packages</em>' attribute list.
	 * @see manifest.ManifestPackage#getImportPackage_Packages()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	EList<jar.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directives</em>' containment reference.
	 * @see #setDirectives(ImportPackageDirective)
	 * @see manifest.ManifestPackage#getImportPackage_Directives()
	 * @model containment="true"
	 * @generated
	 */
	ImportPackageDirective getDirectives();

	/**
	 * Sets the value of the '{@link manifest.ImportPackage#getDirectives <em>Directives</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directives</em>' containment reference.
	 * @see #getDirectives()
	 * @generated
	 */
	void setDirectives(ImportPackageDirective value);

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see manifest.ManifestPackage#getImportPackage_Resolved()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link manifest.ImportPackage#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

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
	 * @see manifest.ManifestPackage#getImportPackage_PackagesReference()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	EList<String> getPackagesReference();

	void addPackageReference(String value);
	
	void addPackage(Package _package);

} // ImportPackage
