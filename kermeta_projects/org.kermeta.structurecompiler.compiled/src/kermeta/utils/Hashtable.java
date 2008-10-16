/**
 * <copyright>
 * </copyright>
 *
 * $Id: Hashtable.java,v 1.5 2008-10-16 13:18:13 cfaucher Exp $
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
 * @model annotation="kermeta documentation='/**\r\n * An implementation of hashtable\r\n * This implementation is for speed optimisation it cannot be serialized. \r\n * If your wish to serialize its content you need to copy its content into a classical ecore structure (attribute or references)\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\r\n \052/'"
 *        annotation="kermeta EMF_needProperty='name=wrappedHashtable isUnique=false isOrdered=false javaClass=java.util.Hashtable'"
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
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns the value for key \'key\' if it exists, otherwise returns Void\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nV result = null;\n\n\tresult = (V) org.kermeta.compil.runtime.helper.basetypes.MapUtil.get(this, key);\n\nreturn result;\n'"
	 * @generated
	 */
	V getValue(K key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Removes all elements from the Hashtable\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.MapUtil.clear(this);\n'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\t\r\n\t * Returns a Boolean stating whether a key is present or not in this Hashtable\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getValue(key), null);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean containsKey(K key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a collection containing the elements of this Hashtable\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Collection<V> result = null;\n\n\tresult = ((kermeta.standard.Bag<V>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<V>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<K> it_ft214 = this.keys().iterator();\n\tjava.lang.Boolean idLoopCond_962 = false;\n\twhile( !idLoopCond_962 ) {\n\tidLoopCond_962 = it_ft214.isOff();\n\tif ( idLoopCond_962 ) {\n\t} else {\n\n\t//BIle:func\nK k_lbdExp214 = it_ft214.next();\n\n\tresult.add(this.getValue(k_lbdExp214));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	Collection<V> values();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Adds a entry into the Hashtable\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.MapUtil.put(this, key, value);\n'"
	 * @generated
	 */
	void put(K key, V value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Removes the entry with key equals to \'key\'\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.MapUtil.remove(this, key);\n'"
	 * @generated
	 */
	void remove(K key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a set containing the hash keys of this Hashtable\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<K> result = null;\n\n\tresult = ((kermeta.standard.Set<K>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<K>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<K> it = this.keyIterator();\n\tjava.lang.Boolean idLoopCond_963 = false;\n\twhile( !idLoopCond_963 ) {\n\tidLoopCond_963 = it.isOff();\n\tif ( idLoopCond_963 ) {\n\t} else {\n\n\tresult.add(it.next());\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<K> keys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns an iterator over the Keys of this Hashtable\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Iterator<K> result = null;\n\n\tresult = (kermeta.standard.Iterator<K>) org.kermeta.compil.runtime.helper.basetypes.MapUtil.keysIterator(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Iterator<K> keyIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns an iterator over the values of this Hashtable\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Iterator<V> result = null;\n\n\tresult = (kermeta.standard.Iterator<V>) org.kermeta.compil.runtime.helper.basetypes.MapUtil.valueIterator(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Iterator<V> valueIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the size of this Hashtable\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.MapUtil.size(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Integer size();

} // Hashtable
