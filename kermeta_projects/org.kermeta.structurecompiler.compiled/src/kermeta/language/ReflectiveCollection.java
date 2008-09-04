/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReflectiveCollection.java,v 1.1 2008-09-04 15:40:29 cfaucher Exp $
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
 * @model annotation="kermeta documentation='/**\n * ReflectiveCollection is a special collection that is used to define the type \n * of attributes that have an upper multiplicity > 1 in a class. It indeed handles\n * the update of opposite property if such an attribute has got one.\n \052/'"
 * @generated
 */
public interface ReflectiveCollection<G> extends Set<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides kermeta::standard::Collection<G>.clear(G)\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil.clear(this);\n'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil.clear(self);\n'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides kermeta::standard::Set<G>.remove(G)\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil.remove(this, element);\n'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil.remove(self, element);\n'"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides kermeta::standard::Set<G>.add(G)\n\t * Add an element to this collection and update its opposite property if it exists.\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil.add(this, element);\n'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveCollectionUtil.add(self, element);\n'"
	 * @generated
	 */
	void add(G element);

} // ReflectiveCollection
