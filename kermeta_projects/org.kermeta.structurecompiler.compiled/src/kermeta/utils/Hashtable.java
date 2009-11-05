/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.utils.Hashtable#getWrappedHashtable <em>Wrapped Hashtable</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.utils.UtilsPackage#getHashtable()
 * @model annotation="kermeta documentation='/**\n * An implementation of hashtable\n * This implementation is for speed optimisation it cannot be serialized. \n * If your wish to serialize its content you need to copy its content into a classical ecore structure (attribute or references)\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\n \052/'"
 *        annotation="kermeta EMF_needProperty='name=wrappedHashtable javaClass=java.util.Hashtable'"
 * @generated
 */
public interface Hashtable<K, V> extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Wrapped Hashtable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Hashtable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Hashtable</em>' attribute.
	 * @see #setWrappedHashtable(java.util.Hashtable)
	 * @see kermeta.utils.UtilsPackage#getHashtable_WrappedHashtable()
	 * @model dataType="kermeta.utils.KermetaProperty_Hashtable_wrappedHashtable<K, V>"
	 * @generated
	 */
	java.util.Hashtable<K, V> getWrappedHashtable();

	/**
	 * Sets the value of the '{@link kermeta.utils.Hashtable#getWrappedHashtable <em>Wrapped Hashtable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Hashtable</em>' attribute.
	 * @see #getWrappedHashtable()
	 * @generated
	 */
	void setWrappedHashtable(java.util.Hashtable<K, V> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Removes all elements from the Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.MapUtil.clear(this);\n'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns the value for key \'key\' if it exists, otherwise returns Void\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nV result = null;\n\n\tresult = (V) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.MapUtil.get(this, key), \"V\");\n\nreturn result;\n'"
	 * @generated
	 */
	V getValue(K key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\t\n\t * Returns a Boolean stating whether a key is present or not in this Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getValue(key), null);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean containsKey(K key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a collection containing the elements of this Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Collection<V> result = null;\n\n\tresult = ((kermeta.standard.Bag<V>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<K> it_ft215 = this.keys().iterator();\n\tjava.lang.Boolean idLoopCond_966 = false;\n\twhile( !idLoopCond_966 ) {\n\tidLoopCond_966 = it_ft215.isOff();\n\tif ( idLoopCond_966 ) {\n\t} else {\n\n\t//BIle:func\nK k_lbdExp215 = it_ft215.next();\n\n\tresult.add(this.getValue(k_lbdExp215));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	Collection<V> values();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Adds a entry into the Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.MapUtil.put(this, key, value);\n'"
	 * @generated
	 */
	void put(K key, V value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Removes the entry with key equals to \'key\'\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.MapUtil.remove(this, key);\n'"
	 * @generated
	 */
	void remove(K key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a set containing the hash keys of this Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<K> result = null;\n\n\tresult = ((kermeta.standard.Set<K>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<K> it = this.keyIterator();\n\tjava.lang.Boolean idLoopCond_967 = false;\n\twhile( !idLoopCond_967 ) {\n\tidLoopCond_967 = it.isOff();\n\tif ( idLoopCond_967 ) {\n\t} else {\n\n\tresult.add(it.next());\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<K> keys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns an iterator over the Keys of this Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Iterator<K> result = null;\n\n\tresult = (kermeta.standard.Iterator<K>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.MapUtil.keysIterator(this), \"kermeta.standard.Iterator<K>\");\n\nreturn result;\n'"
	 * @generated
	 */
	Iterator<K> keyIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns an iterator over the values of this Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Iterator<V> result = null;\n\n\tresult = (kermeta.standard.Iterator<V>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.MapUtil.valueIterator(this), \"kermeta.standard.Iterator<V>\");\n\nreturn result;\n'"
	 * @generated
	 */
	Iterator<V> valueIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Returns the size of this Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.MapUtil.size(this), \"java.lang.Integer\");\n\nreturn result;\n'"
	 * @generated
	 */
	Integer size();

} // Hashtable
