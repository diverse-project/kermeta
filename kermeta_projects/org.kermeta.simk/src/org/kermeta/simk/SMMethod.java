/**
 * $Id: SMMethod.java,v 1.1 2008-09-25 08:50:45 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMMethod.java,v 1.1 2008-09-25 08:50:45 cfaucher Exp $
 */
package org.kermeta.simk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.simk.SMMethod#getSMParameters <em>SM Parameters</em>}</li>
 *   <li>{@link org.kermeta.simk.SMMethod#getSMReturn <em>SM Return</em>}</li>
 *   <li>{@link org.kermeta.simk.SMMethod#getSMContext <em>SM Context</em>}</li>
 *   <li>{@link org.kermeta.simk.SMMethod#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.kermeta.simk.SMMethod#getBody <em>Body</em>}</li>
 *   <li>{@link org.kermeta.simk.SMMethod#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.kermeta.simk.SMMethod#getParentEOperation <em>Parent EOperation</em>}</li>
 *   <li>{@link org.kermeta.simk.SMMethod#getParentEReference <em>Parent EReference</em>}</li>
 *   <li>{@link org.kermeta.simk.SMMethod#getParentEAttribute <em>Parent EAttribute</em>}</li>
 *   <li>{@link org.kermeta.simk.SMMethod#getAccess <em>Access</em>}</li>
 *   <li>{@link org.kermeta.simk.SMMethod#isStatic <em>Static</em>}</li>
 *   <li>{@link org.kermeta.simk.SMMethod#isAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.simk.SimkPackage#getSMMethod()
 * @model
 * @generated
 */
public interface SMMethod extends SMNamedElement {
	/**
	 * Returns the value of the '<em><b>SM Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.simk.SMParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Parameters</em>' containment reference list.
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_SMParameters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<SMParameter> getSMParameters();

	/**
	 * Returns the value of the '<em><b>SM Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Return</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Return</em>' containment reference.
	 * @see #setSMReturn(SMReturn)
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_SMReturn()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	SMReturn getSMReturn();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMMethod#getSMReturn <em>SM Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Return</em>' containment reference.
	 * @see #getSMReturn()
	 * @generated
	 */
	void setSMReturn(SMReturn value);

	/**
	 * Returns the value of the '<em><b>SM Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.simk.SMContext#getSMMethods <em>SM Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Context</em>' reference.
	 * @see #setSMContext(SMContext)
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_SMContext()
	 * @see org.kermeta.simk.SMContext#getSMMethods
	 * @model opposite="sMMethods"
	 * @generated
	 */
	SMContext getSMContext();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMMethod#getSMContext <em>SM Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Context</em>' reference.
	 * @see #getSMContext()
	 * @generated
	 */
	void setSMContext(SMContext value);

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' attribute.
	 * @see #setTypeParameters(String)
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_TypeParameters()
	 * @model
	 * @generated
	 */
	String getTypeParameters();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMMethod#getTypeParameters <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Parameters</em>' attribute.
	 * @see #getTypeParameters()
	 * @generated
	 */
	void setTypeParameters(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMMethod#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' attribute.
	 * The literals are from the enumeration {@link org.kermeta.simk.SMUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' attribute.
	 * @see org.kermeta.simk.SMUsage
	 * @see #setUsages(SMUsage)
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_Usages()
	 * @model
	 * @generated
	 */
	SMUsage getUsages();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMMethod#getUsages <em>Usages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usages</em>' attribute.
	 * @see org.kermeta.simk.SMUsage
	 * @see #getUsages()
	 * @generated
	 */
	void setUsages(SMUsage value);

	/**
	 * Returns the value of the '<em><b>Parent EOperation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent EOperation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent EOperation</em>' reference.
	 * @see #setParentEOperation(EOperation)
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_ParentEOperation()
	 * @model
	 * @generated
	 */
	EOperation getParentEOperation();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMMethod#getParentEOperation <em>Parent EOperation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent EOperation</em>' reference.
	 * @see #getParentEOperation()
	 * @generated
	 */
	void setParentEOperation(EOperation value);

	/**
	 * Returns the value of the '<em><b>Parent EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent EReference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent EReference</em>' reference.
	 * @see #setParentEReference(EReference)
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_ParentEReference()
	 * @model
	 * @generated
	 */
	EReference getParentEReference();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMMethod#getParentEReference <em>Parent EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent EReference</em>' reference.
	 * @see #getParentEReference()
	 * @generated
	 */
	void setParentEReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Parent EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent EAttribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent EAttribute</em>' reference.
	 * @see #setParentEAttribute(EAttribute)
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_ParentEAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getParentEAttribute();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMMethod#getParentEAttribute <em>Parent EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent EAttribute</em>' reference.
	 * @see #getParentEAttribute()
	 * @generated
	 */
	void setParentEAttribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link org.kermeta.simk.SMAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see org.kermeta.simk.SMAccess
	 * @see #setAccess(SMAccess)
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_Access()
	 * @model default="public"
	 * @generated
	 */
	SMAccess getAccess();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMMethod#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see org.kermeta.simk.SMAccess
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(SMAccess value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_Static()
	 * @model default="true"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMMethod#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.kermeta.simk.SimkPackage#getSMMethod_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMMethod#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getParentEOperation();'"
	 * @generated
	 */
	EOperation getParentEOperationFromModel();

} // SMMethod
