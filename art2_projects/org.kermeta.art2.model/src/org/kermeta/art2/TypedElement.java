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
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.TypedElement#getGenericTypes <em>Generic Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Generic Types</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.art2.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Types</em>' reference list.
	 * @see org.kermeta.art2.Art2Package#getTypedElement_GenericTypes()
	 * @model
	 * @generated
	 */
	EList<TypedElement> getGenericTypes();

} // TypedElement
