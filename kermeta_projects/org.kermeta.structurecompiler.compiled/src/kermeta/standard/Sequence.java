/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Sequence.java,v 1.11 2009-02-10 17:51:50 cfaucher Exp $
 */
package kermeta.standard;

import java.lang.Boolean;
import java.lang.Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getSequence()
 * @model annotation="kermeta documentation='/**\r\n * A Sequence is an OrderedCollection of elements allowing duplicates\r\n * not used for the moment @EMF_needProperty \"isUnique=false isOrdered=true javaClass=org.eclipse.emf.common.util.BasicEList\"\r\n \052/'"
 * @generated
 */
public interface Sequence<G> extends Bag<G>, OrderedCollection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model minDataType="kermeta.standard.JavaInteger" maxDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Builds and returns a new Sequence composed of elements of current sequence\r\n\t * from rank min to rank max (order is respected)\r\n\t * Raises IndexOutOfBound exception if min is negative, max is larger than \r\n\t * the size of the sequence or min is larger than max\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tresult = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\tjava.lang.Boolean idIfCond_1036 = false;\n\tidIfCond_1036 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(min, 0), kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(max, this.size())), kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(min, max));\n\n\tif( idIfCond_1036 ) {\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tjava.lang.Integer i = 0;\n\n\t\n\tjava.lang.Boolean idLoopCond_1037 = false;\n\twhile( !idLoopCond_1037 ) {\n\tidLoopCond_1037 = kermeta.standard.helper.IntegerWrapper.equals(i, min);\n\tif ( idLoopCond_1037 ) {\n\t} else {\n\n\tit.next();\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n\n\t\n\tjava.lang.Boolean idLoopCond_1038 = false;\n\twhile( !idLoopCond_1038 ) {\n\tidLoopCond_1038 = kermeta.standard.helper.IntegerWrapper.equals(i, kermeta.standard.helper.IntegerWrapper.plus(max, 1));\n\tif ( idLoopCond_1038 ) {\n\t} else {\n\n\tresult.add(it.next());\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n else {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getIndexOutOfBound())) );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> subSequence(Integer min, Integer max);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted in head\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tresult = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\tresult.addAll(this);\n\n\tresult.add(element);\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> append(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted at rank index\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tresult = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\tresult.addAll(this);\n\n\tresult.addAt(index, element);\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> insertAt(Integer index, G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides OrderedCollection<G>.equals(Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Sequence\t\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::standard::OrderedCollection'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.OrderedCollectionSuper.super_equals(this, element);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted in tail\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Sequence<G> result = null;\n\n\tresult = ((kermeta.standard.Sequence<G>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\tresult.add(element);\n\n\tresult.addAll(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Sequence<G> preppend(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns element at rank index in the sequence\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the Sequence\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_1039 = false;\n\tidIfCond_1039 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(index, 0), kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(index, this.size()));\n\n\tif( idIfCond_1039 ) {\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\t\n{\n\n\tjava.lang.Integer i = kermeta.standard.helper.IntegerWrapper.uminus(1);\n\tjava.lang.Boolean idLoopCond_1040 = false;\n\twhile( !idLoopCond_1040 ) {\n\tidLoopCond_1040 = kermeta.standard.helper.IntegerWrapper.equals(i, index);\n\tif ( idLoopCond_1040 ) {\n\t} else {\n\n\tresult = it.next();\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n}\n else {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getIndexOutOfBound())) );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	G at(Integer index);

} // Sequence
