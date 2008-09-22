/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderedCollection.java,v 1.3 2008-09-22 14:48:27 cfaucher Exp $
 */
package kermeta.standard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getOrderedCollection()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * An OrderedCollection is the root abstract class for all ordered Collections.\r\n * not used for the moment @EMF_needProperty \"isUnique=false isOrdered=true javaClass=org.eclipse.emf.common.util.BasicEList\"\r\n \052/'"
 * @generated
 */
public interface OrderedCollection<G> extends Collection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Adds element in the OrderedCollection at rank index\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_82 = false;\n\tidIfCond_82 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isLower(index, 0), kermeta.standard.helper.IntegerWrapper.isGreater(index, this.size()));\n\n\tif( idIfCond_82 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.IndexOutOfBound\")) );\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil.addAt(this, index, element);\n'"
	 * @generated
	 */
	void addAt(Integer index, G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Removes the element at rank index from the OrderedCollection\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_83 = false;\n\tidIfCond_83 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isLower(index, 0), kermeta.standard.helper.IntegerWrapper.isGreater(index, kermeta.standard.helper.IntegerWrapper.minus(this.size(), 1)));\n\n\tif( idIfCond_83 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.IndexOutOfBound\")) );\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil.removeAt(this, index);\n'"
	 * @generated
	 */
	void removeAt(Integer index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns the last element in the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_84 = false;\n\tidIfCond_84 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_84 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.EmptyCollection\")) );\n\n}\n\n\n\tresult = this.elementAt(kermeta.standard.helper.IntegerWrapper.minus(this.size(), 1));\n\nreturn result;\n'"
	 * @generated
	 */
	G last();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Overrides Object.equals(Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current OrderedCollection\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_85 = false;\n\tidIfCond_85 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(element));\n\n\tif( idIfCond_85 ) {\n\n\tjava.lang.Boolean idIfCond_86 = false;\n\tidIfCond_86 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.OrderedCollection<G>\"), element);\n\n\tif( idIfCond_86 ) {\n\n\tkermeta.standard.Collection<G> collection = null;\n\n\tcollection = (kermeta.standard.Collection<G>) element;\n\n\tjava.lang.Boolean idIfCond_87 = false;\n\tidIfCond_87 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), collection.size());\n\n\tif( idIfCond_87 ) {\n\n\tkermeta.standard.Iterator<G> selfIterator = this.iterator();\n\n\tkermeta.standard.Iterator<G> collectionIterator = collection.iterator();\n\n\tjava.lang.Boolean difference = false;\n\n\t\n\tkermeta.standard.helper.IntegerWrapper.equals(1, 1);\n\tjava.lang.Boolean idLoopCond_88 = false;\n\twhile( !idLoopCond_88 ) {\n\tidLoopCond_88 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(selfIterator.isOff(), collectionIterator.isOff()), difference);\n\tif ( idLoopCond_88 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_89 = false;\n\tidIfCond_89 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(selfIterator.next(), collectionIterator.next()));\n\n\tif( idIfCond_89 ) {\n\n\tdifference = true;\n}\n\n}\n\t}\n\n\tisEqual = kermeta.standard.helper.BooleanWrapper.not(difference);\n}\n\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/** \r\n\t * Returns the index of the first instance of element in the OrderedCollection\r\n\t * or -1 if the element is not contained by the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tjava.lang.Boolean idIfCond_90 = false;\n\tidIfCond_90 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_90 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.EmptyCollection\")) );\n\n}\n\n\n\tjava.lang.Integer i = 0;\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tjava.lang.Boolean found = false;\n\n\t\n\tjava.lang.Boolean idLoopCond_91 = false;\n\twhile( !idLoopCond_91 ) {\n\tidLoopCond_91 = kermeta.standard.helper.BooleanWrapper.or(found, it.isOff());\n\tif ( idLoopCond_91 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_92 = false;\n\tidIfCond_92 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(element, it.next());\n\n\tif( idIfCond_92 ) {\n\n\tfound = true;\n}\n else {\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\n}\n\t}\n\n\tjava.lang.Boolean idIfCond_93 = false;\n\tidIfCond_93 = found;\n\n\tif( idIfCond_93 ) {\n\n\tresult = i;\n}\n else {\n\n\tresult = kermeta.standard.helper.IntegerWrapper.uminus(1);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Integer indexOf(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the element at rank index in the OrderedCollection\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_94 = false;\n\tidIfCond_94 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isLower(index, 0), kermeta.standard.helper.IntegerWrapper.isGreater(index, kermeta.standard.helper.IntegerWrapper.minus(this.size(), 1)));\n\n\tif( idIfCond_94 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.IndexOutOfBound\")) );\n\n}\n\n\n\tresult = (G) org.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil.elementAt(this, index);\n\nreturn result;\n'"
	 * @generated
	 */
	G elementAt(Integer index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \r\n\t * Returns the first element in the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_95 = false;\n\tidIfCond_95 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_95 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.EmptyCollection\")) );\n\n}\n\n\n\tresult = this.elementAt(0);\n\nreturn result;\n'"
	 * @generated
	 */
	G first();

} // OrderedCollection
