/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bag.java,v 1.2 2008-08-19 13:23:04 cfaucher Exp $
 */
package kermeta.standard;

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\tG elem = null;\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_185 = false;\n\twhile( !idLoopCond_185 ) {\n\tidLoopCond_185 = it.isOff();;\n\tif ( idLoopCond_185 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_186 = false;\n\tidIfCond_186 = elements.contains(elem);\n\n\tif( idIfCond_186 ) {\n\n\tjava.lang.Boolean idIfCond_187 = false;\n\tidIfCond_187 = kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(this.count(elem), elements.count(elem));\n\n\tif( idIfCond_187 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\n\tit = elements.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_188 = false;\n\twhile( !idLoopCond_188 ) {\n\tidLoopCond_188 = it.isOff();;\n\tif ( idLoopCond_188 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_189 = false;\n\tidIfCond_189 = this.contains(elem);\n\n\tif( idIfCond_189 ) {\n\n\tjava.lang.Boolean idIfCond_190 = false;\n\tidIfCond_190 = kermeta.standard.helper.IntegerWrapper.isLower(elements.count(elem), this.count(elem));\n\n\tif( idIfCond_190 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> intersection(Bag<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides Object.equals(elt : Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Bag\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_191 = false;\n\tidIfCond_191 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(element));\n\n\tif( idIfCond_191 ) {\n\n\tjava.lang.Boolean idIfCond_192 = false;\n\tidIfCond_192 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<G>\"), element);\n\n\tif( idIfCond_192 ) {\n\n\tkermeta.standard.Bag<G> collection = null;\n\n\tcollection = (kermeta.standard.Bag<G>) element;\n\n\tkermeta.standard.Set<G> selfAsSet = this.asSet();\n\n\tisEqual = selfAsSet.equals(collection.asSet());\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\tG elem = null;\n\n\t\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_193 = false;\n\twhile( !idLoopCond_193 ) {\n\tidLoopCond_193 = it.isOff();;\n\tif ( idLoopCond_193 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_194 = false;\n\tidIfCond_194 = this.contains(elem);\n\n\tif( idIfCond_194 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> intersectionWithSet(Set<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag which content includes all non-Collection elements\r\n\t * of the current Set, and, for each Collection element of the current\r\n\t * Bag, as many elements as the Collection contains\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<kermeta.language.structure.Object> result = null;\n\n\tkermeta.standard.Bag<kermeta.language.structure.Object> res = ((kermeta.standard.Bag<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<kermeta.language.structure.Object>\"));\n\n\tjava.lang.Boolean idIfCond_195 = false;\n\tidIfCond_195 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"G\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n\n\tif( idIfCond_195 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> col = null;\n\n\tkermeta.language.structure.Object o = null;\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<G> it_ft34 = this.iterator();\n\tjava.lang.Boolean idLoopCond_196 = false;\n\twhile( !idLoopCond_196 ) {\n\tidLoopCond_196 = it_ft34.isOff();;\n\tif ( idLoopCond_196 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nG e = it_ft34.next();\n\n\tcol = (kermeta.standard.Collection<kermeta.language.structure.Object>) e;\n\n\tres.addAll(col);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//Beginning of the Inlining of the function type: detect\n\nG result_ft35 = null;\n\n\tG elem_ft35 = null;\n\n\tresult_ft35 = null;\n\n\t\n\tkermeta.standard.Iterator<G> it_ft35 = this.iterator();\n\tjava.lang.Boolean idLoopCond_197 = false;\n\twhile( !idLoopCond_197 ) {\n\tidLoopCond_197 = kermeta.standard.helper.BooleanWrapper.or(it_ft35.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft35, null));;\n\tif ( idLoopCond_197 ) {\n\t} else {\n\n\telem_ft35 = it_ft35.next();\n\n\tjava.lang.Boolean idIfCond_198 = false;\n//Beginning of the Inlining of the lambda expression: detector\nG e = elem_ft35;\n\n\tidIfCond_198 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(e, element);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_198 ) {\n\n\tresult_ft35 = elem_ft35;\n}\n\n}\n\t}\n\n//callElement\nelem = result_ft35;\n//End of the Inlining of the function type: detect\n\n\n\tjava.lang.Boolean idIfCond_199 = false;\n\tidIfCond_199 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(elem, null);\n\n\tif( idIfCond_199 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n'"
	 * @generated
	 */
	void removeOne(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementOidDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Removes the element identified by the provided Oid from the Bag\r\n\t \052/'"
	 *        annotation="kermeta.post doesntContainsElementAnymore=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//Beginning of the Inlining of the function type: detect\n\nG result_ft36 = null;\n\n\tG elem_ft36 = null;\n\n\tresult_ft36 = null;\n\n\t\n\tkermeta.standard.Iterator<G> it_ft36 = this.iterator();\n\tjava.lang.Boolean idLoopCond_200 = false;\n\twhile( !idLoopCond_200 ) {\n\tidLoopCond_200 = kermeta.standard.helper.BooleanWrapper.or(it_ft36.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft36, null));;\n\tif ( idLoopCond_200 ) {\n\t} else {\n\n\telem_ft36 = it_ft36.next();\n\n\tjava.lang.Boolean idIfCond_201 = false;\n//Beginning of the Inlining of the lambda expression: detector\nG e = elem_ft36;\n\n\tidIfCond_201 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.oid(e), elementOid);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_201 ) {\n\n\tresult_ft36 = elem_ft36;\n}\n\n}\n\t}\n\n//callElement\nelem = result_ft36;\n//End of the Inlining of the function type: detect\n\n\n\tjava.lang.Boolean idIfCond_202 = false;\n\tidIfCond_202 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(elem, null);\n\n\tif( idIfCond_202 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n'"
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
