/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collect Or Iterate Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.CollectOrIterateOperation#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.xtext.alf.AlfPackage#getCollectOrIterateOperation()
 * @model
 * @generated
 */
public interface CollectOrIterateOperation extends SequenceExpansionExpression
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link org.kermeta.alf.xtext.alf.CollectOrIterateOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see org.kermeta.alf.xtext.alf.CollectOrIterateOperator
   * @see #setOp(CollectOrIterateOperator)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getCollectOrIterateOperation_Op()
   * @model
   * @generated
   */
  CollectOrIterateOperator getOp();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.CollectOrIterateOperation#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see org.kermeta.alf.xtext.alf.CollectOrIterateOperator
   * @see #getOp()
   * @generated
   */
  void setOp(CollectOrIterateOperator value);

} // CollectOrIterateOperation
