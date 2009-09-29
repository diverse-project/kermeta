/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.standard;

import java.lang.Boolean;
import java.lang.Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getOrderedCollection()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\n * An OrderedCollection is the root abstract class for all ordered Collections.\n \052/'"
 * @generated
 */
public interface OrderedCollection<G> extends Collection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Removes the element at rank index from the OrderedCollection\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\n\t * larger than the size of the OrderedCollection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_264 = false;\n\tidIfCond_264 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isLower(index, 0), kermeta.standard.helper.IntegerWrapper.isGreater(index, kermeta.standard.helper.IntegerWrapper.minus(this.size(), 1)));\n\n\tif( idIfCond_264 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getIndexOutOfBound())) );\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil.removeAt(this, index);\n'"
	 * @generated
	 */
	void removeAt(Integer index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Adds element in the OrderedCollection at rank index\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\n\t * larger than the size of the OrderedCollection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_265 = false;\n\tidIfCond_265 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isLower(index, 0), kermeta.standard.helper.IntegerWrapper.isGreater(index, this.size()));\n\n\tif( idIfCond_265 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getIndexOutOfBound())) );\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil.addAt(this, index, element);\n'"
	 * @generated
	 */
	void addAt(Integer index, G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Returns the element at rank index in the OrderedCollection\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\n\t * larger than the size of the OrderedCollection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_266 = false;\n\tidIfCond_266 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isLower(index, 0), kermeta.standard.helper.IntegerWrapper.isGreater(index, kermeta.standard.helper.IntegerWrapper.minus(this.size(), 1)));\n\n\tif( idIfCond_266 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getIndexOutOfBound())) );\n\n}\n\n\n\tresult = (G) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil.elementAt(this, index), \"G\");\n\nreturn result;\n'"
	 * @generated
	 */
	G elementAt(Integer index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns the last element in the OrderedCollection\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_267 = false;\n\tidIfCond_267 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_267 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getEmptyCollection())) );\n\n}\n\n\n\tresult = this.elementAt(kermeta.standard.helper.IntegerWrapper.minus(this.size(), 1));\n\nreturn result;\n'"
	 * @generated
	 */
	G last();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Overrides Object.equals(Object)\n\t * Returns a Boolean stating whether the provided element is equal to\n\t * current OrderedCollection\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_268 = false;\n\tidIfCond_268 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(element));\n\n\tif( idIfCond_268 ) {\n\n\tjava.lang.Boolean idIfCond_269 = false;\n\tidIfCond_269 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.OrderedCollection<G>\"), element);\n\n\tif( idIfCond_269 ) {\n\n\tkermeta.standard.Collection<G> collection = null;\n\n\tcollection = (kermeta.standard.Collection<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(element, \"kermeta.standard.Collection<G>\");\n\n\tjava.lang.Boolean idIfCond_270 = false;\n\tidIfCond_270 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), collection.size());\n\n\tif( idIfCond_270 ) {\n\n\tkermeta.standard.Iterator<G> selfIterator = this.iterator();\n\n\tkermeta.standard.Iterator<G> collectionIterator = collection.iterator();\n\n\tjava.lang.Boolean difference = false;\n\n\t\n\tkermeta.standard.helper.IntegerWrapper.equals(1, 1);\n\tjava.lang.Boolean idLoopCond_271 = false;\n\twhile( !idLoopCond_271 ) {\n\tidLoopCond_271 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(selfIterator.isOff(), collectionIterator.isOff()), difference);\n\tif ( idLoopCond_271 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_272 = false;\n\tidIfCond_272 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(selfIterator.next(), collectionIterator.next()));\n\n\tif( idIfCond_272 ) {\n\n\tdifference = true;\n}\n\n}\n\t}\n\n\tisEqual = kermeta.standard.helper.BooleanWrapper.not(difference);\n}\n\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/** \n\t * Returns the index of the first instance of element in the OrderedCollection\n\t * or -1 if the element is not contained by the OrderedCollection\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tjava.lang.Boolean idIfCond_273 = false;\n\tidIfCond_273 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_273 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getEmptyCollection())) );\n\n}\n\n\n\tjava.lang.Integer i = 0;\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tjava.lang.Boolean found = false;\n\n\t\n\tjava.lang.Boolean idLoopCond_274 = false;\n\twhile( !idLoopCond_274 ) {\n\tidLoopCond_274 = kermeta.standard.helper.BooleanWrapper.or(found, it.isOff());\n\tif ( idLoopCond_274 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_275 = false;\n\tidIfCond_275 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(element, it.next());\n\n\tif( idIfCond_275 ) {\n\n\tfound = true;\n}\n else {\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\n}\n\t}\n\n\tjava.lang.Boolean idIfCond_276 = false;\n\tidIfCond_276 = found;\n\n\tif( idIfCond_276 ) {\n\n\tresult = i;\n}\n else {\n\n\tresult = kermeta.standard.helper.IntegerWrapper.uminus(1);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Integer indexOf(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Returns the first element in the OrderedCollection\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_277 = false;\n\tidIfCond_277 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_277 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getEmptyCollection())) );\n\n}\n\n\n\tresult = this.elementAt(0);\n\nreturn result;\n'"
	 * @generated
	 */
	G first();

} // OrderedCollection
