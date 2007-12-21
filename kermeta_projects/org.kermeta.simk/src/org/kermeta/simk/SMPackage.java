/**
 * $Id: SMPackage.java,v 1.3 2007-12-21 14:17:02 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMPackage.java,v 1.3 2007-12-21 14:17:02 cfaucher Exp $
 */
package org.kermeta.simk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.simk.SMPackage#getSMClass <em>SM Class</em>}</li>
 *   <li>{@link org.kermeta.simk.SMPackage#getSubSMPackage <em>Sub SM Package</em>}</li>
 *   <li>{@link org.kermeta.simk.SMPackage#getParentSMPackage <em>Parent SM Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.simk.SimkPackage#getSMPackage()
 * @model
 * @generated
 */
public interface SMPackage extends SMNamedElement {
	/**
	 * Returns the value of the '<em><b>SM Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.simk.SMClass#getSMPackage <em>SM Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SM Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SM Class</em>' reference.
	 * @see #setSMClass(SMClass)
	 * @see org.kermeta.simk.SimkPackage#getSMPackage_SMClass()
	 * @see org.kermeta.simk.SMClass#getSMPackage
	 * @model opposite="sMPackage"
	 * @generated
	 */
	SMClass getSMClass();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMPackage#getSMClass <em>SM Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SM Class</em>' reference.
	 * @see #getSMClass()
	 * @generated
	 */
	void setSMClass(SMClass value);

	/**
	 * Returns the value of the '<em><b>Sub SM Package</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.simk.SMPackage#getParentSMPackage <em>Parent SM Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub SM Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub SM Package</em>' containment reference.
	 * @see #setSubSMPackage(SMPackage)
	 * @see org.kermeta.simk.SimkPackage#getSMPackage_SubSMPackage()
	 * @see org.kermeta.simk.SMPackage#getParentSMPackage
	 * @model opposite="parentSMPackage" containment="true" resolveProxies="true"
	 * @generated
	 */
	SMPackage getSubSMPackage();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMPackage#getSubSMPackage <em>Sub SM Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub SM Package</em>' containment reference.
	 * @see #getSubSMPackage()
	 * @generated
	 */
	void setSubSMPackage(SMPackage value);

	/**
	 * Returns the value of the '<em><b>Parent SM Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.simk.SMPackage#getSubSMPackage <em>Sub SM Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent SM Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent SM Package</em>' container reference.
	 * @see #setParentSMPackage(SMPackage)
	 * @see org.kermeta.simk.SimkPackage#getSMPackage_ParentSMPackage()
	 * @see org.kermeta.simk.SMPackage#getSubSMPackage
	 * @model opposite="subSMPackage" transient="false"
	 * @generated
	 */
	SMPackage getParentSMPackage();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMPackage#getParentSMPackage <em>Parent SM Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent SM Package</em>' container reference.
	 * @see #getParentSMPackage()
	 * @generated
	 */
	void setParentSMPackage(SMPackage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (element == null) return \"\";\r\nif (element.getParentSMPackage() != null) {\r\n\treturn getQualifiedNameRec( element.getParentSMPackage() ) + \".\" + element.getName();\r\n} else {\r\n\treturn element.getName();\r\n}'"
	 * @generated
	 */
	String getQualifiedNameRec(SMPackage element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getQualifiedNameRec(this);'"
	 * @generated
	 */
	String getQualifiedName();

} // SMPackage
