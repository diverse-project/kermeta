/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Fallible.java,v 1.1 2008-07-02 09:13:32 ftanguy Exp $
 */
package kermeta.kunit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fallible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.Fallible#isStopOnFailure <em>Stop On Failure</em>}</li>
 *   <li>{@link kermeta.kunit.Fallible#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getFallible()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * This is represents the aspect of tests that they may go wrong.\r\n * it defines the ability to define the conditions for success\r\n * (assertions) and the mechanism for recording that those \r\n * conditions have not been met.\r\n \052/'"
 * @generated
 */
public interface Fallible extends AbstractFallible
{
  /**
   * Returns the value of the '<em><b>Stop On Failure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stop On Failure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop On Failure</em>' attribute.
   * @see #setStopOnFailure(boolean)
   * @see kermeta.kunit.KunitPackage#getFallible_StopOnFailure()
   * @model dataType="kermeta.standard.Boolean"
   * @generated
   */
  boolean isStopOnFailure();

  /**
   * Sets the value of the '{@link kermeta.kunit.Fallible#isStopOnFailure <em>Stop On Failure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop On Failure</em>' attribute.
   * @see #isStopOnFailure()
   * @generated
   */
  void setStopOnFailure(boolean value);

  /**
   * Returns the value of the '<em><b>Rank</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rank</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rank</em>' attribute.
   * @see #setRank(int)
   * @see kermeta.kunit.KunitPackage#getFallible_Rank()
   * @model dataType="kermeta.standard.Integer"
   * @generated
   */
  int getRank();

  /**
   * Sets the value of the '{@link kermeta.kunit.Fallible#getRank <em>Rank</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rank</em>' attribute.
   * @see #getRank()
   * @generated
   */
  void setRank(int value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model conditionDataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is false\r\n   \052/'"
   *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
   * @generated
   */
  void assertTrue(boolean condition);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   *        annotation="kermeta isAbstract='true'"
   *        annotation="kermeta documentation='/**\r\n   * where failures will be put \r\n   \052/'"
   *        annotation="kermeta.post logDefined=''"
   * @generated
   */
  Log getLog();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model conditionDataType="kermeta.standard.Boolean" messageDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is true\r\n   \052/'"
   *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
   * @generated
   */
  void assertFalseWithMsg(boolean condition, String message);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model msgDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n   * Log a failure \r\n   \052/'"
   *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
   * @generated
   */
  void fail(String msg);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model expectedDataType="kermeta.standard.String" actualDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n   * Log a failure if the two strings are not identical\r\n   \052/'"
   *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
   * @generated
   */
  void assertEqual(String expected, String actual);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model conditionDataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is true\r\n   \052/'"
   *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
   * @generated
   */
  void assertFalse(boolean condition);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model conditionDataType="kermeta.standard.Boolean" messageDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is false\r\n   \052/'"
   *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
   * @generated
   */
  void assertTrueWithMsg(boolean condition, String message);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model conditionDataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is false\r\n   \052/'"
   *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
   * @generated
   */
  void _assert(boolean condition);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Integer"
   *        annotation="kermeta documentation='/**\r\n   * current order position of counter of assertions\r\n   \052/'"
   * @generated
   */
  int number();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model conditionDataType="kermeta.standard.Boolean" msgDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is false\r\n   \052/'"
   *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
   * @generated
   */
  void assertWithMsg(boolean condition, String msg);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean"
   * @generated
   */
  boolean mustStop();

} // Fallible
