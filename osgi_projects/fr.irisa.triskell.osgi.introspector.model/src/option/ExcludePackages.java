/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExcludePackages.java,v 1.3 2008-08-11 14:19:26 edaubert Exp $
 */
package option;

import jar.Package;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Exclude Packages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link option.ExcludePackages#getPackages <em>Packages</em>}</li>
 *   <li>{@link option.ExcludePackages#getPackagesReference <em>Packages Reference</em>}</li>
 *   <li>{@link option.ExcludePackages#isResolved <em>Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @see option.OptionPackage#getExcludePackages()
 * @model
 * @generated
 */
public interface ExcludePackages extends ActivationPolicyDirective {
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
	 * @see option.OptionPackage#getExcludePackages_Packages()
	 * @model
	 * @generated
	 */
	EList<jar.Package> getPackages();
	
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
	 * @see option.OptionPackage#getExcludePackages_PackagesReference()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	EList<String> getPackagesReference();

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
	 * @see option.OptionPackage#getExcludePackages_Resolved()
	 * @model default="true" dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link option.ExcludePackages#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	void addExcludePackage(Package _package);
	
	void addExcludePackageReference(String reference);

} // ExcludePackages
