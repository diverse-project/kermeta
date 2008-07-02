/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Log.java,v 1.1 2008-07-02 09:13:32 ftanguy Exp $
 */
package kermeta.kunit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.Log#getFailures <em>Failures</em>}</li>
 *   <li>{@link kermeta.kunit.Log#getErrors <em>Errors</em>}</li>
 *   <li>{@link kermeta.kunit.Log#getRuntests <em>Runtests</em>}</li>
 *   <li>{@link kermeta.kunit.Log#getHarnessErrors <em>Harness Errors</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getLog()
 * @model annotation="kermeta documentation='/**\r\n * Log is a log of failures and errors that happened to fallibles since start was called\r\n \052/'"
 * @generated
 */
public interface Log extends kermeta.language.structure.Object
{
  /**
   * Returns the value of the '<em><b>Failures</b></em>' reference list.
   * The list contents are of type {@link kermeta.kunit.Failure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Failures</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Failures</em>' reference list.
   * @see kermeta.kunit.KunitPackage#getLog_Failures()
   * @model
   * @generated
   */
  EList<Failure> getFailures();

  /**
   * Returns the value of the '<em><b>Errors</b></em>' reference list.
   * The list contents are of type {@link kermeta.kunit.Error}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Errors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Errors</em>' reference list.
   * @see kermeta.kunit.KunitPackage#getLog_Errors()
   * @model
   * @generated
   */
  EList<kermeta.kunit.Error> getErrors();

  /**
   * Returns the value of the '<em><b>Runtests</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Runtests</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Runtests</em>' attribute.
   * @see #setRuntests(int)
   * @see kermeta.kunit.KunitPackage#getLog_Runtests()
   * @model dataType="kermeta.standard.Integer"
   * @generated
   */
  int getRuntests();

  /**
   * Sets the value of the '{@link kermeta.kunit.Log#getRuntests <em>Runtests</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Runtests</em>' attribute.
   * @see #getRuntests()
   * @generated
   */
  void setRuntests(int value);

  /**
   * Returns the value of the '<em><b>Harness Errors</b></em>' reference list.
   * The list contents are of type {@link kermeta.kunit.Error}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Harness Errors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Harness Errors</em>' reference list.
   * @see kermeta.kunit.KunitPackage#getLog_HarnessErrors()
   * @model
   * @generated
   */
  EList<kermeta.kunit.Error> getHarnessErrors();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Adds errors which occur durint the SetUp phase\r\n\t \052/'"
   * @generated
   */
  void addSetUpError(Fallible test, kermeta.exceptions.Exception e);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Adds an error to the list of errors\r\n\t \052/'"
   * @generated
   */
  void addTestError(Fallible test, kermeta.exceptions.Exception e);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model msgDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Adds a failed test to the list of failed tests\r\n\t \052/'"
   * @generated
   */
  void addFailure(Fallible test, String msg);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Adds errors which occur durint the TearDown phase\r\n\t \052/'"
   * @generated
   */
  void addTearDownError(Fallible test, kermeta.exceptions.Exception e);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Increments the runtests counter\r\n\t \052/'"
   * @generated
   */
  void newAttempt();

} // Log
