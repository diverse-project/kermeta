/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Failure.java,v 1.1 2008-07-02 09:13:32 ftanguy Exp $
 */
package kermeta.kunit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.Failure#getMessage <em>Message</em>}</li>
 *   <li>{@link kermeta.kunit.Failure#getFailure <em>Failure</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getFailure()
 * @model annotation="kermeta documentation='/**\r\n * Failure represents an assertion failure stored in a failure log\r\n \052/'"
 * @generated
 */
public interface Failure extends kermeta.language.structure.Object
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
   * @see kermeta.kunit.KunitPackage#getFailure_Message()
   * @model dataType="kermeta.standard.String"
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link kermeta.kunit.Failure#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

  /**
   * Returns the value of the '<em><b>Failure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Failure</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Failure</em>' reference.
   * @see #setFailure(Fallible)
   * @see kermeta.kunit.KunitPackage#getFailure_Failure()
   * @model
   * @generated
   */
  Fallible getFailure();

  /**
   * Sets the value of the '{@link kermeta.kunit.Failure#getFailure <em>Failure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Failure</em>' reference.
   * @see #getFailure()
   * @generated
   */
  void setFailure(Fallible value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * overwrite the default method, in order to add the message\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
   * @generated
   */
  String toString();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model msgDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * initialization of the failure\r\n\t \052/'"
   * @generated
   */
  Failure initFrom(Fallible fallible, String msg);

} // Failure
