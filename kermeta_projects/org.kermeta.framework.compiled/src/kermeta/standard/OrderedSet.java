/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderedSet.java,v 1.2 2008-08-19 13:23:04 cfaucher Exp $
 */
package kermeta.standard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Set</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getOrderedSet()
 * @model annotation="kermeta documentation='/**\r\n * An OrderedSet is a Set that contained ordered distinct elements\r\n * not used for the moment @EMF_needProperty \"isUnique=true isOrdered=true javaClass=org.eclipse.emf.common.util.BasicEList\"\r\n \052/'"
 * @generated
 */
public interface OrderedSet<G> extends Set<G>, OrderedCollection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted in head\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<G> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<G>\"));\n\n\tresult.addAll(this);\n\n\tresult.add(element);\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> append(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides OrderedCollection<G>.addAt(Integer, G)\r\n\t * Adds element in the OrderedSet at rank index if the ordered set does\r\n\t * not already contain the element, does nothing otherwise\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::OrderedCollection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_217 = false;\n\tidIfCond_217 = kermeta.standard.helper.BooleanWrapper.not(this.contains(element));\n\n\tif( idIfCond_217 ) {\n\n\t//Call of the super operation\n((kermeta.standard.OrderedCollection) this).addAt(index, element);\n}\n\n'"
	 * @generated
	 */
	void addAt(Integer index, G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted at rank index\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<G> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<G>\"));\n\n\tresult.addAll(this);\n\n\tresult.addAt(index, subject);\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> insertAt(Integer index, G subject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted in tail\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<G> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<G>\"));\n\n\tresult.add(element);\n\n\tresult.addAll(this);\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> preppend(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * See OrderedCollection<G>.equals(Object) \r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::OrderedCollection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = //Call of the super operation\n((kermeta.standard.OrderedCollection) this).equals(element);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns element at rank index in the sequence\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedSet\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_218 = false;\n\tidIfCond_218 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(index, 0), kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(index, this.size()));\n\n\tif( idIfCond_218 ) {\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\t\n\tjava.lang.Integer i = kermeta.standard.helper.IntegerWrapper.uminus(1);\n\tjava.lang.Boolean idLoopCond_219 = false;\n\twhile( !idLoopCond_219 ) {\n\tidLoopCond_219 = kermeta.standard.helper.IntegerWrapper.equals(i, index);;\n\tif ( idLoopCond_219 ) {\n\t} else {\n\n\tresult = it.next();\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n else {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.IndexOutOfBound\")) );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	G at(Integer index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * See Set<G>.add(G)\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::Set'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//Call of the super operation\n((kermeta.standard.Set) this).add(element);\n'"
	 * @generated
	 */
	void add(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model minDataType="kermeta.standard.JavaInteger" maxDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Builds and returns a new OrderedSet composed of elements of current ordered\r\n\t * set from rank min to rank max (order is respected)\r\n\t * Raises IndexOutOfBound exception if min is negative, max is larger than \r\n\t * the size of the ordered set or min is larger than max\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<G> result = null;\n\n\tresult = ((kermeta.standard.OrderedSet<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<G>\"));\n\n\tjava.lang.Boolean idIfCond_220 = false;\n\tidIfCond_220 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(min, 0), kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(max, this.size())), kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(min, max));\n\n\tif( idIfCond_220 ) {\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tjava.lang.Integer i = 0;\n\n\t\n\tjava.lang.Boolean idLoopCond_221 = false;\n\twhile( !idLoopCond_221 ) {\n\tidLoopCond_221 = kermeta.standard.helper.IntegerWrapper.equals(i, min);;\n\tif ( idLoopCond_221 ) {\n\t} else {\n\n\tit.next();\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n\n\t\n\tjava.lang.Boolean idLoopCond_222 = false;\n\twhile( !idLoopCond_222 ) {\n\tidLoopCond_222 = kermeta.standard.helper.IntegerWrapper.equals(i, kermeta.standard.helper.IntegerWrapper.plus(max, 1));;\n\tif ( idLoopCond_222 ) {\n\t} else {\n\n\tresult.add(it.next());\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n else {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.IndexOutOfBound\")) );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	OrderedSet<G> subSet(Integer min, Integer max);

} // OrderedSet
