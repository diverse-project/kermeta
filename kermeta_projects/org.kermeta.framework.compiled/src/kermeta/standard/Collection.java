/**
 * <copyright>
 * </copyright>
 *
 * $Id: Collection.java,v 1.2 2008-08-19 13:23:04 cfaucher Exp $
 */
package kermeta.standard;

import java.util.ArrayList;

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
 *        annotation="kermeta EMF_needProperty='name=values isUnique=false isOrdered=false javaClass=java.util.ArrayList'"
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
	 * @see #setValues(ArrayList)
	 * @see kermeta.standard.StandardPackage#getCollection_Values()
	 * @model dataType="kermeta.standard.KermetaProperty_Collection_values<G>"
	 * @generated
	 */
	ArrayList<G> getValues();

	/**
	 * Sets the value of the '{@link kermeta.standard.Collection#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(ArrayList<G> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Removes all instances of element from the Collection, based on\r\n\t * G.equals(Object) definition\r\n\t \052/'"
	 *        annotation="kermeta.post doesntContainsElementAnymore=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n\n\t\n\telem = null;\n//Beginning of the Inlining of the function type: detect\n\nG result_ft27 = null;\n\n\tG elem_ft27 = null;\n\n\tresult_ft27 = null;\n\n\t\n\tkermeta.standard.Iterator<G> it_ft27 = this.iterator();\n\tjava.lang.Boolean idLoopCond_155 = false;\n\twhile( !idLoopCond_155 ) {\n\tidLoopCond_155 = kermeta.standard.helper.BooleanWrapper.or(it_ft27.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft27, null));;\n\tif ( idLoopCond_155 ) {\n\t} else {\n\n\telem_ft27 = it_ft27.next();\n\n\tjava.lang.Boolean idIfCond_156 = false;\n//Beginning of the Inlining of the lambda expression: detector\nG e = elem_ft27;\n\n\tidIfCond_156 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(e, element);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_156 ) {\n\n\tresult_ft27 = elem_ft27;\n}\n\n}\n\t}\n//End of the Inlining of the function type: detect\n\n\tjava.lang.Boolean idLoopCond_154 = false;\n\twhile( !idLoopCond_154 ) {\n\tidLoopCond_154 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(elem, null);;\n\tif ( idLoopCond_154 ) {\n\t} else {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n\n\telem = null;\n//Beginning of the Inlining of the function type: detect\n\nG result_ft28 = null;\n\n\tG elem_ft28 = null;\n\n\tresult_ft28 = null;\n\n\t\n\tkermeta.standard.Iterator<G> it_ft28 = this.iterator();\n\tjava.lang.Boolean idLoopCond_157 = false;\n\twhile( !idLoopCond_157 ) {\n\tidLoopCond_157 = kermeta.standard.helper.BooleanWrapper.or(it_ft28.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft28, null));;\n\tif ( idLoopCond_157 ) {\n\t} else {\n\n\telem_ft28 = it_ft28.next();\n\n\tjava.lang.Boolean idIfCond_158 = false;\n//Beginning of the Inlining of the lambda expression: detector\nG e = elem_ft28;\n\n\tidIfCond_158 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(e, element);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_158 ) {\n\n\tresult_ft28 = elem_ft28;\n}\n\n}\n\t}\n//End of the Inlining of the function type: detect\n\n}\n\t}\n'"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the number of instances of element in the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<G> result_ft29 = null;\n\n\tG elem_ft29 = null;\n\n\tresult_ft29 = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<G>\"));\n\n\t\n\tkermeta.standard.Iterator<G> it_ft29 = this.iterator();\n\tjava.lang.Boolean idLoopCond_159 = false;\n\twhile( !idLoopCond_159 ) {\n\tidLoopCond_159 = it_ft29.isOff();;\n\tif ( idLoopCond_159 ) {\n\t} else {\n\n\telem_ft29 = it_ft29.next();\n\n\tjava.lang.Boolean idIfCond_160 = false;\n//Beginning of the Inlining of the lambda expression: selector\nG e = elem_ft29;\n\n\tidIfCond_160 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(e, element);\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_160 ) {\n\n\tresult_ft29.add(elem_ft29);\n}\n\n}\n\t}\n//End of the Inlining of the function type: select\nresult = result_ft29.size();\n\nreturn result;\n'"
	 * @generated
	 */
	Integer count(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true if the Collection does not contain element\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(this.contains(element));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean excludes(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns an element from the Collection or void if the Collection is empty\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_161 = false;\n\tidIfCond_161 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_161 ) {\n\n\tresult = null;\n}\n else {\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tresult = it.next();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	G one();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true if current Collection contains all elements of Collection elements\r\n\t * See Collection<G>.contains(Object)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\t\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_162 = false;\n\twhile( !idLoopCond_162 ) {\n\tidLoopCond_162 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), kermeta.standard.helper.BooleanWrapper.not(result));;\n\tif ( idLoopCond_162 ) {\n\t} else {\n\n\tresult = this.contains(it.next());\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean containsAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Sum the element if they are summable (ie implement \'+\' operator by inheriting of the class Summable)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tG res = null;\n\n\tkermeta.standard.Summable<G> tmp = null;\n\n\tG o = null;\n\n\to = this.one();\n\n\ttmp = (kermeta.standard.Summable<G>) o;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_163 = false;\n\tidIfCond_163 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(tmp, null);\n\n\tif( idIfCond_163 ) {\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<G> it_ft30 = this.iterator();\n\tjava.lang.Boolean idLoopCond_164 = false;\n\twhile( !idLoopCond_164 ) {\n\tidLoopCond_164 = it_ft30.isOff();;\n\tif ( idLoopCond_164 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nG elem = it_ft30.next();\n\n\to = elem;\n\n\ttmp = (kermeta.standard.Summable<G>) o;\n\n\tjava.lang.Boolean idIfCond_165 = false;\n\tidIfCond_165 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(tmp, null);\n\n\tif( idIfCond_165 ) {\n\n\tres = tmp.plus(res);\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
	 * @generated
	 */
	G sum();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Collection contains at least one\r\n\t * instance of element, based on G.equals(elt : Object) definition\r\n\t * Note: for checking whether a physical element is contained by the collection,\r\n\t * make use of G.oid()\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\t\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_166 = false;\n\twhile( !idLoopCond_166 ) {\n\tidLoopCond_166 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), result);;\n\tif ( idLoopCond_166 ) {\n\t} else {\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(it.next(), element);\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean contains(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Adds an element in the Collection (default implementation)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.add(this, element);\n'"
	 * @generated
	 */
	void add(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new Sequence built from the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.Sequence<G> result = null;\nreturn result;'"
	 * @generated
	 */
	Sequence<G> asSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * OCL API alignment, doeas the same as contains\r\n\t * See Collection<G>.contains(Object)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.contains(element);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean includes(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true if the Collection contains no element of Collection elements\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\t\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_167 = false;\n\twhile( !idLoopCond_167 ) {\n\tidLoopCond_167 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), kermeta.standard.helper.BooleanWrapper.not(result));;\n\tif ( idLoopCond_167 ) {\n\t} else {\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(this.contains(it.next()));\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean excludesAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Removes all elements from the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.clear(this);\n'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * OCL alignment API, does the same as empty\r\n\t * See Collection<G>.empty()\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.empty();\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new Bag built from the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.Bag<G> result = null;\nreturn result;'"
	 * @generated
	 */
	Bag<G> asBag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns an element from the Collection\r\n\t * Raises an EmptyCollection exception if the Collection is empty\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_168 = false;\n\tidIfCond_168 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_168 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.EmptyCollection\")) );\n\n}\n\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tresult = it.next();\n\nreturn result;\n'"
	 * @generated
	 */
	G any();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Collection is empty\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean empty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * OCL alignment API\r\n\t * Returns a Boolean stating whether the Collection contains at least\r\n\t * one element \r\n\t * See also Collection<G>.contains(Object)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(this.empty());\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isNotEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns an Iterator on the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Iterator<G> result = null;\n\n\tresult = ((kermeta.standard.Iterator<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Iterator<G>\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.iterator(this, result);\n\nreturn result;\n'"
	 * @generated
	 */
	Iterator<G> iterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Adds all elements from the Collection elements in the current Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<G> it_ft31 = elements.iterator();\n\tjava.lang.Boolean idLoopCond_169 = false;\n\twhile( !idLoopCond_169 ) {\n\tidLoopCond_169 = it_ft31.isOff();;\n\tif ( idLoopCond_169 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nG element = it_ft31.next();\n\n\tthis.add(element);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n'"
	 * @generated
	 */
	void addAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * OCL API alignment, does the same as containsAll\r\n\t * See Collection<G>.containsAll(Collection<G>)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.containsAll(elements);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean includesAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the number of elements in the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.size(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Integer size();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new OrderedSet built from the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.OrderedSet<G> result = null;\nreturn result;'"
	 * @generated
	 */
	OrderedSet<G> asOrderedSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new Set built from the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.Set<G> result = null;\nreturn result;'"
	 * @generated
	 */
	Set<G> asSet();

} // Collection
