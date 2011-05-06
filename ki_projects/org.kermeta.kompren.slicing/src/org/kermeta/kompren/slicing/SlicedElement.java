/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kompren.slicing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliced Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kompren.slicing.SlicedElement#isIsOption <em>Is Option</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.SlicedElement#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicedElement()
 * @model abstract="true"
 * @generated
 */
public interface SlicedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Option</em>' attribute.
	 * @see #setIsOption(boolean)
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicedElement_IsOption()
	 * @model
	 * @generated
	 */
	boolean isIsOption();

	/**
	 * Sets the value of the '{@link org.kermeta.kompren.slicing.SlicedElement#isIsOption <em>Is Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Option</em>' attribute.
	 * @see #isIsOption()
	 * @generated
	 */
	void setIsOption(boolean value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicedElement_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.kermeta.kompren.slicing.SlicedElement#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // SlicedElement
