/**
 * <copyright>
 * </copyright>
 *
 * $Id: Log.java,v 1.5 2008-10-16 13:18:04 cfaucher Exp $
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
public interface Log extends kermeta.language.structure.Object {
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
	 * @model annotation="kermeta documentation='/** \r\n\t * list of detected assertion failures\r\n\t \052/'"
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
	 * @model annotation="kermeta documentation='/**\r\n\t * list of detected test errors\r\n\t \052/'"
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
	 * @see #setRuntests(Integer)
	 * @see kermeta.kunit.KunitPackage#getLog_Runtests()
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * number of test that were run\r\n\t \052/'"
	 * @generated
	 */
	Integer getRuntests();

	/**
	 * Sets the value of the '{@link kermeta.kunit.Log#getRuntests <em>Runtests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtests</em>' attribute.
	 * @see #getRuntests()
	 * @generated
	 */
	void setRuntests(Integer value);

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
	 * @model annotation="kermeta documentation='/**\r\n\t* list of detected errors with the test harness\r\n\t\052/'"
	 * @generated
	 */
	EList<kermeta.kunit.Error> getHarnessErrors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Adds errors which occur during the SetUp phase\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getHarnessErrors()).add(((kermeta.kunit.Error) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.Error\")).initFrom(test, e).makeSetUp());\n'"
	 * @generated
	 */
	void addSetUpError(Fallible test, kermeta.exceptions.Exception e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Adds an error to the list of errors\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getErrors()).add(((kermeta.kunit.Error) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.Error\")).initFrom(test, e));\n'"
	 * @generated
	 */
	void addTestError(Fallible test, kermeta.exceptions.Exception e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Adds a failed test to the list of failed tests\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getFailures()).add(((kermeta.kunit.Failure) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.Failure\")).initFrom(test, msg));\n'"
	 * @generated
	 */
	void addFailure(Fallible test, String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Adds errors which occur during the TearDown phase\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getHarnessErrors()).add(((kermeta.kunit.Error) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.Error\")).initFrom(test, e).makeTearDown());\n'"
	 * @generated
	 */
	void addTearDownError(Fallible test, kermeta.exceptions.Exception e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Increments the runtests counter\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1018 = false;\n\tidIfCond_1018 = kermeta.standard.helper.IntegerWrapper.equals(this.getRuntests(), null);\n\n\tif( idIfCond_1018 ) {\n\n\tthis.setRuntests(0);\n}\n\n\n\tthis.setRuntests(kermeta.standard.helper.IntegerWrapper.plus(1, this.getRuntests()));\n'"
	 * @generated
	 */
	void newAttempt();

} // Log
