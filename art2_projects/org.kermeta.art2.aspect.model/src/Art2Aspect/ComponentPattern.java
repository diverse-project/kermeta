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
 * A representation of the model object '<em><b>Component Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Art2Aspect.ComponentPattern#getProvidedPortPatterns <em>Provided Port Patterns</em>}</li>
 *   <li>{@link Art2Aspect.ComponentPattern#getRequiredPortPatterns <em>Required Port Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see Art2Aspect.Art2AspectPackage#getComponentPattern()
 * @model
 * @generated
 */
public interface ComponentPattern extends PatternNamedElement {
	/**
	 * Returns the value of the '<em><b>Provided Port Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link Art2Aspect.PortPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Port Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Port Patterns</em>' containment reference list.
	 * @see Art2Aspect.Art2AspectPackage#getComponentPattern_ProvidedPortPatterns()
	 * @model type="Art2Aspect.PortPattern" containment="true"
	 * @generated
	 */
	EList getProvidedPortPatterns();

	/**
	 * Returns the value of the '<em><b>Required Port Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link Art2Aspect.PortPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Port Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Port Patterns</em>' containment reference list.
	 * @see Art2Aspect.Art2AspectPackage#getComponentPattern_RequiredPortPatterns()
	 * @model type="Art2Aspect.PortPattern" containment="true"
	 * @generated
	 */
	EList getRequiredPortPatterns();

} // ComponentPattern
