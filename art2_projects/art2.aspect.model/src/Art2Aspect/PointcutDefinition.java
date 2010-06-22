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
 * </ul>
 * </p>
 *
 * @see Art2Aspect.Art2AspectPackage#getPointcutDefinition()
 * @model
 * @generated
 */
public interface PointcutDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Type Patterns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type Patterns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type Patterns</em>' containment reference.
	 * @see #setComponentTypePatterns(ComponentTypePattern)
	 * @see Art2Aspect.Art2AspectPackage#getPointcutDefinition_ComponentTypePatterns()
	 * @model containment="true"
	 * @generated
	 */
	ComponentTypePattern getComponentTypePatterns();

	/**
	 * Sets the value of the '{@link Art2Aspect.PointcutDefinition#getComponentTypePatterns <em>Component Type Patterns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type Patterns</em>' containment reference.
	 * @see #getComponentTypePatterns()
	 * @generated
	 */
	void setComponentTypePatterns(ComponentTypePattern value);

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

} // PointcutDefinition
