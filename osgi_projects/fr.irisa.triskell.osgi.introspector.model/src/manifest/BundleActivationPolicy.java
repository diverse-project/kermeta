/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleActivationPolicy.java,v 1.3 2008-08-19 07:04:45 edaubert Exp $
 */
package manifest;

import option.ActivationPolicyDirective;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Bundle Activation Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.BundleActivationPolicy#getPolicy <em>Policy</em>}</li>
 *   <li>{@link manifest.BundleActivationPolicy#getDirectives <em>Directives</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getBundleActivationPolicy()
 * @model
 * @generated
 */
public interface BundleActivationPolicy extends MANIFESTEntry {
	/**
	 * Returns the value of the '<em><b>Policy</b></em>' attribute. The
	 * literals are from the enumeration {@link manifest.PolicyEnum}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Policy</em>' attribute.
	 * @see manifest.PolicyEnum
	 * @see #setPolicy(PolicyEnum)
	 * @see manifest.ManifestPackage#getBundleActivationPolicy_Policy()
	 * @model required="true"
	 * @generated
	 */
	PolicyEnum getPolicy();

	/**
	 * Sets the value of the '{@link manifest.BundleActivationPolicy#getPolicy <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' attribute.
	 * @see manifest.PolicyEnum
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(PolicyEnum value);

	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
	 * The list contents are of type {@link option.ActivationPolicyDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directives</em>' containment reference list.
	 * @see manifest.ManifestPackage#getBundleActivationPolicy_Directives()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivationPolicyDirective> getDirectives();

	void addDirective(ActivationPolicyDirective directive);

	void removeDirective(ActivationPolicyDirective directive);

} // BundleActivationPolicy
