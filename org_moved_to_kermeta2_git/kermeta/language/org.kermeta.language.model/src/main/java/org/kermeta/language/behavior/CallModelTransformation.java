/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;

import org.kermeta.language.structure.ModelTransformation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Model Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.CallModelTransformation#getStaticTransformation <em>Static Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getCallModelTransformation()
 * @model
 * @generated
 */
public interface CallModelTransformation extends CallFeature {
	/**
	 * Returns the value of the '<em><b>Static Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Transformation</em>' reference.
	 * @see #setStaticTransformation(ModelTransformation)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getCallModelTransformation_StaticTransformation()
	 * @model
	 * @generated
	 */
	ModelTransformation getStaticTransformation();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.CallModelTransformation#getStaticTransformation <em>Static Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Transformation</em>' reference.
	 * @see #getStaticTransformation()
	 * @generated
	 */
	void setStaticTransformation(ModelTransformation value);

} // CallModelTransformation
