/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.Port#getPortTypeRef <em>Port Type Ref</em>}</li>
 *   <li>{@link org.kermeta.art2.Port#getMetrics <em>Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type Ref</em>' reference.
	 * @see #setPortTypeRef(PortTypeRef)
	 * @see org.kermeta.art2.Art2Package#getPort_PortTypeRef()
	 * @model required="true"
	 * @generated
	 */
	PortTypeRef getPortTypeRef();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.Port#getPortTypeRef <em>Port Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type Ref</em>' reference.
	 * @see #getPortTypeRef()
	 * @generated
	 */
	void setPortTypeRef(PortTypeRef value);

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.art2.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' reference list.
	 * @see org.kermeta.art2.Art2Package#getPort_Metrics()
	 * @model
	 * @generated
	 */
	EList<Metric> getMetrics();

} // Port
