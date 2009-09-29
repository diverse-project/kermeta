/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.kunit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.Error#getError <em>Error</em>}</li>
 *   <li>{@link kermeta.kunit.Error#getException <em>Exception</em>}</li>
 *   <li>{@link kermeta.kunit.Error#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getError()
 * @model annotation="kermeta documentation='/**\n * Error represents an occurrence of an exception in setUp, tearDown or a test\n * and is stored in a failure log\n \052/'"
 * @generated
 */
public interface Error extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' reference.
	 * @see #setError(Fallible)
	 * @see kermeta.kunit.KunitPackage#getError_Error()
	 * @model annotation="kermeta documentation='/**\n\t * the stored error\n\t \052/'"
	 * @generated
	 */
	Fallible getError();

	/**
	 * Sets the value of the '{@link kermeta.kunit.Error#getError <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(Fallible value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference.
	 * @see #setException(kermeta.exceptions.Exception)
	 * @see kermeta.kunit.KunitPackage#getError_Exception()
	 * @model annotation="kermeta documentation='/**\n\t * the Kermeta exception corresponding to the error\n\t \052/'"
	 * @generated
	 */
	kermeta.exceptions.Exception getException();

	/**
	 * Sets the value of the '{@link kermeta.kunit.Error#getException <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(kermeta.exceptions.Exception value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link kermeta.kunit.ErrorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see kermeta.kunit.ErrorKind
	 * @see #setKind(ErrorKind)
	 * @see kermeta.kunit.KunitPackage#getError_Kind()
	 * @model transient="true"
	 *        annotation="kermeta documentation='/**\n\t * the nature of the stored error\n\t \052/'"
	 * @generated
	 */
	ErrorKind getKind();

	/**
	 * Sets the value of the '{@link kermeta.kunit.Error#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see kermeta.kunit.ErrorKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ErrorKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Changes the type of an error to makeTearDownError, the best way to use\n\t * this method is to call it after the init from line:\n\t * var e : Error init Error.new.initFrom(f, e).makeTearDown\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.Error result = null;\n\n\tthis.setKind(kermeta.kunit.ErrorKind.getByName(\"tearDownError\"));\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	Error makeTearDown();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Changes the type of an error to SetUpError, the best way to use\n\t * this method is to call it after the init from line:\n\t * var e : Error init Error.new.initFrom(f, e).makeSetUp\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.Error result = null;\n\n\tthis.setKind(kermeta.kunit.ErrorKind.getByName(\"setUpError\"));\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	Error makeSetUp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * overwrite the default method, in order to add :\n\t *   - the type\n\t *   - the message\n\t *   - the stack trace\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_355 = false;\n\tidIfCond_355 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getKind(), kermeta.kunit.ErrorKind.getByName(\"testError\"));\n\n\tif( idIfCond_355 ) {\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this.getError());\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this.getError()).getterName(), \".\");\n\n\tjava.lang.Boolean idIfCond_356 = false;\n\tidIfCond_356 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getKind(), kermeta.kunit.ErrorKind.getByName(\"setUpError\"));\n\n\tif( idIfCond_356 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"setUp()\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"tearDown()\");\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \" raised \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this.getException()).getterName());\n\n\tjava.lang.Boolean idIfCond_357 = false;\n\tidIfCond_357 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getException().getMessage(), null);\n\n\tif( idIfCond_357 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\n    Caused by: \"), this.getException().getMessage());\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"\\n    (no message)\");\n}\n\n\n\tjava.lang.Boolean idIfCond_358 = false;\n\tidIfCond_358 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getException().getStackTrace(), null);\n\n\tif( idIfCond_358 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\n    Stack Trace:\\n\"), this.getException().getStackTrace());\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"\\n    (no stack trace)\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Sets up a new error with failable object and the exception that occurred\n\t * by default it will be a test error. Use makeSetUp or makeTearDown to\n\t * change its type\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.Error result = null;\n\n\tthis.setError(error);\n\n\tthis.setException(e);\n\n\tthis.setKind(kermeta.kunit.ErrorKind.getByName(\"testError\"));\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	Error initFrom(Fallible error, kermeta.exceptions.Exception e);

} // Error
