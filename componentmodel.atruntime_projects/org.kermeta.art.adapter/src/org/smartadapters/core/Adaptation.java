/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smartadapters.core.Adaptation#getAdapter <em>Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smartadapters.core.CorePackage#getAdaptation()
 * @model abstract="true"
 * @generated
 */
public interface Adaptation extends EObject {
	/**
	 * Returns the value of the '<em><b>Adapter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.smartadapters.core.Adapter#getAdapt <em>Adapt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter</em>' container reference.
	 * @see #setAdapter(Adapter)
	 * @see org.smartadapters.core.CorePackage#getAdaptation_Adapter()
	 * @see org.smartadapters.core.Adapter#getAdapt
	 * @model opposite="adapt" required="true" transient="false"
	 * @generated
	 */
	Adapter getAdapter();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.Adaptation#getAdapter <em>Adapter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter</em>' container reference.
	 * @see #getAdapter()
	 * @generated
	 */
	void setAdapter(Adapter value);

} // Adaptation
