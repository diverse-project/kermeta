/**
 * <copyright>
 * </copyright>
 *
 * $Id: Hashtable.java,v 1.1 2008-09-04 15:40:27 cfaucher Exp $
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
 *
 * @see kermeta.utils.UtilsPackage#getHashtable()
 * @model annotation="kermeta documentation='/**\n * An implementation of hashtable\n * This implementation is for speed optimisation it cannot be serialized. \n * If your wish to serialize its content you need to copy its content into a classical ecore structure (attribute or references)\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\n \052/'"
 * @generated
 */
public interface Hashtable<K, V> extends kermeta.language.structure.Object {
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nV result = null;\n\n\tresult = (V) org.kermeta.compil.runtime.helper.basetypes.MapUtil.get(this, key);\n\nreturn result;\n'"
	 * @generated
	 */
	V getValue(K key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\t\n\t * Returns a Boolean stating whether a key is present or not in this Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getValue(key), null);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean containsKey(K key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a collection containing the elements of this Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Collection<V> result = null;\n\n\tresult = ((kermeta.standard.Bag<V>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<V>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<K> it_ft151 = this.keys().iterator();\n\tjava.lang.Boolean idLoopCond_704 = false;\n\twhile( !idLoopCond_704 ) {\n\tidLoopCond_704 = it_ft151.isOff();\n\tif ( idLoopCond_704 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nK k = it_ft151.next();\n\n\tresult.add(this.getValue(k));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<K> result = null;\n\n\tresult = ((kermeta.standard.Set<K>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<K>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<K> it = this.keyIterator();\n\tjava.lang.Boolean idLoopCond_705 = false;\n\twhile( !idLoopCond_705 ) {\n\tidLoopCond_705 = it.isOff();\n\tif ( idLoopCond_705 ) {\n\t} else {\n\n\tresult.add(it.next());\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<K> keys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns an iterator over the Keys of this Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Iterator<K> result = null;\n\n\tresult = (kermeta.standard.Iterator<K>) org.kermeta.compil.runtime.helper.basetypes.MapUtil.keysIterator(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Iterator<K> keyIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns an iterator over the values of this Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Iterator<V> result = null;\n\n\tresult = (kermeta.standard.Iterator<V>) org.kermeta.compil.runtime.helper.basetypes.MapUtil.valueIterator(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Iterator<V> valueIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Returns the size of this Hashtable\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.MapUtil.size(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Integer size();

} // Hashtable
