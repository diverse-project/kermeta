/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Hashtable.java,v 1.1 2008-06-24 14:23:17 cfaucher Exp $
 */
package kermeta.utils;

import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.Set;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hashtable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.utils.UtilsPackage#getHashtable()
 * @model annotation="kermeta documentation='/**\r\n * An implementation of hashtable\r\n * This implementation is for speed optimisation it cannot be serialized. \r\n * If your wish to serialize its content you need to copy its content into a classical ecore structure (attribute or references)\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface Hashtable<K, V> extends kermeta.language.structure.Object
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Removes all elements from the Hashtable\r\n\t \052/'"
   * @generated
   */
  void clear();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns the value for key \'key\' if it exists, otherwise returns Void\r\n\t \052/'"
   * @generated
   */
  V getValue(K key);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\t\r\n\t * Returns a Boolean stating whether a key is present or not in this Hashtable\r\n\t \052/'"
   * @generated
   */
  boolean containsKey(K key);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Adds a entry into the Hashtable\r\n\t \052/'"
   * @generated
   */
  void put(K key, V value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns a collection containing the elements of this Hashtable\r\n\t \052/'"
   * @generated
   */
  Collection<V> values();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Removes the entry with key equals to \'key\'\r\n\t \052/'"
   * @generated
   */
  void remove(K key);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns a set containing the hash keys of this Hashtable\r\n\t \052/'"
   * @generated
   */
  Set<K> keys();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns an iterator over the Keys of this Hashtable\r\n\t \052/'"
   * @generated
   */
  Iterator<K> keyIterator();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns an iterator over the values of this Hashtable\r\n\t \052/'"
   * @generated
   */
  Iterator<V> valueIterator();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Integer"
   *        annotation="kermeta documentation='/**\r\n\t * Returns the size of this Hashtable\r\n\t \052/'"
   * @generated
   */
  int size();

} // Hashtable
