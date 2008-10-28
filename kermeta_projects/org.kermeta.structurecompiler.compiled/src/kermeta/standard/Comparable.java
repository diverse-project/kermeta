/**
 * <copyright>
 * </copyright>
 *
 * $Id: Comparable.java,v 1.6 2008-10-28 13:18:15 cfaucher Exp $
 */
package kermeta.standard;

import java.lang.Boolean;
import java.lang.Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getComparable()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * The abstract class Comparable defines a set of operation\r\n * to compare instances of a class.\r\n * Sub-classes only has to implement abstract operation compareTo.\r\n * All other methods are defined w.r.t. the compareTo operation\r\n \052/'"
 * @generated
 */
public interface Comparable extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * return true if self < other\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.IntegerWrapper.isLower(this.compareTo(other), 0);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isLower(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * return true if self >= other\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(this.compareTo(other), 0);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isGreaterOrEqual(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n\t * This method should be implemented by any class that inherits\r\n\t * from Comparable.\r\n\t * returns 0 if self = other\r\n\t * returns > 0 if  self > other\r\n\t * returns < 0 if  self < other\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Integer result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Integer compareTo(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * return true if self <= other\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(this.compareTo(other), 0);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isLowerOrEqual(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * return true if self > other\r\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.IntegerWrapper.isGreater(this.compareTo(other), 0);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isGreater(kermeta.language.structure.Object other);

} // Comparable
