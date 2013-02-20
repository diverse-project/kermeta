/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Operation Tuple Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getObjectOrRole <em>Object Or Role</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getRoleIndex <em>Role Index</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.xtext.alf.AlfPackage#getLinkOperationTupleElement()
 * @model
 * @generated
 */
public interface LinkOperationTupleElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Object Or Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Or Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Or Role</em>' attribute.
   * @see #setObjectOrRole(String)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getLinkOperationTupleElement_ObjectOrRole()
   * @model
   * @generated
   */
  String getObjectOrRole();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getObjectOrRole <em>Object Or Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Or Role</em>' attribute.
   * @see #getObjectOrRole()
   * @generated
   */
  void setObjectOrRole(String value);

  /**
   * Returns the value of the '<em><b>Role Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Index</em>' containment reference.
   * @see #setRoleIndex(Expression)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getLinkOperationTupleElement_RoleIndex()
   * @model containment="true"
   * @generated
   */
  Expression getRoleIndex();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getRoleIndex <em>Role Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role Index</em>' containment reference.
   * @see #getRoleIndex()
   * @generated
   */
  void setRoleIndex(Expression value);

  /**
   * Returns the value of the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' attribute.
   * @see #setObject(String)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getLinkOperationTupleElement_Object()
   * @model
   * @generated
   */
  String getObject();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.LinkOperationTupleElement#getObject <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' attribute.
   * @see #getObject()
   * @generated
   */
  void setObject(String value);

} // LinkOperationTupleElement
