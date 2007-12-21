/**
 * $Id: SMContext.java,v 1.3 2007-12-21 14:17:02 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMContext.java,v 1.3 2007-12-21 14:17:02 cfaucher Exp $
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
 *   <li>{@link org.kermeta.simk.SMContext#getSMPackage <em>SM Package</em>}</li>
 *   <li>{@link org.kermeta.simk.SMContext#getStaticMethods <em>Static Methods</em>}</li>
 *   <li>{@link org.kermeta.simk.SMContext#getSMClass <em>SM Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.simk.SimkPackage#getSMContext()
 * @model
 * @generated
 */
public interface SMContext extends EObject {
	/**
	 * Returns the value of the '<em><b>SM Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Package</em>' containment reference.
	 * @see #setSMPackage(SMPackage)
	 * @see org.kermeta.simk.SimkPackage#getSMContext_SMPackage()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	SMPackage getSMPackage();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMContext#getSMPackage <em>SM Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Package</em>' containment reference.
	 * @see #getSMPackage()
	 * @generated
	 */
	void setSMPackage(SMPackage value);

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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Class</em>' containment reference.
	 * @see #setSMClass(SMClass)
	 * @see org.kermeta.simk.SimkPackage#getSMContext_SMClass()
	 * @model containment="true" resolveProxies="true"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ( this.getSMPackage() != null ) {\r\n\tSMPackage smp = this.getSMPackage();\r\n\twhile( smp.getSubSMPackage() != null ) {\r\n\t\tsmp = smp.getSubSMPackage();\r\n\t}\r\n\treturn smp;\r\n} else {\r\n\treturn null;\r\n}'"
	 * @generated
	 */
	SMPackage getDeepestPackage();

} // SMContext
