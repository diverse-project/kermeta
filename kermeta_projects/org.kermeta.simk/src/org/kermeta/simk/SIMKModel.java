/**
 * $Id: SIMKModel.java,v 1.5 2008-08-18 09:20:20 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SIMKModel.java,v 1.5 2008-08-18 09:20:20 cfaucher Exp $
 */
package org.kermeta.simk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SIMK Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.simk.SIMKModel#getSMContexts <em>SM Contexts</em>}</li>
 *   <li>{@link org.kermeta.simk.SIMKModel#getStaticMethods <em>Static Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.simk.SimkPackage#getSIMKModel()
 * @model
 * @generated
 */
public interface SIMKModel extends SMNamedElement {
	/**
	 * Returns the value of the '<em><b>SM Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.simk.SMContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Contexts</em>' containment reference list.
	 * @see org.kermeta.simk.SimkPackage#getSIMKModel_SMContexts()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<SMContext> getSMContexts();

	/**
	 * Returns the value of the '<em><b>Static Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.simk.StaticMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Methods</em>' containment reference list.
	 * @see org.kermeta.simk.SimkPackage#getSIMKModel_StaticMethods()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<StaticMethod> getStaticMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getStaticMethods().size()+1;'"
	 * @generated
	 */
	int getNextId();

} // SIMKModel
