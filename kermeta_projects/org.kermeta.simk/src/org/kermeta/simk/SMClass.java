/**
 * $Id: SMClass.java,v 1.1 2007-11-30 13:36:45 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMClass.java,v 1.1 2007-11-30 13:36:45 cfaucher Exp $
 */
package org.kermeta.simk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.simk.SMClass#getSMPackage <em>SM Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.simk.SimkPackage#getSMClass()
 * @model
 * @generated
 */
public interface SMClass extends SMNamedElement {
	/**
	 * Returns the value of the '<em><b>SM Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.simk.SMPackage#getSMClass <em>SM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Package</em>' reference.
	 * @see #setSMPackage(SMPackage)
	 * @see org.kermeta.simk.SimkPackage#getSMClass_SMPackage()
	 * @see org.kermeta.simk.SMPackage#getSMClass
	 * @model opposite="sMClass"
	 * @generated
	 */
	SMPackage getSMPackage();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMClass#getSMPackage <em>SM Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Package</em>' reference.
	 * @see #getSMPackage()
	 * @generated
	 */
	void setSMPackage(SMPackage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ( getSMPackage() != null ) {\r\n\treturn getSMPackage().getQualifiedName() + \".\" + getName();\r\n}\r\nreturn getName();'"
	 * @generated
	 */
	String getQualifiedName();

} // SMClass
