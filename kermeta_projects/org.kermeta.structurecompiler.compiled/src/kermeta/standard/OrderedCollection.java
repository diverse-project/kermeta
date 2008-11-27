/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderedCollection.java,v 1.9 2008-11-27 15:49:55 cfaucher Exp $
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
 *        annotation="kermeta documentation='/**\n * An OrderedCollection is the root abstract class for all ordered Collections.\n * not used for the moment @EMF_needProperty \"isUnique=false isOrdered=true javaClass=org.eclipse.emf.common.util.BasicEList\"\n \052/'"
 * @generated
 */
public interface OrderedCollection<G> extends Collection<G> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Removes the element at rank index from the OrderedCollection\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\n\t * larger than the size of the OrderedCollection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_827 = false;\n\tidIfCond_827 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isLower(index, 0), kermeta.standard.helper.IntegerWrapper.isGreater(index, kermeta.standard.helper.IntegerWrapper.minus(this.size(), 1)));\n\n\tif( idIfCond_827 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.IndexOutOfBound\")) );\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil.removeAt(this, index);\n'"
	 * @generated
	 */
	void removeAt(Integer index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Adds element in the OrderedCollection at rank index\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\n\t * larger than the size of the OrderedCollection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_828 = false;\n\tidIfCond_828 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isLower(index, 0), kermeta.standard.helper.IntegerWrapper.isGreater(index, this.size()));\n\n\tif( idIfCond_828 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.IndexOutOfBound\")) );\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil.addAt(this, index, element);\n'"
	 * @generated
	 */
	void addAt(Integer index, G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns the last element in the OrderedCollection\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_829 = false;\n\tidIfCond_829 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_829 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.EmptyCollection\")) );\n\n}\n\n\n\tresult = this.elementAt(kermeta.standard.helper.IntegerWrapper.minus(this.size(), 1));\n\nreturn result;\n'"
	 * @generated
	 */
	G last();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Overrides Object.equals(Object)\n\t * Returns a Boolean stating whether the provided element is equal to\n\t * current OrderedCollection\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean isEqual = false;\n\n\tjava.lang.Boolean idIfCond_830 = false;\n\tidIfCond_830 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(element));\n\n\tif( idIfCond_830 ) {\n\n\tjava.lang.Boolean idIfCond_831 = false;\n\tidIfCond_831 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.OrderedCollection<G>\"), element);\n\n\tif( idIfCond_831 ) {\n\n\tkermeta.standard.Collection<G> collection = null;\n\n\tcollection = (kermeta.standard.Collection<G>) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.standard.Collection<G>>asTypeOrVoid(element);\n\n\tjava.lang.Boolean idIfCond_832 = false;\n\tidIfCond_832 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), collection.size());\n\n\tif( idIfCond_832 ) {\n\n\tkermeta.standard.Iterator<G> selfIterator = this.iterator();\n\n\tkermeta.standard.Iterator<G> collectionIterator = collection.iterator();\n\n\tjava.lang.Boolean difference = false;\n\n\t\n\tkermeta.standard.helper.IntegerWrapper.equals(1, 1);\n\tjava.lang.Boolean idLoopCond_833 = false;\n\twhile( !idLoopCond_833 ) {\n\tidLoopCond_833 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(selfIterator.isOff(), collectionIterator.isOff()), difference);\n\tif ( idLoopCond_833 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_834 = false;\n\tidIfCond_834 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(selfIterator.next(), collectionIterator.next()));\n\n\tif( idIfCond_834 ) {\n\n\tdifference = true;\n}\n\n}\n\t}\n\n\tisEqual = kermeta.standard.helper.BooleanWrapper.not(difference);\n}\n\n}\n\n}\n\n\n\tresult = isEqual;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/** \n\t * Returns the index of the first instance of element in the OrderedCollection\n\t * or -1 if the element is not contained by the OrderedCollection\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tjava.lang.Boolean idIfCond_835 = false;\n\tidIfCond_835 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_835 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.EmptyCollection\")) );\n\n}\n\n\n\tjava.lang.Integer i = 0;\n\n\tkermeta.standard.Iterator<G> it = this.iterator();\n\n\tjava.lang.Boolean found = false;\n\n\t\n\tjava.lang.Boolean idLoopCond_836 = false;\n\twhile( !idLoopCond_836 ) {\n\tidLoopCond_836 = kermeta.standard.helper.BooleanWrapper.or(found, it.isOff());\n\tif ( idLoopCond_836 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_837 = false;\n\tidIfCond_837 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(element, it.next());\n\n\tif( idIfCond_837 ) {\n\n\tfound = true;\n}\n else {\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\n}\n\t}\n\n\tjava.lang.Boolean idIfCond_838 = false;\n\tidIfCond_838 = found;\n\n\tif( idIfCond_838 ) {\n\n\tresult = i;\n}\n else {\n\n\tresult = kermeta.standard.helper.IntegerWrapper.uminus(1);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Integer indexOf(G element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexDataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Returns the element at rank index in the OrderedCollection\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\n\t * larger than the size of the OrderedCollection\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_839 = false;\n\tidIfCond_839 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isLower(index, 0), kermeta.standard.helper.IntegerWrapper.isGreater(index, kermeta.standard.helper.IntegerWrapper.minus(this.size(), 1)));\n\n\tif( idIfCond_839 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.IndexOutOfBound\")) );\n\n}\n\n\n\tresult = (G) org.kermeta.compil.runtime.ExecutionContext.getInstance().<G>asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil.elementAt(this, index));\n\nreturn result;\n'"
	 * @generated
	 */
	G elementAt(Integer index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Returns the first element in the OrderedCollection\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_840 = false;\n\tidIfCond_840 = kermeta.standard.helper.IntegerWrapper.equals(this.size(), 0);\n\n\tif( idIfCond_840 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.EmptyCollection) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.EmptyCollection\")) );\n\n}\n\n\n\tresult = this.elementAt(0);\n\nreturn result;\n'"
	 * @generated
	 */
	G first();

} // OrderedCollection
