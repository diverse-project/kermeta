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
 * A representation of the model object '<em><b>Node Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.NodeLink#getNetworkType <em>Network Type</em>}</li>
 *   <li>{@link org.kermeta.art2.NodeLink#getEstimatedRate <em>Estimated Rate</em>}</li>
 *   <li>{@link org.kermeta.art2.NodeLink#getNetworkProperties <em>Network Properties</em>}</li>
 *   <li>{@link org.kermeta.art2.NodeLink#getLastCheck <em>Last Check</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getNodeLink()
 * @model
 * @generated
 */
public interface NodeLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Network Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Type</em>' attribute.
	 * @see #setNetworkType(String)
	 * @see org.kermeta.art2.Art2Package#getNodeLink_NetworkType()
	 * @model
	 * @generated
	 */
	String getNetworkType();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.NodeLink#getNetworkType <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Type</em>' attribute.
	 * @see #getNetworkType()
	 * @generated
	 */
	void setNetworkType(String value);

	/**
	 * Returns the value of the '<em><b>Estimated Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Rate</em>' attribute.
	 * @see #setEstimatedRate(Integer)
	 * @see org.kermeta.art2.Art2Package#getNodeLink_EstimatedRate()
	 * @model
	 * @generated
	 */
	Integer getEstimatedRate();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.NodeLink#getEstimatedRate <em>Estimated Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Rate</em>' attribute.
	 * @see #getEstimatedRate()
	 * @generated
	 */
	void setEstimatedRate(Integer value);

	/**
	 * Returns the value of the '<em><b>Network Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.NetworkProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Properties</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getNodeLink_NetworkProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkProperty> getNetworkProperties();

	/**
	 * Returns the value of the '<em><b>Last Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Check</em>' attribute.
	 * @see #setLastCheck(String)
	 * @see org.kermeta.art2.Art2Package#getNodeLink_LastCheck()
	 * @model
	 * @generated
	 */
	String getLastCheck();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.NodeLink#getLastCheck <em>Last Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Check</em>' attribute.
	 * @see #getLastCheck()
	 * @generated
	 */
	void setLastCheck(String value);

} // NodeLink
