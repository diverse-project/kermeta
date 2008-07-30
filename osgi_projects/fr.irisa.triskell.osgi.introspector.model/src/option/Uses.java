/**
 * <copyright>
 * </copyright>
 *
 * $Id: Uses.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
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
 * <li>{@link option.Uses#getPackages <em>Packages</em>}</li>
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

	void addPackage(String _package);

} // Uses
