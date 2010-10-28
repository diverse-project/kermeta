/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation;

import org.kermeta.art2.DeployUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deploy Unit Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2adaptation.DeployUnitAdaptation#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getDeployUnitAdaptation()
 * @model
 * @generated
 */
public interface DeployUnitAdaptation extends AdaptationPrimitive {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(DeployUnit)
	 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getDeployUnitAdaptation_Ref()
	 * @model required="true"
	 * @generated
	 */
	DeployUnit getRef();

	/**
	 * Sets the value of the '{@link org.kermeta.art2adaptation.DeployUnitAdaptation#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(DeployUnit value);

} // DeployUnitAdaptation
