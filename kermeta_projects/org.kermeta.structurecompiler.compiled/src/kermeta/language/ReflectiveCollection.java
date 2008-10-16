/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReflectiveCollection.java,v 1.5 2008-10-16 13:18:08 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil.clear(this);\n'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides kermeta::standard::Set<G>.remove(G)\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil.remove(this, element);\n'"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides kermeta::standard::Set<G>.add(G)\r\n\t * Add an element to this collection and update its opposite property if it exists.\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil.add(this, element);\n'"
	 * @generated
	 */
	void add(G element);

} // ReflectiveCollection
