/**
 * $Id: StaticMethod.java,v 1.5 2008-08-18 13:06:15 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: StaticMethod.java,v 1.5 2008-08-18 13:06:15 cfaucher Exp $
 */
package org.kermeta.simk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.simk.StaticMethod#getSMParameters <em>SM Parameters</em>}</li>
 *   <li>{@link org.kermeta.simk.StaticMethod#getSMReturn <em>SM Return</em>}</li>
 *   <li>{@link org.kermeta.simk.StaticMethod#getSMContext <em>SM Context</em>}</li>
 *   <li>{@link org.kermeta.simk.StaticMethod#getId <em>Id</em>}</li>
 *   <li>{@link org.kermeta.simk.StaticMethod#getBody <em>Body</em>}</li>
 *   <li>{@link org.kermeta.simk.StaticMethod#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.kermeta.simk.StaticMethod#getParentMethod <em>Parent Method</em>}</li>
 *   <li>{@link org.kermeta.simk.StaticMethod#getParentReference <em>Parent Reference</em>}</li>
 *   <li>{@link org.kermeta.simk.StaticMethod#getParentAttribute <em>Parent Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.simk.SimkPackage#getStaticMethod()
 * @model
 * @generated
 */
public interface StaticMethod extends SMNamedElement {
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
	 * @see org.kermeta.simk.SimkPackage#getStaticMethod_SMParameters()
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
	 * @see org.kermeta.simk.SimkPackage#getStaticMethod_SMReturn()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	SMReturn getSMReturn();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.StaticMethod#getSMReturn <em>SM Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Return</em>' containment reference.
	 * @see #getSMReturn()
	 * @generated
	 */
	void setSMReturn(SMReturn value);

	/**
	 * Returns the value of the '<em><b>SM Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.simk.SMContext#getStaticMethods <em>Static Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Context</em>' reference.
	 * @see #setSMContext(SMContext)
	 * @see org.kermeta.simk.SimkPackage#getStaticMethod_SMContext()
	 * @see org.kermeta.simk.SMContext#getStaticMethods
	 * @model opposite="staticMethods"
	 * @generated
	 */
	SMContext getSMContext();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.StaticMethod#getSMContext <em>SM Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Context</em>' reference.
	 * @see #getSMContext()
	 * @generated
	 */
	void setSMContext(SMContext value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.kermeta.simk.SimkPackage#getStaticMethod_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.StaticMethod#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.kermeta.simk.SimkPackage#getStaticMethod_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.StaticMethod#getBody <em>Body</em>}' attribute.
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
	 * If the meaning of the '<em>Usages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' attribute.
	 * @see org.kermeta.simk.SMUsage
	 * @see #setUsages(SMUsage)
	 * @see org.kermeta.simk.SimkPackage#getStaticMethod_Usages()
	 * @model
	 * @generated
	 */
	SMUsage getUsages();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.StaticMethod#getUsages <em>Usages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usages</em>' attribute.
	 * @see org.kermeta.simk.SMUsage
	 * @see #getUsages()
	 * @generated
	 */
	void setUsages(SMUsage value);

	/**
	 * Returns the value of the '<em><b>Parent Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Method</em>' reference.
	 * @see #setParentMethod(EOperation)
	 * @see org.kermeta.simk.SimkPackage#getStaticMethod_ParentMethod()
	 * @model
	 * @generated
	 */
	EOperation getParentMethod();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.StaticMethod#getParentMethod <em>Parent Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Method</em>' reference.
	 * @see #getParentMethod()
	 * @generated
	 */
	void setParentMethod(EOperation value);

	/**
	 * Returns the value of the '<em><b>Parent Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Reference</em>' reference.
	 * @see #setParentReference(EReference)
	 * @see org.kermeta.simk.SimkPackage#getStaticMethod_ParentReference()
	 * @model
	 * @generated
	 */
	EReference getParentReference();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.StaticMethod#getParentReference <em>Parent Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Reference</em>' reference.
	 * @see #getParentReference()
	 * @generated
	 */
	void setParentReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Parent Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Attribute</em>' reference.
	 * @see #setParentAttribute(EAttribute)
	 * @see org.kermeta.simk.SimkPackage#getStaticMethod_ParentAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getParentAttribute();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.StaticMethod#getParentAttribute <em>Parent Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Attribute</em>' reference.
	 * @see #getParentAttribute()
	 * @generated
	 */
	void setParentAttribute(EAttribute value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getParentMethod();'"
	 * @generated
	 */
	EOperation getParentMethodFromModel();

} // StaticMethod
