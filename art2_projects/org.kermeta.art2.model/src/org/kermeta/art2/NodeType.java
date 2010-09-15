/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.NodeType#getBootstrap <em>Bootstrap</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getNodeType()
 * @model
 * @generated
 */
public interface NodeType extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Bootstrap</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.art2.DeployUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bootstrap</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bootstrap</em>' reference list.
	 * @see org.kermeta.art2.Art2Package#getNodeType_Bootstrap()
	 * @model
	 * @generated
	 */
	EList<DeployUnit> getBootstrap();

} // NodeType
