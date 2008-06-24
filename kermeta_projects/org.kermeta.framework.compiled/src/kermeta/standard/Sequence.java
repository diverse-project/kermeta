/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Sequence.java,v 1.1 2008-06-24 14:23:37 cfaucher Exp $
 */
package kermeta.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getSequence()
 * @model annotation="kermeta documentation='/**\r\n * A Sequence is an OrderedCollection of elements allowing duplicates\r\n \052/'"
 *        annotation="kermeta EMF_needReference='isUnique=false isOrdered=true javaClass=java.util.ArrayList'"
 * @generated
 */
public interface Sequence<G> extends Bag<G>, OrderedCollection<G>
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model minDataType="kermeta.standard.Integer" maxDataType="kermeta.standard.Integer"
   *        annotation="kermeta documentation='/**\r\n\t * Builds and returns a new Sequence composed of elements of current sequence\r\n\t * from rank min to rank max (order is respected)\r\n\t * Raises IndexOutOfBound exception if min is negative, max is larger than \r\n\t * the size of the sequence or min is larger than max\r\n\t \052/'"
   * @generated
   */
  Sequence<G> subSequence(int min, int max);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted in head\r\n\t \052/'"
   * @generated
   */
  Sequence<G> append(G element);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model indexDataType="kermeta.standard.Integer"
   *        annotation="kermeta documentation='/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted at rank index\r\n\t \052/'"
   * @generated
   */
  Sequence<G> insertAt(int index, G element);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted in tail\r\n\t \052/'"
   * @generated
   */
  Sequence<G> preppend(G element);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * Overrides OrderedCollection<G>.equals(Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Sequence\t\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::standard::OrderedCollection'"
   * @generated
   */
  boolean equals(kermeta.language.structure.Object element);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model indexDataType="kermeta.standard.Integer"
   *        annotation="kermeta documentation='/**\r\n\t * Returns element at rank index in the sequence\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the Sequence\r\n\t \052/'"
   * @generated
   */
  G at(int index);

} // Sequence
