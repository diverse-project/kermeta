/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smartadapters.core.Adapter#getAspect <em>Aspect</em>}</li>
 *   <li>{@link org.smartadapters.core.Adapter#getAdapt <em>Adapt</em>}</li>
 *   <li>{@link org.smartadapters.core.Adapter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smartadapters.core.CorePackage#getAdapter()
 * @model
 * @generated
 */
public interface Adapter extends EObject {
	/**
	 * Returns the value of the '<em><b>Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect</em>' containment reference.
	 * @see #setAspect(Aspect)
	 * @see org.smartadapters.core.CorePackage#getAdapter_Aspect()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Aspect getAspect();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.Adapter#getAspect <em>Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect</em>' containment reference.
	 * @see #getAspect()
	 * @generated
	 */
	void setAspect(Aspect value);

	/**
	 * Returns the value of the '<em><b>Adapt</b></em>' containment reference list.
	 * The list contents are of type {@link org.smartadapters.core.Adaptation}.
	 * It is bidirectional and its opposite is '{@link org.smartadapters.core.Adaptation#getAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapt</em>' containment reference list.
	 * @see org.smartadapters.core.CorePackage#getAdapter_Adapt()
	 * @see org.smartadapters.core.Adaptation#getAdapter
	 * @model opposite="adapter" containment="true"
	 * @generated
	 */
	EList<Adaptation> getAdapt();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smartadapters.core.CorePackage#getAdapter_Name()
	 * @model dataType="pattern.art.String"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.Adapter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Adapter
