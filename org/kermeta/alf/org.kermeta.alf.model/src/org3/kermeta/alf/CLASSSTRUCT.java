/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLASSSTRUCT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org3.kermeta.alf.CLASSSTRUCT#getName <em>Name</em>}</li>
 *   <li>{@link org3.kermeta.alf.CLASSSTRUCT#getClsop <em>Clsop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org3.kermeta.alf.AlfPackage#getCLASSSTRUCT()
 * @model
 * @generated
 */
public interface CLASSSTRUCT extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org3.kermeta.alf.AlfPackage#getCLASSSTRUCT_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org3.kermeta.alf.CLASSSTRUCT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Clsop</b></em>' containment reference list.
	 * The list contents are of type {@link org3.kermeta.alf.CLASSOP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clsop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clsop</em>' containment reference list.
	 * @see org3.kermeta.alf.AlfPackage#getCLASSSTRUCT_Clsop()
	 * @model type="org3.kermeta.alf.CLASSOP" containment="true"
	 * @generated
	 */
	EList getClsop();

} // CLASSSTRUCT
