/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.ConditionalAndExpression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.xtext.alf.AlfPackage#getConditionalAndExpression()
 * @model
 * @generated
 */
public interface ConditionalAndExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.alf.xtext.alf.InclusiveOrExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference list.
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getConditionalAndExpression_Exp()
   * @model containment="true"
   * @generated
   */
  EList<InclusiveOrExpression> getExp();

} // ConditionalAndExpression
