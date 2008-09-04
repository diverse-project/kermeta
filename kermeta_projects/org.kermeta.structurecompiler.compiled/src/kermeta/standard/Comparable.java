/**
 * <copyright>
 * </copyright>
 *
 * $Id: Comparable.java,v 1.1 2008-09-04 15:40:28 cfaucher Exp $
 */
package kermeta.standard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.standard.StandardPackage#getComparable()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\n * The abstract class Comparable defines a set of operation\n * to compare instances of a class.\n * Sub-classes only has to implement abstract operation compareTo.\n * All other methods are defined w.r.t. the compareTo operation\n \052/'"
 * @generated
 */
public interface Comparable extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * return true if self < other\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.IntegerWrapper.isLower(this.compareTo(other), 0);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isLower(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * return true if self >= other\n\t \052/'"
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
	 *        annotation="kermeta documentation='/**\n\t * This method should be implemented by any class that inherits\n\t * from Comparable.\n\t * returns 0 if self = other\n\t * returns > 0 if  self > other\n\t * returns < 0 if  self < other\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Integer result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Integer compareTo(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * return true if self <= other\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.IntegerWrapper.isLowerOrEqual(this.compareTo(other), 0);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isLowerOrEqual(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * return true if self > other\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.IntegerWrapper.isGreater(this.compareTo(other), 0);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isGreater(kermeta.language.structure.Object other);

} // Comparable
