/**
 * $Id: SMClass.java,v 1.7 2008-09-25 08:50:45 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMClass.java,v 1.7 2008-09-25 08:50:45 cfaucher Exp $
 */
package org.kermeta.simk;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.simk.SMClass#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.kermeta.simk.SMClass#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.simk.SimkPackage#getSMClass()
 * @model
 * @generated
 */
public interface SMClass extends SMNamedElement {
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
	 * @see org.kermeta.simk.SimkPackage#getSMClass_Usages()
	 * @model
	 * @generated
	 */
	SMUsage getUsages();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMClass#getUsages <em>Usages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usages</em>' attribute.
	 * @see org.kermeta.simk.SMUsage
	 * @see #getUsages()
	 * @generated
	 */
	void setUsages(SMUsage value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.simk.SMContext#getSMClass <em>SM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(SMContext)
	 * @see org.kermeta.simk.SimkPackage#getSMClass_Context()
	 * @see org.kermeta.simk.SMContext#getSMClass
	 * @model opposite="sMClass" required="true" transient="false"
	 * @generated
	 */
	SMContext getContext();

	/**
	 * Sets the value of the '{@link org.kermeta.simk.SMClass#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(SMContext value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String qn_finalPackage = getContext().getFinalPackageQName();\r\nif ( ! qn_finalPackage.equals(\"\") ) {\r\n\treturn qn_finalPackage + \".\" + getName();\r\n}\r\nreturn getName();'"
	 * @generated
	 */
	String getQualifiedName();

} // SMClass
