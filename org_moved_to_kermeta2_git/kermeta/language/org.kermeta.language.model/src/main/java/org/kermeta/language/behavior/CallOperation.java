/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;

import org.kermeta.language.structure.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.CallOperation#getStaticOperation <em>Static Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getCallOperation()
 * @model
 * @generated
 */
public interface CallOperation extends CallFeature {
	/**
	 * Returns the value of the '<em><b>Static Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method which will be executed (operation case)
	 * and the result value passed to the caller
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Operation</em>' reference.
	 * @see #setStaticOperation(Operation)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getCallOperation_StaticOperation()
	 * @model
	 * @generated
	 */
	Operation getStaticOperation();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.CallOperation#getStaticOperation <em>Static Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Operation</em>' reference.
	 * @see #getStaticOperation()
	 * @generated
	 */
	void setStaticOperation(Operation value);

} // CallOperation
