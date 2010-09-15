/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation;

import org.kermeta.art2.Instance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2adaptation.InstanceAdaptation#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getInstanceAdaptation()
 * @model
 * @generated
 */
public interface InstanceAdaptation extends AdaptationPrimitive {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Instance)
	 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getInstanceAdaptation_Ref()
	 * @model required="true"
	 * @generated
	 */
	Instance getRef();

	/**
	 * Sets the value of the '{@link org.kermeta.art2adaptation.InstanceAdaptation#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Instance value);

} // InstanceAdaptation
