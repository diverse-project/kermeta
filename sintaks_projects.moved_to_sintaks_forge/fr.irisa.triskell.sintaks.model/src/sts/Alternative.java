/**
 * <copyright>
 * </copyright>
 *
 * $Id: Alternative.java,v 1.2 2006-11-23 16:06:15 dtouzet Exp $
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
 *   <li>{@link sts.Alternative#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see sts.StsPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends Rule {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link sts.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see sts.StsPackage#getAlternative_Conditions()
	 * @model type="sts.Condition" containment="true" required="true"
	 * @generated
	 */
	EList getConditions();

} // Alternative