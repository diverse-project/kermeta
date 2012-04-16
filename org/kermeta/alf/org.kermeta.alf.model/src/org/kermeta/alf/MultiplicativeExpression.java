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
 * A representation of the model object '<em><b>Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.MultiplicativeExpression#getExp <em>Exp</em>}</li>
 *   <li>{@link org.kermeta.alf.MultiplicativeExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.AlfPackage#getMultiplicativeExpression()
 * @model
 * @generated
 */
public interface MultiplicativeExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.alf.UnaryExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference list.
	 * @see org.kermeta.alf.AlfPackage#getMultiplicativeExpression_Exp()
	 * @model type="org.kermeta.alf.UnaryExpression" containment="true"
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
	 * @see org.kermeta.alf.AlfPackage#getMultiplicativeExpression_Op()
	 * @model unique="false"
	 * @generated
	 */
	EList getOp();

} // MultiplicativeExpression
