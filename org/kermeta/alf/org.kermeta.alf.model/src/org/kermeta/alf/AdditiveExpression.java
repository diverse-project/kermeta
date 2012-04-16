/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.AdditiveExpression#getExp <em>Exp</em>}</li>
 *   <li>{@link org.kermeta.alf.AdditiveExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.AlfPackage#getAdditiveExpression()
 * @model
 * @generated
 */
public interface AdditiveExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.alf.MultiplicativeExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference list.
	 * @see org.kermeta.alf.AlfPackage#getAdditiveExpression_Exp()
	 * @model type="org.kermeta.alf.MultiplicativeExpression" containment="true"
	 * @generated
	 */
	EList getExp();

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute list.
	 * @see org.kermeta.alf.AlfPackage#getAdditiveExpression_Op()
	 * @model unique="false"
	 * @generated
	 */
	EList getOp();

} // AdditiveExpression
