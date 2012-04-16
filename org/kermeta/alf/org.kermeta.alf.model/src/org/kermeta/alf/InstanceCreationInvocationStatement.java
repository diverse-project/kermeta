/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Creation Invocation Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.InstanceCreationInvocationStatement#get_new <em>new</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.AlfPackage#getInstanceCreationInvocationStatement()
 * @model
 * @generated
 */
public interface InstanceCreationInvocationStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>new</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>new</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>new</em>' containment reference.
	 * @see #set_new(InstanceCreationExpression)
	 * @see org.kermeta.alf.AlfPackage#getInstanceCreationInvocationStatement__new()
	 * @model containment="true"
	 * @generated
	 */
	InstanceCreationExpression get_new();

	/**
	 * Sets the value of the '{@link org.kermeta.alf.InstanceCreationInvocationStatement#get_new <em>new</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>new</em>' containment reference.
	 * @see #get_new()
	 * @generated
	 */
	void set_new(InstanceCreationExpression value);

} // InstanceCreationInvocationStatement
