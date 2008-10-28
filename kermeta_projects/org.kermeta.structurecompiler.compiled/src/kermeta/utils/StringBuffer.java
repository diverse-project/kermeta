/**
 * <copyright>
 * </copyright>
 *
 * $Id: StringBuffer.java,v 1.6 2008-10-28 13:18:27 cfaucher Exp $
 */
package kermeta.utils;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.utils.StringBuffer#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.utils.UtilsPackage#getStringBuffer()
 * @model annotation="kermeta documentation='/**\n * This class mimic the behavior of the java\'s StringBuffer class. This enables better performance in long\n * string concatenation.<br>\n * <b>Only work on Strings</b>\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\n \052/'"
 *        annotation="kermeta EMF_needProperty='name=content isUnique=true isOrdered=false javaClass=java.lang.StringBuffer'"
 * @generated
 */
public interface StringBuffer extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(java.lang.StringBuffer)
	 * @see kermeta.utils.UtilsPackage#getStringBuffer_Content()
	 * @model dataType="kermeta.utils.KermetaProperty_StringBuffer_content"
	 * @generated
	 */
	java.lang.StringBuffer getContent();

	/**
	 * Sets the value of the '{@link kermeta.utils.StringBuffer#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(java.lang.StringBuffer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arg0DataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Append a given string at the end of this StringBuffer\n\t * @param arg0 A string to append at the end of this StringBuffer\n\t * @return A reference to this object\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.utils.StringBuffer result = null;\n\n\tresult = (kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.basetypes.StringBufferUtil.append(this, arg0);\n\nreturn result;\n'"
	 * @generated
	 */
	StringBuffer append(String arg0);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * Return the length of the StringBuffer\n\t * @return length of the StringBuffer\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.basetypes.StringBufferUtil.length(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Integer length();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t *Convert this StringBuffer to String and return its value\n\t *@return The string value of this StringBuffer\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.String stringValue = null;\n\n\tstringValue = (java.lang.String) org.kermeta.compil.runtime.helper.basetypes.StringBufferUtil.toString(this);\n\n\tresult = stringValue;\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

} // StringBuffer
