/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExcludePackages.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
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
	 * @model required="true"
	 * @generated
	 */
	EList<jar.Package> getPackages();
	
	void addExcludePackage(Package _package);

} // ExcludePackages
