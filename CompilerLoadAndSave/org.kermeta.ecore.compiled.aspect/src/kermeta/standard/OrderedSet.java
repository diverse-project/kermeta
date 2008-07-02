/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderedSet.java,v 1.1 2008-07-02 09:43:42 ftanguy Exp $
 */
package kermeta.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Set</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getOrderedSet()
 * @model annotation="kermeta documentation='/**\r\n * An OrderedSet is a Set that contained ordered distinct elements\r\n \052/'"
 *        annotation="kermeta EMF_needReference='isUnique=true isOrdered=true javaClass=java.lang.ArrayList'"
 * @generated
 */
public interface OrderedSet<G> extends Set<G>, OrderedCollection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted in head\r\n\t \052/'"
	 * @generated
	 */
	OrderedSet<G> append(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted at rank index\r\n\t \052/'"
	 * @generated
	 */
	OrderedSet<G> insertAt(int index, G subject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides OrderedCollection<G>.addAt(Integer, G)\r\n\t * Adds element in the OrderedSet at rank index if the ordered set does\r\n\t * not already contain the element, does nothing otherwise\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::OrderedCollection'"
	 * @generated
	 */
	void addAt(int index, G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted in tail\r\n\t \052/'"
	 * @generated
	 */
	OrderedSet<G> preppend(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * See OrderedCollection<G>.equals(Object) \r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::OrderedCollection'"
	 * @generated
	 */
	boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns element at rank index in the sequence\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedSet\r\n\t \052/'"
	 * @generated
	 */
	G at(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="kermeta documentation='/**\r\n\t * See Set<G>.add(G)\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 * @generated
	 */
	void add(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model minDataType="kermeta.standard.Integer" maxDataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\r\n\t * Builds and returns a new OrderedSet composed of elements of current ordered\r\n\t * set from rank min to rank max (order is respected)\r\n\t * Raises IndexOutOfBound exception if min is negative, max is larger than \r\n\t * the size of the ordered set or min is larger than max\r\n\t \052/'"
	 * @generated
	 */
	OrderedSet<G> subSet(int min, int max);

} // OrderedSet
