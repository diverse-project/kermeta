/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Iterator.java,v 1.11 2009-02-10 17:51:50 cfaucher Exp $
 */
package kermeta.standard;

import java.lang.Boolean;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.standard.Iterator#getJavaIterator <em>Java Iterator</em>}</li>
 *   <li>{@link kermeta.standard.Iterator#getKermetaCollection <em>Kermeta Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.standard.StandardPackage#getIterator()
 * @model annotation="kermeta documentation='/**\r\n * Iterator to be used with Collection\r\n * See also Collection<G>.getIterator()\r\n \052/'"
 *        annotation="kermeta EMF_needProperty='name=javaIterator javaClass=java.util.Iterator'"
 *        annotation="kermeta EMF_needProperty='name=kermetaCollection classDefinitionQN=kermeta::standard::Collection'"
 * @generated
 */
public interface Iterator<G> extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Java Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Iterator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Iterator</em>' attribute.
	 * @see #setJavaIterator(java.util.Iterator)
	 * @see kermeta.standard.StandardPackage#getIterator_JavaIterator()
	 * @model dataType="kermeta.standard.KermetaProperty_Iterator_javaIterator<G>"
	 * @generated
	 */
	java.util.Iterator<G> getJavaIterator();

	/**
	 * Sets the value of the '{@link kermeta.standard.Iterator#getJavaIterator <em>Java Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Iterator</em>' attribute.
	 * @see #getJavaIterator()
	 * @generated
	 */
	void setJavaIterator(java.util.Iterator<G> value);

	/**
	 * Returns the value of the '<em><b>Kermeta Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kermeta Collection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kermeta Collection</em>' reference.
	 * @see #setKermetaCollection(Collection)
	 * @see kermeta.standard.StandardPackage#getIterator_KermetaCollection()
	 * @model
	 * @generated
	 */
	Collection<G> getKermetaCollection();

	/**
	 * Sets the value of the '{@link kermeta.standard.Iterator#getKermetaCollection <em>Kermeta Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kermeta Collection</em>' reference.
	 * @see #getKermetaCollection()
	 * @generated
	 */
	void setKermetaCollection(Collection<G> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true if the iterator has a next element\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.IteratorUtil.hasNext(this), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean hasNext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns the next element of the iterator\r\n\t * Raises IteratorIsOff exception in case the iterator is on the last element \r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nG result = null;\n\n\tjava.lang.Boolean idIfCond_1041 = false;\n\tidIfCond_1041 = kermeta.standard.helper.BooleanWrapper.not(this.hasNext());\n\n\tif( idIfCond_1041 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.IteratorIsOff) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getIteratorIsOff())) );\n\n}\n\n\n\tresult = (G) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.basetypes.IteratorUtil.next(this), \"G\");\n\nreturn result;\n'"
	 * @generated
	 */
	G next();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns true if the iterator is on the last element\r\n\t * i.e. returns not self.hasNext()\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(this.hasNext());\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isOff();

} // Iterator
