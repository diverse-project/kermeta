/**
 * <copyright>
 * </copyright>
 *
 * $Id: StringBuffer.java,v 1.1 2008-07-02 09:43:42 ftanguy Exp $
 */
package kermeta.utils;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.utils.UtilsPackage#getStringBuffer()
 * @model annotation="kermeta documentation='/**\n * This class mimic the behavior of the java\'s StringBuffer class. This enables better performance in long\n * string concatenation.<br>\n * <b>Only work on Strings</b>\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\n \052/'"
 * @generated
 */
public interface StringBuffer extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arg0DataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/**\n\t * Append a given string at the end of this StringBuffer\n\t * @param arg0 A string to append at the end of this StringBuffer\n\t * @return A reference to this object\n\t \052/'"
	 * @generated
	 */
	StringBuffer append(String arg0);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\n\t * Return the length of the StringBuffer\n\t * @return length of the StringBuffer\n\t \052/'"
	 * @generated
	 */
	int length();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/**\n\t *Convert this StringBuffer to String and return its value\n\t *@return The string value of this StringBuffer\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 * @generated
	 */
	String toString();

} // StringBuffer
