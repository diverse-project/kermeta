/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: A.java,v 1.2 2009-02-17 13:40:54 cfaucher Exp $
 */
package comp_lambdaExpression_test001;

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
 *   <li>{@link comp_lambdaExpression_test001.A#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see comp_lambdaExpression_test001.Comp_lambdaExpression_test001Package#getA()
 * @model
 * @generated
 */
public interface A extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' attribute list.
   * @see comp_lambdaExpression_test001.Comp_lambdaExpression_test001Package#getA_Ref()
   * @model unique="false" dataType="comp_lambdaExpression_test001.String" ordered="false"
   *        annotation="kermeta isComposite='false'"
   * @generated
   */
  EList<String> getRef();

} // A
