/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliced Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org2.kermeta.kompren.slicing.SlicedElement#isIsOption <em>Is Option</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicing.SlicedElement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org2.kermeta.kompren.slicing.SlicedElement#getExpOnRemove <em>Exp On Remove</em>}</li>
 * </ul>
 * </p>
 *
 * @see org2.kermeta.kompren.slicing.SlicingPackage#getSlicedElement()
 * @model abstract="true"
 * @generated
 */
public interface SlicedElement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "INRIA/IRISA\nTriskell Team";

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
	 * @see org2.kermeta.kompren.slicing.SlicingPackage#getSlicedElement_IsOption()
	 * @model
	 * @generated
	 */
	boolean isIsOption();

	/**
	 * Sets the value of the '{@link org2.kermeta.kompren.slicing.SlicedElement#isIsOption <em>Is Option</em>}' attribute.
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
	 * @see org2.kermeta.kompren.slicing.SlicingPackage#getSlicedElement_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org2.kermeta.kompren.slicing.SlicedElement#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Exp On Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp On Remove</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp On Remove</em>' attribute.
	 * @see #setExpOnRemove(String)
	 * @see org2.kermeta.kompren.slicing.SlicingPackage#getSlicedElement_ExpOnRemove()
	 * @model
	 * @generated
	 */
	String getExpOnRemove();

	/**
	 * Sets the value of the '{@link org2.kermeta.kompren.slicing.SlicedElement#getExpOnRemove <em>Exp On Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp On Remove</em>' attribute.
	 * @see #getExpOnRemove()
	 * @generated
	 */
	void setExpOnRemove(String value);

} // SlicedElement
