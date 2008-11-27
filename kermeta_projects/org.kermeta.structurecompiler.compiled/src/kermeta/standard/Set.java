/**
 * <copyright>
 * </copyright>
 *
 * $Id: Set.java,v 1.9 2008-11-27 15:49:55 cfaucher Exp $
 */
package kermeta.standard;

import java.lang.Boolean;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getSet()
 * @model annotation="kermeta documentation='/**\n * A Set is a non-ordered collection that contains distinct elements\n * (with regards to the G.equals(Object) operation)\n * not used for the moment @EMF_needProperty \"isUnique=true isOrdered=false javaClass=org.eclipse.emf.common.util.BasicEList\"\n \052/'"
 * @generated
 */
public interface Set<G> extends Collection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set corresponding to the intersection of the Set elements\n\t * with the current Set\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\tG elem = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_793 = false;\n\twhile( !idLoopCond_793 ) {\n\tidLoopCond_793 = it.isOff();\n\tif ( idLoopCond_793 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_794 = false;\n\tidIfCond_794 = elements.contains(elem);\n\n\tif( idIfCond_794 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> intersection(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set corresponding to the difference between the\n\t * current Set and the Set elements, ie all elements contained by \n\t * the current Set that do not appear in the elements Set \n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\tG elem = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_795 = false;\n\twhile( !idLoopCond_795 ) {\n\tidLoopCond_795 = it.isOff();\n\tif ( idLoopCond_795 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_796 = false;\n\tidIfCond_796 = kermeta.standard.helper.BooleanWrapper.not(elements.contains(elem));\n\n\tif( idIfCond_796 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> minus(Set<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.remove(G)\n\t * Removes the element from the Set if it is contained by the Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft185 = null;\n\n\tG elem_ft185 = null;\n\n\tresult_ft185 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft185 = this.iterator();\n\tjava.lang.Boolean idLoopCond_797 = false;\n\twhile( !idLoopCond_797 ) {\n\tidLoopCond_797 = kermeta.standard.helper.BooleanWrapper.or(it_ft185.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft185, null));\n\tif ( idLoopCond_797 ) {\n\t} else {\n\n\telem_ft185 = it_ft185.next();\n\n\tjava.lang.Boolean idIfCond_798 = false;\n//BIle:detector\nG e_lbdExp185 = elem_ft185;\n\n\tidIfCond_798 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(e_lbdExp185, element);\n//EIle:detector\n\n\n\tif( idIfCond_798 ) {\n\n\tresult_ft185 = elem_ft185;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft185;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_799 = false;\n\tidIfCond_799 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem, null);\n\n\tif( idIfCond_799 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n'"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Overrides Object.equals(Object)\n\t * Returns a Boolean stating whether the provided element is equal to\n\t * current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_800 = false;\n\tidIfCond_800 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(element));\n\n\tif( idIfCond_800 ) {\n\n\tjava.lang.Boolean idIfCond_801 = false;\n\tidIfCond_801 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<G>\"), element);\n\n\tif( idIfCond_801 ) {\n\n\tkermeta.standard.Collection<G> collection = null;\n\n\tcollection = (kermeta.standard.Collection<G>) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.standard.Collection<G>>asTypeOrVoid(element);\n\n\tjava.lang.Boolean idIfCond_802 = false;\n\tidIfCond_802 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), collection.size());\n\n\tif( idIfCond_802 ) {\n\n\tG elem = null;\n\n\tjava.lang.Boolean ok = true;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_803 = false;\n\twhile( !idLoopCond_803 ) {\n\tidLoopCond_803 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), kermeta.standard.helper.BooleanWrapper.not(ok));\n\tif ( idLoopCond_803 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_804 = false;\n\tidIfCond_804 = kermeta.standard.helper.BooleanWrapper.not(collection.contains(elem));\n\n\tif( idIfCond_804 ) {\n\n\tok = false;\n}\n\n}\n\t}\n}\n\n\n\tisEqual = ok;\n}\n\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.add(G)\n\t * Adds elt to the Set if it is not already contained by the\n\t * Set, does nothing otherwise\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_805 = false;\n\tidIfCond_805 = kermeta.standard.helper.BooleanWrapper.not(this.contains(element));\n\n\tif( idIfCond_805 ) {\n\n\tsuper.add(element);\n}\n\n'"
	 * @generated
	 */
	void add(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asSequence()\n\t * Returns a new Sequence composed of all elements of current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tkermeta.standard.Sequence<G> s = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> asSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a ordered set of the bag elements sorted using the given comparator.\n\t * The comparator must return :<ul>\n\t *   <li>+1 if the second <G> element is greater than the first</li> \n\t *   <li>0 if the second <G> element equals the first</li> \n\t *   <li>-1 if the second <G> element is lower than the first</li> \n\t \052/'"
	 *        annotation="kermeta documentation='/**\n\t * Recursive sort of the given (ordered) set using the given comparator.\n\t * The comparator must return :<ul>\n\t *   <li>+1 if the second <G> element is greater than the first</li> \n\t *   <li>0 if the second <G> element equals the first</li> \n\t *   <li>-1 if the second <G> element is lower than the first</li> \n\t \052/'"
	 *        annotation="kermeta documentation='/**\n\t * Internal concatenation tool for recursive \'quickSort()\' method\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<G> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<G>\"));\n\n\tresult.addAll(less);\n\n\tresult.addAll(pivot);\n\n\tresult.addAll(greater);\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> concatenate(OrderedSet<G> less, OrderedSet<G> pivot,
			OrderedSet<G> greater);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set which contents corresponds to the symmetric\n\t * difference between current Set and Set s, ie all elements of\n\t * each Set that do not appear in the other one\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tkermeta.standard.Set<G> res = s.minus(this);\n\n\tresult = this.minus(s);\n\n\tresult.addAll(res);\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> symmetricDifference(Set<G> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set which content includes all non-Collection elements\n\t * of the current Set, and, for each Collection element of the current\n\t * Set, as many elements as the Collection contains\n\t * Duplicates are removed\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Object> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Object> res = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Object>\"));\n\n\tjava.lang.Boolean idIfCond_806 = false;\n\tidIfCond_806 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOfSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"G\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n\n\tif( idIfCond_806 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> col = null;\n\n\tkermeta.language.structure.Object o = null;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft186 = this.iterator();\n\tjava.lang.Boolean idLoopCond_807 = false;\n\twhile( !idLoopCond_807 ) {\n\tidLoopCond_807 = it_ft186.isOff();\n\tif ( idLoopCond_807 ) {\n\t} else {\n\n\t//BIle:func\nG e_lbdExp186 = it_ft186.next();\n\n\tcol = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.standard.Collection<kermeta.language.structure.Object>>asTypeOrVoid(e_lbdExp186);\n\n\tres.addAll(col);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<kermeta.language.structure.Object> flatten();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asOrderedSet()\n\t * Returns a new OrderedSet that contains all elements of current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<G> result = null;\n\n\tkermeta.standard.OrderedSet<G> s = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> asOrderedSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asBag()\n\t * Returns a new Bag composed of all elements of current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> asBag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set corresponding to the union of the Set elements\n\t * with the current Set\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\tresult.addAll(this);\n\n\tresult.addAll(elements);\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> union(Set<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asSet()\n\t * Returns a new Set composed of all elements of current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tkermeta.standard.Set<G> s = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> asSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Bag corresponding to the union of the Bag elements\n\t * with the current Set\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\tresult.addAll(this);\n\n\tresult.addAll(elements);\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> unionWithBag(Bag<G> elements);

} // Set
