/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect;

import art2.ComponentType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Art2Aspect.ComponentTypePattern#getPortTypePatterns <em>Port Type Patterns</em>}</li>
 *   <li>{@link Art2Aspect.ComponentTypePattern#getPortPatterns <em>Port Patterns</em>}</li>
 *   <li>{@link Art2Aspect.ComponentTypePattern#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Art2Aspect.Art2AspectPackage#getComponentTypePattern()
 * @model
 * @generated
 */
public interface ComponentTypePattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Type Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link Art2Aspect.PortTypePattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type Patterns</em>' containment reference list.
	 * @see Art2Aspect.Art2AspectPackage#getComponentTypePattern_PortTypePatterns()
	 * @model type="Art2Aspect.PortTypePattern" containment="true"
	 * @generated
	 */
	EList getPortTypePatterns();

	/**
	 * Returns the value of the '<em><b>Port Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link Art2Aspect.PortTypeRefPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Patterns</em>' containment reference list.
	 * @see Art2Aspect.Art2AspectPackage#getComponentTypePattern_PortPatterns()
	 * @model type="Art2Aspect.PortTypeRefPattern" containment="true"
	 * @generated
	 */
	EList getPortPatterns();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see Art2Aspect.Art2AspectPackage#getComponentTypePattern_Type()
	 * @model
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link Art2Aspect.ComponentTypePattern#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

} // ComponentTypePattern
