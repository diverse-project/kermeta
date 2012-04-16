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
 * A representation of the model object '<em><b>Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.Tuple#getTupleElements <em>Tuple Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.AlfPackage#getTuple()
 * @model
 * @generated
 */
public interface Tuple extends EObject {
	/**
	 * Returns the value of the '<em><b>Tuple Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.alf.TupleElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Elements</em>' containment reference list.
	 * @see org.kermeta.alf.AlfPackage#getTuple_TupleElements()
	 * @model type="org.kermeta.alf.TupleElement" containment="true"
	 * @generated
	 */
	EList getTupleElements();

} // Tuple