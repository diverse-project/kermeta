/**
 * <copyright>
 * </copyright>
 *
 * $Id: Collection.java,v 1.3 2008-09-22 14:48:27 cfaucher Exp $
 */
package kermeta.standard;

import org.eclipse.emf.common.util.EList;

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
 *        annotation="kermeta EMF_needProperty='name=values isUnique=false isOrdered=false javaClass=org.eclipse.emf.common.util.EList'"
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
	 * @see #setValues(EList)
	 * @see kermeta.standard.StandardPackage#getCollection_Values()
	 * @model dataType="kermeta.standard.KermetaProperty_Collection_values<G>" many="false"
	 * @generated
	 */
	EList<G> getValues();

	/**
	 * Sets the value of the '{@link kermeta.standard.Collection#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(EList<G> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Removes all instances of element from the Collection, based on\r\n\t * G.equals(Object) definition\r\n\t \052/'"
	 *        annotation="kermeta.post doesntContainsElementAnymore=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n\n\t\n\t//BIft:detect\n\nG result_ft8 = null;\n\n\tG elem_ft8 = null;\n\n\tresult_ft8 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft8 = this.iterator();\n\tjava.lang.Boolean idLoopCond_34 = false;\n\twhile( !idLoopCond_34 ) {\n\tidLoopCond_34 = kermeta.standard.helper.BooleanWrapper.or(it_ft8.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft8, null));\n\tif ( idLoopCond_34 ) {\n\t} else {\n\n\telem_ft8 = it_ft8.next();\n\n\tjava.lang.Boolean idIfCond_35 = false;\n//BIle:detector\nG e_lbdExp8 = elem_ft8;\n\n\tidIfCond_35 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(e_lbdExp8, element);\n//EIle:detector\n\n\n\tif( idIfCond_35 ) {\n\n\tresult_ft8 = elem_ft8;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft8;\n//EIft:detect\n\n\tjava.lang.Boolean idLoopCond_33 = false;\n\twhile( !idLoopCond_33 ) {\n\tidLoopCond_33 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(elem, null);\n\tif ( idLoopCond_33 ) {\n\t} else {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n\n\t//BIft:detect\n\nG result_ft9 = null;\n\n\tG elem_ft9 = null;\n\n\tresult_ft9 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft9 = this.iterator();\n\tjava.lang.Boolean idLoopCond_36 = false;\n\twhile( !idLoopCond_36 ) {\n\tidLoopCond_36 = kermeta.standard.helper.BooleanWrapper.or(it_ft9.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft9, null));\n\tif ( idLoopCond_36 ) {\n\t} else {\n\n\telem_ft9 = it_ft9.next();\n\n\tjava.lang.Boolean idIfCond_37 = false;\n//BIle:detector\nG e_lbdExp9 = elem_ft9;\n\n\tidIfCond_37 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(e_lbdExp9, element);\n//EIle:detector\n\n\n\tif( idIfCond_37 ) {\n\n\tresult_ft9 = elem_ft9;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft9;\n//EIft:detect\n\n}\n\t}\n'"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the number of instances of element in the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\t//BIft:select\n\nkermeta.standard.Sequence<G> result_ft10 = null;\n\n\tG elem_ft10 = null;\n\n\tresult_ft10 = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<G>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft10 = this.iterator();\n\tjava.lang.Boolean idLoopCond_38 = false;\n\twhile( !idLoopCond_38 ) {\n\tidLoopCond_38 = it_ft10.isOff();\n\tif ( idLoopCond_38 ) {\n\t} else {\n\n\telem_ft10 = it_ft10.next();\n\n\tjava.lang.Boolean idIfCond_39 = false;\n//BIle:selector\nG e_lbdExp10 = elem_ft10;\n\n\tidIfCond_39 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(e_lbdExp10, element);\n//EIle:selector\n\n\n\tif( idIfCond_39 ) {\n\n\tresult_ft10.add(elem_ft10);\n}\n\n}\n\t}\n}\n\n//EIft:select\nresult = result_ft10.size();\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_40 = false;\n\tidIfCond_40 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_40 ) {\n\n\tresult = null;\n}\n else {\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tresult = it.next();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	G one();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true if current Collection contains all elements of Collection elements\r\n\t * See Collection<G>.contains(Object)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_41 = false;\n\twhile( !idLoopCond_41 ) {\n\tidLoopCond_41 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), kermeta.standard.helper.BooleanWrapper.not(result));\n\tif ( idLoopCond_41 ) {\n\t} else {\n\n\tresult = this.contains(it.next());\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean containsAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Sum the element if they are summable (ie implement \'+\' operator by inheriting of the class Summable)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tG res = null;\n\n\tkermeta.standard.Summable<G> tmp = null;\n\n\tG o = null;\n\n\to = this.one();\n\n\ttmp = (kermeta.standard.Summable<G>) o;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_42 = false;\n\tidIfCond_42 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(tmp, null);\n\n\tif( idIfCond_42 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft11 = this.iterator();\n\tjava.lang.Boolean idLoopCond_43 = false;\n\twhile( !idLoopCond_43 ) {\n\tidLoopCond_43 = it_ft11.isOff();\n\tif ( idLoopCond_43 ) {\n\t} else {\n\n\t//BIle:func\nG elem_lbdExp11 = it_ft11.next();\n\n\to = elem_lbdExp11;\n\n\ttmp = (kermeta.standard.Summable<G>) o;\n\n\tjava.lang.Boolean idIfCond_44 = false;\n\tidIfCond_44 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(tmp, null);\n\n\tif( idIfCond_44 ) {\n\n\tres = tmp.plus(res);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
	 * @generated
	 */
	G sum();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Collection contains at least one\r\n\t * instance of element, based on G.equals(elt : Object) definition\r\n\t * Note: for checking whether a physical element is contained by the collection,\r\n\t * make use of G.oid()\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_45 = false;\n\twhile( !idLoopCond_45 ) {\n\tidLoopCond_45 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), result);\n\tif ( idLoopCond_45 ) {\n\t} else {\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(it.next(), element);\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean contains(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true if the Collection contains no element of Collection elements\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_46 = false;\n\twhile( !idLoopCond_46 ) {\n\tidLoopCond_46 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), kermeta.standard.helper.BooleanWrapper.not(result));\n\tif ( idLoopCond_46 ) {\n\t} else {\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(this.contains(it.next()));\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean excludesAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new Sequence built from the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.Sequence<G> result = null;\n\nreturn result;\n'"
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
	 * @model annotation="kermeta documentation='/**\r\n\t * Adds an element in the Collection (default implementation)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.add(this, element);\n'"
	 * @generated
	 */
	void add(G element);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.Bag<G> result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> asBag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns an element from the Collection\r\n\t * Raises an EmptyCollection exception if the Collection is empty\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_47 = false;\n\tidIfCond_47 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_47 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.EmptyCollection\")) );\n\n}\n\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tresult = it.next();\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft12 = elements.iterator();\n\tjava.lang.Boolean idLoopCond_48 = false;\n\twhile( !idLoopCond_48 ) {\n\tidLoopCond_48 = it_ft12.isOff();\n\tif ( idLoopCond_48 ) {\n\t} else {\n\n\t//BIle:func\nG element_lbdExp12 = it_ft12.next();\n\n\tthis.add(element_lbdExp12);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.OrderedSet<G> result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> asOrderedSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a new Set built from the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.Set<G> result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> asSet();

} // Collection
