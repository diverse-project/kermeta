/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.AcceptStatement#getClause <em>Clause</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.AcceptStatement#getSimpleAccept <em>Simple Accept</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.AcceptStatement#getCompoundAccept <em>Compound Accept</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.xtext.alf.AlfPackage#getAcceptStatement()
 * @model
 * @generated
 */
public interface AcceptStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause</em>' containment reference.
   * @see #setClause(AcceptClause)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getAcceptStatement_Clause()
   * @model containment="true"
   * @generated
   */
  AcceptClause getClause();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.AcceptStatement#getClause <em>Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause</em>' containment reference.
   * @see #getClause()
   * @generated
   */
  void setClause(AcceptClause value);

  /**
   * Returns the value of the '<em><b>Simple Accept</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Accept</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Accept</em>' containment reference.
   * @see #setSimpleAccept(SimpleAcceptStatementCompletion)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getAcceptStatement_SimpleAccept()
   * @model containment="true"
   * @generated
   */
  SimpleAcceptStatementCompletion getSimpleAccept();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.AcceptStatement#getSimpleAccept <em>Simple Accept</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Accept</em>' containment reference.
   * @see #getSimpleAccept()
   * @generated
   */
  void setSimpleAccept(SimpleAcceptStatementCompletion value);

  /**
   * Returns the value of the '<em><b>Compound Accept</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compound Accept</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compound Accept</em>' containment reference.
   * @see #setCompoundAccept(CompoundAcceptStatementCompletion)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getAcceptStatement_CompoundAccept()
   * @model containment="true"
   * @generated
   */
  CompoundAcceptStatementCompletion getCompoundAccept();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.AcceptStatement#getCompoundAccept <em>Compound Accept</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compound Accept</em>' containment reference.
   * @see #getCompoundAccept()
   * @generated
   */
  void setCompoundAccept(CompoundAcceptStatementCompletion value);

} // AcceptStatement
