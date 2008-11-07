/**
 * <copyright>
 * </copyright>
 *
 * $Id: Collection.java,v 1.8 2008-11-07 08:53:22 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n\n\t\n\t//BIft:detect\n\nG result_ft185 = null;\n\n\tG elem_ft185 = null;\n\n\tresult_ft185 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft185 = this.iterator();\n\tjava.lang.Boolean idLoopCond_830 = false;\n\twhile( !idLoopCond_830 ) {\n\tidLoopCond_830 = kermeta.standard.helper.BooleanWrapper.or(it_ft185.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft185, null));\n\tif ( idLoopCond_830 ) {\n\t} else {\n\n\telem_ft185 = it_ft185.next();\n\n\tjava.lang.Boolean idIfCond_831 = false;\n//BIle:detector\nG e_lbdExp185 = elem_ft185;\n\n\tidIfCond_831 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp185, element);\n//EIle:detector\n\n\n\tif( idIfCond_831 ) {\n\n\tresult_ft185 = elem_ft185;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft185;\n//EIft:detect\n\n\tjava.lang.Boolean idLoopCond_829 = false;\n\twhile( !idLoopCond_829 ) {\n\tidLoopCond_829 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(elem, null);\n\tif ( idLoopCond_829 ) {\n\t} else {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n\n\t//BIft:detect\n\nG result_ft186 = null;\n\n\tG elem_ft186 = null;\n\n\tresult_ft186 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft186 = this.iterator();\n\tjava.lang.Boolean idLoopCond_832 = false;\n\twhile( !idLoopCond_832 ) {\n\tidLoopCond_832 = kermeta.standard.helper.BooleanWrapper.or(it_ft186.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft186, null));\n\tif ( idLoopCond_832 ) {\n\t} else {\n\n\telem_ft186 = it_ft186.next();\n\n\tjava.lang.Boolean idIfCond_833 = false;\n//BIle:detector\nG e_lbdExp186 = elem_ft186;\n\n\tidIfCond_833 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp186, element);\n//EIle:detector\n\n\n\tif( idIfCond_833 ) {\n\n\tresult_ft186 = elem_ft186;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft186;\n//EIft:detect\n\n}\n\t}\n\n//PostConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"post__40064167__doesntContainsElementAnymore\" ) ) {\njava.lang.Boolean result_post = false;\n\n\tresult_post = kermeta.standard.helper.BooleanWrapper.not(this.contains(element));\nif( !result_post ) {\nkermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}'"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the number of instances of element in the Collection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\t//BIft:select\n\nkermeta.standard.Sequence<G> result_ft187 = null;\n\n\tG elem_ft187 = null;\n\n\tresult_ft187 = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<G>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft187 = this.iterator();\n\tjava.lang.Boolean idLoopCond_834 = false;\n\twhile( !idLoopCond_834 ) {\n\tidLoopCond_834 = it_ft187.isOff();\n\tif ( idLoopCond_834 ) {\n\t} else {\n\n\telem_ft187 = it_ft187.next();\n\n\tjava.lang.Boolean idIfCond_835 = false;\n//BIle:selector\nG e_lbdExp187 = elem_ft187;\n\n\tidIfCond_835 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp187, element);\n//EIle:selector\n\n\n\tif( idIfCond_835 ) {\n\n\tresult_ft187.add(elem_ft187);\n}\n\n}\n\t}\n}\n\n//EIft:select\nresult = result_ft187.size();\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_836 = false;\n\tidIfCond_836 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_836 ) {\n\n\tresult = null;\n}\n else {\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tresult = it.next();\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	G one();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true if current Collection contains all elements of Collection elements\r\n\t * See Collection<G>.contains(Object)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_837 = false;\n\twhile( !idLoopCond_837 ) {\n\tidLoopCond_837 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), kermeta.standard.helper.BooleanWrapper.not(result));\n\tif ( idLoopCond_837 ) {\n\t} else {\n\n\tresult = this.contains(it.next());\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean containsAll(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Sum the element if they are summable (ie implement \'+\' operator by inheriting of the class Summable)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tG res = null;\n\n\tkermeta.standard.Summable<G> tmp = null;\n\n\tG o = null;\n\n\to = this.one();\n\n\ttmp = (kermeta.standard.Summable<G>) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.standard.Summable<G>>asTypeOrVoid(o);\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_838 = false;\n\tidIfCond_838 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(tmp, null);\n\n\tif( idIfCond_838 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft188 = this.iterator();\n\tjava.lang.Boolean idLoopCond_839 = false;\n\twhile( !idLoopCond_839 ) {\n\tidLoopCond_839 = it_ft188.isOff();\n\tif ( idLoopCond_839 ) {\n\t} else {\n\n\t//BIle:func\nG elem_lbdExp188 = it_ft188.next();\n\n\to = elem_lbdExp188;\n\n\ttmp = (kermeta.standard.Summable<G>) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.standard.Summable<G>>asTypeOrVoid(o);\n\n\tjava.lang.Boolean idIfCond_840 = false;\n\tidIfCond_840 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(tmp, null);\n\n\tif( idIfCond_840 ) {\n\n\tres = tmp.plus(res);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
	 * @generated
	 */
	G sum();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Collection contains at least one\r\n\t * instance of element, based on G.equals(elt : Object) definition\r\n\t * Note: for checking whether a physical element is contained by the collection,\r\n\t * make use of G.oid()\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_841 = false;\n\twhile( !idLoopCond_841 ) {\n\tidLoopCond_841 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), result);\n\tif ( idLoopCond_841 ) {\n\t} else {\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(it.next(), element);\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean contains(G element);

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
	 * @model annotation="kermeta documentation='/**\r\n\t * Adds an element in the Collection (default implementation)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.add(this, element);\n'"
	 * @generated
	 */
	void add(G element);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = true;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_842 = false;\n\twhile( !idLoopCond_842 ) {\n\tidLoopCond_842 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), kermeta.standard.helper.BooleanWrapper.not(result));\n\tif ( idLoopCond_842 ) {\n\t} else {\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(this.contains(it.next()));\n}\n\t}\n}\n\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.standard.Bag<G> result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> asBag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns an element from the Collection\r\n\t * Raises an EmptyCollection exception if the Collection is empty\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_843 = false;\n\tidIfCond_843 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_843 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.EmptyCollection\")) );\n\n}\n\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tresult = it.next();\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft189 = elements.iterator();\n\tjava.lang.Boolean idLoopCond_844 = false;\n\twhile( !idLoopCond_844 ) {\n\tidLoopCond_844 = it_ft189.isOff();\n\tif ( idLoopCond_844 ) {\n\t} else {\n\n\t//BIle:func\nG element_lbdExp189 = it_ft189.next();\n\n\tthis.add(element_lbdExp189);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.ExecutionContext.getInstance().<java.lang.Integer>asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.size(this));\n\nreturn result;\n'"
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
