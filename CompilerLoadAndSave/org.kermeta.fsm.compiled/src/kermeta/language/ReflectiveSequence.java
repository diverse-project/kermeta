/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ReflectiveSequence.java,v 1.1 2008-07-02 09:13:40 ftanguy Exp $
 */
package kermeta.language;

import kermeta.standard.OrderedSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflective Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.LanguagePackage#getReflectiveSequence()
 * @model annotation="kermeta documentation='/**\r\n * ReflectiveSequence is an ordered ReflectiveCollection.\r\n \052/'"
 * @generated
 */
public interface ReflectiveSequence<G> extends OrderedSet<G>, ReflectiveCollection<G>
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Overrides kermeta::language::ReflectiveCollection<G>.clear()\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::language::ReflectiveCollection'"
   * @generated
   */
  void clear();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model indexDataType="kermeta.standard.Integer"
   *        annotation="kermeta documentation='/**\r\n\t * Overrides kermeta::standard::OrderedSet.addAt(Integer)\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::standard::OrderedSet'"
   * @generated
   */
  void addAt(int index, G element);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model indexDataType="kermeta.standard.Integer"
   *        annotation="kermeta documentation='/**\r\n\t * Overrides kermeta::standard::OrderedSet.removeAt(Integer)\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::standard::OrderedCollection'"
   * @generated
   */
  void removeAt(int index);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Overrides kermeta::language::ReflectiveCollection<G>.remove(G)\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::language::ReflectiveCollection'"
   * @generated
   */
  void remove(G element);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * Overrides kermeta::standard::OrderedSet.equals(Object)\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::standard::OrderedSet'"
   * @generated
   */
  boolean equals(kermeta.language.structure.Object element);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Overrides kermeta::language::ReflectiveCollection<G>.add(G)\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::language::ReflectiveCollection'"
   * @generated
   */
  void add(G element);

} // ReflectiveSequence
