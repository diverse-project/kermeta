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
 * A representation of the model object '<em><b>Platform Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.PlatformModel#getNodeNetworks <em>Node Networks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getPlatformModel()
 * @model
 * @generated
 */
public interface PlatformModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Networks</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.NodeNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Networks</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getPlatformModel_NodeNetworks()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeNetwork> getNodeNetworks();

} // PlatformModel
