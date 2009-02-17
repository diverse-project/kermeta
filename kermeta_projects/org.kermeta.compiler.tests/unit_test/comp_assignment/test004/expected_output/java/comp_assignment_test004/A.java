/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: A.java,v 1.2 2009-02-17 13:41:01 cfaucher Exp $
 */
package comp_assignment_test004;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comp_assignment_test004.A#getName <em>Name</em>}</li>
 *   <li>{@link comp_assignment_test004.A#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see comp_assignment_test004.Comp_assignment_test004Package#getA()
 * @model
 * @generated
 */
public interface A extends EObject
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
   * @see comp_assignment_test004.Comp_assignment_test004Package#getA_Name()
   * @model dataType="comp_assignment_test004.String"
   *        annotation="kermeta isComposite='true'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link comp_assignment_test004.A#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference list.
   * The list contents are of type {@link comp_assignment_test004.B}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference list.
   * @see comp_assignment_test004.Comp_assignment_test004Package#getA_B()
   * @model containment="true"
   * @generated
   */
  EList<B> getB();

} // A
