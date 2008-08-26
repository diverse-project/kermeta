/**
 * $Id: SMContext.java,v 1.4 2008-08-26 09:14:28 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMContext.java,v 1.4 2008-08-26 09:14:28 cfaucher Exp $
 */
package org.kermeta.simk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.simk.SMContext#getStaticMethods <em>Static Methods</em>}</li>
 *   <li>{@link org.kermeta.simk.SMContext#getSMClass <em>SM Class</em>}</li>
 *   <li>{@link org.kermeta.simk.SMContext#getQualifiedNameFinalPackage <em>Qualified Name Final Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.simk.SimkPackage#getSMContext()
 * @model
 * @generated
 */
public interface SMContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Static Methods</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.simk.StaticMethod}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.simk.StaticMethod#getSMContext <em>SM Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Methods</em>' reference list.
	 * @see org.kermeta.simk.SimkPackage#getSMContext_StaticMethods()
	 * @see org.kermeta.simk.StaticMethod#getSMContext
	 * @model opposite="sMContext"
	 * @generated
	 */
	EList<StaticMethod> getStaticMethods();

	/**
	 * Returns the value of the '<em><b>SM Class</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.simk.SMClass#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Class</em>' containment reference.
	 * @see #setSMClass(SMClass)
	 * @see org.kermeta.simk.SimkPackage#getSMContext_SMClass()
	 * @see org.kermeta.simk.SMClass#getContext
	 * @model opposite="context" containment="true" resolveProxies="true"
	 * @generated
	 */
	SMClass getSMClass();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMContext#getSMClass <em>SM Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Class</em>' containment reference.
	 * @see #getSMClass()
	 * @generated
	 */
	void setSMClass(SMClass value);

	/**
	 * Returns the value of the '<em><b>Qualified Name Final Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name Final Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name Final Package</em>' attribute.
	 * @see #setQualifiedNameFinalPackage(String)
	 * @see org.kermeta.simk.SimkPackage#getSMContext_QualifiedNameFinalPackage()
	 * @model
	 * @generated
	 */
	String getQualifiedNameFinalPackage();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMContext#getQualifiedNameFinalPackage <em>Qualified Name Final Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name Final Package</em>' attribute.
	 * @see #getQualifiedNameFinalPackage()
	 * @generated
	 */
	void setQualifiedNameFinalPackage(String value);

} // SMContext
