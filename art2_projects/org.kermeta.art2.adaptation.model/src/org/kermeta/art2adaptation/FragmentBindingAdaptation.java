/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation;

import org.kermeta.art2.Channel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment Binding Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2adaptation.FragmentBindingAdaptation#getRef <em>Ref</em>}</li>
 *   <li>{@link org.kermeta.art2adaptation.FragmentBindingAdaptation#getTargetNodeName <em>Target Node Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getFragmentBindingAdaptation()
 * @model
 * @generated
 */
public interface FragmentBindingAdaptation extends AdaptationPrimitive {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Channel)
	 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getFragmentBindingAdaptation_Ref()
	 * @model required="true"
	 * @generated
	 */
	Channel getRef();

	/**
	 * Sets the value of the '{@link org.kermeta.art2adaptation.FragmentBindingAdaptation#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Channel value);

	/**
	 * Returns the value of the '<em><b>Target Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Node Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node Name</em>' attribute.
	 * @see #setTargetNodeName(String)
	 * @see org.kermeta.art2adaptation.Art2adaptationPackage#getFragmentBindingAdaptation_TargetNodeName()
	 * @model
	 * @generated
	 */
	String getTargetNodeName();

	/**
	 * Sets the value of the '{@link org.kermeta.art2adaptation.FragmentBindingAdaptation#getTargetNodeName <em>Target Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node Name</em>' attribute.
	 * @see #getTargetNodeName()
	 * @generated
	 */
	void setTargetNodeName(String value);

} // FragmentBindingAdaptation
