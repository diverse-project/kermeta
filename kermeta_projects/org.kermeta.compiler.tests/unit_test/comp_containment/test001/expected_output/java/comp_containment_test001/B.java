/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: B.java,v 1.2 2009-02-17 13:40:55 cfaucher Exp $
 */
package comp_containment_test001;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comp_containment_test001.B#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @see comp_containment_test001.Comp_containment_test001Package#getB()
 * @model
 * @generated
 */
public interface B extends EObject
{
  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference list.
   * The list contents are of type {@link comp_containment_test001.C}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference list.
   * @see comp_containment_test001.Comp_containment_test001Package#getB_C()
   * @model containment="true"
   * @generated
   */
  EList<C> getC();

} // B
