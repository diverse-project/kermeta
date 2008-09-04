/**
 * <copyright>
 * </copyright>
 *
 * $Id: Set.java,v 1.1 2008-09-04 15:40:28 cfaucher Exp $
 */
package kermeta.standard;

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\tG elem = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_583 = false;\n\twhile( !idLoopCond_583 ) {\n\tidLoopCond_583 = it.isOff();\n\tif ( idLoopCond_583 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_584 = false;\n\tidIfCond_584 = elements.contains(elem);\n\n\tif( idIfCond_584 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> intersection(Collection<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set corresponding to the difference between the\n\t * current Set and the Set elements, ie all elements contained by \n\t * the current Set that do not appear in the elements Set \n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\tG elem = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_585 = false;\n\twhile( !idLoopCond_585 ) {\n\tidLoopCond_585 = it.isOff();\n\tif ( idLoopCond_585 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_586 = false;\n\tidIfCond_586 = kermeta.standard.helper.BooleanWrapper.not(elements.contains(elem));\n\n\tif( idIfCond_586 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> minus(Set<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.remove(G)\n\t * Removes the element from the Set if it is contained by the Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//Beginning of the Inlining of the function type: detect\n\nG result_ft120 = null;\n\n\tG elem_ft120 = null;\n\n\tresult_ft120 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft120 = this.iterator();\n\tjava.lang.Boolean idLoopCond_587 = false;\n\twhile( !idLoopCond_587 ) {\n\tidLoopCond_587 = kermeta.standard.helper.BooleanWrapper.or(it_ft120.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft120, null));\n\tif ( idLoopCond_587 ) {\n\t} else {\n\n\telem_ft120 = it_ft120.next();\n\n\tjava.lang.Boolean idIfCond_588 = false;\n//Beginning of the Inlining of the lambda expression: detector\nG e = elem_ft120;\n\n\tidIfCond_588 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(e, element);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_588 ) {\n\n\tresult_ft120 = elem_ft120;\n}\n\n}\n\t}\n}\n\n\n//callElement\nelem = result_ft120;\n//End of the Inlining of the function type: detect\n\n\n\tjava.lang.Boolean idIfCond_589 = false;\n\tidIfCond_589 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(elem, null);\n\n\tif( idIfCond_589 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//Beginning of the Inlining of the function type: detect\n\nG result_ft205 = null;\n\n\tG elem_ft205 = null;\n\n\tresult_ft205 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft205 = self.iterator();\n\tjava.lang.Boolean idLoopCond_878 = false;\n\twhile( !idLoopCond_878 ) {\n\tidLoopCond_878 = kermeta.standard.helper.BooleanWrapper.or(it_ft205.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft205, null));\n\tif ( idLoopCond_878 ) {\n\t} else {\n\n\telem_ft205 = it_ft205.next();\n\n\tjava.lang.Boolean idIfCond_879 = false;\n//Beginning of the Inlining of the lambda expression: detector\nG e = elem_ft205;\n\n\tidIfCond_879 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(e, element);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_879 ) {\n\n\tresult_ft205 = elem_ft205;\n}\n\n}\n\t}\n}\n\n\n//callElement\nelem = result_ft205;\n//End of the Inlining of the function type: detect\n\n\n\tjava.lang.Boolean idIfCond_880 = false;\n\tidIfCond_880 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(elem, null);\n\n\tif( idIfCond_880 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(self, elem);\n}\n\n'"
	 * @generated
	 */
	void remove(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Overrides Object.equals(Object)\n\t * Returns a Boolean stating whether the provided element is equal to\n\t * current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_590 = false;\n\tidIfCond_590 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(element));\n\n\tif( idIfCond_590 ) {\n\n\tjava.lang.Boolean idIfCond_591 = false;\n\tidIfCond_591 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<G>\"), element);\n\n\tif( idIfCond_591 ) {\n\n\tkermeta.standard.Collection<G> collection = null;\n\n\tcollection = (kermeta.standard.Collection<G>) element;\n\n\tjava.lang.Boolean idIfCond_592 = false;\n\tidIfCond_592 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), collection.size());\n\n\tif( idIfCond_592 ) {\n\n\tG elem = null;\n\n\tjava.lang.Boolean ok = true;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\tjava.lang.Boolean idLoopCond_593 = false;\n\twhile( !idLoopCond_593 ) {\n\tidLoopCond_593 = kermeta.standard.helper.BooleanWrapper.or(it.isOff(), kermeta.standard.helper.BooleanWrapper.not(ok));\n\tif ( idLoopCond_593 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_594 = false;\n\tidIfCond_594 = kermeta.standard.helper.BooleanWrapper.not(collection.contains(elem));\n\n\tif( idIfCond_594 ) {\n\n\tok = false;\n}\n\n}\n\t}\n}\n\n\n\tisEqual = ok;\n}\n\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.add(G)\n\t * Adds elt to the Set if it is not already contained by the\n\t * Set, does nothing otherwise\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_595 = false;\n\tidIfCond_595 = kermeta.standard.helper.BooleanWrapper.not(this.contains(element));\n\n\tif( idIfCond_595 ) {\n\n\tsuper.add(element);\n}\n\n'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_881 = false;\n\tidIfCond_881 = kermeta.standard.helper.BooleanWrapper.not(self.contains(element));\n\n\tif( idIfCond_881 ) {\n\n\tkermeta.standard.helper.CollectionSuper.super_add(self, element);\n}\n\n'"
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
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set which contents corresponds to the symmetric\n\t * difference between current Set and Set s, ie all elements of\n\t * each Set that do not appear in the other one\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tkermeta.standard.Set<G> res = s.minus(this);\n\n\tresult = this.minus(s);\n\n\tresult.addAll(res);\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> symmetricDifference(Set<G> s);

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
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Set which content includes all non-Collection elements\n\t * of the current Set, and, for each Collection element of the current\n\t * Set, as many elements as the Collection contains\n\t * Duplicates are removed\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Object> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Object> res = ((kermeta.standard.Set<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Object>\"));\n\n\tjava.lang.Boolean idIfCond_596 = false;\n\tidIfCond_596 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"G\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n\n\tif( idIfCond_596 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> col = null;\n\n\tkermeta.language.structure.Object o = null;\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft121 = this.iterator();\n\tjava.lang.Boolean idLoopCond_597 = false;\n\twhile( !idLoopCond_597 ) {\n\tidLoopCond_597 = it_ft121.isOff();\n\tif ( idLoopCond_597 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nG e = it_ft121.next();\n\n\tcol = (kermeta.standard.Collection<kermeta.language.structure.Object>) e;\n\n\tres.addAll(col);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
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
	 * @model annotation="kermeta documentation='/**\n\t * Returns a new Bag corresponding to the union of the Bag elements\n\t * with the current Set\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\tresult.addAll(this);\n\n\tresult.addAll(elements);\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> unionWithBag(Bag<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Overrides Collection<G>.asSet()\n\t * Returns a new Set composed of all elements of current Set\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Collection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tkermeta.standard.Set<G> s = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\ts.addAll(this);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> asSet();

} // Set
