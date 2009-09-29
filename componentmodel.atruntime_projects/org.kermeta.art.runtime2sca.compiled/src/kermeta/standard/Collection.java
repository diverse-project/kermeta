/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.standard;

import java.lang.Boolean;
import java.lang.Integer;

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
 *        annotation="kermeta documentation='/**\n * Collection is the root abstract class for all kermeta collections\n \052/'"
 *        annotation="kermeta EMF_needProperty='name=values javaClass=org.eclipse.emf.common.util.EList'"
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
	 * @model annotation="kermeta documentation='/**\n\t * Adds an element in the Collection (default implementation)\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.add(this, element);\n'"
	 * @generated
	 */
	void add(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Returns the number of elements in the Collection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.size(this), \"java.lang.Integer\");\n\nreturn result;\n'"
	 * @generated
	 */
	Integer size();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Returns the number of instances of element in the Collection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\t//BIft:select\n\nkermeta.standard.Sequence<G> result_ft36 = null;\n\n\tG elem_ft36 = null;\n\n\tresult_ft36 = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft36 = this.iterator();\n\tjava.lang.Boolean idLoopCond_147 = false;\n\twhile( !idLoopCond_147 ) {\n\tidLoopCond_147 = it_ft36.isOff();\n\tif ( idLoopCond_147 ) {\n\t} else {\n\n\telem_ft36 = it_ft36.next();\n\n\tjava.lang.Boolean idIfCond_148 = false;\n//BIle:selector\nG e_lbdExp36 = elem_ft36;\n\n\tidIfCond_148 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp36, element);\n//EIle:selector\n\n\n\tif( idIfCond_148 ) {\n\n\tresult_ft36.add(elem_ft36);\n}\n\n}\n\t}\n}\n\n//EIft:select\nresult = result_ft36.size();\n\nreturn result;\n'"
	 * @generated
	 */
	Integer count(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the Collection contains at least one\n\t * instance of element, based on G.equals(elt : Object) definition\n\t * Note: for checking whether a physical element is contained by the collection,\n\t * make use of G.oid()\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_149 = false;\n\twhile( !idLoopCond_149 ) {\n\tidLoopCond_149 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), result);\n\tif ( idLoopCond_149 ) {\n\t} else {\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(it.next(), element);\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean contains(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Removes all instances of element from the Collection, based on\n\t * G.equals(Object) definition\n\t \052/'"
	 *        annotation="kermeta.post doesntContainsElementAnymore=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n\n\t\n\t//BIft:detect\n\nG result_ft37 = null;\n\n\tG elem_ft37 = null;\n\n\tresult_ft37 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft37 = this.iterator();\n\tjava.lang.Boolean idLoopCond_151 = false;\n\twhile( !idLoopCond_151 ) {\n\tidLoopCond_151 = kermeta.standard.helper.BooleanWrapper.or(it_ft37.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft37, null));\n\tif ( idLoopCond_151 ) {\n\t} else {\n\n\telem_ft37 = it_ft37.next();\n\n\tjava.lang.Boolean idIfCond_152 = false;\n//BIle:detector\nG e_lbdExp37 = elem_ft37;\n\n\tidIfCond_152 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp37, element);\n//EIle:detector\n\n\n\tif( idIfCond_152 ) {\n\n\tresult_ft37 = elem_ft37;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft37;\n//EIft:detect\n\n\tjava.lang.Boolean idLoopCond_150 = false;\n\twhile( !idLoopCond_150 ) {\n\tidLoopCond_150 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(elem, null);\n\tif ( idLoopCond_150 ) {\n\t} else {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n\n\t//BIft:detect\n\nG result_ft38 = null;\n\n\tG elem_ft38 = null;\n\n\tresult_ft38 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft38 = this.iterator();\n\tjava.lang.Boolean idLoopCond_153 = false;\n\twhile( !idLoopCond_153 ) {\n\tidLoopCond_153 = kermeta.standard.helper.BooleanWrapper.or(it_ft38.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft38, null));\n\tif ( idLoopCond_153 ) {\n\t} else {\n\n\telem_ft38 = it_ft38.next();\n\n\tjava.lang.Boolean idIfCond_154 = false;\n//BIle:detector\nG e_lbdExp38 = elem_ft38;\n\n\tidIfCond_154 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp38, element);\n//EIle:detector\n\n\n\tif( idIfCond_154 ) {\n\n\tresult_ft38 = elem_ft38;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft38;\n//EIft:detect\n\n}\n\t}\n\n//PostConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"post__25069561__doesntContainsElementAnymore\" ) ) {\njava.lang.Boolean result_post = false;\n\n\tresult_post = kermeta.standard.helper.BooleanWrapper.not(this.contains(element));\nif( !result_post ) {\nkermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}'"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Adds all elements from the Collection elements in the current Collection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft39 = elements.iterator();\n\tjava.lang.Boolean idLoopCond_155 = false;\n\twhile( !idLoopCond_155 ) {\n\tidLoopCond_155 = it_ft39.isOff();\n\tif ( idLoopCond_155 ) {\n\t} else {\n\n\t//BIle:func\nG element_lbdExp39 = it_ft39.next();\n\n\tthis.add(element_lbdExp39);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void addAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a new Sequence built from the Collection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.Sequence<G> result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> asSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a new OrderedSet built from the Collection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.OrderedSet<G> result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> asOrderedSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a new Bag built from the Collection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.Bag<G> result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> asBag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a new Set built from the Collection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.Set<G> result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> asSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns true if the Collection does not contain element\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(this.contains(element));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean excludes(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns an element from the Collection or void if the Collection is empty\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_156 = false;\n\tidIfCond_156 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_156 ) {\n\n\tresult = null;\n}\n else {\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tresult = it.next();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	G one();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns true if current Collection contains all elements of Collection elements\n\t * See Collection<G>.contains(Object)\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_157 = false;\n\twhile( !idLoopCond_157 ) {\n\tidLoopCond_157 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), kermeta.standard.helper.BooleanWrapper.not(result));\n\tif ( idLoopCond_157 ) {\n\t} else {\n\n\tresult = this.contains(it.next());\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean containsAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Sum the element if they are summable (ie implement \'+\' operator by inheriting of the class Summable)\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tG res = null;\n\n\tkermeta.standard.Summable<G> tmp = null;\n\n\tG o = null;\n\n\to = this.one();\n\n\ttmp = (kermeta.standard.Summable<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(o, \"kermeta.standard.Summable<G>\");\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_158 = false;\n\tidIfCond_158 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(tmp, null);\n\n\tif( idIfCond_158 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft40 = this.iterator();\n\tjava.lang.Boolean idLoopCond_159 = false;\n\twhile( !idLoopCond_159 ) {\n\tidLoopCond_159 = it_ft40.isOff();\n\tif ( idLoopCond_159 ) {\n\t} else {\n\n\t//BIle:func\nG elem_lbdExp40 = it_ft40.next();\n\n\to = elem_lbdExp40;\n\n\ttmp = (kermeta.standard.Summable<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(o, \"kermeta.standard.Summable<G>\");\n\n\tjava.lang.Boolean idIfCond_160 = false;\n\tidIfCond_160 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(tmp, null);\n\n\tif( idIfCond_160 ) {\n\n\tres = tmp.plus(res);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
	 * @generated
	 */
	G sum();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns true if the Collection contains no element of Collection elements\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_161 = false;\n\twhile( !idLoopCond_161 ) {\n\tidLoopCond_161 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), kermeta.standard.helper.BooleanWrapper.not(result));\n\tif ( idLoopCond_161 ) {\n\t} else {\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(this.contains(it.next()));\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean excludesAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * OCL API alignment, doeas the same as contains\n\t * See Collection<G>.contains(Object)\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.contains(element);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean includes(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Removes all elements from the Collection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.clear(this);\n'"
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the Collection is empty\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean empty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * OCL alignment API, does the same as empty\n\t * See Collection<G>.empty()\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.empty();\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns an element from the Collection\n\t * Raises an EmptyCollection exception if the Collection is empty\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_162 = false;\n\tidIfCond_162 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_162 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getEmptyCollection())) );\n\n}\n\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tresult = it.next();\n\nreturn result;\n'"
	 * @generated
	 */
	G any();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * OCL alignment API\n\t * Returns a Boolean stating whether the Collection contains at least\n\t * one element \n\t * See also Collection<G>.contains(Object)\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(this.empty());\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isNotEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns an Iterator on the Collection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Iterator<G> result = null;\n\n\tresult = ((kermeta.standard.Iterator<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getIterator()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.iterator(this, result);\n\nreturn result;\n'"
	 * @generated
	 */
	Iterator<G> iterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * OCL API alignment, does the same as containsAll\n\t * See Collection<G>.containsAll(Collection<G>)\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.containsAll(elements);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean includesAll(Collection<G> elements);

} // Collection
