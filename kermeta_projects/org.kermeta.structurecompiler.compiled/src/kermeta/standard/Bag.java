/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bag.java,v 1.8 2008-11-07 08:53:22 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\tG elem = null;\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_860 = false;\n\twhile( !idLoopCond_860 ) {\n\tidLoopCond_860 = it.isOff();\n\tif ( idLoopCond_860 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_861 = false;\n\tidIfCond_861 = elements.contains(elem);\n\n\tif( idIfCond_861 ) {\n\n\tjava.lang.Boolean idIfCond_862 = false;\n\tidIfCond_862 = kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(this.count(elem), elements.count(elem));\n\n\tif( idIfCond_862 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\n\tit = elements.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_863 = false;\n\twhile( !idLoopCond_863 ) {\n\tidLoopCond_863 = it.isOff();\n\tif ( idLoopCond_863 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_864 = false;\n\tidIfCond_864 = this.contains(elem);\n\n\tif( idIfCond_864 ) {\n\n\tjava.lang.Boolean idIfCond_865 = false;\n\tidIfCond_865 = kermeta.standard.helper.IntegerWrapper.isLower(elements.count(elem), this.count(elem));\n\n\tif( idIfCond_865 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> intersection(Bag<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides Object.equals(elt : Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Bag\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_866 = false;\n\tidIfCond_866 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(element));\n\n\tif( idIfCond_866 ) {\n\n\tjava.lang.Boolean idIfCond_867 = false;\n\tidIfCond_867 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<G>\"), element);\n\n\tif( idIfCond_867 ) {\n\n\tkermeta.standard.Bag<G> collection = null;\n\n\tcollection = (kermeta.standard.Bag<G>) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.standard.Bag<G>>asTypeOrVoid(element);\n\n\tkermeta.standard.Set<G> selfAsSet = this.asSet();\n\n\tisEqual = selfAsSet.equals(collection.asSet());\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asSequence()\r\n\t * Returns a new Sequence containing all elements of current Bag\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tkermeta.standard.Sequence<G> s = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> asSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a sequence of the bag elements sorted using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t \052/'"
	 *        annotation="kermeta documentation='/**\r\n\t * Recursive sort of the given sequence using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t \052/'"
	 *        annotation="kermeta documentation='/**\r\n\t * Internal concatenation tool for recursive \'quickSort()\' method\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tresult = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<G>\"));\n\n\tresult.addAll(less);\n\n\tresult.addAll(pivot);\n\n\tresult.addAll(greater);\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> concatenate(Sequence<G> less, Sequence<G> pivot,
			Sequence<G> greater);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag which content includes the content of the\r\n\t * current Bag from which all instances of object have been\r\n\t * removed\r\n \t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\ts.addAll(this);\n\n\ts.remove(object);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> excluding(G object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Set corresponding to the intersection of a Set of\r\n\t * elements and the Bag\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\tG elem = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_868 = false;\n\twhile( !idLoopCond_868 ) {\n\tidLoopCond_868 = it.isOff();\n\tif ( idLoopCond_868 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_869 = false;\n\tidIfCond_869 = this.contains(elem);\n\n\tif( idIfCond_869 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> intersectionWithSet(Set<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag which content includes all non-Collection elements\r\n\t * of the current Set, and, for each Collection element of the current\r\n\t * Bag, as many elements as the Collection contains\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<kermeta.language.structure.Object> result = null;\n\n\tkermeta.standard.Bag<kermeta.language.structure.Object> res = ((kermeta.standard.Bag<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<kermeta.language.structure.Object>\"));\n\n\tjava.lang.Boolean idIfCond_870 = false;\n\tidIfCond_870 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"G\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n\n\tif( idIfCond_870 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> col = null;\n\n\tkermeta.language.structure.Object o = null;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft192 = this.iterator();\n\tjava.lang.Boolean idLoopCond_871 = false;\n\twhile( !idLoopCond_871 ) {\n\tidLoopCond_871 = it_ft192.isOff();\n\tif ( idLoopCond_871 ) {\n\t} else {\n\n\t//BIle:func\nG e_lbdExp192 = it_ft192.next();\n\n\tcol = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.standard.Collection<kermeta.language.structure.Object>>asTypeOrVoid(e_lbdExp192);\n\n\tres.addAll(col);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<kermeta.language.structure.Object> flatten();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag which content includes the content of the\r\n\t * current Bag and the element object\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\ts.addAll(this);\n\n\ts.add(object);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> including(G object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asOrderedSet()\r\n\t * Returns a new OrderedSet containing elements of the Bag without duplicates\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<G> result = null;\n\n\tkermeta.standard.OrderedSet<G> s = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> asOrderedSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asBag()\r\n\t * Returns a new Bag containing all elements of current Bag\t\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> asBag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag corresponding to the union of elements and\r\n\t * current Bag\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\tresult.addAll(this);\n\n\tresult.addAll(elements);\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> union(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Removes one instance of element from the Bag\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft193 = null;\n\n\tG elem_ft193 = null;\n\n\tresult_ft193 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft193 = this.iterator();\n\tjava.lang.Boolean idLoopCond_872 = false;\n\twhile( !idLoopCond_872 ) {\n\tidLoopCond_872 = kermeta.standard.helper.BooleanWrapper.or(it_ft193.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft193, null));\n\tif ( idLoopCond_872 ) {\n\t} else {\n\n\telem_ft193 = it_ft193.next();\n\n\tjava.lang.Boolean idIfCond_873 = false;\n//BIle:detector\nG e_lbdExp193 = elem_ft193;\n\n\tidIfCond_873 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp193, element);\n//EIle:detector\n\n\n\tif( idIfCond_873 ) {\n\n\tresult_ft193 = elem_ft193;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft193;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_874 = false;\n\tidIfCond_874 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem, null);\n\n\tif( idIfCond_874 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n'"
	 * @generated
	 */
	void removeOne(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementOidDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Removes the element identified by the provided Oid from the Bag\r\n\t \052/'"
	 *        annotation="kermeta.post doesntContainsElementAnymore=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft194 = null;\n\n\tG elem_ft194 = null;\n\n\tresult_ft194 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft194 = this.iterator();\n\tjava.lang.Boolean idLoopCond_875 = false;\n\twhile( !idLoopCond_875 ) {\n\tidLoopCond_875 = kermeta.standard.helper.BooleanWrapper.or(it_ft194.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft194, null));\n\tif ( idLoopCond_875 ) {\n\t} else {\n\n\telem_ft194 = it_ft194.next();\n\n\tjava.lang.Boolean idIfCond_876 = false;\n//BIle:detector\nG e_lbdExp194 = elem_ft194;\n\n\tidIfCond_876 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(e_lbdExp194), elementOid);\n//EIle:detector\n\n\n\tif( idIfCond_876 ) {\n\n\tresult_ft194 = elem_ft194;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft194;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_877 = false;\n\tidIfCond_877 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem, null);\n\n\tif( idIfCond_877 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n\n//PostConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"post__40066068__doesntContainsElementAnymore\" ) ) {\njava.lang.Boolean result_post = false;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft195 = null;\n\n\tjava.lang.Boolean test_ft195 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft195 = this.iterator();\n\tjava.lang.Boolean idLoopCond_878 = false;\n\twhile( !idLoopCond_878 ) {\n\tidLoopCond_878 = kermeta.standard.helper.BooleanWrapper.or(it_ft195.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft195, false));\n\tif ( idLoopCond_878 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft195 = null;\n//BIle:func\nG e_lbdExp195 = it_ft195.next();\n\n\tresult_lambda_ft195 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(e_lbdExp195), elementOid);\n//EIle:func\n\n\ttest_ft195 = kermeta.standard.helper.BooleanWrapper.or(test_ft195, result_lambda_ft195);\n}\n\t}\n}\n\n\n\tresult_ft195 = test_ft195;\n//EIft:exists\nresult_post = kermeta.standard.helper.BooleanWrapper.not(result_ft195);\nif( !result_post ) {\nkermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}'"
	 * @generated
	 */
	void removeFromOid(Integer elementOid);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Overrides Collection<G>.asSet()\r\n\t * Returns a new Set containing elements of the Bag without duplicates\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tkermeta.standard.Set<G> s = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> asSet();

} // Bag
