/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rescue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.Rescue#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.behavior.Rescue#getExceptionName <em>Exception Name</em>}</li>
 *   <li>{@link kermeta.language.behavior.Rescue#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getRescue()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='Refers to rescue exception block'"
 * @generated
 */
public interface Rescue extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see kermeta.language.behavior.BehaviorPackage#getRescue_Body()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Body of the rescue block, specified as a KerMeta expression'"
	 * @generated
	 */
	EList<Expression> getBody();

	/**
	 * Returns the value of the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Name</em>' attribute.
	 * @see #setExceptionName(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getRescue_ExceptionName()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Name of the catched exception'"
	 * @generated
	 */
	String getExceptionName();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Rescue#getExceptionName <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Name</em>' attribute.
	 * @see #getExceptionName()
	 * @generated
	 */
	void setExceptionName(String value);

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Type</em>' containment reference.
	 * @see #setExceptionType(TypeReference)
	 * @see kermeta.language.behavior.BehaviorPackage#getRescue_ExceptionType()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Type of the cathed exception'"
	 * @generated
	 */
	TypeReference getExceptionType();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Rescue#getExceptionType <em>Exception Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type</em>' containment reference.
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(TypeReference value);

} // Rescue
