/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.EnumerationBinding#getOwnedEnumLiteralBindings <em>Owned Enum Literal Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getEnumerationBinding()
 * @model abstract="true"
 * @generated
 */
public interface EnumerationBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Enum Literal Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.EnumLiteralbinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Enum Literal Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Enum Literal Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getEnumerationBinding_OwnedEnumLiteralBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumLiteralbinding> getOwnedEnumLiteralBindings();

} // EnumerationBinding
