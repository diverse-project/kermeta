/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: A.java,v 1.2 2009-02-17 13:40:56 cfaucher Exp $
 */
package comp_containment_test001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comp_containment_test001.A#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see comp_containment_test001.Comp_containment_test001Package#getA()
 * @model
 * @generated
 */
public interface A extends EObject
{
  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(B)
   * @see comp_containment_test001.Comp_containment_test001Package#getA_B()
   * @model containment="true" required="true"
   * @generated
   */
  B getB();

  /**
   * Sets the value of the '{@link comp_containment_test001.A#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(B value);

} // A
