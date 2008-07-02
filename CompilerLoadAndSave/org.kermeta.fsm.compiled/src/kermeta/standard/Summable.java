/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Summable.java,v 1.1 2008-07-02 09:13:29 ftanguy Exp $
 */
package kermeta.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getSummable()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * The abstract class Summable defines a set of operation\r\n * to sum instances of a class.\r\n * Sub-classes only has to implement abstract operation plus.\r\n  \052/'"
 * @generated
 */
public interface Summable<G> extends kermeta.language.structure.Object
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   *        annotation="kermeta documentation='/**\r\n\t * Summarization method to be implemented by any summable class.\r\n\t * The parameter must have the same type (or one of its subtypes)\r\n\t *  than the current object .\r\n\t \052/'"
   * @generated
   */
  G plus(G other);

} // Summable
