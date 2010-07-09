/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointcut Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Art2Aspect.PointcutDefinition#getComponentTypePatterns <em>Component Type Patterns</em>}</li>
 *   <li>{@link Art2Aspect.PointcutDefinition#getNodePatterns <em>Node Patterns</em>}</li>
 *   <li>{@link Art2Aspect.PointcutDefinition#getPortTypePatterns <em>Port Type Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see Art2Aspect.Art2AspectPackage#getPointcutDefinition()
 * @model
 * @generated
 */
public interface PointcutDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Type Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link Art2Aspect.ComponentTypePattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type Patterns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type Patterns</em>' containment reference list.
	 * @see Art2Aspect.Art2AspectPackage#getPointcutDefinition_ComponentTypePatterns()
	 * @model type="Art2Aspect.ComponentTypePattern" containment="true"
	 * @generated
	 */
	EList getComponentTypePatterns();

	/**
	 * Returns the value of the '<em><b>Node Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link Art2Aspect.NodePattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Patterns</em>' containment reference list.
	 * @see Art2Aspect.Art2AspectPackage#getPointcutDefinition_NodePatterns()
	 * @model type="Art2Aspect.NodePattern" containment="true"
	 * @generated
	 */
	EList getNodePatterns();

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
	 * @see Art2Aspect.Art2AspectPackage#getPointcutDefinition_PortTypePatterns()
	 * @model type="Art2Aspect.PortTypePattern" containment="true"
	 * @generated
	 */
	EList getPortTypePatterns();

} // PointcutDefinition
