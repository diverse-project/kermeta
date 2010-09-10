/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation;

import org.kermeta.art2.ComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2adaptation.ComponentTypeAdaptation#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getComponentTypeAdaptation()
 * @model
 * @generated
 */
public interface ComponentTypeAdaptation extends AdaptationPrimitive {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(ComponentType)
	 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getComponentTypeAdaptation_Ref()
	 * @model required="true"
	 * @generated
	 */
	ComponentType getRef();

	/**
	 * Sets the value of the '{@link org.kermeta.art2adaptation.ComponentTypeAdaptation#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(ComponentType value);

} // ComponentTypeAdaptation
