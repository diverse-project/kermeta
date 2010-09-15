/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation;

import org.kermeta.art2.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2adaptation.TypeAdaptation#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getTypeAdaptation()
 * @model
 * @generated
 */
public interface TypeAdaptation extends AdaptationPrimitive {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(TypeDefinition)
	 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getTypeAdaptation_Ref()
	 * @model required="true"
	 * @generated
	 */
	TypeDefinition getRef();

	/**
	 * Sets the value of the '{@link org.kermeta.art2adaptation.TypeAdaptation#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(TypeDefinition value);

} // TypeAdaptation
