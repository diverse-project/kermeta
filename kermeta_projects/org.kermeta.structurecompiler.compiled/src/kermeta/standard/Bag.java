/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Bag.java,v 1.11 2009-02-10 17:51:50 cfaucher Exp $
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
 * @model annotation="kermeta documentation='/**\r\n * Bag is a concrete non-ordered Collection allowing duplicates\r\n * not used for the moment @EMF_needProperty \"isUnique=false isOrdered=false javaClass=org.eclipse.emf.common.util.BasicEList\"\r\n \052/'"
 * @generated
 */
public interface Bag<G> extends Collection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag corresponding to the intersection of elements\r\n\t * and the Bag\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\tG elem = null;\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_997 = false;\n\twhile( !idLoopCond_997 ) {\n\tidLoopCond_997 = it.isOff();\n\tif ( idLoopCond_997 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_998 = false;\n\tidIfCond_998 = elements.contains(elem);\n\n\tif( idIfCond_998 ) {\n\n\tjava.lang.Boolean idIfCond_999 = false;\n\tidIfCond_999 = kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(this.count(elem), elements.count(elem));\n\n\tif( idIfCond_999 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\n\tit = elements.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_1000 = false;\n\twhile( !idLoopCond_1000 ) {\n\tidLoopCond_1000 = it.isOff();\n\tif ( idLoopCond_1000 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_1001 = false;\n\tidIfCond_1001 = this.contains(elem);\n\n\tif( idIfCond_1001 ) {\n\n\tjava.lang.Boolean idIfCond_1002 = false;\n\tidIfCond_1002 = kermeta.standard.helper.IntegerWrapper.isLower(elements.count(elem), this.count(elem));\n\n\tif( idIfCond_1002 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> intersection(Bag<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides Object.equals(elt : Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Bag\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_1003 = false;\n\tidIfCond_1003 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(element));\n\n\tif( idIfCond_1003 ) {\n\n\tjava.lang.Boolean idIfCond_1004 = false;\n\tidIfCond_1004 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<G>\"), element);\n\n\tif( idIfCond_1004 ) {\n\n\tkermeta.standard.Bag<G> collection = null;\n\n\tcollection = (kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(element, \"kermeta.standard.Bag<G>\");\n\n\tkermeta.standard.Set<G> selfAsSet = this.asSet();\n\n\tisEqual = selfAsSet.equals(collection.asSet());\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tG elem = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_1005 = false;\n\twhile( !idLoopCond_1005 ) {\n\tidLoopCond_1005 = it.isOff();\n\tif ( idLoopCond_1005 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_1006 = false;\n\tidIfCond_1006 = this.contains(elem);\n\n\tif( idIfCond_1006 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> intersectionWithSet(Set<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag which content includes all non-Collection elements\r\n\t * of the current Set, and, for each Collection element of the current\r\n\t * Bag, as many elements as the Collection contains\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<kermeta.language.structure.Object> result = null;\n\n\tkermeta.standard.Bag<kermeta.language.structure.Object> res = ((kermeta.standard.Bag<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\tjava.lang.Boolean idIfCond_1007 = false;\n\tidIfCond_1007 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"G\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n\n\tif( idIfCond_1007 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> col = null;\n\n\tkermeta.language.structure.Object o = null;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft226 = this.iterator();\n\tjava.lang.Boolean idLoopCond_1008 = false;\n\twhile( !idLoopCond_1008 ) {\n\tidLoopCond_1008 = it_ft226.isOff();\n\tif ( idLoopCond_1008 ) {\n\t} else {\n\n\t//BIle:func\nG e_lbdExp226 = it_ft226.next();\n\n\tcol = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(e_lbdExp226, \"kermeta.standard.Collection<kermeta.language.structure.Object>\");\n\n\tres.addAll(col);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<kermeta.language.structure.Object> flatten();

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
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag which content includes the content of the\r\n\t * current Bag and the element object\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getBag()));\n\n\ts.addAll(this);\n\n\ts.add(object);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> including(G object);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft227 = null;\n\n\tG elem_ft227 = null;\n\n\tresult_ft227 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft227 = this.iterator();\n\tjava.lang.Boolean idLoopCond_1009 = false;\n\twhile( !idLoopCond_1009 ) {\n\tidLoopCond_1009 = kermeta.standard.helper.BooleanWrapper.or(it_ft227.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft227, null));\n\tif ( idLoopCond_1009 ) {\n\t} else {\n\n\telem_ft227 = it_ft227.next();\n\n\tjava.lang.Boolean idIfCond_1010 = false;\n//BIle:detector\nG e_lbdExp227 = elem_ft227;\n\n\tidIfCond_1010 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp227, element);\n//EIle:detector\n\n\n\tif( idIfCond_1010 ) {\n\n\tresult_ft227 = elem_ft227;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft227;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1011 = false;\n\tidIfCond_1011 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem, null);\n\n\tif( idIfCond_1011 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n'"
	 * @generated
	 */
	void removeOne(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementOidDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Removes the element identified by the provided Oid from the Bag\r\n\t \052/'"
	 *        annotation="kermeta.post doesntContainsElementAnymore=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft228 = null;\n\n\tG elem_ft228 = null;\n\n\tresult_ft228 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft228 = this.iterator();\n\tjava.lang.Boolean idLoopCond_1012 = false;\n\twhile( !idLoopCond_1012 ) {\n\tidLoopCond_1012 = kermeta.standard.helper.BooleanWrapper.or(it_ft228.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft228, null));\n\tif ( idLoopCond_1012 ) {\n\t} else {\n\n\telem_ft228 = it_ft228.next();\n\n\tjava.lang.Boolean idIfCond_1013 = false;\n//BIle:detector\nG e_lbdExp228 = elem_ft228;\n\n\tidIfCond_1013 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(e_lbdExp228), elementOid);\n//EIle:detector\n\n\n\tif( idIfCond_1013 ) {\n\n\tresult_ft228 = elem_ft228;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft228;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_1014 = false;\n\tidIfCond_1014 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem, null);\n\n\tif( idIfCond_1014 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n\n//PostConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"post__29282__doesntContainsElementAnymore\" ) ) {\njava.lang.Boolean result_post = false;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft229 = null;\n\n\tjava.lang.Boolean test_ft229 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft229 = this.iterator();\n\tjava.lang.Boolean idLoopCond_1015 = false;\n\twhile( !idLoopCond_1015 ) {\n\tidLoopCond_1015 = kermeta.standard.helper.BooleanWrapper.or(it_ft229.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft229, false));\n\tif ( idLoopCond_1015 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft229 = null;\n//BIle:func\nG e_lbdExp229 = it_ft229.next();\n\n\tresult_lambda_ft229 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(e_lbdExp229), elementOid);\n//EIle:func\n\n\ttest_ft229 = kermeta.standard.helper.BooleanWrapper.or(test_ft229, result_lambda_ft229);\n}\n\t}\n}\n\n\n\tresult_ft229 = test_ft229;\n//EIft:exists\nresult_post = kermeta.standard.helper.BooleanWrapper.not(result_ft229);\nif( !result_post ) {\nkermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}'"
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
