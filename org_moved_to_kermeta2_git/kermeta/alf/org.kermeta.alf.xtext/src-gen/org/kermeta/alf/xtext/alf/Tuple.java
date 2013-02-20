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
 * A representation of the model object '<em><b>Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.Tuple#getTupleElements <em>Tuple Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.xtext.alf.AlfPackage#getTuple()
 * @model
 * @generated
 */
public interface Tuple extends EObject
{
  /**
   * Returns the value of the '<em><b>Tuple Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.alf.xtext.alf.TupleElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tuple Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuple Elements</em>' containment reference list.
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getTuple_TupleElements()
   * @model containment="true"
   * @generated
   */
  EList<TupleElement> getTupleElements();

} // Tuple
