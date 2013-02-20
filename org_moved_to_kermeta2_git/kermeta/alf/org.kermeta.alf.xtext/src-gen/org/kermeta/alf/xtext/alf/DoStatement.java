/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.DoStatement#getBlock <em>Block</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.DoStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.xtext.alf.AlfPackage#getDoStatement()
 * @model
 * @generated
 */
public interface DoStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getDoStatement_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.DoStatement#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getDoStatement_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.DoStatement#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

} // DoStatement
