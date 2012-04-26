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
 * A representation of the model object '<em><b>CLASSSTRUCT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.CLASSSTRUCT#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.CLASSSTRUCT#getClsop <em>Clsop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.xtext.alf.AlfPackage#getCLASSSTRUCT()
 * @model
 * @generated
 */
public interface CLASSSTRUCT extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getCLASSSTRUCT_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.CLASSSTRUCT#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Clsop</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.alf.xtext.alf.CLASSOP}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clsop</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clsop</em>' containment reference list.
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getCLASSSTRUCT_Clsop()
   * @model containment="true"
   * @generated
   */
  EList<CLASSOP> getClsop();

} // CLASSSTRUCT
