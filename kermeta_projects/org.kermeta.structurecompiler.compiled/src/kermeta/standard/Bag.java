/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bag.java,v 1.3 2008-09-22 14:48:27 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tresult = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\tG elem = null;\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_64 = false;\n\twhile( !idLoopCond_64 ) {\n\tidLoopCond_64 = it.isOff();\n\tif ( idLoopCond_64 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_65 = false;\n\tidIfCond_65 = elements.contains(elem);\n\n\tif( idIfCond_65 ) {\n\n\tjava.lang.Boolean idIfCond_66 = false;\n\tidIfCond_66 = kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(this.count(elem), elements.count(elem));\n\n\tif( idIfCond_66 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\n\tit = elements.iterator();\n\n\t\n\tjava.lang.Boolean idLoopCond_67 = false;\n\twhile( !idLoopCond_67 ) {\n\tidLoopCond_67 = it.isOff();\n\tif ( idLoopCond_67 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_68 = false;\n\tidIfCond_68 = this.contains(elem);\n\n\tif( idIfCond_68 ) {\n\n\tjava.lang.Boolean idIfCond_69 = false;\n\tidIfCond_69 = kermeta.standard.helper.IntegerWrapper.isLower(elements.count(elem), this.count(elem));\n\n\tif( idIfCond_69 ) {\n\n\tresult.add(elem);\n}\n\n}\n\n}\n\t}\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> intersection(Bag<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides Object.equals(elt : Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Bag\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_70 = false;\n\tidIfCond_70 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(element));\n\n\tif( idIfCond_70 ) {\n\n\tjava.lang.Boolean idIfCond_71 = false;\n\tidIfCond_71 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<G>\"), element);\n\n\tif( idIfCond_71 ) {\n\n\tkermeta.standard.Bag<G> collection = null;\n\n\tcollection = (kermeta.standard.Bag<G>) element;\n\n\tkermeta.standard.Set<G> selfAsSet = this.asSet();\n\n\tisEqual = selfAsSet.equals(collection.asSet());\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<G> result = null;\n\n\tresult = ((kermeta.standard.Set<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<G>\"));\n\n\tG elem = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it = elements.iterator();\n\tjava.lang.Boolean idLoopCond_72 = false;\n\twhile( !idLoopCond_72 ) {\n\tidLoopCond_72 = it.isOff();\n\tif ( idLoopCond_72 ) {\n\t} else {\n\n\telem = it.next();\n\n\tjava.lang.Boolean idIfCond_73 = false;\n\tidIfCond_73 = this.contains(elem);\n\n\tif( idIfCond_73 ) {\n\n\tresult.add(elem);\n}\n\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Set<G> intersectionWithSet(Set<G> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag which content includes all non-Collection elements\r\n\t * of the current Set, and, for each Collection element of the current\r\n\t * Bag, as many elements as the Collection contains\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<kermeta.language.structure.Object> result = null;\n\n\tkermeta.standard.Bag<kermeta.language.structure.Object> res = ((kermeta.standard.Bag<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<kermeta.language.structure.Object>\"));\n\n\tjava.lang.Boolean idIfCond_74 = false;\n\tidIfCond_74 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isKindOf(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"G\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n\n\tif( idIfCond_74 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> col = null;\n\n\tkermeta.language.structure.Object o = null;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft15 = this.iterator();\n\tjava.lang.Boolean idLoopCond_75 = false;\n\twhile( !idLoopCond_75 ) {\n\tidLoopCond_75 = it_ft15.isOff();\n\tif ( idLoopCond_75 ) {\n\t} else {\n\n\t//BIle:func\nG e_lbdExp15 = it_ft15.next();\n\n\tcol = (kermeta.standard.Collection<kermeta.language.structure.Object>) e_lbdExp15;\n\n\tres.addAll(col);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tresult = res;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<kermeta.language.structure.Object> flatten();

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
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns a new Bag which content includes the content of the\r\n\t * current Bag and the element object\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Bag<G> result = null;\n\n\tkermeta.standard.Bag<G> s = ((kermeta.standard.Bag<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Bag<G>\"));\n\n\ts.addAll(this);\n\n\ts.add(object);\n\n\tresult = s;\n\nreturn result;\n'"
	 * @generated
	 */
	Bag<G> including(G object);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft16 = null;\n\n\tG elem_ft16 = null;\n\n\tresult_ft16 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft16 = this.iterator();\n\tjava.lang.Boolean idLoopCond_76 = false;\n\twhile( !idLoopCond_76 ) {\n\tidLoopCond_76 = kermeta.standard.helper.BooleanWrapper.or(it_ft16.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft16, null));\n\tif ( idLoopCond_76 ) {\n\t} else {\n\n\telem_ft16 = it_ft16.next();\n\n\tjava.lang.Boolean idIfCond_77 = false;\n//BIle:detector\nG e_lbdExp16 = elem_ft16;\n\n\tidIfCond_77 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(e_lbdExp16, element);\n//EIle:detector\n\n\n\tif( idIfCond_77 ) {\n\n\tresult_ft16 = elem_ft16;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft16;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_78 = false;\n\tidIfCond_78 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(elem, null);\n\n\tif( idIfCond_78 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n'"
	 * @generated
	 */
	void removeOne(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementOidDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Removes the element identified by the provided Oid from the Bag\r\n\t \052/'"
	 *        annotation="kermeta.post doesntContainsElementAnymore=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tG elem = null;\n//BIft:detect\n\nG result_ft17 = null;\n\n\tG elem_ft17 = null;\n\n\tresult_ft17 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<G> it_ft17 = this.iterator();\n\tjava.lang.Boolean idLoopCond_79 = false;\n\twhile( !idLoopCond_79 ) {\n\tidLoopCond_79 = kermeta.standard.helper.BooleanWrapper.or(it_ft17.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft17, null));\n\tif ( idLoopCond_79 ) {\n\t} else {\n\n\telem_ft17 = it_ft17.next();\n\n\tjava.lang.Boolean idIfCond_80 = false;\n//BIle:detector\nG e_lbdExp17 = elem_ft17;\n\n\tidIfCond_80 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.oid(e_lbdExp17), elementOid);\n//EIle:detector\n\n\n\tif( idIfCond_80 ) {\n\n\tresult_ft17 = elem_ft17;\n}\n\n}\n\t}\n}\n\n\n//CE\nelem = result_ft17;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_81 = false;\n\tidIfCond_81 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(elem, null);\n\n\tif( idIfCond_81 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.remove(this, elem);\n}\n\n'"
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
