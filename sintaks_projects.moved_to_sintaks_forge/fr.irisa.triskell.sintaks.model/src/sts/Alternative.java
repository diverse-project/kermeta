/**
 * <copyright>
 * </copyright>
 *
 * $Id: Alternative.java,v 1.1 2006-09-26 15:28:31 dtouzet Exp $
 */
package sts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sts.Alternative#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see sts.StsPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends Rule {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link sts.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see sts.StsPackage#getAlternative_Condition()
	 * @model type="sts.Condition" containment="true" required="true"
	 * @generated
	 */
	EList getCondition();

} // Alternative