/**
 * <copyright>
 * </copyright>
 *
 * $Id: Uses.java,v 1.3 2008-08-01 09:44:38 edaubert Exp $
 */
package option;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link option.Uses#getPackages <em>Packages</em>}</li>
 *   <li>{@link option.Uses#getPackagesList <em>Packages List</em>}</li>
 *   <li>{@link option.Uses#isResolved <em>Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @see option.OptionPackage#getUses()
 * @model
 * @generated
 */
public interface Uses extends ExportPackageDirective {
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
	 * @see option.OptionPackage#getUses_Packages()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	EList<String> getPackages();

	/**
	 * Returns the value of the '<em><b>Packages List</b></em>' reference list.
	 * The list contents are of type {@link jar.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages List</em>' reference list.
	 * @see option.OptionPackage#getUses_PackagesList()
	 * @model
	 * @generated
	 */
	EList<jar.Package> getPackagesList();

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see option.OptionPackage#getUses_Resolved()
	 * @model dataType="manifest.boolean" required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link option.Uses#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	void addPackage(String _package);

} // Uses
