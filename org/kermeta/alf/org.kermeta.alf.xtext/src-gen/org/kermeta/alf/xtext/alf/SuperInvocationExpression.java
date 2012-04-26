/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Invocation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.SuperInvocationExpression#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.SuperInvocationExpression#getOperationCallWithoutDot <em>Operation Call Without Dot</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.SuperInvocationExpression#getOperationCall <em>Operation Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.xtext.alf.AlfPackage#getSuperInvocationExpression()
 * @model
 * @generated
 */
public interface SuperInvocationExpression extends ValueSpecification, NonLiteralValueSpecification
{
  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getSuperInvocationExpression_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.SuperInvocationExpression#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Operation Call Without Dot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call Without Dot</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Call Without Dot</em>' containment reference.
   * @see #setOperationCallWithoutDot(OperationCallExpressionWithoutDot)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getSuperInvocationExpression_OperationCallWithoutDot()
   * @model containment="true"
   * @generated
   */
  OperationCallExpressionWithoutDot getOperationCallWithoutDot();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.SuperInvocationExpression#getOperationCallWithoutDot <em>Operation Call Without Dot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Call Without Dot</em>' containment reference.
   * @see #getOperationCallWithoutDot()
   * @generated
   */
  void setOperationCallWithoutDot(OperationCallExpressionWithoutDot value);

  /**
   * Returns the value of the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Call</em>' containment reference.
   * @see #setOperationCall(OperationCallExpression)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getSuperInvocationExpression_OperationCall()
   * @model containment="true"
   * @generated
   */
  OperationCallExpression getOperationCall();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.SuperInvocationExpression#getOperationCall <em>Operation Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Call</em>' containment reference.
   * @see #getOperationCall()
   * @generated
   */
  void setOperationCall(OperationCallExpression value);

} // SuperInvocationExpression
