/**
 * <copyright>
 * </copyright>
 *
 * $Id: Sequence.java,v 1.2 2006-11-23 16:06:15 dtouzet Exp $
 */
package sts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sts.Sequence#getSubRules <em>Sub Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see sts.StsPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Rule {
	/**
	 * Returns the value of the '<em><b>Sub Rules</b></em>' containment reference list.
	 * The list contents are of type {@link sts.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Rules</em>' containment reference list.
	 * @see sts.StsPackage#getSequence_SubRules()
	 * @model type="sts.Rule" containment="true" required="true"
	 * @generated
	 */
	EList getSubRules();

} // Sequence