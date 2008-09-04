/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReflectiveSequence.java,v 1.1 2008-09-04 15:40:29 cfaucher Exp $
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
 * @model annotation="kermeta documentation='/**\n * ReflectiveSequence is an ordered ReflectiveCollection.\n \052/'"
 * @generated
 */
public interface ReflectiveSequence<G> extends OrderedSet<G>,
		ReflectiveCollection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides kermeta::language::ReflectiveCollection<G>.clear()\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::ReflectiveCollection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.helper.ReflectiveCollectionSuper.super_clear(this);\n'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Overrides kermeta::standard::OrderedSet.addAt(Integer)\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::OrderedSet'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveSequenceUtil.addAt(this, index, element);\n'"
	 * @generated
	 */
	void addAt(Integer index, G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Overrides kermeta::standard::OrderedSet.removeAt(Integer)\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::OrderedCollection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ReflectiveSequenceUtil.removeAt(this, index);\n'"
	 * @generated
	 */
	void removeAt(Integer index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides kermeta::language::ReflectiveCollection<G>.remove(G)\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::ReflectiveCollection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.helper.ReflectiveCollectionSuper.super_remove(this, element);\n'"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Overrides kermeta::standard::OrderedSet.equals(Object)\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::OrderedSet'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = super.equals(element);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides kermeta::language::ReflectiveCollection<G>.add(G)\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::ReflectiveCollection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.helper.ReflectiveCollectionSuper.super_add(this, element);\n'"
	 * @generated
	 */
	void add(G element);

} // ReflectiveSequence
