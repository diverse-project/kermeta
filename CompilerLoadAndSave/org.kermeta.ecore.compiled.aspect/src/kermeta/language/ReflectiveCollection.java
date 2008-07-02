/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReflectiveCollection.java,v 1.1 2008-07-02 09:44:02 ftanguy Exp $
 */
package kermeta.language;

import kermeta.standard.Set;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflective Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.LanguagePackage#getReflectiveCollection()
 * @model annotation="kermeta documentation='/**\r\n * ReflectiveCollection is a special collection that is used to define the type \r\n * of attributes that have an upper multiplicity > 1 in a class. It indeed handles\r\n * the update of opposite property if such an attribute has got one.\r\n \052/'"
 * @generated
 */
public interface ReflectiveCollection<G> extends Set<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides kermeta::standard::Collection<G>.clear(G)\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides kermeta::standard::Set<G>.remove(G)\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides kermeta::standard::Set<G>.add(G)\r\n\t * Add an element to this collection and update its opposite property if it exists.\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 * @generated
	 */
	void add(G element);

} // ReflectiveCollection
