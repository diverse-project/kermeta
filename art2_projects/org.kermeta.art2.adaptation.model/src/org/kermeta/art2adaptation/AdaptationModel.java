/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2adaptation.AdaptationModel#getAdaptations <em>Adaptations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getAdaptationModel()
 * @model
 * @generated
 */
public interface AdaptationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Adaptations</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2adaptation.AdaptationPrimitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptations</em>' containment reference list.
	 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getAdaptationModel_Adaptations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdaptationPrimitive> getAdaptations();

} // AdaptationModel
