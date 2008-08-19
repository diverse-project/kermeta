/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExcludePackages.java,v 1.4 2008-08-19 07:04:44 edaubert Exp $
 */
package option;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Exclude Packages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link option.ExcludePackages#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see option.OptionPackage#getExcludePackages()
 * @model
 * @generated
 */
public interface ExcludePackages extends ActivationPolicyDirective {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link option.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see option.OptionPackage#getExcludePackages_Packages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<option.Package> getPackages();

	void addExcludePackage(option.Package _package);

	// void addExcludePackageReference(String reference);

} // ExcludePackages
