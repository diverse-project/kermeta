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
 * A representation of the model object '<em><b>Node Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Art2Aspect.NodePattern#getComponentPatterns <em>Component Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see Art2Aspect.Art2AspectPackage#getNodePattern()
 * @model
 * @generated
 */
public interface NodePattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link Art2Aspect.ComponentPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Patterns</em>' containment reference list.
	 * @see Art2Aspect.Art2AspectPackage#getNodePattern_ComponentPatterns()
	 * @model type="Art2Aspect.ComponentPattern" containment="true"
	 * @generated
	 */
	EList getComponentPatterns();

} // NodePattern
