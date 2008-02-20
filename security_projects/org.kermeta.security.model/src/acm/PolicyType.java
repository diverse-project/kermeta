/**
 * <copyright>
 * </copyright>
 *
 * $Id: PolicyType.java,v 1.1 2008-02-20 14:16:35 ffleurey Exp $
 */
package acm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link acm.PolicyType#getRuleTypes <em>Rule Types</em>}</li>
 *   <li>{@link acm.PolicyType#getElementTypes <em>Element Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see acm.AcmPackage#getPolicyType()
 * @model
 * @generated
 */
public interface PolicyType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Rule Types</b></em>' containment reference list.
	 * The list contents are of type {@link acm.RuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Types</em>' containment reference list.
	 * @see acm.AcmPackage#getPolicyType_RuleTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RuleType> getRuleTypes();

	/**
	 * Returns the value of the '<em><b>Element Types</b></em>' containment reference list.
	 * The list contents are of type {@link acm.ElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Types</em>' containment reference list.
	 * @see acm.AcmPackage#getPolicyType_ElementTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementType> getElementTypes();

} // PolicyType
