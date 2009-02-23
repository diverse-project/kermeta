/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Bag.java,v 1.12 2009-02-23 15:26:46 cfaucher Exp $
 */
package kermeta.standard;

import java.lang.Boolean;
import java.lang.Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bag</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getBag()
 * @model annotation="kermeta documentation='/**\r\n * Bag is a concrete non-ordered Collection allowing duplicates\r\n \052/'"
 * @generated
 */
public interface Bag<G> extends Collection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag corresponding to the intersection of elements\r\n\t * and the Bag\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\tG elem = null;\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_897 = false;\n\twhile( !idLoopCond_897 ) {\n\tidLoopCond_897 = it.isOff();\n\tif ( idLoopCond_897 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_898 = false;\n\tidIfCond_898 = elements.contains(elem);\n\n\tif( idIfCond_898 ) {\n\n\tjava.lang.Boolean idIfCond_899 = false;\n\tidIfCond_899 = kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(this.count(elem), elements.count(elem));\n\n\tif( idIfCond_899 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\n\tit = elements.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_900 = false;\n\twhile( !idLoopCond_900 ) {\n\tidLoopCond_900 = it.isOff();\n\tif ( idLoopCond_900 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_901 = false;\n\tidIfCond_901 = this.contains(elem);\n\n\tif( idIfCond_901 ) {\n\n\tjava.lang.Boolean idIfCond_902 = false;\n\tidIfCond_902 = kermeta.standard.helper.IntegerWrapper.isLower(elements.count(elem), this.count(elem));\n\n\tif( idIfCond_902 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> intersection(Bag<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides Object.equals(elt : Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Bag\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_903 = false;\n\tidIfCond_903 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(element));\n\n\tif( idIfCond_903 ) {\n\n\tjava.lang.Boolean idIfCond_904 = false;\n\tidIfCond_904 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<G>\"), element);\n\n\tif( idIfCond_904 ) {\n\n\tkermeta.standard.Bag<G> collection = null;\n\n\tcollection = (kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(element, \"kermeta.standard.Bag<G>\");\n\n\tkermeta.standard.Set<G> selfAsSet = this.asSet();\n\n\tisEqual = selfAsSet.equals(collection.asSet());\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asSequence()\r\n\t * Returns a new Sequence containing all elements of current Bag\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tkermeta.standard.Sequence<G> s = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> asSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a sequence of the bag elements sorted using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t \052/'"
	 *        annotation="kermeta documentation='/**\r\n\t * Recursive sort of the given sequence using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t \052/'"
	 *        annotation="kermeta documentation='/**\r\n\t * Internal concatenation tool for recursive \'quickSort()\' method\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tresult = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\tresult.addAll(less);\n\n\tresult.addAll(pivot);\n\n\tresult.addAll(greater);\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> concatenate(Sequence<G> less, Sequence<G> pivot,
			Sequence<G> greater);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag which content includes the content of the\r\n\t * current Bag from which all instances of object have been\r\n\t * removed\r\n \t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\ts.addAll(this);\n\n\ts.remove(object);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> excluding(G object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Set corresponding to the intersection of a Set of\r\n\t * elements and the Bag\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tG elem = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_905 = false;\n\twhile( !idLoopCond_905 ) {\n\tidLoopCond_905 = it.isOff();\n\tif ( idLoopCond_905 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_906 = false;\n\tidIfCond_906 = this.contains(elem);\n\n\tif( idIfCond_906 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> intersectionWithSet(Set<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag which content includes all non-Collection elements\r\n\t * of the current Set, and, for each Collection element of the current\r\n\t * Bag, as many elements as the Collection contains\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<kermeta.language.structure.Object> result = null;\n\n\tkermeta.standard.Bag<kermeta.language.structure.Object> res = ((kermeta.standard.Bag<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\tjava.lang.Boolean idIfCond_907 = false;\n\tidIfCond_907 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"G\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n\n\tif( idIfCond_907 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> col = null;\n\n\tkermeta.language.structure.Object o = null;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft199 = this.iterator();\n\tjava.lang.Boolean idLoopCond_908 = false;\n\twhile( !idLoopCond_908 ) {\n\tidLoopCond_908 = it_ft199.isOff();\n\tif ( idLoopCond_908 ) {\n\t} else {\n\n\t//BIle:func\nG e_lbdExp199 = it_ft199.next();\n\n\tcol = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(e_lbdExp199, \"kermeta.standard.Collection<kermeta.language.structure.Object>\");\n\n\tres.addAll(col);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<kermeta.language.structure.Object> flatten();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag which content includes the content of the\r\n\t * current Bag and the element object\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\ts.addAll(this);\n\n\ts.add(object);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> including(G object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asOrderedSet()\r\n\t * Returns a new OrderedSet containing elements of the Bag without duplicates\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<G> result = null;\n\n\tkermeta.standard.OrderedSet<G> s = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> asOrderedSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asBag()\r\n\t * Returns a new Bag containing all elements of current Bag\t\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> asBag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag corresponding to the union of elements and\r\n\t * current Bag\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\tresult.addAll(this);\n\n\tresult.addAll(elements);\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> union(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Removes one instance of element from the Bag\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft200 = null;\n\n\tG elem_ft200 = null;\n\n\tresult_ft200 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft200 = this.iterator();\n\tjava.lang.Boolean idLoopCond_909 = false;\n\twhile( !idLoopCond_909 ) {\n\tidLoopCond_909 = kermeta.standard.helper.BooleanWrapper.or(it_ft200.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft200, null));\n\tif ( idLoopCond_909 ) {\n\t} else {\n\n\telem_ft200 = it_ft200.next();\n\n\tjava.lang.Boolean idIfCond_910 = false;\n//BIle:detector\nG e_lbdExp200 = elem_ft200;\n\n\tidIfCond_910 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp200, element);\n//EIle:detector\n\n\n\tif( idIfCond_910 ) {\n\n\tresult_ft200 = elem_ft200;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft200;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_911 = false;\n\tidIfCond_911 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem, null);\n\n\tif( idIfCond_911 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n'"
	 * @generated
	 */
	void removeOne(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementOidDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Removes the element identified by the provided Oid from the Bag\r\n\t \052/'"
	 *        annotation="kermeta.post doesntContainsElementAnymore=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft201 = null;\n\n\tG elem_ft201 = null;\n\n\tresult_ft201 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft201 = this.iterator();\n\tjava.lang.Boolean idLoopCond_912 = false;\n\twhile( !idLoopCond_912 ) {\n\tidLoopCond_912 = kermeta.standard.helper.BooleanWrapper.or(it_ft201.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft201, null));\n\tif ( idLoopCond_912 ) {\n\t} else {\n\n\telem_ft201 = it_ft201.next();\n\n\tjava.lang.Boolean idIfCond_913 = false;\n//BIle:detector\nG e_lbdExp201 = elem_ft201;\n\n\tidIfCond_913 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(e_lbdExp201), elementOid);\n//EIle:detector\n\n\n\tif( idIfCond_913 ) {\n\n\tresult_ft201 = elem_ft201;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft201;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_914 = false;\n\tidIfCond_914 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem, null);\n\n\tif( idIfCond_914 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n\n//PostConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"post__28553__doesntContainsElementAnymore\" ) ) {\njava.lang.Boolean result_post = false;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft202 = null;\n\n\tjava.lang.Boolean test_ft202 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft202 = this.iterator();\n\tjava.lang.Boolean idLoopCond_915 = false;\n\twhile( !idLoopCond_915 ) {\n\tidLoopCond_915 = kermeta.standard.helper.BooleanWrapper.or(it_ft202.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft202, false));\n\tif ( idLoopCond_915 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft202 = null;\n//BIle:func\nG e_lbdExp202 = it_ft202.next();\n\n\tresult_lambda_ft202 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(e_lbdExp202), elementOid);\n//EIle:func\n\n\ttest_ft202 = kermeta.standard.helper.BooleanWrapper.or(test_ft202, result_lambda_ft202);\n}\n\t}\n}\n\n\n\tresult_ft202 = test_ft202;\n//EIft:exists\nresult_post = kermeta.standard.helper.BooleanWrapper.not(result_ft202);\nif( !result_post ) {\nkermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}'"
	 * @generated
	 */
	void removeFromOid(Integer elementOid);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asSet()\r\n\t * Returns a new Set containing elements of the Bag without duplicates\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tkermeta.standard.Set<G> s = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> asSet();

} // Bag
