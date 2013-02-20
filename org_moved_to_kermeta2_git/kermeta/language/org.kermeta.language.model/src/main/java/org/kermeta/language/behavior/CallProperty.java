/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;

import org.kermeta.language.structure.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.CallProperty#getStaticProperty <em>Static Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getCallProperty()
 * @model
 * @generated
 */
public interface CallProperty extends CallFeature {
	/**
	 * Returns the value of the '<em><b>Static Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object which will be returned (property case)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Property</em>' reference.
	 * @see #setStaticProperty(Property)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getCallProperty_StaticProperty()
	 * @model
	 * @generated
	 */
	Property getStaticProperty();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.CallProperty#getStaticProperty <em>Static Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Property</em>' reference.
	 * @see #getStaticProperty()
	 * @generated
	 */
	void setStaticProperty(Property value);

} // CallProperty
