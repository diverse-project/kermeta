/**
 * <copyright>
 * </copyright>
 *
 * $Id: IncludePackages.java,v 1.4 2008-08-19 07:04:44 edaubert Exp $
 */
package option;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Include Packages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link option.IncludePackages#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see option.OptionPackage#getIncludePackages()
 * @model
 * @generated
 */
public interface IncludePackages extends ActivationPolicyDirective {
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
	 * @see option.OptionPackage#getIncludePackages_Packages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<option.Package> getPackages();

	void addIncludePackage(option.Package _package);

	// void addIncludePackageReference(String reference);

} // IncludePackages
