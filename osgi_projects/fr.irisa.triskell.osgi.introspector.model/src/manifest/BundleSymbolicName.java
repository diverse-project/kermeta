/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleSymbolicName.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest;

import option.SymbolicNameDirective;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle Symbolic Name</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link manifest.BundleSymbolicName#getSymbolicName <em>Symbolic Name</em>}</li>
 * <li>{@link manifest.BundleSymbolicName#getDirectives <em>Directives</em>}</li>
 * </ul>
 * </p>
 * 
 * @see manifest.ManifestPackage#getBundleSymbolicName()
 * @model
 * @generated
 */
public interface BundleSymbolicName extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbolic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Symbolic Name</em>' attribute.
	 * @see #setSymbolicName(String)
	 * @see manifest.ManifestPackage#getBundleSymbolicName_SymbolicName()
	 * @model dataType="framework.String" required="true"
	 * @generated
	 */
	String getSymbolicName();

	/**
	 * Sets the value of the '{@link manifest.BundleSymbolicName#getSymbolicName <em>Symbolic Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Symbolic Name</em>' attribute.
	 * @see #getSymbolicName()
	 * @generated
	 */
	void setSymbolicName(String value);

	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link option.SymbolicNameDirective}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Directives</em>' containment reference
	 *         list.
	 * @see manifest.ManifestPackage#getBundleSymbolicName_Directives()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<SymbolicNameDirective> getDirectives();

	void addDirective(SymbolicNameDirective directive);

} // BundleSymbolicName
