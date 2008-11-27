/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bag.java,v 1.9 2008-11-27 15:49:55 cfaucher Exp $
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
 * @model annotation="kermeta documentation='/**\n * Bag is a concrete non-ordered Collection allowing duplicates\n * not used for the moment @EMF_needProperty \"isUnique=false isOrdered=false javaClass=org.eclipse.emf.common.util.BasicEList\"\n \052/'"
 * @generated
 */
public interface Bag<G> extends Collection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Bag corresponding to the intersection of elements\n\t * and the Bag\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\tG elem = null;\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_808 = false;\n\twhile( !idLoopCond_808 ) {\n\tidLoopCond_808 = it.isOff();\n\tif ( idLoopCond_808 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_809 = false;\n\tidIfCond_809 = elements.contains(elem);\n\n\tif( idIfCond_809 ) {\n\n\tjava.lang.Boolean idIfCond_810 = false;\n\tidIfCond_810 = kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(this.count(elem), elements.count(elem));\n\n\tif( idIfCond_810 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\n\tit = elements.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_811 = false;\n\twhile( !idLoopCond_811 ) {\n\tidLoopCond_811 = it.isOff();\n\tif ( idLoopCond_811 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_812 = false;\n\tidIfCond_812 = this.contains(elem);\n\n\tif( idIfCond_812 ) {\n\n\tjava.lang.Boolean idIfCond_813 = false;\n\tidIfCond_813 = kermeta.standard.helper.IntegerWrapper.isLower(elements.count(elem), this.count(elem));\n\n\tif( idIfCond_813 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> intersection(Bag<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Overrides Object.equals(elt : Object)\n\t * Returns a Boolean stating whether the provided element is equal to\n\t * current Bag\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_814 = false;\n\tidIfCond_814 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(element));\n\n\tif( idIfCond_814 ) {\n\n\tjava.lang.Boolean idIfCond_815 = false;\n\tidIfCond_815 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<G>\"), element);\n\n\tif( idIfCond_815 ) {\n\n\tkermeta.standard.Bag<G> collection = null;\n\n\tcollection = (kermeta.standard.Bag<G>) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.standard.Bag<G>>asTypeOrVoid(element);\n\n\tkermeta.standard.Set<G> selfAsSet = this.asSet();\n\n\tisEqual = selfAsSet.equals(collection.asSet());\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asSequence()\n\t * Returns a new Sequence containing all elements of current Bag\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tkermeta.standard.Sequence<G> s = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> asSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a sequence of the bag elements sorted using the given comparator.\n\t * The comparator must return :<ul>\n\t *   <li>+1 if the second <G> element is greater than the first</li> \n\t *   <li>0 if the second <G> element equals the first</li> \n\t *   <li>-1 if the second <G> element is lower than the first</li> \n\t \052/'"
	 *        annotation="kermeta documentation='/**\n\t * Recursive sort of the given sequence using the given comparator.\n\t * The comparator must return :<ul>\n\t *   <li>+1 if the second <G> element is greater than the first</li> \n\t *   <li>0 if the second <G> element equals the first</li> \n\t *   <li>-1 if the second <G> element is lower than the first</li> \n\t \052/'"
	 *        annotation="kermeta documentation='/**\n\t * Internal concatenation tool for recursive \'quickSort()\' method\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tresult = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<G>\"));\n\n\tresult.addAll(less);\n\n\tresult.addAll(pivot);\n\n\tresult.addAll(greater);\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> concatenate(Sequence<G> less, Sequence<G> pivot,
			Sequence<G> greater);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Bag which content includes the content of the\n\t * current Bag from which all instances of object have been\n\t * removed\n \t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\ts.addAll(this);\n\n\ts.remove(object);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> excluding(G object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Bag which content includes all non-Collection elements\n\t * of the current Set, and, for each Collection element of the current\n\t * Bag, as many elements as the Collection contains\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<kermeta.language.structure.Object> result = null;\n\n\tkermeta.standard.Bag<kermeta.language.structure.Object> res = ((kermeta.standard.Bag<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<kermeta.language.structure.Object>\"));\n\n\tjava.lang.Boolean idIfCond_816 = false;\n\tidIfCond_816 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"G\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n\n\tif( idIfCond_816 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> col = null;\n\n\tkermeta.language.structure.Object o = null;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft187 = this.iterator();\n\tjava.lang.Boolean idLoopCond_817 = false;\n\twhile( !idLoopCond_817 ) {\n\tidLoopCond_817 = it_ft187.isOff();\n\tif ( idLoopCond_817 ) {\n\t} else {\n\n\t//BIle:func\nG e_lbdExp187 = it_ft187.next();\n\n\tcol = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.standard.Collection<kermeta.language.structure.Object>>asTypeOrVoid(e_lbdExp187);\n\n\tres.addAll(col);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<kermeta.language.structure.Object> flatten();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set corresponding to the intersection of a Set of\n\t * elements and the Bag\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\tG elem = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_818 = false;\n\twhile( !idLoopCond_818 ) {\n\tidLoopCond_818 = it.isOff();\n\tif ( idLoopCond_818 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_819 = false;\n\tidIfCond_819 = this.contains(elem);\n\n\tif( idIfCond_819 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> intersectionWithSet(Set<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Bag which content includes the content of the\n\t * current Bag and the element object\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\ts.addAll(this);\n\n\ts.add(object);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> including(G object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asOrderedSet()\n\t * Returns a new OrderedSet containing elements of the Bag without duplicates\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<G> result = null;\n\n\tkermeta.standard.OrderedSet<G> s = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> asOrderedSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asBag()\n\t * Returns a new Bag containing all elements of current Bag\t\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> asBag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Bag corresponding to the union of elements and\n\t * current Bag\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\tresult.addAll(this);\n\n\tresult.addAll(elements);\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> union(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Removes one instance of element from the Bag\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft188 = null;\n\n\tG elem_ft188 = null;\n\n\tresult_ft188 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft188 = this.iterator();\n\tjava.lang.Boolean idLoopCond_820 = false;\n\twhile( !idLoopCond_820 ) {\n\tidLoopCond_820 = kermeta.standard.helper.BooleanWrapper.or(it_ft188.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft188, null));\n\tif ( idLoopCond_820 ) {\n\t} else {\n\n\telem_ft188 = it_ft188.next();\n\n\tjava.lang.Boolean idIfCond_821 = false;\n//BIle:detector\nG e_lbdExp188 = elem_ft188;\n\n\tidIfCond_821 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp188, element);\n//EIle:detector\n\n\n\tif( idIfCond_821 ) {\n\n\tresult_ft188 = elem_ft188;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft188;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_822 = false;\n\tidIfCond_822 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem, null);\n\n\tif( idIfCond_822 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n'"
	 * @generated
	 */
	void removeOne(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementOidDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Removes the element identified by the provided Oid from the Bag\n\t \052/'"
	 *        annotation="kermeta.post doesntContainsElementAnymore=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft189 = null;\n\n\tG elem_ft189 = null;\n\n\tresult_ft189 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft189 = this.iterator();\n\tjava.lang.Boolean idLoopCond_823 = false;\n\twhile( !idLoopCond_823 ) {\n\tidLoopCond_823 = kermeta.standard.helper.BooleanWrapper.or(it_ft189.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft189, null));\n\tif ( idLoopCond_823 ) {\n\t} else {\n\n\telem_ft189 = it_ft189.next();\n\n\tjava.lang.Boolean idIfCond_824 = false;\n//BIle:detector\nG e_lbdExp189 = elem_ft189;\n\n\tidIfCond_824 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(e_lbdExp189), elementOid);\n//EIle:detector\n\n\n\tif( idIfCond_824 ) {\n\n\tresult_ft189 = elem_ft189;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft189;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_825 = false;\n\tidIfCond_825 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem, null);\n\n\tif( idIfCond_825 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n\n//PostConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"post__13636717__doesntContainsElementAnymore\" ) ) {\njava.lang.Boolean result_post = false;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft190 = null;\n\n\tjava.lang.Boolean test_ft190 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft190 = this.iterator();\n\tjava.lang.Boolean idLoopCond_826 = false;\n\twhile( !idLoopCond_826 ) {\n\tidLoopCond_826 = kermeta.standard.helper.BooleanWrapper.or(it_ft190.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft190, false));\n\tif ( idLoopCond_826 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft190 = null;\n//BIle:func\nG e_lbdExp190 = it_ft190.next();\n\n\tresult_lambda_ft190 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(e_lbdExp190), elementOid);\n//EIle:func\n\n\ttest_ft190 = kermeta.standard.helper.BooleanWrapper.or(test_ft190, result_lambda_ft190);\n}\n\t}\n}\n\n\n\tresult_ft190 = test_ft190;\n//EIft:exists\nresult_post = kermeta.standard.helper.BooleanWrapper.not(result_ft190);\nif( !result_post ) {\nkermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}'"
	 * @generated
	 */
	void removeFromOid(Integer elementOid);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asSet()\n\t * Returns a new Set containing elements of the Bag without duplicates\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tkermeta.standard.Set<G> s = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> asSet();

} // Bag
