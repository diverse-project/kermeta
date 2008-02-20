/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuleType.java,v 1.1 2008-02-20 14:16:35 ffleurey Exp $
 */
package acm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link acm.RuleType#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see acm.AcmPackage#getRuleType()
 * @model
 * @generated
 */
public interface RuleType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link acm.ElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see acm.AcmPackage#getRuleType_Parameters()
	 * @model required="true"
	 * @generated
	 */
	EList<ElementType> getParameters();

} // RuleType
