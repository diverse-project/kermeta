/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.Instance#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getInstance()
 * @model
 * @generated
 */
public interface Instance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see #setTypeDefinition(TypeDefinition)
	 * @see org.kermeta.art2.Art2Package#getInstance_TypeDefinition()
	 * @model required="true"
	 * @generated
	 */
	TypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.Instance#getTypeDefinition <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(TypeDefinition value);

} // Instance
