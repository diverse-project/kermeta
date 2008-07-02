/**
 * <copyright>
 * </copyright>
 *
 * $Id: Collection.java,v 1.1 2008-07-02 09:43:42 ftanguy Exp $
 */
package kermeta.standard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.standard.Collection#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.standard.StandardPackage#getCollection()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * Collection is the root abstract class for all kermeta collections\r\n \052/'"
 *        annotation="kermeta EMF_needReference='isUnique=false isOrdered=false javaClass=java.lang.ArrayList'"
 * @generated
 */
public interface Collection<G> extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(EList)
	 * @see kermeta.standard.StandardPackage#getCollection_Values()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<G> getValues();

	/**
	 * Sets the value of the '{@link kermeta.standard.Collection#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(EList<G> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rejectorType="kermeta.standard.KermetaSpecialTypesAlias"
	 *        rejectorAnnotation="kermeta.functionType 0='kermeta::standard::Collection::G' 1='kermeta::standard::Boolean'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new Sequence composed of elements of the Collection that\r\n\t * do not validate the rejector function\r\n\t * example :\r\n\t * aCollection2 := aCollection.reject { e | \r\n     *     \\/* put here a condition that returns true for elements that must  be exclude in the resulting Collection *\\/\r\n     * }\r\n\t \052/'"
	 * @generated
	 */
	Sequence<G> reject(EObject rejector);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Removes all instances of element from the Collection, based on\r\n\t * G.equals(Object) definition\r\n\t \052/'"
	 *        annotation="kermeta.post doesntContainsElementAnymore=''"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the number of instances of element in the Collection\r\n\t \052/'"
	 * @generated
	 */
	int count(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true if the Collection does not contain element\r\n\t \052/'"
	 * @generated
	 */
	boolean excludes(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns an element from the Collection or void if the Collection is empty\r\n\t \052/'"
	 * @generated
	 */
	G one();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true if current Collection contains all elements of Collection elements\r\n\t * See Collection<G>.contains(Object)\r\n\t \052/'"
	 * @generated
	 */
	boolean containsAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Sum the element if they are summable (ie implement \'+\' operator by inheriting of the class Summable)\r\n\t \052/'"
	 * @generated
	 */
	G sum();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Collection contains at least one\r\n\t * instance of element, based on G.equals(elt : Object) definition\r\n\t * Note: for checking whether a physical element is contained by the collection,\r\n\t * make use of G.oid()\r\n\t \052/'"
	 * @generated
	 */
	boolean contains(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true if the Collection contains no element of Collection elements\r\n\t \052/'"
	 * @generated
	 */
	boolean excludesAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * OCL API alignment, doeas the same as contains\r\n\t * See Collection<G>.contains(Object)\r\n\t \052/'"
	 * @generated
	 */
	boolean includes(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new Sequence built from the Collection\r\n\t \052/'"
	 * @generated
	 */
	Sequence<G> asSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Adds an element in the Collection (default implementation)\r\n\t \052/'"
	 * @generated
	 */
	void add(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Removes all elements from the Collection\r\n\t \052/'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * OCL alignment API, does the same as empty\r\n\t * See Collection<G>.empty()\r\n\t \052/'"
	 * @generated
	 */
	boolean isEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean" collectorType="kermeta.standard.KermetaSpecialTypesAlias"
	 *        collectorAnnotation="kermeta.functionType 0='kermeta::standard::Collection::G' 1='kermeta::standard::Collection::isUnique::T'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the the collector function evaluates to a\r\n\t * different value for each element of the Collection\r\n\t * example :\r\n\t * aCollection2 := aCollection.isUnique { e | \\/* put here an expression that must be unique for all elements, for example e.name *\\/ }\r\n\t \052/'"
	 * @generated
	 */
	<T> boolean isUnique(EObject collector);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new Bag built from the Collection\r\n\t \052/'"
	 * @generated
	 */
	Bag<G> asBag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns an element from the Collection\r\n\t * Raises an EmptyCollection exception if the Collection is empty\r\n\t \052/'"
	 * @generated
	 */
	G any();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Collection is empty\r\n\t \052/'"
	 * @generated
	 */
	boolean empty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean" fType="kermeta.standard.KermetaSpecialTypesAlias"
	 *        fAnnotation="kermeta.functionType 0='null' 1='kermeta::standard::Boolean'"
	 *        annotation="kermeta documentation='/**\r\n\t * To be written #####################################\r\n\t * => result := self.forAll{x | self.forAll {y | f(x,y)}}\r\n\t \052/'"
	 * @generated
	 */
	boolean forAllCpl(EObject f);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean" fType="kermeta.standard.KermetaSpecialTypesAlias"
	 *        fAnnotation="kermeta.functionType 0='null' 1='kermeta::standard::Boolean'"
	 *        annotation="kermeta documentation='/**\r\n\t * To be written #####################################\r\n\t * => result := self.exists{x | self.exists {y | f(x,y)}}\r\n\t \052/'"
	 * @generated
	 */
	boolean existsCpl(EObject f);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * OCL alignment API\r\n\t * Returns a Boolean stating whether the Collection contains at least\r\n\t * one element \r\n\t * See also Collection<G>.contains(Object)\r\n\t \052/'"
	 * @generated
	 */
	boolean isNotEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model detectorType="kermeta.standard.KermetaSpecialTypesAlias"
	 *        detectorAnnotation="kermeta.functionType 0='kermeta::standard::Collection::G' 1='kermeta::standard::Boolean'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns an element of the Collection (usually the first) for which the detector function\r\n\t * is not false\r\n\t * Returns void if no elements is validated by the detector function\r\n\t * example : \r\n\t * anObject := aCollection.detect { e | \\/* a condition *\\/} // returns an element that fulfill the condition.\r\n\t \052/'"
	 * @generated
	 */
	G detect(EObject detector);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns an Iterator on the Collection\r\n\t \052/'"
	 * @generated
	 */
	Iterator<G> iterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Adds all elements from the Collection elements in the current Collection\r\n\t \052/'"
	 * @generated
	 */
	void addAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * OCL API alignment, does the same as containsAll\r\n\t * See Collection<G>.containsAll(Collection<G>)\r\n\t \052/'"
	 * @generated
	 */
	boolean includesAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model selectorType="kermeta.standard.KermetaSpecialTypesAlias"
	 *        selectorAnnotation="kermeta.functionType 0='kermeta::standard::Collection::G' 1='kermeta::standard::Boolean'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new Sequence composed of elements of the Collection that\r\n\t * validate the selector function\r\n\t * example :\r\n\t * aCollection2 := aCollection.select { e | \r\n     *    \\/* put here a condition that returns true for elements that must  be included in the resulting Collection *\\/\r\n\t * }\r\n\t \052/'"
	 * @generated
	 */
	Sequence<G> select(EObject selector);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the number of elements in the Collection\r\n\t \052/'"
	 * @generated
	 */
	int size();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new OrderedSet built from the Collection\r\n\t \052/'"
	 * @generated
	 */
	OrderedSet<G> asOrderedSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean" funcType="kermeta.standard.KermetaSpecialTypesAlias"
	 *        funcAnnotation="kermeta.functionType 0='kermeta::standard::Collection::G' 1='kermeta::standard::Boolean'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether no element of the Collection invalidates\r\n\t * the condition specified by function func\r\n\t * example : \r\n\t * aBoolean := aCollection.forAll { e | \\/* put here a condition *\\/ } // return true if the condition is true for all elements in the collection.\r\n\t \052/'"
	 * @generated
	 */
	boolean forAll(EObject func);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean" funcType="kermeta.standard.KermetaSpecialTypesAlias"
	 *        funcAnnotation="kermeta.functionType 0='kermeta::standard::Collection::G' 1='kermeta::standard::Boolean'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether at least one element of the Collection\r\n\t * validates the condition specified by function func\r\n\t * example :\r\n\t * aBoolean := aCollection.exists { e | \\/* a condition *\\/} // returns true if at least one element fulfill the condition.\r\n\t \052/'"
	 * @generated
	 */
	boolean exists(EObject func);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model funcType="kermeta.standard.KermetaSpecialTypesAlias"
	 *        funcAnnotation="kermeta.functionType 0='kermeta::standard::Collection::G' 1='kermeta::language::structure::Object'"
	 *        annotation="kermeta documentation='/**\r\n\t * Runs function func on each element of the Collection\r\n\t * example : \r\n\t * aCollection.each { e | \\/* do something with each element e of this collection *\\/ }\r\n\t \052/'"
	 * @generated
	 */
	void each(EObject func);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model collectorType="kermeta.standard.KermetaSpecialTypesAlias"
	 *        collectorAnnotation="kermeta.functionType 0='kermeta::standard::Collection::G' 1='kermeta::standard::Collection::collect::T'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new Sequence which content corresponds to the result\r\n\t * of running the collector function for each element of the Collection\r\n\t * The new collection size is the same as in the original collection, and which element types is the type of the result of the expression.\r\n\t * example :\r\n\t * aCollection2 := aCollection.collect { e | \\/* put here an expression, for example e.name *\\/ } \r\n\t \052/'"
	 * @generated
	 */
	<T> Sequence<T> collect(EObject collector);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new Set built from the Collection\r\n\t \052/'"
	 * @generated
	 */
	Set<G> asSet();

} // Collection
