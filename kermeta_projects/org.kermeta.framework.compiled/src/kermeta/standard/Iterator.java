/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Iterator.java,v 1.1 2008-06-24 14:23:37 cfaucher Exp $
 */
package kermeta.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getIterator()
 * @model annotation="kermeta documentation='/**\r\n * Iterator to be used with Collection\r\n * See also Collection<G>.getIterator()\r\n \052/'"
 * @generated
 */
public interface Iterator<G> extends kermeta.language.structure.Object
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * Returns true if the iterator has a next element\r\n\t \052/'"
   * @generated
   */
  boolean hasNext();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns the next element of the iterator\r\n\t * Raises IteratorIsOff exception in case the iterator is on the last element \r\n\t \052/'"
   * @generated
   */
  G next();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * Returns true if the iterator is on the last element\r\n\t * i.e. returns not self.hasNext()\r\n\t \052/'"
   * @generated
   */
  boolean isOff();

} // Iterator
