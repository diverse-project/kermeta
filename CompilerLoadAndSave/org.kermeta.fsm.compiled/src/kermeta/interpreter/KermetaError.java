/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: KermetaError.java,v 1.1 2008-07-02 09:13:33 ftanguy Exp $
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
 *        annotation="kermeta documentation='/**\r\n * Kermeta language error in a code written in Kermeta\r\n \052/'"
 * @generated
 */
public interface KermetaError extends kermeta.language.structure.Object
{
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
   * @model dataType="kermeta.standard.String"
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
