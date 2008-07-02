/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderedCollection.java,v 1.1 2008-07-02 09:43:42 ftanguy Exp $
 */
package kermeta.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getOrderedCollection()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * An OrderedCollection is the root abstract class for all ordered Collections.\r\n \052/'"
 *        annotation="kermeta EMF_needReference='isUnique=false isOrdered=true javaClass=java.lang.ArrayList'"
 * @generated
 */
public interface OrderedCollection<G> extends Collection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\r\n\t * Adds element in the OrderedCollection at rank index\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t \052/'"
	 * @generated
	 */
	void addAt(int index, G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\r\n\t * Removes the element at rank index from the OrderedCollection\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t \052/'"
	 * @generated
	 */
	void removeAt(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns the last element in the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t \052/'"
	 * @generated
	 */
	G last();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides Object.equals(Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current OrderedCollection\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 * @generated
	 */
	boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/** \r\n\t * Returns the index of the first instance of element in the OrderedCollection\r\n\t * or -1 if the element is not contained by the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t \052/'"
	 * @generated
	 */
	int indexOf(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the element at rank index in the OrderedCollection\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t \052/'"
	 * @generated
	 */
	G elementAt(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \r\n\t * Returns the first element in the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t \052/'"
	 * @generated
	 */
	G first();

} // OrderedCollection
