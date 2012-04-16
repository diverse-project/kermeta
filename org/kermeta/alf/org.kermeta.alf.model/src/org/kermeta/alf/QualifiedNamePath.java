/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.QualifiedNamePath#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.AlfPackage#getQualifiedNamePath()
 * @model
 * @generated
 */
public interface QualifiedNamePath extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.alf.UnqualifiedName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' containment reference list.
	 * @see org.kermeta.alf.AlfPackage#getQualifiedNamePath_Namespace()
	 * @model type="org.kermeta.alf.UnqualifiedName" containment="true"
	 * @generated
	 */
	EList getNamespace();

} // QualifiedNamePath
