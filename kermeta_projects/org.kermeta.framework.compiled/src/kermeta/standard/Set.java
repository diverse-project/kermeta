/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Set.java,v 1.1 2008-06-24 14:23:37 cfaucher Exp $
 */
package kermeta.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getSet()
 * @model annotation="kermeta documentation='/**\r\n * A Set is a non-ordered collection that contains distinct elements\r\n * (with regards to the G.equals(Object) operation)\r\n \052/'"
 *        annotation="kermeta EMF_needReference='isUnique=true isOrdered=false javaClass=java.lang.ArrayList'"
 * @generated
 */
public interface Set<G> extends Collection<G>
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Set corresponding to the intersection of the Set elements\r\n\t * with the current Set\r\n\t \052/'"
   * @generated
   */
  Set<G> intersection(Collection<G> elements);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Set corresponding to the difference between the\r\n\t * current Set and the Set elements, ie all elements contained by \r\n\t * the current Set that do not appear in the elements Set \r\n\t \052/'"
   * @generated
   */
  Set<G> minus(Set<G> elements);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.remove(G)\r\n\t * Removes the element from the Set if it is contained by the Set\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::standard::Collection'"
   * @generated
   */
  void remove(G element);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n\t * Overrides Object.equals(Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Set\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
   * @generated
   */
  boolean equals(kermeta.language.structure.Object element);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model comparatorType="kermeta.standard.KermetaSpecialTypesAlias"
   *        comparatorAnnotation="kermeta.functionType 0='null' 1='kermeta::standard::Integer'"
   *        annotation="kermeta documentation='/**\r\n\t * Returns a ordered set of the bag elements sorted using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t \052/'"
   * @generated
   */
  OrderedSet<G> sortedBy(Object comparator);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.add(G)\r\n\t * Adds elt to the Set if it is not already contained by the\r\n\t * Set, does nothing otherwise\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::standard::Collection'"
   * @generated
   */
  void add(G element);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asSequence()\r\n\t * Returns a new Sequence composed of all elements of current Set\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::standard::Collection'"
   * @generated
   */
  Sequence<G> asSequence();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model comparatorType="kermeta.standard.KermetaSpecialTypesAlias"
   *        comparatorAnnotation="kermeta.functionType 0='null' 1='kermeta::standard::Integer'"
   *        annotation="kermeta documentation='/**\r\n\t * Recursive sort of the given (ordered) set using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t \052/'"
   * @generated
   */
  OrderedSet<G> quickSort(OrderedSet<G> q, Object comparator);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Internal concatenation tool for recursive \'quickSort()\' method\r\n\t \052/'"
   * @generated
   */
  OrderedSet<G> concatenate(OrderedSet<G> less, OrderedSet<G> pivot, OrderedSet<G> greater);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Set which contents corresponds to the symmetric\r\n\t * difference between current Set and Set s, ie all elements of\r\n\t * each Set that do not appear in the other one\r\n\t \052/'"
   * @generated
   */
  Set<G> symmetricDifference(Set<G> s);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Set which content includes all non-Collection elements\r\n\t * of the current Set, and, for each Collection element of the current\r\n\t * Set, as many elements as the Collection contains\r\n\t * Duplicates are removed\r\n\t \052/'"
   * @generated
   */
  Set<kermeta.language.structure.Object> flatten();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asOrderedSet()\r\n\t * Returns a new OrderedSet that contains all elements of current Set\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::standard::Collection'"
   * @generated
   */
  OrderedSet<G> asOrderedSet();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asBag()\r\n\t * Returns a new Bag composed of all elements of current Set\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::standard::Collection'"
   * @generated
   */
  Bag<G> asBag();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Set corresponding to the union of the Set elements\r\n\t * with the current Set\r\n\t \052/'"
   * @generated
   */
  Set<G> union(Set<G> elements);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag corresponding to the union of the Bag elements\r\n\t * with the current Set\r\n\t \052/'"
   * @generated
   */
  Bag<G> unionWithBag(Bag<G> elements);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asSet()\r\n\t * Returns a new Set composed of all elements of current Set\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::standard::Collection'"
   * @generated
   */
  Set<G> asSet();

} // Set
