/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaError.java,v 1.2 2008-09-11 12:34:54 cfaucher Exp $
 */
package kermeta.interpreter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kermeta Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.interpreter.KermetaError#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.interpreter.InterpreterPackage#getKermetaError()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\n * Kermeta language error in a code written in Kermeta\n \052/'"
 * @generated
 */
public interface KermetaError extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see kermeta.interpreter.InterpreterPackage#getKermetaError_Message()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Error message\n\t \052/'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link kermeta.interpreter.KermetaError#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // KermetaError
