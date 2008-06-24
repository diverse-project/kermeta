/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Stack.java,v 1.1 2008-06-24 14:23:17 cfaucher Exp $
 */
package kermeta.utils;

import kermeta.standard.Sequence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.utils.UtilsPackage#getStack()
 * @model annotation="kermeta documentation='/**\r\n * An implementation of stack\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface Stack<G> extends Sequence<G>
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Gets the element at the top of the stack\r\n\t \052/'"
   * @generated
   */
  G peek();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Get and remove the element at the top of the stack\r\n\t \052/'"
   * @generated
   */
  G pop();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Pushes an element into the stack\r\n\t \052/'"
   * @generated
   */
  void push(G element);

} // Stack
